package com.company;

public class Main {

    public static void main(String[] args) {

        //Iterative because you gotta always keep your roots!
//        System.out.println(isEvenWordIter("appas"));
//        System.out.println(isEvenWordIter("potato"));
//        System.out.println(isEvenWordIter("appeases"));
//        System.out.println(isEvenWord("appeasesed"));
//        System.out.println(isEvenWord("appleale"));
//        System.out.println(isEvenWord("firetrucks!"));
        System.out.println("MOMOO: "+isEvenWord("momoooo"));
     //   System.out.println(isEvenWord("newton"));
        // more test cases would be good
    }

    public static boolean isEvenWordIter(String word){
        int even = 0;
        char [] letters = word.toCharArray();
        for(int firstLetter = 0; firstLetter < letters.length; firstLetter++){
            for(int remainingLetters = firstLetter + 1; remainingLetters < letters.length; remainingLetters++){
                // if every letter in the word has a duplicate
                if(letters[firstLetter] == letters[remainingLetters]){
                    even++;
                }
            }
        }
        if( letters.length == even * 2 && even % 2 == 0){
            return true;
        }
        return false;
    }

    public static boolean isEvenWord(String word) {
        //base case
        if (word.length() == 0 || word == null) {
            return true;
        } else {
            char firstletter = word.charAt(0);
            String rest = word.substring(1);

            if (rest.contains("" + firstletter)) {
                word =  rest.replaceFirst("" + firstletter, "");
                System.out.println(word);
                return isEvenWord(word);
            }

        }
            return false;
    }
}
