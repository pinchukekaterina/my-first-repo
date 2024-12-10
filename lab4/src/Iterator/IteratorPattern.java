package Iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class IteratorPattern {
    public static class NumberIterator implements Iterator<Integer> {
        private int current;
        private final int end;

        public NumberIterator(int start, int end) {
            this.current = start;
            this.end = end;
        }

        @Override
        public boolean hasNext() {
            return current < end;
        }

        @Override
        public Integer next() {
            if (hasNext()) {
                return current++;
            } else {
                throw new NoSuchElementException();
            }
        }
    }

    public static void main(String[] args) {
        NumberIterator iterator = new NumberIterator(1, 6);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

