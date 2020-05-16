package com.geeks.example;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HttpServerExample {

	public static void main(String[] args) throws Exception {
		try {
			HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
			server.createContext("/health", new Handler());
			server.setExecutor(null);
			server.start();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static class Handler implements HttpHandler {
		@Override
		public void handle(HttpExchange t) throws IOException {
			String response = "Up & Running";
			t.sendResponseHeaders(200, response.length());
			OutputStream os = t.getResponseBody();
			os.write(response.getBytes());
			os.close();
		}
	}
}
