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

                System.out.printf("Origin Value       :  %d %d\n", wrapA.num, wrapB.num);
                swap(wrapA.num, wrapB.num);
                System.out.printf("Call swap by value :  %d %d\n", wrapA.num, wrapB.num);
                swapObject(wrapA, wrapB);
                System.out.printf("Call swap by Object:  %d %d\n", wrapA.num, wrapB.num);
        }
}