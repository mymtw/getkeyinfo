package androidx.compose.p015ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.os.Build;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1493c;
import androidx.compose.p015ui.graphics.C1516e;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1520f0;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1539p;
import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.p015ui.node.C1749o;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p174m0.C7282b;
import p174m0.C7287g;
import p174m0.C7290i;
import p288y.C8342b;
import p288y.C8343c;
import p288y.C8347f;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.RenderNodeLayer */
public final class RenderNodeLayer implements C1749o {

    /* renamed from: n */
    public static final C19861p<C1836h0, Matrix, C19394m> f4036n = RenderNodeLayer$Companion$getMatrix$1.INSTANCE;

    /* renamed from: b */
    public final AndroidComposeView f4037b;

    /* renamed from: c */
    public C19857l<? super C1537o, C19394m> f4038c;

    /* renamed from: d */
    public C19846a<C19394m> f4039d;

    /* renamed from: e */
    public boolean f4040e;

    /* renamed from: f */
    public final C1873s0 f4041f;

    /* renamed from: g */
    public boolean f4042g;

    /* renamed from: h */
    public boolean f4043h;

    /* renamed from: i */
    public C1516e f4044i;

    /* renamed from: j */
    public final C1865q0<C1836h0> f4045j = new C1865q0<>(f4036n);

    /* renamed from: k */
    public final C1539p f4046k = new C1539p();

    /* renamed from: l */
    public long f4047l = C1540p0.f3337b;

    /* renamed from: m */
    public final C1836h0 f4048m;

    public RenderNodeLayer(AndroidComposeView androidComposeView, C19857l<? super C1537o, C19394m> lVar, C19846a<C19394m> aVar) {
        C19383o.m32797g(androidComposeView, "ownerView");
        C19383o.m32797g(lVar, "drawBlock");
        C19383o.m32797g(aVar, "invalidateParentLayer");
        this.f4037b = androidComposeView;
        this.f4038c = lVar;
        this.f4039d = aVar;
        this.f4041f = new C1873s0(androidComposeView.getDensity());
        C1836h0 u0Var = Build.VERSION.SDK_INT >= 29 ? new C1879u0(androidComposeView) : new C1876t0(androidComposeView);
        u0Var.mo7252r();
        this.f4048m = u0Var;
    }

    /* renamed from: a */
    public final void mo7140a(boolean z) {
        if (z != this.f4040e) {
            this.f4040e = z;
            this.f4037b.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    public final void destroy() {
        if (this.f4048m.mo7251q()) {
            this.f4048m.mo7243i();
        }
        this.f4038c = null;
        this.f4039d = null;
        this.f4042g = true;
        mo7140a(false);
        this.f4037b.requestClearInvalidObservations();
        this.f4037b.recycle$ui_release(this);
    }

    public final void drawLayer(C1537o oVar) {
        C19383o.m32797g(oVar, "canvas");
        Canvas canvas = C1493c.f3222a;
        Canvas canvas2 = ((C1491b) oVar).f3219a;
        boolean z = false;
        if (canvas2.isHardwareAccelerated()) {
            updateDisplayList();
            if (this.f4048m.mo7231G() > 0.0f) {
                z = true;
            }
            this.f4043h = z;
            if (z) {
                oVar.mo6262o();
            }
            this.f4048m.mo7232a(canvas2);
            if (this.f4043h) {
                oVar.mo6265s();
                return;
            }
            return;
        }
        float b = (float) this.f4048m.mo7233b();
        float t = (float) this.f4048m.mo7255t();
        float D = (float) this.f4048m.mo7228D();
        float y = (float) this.f4048m.mo7260y();
        if (this.f4048m.getAlpha() < 1.0f) {
            C1516e eVar = this.f4044i;
            if (eVar == null) {
                eVar = new C1516e();
                this.f4044i = eVar;
            }
            eVar.setAlpha(this.f4048m.getAlpha());
            canvas2.saveLayer(b, t, D, y, eVar.f3288a);
        } else {
            oVar.mo6264r();
        }
        oVar.mo6260l(b, t);
        oVar.mo6266t(this.f4045j.mo7275b(this.f4048m));
        if (this.f4048m.mo7257v() || this.f4048m.mo7253s()) {
            this.f4041f.mo7278a(oVar);
        }
        C19857l<? super C1537o, C19394m> lVar = this.f4038c;
        if (lVar != null) {
            lVar.invoke(oVar);
        }
        oVar.mo6261m();
        mo7140a(false);
    }

    public final void invalidate() {
        if (!this.f4040e && !this.f4042g) {
            this.f4037b.invalidate();
            mo7140a(true);
        }
    }

    /* renamed from: isInLayer-k-4lQ0M  reason: not valid java name */
    public final boolean m34800isInLayerk4lQ0M(long j) {
        float c = C8343c.m16642c(j);
        float d = C8343c.m16643d(j);
        if (this.f4048m.mo7253s()) {
            return 0.0f <= c && c < ((float) this.f4048m.getWidth()) && 0.0f <= d && d < ((float) this.f4048m.getHeight());
        }
        if (this.f4048m.mo7257v()) {
            return this.f4041f.mo7280c(j);
        }
        return true;
    }

    public final void mapBounds(C8342b bVar, boolean z) {
        if (z) {
            float[] a = this.f4045j.mo7274a(this.f4048m);
            if (a == null) {
                bVar.f18291a = 0.0f;
                bVar.f18292b = 0.0f;
                bVar.f18293c = 0.0f;
                bVar.f18294d = 0.0f;
                return;
            }
            C0761x.m1749v0(a, bVar);
            return;
        }
        C0761x.m1749v0(this.f4045j.mo7275b(this.f4048m), bVar);
    }

    /* renamed from: mapOffset-8S9VItk  reason: not valid java name */
    public final long m34801mapOffset8S9VItk(long j, boolean z) {
        if (!z) {
            return C0761x.m1747u0(j, this.f4045j.mo7275b(this.f4048m));
        }
        float[] a = this.f4045j.mo7274a(this.f4048m);
        if (a != null) {
            return C0761x.m1747u0(j, a);
        }
        int i = C8343c.f18298e;
        return C8343c.f18296c;
    }

    /* renamed from: move--gyyYBs  reason: not valid java name */
    public final void m34802movegyyYBs(long j) {
        int b = this.f4048m.mo7233b();
        int t = this.f4048m.mo7255t();
        int i = (int) (j >> 32);
        int b2 = C7287g.m13992b(j);
        if (b != i || t != b2) {
            this.f4048m.mo7259x(i - b);
            this.f4048m.mo7250p(b2 - t);
            C1880u1.f4161a.mo7284a(this.f4037b);
            this.f4045j.mo7276c();
        }
    }

    /* renamed from: resize-ozmzZPI  reason: not valid java name */
    public final void m34803resizeozmzZPI(long j) {
        int i = (int) (j >> 32);
        int b = C7290i.m13995b(j);
        C1836h0 h0Var = this.f4048m;
        long j2 = this.f4047l;
        int i2 = C1540p0.f3338c;
        float f = (float) i;
        h0Var.mo7261z(Float.intBitsToFloat((int) (j2 >> 32)) * f);
        float f2 = (float) b;
        this.f4048m.mo7225A(C1540p0.m3342a(this.f4047l) * f2);
        C1836h0 h0Var2 = this.f4048m;
        if (h0Var2.mo7237f(h0Var2.mo7233b(), this.f4048m.mo7255t(), this.f4048m.mo7233b() + i, this.f4048m.mo7255t() + b)) {
            C1873s0 s0Var = this.f4041f;
            long t = C0114h.m319t(f, f2);
            if (!C8347f.m16653a(s0Var.f4137d, t)) {
                s0Var.f4137d = t;
                s0Var.f4141h = true;
            }
            this.f4048m.mo7226B(this.f4041f.mo7279b());
            if (!this.f4040e && !this.f4042g) {
                this.f4037b.invalidate();
                mo7140a(true);
            }
            this.f4045j.mo7276c();
        }
    }

    public final void reuseLayer(C19857l<? super C1537o, C19394m> lVar, C19846a<C19394m> aVar) {
        C19383o.m32797g(lVar, "drawBlock");
        C19383o.m32797g(aVar, "invalidateParentLayer");
        mo7140a(false);
        this.f4042g = false;
        this.f4043h = false;
        int i = C1540p0.f3338c;
        this.f4047l = C1540p0.f3337b;
        this.f4038c = lVar;
        this.f4039d = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateDisplayList() {
        /*
            r4 = this;
            boolean r0 = r4.f4040e
            if (r0 != 0) goto L_0x000c
            androidx.compose.ui.platform.h0 r0 = r4.f4048m
            boolean r0 = r0.mo7251q()
            if (r0 != 0) goto L_0x0032
        L_0x000c:
            r0 = 0
            r4.mo7140a(r0)
            androidx.compose.ui.platform.h0 r0 = r4.f4048m
            boolean r0 = r0.mo7257v()
            if (r0 == 0) goto L_0x0026
            androidx.compose.ui.platform.s0 r0 = r4.f4041f
            boolean r1 = r0.f4142i
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0026
            r0.mo7282e()
            androidx.compose.ui.graphics.b0 r0 = r0.f4140g
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            kq.l<? super androidx.compose.ui.graphics.o, kotlin.m> r1 = r4.f4038c
            if (r1 == 0) goto L_0x0032
            androidx.compose.ui.platform.h0 r2 = r4.f4048m
            androidx.compose.ui.graphics.p r3 = r4.f4046k
            r2.mo7234c(r3, r0, r1)
        L_0x0032:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.RenderNodeLayer.updateDisplayList():void");
    }

    /* renamed from: updateLayerProperties-NHXXZp8  reason: not valid java name */
    public final void m34804updateLayerPropertiesNHXXZp8(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C1530k0 k0Var, boolean z, C1520f0 f0Var, long j2, long j3, LayoutDirection layoutDirection, C7282b bVar) {
        C19846a<C19394m> aVar;
        long j4 = j;
        C1530k0 k0Var2 = k0Var;
        C19383o.m32797g(k0Var2, "shape");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        this.f4047l = j4;
        boolean z2 = false;
        boolean z3 = this.f4048m.mo7257v() && !(this.f4041f.f4142i ^ true);
        float f11 = f;
        this.f4048m.mo7238g(f);
        float f12 = f2;
        this.f4048m.mo7249o(f2);
        float f13 = f3;
        this.f4048m.setAlpha(f3);
        this.f4048m.mo7256u(f4);
        this.f4048m.mo7235d(f5);
        this.f4048m.mo7247m(f6);
        this.f4048m.mo7227C(C18263b.m30859o0(j2));
        this.f4048m.mo7230F(C18263b.m30859o0(j3));
        this.f4048m.mo7248n(f9);
        this.f4048m.mo7245k(f7);
        this.f4048m.mo7246l(f8);
        this.f4048m.mo7244j(f10);
        C1836h0 h0Var = this.f4048m;
        int i = C1540p0.f3338c;
        h0Var.mo7261z(Float.intBitsToFloat((int) (j4 >> 32)) * ((float) this.f4048m.getWidth()));
        this.f4048m.mo7225A(C1540p0.m3342a(j) * ((float) this.f4048m.getHeight()));
        this.f4048m.mo7229E(z && k0Var2 != C1517e0.f3292a);
        this.f4048m.mo7236e(z && k0Var2 == C1517e0.f3292a);
        this.f4048m.mo7242h(f0Var);
        boolean d = this.f4041f.mo7281d(k0Var, this.f4048m.getAlpha(), this.f4048m.mo7257v(), this.f4048m.mo7231G(), layoutDirection, bVar);
        this.f4048m.mo7226B(this.f4041f.mo7279b());
        if (this.f4048m.mo7257v() && !(!this.f4041f.f4142i)) {
            z2 = true;
        }
        if (z3 == z2 && (!z2 || !d)) {
            C1880u1.f4161a.mo7284a(this.f4037b);
        } else if (!this.f4040e && !this.f4042g) {
            this.f4037b.invalidate();
            mo7140a(true);
        }
        if (!this.f4043h && this.f4048m.mo7231G() > 0.0f && (aVar = this.f4039d) != null) {
            aVar.invoke();
        }
        this.f4045j.mo7276c();
    }
}
