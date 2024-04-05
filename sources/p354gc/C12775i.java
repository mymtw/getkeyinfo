package p354gc;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;

/* renamed from: gc.i */
public final class C12775i {

    /* renamed from: a */
    public final Long f28228a;

    /* renamed from: b */
    public String f28229b;

    /* renamed from: c */
    public String f28230c;

    /* renamed from: d */
    public String f28231d;

    /* renamed from: e */
    public String f28232e;

    public C12775i() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, 31);
    }

    public C12775i(Long l, String str, String str2, String str3, String str4) {
        C0391c.m1060g(str, "title", str2, "subtitle", str3, "imageUrl", str4, "url");
        this.f28228a = l;
        this.f28229b = str;
        this.f28230c = str2;
        this.f28231d = str3;
        this.f28232e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12775i)) {
            return false;
        }
        C12775i iVar = (C12775i) obj;
        return C19383o.m32792b(this.f28228a, iVar.f28228a) && C19383o.m32792b(this.f28229b, iVar.f28229b) && C19383o.m32792b(this.f28230c, iVar.f28230c) && C19383o.m32792b(this.f28231d, iVar.f28231d) && C19383o.m32792b(this.f28232e, iVar.f28232e);
    }

    public final int hashCode() {
        Long l = this.f28228a;
        return this.f28232e.hashCode() + C0023f.m105e(this.f28231d, C0023f.m105e(this.f28230c, C0023f.m105e(this.f28229b, (l == null ? 0 : l.hashCode()) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("LinkCardUiModel(listingId=");
        h.append(this.f28228a);
        h.append(", title=");
        h.append(this.f28229b);
        h.append(", subtitle=");
        h.append(this.f28230c);
        h.append(", imageUrl=");
        h.append(this.f28231d);
        h.append(", url=");
        return C0391c.m1057c(h, this.f28232e, ')');
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12775i(Long l, String str, String str2, String str3, String str4, int i) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
