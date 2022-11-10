package zoo;

public class Zoo {


    public static void moveAnimals(Animal animal){
        animal.move();
    }

    public static void main(String[] args) {

        Bird bird = new Bird("Pigeon", 10, "F", 5);
        bird.move();

        Eagle eagle = new Eagle("Big eagle", 15, "M", 15);
        eagle.move();

        Fish fish = new Fish("Fish", 5, "M", 20);
        fish.move();

        Animal tiger = new Tiger("Tiger", 5, "M", 40);
        tiger.move();

        Flyable flyable = new Bird("Hawk", 10, "F", 5);
        flyable.fly();

        Animal[] animals = {bird, eagle, fish, tiger};

        moveAnimals(bird);
        moveAnimals(fish);




    }




}
