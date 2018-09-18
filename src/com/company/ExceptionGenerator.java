package com.company;

public class ExceptionGenerator {
//    NegativeArraySizeException, IndexOutOfBoundsException, NullPointerException
    public String generateIndexOutOfBoundsException() {

        try {
            int[] array = {1, 2, 3, 4};
            int k = array[5];
        } catch (IndexOutOfBoundsException e) {
            return "IndexOutOfBoundsException";
        }
        return null;
    }
    public String generateNegativeArraySizeException() {
        try {
            int[] array = new int[-1];
        } catch (NegativeArraySizeException e) {
            return "NegativeArraySizeException";
        }
        return null;
    }
    public String generateNullPointerException() {
        try {

            String s = null;
            s.toLowerCase();

        }
        catch(NullPointerException e){
            return  "NullPointerException";
        }
        return null;
    }
}
