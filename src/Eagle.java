public class Eagle extends Animal implements Speakable, Runable, Flyable{
    public Eagle(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    @Override
    public int runSpeed() {
        return 6;
    }

    @Override
    public int flySpeed() {
        return 70;
    }

    @Override
    public String speak() {
        return "AAAAAA";
    }
}
