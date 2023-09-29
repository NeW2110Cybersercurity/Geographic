/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import static common.Validation.checkInputIntLimit;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {
    private final static Scanner in = new Scanner(System.in);
    
    //display menu
    public static int menu(){
        System.out.println("                               MENU");
        System.out.println("==========================================================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending");
        System.out.println("5. Exit");
        System.out.println("==========================================================================");
        System.out.print("Please choice one option: ");
        int choice = checkInputIntLimit(1, 5);
        return choice;
    }
}
