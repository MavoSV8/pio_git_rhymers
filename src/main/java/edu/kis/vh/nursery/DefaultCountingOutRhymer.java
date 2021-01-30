package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX = 12;
    public static final int NEG = -1;
    private int[] numbers = new int[MAX];

    public int total = NEG;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == NEG;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return NEG;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return NEG;
        return numbers[total--];
    }

}
