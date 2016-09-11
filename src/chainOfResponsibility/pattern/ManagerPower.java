package chainOfResponsibility.pattern;

/**
 * Created by jiayanguo on 9/11/16.
 */
public class ManagerPower extends PurchasePower {
    protected double getAllowable(){
        return BASE*10;
    }

    protected String getRole(){
        return "Manager";
    }

}
