/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package W4HW;

import java.util.Scanner;

/**
 *
 * @author Lisa
 */
public class CountMatches {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        String stringOne;
//        String stringTwo;
//        int count = 0;
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please give me a word: ");
//        stringOne = input.nextLine();
//        System.out.println("Please give me another word: ");
//        stringTwo = input.nextLine();
//
//        StringBuilder countMatches = new StringBuilder();
//
//        for (int a = 0; 1 < stringOne.length(); a++) {
//            char a1 = stringOne.charAt(a);
//
//            for (int b = 0; b < stringTwo.length(); b++) {
//                char b1 = stringTwo.charAt(b);
//
//                if (a == b) {
//                    countMatches.append(a1);
//                }
//                
//                System.out.println("There are " + countMatches + " letters that match.");
//                System.out.println("Then " + a1 + b1);
//
//            }
//        }
//    }
//
//}
Scanner input = new Scanner(System.in);
        System.out.print("Give me a word>>");
        String word1 = input.nextLine();
        int countFirstInSecond = 0;
        StringBuilder matches = new StringBuilder();

        System.out.print("Give me another word>>");
        String word2 = input.nextLine();

        for (int i = 0; i < word1.length(); i++) {

            for (int j = 0; j < word2.length(); j++) {

                if (word1.charAt(i) == word2.charAt(j)) {//if letters match

                    countFirstInSecond++;
                    matches.append(word1.charAt(i));
                    matches.append(" ");
                }
            }

        }
        if (countFirstInSecond > 0) {
            System.out.println( countFirstInSecond+" letters are in the word " + word1 + " and also in " + word2 + ": " + matches);
            
        } else {
            System.out.println("None of the letters exist in both");
        }
    }

}