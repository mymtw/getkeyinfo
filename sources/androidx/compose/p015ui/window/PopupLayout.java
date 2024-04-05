package androidx.compose.p015ui.window;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.layout.C1689j;
import androidx.compose.p015ui.platform.AbstractComposeView;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1324g;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1411t;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.stetho.websocket.CloseCodes;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.material.badge.BadgeDrawable;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p174m0.C7287g;
import p174m0.C7289h;
import p174m0.C7290i;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19861p;

@SuppressLint({"ViewConstructor"})
/* renamed from: androidx.compose.ui.window.PopupLayout */
public final class PopupLayout extends AbstractComposeView {
    private final C1342k1 canCalculatePosition$delegate;
    private final View composeView;
    private final C1338j0 content$delegate;
    private final int[] locationOnScreen;
    private final float maxSupportedElevation;
    private C19846a<C19394m> onDismissRequest;
    private final WindowManager.LayoutParams params;
    private C7289h parentBounds;
    private final C1338j0 parentLayoutCoordinates$delegate;
    private LayoutDirection parentLayoutDirection;
    private final C1338j0 popupContentSize$delegate;
    private final C2090c popupLayoutHelper;
    private C2092e positionProvider;
    private final Rect previousWindowVisibleFrame;
    private C2093f properties;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private String testTag;
    private final WindowManager windowManager;

    /* renamed from: androidx.compose.ui.window.PopupLayout$a */
    public /* synthetic */ class C2087a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f4722a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f4722a = iArr;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PopupLayout(p753kq.C19846a r11, androidx.compose.p015ui.window.C2093f r12, java.lang.String r13, android.view.View r14, p174m0.C7282b r15, androidx.compose.p015ui.window.C2092e r16, java.util.UUID r17, androidx.compose.p015ui.window.C2090c r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r10 = this;
            r0 = r19
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0019
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L_0x0012
            androidx.compose.ui.window.d r0 = new androidx.compose.ui.window.d
            r0.<init>()
            goto L_0x0017
        L_0x0012:
            bk.a r0 = new bk.a
            r0.<init>()
        L_0x0017:
            r9 = r0
            goto L_0x001b
        L_0x0019:
            r9 = r18
        L_0x001b:
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.window.PopupLayout.<init>(kq.a, androidx.compose.ui.window.f, java.lang.String, android.view.View, m0.b, androidx.compose.ui.window.e, java.util.UUID, androidx.compose.ui.window.c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    private final void applyNewFlags(int i) {
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.flags = i;
        this.popupLayoutHelper.mo7973a(this.windowManager, this, layoutParams);
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = BadgeDrawable.TOP_START;
        layoutParams.flags = (layoutParams.flags & -8552473) | PrimitiveArrayBuilder.MAX_CHUNK_SIZE;
        layoutParams.type = CloseCodes.PROTOCOL_ERROR;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(R.string.default_popup_window_title));
        return layoutParams;
    }

    private final C19861p<C1302d, Integer, C19394m> getContent() {
        return (C19861p) this.content$delegate.getValue();
    }

    private final int getDisplayHeight() {
        return C7279a.m13954l(((float) getContext().getResources().getConfiguration().screenHeightDp) * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return C7279a.m13954l(((float) getContext().getResources().getConfiguration().screenWidthDp) * getContext().getResources().getDisplayMetrics().density);
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* access modifiers changed from: private */
    public final C1689j getParentLayoutCoordinates() {
        return (C1689j) this.parentLayoutCoordinates$delegate.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        applyNewFlags(z ? this.params.flags & -513 : this.params.flags | RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    private final void setContent(C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        this.content$delegate.setValue(pVar);
    }

    private final void setIsFocusable(boolean z) {
        applyNewFlags(!z ? this.params.flags | 8 : this.params.flags & -9);
    }

    private final void setParentLayoutCoordinates(C1689j jVar) {
        this.parentLayoutCoordinates$delegate.setValue(jVar);
    }

    private final void setSecurePolicy(SecureFlagPolicy secureFlagPolicy) {
        applyNewFlags(C2094g.m4527a(secureFlagPolicy, AndroidPopup_androidKt.m4516c(this.composeView)) ? this.params.flags | 8192 : this.params.flags & -8193);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i = C2087a.f4722a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    public void Content(C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(-857613600);
        getContent().invoke(h, 0);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new PopupLayout$Content$4(this, i);
        }
    }

    public final void dismiss() {
        setTag(R.id.view_tree_lifecycle_owner, (Object) null);
        this.windowManager.removeViewImmediate(this);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        C19383o.m32797g(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4 && this.properties.f4730b) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C19846a<C19394m> aVar = this.onDismissRequest;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.params;
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final C7290i m34829getPopupContentSizebOM6tXw() {
        return (C7290i) this.popupContentSize$delegate.getValue();
    }

    public final C2092e getPositionProvider() {
        return this.positionProvider;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public void internalOnLayout$ui_release(boolean z, int i, int i2, int i3, int i4) {
        super.internalOnLayout$ui_release(z, i, i2, i3, i4);
        View childAt = getChildAt(0);
        if (childAt != null) {
            this.params.width = childAt.getMeasuredWidth();
            this.params.height = childAt.getMeasuredHeight();
            this.popupLayoutHelper.mo7973a(this.windowManager, this, this.params);
        }
    }

    public void internalOnMeasure$ui_release(int i, int i2) {
        if (this.properties.f4735g) {
            super.internalOnMeasure$ui_release(i, i2);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.properties.f4731c) {
            return super.onTouchEvent(motionEvent);
        }
        boolean z = false;
        if (!(motionEvent != null && motionEvent.getAction() == 0) || (motionEvent.getX() >= 0.0f && motionEvent.getX() < ((float) getWidth()) && motionEvent.getY() >= 0.0f && motionEvent.getY() < ((float) getHeight()))) {
            if (motionEvent != null && motionEvent.getAction() == 4) {
                z = true;
            }
            if (!z) {
                return super.onTouchEvent(motionEvent);
            }
            C19846a<C19394m> aVar = this.onDismissRequest;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        C19846a<C19394m> aVar2 = this.onDismissRequest;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void pollForLocationOnScreenChange() {
        int[] iArr = this.locationOnScreen;
        int i = iArr[0];
        int i2 = iArr[1];
        this.composeView.getLocationOnScreen(iArr);
        int[] iArr2 = this.locationOnScreen;
        if (i != iArr2[0] || i2 != iArr2[1]) {
            updateParentBounds$ui_release();
        }
    }

    public void setLayoutDirection(int i) {
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        C19383o.m32797g(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m34830setPopupContentSizefhxjrPA(C7290i iVar) {
        this.popupContentSize$delegate.setValue(iVar);
    }

    public final void setPositionProvider(C2092e eVar) {
        C19383o.m32797g(eVar, "<set-?>");
        this.positionProvider = eVar;
    }

    public final void setTestTag(String str) {
        C19383o.m32797g(str, "<set-?>");
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(C19846a<C19394m> aVar, C2093f fVar, String str, LayoutDirection layoutDirection) {
        C19383o.m32797g(fVar, "properties");
        C19383o.m32797g(str, "testTag");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        this.onDismissRequest = aVar;
        this.properties = fVar;
        this.testTag = str;
        setIsFocusable(fVar.f4729a);
        setSecurePolicy(fVar.f4732d);
        setClippingEnabled(fVar.f4734f);
        superSetLayoutDirection(layoutDirection);
    }

    public final void updateParentBounds$ui_release() {
        C1689j parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long a = parentLayoutCoordinates.mo6684a();
            long u0 = C0114h.m322u0(parentLayoutCoordinates);
            long o = C19421p.m32949o(C7279a.m13954l(C8343c.m16642c(u0)), C7279a.m13954l(C8343c.m16643d(u0)));
            int i = (int) (o >> 32);
            C7289h hVar = new C7289h(i, C7287g.m13992b(o), ((int) (a >> 32)) + i, C7290i.m13995b(a) + C7287g.m13992b(o));
            if (!C19383o.m32792b(hVar, this.parentBounds)) {
                this.parentBounds = hVar;
                updatePosition();
            }
        }
    }

    public final void updateParentLayoutCoordinates(C1689j jVar) {
        C19383o.m32797g(jVar, "parentLayoutCoordinates");
        setParentLayoutCoordinates(jVar);
        updateParentBounds$ui_release();
    }

    public final void updatePosition() {
        C7290i r0;
        C7289h hVar = this.parentBounds;
        if (hVar != null && (r0 = m34829getPopupContentSizebOM6tXw()) != null) {
            long j = r0.f16171a;
            Rect rect = this.previousWindowVisibleFrame;
            this.popupLayoutHelper.mo7974b(this.composeView, rect);
            C1411t tVar = AndroidPopup_androidKt.f4705a;
            int i = rect.left;
            int i2 = rect.top;
            long a = C0761x.m1707a(rect.right - i, rect.bottom - i2);
            long a2 = this.positionProvider.mo4694a(hVar, a, this.parentLayoutDirection, j);
            WindowManager.LayoutParams layoutParams = this.params;
            int i3 = C7287g.f16165c;
            layoutParams.x = (int) (a2 >> 32);
            layoutParams.y = C7287g.m13992b(a2);
            if (this.properties.f4733e) {
                this.popupLayoutHelper.mo7975c(this, (int) (a >> 32), C7290i.m13995b(a));
            }
            this.popupLayoutHelper.mo7973a(this.windowManager, this, this.params);
        }
    }

    public final void setContent(C1324g gVar, C19861p<? super C1302d, ? super Integer, C19394m> pVar) {
        C19383o.m32797g(gVar, ResponseConstants.PARENT);
        C19383o.m32797g(pVar, ResponseConstants.CONTENT);
        setParentCompositionContext(gVar);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PopupLayout(p753kq.C19846a<kotlin.C19394m> r8, androidx.compose.p015ui.window.C2093f r9, java.lang.String r10, android.view.View r11, p174m0.C7282b r12, androidx.compose.p015ui.window.C2092e r13, java.util.UUID r14, androidx.compose.p015ui.window.C2090c r15) {
        /*
            r7 = this;
            java.lang.String r0 = "properties"
            kotlin.jvm.internal.C19383o.m32797g(r9, r0)
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.C19383o.m32797g(r10, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.C19383o.m32797g(r11, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.C19383o.m32797g(r12, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.C19383o.m32797g(r13, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.C19383o.m32797g(r14, r0)
            java.lang.String r0 = "popupLayoutHelper"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            android.content.Context r2 = r11.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.C19383o.m32796f(r2, r0)
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.onDismissRequest = r8
            r7.properties = r9
            r7.testTag = r10
            r7.composeView = r11
            r7.popupLayoutHelper = r15
            android.content.Context r8 = r11.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            if (r8 == 0) goto L_0x00d7
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.windowManager = r8
            android.view.WindowManager$LayoutParams r8 = r7.createLayoutParams()
            r7.params = r8
            r7.positionProvider = r13
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.p015ui.unit.LayoutDirection.Ltr
            r7.parentLayoutDirection = r8
            r8 = 0
            r9 = 2
            androidx.compose.runtime.ParcelableSnapshotMutableState r10 = androidx.compose.foundation.layout.C0761x.m1751w0(r8, androidx.compose.runtime.C1351n1.f2948a)
            r7.popupContentSize$delegate = r10
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = androidx.compose.foundation.layout.C0761x.m1751w0(r8, androidx.compose.runtime.C1351n1.f2948a)
            r7.parentLayoutCoordinates$delegate = r8
            androidx.compose.ui.window.PopupLayout$canCalculatePosition$2 r8 = new androidx.compose.ui.window.PopupLayout$canCalculatePosition$2
            r8.<init>(r7)
            androidx.compose.runtime.DerivedSnapshotState r8 = androidx.compose.foundation.layout.C0761x.m1687Q(r8)
            r7.canCalculatePosition$delegate = r8
            r8 = 30
            float r8 = (float) r8
            r7.maxSupportedElevation = r8
            android.graphics.Rect r10 = new android.graphics.Rect
            r10.<init>()
            r7.previousWindowVisibleFrame = r10
            r10 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r10)
            androidx.lifecycle.s r10 = com.google.android.play.core.assetpacks.C15588c1.m25325f0(r11)
            r13 = 2131430410(0x7f0b0c0a, float:1.848252E38)
            r7.setTag(r13, r10)
            androidx.lifecycle.m0 r10 = androidx.activity.C0114h.m295Z(r11)
            r13 = 2131430412(0x7f0b0c0c, float:1.8482524E38)
            r7.setTag(r13, r10)
            androidx.savedstate.d r10 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.m7916a(r11)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.m7917b(r7, r10)
            r10 = 2131428010(0x7f0b02aa, float:1.8477652E38)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r13 = "Popup:"
            r11.append(r13)
            r11.append(r14)
            java.lang.String r11 = r11.toString()
            r7.setTag(r10, r11)
            r10 = 0
            r7.setClipChildren(r10)
            float r8 = r12.mo3789B0(r8)
            r7.setElevation(r8)
            androidx.compose.ui.window.PopupLayout$2 r8 = new androidx.compose.ui.window.PopupLayout$2
            r8.<init>()
            r7.setOutlineProvider(r8)
            androidx.compose.runtime.internal.ComposableLambdaImpl r8 = androidx.compose.p015ui.window.ComposableSingletons$AndroidPopup_androidKt.f4712a
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = androidx.compose.foundation.layout.C0761x.m1751w0(r8, androidx.compose.runtime.C1351n1.f2948a)
            r7.content$delegate = r8
            int[] r8 = new int[r9]
            r7.locationOnScreen = r8
            return
        L_0x00d7:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.window.PopupLayout.<init>(kq.a, androidx.compose.ui.window.f, java.lang.String, android.view.View, m0.b, androidx.compose.ui.window.e, java.util.UUID, androidx.compose.ui.window.c):void");
    }
}
