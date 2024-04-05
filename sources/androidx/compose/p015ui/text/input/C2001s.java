package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.ui.text.input.s */
public final class C2001s implements C1984d {

    /* renamed from: a */
    public final int f4521a;

    /* renamed from: b */
    public final int f4522b;

    public C2001s(int i, int i2) {
        this.f4521a = i;
        this.f4522b = i2;
    }

    /* renamed from: a */
    public final void mo7647a(C1986f fVar) {
        C19383o.m32797g(fVar, "buffer");
        int M = C19388s.m32833M(this.f4521a, 0, fVar.mo7660c());
        int M2 = C19388s.m32833M(this.f4522b, 0, fVar.mo7660c());
        if (M < M2) {
            fVar.mo7663f(M, M2);
        } else {
            fVar.mo7663f(M2, M);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2001s)) {
            return false;
        }
        C2001s sVar = (C2001s) obj;
        return this.f4521a == sVar.f4521a && this.f4522b == sVar.f4522b;
    }

    public final int hashCode() {
        return (this.f4521a * 31) + this.f4522b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SetSelectionCommand(start=");
        h.append(this.f4521a);
        h.append(", end=");
        return C0073e.m208h(h, this.f4522b, ')');
    }
}
