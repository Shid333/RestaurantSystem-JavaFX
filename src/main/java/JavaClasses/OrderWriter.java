package JavaClasses;

import com.example.restaurantsystem3.InfoManager;
import javafx.event.ActionEvent;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrderWriter {


    public static void writeOrder(String filepath, List<String> data) throws IOException {
        List<String> list = new ArrayList<>();
        list.addAll(0,data);
        FileWriter fileWriter = new FileWriter(filepath, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (int i = 0; i < list.size(); i++) {
            bufferedWriter.write(list.get(i) + "\n");
        }
        bufferedWriter.close();
    }
    public static void write(String filepath,List<String> data) throws FileNotFoundException {
        List<String> list = new ArrayList<>();
        list.addAll(0,data);
        PrintWriter printWriter = new PrintWriter(filepath);
        for(int i=0; i< list.size();i++){
            printWriter.println(list.get(i));
        }
        printWriter.close();

    }
    public static void writeOrders(String filepath, List<String> data) throws IOException {
        List<String> list = new ArrayList<>();
        Orders orders = new Orders("Received");
        list.addAll(data);
        FileWriter fileWriter = new FileWriter(filepath,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("Sandwich= "+ list.get(0) + "\n");
        bufferedWriter.write("Hamburger= "+ list.get(1) + "\n");
        bufferedWriter.write("Pizza= "+ list.get(2) + "\n");
        bufferedWriter.write("Water Bottle= "+ list.get(3) + "\n");
        bufferedWriter.write("Soda= "+ list.get(4) + "\n");
        bufferedWriter.write("Total Price= "+ orders.calculateTotalPrice(list) + "\n");
        bufferedWriter.write("---"+"\n");
        bufferedWriter.close();
    }



    public static List<String> readOrder(String filepath) throws IOException {
        List<String> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader(filepath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }
        return arrayList;
    }


    public static List<String> readOrder2(File file) throws IOException {
        List<String> arrayList = new ArrayList<>();
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
        }
        return arrayList;
    }


    public static String readStatus(String s) throws FileNotFoundException {
        Scanner sc = new Scanner(new File(s));
        return sc.next();
    }
    public static void write(String s,String a) throws IOException {
        FileWriter fileWriter = new FileWriter(s, false);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(a);
        bufferedWriter.close();
    }
    public static void finalManager(String filepath) throws IOException {

        List<String> data1 = new ArrayList<>();

        data1.addAll(OrderWriter.readOrder("src\\files\\finalReport.txt"));
        Orders orders = new Orders("Served");
        double price = orders.calculateTotal(data1);
        OrderWriter.writeOrders("src\\files\\finalReport.txt",data1);

    }
}

