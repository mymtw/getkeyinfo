package p426qa;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: qa.c */
public final class C13277c {

    /* renamed from: a */
    public final String f29181a;

    /* renamed from: b */
    public final String f29182b;

    /* renamed from: c */
    public final String f29183c;

    public C13277c(String str, String str2, String str3) {
        C19383o.m32797g(str, "type");
        this.f29181a = str;
        this.f29182b = str2;
        this.f29183c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13277c)) {
            return false;
        }
        C13277c cVar = (C13277c) obj;
        return C19383o.m32792b(this.f29181a, cVar.f29181a) && C19383o.m32792b(this.f29182b, cVar.f29182b) && C19383o.m32792b(this.f29183c, cVar.f29183c);
    }

    public final int hashCode() {
        return this.f29183c.hashCode() + C0023f.m105e(this.f29182b, this.f29181a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("NotificationData(type=");
        h.append(this.f29181a);
        h.append(", userDisplayName=");
        h.append(this.f29182b);
        h.append(", objectId=");
        return C0391c.m1057c(h, this.f29183c, ')');
    }
}
