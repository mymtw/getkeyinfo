package com.fasterxml.jackson.core.sym;

public final class Name2 extends Name {

    /* renamed from: q1 */
    private final int f27637q1;

    /* renamed from: q2 */
    private final int f27638q2;

    public Name2(String str, int i, int i2, int i3) {
        super(str, i);
        this.f27637q1 = i2;
        this.f27638q2 = i3;
    }

    public boolean equals(int i) {
        return false;
    }

    public boolean equals(int i, int i2) {
        return i == this.f27637q1 && i2 == this.f27638q2;
    }

    public boolean equals(int i, int i2, int i3) {
        return false;
    }

    public boolean equals(int[] iArr, int i) {
        return i == 2 && iArr[0] == this.f27637q1 && iArr[1] == this.f27638q2;
    }
}
