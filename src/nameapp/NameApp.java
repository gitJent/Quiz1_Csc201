package nameapp;

import java.util.Scanner;

public class NameApp{

public static void main(String[] args){

Scanner input = new Scanner (System.in);

String name, password;

System.out.println("Enter your username");

name = input.nextLine();

System.out.println("Enter your password");

password = input.nextLine();

System.out.println("Hello " + name +","+ "Welcome to CSC200 class! and your password is " + password);

}

}