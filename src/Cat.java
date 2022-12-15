public class Cat extends Animal implements Speakable, Runable{
    public Cat(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    @Override
    public String speak() {
        return "mau";
    }

    @Override
    public int runSpeed() {
        return 20;
    }

    @Override
    public String toString() {
        return "Кот" + super.toString();
    }
}
