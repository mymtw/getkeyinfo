package p764pq;

/* renamed from: pq.i */
public final class C20057i extends C20055g implements C20054f<Integer> {

    /* renamed from: e */
    public static final C20057i f44421e = new C20057i(1, 0);

    public C20057i(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20057i) {
            if (!isEmpty() || !((C20057i) obj).isEmpty()) {
                C20057i iVar = (C20057i) obj;
                if (!(this.f44414b == iVar.f44414b && this.f44415c == iVar.f44415c)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f44414b * 31) + this.f44415c;
    }

    public final boolean isEmpty() {
        return this.f44414b > this.f44415c;
    }

    /* renamed from: m */
    public final boolean mo74327m(int i) {
        return this.f44414b <= i && i <= this.f44415c;
    }

    /* renamed from: n */
    public final Integer mo74311g() {
        return Integer.valueOf(this.f44415c);
    }

    /* renamed from: p */
    public final Integer mo74309c() {
        return Integer.valueOf(this.f44414b);
    }

    public final String toString() {
        return this.f44414b + ".." + this.f44415c;
    }
}
