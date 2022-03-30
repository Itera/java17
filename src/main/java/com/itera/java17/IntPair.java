package com.itera.java17;

class IntPair {
    int val1;
    int val2;

    IntPair(int val1, int val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public int getVal1() {
        return val1;
    }

    public int getVal2() {
        return val2;
    }

    // Old style equals with instanceof type guard - can be simplified

    public boolean equals(Object o) {
        if (!(o instanceof IntPair))
            return false;

        IntPair other = (IntPair) o;

        return val1 == other.getVal1() && val2 == other.getVal2();

//        return o instanceof IntPair other &&  val1 == other.getVal1() && val2 == other.getVal2();
    }
}
