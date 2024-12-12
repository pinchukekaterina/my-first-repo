package Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        // Создание прокси-объекта
        Subject proxy = new Proxy();

        // Использование прокси-объекта
        proxy.request();
    }
}

// Интерфейс Subject
interface Subject {
    void request();
}

// Реальный Subject
class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject обрабатывает запрос.");
    }
}

// Proxy
class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        System.out.println("Proxy обрабатывает запрос перед передачей его RealSubject.");
        getRealSubject().request();
        System.out.println("Proxy обрабатывает запрос после передачи его RealSubject.");
    }

    private RealSubject getRealSubject() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        return realSubject;
    }
}
