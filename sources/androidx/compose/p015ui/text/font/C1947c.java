package androidx.compose.p015ui.text.font;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;

/* renamed from: androidx.compose.ui.text.font.c */
public final class C1947c implements C1964r {

    /* renamed from: b */
    public final int f4395b;

    public C1947c(int i) {
        this.f4395b = i;
    }

    /* renamed from: a */
    public final C1959m mo7530a(C1959m mVar) {
        C19383o.m32797g(mVar, "fontWeight");
        int i = this.f4395b;
        return (i == 0 || i == Integer.MAX_VALUE) ? mVar : new C1959m(C19388s.m32833M(mVar.f4417b + i, 1, 1000));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1947c) && this.f4395b == ((C1947c) obj).f4395b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f4395b);
    }

    public final String toString() {
        return C0073e.m208h(C0072d.m201h("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f4395b, ')');
    }
}
