package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0070b;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.input.c */
public final class C1983c implements C1984d {

    /* renamed from: a */
    public final int f4466a;

    /* renamed from: b */
    public final int f4467b;

    public C1983c(int i, int i2) {
        this.f4466a = i;
        this.f4467b = i2;
        if (!(i >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(C0070b.m183e("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were ", i, " and ", i2, " respectively.").toString());
        }
    }

    /* renamed from: a */
    public final void mo7647a(C1986f fVar) {
        C19383o.m32797g(fVar, "buffer");
        int i = this.f4466a;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            int i4 = fVar.f4471b;
            if (i4 > i2) {
                if (Character.isHighSurrogate(fVar.mo7659b((i4 - i2) + -1)) && Character.isLowSurrogate(fVar.mo7659b(fVar.f4471b - i2))) {
                    i2++;
                }
            }
            if (i2 == fVar.f4471b) {
                break;
            }
        }
        int i5 = this.f4467b;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6++;
            if (fVar.f4472c + i6 < fVar.mo7660c()) {
                if (Character.isHighSurrogate(fVar.mo7659b((fVar.f4472c + i6) + -1)) && Character.isLowSurrogate(fVar.mo7659b(fVar.f4472c + i6))) {
                    i6++;
                }
            }
            if (fVar.f4472c + i6 == fVar.mo7660c()) {
                break;
            }
        }
        int i8 = fVar.f4472c;
        fVar.mo7658a(i8, i6 + i8);
        int i9 = fVar.f4471b;
        fVar.mo7658a(i9 - i2, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1983c)) {
            return false;
        }
        C1983c cVar = (C1983c) obj;
        return this.f4466a == cVar.f4466a && this.f4467b == cVar.f4467b;
    }

    public final int hashCode() {
        return (this.f4466a * 31) + this.f4467b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        h.append(this.f4466a);
        h.append(", lengthAfterCursor=");
        return C0073e.m208h(h, this.f4467b, ')');
    }
}
