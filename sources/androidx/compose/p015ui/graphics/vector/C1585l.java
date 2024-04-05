package androidx.compose.p015ui.graphics.vector;

import android.support.p013v4.media.C0069a;
import androidx.compose.p015ui.graphics.C1533m;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import p003a2.C0023f;
import p504ai.C13983i;

/* renamed from: androidx.compose.ui.graphics.vector.l */
public final class C1585l extends C1584k {

    /* renamed from: b */
    public final String f3539b;

    /* renamed from: c */
    public final List<C1556d> f3540c;

    /* renamed from: d */
    public final int f3541d;

    /* renamed from: e */
    public final C1533m f3542e;

    /* renamed from: f */
    public final float f3543f;

    /* renamed from: g */
    public final C1533m f3544g;

    /* renamed from: h */
    public final float f3545h;

    /* renamed from: i */
    public final float f3546i;

    /* renamed from: j */
    public final int f3547j;

    /* renamed from: k */
    public final int f3548k;

    /* renamed from: l */
    public final float f3549l;

    /* renamed from: m */
    public final float f3550m;

    /* renamed from: n */
    public final float f3551n;

    /* renamed from: o */
    public final float f3552o;

    public C1585l(String str, List list, int i, C1533m mVar, float f, C1533m mVar2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f3539b = str;
        this.f3540c = list;
        this.f3541d = i;
        this.f3542e = mVar;
        this.f3543f = f;
        this.f3544g = mVar2;
        this.f3545h = f2;
        this.f3546i = f3;
        this.f3547j = i2;
        this.f3548k = i3;
        this.f3549l = f4;
        this.f3550m = f5;
        this.f3551n = f6;
        this.f3552o = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C19383o.m32792b(C19386q.m32807a(C1585l.class), C19386q.m32807a(obj.getClass()))) {
            return false;
        }
        C1585l lVar = (C1585l) obj;
        if (!C19383o.m32792b(this.f3539b, lVar.f3539b) || !C19383o.m32792b(this.f3542e, lVar.f3542e)) {
            return false;
        }
        if (!(this.f3543f == lVar.f3543f) || !C19383o.m32792b(this.f3544g, lVar.f3544g)) {
            return false;
        }
        if (!(this.f3545h == lVar.f3545h)) {
            return false;
        }
        if (!(this.f3546i == lVar.f3546i)) {
            return false;
        }
        if (!(this.f3547j == lVar.f3547j)) {
            return false;
        }
        if (!(this.f3548k == lVar.f3548k)) {
            return false;
        }
        if (!(this.f3549l == lVar.f3549l)) {
            return false;
        }
        if (!(this.f3550m == lVar.f3550m)) {
            return false;
        }
        if (!(this.f3551n == lVar.f3551n)) {
            return false;
        }
        if (!(this.f3552o == lVar.f3552o)) {
            return false;
        }
        return (this.f3541d == lVar.f3541d) && C19383o.m32792b(this.f3540c, lVar.f3540c);
    }

    public final int hashCode() {
        int g = C13983i.m21488g(this.f3540c, this.f3539b.hashCode() * 31, 31);
        C1533m mVar = this.f3542e;
        int i = 0;
        int c = C0023f.m104c(this.f3543f, (g + (mVar != null ? mVar.hashCode() : 0)) * 31, 31);
        C1533m mVar2 = this.f3544g;
        if (mVar2 != null) {
            i = mVar2.hashCode();
        }
        return Integer.hashCode(this.f3541d) + C0023f.m104c(this.f3552o, C0023f.m104c(this.f3551n, C0023f.m104c(this.f3550m, C0023f.m104c(this.f3549l, C0069a.m170a(this.f3548k, C0069a.m170a(this.f3547j, C0023f.m104c(this.f3546i, C0023f.m104c(this.f3545h, (c + i) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
