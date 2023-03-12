package Units;
public abstract class Warrior extends Unit {
    protected int weapons;
    public Warrior(String TYPE, int hp, int damage, int weapons) {
        super(TYPE, hp, damage);

    }
}