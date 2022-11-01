interface MyFunc2 {
    MyClass2 func(String s);
}

public class MyClass2 {
    private String str;

    MyClass2(String s) {
        str = s;
    }

    MyClass2() {
        str = "";
    }

    String getStr() {
        return str;
    }
}

class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc2 myClassCons = MyClass2::new;

        MyClass2 mc = myClassCons.func("Testing");

        System.out.println("str in mc is " + mc.getStr());
    }
}
