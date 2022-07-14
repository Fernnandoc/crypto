package source;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


public class KeyGenerator {
                    
    
    private String msg = null;
    private int rng;
   
   
	 public void setRegistro(String i) throws IOException {
		 	File file = new File("./Logon.txt");
		 	FileWriter fileWriter = new FileWriter(file,true);
	    	boolean test = file.exists();
	    	if(test) {
	  //  		System.out.println("existe");    		
	    	} else {
	    		file.createNewFile();
	    	}
	    	fileWriter.write(i);
	    	fileWriter.close();
		 
	 }
    
    public int getRng() {
	    Random aleatorio = new Random();
	    return this.rng = aleatorio.nextInt(10000, 10000000);
    }
    
    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String mensagem) {
        this.msg = mensagem;
    }

    public boolean Status() {
       
        if(this.msg == null) {
            return false;
        } else {
            System.out.println(this.getMsg());
            return true;
        }
        
    }
}
