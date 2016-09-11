package chainOfResponsibility.pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class CheckAuthority {
    public static void main(String[] args) {
        ManagerPower manager = new ManagerPower();
        DirectorPower director = new DirectorPower();
        manager.setSuccessor(director);
        try {
            while (true) {
                System.out.println("Enter the amount to check who should approve your expenditure.");
                System.out.print(">");
                double d = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
                manager.processRequest(new PurchaseRequest(d, "General"));
           }
        } catch(Exception e) {
            System.exit(1);
        }
    }
}