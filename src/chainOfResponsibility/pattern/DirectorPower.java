package chainOfResponsibility.pattern;

/**
 * Created by jiayanguo on 9/11/16.
 */
public class DirectorPower extends PurchasePower {
    protected double getAllowable(){
        return BASE*20;
    }

    protected String getRole(){
        return "Director";
    }
}
