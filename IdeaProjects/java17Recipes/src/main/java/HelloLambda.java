public class HelloLambda {
    public interface HelloType {
        void hello(String text);
    }

    public static void main(String[] args) {
        HelloType helloLambda = (var text) -> System.out.println("Hello " + text);
        helloLambda.hello("Lambda");
    }
}
