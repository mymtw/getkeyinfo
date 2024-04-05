package androidx.compose.foundation;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1604x;
import kotlin.jvm.internal.C19383o;
import p297z.C8406a;

/* renamed from: androidx.compose.foundation.e */
public final class C0554e {

    /* renamed from: a */
    public C1604x f1300a;

    /* renamed from: b */
    public C1537o f1301b;

    /* renamed from: c */
    public C8406a f1302c;

    /* renamed from: d */
    public C1492b0 f1303d;

    public C0554e() {
        this(0);
    }

    public C0554e(int i) {
        this.f1300a = null;
        this.f1301b = null;
        this.f1302c = null;
        this.f1303d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0554e)) {
            return false;
        }
        C0554e eVar = (C0554e) obj;
        return C19383o.m32792b(this.f1300a, eVar.f1300a) && C19383o.m32792b(this.f1301b, eVar.f1301b) && C19383o.m32792b(this.f1302c, eVar.f1302c) && C19383o.m32792b(this.f1303d, eVar.f1303d);
    }

    public final int hashCode() {
        C1604x xVar = this.f1300a;
        int i = 0;
        int hashCode = (xVar == null ? 0 : xVar.hashCode()) * 31;
        C1537o oVar = this.f1301b;
        int hashCode2 = (hashCode + (oVar == null ? 0 : oVar.hashCode())) * 31;
        C8406a aVar = this.f1302c;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C1492b0 b0Var = this.f1303d;
        if (b0Var != null) {
            i = b0Var.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("BorderCache(imageBitmap=");
        h.append(this.f1300a);
        h.append(", canvas=");
        h.append(this.f1301b);
        h.append(", canvasDrawScope=");
        h.append(this.f1302c);
        h.append(", borderPath=");
        h.append(this.f1303d);
        h.append(')');
        return h.toString();
    }
}
