package Units;

public abstract class Unit implements myInterface {


    protected int hp;

    protected int damage;
    protected final String NAME;

    public Unit(String NAME, int hp, int damage) {
        this.NAME = NAME;
        this.hp = hp;
        this.damage = damage;
    }
    @Override
    public String getInfo() {
        return NAME;
    }
    @Override
    public void step() {
        System.out.println("Шаг.");
    }
    public void getNAME() {
        System.out.println(NAME);
    }

 
}
