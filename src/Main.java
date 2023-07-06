import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.setName("Томсон");
        cat1.setHairColor("Рыжий");
        cat1.Say();
        cat1.setAge(-5);
        System.out.println(cat1 + "\n");

        Fish fish1 = new Fish();
        fish1.setName("Карась");
        fish1.setFishScales("Серебристый");
        fish1.Say();
        fish1.setAge(3);
        System.out.println(fish1 + "\n");

        Bird bird1 = new Bird();
        bird1.setName("Снигирь");
        bird1.setFeathersColor("красный");
        bird1.Say();
        bird1.setAge(10);
        System.out.println(bird1 + "\n");

        System.out.println("----------------------");

        Animal SomeCat = new Cat();
        Move someCat = (Move) SomeCat;
        someCat.Move();

        Animal SomeFish = new Fish();
        Move someFish = (Move) SomeFish;
        someFish.Move();

        Animal SomeBird = new Bird();
        Move someBird = (Move) SomeBird;
        someBird.Move();

        System.out.println("----------------------");

        Doctor doctor = new Doctor();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat1);
        animalList.add(fish1);
        animalList.add(bird1);
        for (Animal animals : animalList) {
            System.out.print("Возраст животного (лет) - " + animals.getAge() + " ");animals.Say();
            System.out.println("----------------------");
        }
        System.out.println();
        doctor.treatAnimal(cat1);
        doctor.treatAnimal(fish1);
        doctor.treatAnimal(bird1);
    }
}