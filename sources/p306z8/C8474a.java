package p306z8;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: z8.a */
public final class C8474a {

    /* renamed from: a */
    public final String f18493a;

    /* renamed from: b */
    public final String f18494b;

    /* renamed from: c */
    public final String f18495c;

    /* renamed from: d */
    public final String f18496d;

    /* renamed from: e */
    public final long f18497e;

    /* renamed from: f */
    public final String f18498f;

    public C8474a() {
        this("", "", "", "", 0, "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8474a)) {
            return false;
        }
        C8474a aVar = (C8474a) obj;
        return C19383o.m32792b(this.f18493a, aVar.f18493a) && C19383o.m32792b(this.f18494b, aVar.f18494b) && C19383o.m32792b(this.f18495c, aVar.f18495c) && C19383o.m32792b(this.f18496d, aVar.f18496d) && this.f18497e == aVar.f18497e && C19383o.m32792b(this.f18498f, aVar.f18498f);
    }

    public final int hashCode() {
        return this.f18498f.hashCode() + C0071c.m190b(this.f18497e, C0023f.m105e(this.f18496d, C0023f.m105e(this.f18495c, C0023f.m105e(this.f18494b, this.f18493a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConfigDeepLink(scheme=");
        h.append(this.f18493a);
        h.append(", signature=");
        h.append(this.f18494b);
        h.append(", authority=");
        h.append(this.f18495c);
        h.append(", data=");
        h.append(this.f18496d);
        h.append(", timestamp=");
        h.append(this.f18497e);
        h.append(", query=");
        return C0391c.m1057c(h, this.f18498f, ')');
    }

    public C8474a(String str, String str2, String str3, String str4, long j, String str5) {
        C19383o.m32797g(str, "scheme");
        C19383o.m32797g(str2, "signature");
        C19383o.m32797g(str3, "authority");
        C19383o.m32797g(str4, "data");
        C19383o.m32797g(str5, "query");
        this.f18493a = str;
        this.f18494b = str2;
        this.f18495c = str3;
        this.f18496d = str4;
        this.f18497e = j;
        this.f18498f = str5;
    }
}
