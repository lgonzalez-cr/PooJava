package semana_3_2.staticPackage;

public class Outer {
    static int age = 100;

    static class staticClass{
        public static void sayHello(){
            System.out.println("I'm " + age + " years old");
        }
    }

    public static void main(String args[]) {
        Outer.staticClass.sayHello();
    }
}
