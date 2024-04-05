package p275w6;

import p267v7.C8212a;

/* renamed from: w6.c */
public final class C8254c {

    /* renamed from: a */
    public final int[] f18089a;

    public C8254c(int[] iArr) {
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        this.f18089a = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8254c)) {
            return false;
        }
        return C8212a.m16501h(this.f18089a, ((C8254c) obj).f18089a);
    }

    public final int hashCode() {
        return C8212a.m16496c(this.f18089a);
    }
}
