package GaiPT;

public class Main {

    public static void main(String[] args) {
        boolean isDisplayResult = true;
        System.out.println("       ====PTB1====       ");

        PTB1 pt1 = new PTB1();
        // update AB
        pt1.updateAB(3, -4);
        String result = pt1.sole(isDisplayResult);
        // update A
        pt1.updateA(5);
        pt1.sole(isDisplayResult);
        // update B
        pt1.updateB(6);
        pt1.sole(isDisplayResult);

        System.out.println("       ====PTB2====       ");

        PTB2 pt2 = new PTB2();

        pt2.updateCAB(2, 5, 4);
        pt2.solve(isDisplayResult);

        pt2.updateCAB(1, 4, 2);
        pt2.solve(isDisplayResult);

        System.out.println("       ====PTB3====       ");
        System.out.println("       ====PTB4====       ");
        System.out.println("       ====PTB5====       ");

    }
}
