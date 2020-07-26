
package com.mycompany.log;
import java.lang.Math.*;
public class Simple {
    public static double calSimple(double amount,double rate,double year)
    {
        return (amount*rate*year)/100;
    }
    public static double calCompound(double amount,double rate,double time)
    {
        return amount*Math.pow((1+rate/12),time);
    }
}
