public class Main {

    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.addAnimal(new Cat("Барсик", "Василий", 4))
                .addAnimal(new Dog("Шарик", "Эльза", 3))
                .addAnimal(new Duck("Donald", "-", 2))
                .addAnimal(new Eagle("?", "-", 2))
                .addAnimal(new GoldFish("Аркадий", "Андрейка", 0));
        System.out.println(zoo);
        System.out.println(zoo.talk());
        System.out.println("Скорость самого быстрого животного (бег) - " + zoo.getChampionSpeed());
        System.out.println("Скорость самого быстрого животного (полет) - " + zoo.getChampionFlySpeed());
        System.out.println("Скорость самого быстрого животного (плавание) - " + zoo.getChampionSwimSpeed());
        System.out.println("Run Speed");
        for (Runable i: zoo.getRunnable() ){
            System.out.println(i.runSpeed());
        }
        System.out.println("Fly Speed");
        for (Flyable i: zoo.getFlyable() ){
            System.out.println(i.flySpeed());
        }
        System.out.println("Swim Speed");
        for (Swimable i: zoo.getSwimable() ){
            System.out.println(i.swimSpeed());
        }
        SaveManager saveManager = new SaveManager();
        saveManager.save(zoo.getAnimals());
    }
}