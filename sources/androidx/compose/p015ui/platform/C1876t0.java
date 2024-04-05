package androidx.compose.p015ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.os.Build;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1520f0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1539p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.t0 */
public final class C1876t0 implements C1836h0 {

    /* renamed from: g */
    public static boolean f4152g = true;

    /* renamed from: a */
    public final RenderNode f4153a;

    /* renamed from: b */
    public int f4154b;

    /* renamed from: c */
    public int f4155c;

    /* renamed from: d */
    public int f4156d;

    /* renamed from: e */
    public int f4157e;

    /* renamed from: f */
    public boolean f4158f;

    public C1876t0(AndroidComposeView androidComposeView) {
        C19383o.m32797g(androidComposeView, "ownerView");
        RenderNode create = RenderNode.create("Compose", androidComposeView);
        C19383o.m32796f(create, "create(\"Compose\", ownerView)");
        this.f4153a = create;
        if (f4152g) {
            create.setScaleX(create.getScaleX());
            create.setScaleY(create.getScaleY());
            create.setTranslationX(create.getTranslationX());
            create.setTranslationY(create.getTranslationY());
            create.setElevation(create.getElevation());
            create.setRotation(create.getRotation());
            create.setRotationX(create.getRotationX());
            create.setRotationY(create.getRotationY());
            create.setCameraDistance(create.getCameraDistance());
            create.setPivotX(create.getPivotX());
            create.setPivotY(create.getPivotY());
            create.setClipToOutline(create.getClipToOutline());
            create.setClipToBounds(false);
            create.setAlpha(create.getAlpha());
            create.isValid();
            create.setLeftTopRightBottom(0, 0, 0, 0);
            create.offsetLeftAndRight(0);
            create.offsetTopAndBottom(0);
            if (Build.VERSION.SDK_INT >= 28) {
                C1890y0 y0Var = C1890y0.f4169a;
                y0Var.mo7293c(create, y0Var.mo7291a(create));
                y0Var.mo7294d(create, y0Var.mo7292b(create));
            }
            C1888x0.f4168a.mo7290a(create);
            f4152g = false;
        }
    }

    /* renamed from: A */
    public final void mo7225A(float f) {
        this.f4153a.setPivotY(f);
    }

    /* renamed from: B */
    public final void mo7226B(Outline outline) {
        this.f4153a.setOutline(outline);
    }

    /* renamed from: C */
    public final void mo7227C(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1890y0.f4169a.mo7293c(this.f4153a, i);
        }
    }

    /* renamed from: D */
    public final int mo7228D() {
        return this.f4156d;
    }

    /* renamed from: E */
    public final void mo7229E(boolean z) {
        this.f4153a.setClipToOutline(z);
    }

    /* renamed from: F */
    public final void mo7230F(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            C1890y0.f4169a.mo7294d(this.f4153a, i);
        }
    }

    /* renamed from: G */
    public final float mo7231G() {
        return this.f4153a.getElevation();
    }

    /* renamed from: a */
    public final void mo7232a(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f4153a);
    }

    /* renamed from: b */
    public final int mo7233b() {
        return this.f4154b;
    }

    /* renamed from: c */
    public final void mo7234c(C1539p pVar, C1492b0 b0Var, C19857l<? super C1537o, C19394m> lVar) {
        C19383o.m32797g(pVar, "canvasHolder");
        Canvas start = this.f4153a.start(this.f4156d - this.f4154b, this.f4157e - this.f4155c);
        C19383o.m32796f(start, "renderNode.start(width, height)");
        Canvas y = pVar.mo6384a().mo6271y();
        pVar.mo6384a().mo6272z(start);
        C1491b a = pVar.mo6384a();
        if (b0Var != null) {
            a.mo6264r();
            a.mo6259k(b0Var, 1);
        }
        lVar.invoke(a);
        if (b0Var != null) {
            a.mo6261m();
        }
        pVar.mo6384a().mo6272z(y);
        this.f4153a.end(start);
    }

    /* renamed from: d */
    public final void mo7235d(float f) {
        this.f4153a.setTranslationY(f);
    }

    /* renamed from: e */
    public final void mo7236e(boolean z) {
        this.f4158f = z;
        this.f4153a.setClipToBounds(z);
    }

    /* renamed from: f */
    public final boolean mo7237f(int i, int i2, int i3, int i4) {
        this.f4154b = i;
        this.f4155c = i2;
        this.f4156d = i3;
        this.f4157e = i4;
        return this.f4153a.setLeftTopRightBottom(i, i2, i3, i4);
    }

    /* renamed from: g */
    public final void mo7238g(float f) {
        this.f4153a.setScaleX(f);
    }

    public final float getAlpha() {
        return this.f4153a.getAlpha();
    }

    public final int getHeight() {
        return this.f4157e - this.f4155c;
    }

    public final int getWidth() {
        return this.f4156d - this.f4154b;
    }

    /* renamed from: h */
    public final void mo7242h(C1520f0 f0Var) {
    }

    /* renamed from: i */
    public final void mo7243i() {
        C1888x0.f4168a.mo7290a(this.f4153a);
    }

    /* renamed from: j */
    public final void mo7244j(float f) {
        this.f4153a.setCameraDistance(-f);
    }

    /* renamed from: k */
    public final void mo7245k(float f) {
        this.f4153a.setRotationX(f);
    }

    /* renamed from: l */
    public final void mo7246l(float f) {
        this.f4153a.setRotationY(f);
    }

    /* renamed from: m */
    public final void mo7247m(float f) {
        this.f4153a.setElevation(f);
    }

    /* renamed from: n */
    public final void mo7248n(float f) {
        this.f4153a.setRotation(f);
    }

    /* renamed from: o */
    public final void mo7249o(float f) {
        this.f4153a.setScaleY(f);
    }

    /* renamed from: p */
    public final void mo7250p(int i) {
        this.f4155c += i;
        this.f4157e += i;
        this.f4153a.offsetTopAndBottom(i);
    }

    /* renamed from: q */
    public final boolean mo7251q() {
        return this.f4153a.isValid();
    }

    /* renamed from: r */
    public final boolean mo7252r() {
        return this.f4153a.setHasOverlappingRendering(true);
    }

    /* renamed from: s */
    public final boolean mo7253s() {
        return this.f4158f;
    }

    public final void setAlpha(float f) {
        this.f4153a.setAlpha(f);
    }

    /* renamed from: t */
    public final int mo7255t() {
        return this.f4155c;
    }

    /* renamed from: u */
    public final void mo7256u(float f) {
        this.f4153a.setTranslationX(f);
    }

    /* renamed from: v */
    public final boolean mo7257v() {
        return this.f4153a.getClipToOutline();
    }

    /* renamed from: w */
    public final void mo7258w(Matrix matrix) {
        C19383o.m32797g(matrix, "matrix");
        this.f4153a.getMatrix(matrix);
    }

    /* renamed from: x */
    public final void mo7259x(int i) {
        this.f4154b += i;
        this.f4156d += i;
        this.f4153a.offsetLeftAndRight(i);
    }

    /* renamed from: y */
    public final int mo7260y() {
        return this.f4157e;
    }

    /* renamed from: z */
    public final void mo7261z(float f) {
        this.f4153a.setPivotX(f);
    }
}
