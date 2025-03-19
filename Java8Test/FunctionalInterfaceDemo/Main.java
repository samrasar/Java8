package Java8Test.FunctionalInterfaceDemo;

public class Main {
    public static void main(String[] args) {
        MyFuncInterface myFunc = (i, j) -> i + j; //no need to write return i+j when we have single line
        System.out.println(myFunc.Show(6, 7));

    }
}

