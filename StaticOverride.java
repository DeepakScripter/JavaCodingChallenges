class Parent {
    // Static method in Parent class
    static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child extends Parent {
    // Static method in Child class
    static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}

public class StaticOverride {

    public static void main(String[] args) {
        // Calls static method in Parent class
        Parent.staticMethod();

        // Calls static method in Child class
        Child.staticMethod();

        // Even though the reference is of Parent type,
        // it calls the static method of Parent class.
        //Parent reference = new Child();
        // Calls static method in Parent class
        //reference.staticMethod();
    }
}
