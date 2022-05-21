package mymethods;

import java.text.*;
public class FormattingMethods 
{
    public static String moneyFormat(double s){
        return NumberFormat.getCurrencyInstance().format(s);
    }
    public static String percentFormat(double s){
        return NumberFormat.getPercentInstance().format(s);
    }
    public static int getDay(){
        return 0;
    }
}
