package stringOperators;

public class StringDemo {

    public static void main(String[] args) {
        workWithString();
    }
    public static void workWithString(){
        String car = "Nissan";
        String greetings = "Hello my people";
        String money = "£40";

        //System.out.println(greetings + " I have bought a new car " + car );
        System.out.println(greetings.concat(" I have bought a new car ").concat(car));

        int len = greetings.length();
        System.out.println(" String length of greetings " + len);

        String smallGreetings = greetings.toLowerCase();
        System.out.println(smallGreetings);

        String upperGreetings = greetings.toUpperCase();
        System.out.println(upperGreetings);

        if (car.equals("Nissan")){
            System.out.println("My new Nissan");
        }
        if(car == "Nissan"){
            System.out.println("My new new Nissan");
        }
        System.out.println(car.trim());

        if (car.equals("Nissan")){
            System.out.println("My new Nissan");
        }

        if (car.equalsIgnoreCase(car)){
            System.out.println("MY new new NissanB");
        }

       String [] splitGreetings =  greetings.split(" ");
        System.out.println(splitGreetings[0]);
        System.out.println(splitGreetings[1]);
        System.out.println(splitGreetings[2]);

        String mon = money.replaceFirst("£", "");
                int cash = Integer.parseInt(mon);
        int totalSum = 2 * cash;
        System.out.println("Today you have earned: £ "+ totalSum);

        int cAT = greetings.charAt(6);
        System.out.println(cAT);

        if (greetings.contains("pol"))
            System.out.println("Yes");
            else
            System.out.println("No");

    }
}
