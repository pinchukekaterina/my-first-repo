public class Archer extends Unit implements Attacker, Moveable {
    private float attackDamage;
    private float moveSpeed;

    public Archer(int id, String name, int x, int y, float hp, float attackDamage, float moveSpeed) {
        super(id, name, x, y, hp);
        this.attackDamage = attackDamage;
        this.moveSpeed = moveSpeed;
    }

    @Override
    public void attack(Unit unit) {
        unit.receiveDamage(attackDamage);
    }

    @Override
    public void move(int x, int y) {
        setX(x);
        setY(y);
    }
}


