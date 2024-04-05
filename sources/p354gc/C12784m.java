package p354gc;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;

/* renamed from: gc.m */
public final class C12784m {

    /* renamed from: a */
    public final String f28259a;

    /* renamed from: b */
    public final String f28260b;

    /* renamed from: c */
    public final String f28261c;

    /* renamed from: d */
    public final long f28262d;

    /* renamed from: e */
    public final boolean f28263e;

    /* renamed from: f */
    public final EtsyId f28264f;

    public C12784m() {
        this((String) null, (String) null, 0, false, 31);
    }

    public C12784m(String str, String str2, String str3, long j, boolean z) {
        C0048b.m167f(str, ResponseConstants.DISPLAY_NAME_CAMELCASE, str2, "avatarUrl", str3, ResponseConstants.USERNAME);
        this.f28259a = str;
        this.f28260b = str2;
        this.f28261c = str3;
        this.f28262d = j;
        this.f28263e = z;
        this.f28264f = new EtsyId(j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12784m)) {
            return false;
        }
        C12784m mVar = (C12784m) obj;
        return C19383o.m32792b(this.f28259a, mVar.f28259a) && C19383o.m32792b(this.f28260b, mVar.f28260b) && C19383o.m32792b(this.f28261c, mVar.f28261c) && this.f28262d == mVar.f28262d && this.f28263e == mVar.f28263e;
    }

    public final int hashCode() {
        int b = C0071c.m190b(this.f28262d, C0023f.m105e(this.f28261c, C0023f.m105e(this.f28260b, this.f28259a.hashCode() * 31, 31), 31), 31);
        boolean z = this.f28263e;
        if (z) {
            z = true;
        }
        return b + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("User(displayName=");
        h.append(this.f28259a);
        h.append(", avatarUrl=");
        h.append(this.f28260b);
        h.append(", username=");
        h.append(this.f28261c);
        h.append(", userIdLong=");
        h.append(this.f28262d);
        h.append(", isGuest=");
        return C0391c.m1058d(h, this.f28263e, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C12784m(java.lang.String r10, java.lang.String r11, long r12, boolean r14, int r15) {
        /*
            r9 = this;
            r0 = r15 & 1
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r10
        L_0x0009:
            r10 = r15 & 2
            if (r10 == 0) goto L_0x000f
            r4 = r1
            goto L_0x0010
        L_0x000f:
            r4 = r11
        L_0x0010:
            r10 = r15 & 4
            if (r10 == 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r1 = 0
        L_0x0016:
            r5 = r1
            r10 = r15 & 8
            if (r10 == 0) goto L_0x001d
            r12 = 0
        L_0x001d:
            r6 = r12
            r10 = r15 & 16
            if (r10 == 0) goto L_0x0023
            r14 = 0
        L_0x0023:
            r8 = r14
            r2 = r9
            r2.<init>((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (long) r6, (boolean) r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p354gc.C12784m.<init>(java.lang.String, java.lang.String, long, boolean, int):void");
    }
}
