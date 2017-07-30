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
public class BabyNameComparison {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name1;
        String name2;
        String name3;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the first name? ");
        name1 = input.nextLine();
        System.out.println("What is the second name? ");
        name2 = input.nextLine();
        System.out.println("What is the third name?");
        name3 = input.nextLine();

        String combo1 = name1 + " " + name2;
        String combo2 = name1 + " " + name3;
        String combo3 = name2 + " " + name1;
        String combo4 = name2 + " " + name3;
        String combo5 = name3 + " " + name1;
        String combo6 = name3 + " " + name2;

        System.out.println(combo1);
        System.out.println(combo2);
        System.out.println(combo3);
        System.out.println(combo4);
        System.out.println(combo5);
        System.out.println(combo6);

    }

}
