
public abstract class Unit extends GameObject {
    private float hp;

    public Unit(int id, String name, int x, int y, float hp) {
        super(id, name, x, y);
        this.hp = hp;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public float getHp() {
        return hp;
    }

    public void receiveDamage(float damage) {
        hp -= damage;
    }
}