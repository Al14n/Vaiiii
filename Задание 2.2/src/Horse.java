public class Horse extends Animal{

    String food = "Сено";

    public Horse(String location_) {
        super(location_);
    }

    @Override
    public void makeNoise() {
        System.out.println("Иго-го");
    }

    @Override
    public void eat() {
        System.out.println("Ест " + food);
    }
}
