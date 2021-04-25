public class Person {

    String name;
    double age;
    double height;


    public Person(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;

    }

    public void checkAgeAndHeight(){
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }

    public String getName() {
        return this.name;
    }

    public double getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

}


