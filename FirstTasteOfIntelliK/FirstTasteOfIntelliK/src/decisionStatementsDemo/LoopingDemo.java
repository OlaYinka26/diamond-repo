package decisionStatementsDemo;

public class LoopingDemo {

    public void testWhileDemo() {
        int number = 1;
        while (number < 11) {
            System.out.println("printing..." + number);
            number++;
        }

        do {
            System.out.println("printing ..." + number);
            number++;
        } while (number < 11);

    }

    public void testForStatement() {
        for (int number = 0; number < 11; number++) {
            System.out.println("printing ..." + number);
        }
    }

    public void testContinue() {
        for (int i = 0; i < 5; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}