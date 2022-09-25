package access_a;
import access_b.Access;

public class AccessChild extends Access {
        public int publicChildVar = publicVar;
        protected int protectedChildVar = protectedVar;

        int defaultChildVar;
        private int privateChildVar;
}
