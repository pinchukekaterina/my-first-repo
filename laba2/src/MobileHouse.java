public class MobileHouse extends Building implements Moveable {
    private float moveSpeed;

    public MobileHouse(int id, String name, int x, int y, boolean isBuilt, float moveSpeed) {
        super(id, name, x, y, isBuilt);
        this.moveSpeed = moveSpeed;
    }

    @Override
    public void move(int x, int y) {
        setX(x);
        setY(y);
    }
}