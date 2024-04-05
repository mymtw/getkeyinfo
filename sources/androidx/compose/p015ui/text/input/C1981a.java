package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.p015ui.text.C1913a;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.ui.text.input.a */
public final class C1981a implements C1984d {

    /* renamed from: a */
    public final C1913a f4462a;

    /* renamed from: b */
    public final int f4463b;

    public C1981a(String str, int i) {
        this.f4462a = new C1913a(str, (List) null, 6);
        this.f4463b = i;
    }

    /* renamed from: a */
    public final void mo7647a(C1986f fVar) {
        C19383o.m32797g(fVar, "buffer");
        int i = fVar.f4473d;
        if (i != -1) {
            fVar.mo7661d(i, fVar.f4474e, this.f4462a.f4296b);
        } else {
            fVar.mo7661d(fVar.f4471b, fVar.f4472c, this.f4462a.f4296b);
        }
        int i2 = fVar.f4471b;
        int i3 = fVar.f4472c;
        if (i2 != i3) {
            i3 = -1;
        }
        int i4 = this.f4463b;
        int i5 = i3 + i4;
        int M = C19388s.m32833M(i4 > 0 ? i5 - 1 : i5 - this.f4462a.f4296b.length(), 0, fVar.mo7660c());
        fVar.mo7663f(M, M);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1981a)) {
            return false;
        }
        C1981a aVar = (C1981a) obj;
        return C19383o.m32792b(this.f4462a.f4296b, aVar.f4462a.f4296b) && this.f4463b == aVar.f4463b;
    }

    public final int hashCode() {
        return (this.f4462a.f4296b.hashCode() * 31) + this.f4463b;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("CommitTextCommand(text='");
        h.append(this.f4462a.f4296b);
        h.append("', newCursorPosition=");
        return C0073e.m208h(h, this.f4463b, ')');
    }
}
