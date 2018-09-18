package com.company;

public class VowelRemover {
    public String[] removeVowels(String[] inputArray){
        for(int i=0;i<inputArray.length;i++){
            String[] array = {"a","e", "i", "o", "u", "A", "E", "I", "O","U"};
            for(String s:array) {
                inputArray[i] = inputArray[i].replace(s, "");
            }
        }
        return inputArray;
    }
}
