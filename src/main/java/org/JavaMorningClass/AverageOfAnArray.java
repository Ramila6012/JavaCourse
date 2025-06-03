package org.JavaMorningClass;

//write to programm to calculate average of numbers of an array
public class AverageOfAnArray {
    public static void main(String[] args) {
       int Array[]= {21,34,45,23,78};
       double Average;
       double sum= 0.0;

       for(int i= 0; i< Array.length; i++) {
           sum = sum + Array[i];
       }
       Average = (sum/Array.length);
        System.out.println("The average of the Array is:" + Average );
    }
}
