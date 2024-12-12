package Bridge;

public class BridgeExample {
    public static void main(String[] args) {
        // Создание абстракций с различными реализациями
        Abstraction abstraction_a = new RefinedAbstraction(new ConcreteImplementationA());
        abstraction_a.operation();

        Abstraction abstraction_b = new RefinedAbstraction(new ConcreteImplementationB());
        abstraction_b.operation();
    }
}

// Интерфейс Implementation
interface Implementation {
    void implementOperation();
}

// Конкретные реализации
class ConcreteImplementationA implements Implementation {
    @Override
    public void implementOperation() {
        System.out.println("ConcreteImplementationA выполняет операцию.");
    }
}

class ConcreteImplementationB implements Implementation {
    @Override
    public void implementOperation() {
        System.out.println("ConcreteImplementationB выполняет операцию.");
    }
}

// Абстракция
abstract class Abstraction {
    protected Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    public void operation() {
        implementation.implementOperation();
    }
}

// Уточненная абстракция
class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }
}

