public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Cat("Улица");
        animals[1] = new Dog("Будка");
        animals[2] = new Horse("Конюшня");

        Veterinar veterinar = new Veterinar();

        for (int i = 0; i < animals.length;i++){

            animals[i].makeNoise();
            veterinar.treatAnimal(animals[i]);

            System.out.println();

        }
    }
}