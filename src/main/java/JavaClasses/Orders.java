package JavaClasses;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Orders {
    List<String> finalOrder = new ArrayList<>();
    private String status;

    //constructor with its status
    public Orders(String status){
        this.status=status;
    }
    public void changeStatusToReceived(){
        status="Received";
    }
    public void changeStatusToServed(){
        status="Served";
    }
    public void changeStatusToPaid(){
        status="Paid";
    }

    public List<String> completeOrder(List<String> orderReport){
        finalOrder.addAll(orderReport);
        return finalOrder;
    }
    public double calculateTotalPrice(List<String> order){
        double TotalPrice = 0;
        double food1 = Double.parseDouble(order.get(0));
        double food2 = Double.parseDouble(order.get(1));
        double food3 = Double.parseDouble(order.get(2));
        double drink1= Double.parseDouble(order.get(3));
        double drink2= Double.parseDouble(order.get(4));
        TotalPrice = food1 * 60000 + food2 * 65000 + food3 * 70000 + drink1 * 8000 + drink2 * 15000;
        return TotalPrice;
    }
    public double calculateTotal(List<String> order) throws IOException {
        double Total = 0;
        double Total1 = Double.parseDouble(order.get(6));
        double Total2 = Double.parseDouble(order.get(13));
        double Total3 = Double.parseDouble(order.get(18));
        Total = Total1 + Total2 + Total3;
        OrderWriter.finalManager("src\\files\\finalreport.txt");
        return Total;
    }



    public static boolean convertor (String a){
        if(a.equalsIgnoreCase("w")){
            return true;
        } else if (a.equalsIgnoreCase("s")) {
            return false;
        }
        return false;
    }
}
