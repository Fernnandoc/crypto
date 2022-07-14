package source;

import source.Server;
import java.io.BufferedWriter;
import java.io.File;
import source.KeyGenerator;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class main {
	
    public static void main(String[] args) throws IOException {
    
		int contador = 0;
		KeyGenerator resposta = new KeyGenerator();
		resposta.setRegistro("ID,Key,Data\n");
    	
	    for(contador = 0 ; contador < 50; contador = contador + 1) {
	    	int id = contador;
	    	String s = String.valueOf(id);
	        s = s + ",";
	        resposta.setRegistro(s);
	        int rng = resposta.getRng();
	        String r = String.valueOf(rng);
	        r = r + ",";
	        resposta.setRegistro(r);
	        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss\n");
	        String date = dtf.format(LocalDateTime.now());
	        date = date.replace("/","");
	        date = date.replace(" ","");
	        date = date.replace(":", "");
	        resposta.setRegistro(date);
	    }
	    
	    Server servidor = new Server("192.168.0.32", 7777);
	    servidor.startServer();
	    System.out.println("Client conected! " + servidor.getClienteIp());
	    servidor.stopServer();
	    
    }
    
    
    
    
}
