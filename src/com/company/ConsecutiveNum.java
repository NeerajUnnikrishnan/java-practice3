package com.company;

public class ConsecutiveNum {
    public static boolean findConsecutiveNum(String inputString){
        String[] numArray = inputString.split(" ");
        int[] intArray = new int[numArray.length];
        for(int i=0;i<numArray.length;i++){
            intArray[i] = Integer.parseInt(numArray[i]);
        }
        if(intArray[0]<intArray[1]) {
            for (int i = 1; i < numArray.length - 1; i++) {
                if (intArray[i] > intArray[i + 1])
                    return false;
            }
        }
        if(intArray[0]>intArray[1]) {
            for (int i = 1; i < numArray.length - 1; i++) {
                if (intArray[i] < intArray[i + 1])
                    return false;
            }
        }
        return true;
    }
}
