package Units;
public abstract class Melee extends Unit {
    protected String fightingStyle;
    public Melee(String TYPE, int hp, int damage, String fightingStyle) {
        super(TYPE, hp, damage);

    }
    @Override
    public String getInfo() {
        return NAME;
    }
    @Override
    public void step() {
        System.out.println("Шаг.");
    }


}