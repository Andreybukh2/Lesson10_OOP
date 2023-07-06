public class Fish extends Animal implements Move {
    private String FishScales;

    public String FishScales() {
        return FishScales;
    }

    public void setFishScales(String hairColor) {
        FishScales = hairColor;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "Цвет чешуи = '" + FishScales + '\'' +
                ", имя = '" + getName() + '\'' +
                ", возраст = " + getAge() +
                '}';
    }
    @Override
    public void Say() { System.out.println(getName() + " молчит, расширяя базовый метод Say из Animal");
    }
    @Override
    public void Move() {
        System.out.println("Рыба плывет, расширяя метод Move через implements");
    }
}
