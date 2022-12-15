public class RedFish extends Animal implements Swimable {
    public RedFish(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    @Override
    public int runSpeed() {
        return 0;
    }

    @Override
    public int swimSpeed() {
        return 30;
    }
}
