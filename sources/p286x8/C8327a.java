package p286x8;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;

/* renamed from: x8.a */
public final class C8327a {

    /* renamed from: a */
    public final int f18282a;

    /* renamed from: b */
    public final String f18283b;

    public C8327a(int i, String str) {
        C19383o.m32797g(str, "loggingKey");
        this.f18282a = i;
        this.f18283b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8327a)) {
            return false;
        }
        C8327a aVar = (C8327a) obj;
        return this.f18282a == aVar.f18282a && C19383o.m32792b(this.f18283b, aVar.f18283b);
    }

    public final int hashCode() {
        return this.f18283b.hashCode() + (Integer.hashCode(this.f18282a) * 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("AdClick(id=");
        h.append(this.f18282a);
        h.append(", loggingKey=");
        return C0391c.m1057c(h, this.f18283b, ')');
    }
}
