public class Fort extends Building implements Attacker {
    private float hp;
    private float attackDamage;

    public Fort(int id, String name, int x, int y, boolean isBuilt, float hp, float attackDamage) {
        super(id, name, x, y, isBuilt);
        this.hp = hp;
        this.attackDamage = attackDamage;
    }

    @Override
    public void attack(Unit unit) {
        unit.receiveDamage(attackDamage);
    }

    public void attackUnit(Unit unit) {
        unit.receiveDamage(attackDamage);
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
