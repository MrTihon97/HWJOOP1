package Units;
public class Shooter extends Unit {
    protected int arrows;
    public Shooter(String TYPE, int hp, int damage, int arrows) {
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