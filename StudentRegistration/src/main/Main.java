/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import metodlar.Metodlar;
import users.Student;
import metodlar.Metodlar;
import users.Teacher;
/**
 *
 * @author Orkhan Mammadov
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Teacher t=new Teacher();  //login password Teacher classinda yazmisham
        t.login();
        int emeliyyat =Metodlar.number("Choose operation "
                + "\n1.Add new student"
                + "\n2.Show student`s info");
        if (emeliyyat == 1) {
           Metodlar.studentRegister();
        }
        else if(emeliyyat==2){
            Metodlar.printAllInfo();
        }
    }
    
    

}
