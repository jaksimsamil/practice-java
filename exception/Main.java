package exception;

public class Main {
        public static void printlnThrows(String myString) throws NullPointerException{
                System.out.println(myString.toString());
        }

        public static void printlnTryCatch(String myString) {
                try{
                        System.out.println(myString.toString());
                } catch (NullPointerException e) {
                        System.out.println("Null Pointer Exception");
                }
        }

        public static void println(String myString) {
                System.out.println(myString.toString());
        }

        public static void main(String[] args) {
                String myString = null;
                println(myString);           // NullPointerException 발생함 - RuntimeException
                printlnTryCatch(myString);   // Exception try catch 처리
                try {
                        printlnThrows(myString);     // 메소드를 호출하는 곳에서 처리
                } catch (NullPointerException e){
                        e.printStackTrace();
                }
        }
}