package access_a;
import access_b.Access;

public class MainA {
        public static void main(String[] args) {
                Access access = new Access();
                AccessChild accessChild = new AccessChild();
                System.out.printf("%d %d %d",
                        access.publicVar,
                        accessChild.publicChildVar,
                        accessChild.protectedChildVar,
                        accessChild.defaultChildVar
                );
        }
}
