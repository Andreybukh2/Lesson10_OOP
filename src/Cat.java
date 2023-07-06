public class Cat extends Animal implements Move {
    private String HairColor;

    public String getHairColor() {
        return HairColor;
    }

    public void setHairColor(String hairColor) {
        HairColor = hairColor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "Цвет шерсти = '" + HairColor + '\'' +
                ", имя = '" + getName() + '\'' +
                ", возраст = " + getAge() +
                '}';
    }
    @Override
    public void Say() { System.out.println(getName() + " говорит мяу, расширяя базовый метод Say из Animal");
    }
    @Override
    public void Move() {
        System.out.println("Кошка прыгает, расширяя метод Move через implements");
    }
}
