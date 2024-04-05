package p354gc;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.models.apiv3.Alert;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: gc.b */
public final class C12763b {

    /* renamed from: a */
    public final long f28207a;

    /* renamed from: b */
    public final C12784m f28208b;

    /* renamed from: c */
    public final long f28209c;

    /* renamed from: d */
    public final CharSequence f28210d;

    /* renamed from: e */
    public final String f28211e;

    /* renamed from: f */
    public final boolean f28212f;

    /* renamed from: g */
    public final Alert f28213g;

    /* renamed from: h */
    public final C12776j f28214h;

    public C12763b() {
        this(0, (C12784m) null, 0, (CharSequence) null, (String) null, false, (Alert) null, 255);
    }

    public C12763b(long j, C12784m mVar, long j2, CharSequence charSequence, String str, boolean z, Alert alert, C12776j jVar) {
        C19383o.m32797g(mVar, "otherUser");
        C19383o.m32797g(charSequence, "formattedLastUpdatedTime");
        C19383o.m32797g(str, "lastMessage");
        this.f28207a = j;
        this.f28208b = mVar;
        this.f28209c = j2;
        this.f28210d = charSequence;
        this.f28211e = str;
        this.f28212f = z;
        this.f28213g = alert;
        this.f28214h = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12763b)) {
            return false;
        }
        C12763b bVar = (C12763b) obj;
        return this.f28207a == bVar.f28207a && C19383o.m32792b(this.f28208b, bVar.f28208b) && this.f28209c == bVar.f28209c && C19383o.m32792b(this.f28210d, bVar.f28210d) && C19383o.m32792b(this.f28211e, bVar.f28211e) && this.f28212f == bVar.f28212f && C19383o.m32792b(this.f28213g, bVar.f28213g) && C19383o.m32792b(this.f28214h, bVar.f28214h);
    }

    public final int hashCode() {
        int e = C0023f.m105e(this.f28211e, (this.f28210d.hashCode() + C0071c.m190b(this.f28209c, (this.f28208b.hashCode() + (Long.hashCode(this.f28207a) * 31)) * 31, 31)) * 31, 31);
        boolean z = this.f28212f;
        if (z) {
            z = true;
        }
        int i = (e + (z ? 1 : 0)) * 31;
        Alert alert = this.f28213g;
        int i2 = 0;
        int hashCode = (i + (alert == null ? 0 : alert.hashCode())) * 31;
        C12776j jVar = this.f28214h;
        if (jVar != null) {
            i2 = jVar.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ConversationMetadataUiModel(conversationId=");
        h.append(this.f28207a);
        h.append(", otherUser=");
        h.append(this.f28208b);
        h.append(", lastUpdatedTime=");
        h.append(this.f28209c);
        h.append(", formattedLastUpdatedTime=");
        h.append(this.f28210d);
        h.append(", lastMessage=");
        h.append(this.f28211e);
        h.append(", isRead=");
        h.append(this.f28212f);
        h.append(", alert=");
        h.append(this.f28213g);
        h.append(", messageContext=");
        h.append(this.f28214h);
        h.append(')');
        return h.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12763b(long j, C12784m mVar, long j2, CharSequence charSequence, String str, boolean z, Alert alert, int i) {
        this((i & 1) != 0 ? 0 : j, (i & 2) != 0 ? new C12784m((String) null, (String) null, 0, false, 31) : mVar, (i & 4) != 0 ? 0 : j2, (i & 8) != 0 ? "" : charSequence, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : alert, (C12776j) null);
    }
}
