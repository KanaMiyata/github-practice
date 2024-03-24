package kana.project;

public class Dog2 {
    private String name;
    private int age;
    private String gender;
    private boolean isGoodBoy;

    public Dog2() {

    }

    // Constructor
    public Dog2(String name, int age, String gender, boolean isGoodBoy) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isGoodBoy = isGoodBoy;
    }

    // Method to make dog bark
    public void bark() {
        System.out.println("ワンワン");
    }

    // get the name
    public String getName() {
        return name;
    }

    // get the age
    public int getAge() {
        return age;
    }

    // get the gender
    public String getGender() {
        return gender;
    }

    //    get the vow
    public void bow() {
        if (isGoodBoy) {
            System.out.println("ワン");
        } else {
            System.out.println("ガウ");
        }
    }
}
