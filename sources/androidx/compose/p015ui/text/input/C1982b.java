package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.input.b */
public final class C1982b implements C1984d {

    /* renamed from: a */
    public final int f4464a;

    /* renamed from: b */
    public final int f4465b;

    public C1982b(int i, int i2) {
        this.f4464a = i;
        this.f4465b = i2;
        if (!(i >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(C0070b.m183e("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.").toString());
        }
    }

    /* renamed from: a */
    public final void mo7647a(C1986f fVar) {
        C19383o.m32797g(fVar, "buffer");
        int i = fVar.f4472c;
        fVar.mo7658a(i, Math.min(this.f4465b + i, fVar.mo7660c()));
        fVar.mo7658a(Math.max(0, fVar.f4471b - this.f4464a), fVar.f4471b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1982b)) {
            return false;
        }
        C1982b bVar = (C1982b) obj;
        return this.f4464a == bVar.f4464a && this.f4465b == bVar.f4465b;
    }

    public final int hashCode() {
        return (this.f4464a * 31) + this.f4465b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        h.append(this.f4464a);
        h.append(", lengthAfterCursor=");
        return C0073e.m208h(h, this.f4465b, ')');
    }
}
