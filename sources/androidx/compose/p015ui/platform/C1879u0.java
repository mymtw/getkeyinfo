package androidx.compose.p015ui.platform;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1520f0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1539p;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.u0 */
public final class C1879u0 implements C1836h0 {

    /* renamed from: a */
    public final RenderNode f4160a = new RenderNode("Compose");

    public C1879u0(AndroidComposeView androidComposeView) {
        C19383o.m32797g(androidComposeView, "ownerView");
    }

    /* renamed from: A */
    public final void mo7225A(float f) {
        this.f4160a.setPivotY(f);
    }

    /* renamed from: B */
    public final void mo7226B(Outline outline) {
        this.f4160a.setOutline(outline);
    }

    /* renamed from: C */
    public final void mo7227C(int i) {
        this.f4160a.setAmbientShadowColor(i);
    }

    /* renamed from: D */
    public final int mo7228D() {
        return this.f4160a.getRight();
    }

    /* renamed from: E */
    public final void mo7229E(boolean z) {
        this.f4160a.setClipToOutline(z);
    }

    /* renamed from: F */
    public final void mo7230F(int i) {
        this.f4160a.setSpotShadowColor(i);
    }

    /* renamed from: G */
    public final float mo7231G() {
        return this.f4160a.getElevation();
    }

    /* renamed from: a */
    public final void mo7232a(Canvas canvas) {
        canvas.drawRenderNode(this.f4160a);
    }

    /* renamed from: b */
    public final int mo7233b() {
        return this.f4160a.getLeft();
    }

    /* renamed from: c */
    public final void mo7234c(C1539p pVar, C1492b0 b0Var, C19857l<? super C1537o, C19394m> lVar) {
        C19383o.m32797g(pVar, "canvasHolder");
        RecordingCanvas beginRecording = this.f4160a.beginRecording();
        C19383o.m32796f(beginRecording, "renderNode.beginRecording()");
        C1491b bVar = pVar.f3336a;
        Canvas canvas = bVar.f3219a;
        bVar.f3219a = beginRecording;
        if (b0Var != null) {
            bVar.mo6264r();
            bVar.mo6259k(b0Var, 1);
        }
        lVar.invoke(bVar);
        if (b0Var != null) {
            bVar.mo6261m();
        }
        pVar.f3336a.mo6272z(canvas);
        this.f4160a.endRecording();
    }

    /* renamed from: d */
    public final void mo7235d(float f) {
        this.f4160a.setTranslationY(f);
    }

    /* renamed from: e */
    public final void mo7236e(boolean z) {
        this.f4160a.setClipToBounds(z);
    }

    /* renamed from: f */
    public final boolean mo7237f(int i, int i2, int i3, int i4) {
        return this.f4160a.setPosition(i, i2, i3, i4);
    }

    /* renamed from: g */
    public final void mo7238g(float f) {
        this.f4160a.setScaleX(f);
    }

    public final float getAlpha() {
        return this.f4160a.getAlpha();
    }

    public final int getHeight() {
        return this.f4160a.getHeight();
    }

    public final int getWidth() {
        return this.f4160a.getWidth();
    }

    /* renamed from: h */
    public final void mo7242h(C1520f0 f0Var) {
        if (Build.VERSION.SDK_INT >= 31) {
            C1885w0.f4165a.mo7288a(this.f4160a, f0Var);
        }
    }

    /* renamed from: i */
    public final void mo7243i() {
        this.f4160a.discardDisplayList();
    }

    /* renamed from: j */
    public final void mo7244j(float f) {
        this.f4160a.setCameraDistance(f);
    }

    /* renamed from: k */
    public final void mo7245k(float f) {
        this.f4160a.setRotationX(f);
    }

    /* renamed from: l */
    public final void mo7246l(float f) {
        this.f4160a.setRotationY(f);
    }

    /* renamed from: m */
    public final void mo7247m(float f) {
        this.f4160a.setElevation(f);
    }

    /* renamed from: n */
    public final void mo7248n(float f) {
        this.f4160a.setRotationZ(f);
    }

    /* renamed from: o */
    public final void mo7249o(float f) {
        this.f4160a.setScaleY(f);
    }

    /* renamed from: p */
    public final void mo7250p(int i) {
        this.f4160a.offsetTopAndBottom(i);
    }

    /* renamed from: q */
    public final boolean mo7251q() {
        return this.f4160a.hasDisplayList();
    }

    /* renamed from: r */
    public final boolean mo7252r() {
        return this.f4160a.setHasOverlappingRendering(true);
    }

    /* renamed from: s */
    public final boolean mo7253s() {
        return this.f4160a.getClipToBounds();
    }

    public final void setAlpha(float f) {
        this.f4160a.setAlpha(f);
    }

    /* renamed from: t */
    public final int mo7255t() {
        return this.f4160a.getTop();
    }

    /* renamed from: u */
    public final void mo7256u(float f) {
        this.f4160a.setTranslationX(f);
    }

    /* renamed from: v */
    public final boolean mo7257v() {
        return this.f4160a.getClipToOutline();
    }

    /* renamed from: w */
    public final void mo7258w(Matrix matrix) {
        C19383o.m32797g(matrix, "matrix");
        this.f4160a.getMatrix(matrix);
    }

    /* renamed from: x */
    public final void mo7259x(int i) {
        this.f4160a.offsetLeftAndRight(i);
    }

    /* renamed from: y */
    public final int mo7260y() {
        return this.f4160a.getBottom();
    }

    /* renamed from: z */
    public final void mo7261z(float f) {
        this.f4160a.setPivotX(f);
    }
}
