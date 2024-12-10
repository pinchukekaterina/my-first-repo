package Strategy;

public class GeometryCalculator {
    public interface ShapeStrategy {
        double calculateArea(double... params);
    }

    public static class CircleStrategy implements ShapeStrategy {
        @Override
        public double calculateArea(double... params) {
            double radius = params[0];
            return Math.PI * radius * radius;
        }
    }

    public static class RectangleStrategy implements ShapeStrategy {
        @Override
        public double calculateArea(double... params) {
            double length = params[0];
            double width = params[1];
            return length * width;
        }
    }

    public static class TriangleStrategy implements ShapeStrategy {
        @Override
        public double calculateArea(double... params) {
            double base = params[0];
            double height = params[1];
            return 0.5 * base * height;
        }
    }

    private final ShapeStrategy strategy;

    public GeometryCalculator(ShapeStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateArea(double... params) {
        return strategy.calculateArea(params);
    }

    public static void main(String[] args) {
        GeometryCalculator circleCalculator = new GeometryCalculator(new CircleStrategy());
        System.out.println(circleCalculator.calculateArea(5.0)); // Output: 78.53981633974483

        GeometryCalculator rectangleCalculator = new GeometryCalculator(new RectangleStrategy());
        System.out.println(rectangleCalculator.calculateArea(4.0, 6.0)); // Output: 24.0

        GeometryCalculator triangleCalculator = new GeometryCalculator(new TriangleStrategy());
        System.out.println(triangleCalculator.calculateArea(3.0, 4.0)); // Output: 6.0
    }
}

