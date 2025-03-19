package Java8Test.FunctionalInterfaceDemo;

public class Main {
    public static void main(String[] args) {
        MyFuncInterface myFunc = (i, j) -> {
            int a = i * i + i;
            int b = j * j + j;
            return a + b; //no need to write return i+j when we have single line
        };
        int result = myFunc.Show(6, 8);
        System.out.println(result);

        //Actual implementation
        /*MyFuncInterface fc = new MyFuncInterface() {
            @Override
            public int Show(int i, int j) {
                return i + j;
            }
        };
        System.out.println(fc.Show(1, 3));*/
    }
}
