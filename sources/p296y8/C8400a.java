package p296y8;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: y8.a */
public final class C8400a {

    /* renamed from: a */
    public final String f18415a;

    /* renamed from: b */
    public final String f18416b;

    public C8400a(String str, String str2) {
        C19383o.m32797g(str, "displayLocation");
        C19383o.m32797g(str2, "loggingKey");
        this.f18415a = str;
        this.f18416b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8400a)) {
            return false;
        }
        C8400a aVar = (C8400a) obj;
        return C19383o.m32792b(this.f18415a, aVar.f18415a) && C19383o.m32792b(this.f18416b, aVar.f18416b);
    }

    public final int hashCode() {
        return this.f18416b.hashCode() + (this.f18415a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AdImpression(displayLocation=");
        h.append(this.f18415a);
        h.append(", loggingKey=");
        return C0391c.m1057c(h, this.f18416b, ')');
    }
}
