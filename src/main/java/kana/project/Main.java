
package kana.project;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Cisco", 10, "F", true);
        Dog dog2 = new Dog("Kana", 31, "M", false);
        System.out.println(dog2.getAge());
        dog1.bow();
        dog2.bow();
    }
}
