public class ConcreteProductBuilder2 extends ProductBuilder {
    @Override
    public void buildPart1() {
        product.setPart1("Part1 from ConcreteProductBuilder2");
    }

    @Override
    public void buildPart2() {
        product.setPart2("Part2 from ConcreteProductBuilder2");
    }

    @Override
    public void buildPart3() {
        product.setPart3("Part3 from ConcreteProductBuilder2");
    }
}
