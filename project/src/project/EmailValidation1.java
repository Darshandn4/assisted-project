package project;

import java.util.regex.*;    
import java.util.*;    
public class EmailValidation1{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("javadarshan@domain.co.in");  
        emails.add("javadarashan@domain.com");  
        emails.add("javadarshan.name@domain.com");  
        emails.add("javapoint#@domain.co.in");  
        emails.add("javapoint@domain.com");  
        emails.add("javapoint@domaincom");  
         
        emails.add("@yahoo.com");  
        emails.add("javadarshan#domain.com");  
           
        String regex = "^(.+)@(.+)$";  
          
        Pattern pattern = Pattern.compile(regex);  
          
        for(String email : emails){  
              
            Matcher matcher = pattern.matcher(email);  
            System.out.println(email +" : "+ matcher.matches()+"\n");  
        }  
    }  
} 