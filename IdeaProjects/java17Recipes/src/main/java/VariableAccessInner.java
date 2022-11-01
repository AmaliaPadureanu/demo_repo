import java.util.function.Consumer;

public class VariableAccessInner {
    public String CLASSA = "Class-level A";
    class InnerClass {
        public String CLASSA = "Class-level B";
        void lambdaInMethod(String passedIn) {
            String METHODA = "Method-level A";
            Consumer<String> ll = x -> {
                System.out.println(x);
                System.out.println("CLASSA Value: " + CLASSA);
                System.out.println("METHODA Value: " + METHODA);
            };
            ll.accept(CLASSA);
            ll.accept(passedIn);
        }
    }

    public static void main(String[] args) {
        System.out.println("==VariableAccessInner==");
        VariableAccessInner vai = new VariableAccessInner();
        VariableAccessInner.InnerClass inner = vai.new InnerClass();
        inner.lambdaInMethod("Hello");
    }
}
