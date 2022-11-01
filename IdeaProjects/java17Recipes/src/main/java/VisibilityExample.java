public class VisibilityExample {
    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.setLong(32768);
        tc.visibleFroEntirePackage = 3.1415926535;
        System.out.println(tc.getLong());
        System.out.println(tc.visibleFroEntirePackage);
    }

}
