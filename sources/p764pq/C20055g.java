package p764pq;

import androidx.compose.p015ui.text.input.C1993m;
import p755lq.C19875a;

/* renamed from: pq.g */
public class C20055g implements Iterable<Integer>, C19875a {

    /* renamed from: b */
    public final int f44414b;

    /* renamed from: c */
    public final int f44415c;

    /* renamed from: d */
    public final int f44416d;

    public C20055g(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.f44414b = i;
            this.f44415c = C1993m.m4347H(i, i2, i3);
            this.f44416d = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C20055g) {
            if (!isEmpty() || !((C20055g) obj).isEmpty()) {
                C20055g gVar = (C20055g) obj;
                if (!(this.f44414b == gVar.f44414b && this.f44415c == gVar.f44415c && this.f44416d == gVar.f44416d)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f44414b * 31) + this.f44415c) * 31) + this.f44416d;
    }

    public boolean isEmpty() {
        if (this.f44416d > 0) {
            if (this.f44414b > this.f44415c) {
                return true;
            }
        } else if (this.f44414b < this.f44415c) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final C20056h iterator() {
        return new C20056h(this.f44414b, this.f44415c, this.f44416d);
    }

    public String toString() {
        int i;
        StringBuilder sb;
        if (this.f44416d > 0) {
            sb = new StringBuilder();
            sb.append(this.f44414b);
            sb.append("..");
            sb.append(this.f44415c);
            sb.append(" step ");
            i = this.f44416d;
        } else {
            sb = new StringBuilder();
            sb.append(this.f44414b);
            sb.append(" downTo ");
            sb.append(this.f44415c);
            sb.append(" step ");
            i = -this.f44416d;
        }
        sb.append(i);
        return sb.toString();
    }
}
