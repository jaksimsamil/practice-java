package callbyparameter;

class MyInteger{
        public int num;
        public MyInteger(int num){
                this.num = num;
        }
}

public class Main {
        public static void swap(int a, int b) {
                int temp = a;
                a = b;
                b = temp;
        }

        public static void swapObject(MyInteger x, MyInteger y) {
                int temp = x.num;
                x.num = y.num;
                y.num = temp;
        }

        public static void main(String[] args) {
                MyInteger wrapA = new MyInteger(-1);
                MyInteger wrapB = new MyInteger(1);

                System.out.printf("Result 1:  %d %d\n", wrapA.num, wrapB.num);
                swap(wrapA.num, wrapB.num);
                System.out.printf("Result 2:  %d %d\n", wrapA.num, wrapB.num);
                swapObject(wrapA, wrapB);
                System.out.printf("Result 3:  %d %d\n", wrapA.num, wrapB.num);
        }
}