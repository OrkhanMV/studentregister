/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodlar;

import java.util.Scanner;
import main.DataBase;
import users.Student;
import users.Teacher;

/**
 *
 * @author Orkhan Mammadov
 */
public class Metodlar {

//string tipli verilenler teleb olunan yerlerde bu metodu istifade edirem
    public static String text(String bashliq) {
        Scanner sc = new Scanner(System.in);
        System.out.print(bashliq + ":");
        String metn = sc.nextLine();
        return metn;
    }
    
//int tipli verilenler teleb olunan yerlerde bu metodu istifade edirem
    public static int number(String bashliq) {
        Scanner sc = new Scanner(System.in);
        System.out.print(bashliq + ":");
        int number = sc.nextInt();
        return number;
    }

    //student classinin construktoruna yuxardaki metodu cagirib ad soyad ve/s melumatlari oturmek ucun. s return edirem
    public static Student fillInfo() {
        String name = Metodlar.text("Enter Name");
        String surname = Metodlar.text("Enter surname");
        int age = Metodlar.number("Enter Age");
        String className = Metodlar.text("Enter Class name");
        System.out.println("-----------------");

        Student s = new Student(name, surname, age, className);
        return s;
    }

// butun melumatlari cap etmek ucun
    public static void printAllInfo() {
        for (int i = 0; i < DataBase.student.length; i++) {
            Student s1 = DataBase.student[i];
            System.out.println("------------------------------" + "\n" + (1 + i) + " student" + "\nName: " + s1.getName() + "\nSurname: " + s1.getSurname()
                    + "\nAge: " + s1.getAge() + "\nClass: " + s1.getClassname());
        }
    }

/*telebe sayini burdan alib massivin uzunlugunu teyin edirem. 
for-la massivin indexine uygun yuxardaki fillInfo metodu 
ile adlari soyadlari ve.s menimsedirem. sonra printAllInfo metodu ile hamsini cap edirem*/
    public static void studentRegister() {
        System.out.print("Enter student count: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        DataBase.student = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println((1 + i) + " student");
            DataBase.student[i] = Metodlar.fillInfo();
        }

        Metodlar.printAllInfo();
    }

}
