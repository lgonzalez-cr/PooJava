package semana_3_2.innerPackage;

public class Outer {
    private String name = "me";

    class Inner {
        public void sayHello() {
            System.out.println("Hello " + name);
        }
    }
}

class MyRunner {
    public static void main(String args[]) {
        Outer.Inner innerClass = new Outer().new Inner();
        innerClass.sayHello();
    }
}