package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Iterative because you gotta always keep your roots!
        //System.out.println(isEvenWordIter("appas"));
        System.out.println(isEvenWord("appeases"));
    }

    public static boolean isEvenWordIter(String word){
        int even = 0;
        char [] letters = word.toCharArray();
        for(int i = 0; i < letters.length; i++)
        {
            int ascii = (int) letters[i];
            for(int j = i + 1; j < letters.length; j++)
            {
                int asciij = (int) letters[j];
                if(ascii == asciij)// if every letter in the word has a duplicate
                {
                    even++;
                }
            }
        }
        if( letters.length == even * 2 && even % 2 == 0)
        {
            return true;
        }
        return false;
    }

    public static boolean isEvenWord(String word){
        //base case
        if(word.length() == 0 ){
            return true;
        } else {
            String thing = word.substring(2);
            String a = String.valueOf(word.charAt(0));
            if(thing.contains(a)){
                word.replace(a,"");
            }
        }
        return isEvenWordIter(word);
    }
}
