public class Main {
    public static void main(String[] args) {
        // Создаем объекты
        Archer archer = new Archer(1, "Лучник", 10, 10, 100.0f, 20.0f, 5.0f);
        Fort fort = new Fort(2, "Крепость", 20, 20, true, 100.0f, 50.0f);
        MobileHouse mobileHouse = new MobileHouse(3, "Дом на колесах", 30, 30, false, 3.0f);

        // Проверяем методы
        System.out.println("Лучник жив? " + archer.isAlive());
        System.out.println("Здоровье лучника: " + archer.getHp());

        fort.attackUnit(archer);
        System.out.println("Крепость построена? " + fort.isBuilt());
        System.out.println("Здоровье крепости: " + fort.getHp());
        System.out.println("Здоровье лучника: " + archer.getHp());

        archer.move(15, 15);
        System.out.println("Новые координаты лучника: (" + archer.getX() + ", " + archer.getY() + ")");

        mobileHouse.move(40, 40);
        System.out.println("Новые координаты дома на колесах: (" + mobileHouse.getX() + ", " + mobileHouse.getY() + ")");
    }
}