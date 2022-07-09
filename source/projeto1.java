package source;

import java.util.Random;




public class projeto1{
	
    private String msg = null;
    private int rng;
    
    
    
    
    
    
    
    public int gerador() {
    	Random aleatorio = new Random();
    	this.rng = aleatorio.nextInt(1000000, 1000000000);
    	return this.rng;
    }
    
    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String mensagem) {
        this.msg = mensagem;
        System.out.println(mensagem);
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

