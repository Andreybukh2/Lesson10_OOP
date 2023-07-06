public class Animal {
    public Object treatAnimal;
    private String name;
    private int age;
    public void Say (){
        System.out.println("Животное говорит - ");
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Incorrect age, will be enter default age ");
            age = 1;
        }
        this.age = age;
    }

    public void treatAnimal(Animal animal) {
    }
}