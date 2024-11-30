public class Main {
    public static void main(String[] args) {
        // Singleton
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton instance: " + singleton);

        // Factory Method
        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.createProduct();
        productA.doSomething();

        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.createProduct();
        productB.doSomething();

        // Abstract Factory
        GUIFactory windowsFactory = new WindowsGUIFactory();
        Button windowsButton = windowsFactory.createButton();
        Menu windowsMenu = windowsFactory.createMenu();
        windowsButton.click();
        windowsMenu.show();

        GUIFactory macOSFactory = new MacOSGUIFactory();
        Button macOSButton = macOSFactory.createButton();
        Menu macOSMenu = macOSFactory.createMenu();
        macOSButton.click();
        macOSMenu.show();

        // Builder
        Director director = new Director();

        ProductBuilder builder1 = new ConcreteProductBuilder1();
        director.constructProduct(builder1);
        Product1 product1 = builder1.getProduct();
        product1.showProduct();

        ProductBuilder builder2 = new ConcreteProductBuilder2();
        director.constructProduct(builder2);
        Product1 product2 = builder2.getProduct();
        product2.showProduct();
    }
}
