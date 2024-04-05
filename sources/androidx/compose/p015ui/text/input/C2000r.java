package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.text.C1913a;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.ui.text.input.r */
public final class C2000r implements C1984d {

    /* renamed from: a */
    public final C1913a f4519a;

    /* renamed from: b */
    public final int f4520b;

    public C2000r(String str, int i) {
        this.f4519a = new C1913a(str, (List) null, 6);
        this.f4520b = i;
    }

    /* renamed from: a */
    public final void mo7647a(C1986f fVar) {
        C19383o.m32797g(fVar, "buffer");
        int i = fVar.f4473d;
        int i2 = -1;
        if (i != -1) {
            fVar.mo7661d(i, fVar.f4474e, this.f4519a.f4296b);
            if (this.f4519a.f4296b.length() > 0) {
                fVar.mo7662e(i, this.f4519a.f4296b.length() + i);
            }
        } else {
            int i3 = fVar.f4471b;
            fVar.mo7661d(i3, fVar.f4472c, this.f4519a.f4296b);
            if (this.f4519a.f4296b.length() > 0) {
                fVar.mo7662e(i3, this.f4519a.f4296b.length() + i3);
            }
        }
        int i4 = fVar.f4471b;
        int i5 = fVar.f4472c;
        if (i4 == i5) {
            i2 = i5;
        }
        int i6 = this.f4520b;
        int i7 = i2 + i6;
        int M = C19388s.m32833M(i6 > 0 ? i7 - 1 : i7 - this.f4519a.f4296b.length(), 0, fVar.mo7660c());
        fVar.mo7663f(M, M);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2000r)) {
            return false;
        }
        C2000r rVar = (C2000r) obj;
        return C19383o.m32792b(this.f4519a.f4296b, rVar.f4519a.f4296b) && this.f4520b == rVar.f4520b;
    }

    public final int hashCode() {
        return (this.f4519a.f4296b.hashCode() * 31) + this.f4520b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SetComposingTextCommand(text='");
        h.append(this.f4519a.f4296b);
        h.append("', newCursorPosition=");
        return C0073e.m208h(h, this.f4520b, ')');
    }
}
