package com.gayathri.interview.Strings;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String str = "This is a test";
        String[] arr = str.split(" ");
        StringBuilder revWords = new StringBuilder();

        for(int i=0;i<arr.length; i++){
           StringBuilder word = new StringBuilder(arr[i]);
            revWords.append(word.reverse() + " ");
        }

        System.out.println(revWords);

    }
}
