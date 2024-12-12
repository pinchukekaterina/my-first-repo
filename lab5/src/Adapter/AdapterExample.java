package Adapter;

public class AdapterExample {
    public static void main(String[] args) {
        // Использование целевого интерфейса
        Target target = new Target();
        target.request();

        // Использование адаптера
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);
        adapter.request();
    }
}

// Целевой интерфейс
class Target {
    public void request() {
        System.out.println("Запрос Target.");
    }
}

// Адаптируемый класс
class Adaptee {
    public void specificRequest() {
        System.out.println("Специфический запрос Adaptee.");
    }
}

// Адаптер
class Adapter extends Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("Адаптер переводит и передает запрос.");
        adaptee.specificRequest();
    }
}

