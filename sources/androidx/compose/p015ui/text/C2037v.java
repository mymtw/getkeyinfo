package androidx.compose.p015ui.text;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.v */
public final class C2037v extends C2036u {

    /* renamed from: a */
    public final String f4624a;

    public C2037v(String str) {
        C19383o.m32797g(str, "verbatim");
        this.f4624a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2037v) && C19383o.m32792b(this.f4624a, ((C2037v) obj).f4624a);
    }

    public final int hashCode() {
        return this.f4624a.hashCode();
    }

    public final String toString() {
        return C0391c.m1057c(C0072d.m201h("VerbatimTtsAnnotation(verbatim="), this.f4624a, ')');
    }
}
