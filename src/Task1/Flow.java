package Task1;


public class Flow {

    public static void main(String[] args) {

        Flow flow = new Flow();


        flow.methodA("1");
        flow.methodB("2");
        flow.methodC("3");
        flow.methodD(4);


    }

    public void methodA(String input) {
        if (input.equals("1")) {
            System.out.println("j");
            System.out.println("a");
            methodB("2");


        }
    }

    public void methodB(String input) {
        if (input.equals("2")) {
            System.out.println("v");
            System.out.println("a");
            methodC("3");

        }
    }

    public void methodC(String input) {
        if (input.equals("3")) {
            System.out.println("e");
            System.out.println("r");
            methodD(4);


        }


    }


    public int methodD(int number) {
        if (number < 10) {
            System.out.println("s");
            System.out.println("j");
            System.out.println("o");
            System.out.println("v");
            System.out.println("t");
            if (number < 10 && number < 2) {


            }

        }
        return number;
    }
}


























