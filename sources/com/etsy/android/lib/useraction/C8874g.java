package com.etsy.android.lib.useraction;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: com.etsy.android.lib.useraction.g */
public final class C8874g {

    /* renamed from: a */
    public final String f19604a;

    /* renamed from: b */
    public final String f19605b;

    /* renamed from: c */
    public final String f19606c;

    /* renamed from: d */
    public final long f19607d;

    /* renamed from: e */
    public final String f19608e;

    /* renamed from: f */
    public final int f19609f;

    public C8874g(String str, String str2, String str3, long j, String str4, int i) {
        C0391c.m1060g(str, ResponseConstants.ACTION, str2, ResponseConstants.SUBJECT, str3, "subjectId", str4, "userId");
        this.f19604a = str;
        this.f19605b = str2;
        this.f19606c = str3;
        this.f19607d = j;
        this.f19608e = str4;
        this.f19609f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8874g)) {
            return false;
        }
        C8874g gVar = (C8874g) obj;
        return C19383o.m32792b(this.f19604a, gVar.f19604a) && C19383o.m32792b(this.f19605b, gVar.f19605b) && C19383o.m32792b(this.f19606c, gVar.f19606c) && this.f19607d == gVar.f19607d && C19383o.m32792b(this.f19608e, gVar.f19608e) && this.f19609f == gVar.f19609f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19609f) + C0023f.m105e(this.f19608e, C0071c.m190b(this.f19607d, C0023f.m105e(this.f19606c, C0023f.m105e(this.f19605b, this.f19604a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("UserActionDbModel(action=");
        h.append(this.f19604a);
        h.append(", subject=");
        h.append(this.f19605b);
        h.append(", subjectId=");
        h.append(this.f19606c);
        h.append(", timestamp=");
        h.append(this.f19607d);
        h.append(", userId=");
        h.append(this.f19608e);
        h.append(", userActionId=");
        return C0073e.m208h(h, this.f19609f, ')');
    }
}
