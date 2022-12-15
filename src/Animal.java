public abstract class Animal {
    private String nickName;
    private String owner;
    private int legs;

    public Animal(String nickName, String owner, int legs) {
        this.nickName = nickName;
        this.owner = owner;
        this.legs = legs;
    }

    public String getNickName() {
        return nickName;
    }

    public String getOwner() {
        return owner;
    }

    public int getLegs() {
        return legs;
    }

    @Override
    public String toString() {
        return "{" +
                "кличка = '" + getNickName() + '\'' +
                ", хозяин = '" + getOwner() + '\'' +
                ", количество лап = " + getLegs() +
                '}';
    }

    public abstract int runSpeed();
}

