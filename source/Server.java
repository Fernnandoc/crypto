package source;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	
	private ServerSocket serverSocket = null;
	private Socket socket = null;
	private String ip;
	private int porta;
	
	public Server(String ip, int porta) {
		this.ip = ip;
		this.porta = porta;
	}
	
	
	public void startServer() throws IOException {
		
	this.serverSocket = new ServerSocket(this.porta);
	this.socket = this.serverSocket.accept();
	
	}
	
	public String getClienteIp() {
		return this.socket.getInetAddress().toString();
	
	}
	
	public void stopServer() throws IOException {
		this.serverSocket.close();
		
	}
}
