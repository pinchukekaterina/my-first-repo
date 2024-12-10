package ResponsibilityChain;

public class ChainOfResponsibilityPattern {
    public interface Handler {
        void handleRequest(Request request);
        void setNextHandler(Handler nextHandler);
    }

    public static class ConcreteHandlerA implements Handler {
        private Handler nextHandler;

        @Override
        public void handleRequest(Request request) {
            if (request.getType() == RequestType.TYPE_A) {
                System.out.println("ConcreteHandlerA handled the request.");
            } else if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }

        @Override
        public void setNextHandler(Handler nextHandler) {
            this.nextHandler = nextHandler;
        }
    }

    public static class ConcreteHandlerB implements Handler {
        private Handler nextHandler;

        @Override
        public void handleRequest(Request request) {
            if (request.getType() == RequestType.TYPE_B) {
                System.out.println("ConcreteHandlerB handled the request.");
            } else if (nextHandler != null) {
                nextHandler.handleRequest(request);
            }
        }

        @Override
        public void setNextHandler(Handler nextHandler) {
            this.nextHandler = nextHandler;
        }
    }

    public static class Request {
        private RequestType type;

        public Request(RequestType type) {
            this.type = type;
        }

        public RequestType getType() {
            return type;
        }
    }

    public enum RequestType {
        TYPE_A, TYPE_B
    }

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        handlerA.setNextHandler(handlerB);

        Request requestA = new Request(RequestType.TYPE_A);
        Request requestB = new Request(RequestType.TYPE_B);

        handlerA.handleRequest(requestA); // Output: ConcreteHandlerA handled the request.
        handlerA.handleRequest(requestB); // Output: ConcreteHandlerB handled the request.
    }
}

