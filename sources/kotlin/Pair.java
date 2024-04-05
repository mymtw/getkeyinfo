package kotlin;

import android.support.p013v4.media.C0073e;
import androidx.appcompat.widget.C0326j;
import java.io.Serializable;
import kotlin.jvm.internal.C19383o;

public final class Pair<A, B> implements Serializable {
    private final A first;
    private final B second;

    public Pair(A a, B b) {
        this.first = a;
        this.second = b;
    }

    public static /* synthetic */ Pair copy$default(Pair pair, A a, B b, int i, Object obj) {
        if ((i & 1) != 0) {
            a = pair.first;
        }
        if ((i & 2) != 0) {
            b = pair.second;
        }
        return pair.copy(a, b);
    }

    public final A component1() {
        return this.first;
    }

    public final B component2() {
        return this.second;
    }

    public final Pair<A, B> copy(A a, B b) {
        return new Pair<>(a, b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return C19383o.m32792b(this.first, pair.first) && C19383o.m32792b(this.second, pair.second);
    }

    public final A getFirst() {
        return this.first;
    }

    public final B getSecond() {
        return this.second;
    }

    public int hashCode() {
        A a = this.first;
        int i = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.second;
        if (b != null) {
            i = b.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C0326j.m866k('(');
        k.append(this.first);
        k.append(", ");
        return C0073e.m209i(k, this.second, ')');
    }
}
