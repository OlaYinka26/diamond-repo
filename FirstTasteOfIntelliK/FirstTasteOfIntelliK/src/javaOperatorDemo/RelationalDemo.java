package javaOperatorDemo;

public class RelationalDemo {
    public void compareTwoNumbers(){
        int value1 = 2;
        int value2 = 0;
        if(value1 == value2){
            System.out.println("The two values are equal");
        }
        if(value1 != value2){
            System.out.println("The two values are not equal");

        }
        if(value1 < value2){
            System.out.println("Value1 is less than Value2");
        }
        if(value1 > value2){
            System.out.println("Value is greater than value2");
        }
        if(value2 != 0){
            int divisionResult = value1/value2;
            System.out.println(divisionResult);
        }
        else {
            System.out.println("Division by zero not defined");
        }
    }
}
