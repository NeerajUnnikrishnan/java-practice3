package com.company;

public class ExceptionChecker {
    public static String main(String inputString){

        try{
           throw new IllegalArgumentException();
        }
        catch(IllegalArgumentException e ){

        }
        finally{
            return "You are in finally block!";
        }
    }
}
