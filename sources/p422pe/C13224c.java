package p422pe;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

/* renamed from: pe.c */
public final class C13224c {

    /* renamed from: a */
    public final String f29068a;

    /* renamed from: b */
    public final String f29069b;

    /* renamed from: c */
    public final String f29070c;

    public C13224c(String str, String str2, String str3) {
        C0048b.m167f(str, "displayLocation", str2, "loggingKey", str3, "data");
        this.f29068a = str;
        this.f29069b = str2;
        this.f29070c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13224c)) {
            return false;
        }
        C13224c cVar = (C13224c) obj;
        return C19383o.m32792b(this.f29068a, cVar.f29068a) && C19383o.m32792b(this.f29069b, cVar.f29069b) && C19383o.m32792b(this.f29070c, cVar.f29070c);
    }

    public final int hashCode() {
        return this.f29070c.hashCode() + C0023f.m105e(this.f29069b, this.f29068a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SearchImpressionDbModel(displayLocation=");
        h.append(this.f29068a);
        h.append(", loggingKey=");
        h.append(this.f29069b);
        h.append(", data=");
        return C0391c.m1057c(h, this.f29070c, ')');
    }
}
