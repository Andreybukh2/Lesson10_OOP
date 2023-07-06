public class Bird extends Animal implements Move {
    private String FeathersColor;

    public String FeathersColor() {
        return FeathersColor;
    }

    public void setFeathersColor(String feathersColor) {
        FeathersColor = feathersColor;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "Цвет оперения ='" + FeathersColor + '\'' +
                ", имя = '" + getName() + '\'' +
                ", возраст = " + getAge() +
                '}';
    }
    @Override
    public void Say() { System.out.println(getName() + " поёт, расширяя базовый метод Say из Animal");
    }
    @Override
    public void Move() {
        System.out.println("Птица летит, расширяя метод Move через implements");
    }
}
