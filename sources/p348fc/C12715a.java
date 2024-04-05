package p348fc;

import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import com.etsy.android.lib.models.apiv3.Alert;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p003a2.C0023f;
import p354gc.C12763b;
import p354gc.C12784m;

/* renamed from: fc.a */
public final class C12715a {

    /* renamed from: a */
    public final long f28009a;

    /* renamed from: b */
    public final int f28010b;

    /* renamed from: c */
    public final boolean f28011c;

    /* renamed from: d */
    public final boolean f28012d;

    /* renamed from: e */
    public final String f28013e;

    /* renamed from: f */
    public final String f28014f;

    /* renamed from: g */
    public final long f28015g;

    /* renamed from: h */
    public final long f28016h;

    /* renamed from: i */
    public final String f28017i;

    /* renamed from: j */
    public final String f28018j;

    /* renamed from: k */
    public final String f28019k;

    /* renamed from: l */
    public final boolean f28020l;

    /* renamed from: m */
    public final boolean f28021m;

    /* renamed from: n */
    public final boolean f28022n;

    public C12715a(long j, int i, boolean z, boolean z2, String str, String str2, long j2, long j3, String str3, String str4, String str5, boolean z3, boolean z4, boolean z5) {
        C0391c.m1060g(str2, "lastMessage", str3, "otherUserUsername", str4, "otherUserNameFull", str5, "otherUserAvatarUrl");
        this.f28009a = j;
        this.f28010b = i;
        this.f28011c = z;
        this.f28012d = z2;
        this.f28013e = str;
        this.f28014f = str2;
        this.f28015g = j2;
        this.f28016h = j3;
        this.f28017i = str3;
        this.f28018j = str4;
        this.f28019k = str5;
        this.f28020l = z3;
        this.f28021m = z4;
        this.f28022n = z5;
    }

    /* renamed from: a */
    public final C12763b mo45484a() {
        C12784m mVar = new C12784m(this.f28018j, this.f28019k, this.f28016h, this.f28020l, 4);
        long j = this.f28015g;
        return new C12763b(this.f28009a, mVar, j, C0005b.m39g0(j), this.f28014f, this.f28011c, (Alert) null, 192);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12715a)) {
            return false;
        }
        C12715a aVar = (C12715a) obj;
        return this.f28009a == aVar.f28009a && this.f28010b == aVar.f28010b && this.f28011c == aVar.f28011c && this.f28012d == aVar.f28012d && C19383o.m32792b(this.f28013e, aVar.f28013e) && C19383o.m32792b(this.f28014f, aVar.f28014f) && this.f28015g == aVar.f28015g && this.f28016h == aVar.f28016h && C19383o.m32792b(this.f28017i, aVar.f28017i) && C19383o.m32792b(this.f28018j, aVar.f28018j) && C19383o.m32792b(this.f28019k, aVar.f28019k) && this.f28020l == aVar.f28020l && this.f28021m == aVar.f28021m && this.f28022n == aVar.f28022n;
    }

    public final int hashCode() {
        int a = C0069a.m170a(this.f28010b, Long.hashCode(this.f28009a) * 31, 31);
        boolean z = this.f28011c;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (a + (z ? 1 : 0)) * 31;
        boolean z3 = this.f28012d;
        if (z3) {
            z3 = true;
        }
        int i2 = (i + (z3 ? 1 : 0)) * 31;
        String str = this.f28013e;
        int e = C0023f.m105e(this.f28019k, C0023f.m105e(this.f28018j, C0023f.m105e(this.f28017i, C0071c.m190b(this.f28016h, C0071c.m190b(this.f28015g, C0023f.m105e(this.f28014f, (i2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31), 31);
        boolean z4 = this.f28020l;
        if (z4) {
            z4 = true;
        }
        int i3 = (e + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.f28021m;
        if (z5) {
            z5 = true;
        }
        int i4 = (i3 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f28022n;
        if (!z6) {
            z2 = z6;
        }
        return i4 + (z2 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConversationDatabaseModel(conversationId=");
        h.append(this.f28009a);
        h.append(", messageCount=");
        h.append(this.f28010b);
        h.append(", isRead=");
        h.append(this.f28011c);
        h.append(", hasAttachment=");
        h.append(this.f28012d);
        h.append(", title=");
        h.append(this.f28013e);
        h.append(", lastMessage=");
        h.append(this.f28014f);
        h.append(", lastUpdated=");
        h.append(this.f28015g);
        h.append(", otherUserId=");
        h.append(this.f28016h);
        h.append(", otherUserUsername=");
        h.append(this.f28017i);
        h.append(", otherUserNameFull=");
        h.append(this.f28018j);
        h.append(", otherUserAvatarUrl=");
        h.append(this.f28019k);
        h.append(", otherUserIsGuest=");
        h.append(this.f28020l);
        h.append(", isCustomShop=");
        h.append(this.f28021m);
        h.append(", isCcm=");
        return C0391c.m1058d(h, this.f28022n, ')');
    }
}
