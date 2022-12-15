public class Dog extends Animal implements Speakable, Runable, Swimable{
    public Dog(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    @Override
    public String speak() {
        return "Waw";
    }

    @Override
    public int runSpeed() {
        return 30;
    }
    @Override
    public String toString() {
        return "Собака" + super.toString();
    }

    @Override
    public int swimSpeed() {
        return 25;
    }
}
