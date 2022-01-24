package darshan;
import java.io.*; 
import java.util.*;
	class Sender 
	{ 
	    public void send(String msg) 
	    { 
	        System.out.println("Sending\t"  + msg ); 
	        try
	        { 
	            Thread.sleep(1000); 
	        } 
	        catch (Exception e) 
	        { 
	            System.out.println("Thread  interrupted."); 
	        } 
	        System.out.println("\n" + msg + "Sent"); 
	    } 
	} 
	class UsingSynchronization extends Thread 
	{ 
	    private String msg; 
	    private Thread t; 
	    Sender  sender; 
	    UsingSynchronization(String m,  Sender obj) 
	    { 
	        msg = m; 
	        sender = obj; 
	    } 

	    public void run() 
	    {  
	        synchronized(sender) 
	        { 
	            sender.send(msg); 
	        } 
	    } 
	} 
	class UsingSynchronization 
	{ 
	    public static void main(String args[]) 
	    { 
	        Sender snd = new Sender(); 
	        UsingSynchronization S1 = 
	            new UsingSynchronization( " Hi " , snd ); 
	        UsingSynchronization S2 = 
	            new UsingSynchronization( " Bye " , snd ); 
	        S1.start(); 
	        S2.start(); 
	        try
	        { 
	            S1.join(); 
	            S2.join(); 
	        } 
	        catch(Exception e) 
	        { 
	            System.out.println("Interrupted"); 
	        } 
	    } 
	} 

