package ar.edu.unnoba.poo2018.ods.controller;

public class Validate {
    
    private static final String USER = "maxi";
    private static final String PASS = "maxi123";
	
    public static boolean checkUser(String email,String pass) {
        
        return email.equals(USER) && pass.equals(PASS);        
    }
}
