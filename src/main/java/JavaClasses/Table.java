package JavaClasses;

public class Table {
    private boolean busy= false;

    public Table(boolean status){
        this.busy=status;
    }

    public void setStatus(boolean status) {
        this.busy =status;
    }

    public boolean getStatus() {
        return busy;
    }

    public static boolean convertor (String a){
        if(a.equalsIgnoreCase("T")){
            return true;
        } else if (a.equalsIgnoreCase("F")) {
            return false;
        }
        return false;
    }
}
