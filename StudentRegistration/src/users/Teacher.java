/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package users;

import java.util.Scanner;

/**
 *
 * @author Orkhan Mammadov
 */
public class Teacher {

    private String login;
    private String password;
    private final String log1 = "OrkhanM";
    private final String pass2 = "ORkhan123!@#";
    private boolean isConnected;

    public void login() {
        System.out.println("Please enter your login and password");
        
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Login: ");
            login = sc.nextLine();    //login= OrkhanM
            System.out.print("Password: ");
            password = sc.nextLine(); //password= ORkhan123!@#

            if (log1.equals(login) && pass2.equals(password)) {
                isConnected = false;
                System.out.println("Welcome your teacher account"+"\n------------------------------");
            } else {
               isConnected=true;
                System.out.println("------------------------------" + "\nPassword or Login is incorrect. Please try again");
            }
        } while (isConnected);

    }

}
