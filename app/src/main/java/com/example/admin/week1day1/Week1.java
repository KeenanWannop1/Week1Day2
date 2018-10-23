package com.example.admin.week1day1;
import java.util.*;

public class Week1 {

    public static void main(String[] args) {

    }
    public void findDuplicates(List<String> strings) {
    HashMap<String, boolean> Dup;
    for(int x = 0; strings) {
    if(Dup.containsKey(x)){
        x,true;
    }

    }

    for(int a = 0; a <printList.length; a++){
            System.out.println(printList[a]);
    }
    }
    public void fizzBuzz(int count){
        int modThree = 0;
        int modFive = 0;
        for(int x = 0; x<=count; x++){
            modThree = x % 3;
            modFive = x % 5;
            if(modThree == 0 && modFive != 0){
                System.out.println("fizz");
            }
            if else(modThree != 0 && modFive == 0){
                System.out.println("buzz");
            }
            if else(modThree == 0 && modFive == 0){
                System.out.println("fizzbuzz");
            }
            else{
                System.out.println(x);
            }
        }
    }
    public boolean checkAnagrams(String word1, String word2){
        quickSort(word1, 0, word1.length());
        quickSort(word2, 0, word2.length());
        for(int x = 0; x < word1.length(); x++){
            if(word1[x] != word2[x]){
                return false;
            }

        }
        return true;
    }
    public void printTables(){
        for(int x = 1; x<=10; x++){
            System.out.println(x + " " + x*2 + " " + x*3 + " " + x*4 + " " + x*5 + " " + x*6 + " " + x*7 + " " + x*8 + " " + x*9 + " " + x*10);
        }
    }

}
