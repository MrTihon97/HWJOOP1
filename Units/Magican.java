package Units;
public abstract class Magican extends Unit {
    protected int mana;
    public Magican(String TYPE, int hp, int damage, int mana ) {
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