package com.example.restaurantsystem3;

import java.io.*;

import JavaClasses.OrderWriter;
import com.example.restaurantsystem3.InfoManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfoManager {
    File MngInfo = new File("src\\files\\mnginfo.txt");
    File WaiterInfo = new File("src\\files\\waiterinfo.txt");
    File ChefInfo = new File("src\\files\\chefinfo.txt");
    File CashInfo = new File("src\\files\\cashinfo.txt");


    public boolean matchMethod(String User, String Pass, File file) throws IOException {
        Scanner sc = new Scanner(file);
        String user = null;
        String pass = null;
        while (sc.hasNext()){
            user = sc.next();
            pass = sc.next();
        }
        sc.close();
        if ((user.equals(User))){
            if (pass.equals(Pass)){
                return true;
            }
        }
        else {
            return false;
        }
        return false;

    }

    public File openFile(int x) {
        switch (x){
            case 1 :return MngInfo;
            case 2 :return WaiterInfo;
            case 3 :return ChefInfo;
            case 4 :return CashInfo;
            default:return null;
        }
    }
}



