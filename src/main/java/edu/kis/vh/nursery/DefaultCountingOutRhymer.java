package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private final static int MAX_SIZE = 12;
    private final static int EMPTY = -1;

    private final int[] numbers = new int[MAX_SIZE];

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

}
