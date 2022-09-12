public class Dog extends Animal {

    String food = "Мясо";

    public Dog(String location_) {
        super(location_);
    }

    @Override
    public void makeNoise() {
        System.out.println("Гав");
    }

    @Override
    public void eat() {
        System.out.println("Ест " + food);
    }
}
