package androidx.compose.animation;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.core.C0454t;
import androidx.compose.p015ui.C1428a;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p174m0.C7290i;
import p753kq.C19857l;

/* renamed from: androidx.compose.animation.f */
public final class C0470f {

    /* renamed from: a */
    public final C1428a f1207a;

    /* renamed from: b */
    public final C19857l<C7290i, C7290i> f1208b;

    /* renamed from: c */
    public final C0454t<C7290i> f1209c;

    /* renamed from: d */
    public final boolean f1210d;

    public C0470f(C0454t tVar, C1428a aVar, C19857l lVar, boolean z) {
        C19383o.m32797g(aVar, ResponseConstants.ALIGNMENT);
        C19383o.m32797g(lVar, ResponseConstants.SIZE);
        C19383o.m32797g(tVar, "animationSpec");
        this.f1207a = aVar;
        this.f1208b = lVar;
        this.f1209c = tVar;
        this.f1210d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0470f)) {
            return false;
        }
        C0470f fVar = (C0470f) obj;
        return C19383o.m32792b(this.f1207a, fVar.f1207a) && C19383o.m32792b(this.f1208b, fVar.f1208b) && C19383o.m32792b(this.f1209c, fVar.f1209c) && this.f1210d == fVar.f1210d;
    }

    public final int hashCode() {
        int hashCode = this.f1208b.hashCode();
        int hashCode2 = (this.f1209c.hashCode() + ((hashCode + (this.f1207a.hashCode() * 31)) * 31)) * 31;
        boolean z = this.f1210d;
        if (z) {
            z = true;
        }
        return hashCode2 + (z ? 1 : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("ChangeSize(alignment=");
        h.append(this.f1207a);
        h.append(", size=");
        h.append(this.f1208b);
        h.append(", animationSpec=");
        h.append(this.f1209c);
        h.append(", clip=");
        return C0391c.m1058d(h, this.f1210d, ')');
    }
}
