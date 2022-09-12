public class Cat extends Animal {
    String food = "Корм для кошки";

    public Cat (String location_) {
        super(location_);
    }

    @Override
    public void makeNoise() {
        System.out.println("Мяу");

    }

    @Override
    public void eat() {
        System.out.println("Животное ест " + food);
    }
}
