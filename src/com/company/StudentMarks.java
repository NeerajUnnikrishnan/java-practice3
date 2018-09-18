package com.company;

import java.util.IllegalFormatException;

public class StudentMarks {

    private int numOfStudents;
    private  int[] stuGrades;

    public StudentMarks(int numOfStudents, int[] stuGrades) {
        this.numOfStudents = numOfStudents;
        this.stuGrades = stuGrades;
    }

    public String checkGrades(){

        try{
            for(int i=0;i<this.numOfStudents;i++){
                if(this.stuGrades[i]< 0 | this.stuGrades[i]>100){
                    throw new IllegalArgumentException();
                }
            }

        }
        catch (IllegalArgumentException e){
                return "Error found";
        }
        return "Grades are correctly marked.";
    }

}
