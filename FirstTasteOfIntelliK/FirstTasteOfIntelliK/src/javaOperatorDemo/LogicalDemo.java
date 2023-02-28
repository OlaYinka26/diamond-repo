package javaOperatorDemo;

import java.sql.SQLOutput;

public class LogicalDemo {

    public double price = 2.5;
    private int unit = 12;
    private double sales;
    private double commission;
    public void doLogicalOperation(){
        sales = unit * price;
       if (price < 5 && unit <= 10){
           commission = 0.1 * sales;
           System.out.println(commission + "This is the commission for selling" + unit + "units at £" + price);

       }

        if (price > 5 && unit > 10) {
            commission = 0.2 * sales;
            System.out.println(commission + "This is the commission for selling" + unit + "units at £" + price);
        }
        if ((price > 5 && unit > 10) || (price < 5  && (unit > 10 || unit <= 20))){
        commission = 0.3 * sales;
            System.out.println("£"+commission + ": This is the commission for selling " + unit + "Units at £" + price);
        }

        if (!(price < 5 && unit <= 10)){
            commission = 0.1 * sales;
            System.out.println(commission + ": This is the commission for selling " + unit + " units at £" + price + "price");
        }

        }
        public void assignOperator(){

        int a = 2;
        int b = 5;
            System.out.println(a + b);

            a += b;
            System.out.println(a);

            b -= a;
            System.out.println(b + 3);

        }

    }


