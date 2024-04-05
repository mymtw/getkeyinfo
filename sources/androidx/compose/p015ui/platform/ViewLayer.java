package androidx.compose.p015ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1492b0;
import androidx.compose.p015ui.graphics.C1517e0;
import androidx.compose.p015ui.graphics.C1520f0;
import androidx.compose.p015ui.graphics.C1530k0;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.graphics.C1539p;
import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.p015ui.node.C1749o;
import androidx.compose.p015ui.unit.LayoutDirection;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
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

/* renamed from: androidx.compose.ui.platform.ViewLayer */
public final class ViewLayer extends View implements C1749o {
    public static final C1796a Companion = new C1796a();
    /* access modifiers changed from: private */
    public static final ViewOutlineProvider OutlineProvider = new ViewLayer$Companion$OutlineProvider$1();
    private static final C19861p<View, Matrix, C19394m> getMatrix = ViewLayer$Companion$getMatrix$1.INSTANCE;
    /* access modifiers changed from: private */
    public static boolean hasRetrievedMethod;
    /* access modifiers changed from: private */
    public static Field recreateDisplayList;
    /* access modifiers changed from: private */
    public static boolean shouldUseDispatchDraw;
    /* access modifiers changed from: private */
    public static Method updateDisplayListIfDirtyMethod;
    private final C1539p canvasHolder = new C1539p();
    private Rect clipBoundsCache;
    private boolean clipToBounds;
    private final DrawChildContainer container;
    private C19857l<? super C1537o, C19394m> drawBlock;
    private boolean drawnWithZ;
    private C19846a<C19394m> invalidateParentLayer;
    private boolean isInvalidated;
    private long mTransformOrigin;
    private final C1865q0<View> matrixCache = new C1865q0<>(getMatrix);
    /* access modifiers changed from: private */
    public final C1873s0 outlineResolver;
    private final AndroidComposeView ownerView;

    /* renamed from: androidx.compose.ui.platform.ViewLayer$a */
    public static final class C1796a {
        @SuppressLint({"BanUncheckedReflection"})
        /* renamed from: a */
        public static void m3952a(View view) {
            Class<String> cls = String.class;
            C19383o.m32797g(view, "view");
            try {
                if (!ViewLayer.hasRetrievedMethod) {
                    ViewLayer.hasRetrievedMethod = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        ViewLayer.updateDisplayListIfDirtyMethod = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        ViewLayer.recreateDisplayList = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        Object[] objArr = {"updateDisplayListIfDirty", new Class[0]};
                        ViewLayer.updateDisplayListIfDirtyMethod = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", new Class[]{cls, new Class[0].getClass()}).invoke(View.class, objArr);
                        Object[] objArr2 = {"mRecreateDisplayList"};
                        ViewLayer.recreateDisplayList = (Field) Class.class.getDeclaredMethod("getDeclaredField", new Class[]{cls}).invoke(View.class, objArr2);
                    }
                    Method access$getUpdateDisplayListIfDirtyMethod$cp = ViewLayer.updateDisplayListIfDirtyMethod;
                    if (access$getUpdateDisplayListIfDirtyMethod$cp != null) {
                        access$getUpdateDisplayListIfDirtyMethod$cp.setAccessible(true);
                    }
                    Field access$getRecreateDisplayList$cp = ViewLayer.recreateDisplayList;
                    if (access$getRecreateDisplayList$cp != null) {
                        access$getRecreateDisplayList$cp.setAccessible(true);
                    }
                }
                Field access$getRecreateDisplayList$cp2 = ViewLayer.recreateDisplayList;
                if (access$getRecreateDisplayList$cp2 != null) {
                    access$getRecreateDisplayList$cp2.setBoolean(view, true);
                }
                Method access$getUpdateDisplayListIfDirtyMethod$cp2 = ViewLayer.updateDisplayListIfDirtyMethod;
                if (access$getUpdateDisplayListIfDirtyMethod$cp2 != null) {
                    access$getUpdateDisplayListIfDirtyMethod$cp2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                ViewLayer.shouldUseDispatchDraw = true;
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.ViewLayer$b */
    public static final class C1797b {
        /* renamed from: a */
        public static final long m3953a(View view) {
            C19383o.m32797g(view, "view");
            return view.getUniqueDrawingId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewLayer(AndroidComposeView androidComposeView, DrawChildContainer drawChildContainer, C19857l<? super C1537o, C19394m> lVar, C19846a<C19394m> aVar) {
        super(androidComposeView.getContext());
        C19383o.m32797g(androidComposeView, "ownerView");
        C19383o.m32797g(drawChildContainer, "container");
        C19383o.m32797g(lVar, "drawBlock");
        C19383o.m32797g(aVar, "invalidateParentLayer");
        this.ownerView = androidComposeView;
        this.container = drawChildContainer;
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
        this.outlineResolver = new C1873s0(androidComposeView.getDensity());
        int i = C1540p0.f3338c;
        this.mTransformOrigin = C1540p0.f3337b;
        setWillNotDraw(false);
        setId(View.generateViewId());
        drawChildContainer.addView(this);
    }

    private final C1492b0 getManualClipPath() {
        if (getClipToOutline()) {
            C1873s0 s0Var = this.outlineResolver;
            if (!(!s0Var.f4142i)) {
                s0Var.mo7282e();
                return s0Var.f4140g;
            }
        }
        return null;
    }

    private final void resetClipBounds() {
        Rect rect;
        if (this.clipToBounds) {
            Rect rect2 = this.clipBoundsCache;
            if (rect2 == null) {
                this.clipBoundsCache = new Rect(0, 0, getWidth(), getHeight());
            } else {
                C19383o.m32794d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.clipBoundsCache;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    private final void setInvalidated(boolean z) {
        if (z != this.isInvalidated) {
            this.isInvalidated = z;
            this.ownerView.notifyLayerIsDirty$ui_release(this, z);
        }
    }

    private final void updateOutlineResolver() {
        setOutlineProvider(this.outlineResolver.mo7279b() != null ? OutlineProvider : null);
    }

    public void destroy() {
        setInvalidated(false);
        this.ownerView.requestClearInvalidObservations();
        this.drawBlock = null;
        this.invalidateParentLayer = null;
        this.ownerView.recycle$ui_release(this);
        this.container.removeViewInLayout(this);
    }

    public void dispatchDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        boolean z = false;
        setInvalidated(false);
        C1539p pVar = this.canvasHolder;
        C1491b bVar = pVar.f3336a;
        Canvas canvas2 = bVar.f3219a;
        bVar.getClass();
        bVar.f3219a = canvas;
        C1491b bVar2 = pVar.f3336a;
        if (getManualClipPath() != null || !canvas.isHardwareAccelerated()) {
            z = true;
            bVar2.mo6264r();
            this.outlineResolver.mo7278a(bVar2);
        }
        C19857l<? super C1537o, C19394m> lVar = this.drawBlock;
        if (lVar != null) {
            lVar.invoke(bVar2);
        }
        if (z) {
            bVar2.mo6261m();
        }
        pVar.f3336a.mo6272z(canvas2);
    }

    public void drawLayer(C1537o oVar) {
        C19383o.m32797g(oVar, "canvas");
        boolean z = getElevation() > 0.0f;
        this.drawnWithZ = z;
        if (z) {
            oVar.mo6262o();
        }
        this.container.drawChild$ui_release(oVar, this, getDrawingTime());
        if (this.drawnWithZ) {
            oVar.mo6265s();
        }
    }

    public void forceLayout() {
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / ((float) getResources().getDisplayMetrics().densityDpi);
    }

    public final DrawChildContainer getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return (long) getId();
    }

    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return C1797b.m3953a(this.ownerView);
        }
        return -1;
    }

    public void invalidate() {
        if (!this.isInvalidated) {
            setInvalidated(true);
            super.invalidate();
            this.ownerView.invalidate();
        }
    }

    /* renamed from: isInLayer-k-4lQ0M  reason: not valid java name */
    public boolean m34805isInLayerk4lQ0M(long j) {
        float c = C8343c.m16642c(j);
        float d = C8343c.m16643d(j);
        if (this.clipToBounds) {
            return 0.0f <= c && c < ((float) getWidth()) && 0.0f <= d && d < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.outlineResolver.mo7280c(j);
        }
        return true;
    }

    public final boolean isInvalidated() {
        return this.isInvalidated;
    }

    public void mapBounds(C8342b bVar, boolean z) {
        C19383o.m32797g(bVar, "rect");
        if (z) {
            float[] a = this.matrixCache.mo7274a(this);
            if (a != null) {
                C0761x.m1749v0(a, bVar);
                return;
            }
            bVar.f18291a = 0.0f;
            bVar.f18292b = 0.0f;
            bVar.f18293c = 0.0f;
            bVar.f18294d = 0.0f;
            return;
        }
        C0761x.m1749v0(this.matrixCache.mo7275b(this), bVar);
    }

    /* renamed from: mapOffset-8S9VItk  reason: not valid java name */
    public long m34806mapOffset8S9VItk(long j, boolean z) {
        if (!z) {
            return C0761x.m1747u0(j, this.matrixCache.mo7275b(this));
        }
        float[] a = this.matrixCache.mo7274a(this);
        if (a != null) {
            return C0761x.m1747u0(j, a);
        }
        int i = C8343c.f18298e;
        return C8343c.f18296c;
    }

    /* renamed from: move--gyyYBs  reason: not valid java name */
    public void m34807movegyyYBs(long j) {
        int i = C7287g.f16165c;
        int i2 = (int) (j >> 32);
        if (i2 != getLeft()) {
            offsetLeftAndRight(i2 - getLeft());
            this.matrixCache.mo7276c();
        }
        int b = C7287g.m13992b(j);
        if (b != getTop()) {
            offsetTopAndBottom(b - getTop());
            this.matrixCache.mo7276c();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* renamed from: resize-ozmzZPI  reason: not valid java name */
    public void m34808resizeozmzZPI(long j) {
        int i = (int) (j >> 32);
        int b = C7290i.m13995b(j);
        if (i != getWidth() || b != getHeight()) {
            long j2 = this.mTransformOrigin;
            int i2 = C1540p0.f3338c;
            float f = (float) i;
            setPivotX(Float.intBitsToFloat((int) (j2 >> 32)) * f);
            float f2 = (float) b;
            setPivotY(C1540p0.m3342a(this.mTransformOrigin) * f2);
            C1873s0 s0Var = this.outlineResolver;
            long t = C0114h.m319t(f, f2);
            if (!C8347f.m16653a(s0Var.f4137d, t)) {
                s0Var.f4137d = t;
                s0Var.f4141h = true;
            }
            updateOutlineResolver();
            layout(getLeft(), getTop(), getLeft() + i, getTop() + b);
            resetClipBounds();
            this.matrixCache.mo7276c();
        }
    }

    public void reuseLayer(C19857l<? super C1537o, C19394m> lVar, C19846a<C19394m> aVar) {
        C19383o.m32797g(lVar, "drawBlock");
        C19383o.m32797g(aVar, "invalidateParentLayer");
        this.container.addView(this);
        this.clipToBounds = false;
        this.drawnWithZ = false;
        int i = C1540p0.f3338c;
        this.mTransformOrigin = C1540p0.f3337b;
        this.drawBlock = lVar;
        this.invalidateParentLayer = aVar;
    }

    public final void setCameraDistancePx(float f) {
        setCameraDistance(f * ((float) getResources().getDisplayMetrics().densityDpi));
    }

    public void updateDisplayList() {
        if (this.isInvalidated && !shouldUseDispatchDraw) {
            setInvalidated(false);
            Companion.getClass();
            C1796a.m3952a(this);
        }
    }

    /* renamed from: updateLayerProperties-NHXXZp8  reason: not valid java name */
    public void m34809updateLayerPropertiesNHXXZp8(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, C1530k0 k0Var, boolean z, C1520f0 f0Var, long j2, long j3, LayoutDirection layoutDirection, C7282b bVar) {
        C19846a<C19394m> aVar;
        C1530k0 k0Var2 = k0Var;
        C19383o.m32797g(k0Var2, "shape");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        C19383o.m32797g(bVar, "density");
        this.mTransformOrigin = j;
        setScaleX(f);
        float f11 = f2;
        setScaleY(f2);
        float f12 = f3;
        setAlpha(f3);
        float f13 = f4;
        setTranslationX(f4);
        setTranslationY(f5);
        setElevation(f6);
        setRotation(f9);
        setRotationX(f7);
        setRotationY(f8);
        long j4 = this.mTransformOrigin;
        int i = C1540p0.f3338c;
        setPivotX(Float.intBitsToFloat((int) (j4 >> 32)) * ((float) getWidth()));
        setPivotY(C1540p0.m3342a(this.mTransformOrigin) * ((float) getHeight()));
        setCameraDistancePx(f10);
        boolean z2 = true;
        this.clipToBounds = z && k0Var2 == C1517e0.f3292a;
        resetClipBounds();
        boolean z3 = getManualClipPath() != null;
        setClipToOutline(z && k0Var2 != C1517e0.f3292a);
        boolean d = this.outlineResolver.mo7281d(k0Var, getAlpha(), getClipToOutline(), getElevation(), layoutDirection, bVar);
        updateOutlineResolver();
        if (getManualClipPath() == null) {
            z2 = false;
        }
        if (z3 != z2 || (z2 && d)) {
            invalidate();
        }
        if (!this.drawnWithZ && getElevation() > 0.0f && (aVar = this.invalidateParentLayer) != null) {
            aVar.invoke();
        }
        this.matrixCache.mo7276c();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            C1849l1 l1Var = C1849l1.f4105a;
            l1Var.mo7264a(this, C18263b.m30859o0(j2));
            l1Var.mo7265b(this, C18263b.m30859o0(j3));
        }
        if (i2 >= 31) {
            C1853m1.f4108a.mo7268a(this, f0Var);
        }
    }
}
