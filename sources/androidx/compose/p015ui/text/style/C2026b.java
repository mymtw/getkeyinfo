package androidx.compose.p015ui.text.style;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.graphics.C1545s;
import kotlin.C19356i;

/* renamed from: androidx.compose.ui.text.style.b */
public final class C2026b implements TextDrawStyle {

    /* renamed from: a */
    public final long f4604a;

    public C2026b(long j) {
        this.f4604a = j;
        if (!(j != C1545s.f3364i)) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextDrawStyle.Unspecified instead.".toString());
        }
    }

    /* renamed from: a */
    public final long mo7763a() {
        return this.f4604a;
    }

    /* renamed from: d */
    public final void mo7766d() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2026b) && C1545s.m3357c(this.f4604a, ((C2026b) obj).f4604a);
    }

    public final int hashCode() {
        long j = this.f4604a;
        int i = C1545s.f3365j;
        return C19356i.m32678a(j);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ColorStyle(value=");
        h.append(C1545s.m3363i(this.f4604a));
        h.append(')');
        return h.toString();
    }
}
