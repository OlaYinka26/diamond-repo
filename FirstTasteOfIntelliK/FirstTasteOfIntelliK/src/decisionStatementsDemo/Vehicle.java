package decisionStatementsDemo;

public class Vehicle {
    private String chasisNumber = "A2339939";
    private int numTyres = 4;
    private String regNum = "AD23DJK";
    private boolean isMoving = true;
    private double speed;
    private double SpeedRange = 30.0;

    public void applyBrakes(double speed) {
        this.speed = speed;
        if (isMoving) {
            speed--;
            System.out.println(speed);
        }

        if (speed <= 30 && SpeedRange == 30) {
            System.out.println("Thank you for driving safely");
        } else if (speed > 30 && SpeedRange == 30)
            System.out.println("Captured and fined");

        else if ((speed > 30 || speed <= 40) && SpeedRange == 40)
            System.out.println("Fined");

    }

    public void checkYourGrade() {
        int score = 50;
        char grade;

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else {

            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    }

    public void SwitchGrade() {
        int scoreIndex = 3;
        char grade;

        switch (scoreIndex) {
            case 1:
                grade = 'A';
                break;
            case 2:
                grade = 'B';
                break;
            case 3:
                grade = 'C';
                System.out.println("You have done well");
                break;
            case 4:
                grade = 'D';
                break;
            default:
            System.out.println("Sorry! no  grade available");
        }

    }

    public void selectWeekDay(){
        int weekNumber = 1;
        String day;

        switch (weekNumber){
            case 1: day = "Monday";
            int price = 30;
            int item = 2;
                System.out.println("Total Sales = " + item * price);
            break;
            case 2: day = "Tuesday";
                break;
            case 3: day = "Wednesday";
                break;
            case 4: day = "Thursday";
                break;
            case 5: day = "Friday";
                break;
            case 6: day = "Saturday";
                break;
            case 7: day = "Sunday";
                break;
            default: day = "Invalid day";

        }
        System.out.println(day);
    }
}


