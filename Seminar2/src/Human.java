public class Human implements Runner {
    private int age;

    public Human(int age) {
        this.age = age;
    }

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int getSpeed() {
        if(this.age<50)
            return 10;
        else
            return 7;
    }
}
