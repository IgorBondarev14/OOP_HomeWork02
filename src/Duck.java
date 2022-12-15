public class Duck extends Animal implements Speakable, Runable, Flyable, Swimable{
    public Duck(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    @Override
    public int runSpeed() {
        return 5;
    }

    @Override
    public String speak() {
        return "Krya Krya";
    }
    public int flySpeed() {
        return 45;
    }
    @Override
    public String toString() {
        return "Утка" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 20;
    }
}
