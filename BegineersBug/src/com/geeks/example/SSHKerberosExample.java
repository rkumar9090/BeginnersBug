package com.geeks.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

public class SSHKerberosExample {

	public static void main() {

		// Remote host that we are going to connect
		String host = "10.118.224.56";
		// Remote host user
		String user = "aws-test-user";
		// Command that we are going to execute on remote host
		String command = "mkdir /home/kerberosexample";

		JSch jsch = new JSch();
		// Kerberos config file
		System.setProperty("java.security.krb5.conf", "/etc/krb5.config");
		// Jass file location
		System.setProperty("java.security.auth.login.config", "/home/jaas.config");
		System.setProperty("javax.security.auth.useSubjectCredsOnly", "false");
		System.setProperty("sun.security.krb5.debug", "true");

		try {

			Session session = jsch.getSession(user, host, 22);
			Properties config = new java.util.Properties();
			config.put("StrictHostKeyChecking", "no");
			config.put("PreferredAuthentications", "gssapi-with-mic");

			session.setConfig(config);
			session.connect(20000);

			Channel channel = session.openChannel("exec");

			// Creating BufferReader to read input from host
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(channel.getInputStream()));

			((ChannelExec) channel).setCommand(command);
			channel.connect();

			StringBuilder stringBuilder = new StringBuilder();
			for (String string = bufferReader.readLine(); string != null; string = bufferReader.readLine()) {
				stringBuilder.append(string);
			}

			System.out.println(stringBuilder.toString());

			channel.disconnect();
			session.disconnect();
			System.out.println("created folder using kerberos authentication");

		} catch (JSchException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
