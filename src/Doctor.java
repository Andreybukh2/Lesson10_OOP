public class Doctor extends Animal {
    public void treatAnimal(Animal animal) {
        System.out.println("Вызываем на прием животное по имени - " + animal.getName() + ", у которого возраст (лет) " + animal.getAge());
    }
}
