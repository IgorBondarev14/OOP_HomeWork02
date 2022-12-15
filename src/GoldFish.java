public class GoldFish extends Animal implements Swimable{
    public GoldFish(String nickName, String owner, int legs) {
        super(nickName, owner, legs);
    }

    @Override
    public int runSpeed() {
        return 0;
    }

    @Override
    public int swimSpeed() {
        return 40;
    }

    @Override
    public String toString() {
        return "Золотая рыбка " + super.toString();
    }
}
