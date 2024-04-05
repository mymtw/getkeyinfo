package androidx.compose.p015ui.graphics;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.layout.C1686i0;
import androidx.compose.p015ui.layout.C1702p;
import androidx.compose.p015ui.layout.C1710u;
import androidx.compose.p015ui.layout.C1712w;
import androidx.compose.p015ui.layout.C1713x;
import androidx.compose.p015ui.platform.C1862p0;
import androidx.compose.p015ui.platform.InspectableValueKt;
import kotlin.C19356i;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import p003a2.C0023f;
import p010a9.C0048b;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier */
public final class SimpleGraphicsLayerModifier extends C1862p0 implements C1702p {

    /* renamed from: c */
    public final float f3202c;

    /* renamed from: d */
    public final float f3203d;

    /* renamed from: e */
    public final float f3204e;

    /* renamed from: f */
    public final float f3205f;

    /* renamed from: g */
    public final float f3206g;

    /* renamed from: h */
    public final float f3207h;

    /* renamed from: i */
    public final float f3208i;

    /* renamed from: j */
    public final float f3209j;

    /* renamed from: k */
    public final float f3210k;

    /* renamed from: l */
    public final float f3211l;

    /* renamed from: m */
    public final long f3212m;

    /* renamed from: n */
    public final C1530k0 f3213n;

    /* renamed from: o */
    public final boolean f3214o;

    /* renamed from: p */
    public final C1520f0 f3215p;

    /* renamed from: q */
    public final long f3216q;

    /* renamed from: r */
    public final long f3217r;

    /* renamed from: s */
    public final C19857l<C1549v, C19394m> f3218s;

    public SimpleGraphicsLayerModifier() {
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SimpleGraphicsLayerModifier(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C1530k0 k0Var, boolean z, C1520f0 f0Var, long j2, long j3) {
        super(InspectableValueKt.f4032a);
        this.f3202c = f;
        this.f3203d = f2;
        this.f3204e = f3;
        this.f3205f = f4;
        this.f3206g = f5;
        this.f3207h = f6;
        this.f3208i = f7;
        this.f3209j = f8;
        this.f3210k = f9;
        this.f3211l = f10;
        this.f3212m = j;
        this.f3213n = k0Var;
        this.f3214o = z;
        this.f3215p = f0Var;
        this.f3216q = j2;
        this.f3217r = j3;
        this.f3218s = new SimpleGraphicsLayerModifier$layerBlock$1(this);
    }

    public final boolean equals(Object obj) {
        SimpleGraphicsLayerModifier simpleGraphicsLayerModifier = obj instanceof SimpleGraphicsLayerModifier ? (SimpleGraphicsLayerModifier) obj : null;
        if (simpleGraphicsLayerModifier == null) {
            return false;
        }
        if (!(this.f3202c == simpleGraphicsLayerModifier.f3202c)) {
            return false;
        }
        if (!(this.f3203d == simpleGraphicsLayerModifier.f3203d)) {
            return false;
        }
        if (!(this.f3204e == simpleGraphicsLayerModifier.f3204e)) {
            return false;
        }
        if (!(this.f3205f == simpleGraphicsLayerModifier.f3205f)) {
            return false;
        }
        if (!(this.f3206g == simpleGraphicsLayerModifier.f3206g)) {
            return false;
        }
        if (!(this.f3207h == simpleGraphicsLayerModifier.f3207h)) {
            return false;
        }
        if (!(this.f3208i == simpleGraphicsLayerModifier.f3208i)) {
            return false;
        }
        if (!(this.f3209j == simpleGraphicsLayerModifier.f3209j)) {
            return false;
        }
        if (!(this.f3210k == simpleGraphicsLayerModifier.f3210k)) {
            return false;
        }
        if (!(this.f3211l == simpleGraphicsLayerModifier.f3211l)) {
            return false;
        }
        long j = this.f3212m;
        long j2 = simpleGraphicsLayerModifier.f3212m;
        int i = C1540p0.f3338c;
        return ((j > j2 ? 1 : (j == j2 ? 0 : -1)) == 0) && C19383o.m32792b(this.f3213n, simpleGraphicsLayerModifier.f3213n) && this.f3214o == simpleGraphicsLayerModifier.f3214o && C19383o.m32792b(this.f3215p, simpleGraphicsLayerModifier.f3215p) && C1545s.m3357c(this.f3216q, simpleGraphicsLayerModifier.f3216q) && C1545s.m3357c(this.f3217r, simpleGraphicsLayerModifier.f3217r);
    }

    public final int hashCode() {
        int c = C0023f.m104c(this.f3211l, C0023f.m104c(this.f3210k, C0023f.m104c(this.f3209j, C0023f.m104c(this.f3208i, C0023f.m104c(this.f3207h, C0023f.m104c(this.f3206g, C0023f.m104c(this.f3205f, C0023f.m104c(this.f3204e, C0023f.m104c(this.f3203d, Float.hashCode(this.f3202c) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        long j = this.f3212m;
        int i = C1540p0.f3338c;
        int hashCode = (Boolean.hashCode(this.f3214o) + ((this.f3213n.hashCode() + C0071c.m190b(j, c, 31)) * 31)) * 31;
        C1520f0 f0Var = this.f3215p;
        int hashCode2 = f0Var != null ? f0Var.hashCode() : 0;
        long j2 = this.f3216q;
        int i2 = C1545s.f3365j;
        return C19356i.m32678a(this.f3217r) + C13983i.m21487f(j2, (hashCode + hashCode2) * 31, 31);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("SimpleGraphicsLayerModifier(scaleX=");
        h.append(this.f3202c);
        h.append(", scaleY=");
        h.append(this.f3203d);
        h.append(", alpha = ");
        h.append(this.f3204e);
        h.append(", translationX=");
        h.append(this.f3205f);
        h.append(", translationY=");
        h.append(this.f3206g);
        h.append(", shadowElevation=");
        h.append(this.f3207h);
        h.append(", rotationX=");
        h.append(this.f3208i);
        h.append(", rotationY=");
        h.append(this.f3209j);
        h.append(", rotationZ=");
        h.append(this.f3210k);
        h.append(", cameraDistance=");
        h.append(this.f3211l);
        h.append(", transformOrigin=");
        h.append(C1540p0.m3343b(this.f3212m));
        h.append(", shape=");
        h.append(this.f3213n);
        h.append(", clip=");
        h.append(this.f3214o);
        h.append(", renderEffect=");
        h.append(this.f3215p);
        h.append(", ambientShadowColor=");
        C0048b.m165d(this.f3216q, h, ", spotShadowColor=");
        h.append(C1545s.m3363i(this.f3217r));
        h.append(')');
        return h.toString();
    }

    /* renamed from: v */
    public final C1712w mo3271v(C1713x xVar, C1710u uVar, long j) {
        C19383o.m32797g(xVar, "$this$measure");
        C19383o.m32797g(uVar, "measurable");
        C1686i0 J = uVar.mo6665J(j);
        return xVar.mo4387Z(J.f3722b, J.f3723c, C19294b0.m32559p0(), new SimpleGraphicsLayerModifier$measure$1(J, this));
    }
}
