package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.ui.text.input.q */
public final class C1999q implements C1984d {

    /* renamed from: a */
    public final int f4517a;

    /* renamed from: b */
    public final int f4518b;

    public C1999q(int i, int i2) {
        this.f4517a = i;
        this.f4518b = i2;
    }

    /* renamed from: a */
    public final void mo7647a(C1986f fVar) {
        C19383o.m32797g(fVar, "buffer");
        if (fVar.f4473d != -1) {
            fVar.f4473d = -1;
            fVar.f4474e = -1;
        }
        int M = C19388s.m32833M(this.f4517a, 0, fVar.mo7660c());
        int M2 = C19388s.m32833M(this.f4518b, 0, fVar.mo7660c());
        if (M == M2) {
            return;
        }
        if (M < M2) {
            fVar.mo7662e(M, M2);
        } else {
            fVar.mo7662e(M2, M);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1999q)) {
            return false;
        }
        C1999q qVar = (C1999q) obj;
        return this.f4517a == qVar.f4517a && this.f4518b == qVar.f4518b;
    }

    public final int hashCode() {
        return (this.f4517a * 31) + this.f4518b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SetComposingRegionCommand(start=");
        h.append(this.f4517a);
        h.append(", end=");
        return C0073e.m208h(h, this.f4518b, ')');
    }
}
