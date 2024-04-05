package androidx.compose.material.internal;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.platform.AbstractComposeView;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.p015ui.window.C2092e;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1418v0;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import p174m0.C7287g;
import p174m0.C7289h;
import p174m0.C7290i;
import p288y.C8343c;
import p753kq.C19846a;
import p753kq.C19861p;

@SuppressLint({"ViewConstructor"})
public final class PopupLayout extends AbstractComposeView implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public C19846a<C19394m> f2488b;

    /* renamed from: c */
    public final View f2489c;

    /* renamed from: d */
    public final WindowManager f2490d;

    /* renamed from: e */
    public final WindowManager.LayoutParams f2491e;

    /* renamed from: f */
    public C2092e f2492f;

    /* renamed from: g */
    public LayoutDirection f2493g;

    /* renamed from: h */
    public final ParcelableSnapshotMutableState f2494h;

    /* renamed from: i */
    public final ParcelableSnapshotMutableState f2495i;

    /* renamed from: j */
    public final DerivedSnapshotState f2496j;

    /* renamed from: k */
    public final Rect f2497k;

    /* renamed from: l */
    public final Rect f2498l;

    /* renamed from: m */
    public final C19861p<C8343c, C7289h, Boolean> f2499m;

    /* renamed from: n */
    public final ParcelableSnapshotMutableState f2500n;

    /* renamed from: o */
    public boolean f2501o;

    /* renamed from: androidx.compose.material.internal.PopupLayout$a */
    public /* synthetic */ class C1201a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f2502a;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            f2502a = iArr;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PopupLayout(p753kq.C19846a<kotlin.C19394m> r7, java.lang.String r8, android.view.View r9, p174m0.C7282b r10, androidx.compose.p015ui.window.C2092e r11, java.util.UUID r12) {
        /*
            r6 = this;
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.C19383o.m32797g(r8, r0)
            java.lang.String r8 = "composeView"
            kotlin.jvm.internal.C19383o.m32797g(r9, r8)
            java.lang.String r8 = "density"
            kotlin.jvm.internal.C19383o.m32797g(r10, r8)
            java.lang.String r8 = "initialPositionProvider"
            kotlin.jvm.internal.C19383o.m32797g(r11, r8)
            android.content.Context r1 = r9.getContext()
            java.lang.String r8 = "composeView.context"
            kotlin.jvm.internal.C19383o.m32796f(r1, r8)
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f2488b = r7
            r6.f2489c = r9
            android.content.Context r7 = r9.getContext()
            java.lang.String r8 = "window"
            java.lang.Object r7 = r7.getSystemService(r8)
            if (r7 == 0) goto L_0x00ff
            android.view.WindowManager r7 = (android.view.WindowManager) r7
            r6.f2490d = r7
            android.view.WindowManager$LayoutParams r7 = new android.view.WindowManager$LayoutParams
            r7.<init>()
            r8 = 8388659(0x800033, float:1.1755015E-38)
            r7.gravity = r8
            r8 = 393248(0x60020, float:5.51058E-40)
            r7.flags = r8
            r8 = 1
            r7.softInputMode = r8
            r8 = 1000(0x3e8, float:1.401E-42)
            r7.type = r8
            android.os.IBinder r8 = r9.getApplicationWindowToken()
            r7.token = r8
            r8 = -2
            r7.width = r8
            r7.height = r8
            r8 = -3
            r7.format = r8
            android.content.Context r8 = r9.getContext()
            android.content.res.Resources r8 = r8.getResources()
            r0 = 2131952083(0x7f1301d3, float:1.9540599E38)
            java.lang.String r8 = r8.getString(r0)
            r7.setTitle(r8)
            r6.f2491e = r7
            r6.f2492f = r11
            androidx.compose.ui.unit.LayoutDirection r7 = androidx.compose.p015ui.unit.LayoutDirection.Ltr
            r6.f2493g = r7
            r7 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r8 = androidx.compose.foundation.layout.C0761x.m1751w0(r7, androidx.compose.runtime.C1351n1.f2948a)
            r6.f2494h = r8
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = androidx.compose.foundation.layout.C0761x.m1751w0(r7, androidx.compose.runtime.C1351n1.f2948a)
            r6.f2495i = r7
            androidx.compose.material.internal.PopupLayout$canCalculatePosition$2 r7 = new androidx.compose.material.internal.PopupLayout$canCalculatePosition$2
            r7.<init>(r6)
            androidx.compose.runtime.DerivedSnapshotState r7 = androidx.compose.foundation.layout.C0761x.m1687Q(r7)
            r6.f2496j = r7
            r7 = 30
            float r7 = (float) r7
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r6.f2497k = r8
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r6.f2498l = r8
            androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1 r8 = androidx.compose.material.internal.PopupLayout$dismissOnOutsideClick$1.INSTANCE
            r6.f2499m = r8
            r8 = 16908290(0x1020002, float:2.3877235E-38)
            r6.setId(r8)
            androidx.lifecycle.s r8 = com.google.android.play.core.assetpacks.C15588c1.m25325f0(r9)
            r11 = 2131430410(0x7f0b0c0a, float:1.848252E38)
            r6.setTag(r11, r8)
            androidx.lifecycle.m0 r8 = androidx.activity.C0114h.m295Z(r9)
            r11 = 2131430412(0x7f0b0c0c, float:1.8482524E38)
            r6.setTag(r11, r8)
            androidx.savedstate.d r8 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.m7916a(r9)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.m7917b(r6, r8)
            android.view.ViewTreeObserver r8 = r9.getViewTreeObserver()
            r8.addOnGlobalLayoutListener(r6)
            r8 = 2131428010(0x7f0b02aa, float:1.8477652E38)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r11 = "Popup:"
            r9.append(r11)
            r9.append(r12)
            java.lang.String r9 = r9.toString()
            r6.setTag(r8, r9)
            r8 = 0
            r6.setClipChildren(r8)
            float r7 = r10.mo3789B0(r7)
            r6.setElevation(r7)
            androidx.compose.material.internal.PopupLayout$2 r7 = new androidx.compose.material.internal.PopupLayout$2
            r7.<init>()
            r6.setOutlineProvider(r7)
            androidx.compose.runtime.internal.ComposableLambdaImpl r7 = androidx.compose.material.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.f2481a
            androidx.compose.runtime.ParcelableSnapshotMutableState r7 = androidx.compose.foundation.layout.C0761x.m1751w0(r7, androidx.compose.runtime.C1351n1.f2948a)
            r6.f2500n = r7
            return
        L_0x00ff:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type android.view.WindowManager"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.<init>(kq.a, java.lang.String, android.view.View, m0.b, androidx.compose.ui.window.e, java.util.UUID):void");
    }

    public final void Content(C1302d dVar, int i) {
        ComposerImpl h = dVar.mo5440h(-1288867704);
        ((C19861p) this.f2500n.getValue()).invoke(h, 0);
        C1418v0 U = h.mo5421U();
        if (U != null) {
            U.f3081d = new PopupLayout$Content$4(this, i);
        }
    }

    /* renamed from: a */
    public final void mo5276a(C19846a<C19394m> aVar, String str, LayoutDirection layoutDirection) {
        C19383o.m32797g(str, "testTag");
        C19383o.m32797g(layoutDirection, "layoutDirection");
        this.f2488b = aVar;
        int i = C1201a.f2502a[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        super.setLayoutDirection(i2);
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        C19383o.m32797g(keyEvent, "event");
        if (keyEvent.getKeyCode() == 4) {
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
                C19846a<C19394m> aVar = this.f2488b;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2501o;
    }

    public final void onGlobalLayout() {
        this.f2489c.getWindowVisibleDisplayFrame(this.f2498l);
        if (!C19383o.m32792b(this.f2498l, this.f2497k)) {
            updatePosition();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0091, code lost:
        if (r4.invoke(r1, r0).booleanValue() == false) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0007
            boolean r8 = super.onTouchEvent(r8)
            return r8
        L_0x0007:
            int r0 = r8.getAction()
            r1 = 0
            if (r0 != 0) goto L_0x0038
            float r0 = r8.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r8.getX()
            int r2 = r7.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            float r0 = r8.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x003f
            float r0 = r8.getY()
            int r2 = r7.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
        L_0x0038:
            int r0 = r8.getAction()
            r2 = 4
            if (r0 != r2) goto L_0x009e
        L_0x003f:
            androidx.compose.runtime.ParcelableSnapshotMutableState r0 = r7.f2494h
            java.lang.Object r0 = r0.getValue()
            m0.h r0 = (p174m0.C7289h) r0
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0093
            kq.p<y.c, m0.h, java.lang.Boolean> r4 = r7.f2499m
            float r5 = r8.getX()
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x0057
            r5 = r3
            goto L_0x0058
        L_0x0057:
            r5 = r2
        L_0x0058:
            if (r5 == 0) goto L_0x006a
            float r5 = r8.getY()
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0064
            r1 = r3
            goto L_0x0065
        L_0x0064:
            r1 = r2
        L_0x0065:
            if (r1 != 0) goto L_0x0068
            goto L_0x006a
        L_0x0068:
            r1 = 0
            goto L_0x0087
        L_0x006a:
            android.view.WindowManager$LayoutParams r1 = r7.f2491e
            int r1 = r1.x
            float r1 = (float) r1
            float r5 = r8.getX()
            float r5 = r5 + r1
            android.view.WindowManager$LayoutParams r1 = r7.f2491e
            int r1 = r1.y
            float r1 = (float) r1
            float r6 = r8.getY()
            float r6 = r6 + r1
            long r5 = kotlin.reflect.C19421p.m32952q(r5, r6)
            y.c r1 = new y.c
            r1.<init>(r5)
        L_0x0087:
            java.lang.Object r0 = r4.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0094
        L_0x0093:
            r2 = r3
        L_0x0094:
            if (r2 == 0) goto L_0x009e
            kq.a<kotlin.m> r8 = r7.f2488b
            if (r8 == 0) goto L_0x009d
            r8.invoke()
        L_0x009d:
            return r3
        L_0x009e:
            boolean r8 = super.onTouchEvent(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLayoutDirection(int i) {
    }

    public final void updatePosition() {
        C7290i iVar;
        C7289h hVar = (C7289h) this.f2494h.getValue();
        if (hVar != null && (iVar = (C7290i) this.f2495i.getValue()) != null) {
            long j = iVar.f16171a;
            Rect rect = this.f2497k;
            this.f2489c.getWindowVisibleDisplayFrame(rect);
            int i = rect.left;
            int i2 = rect.top;
            long a = this.f2492f.mo4694a(hVar, C0761x.m1707a(rect.right - i, rect.bottom - i2), this.f2493g, j);
            WindowManager.LayoutParams layoutParams = this.f2491e;
            int i3 = C7287g.f16165c;
            layoutParams.x = (int) (a >> 32);
            layoutParams.y = C7287g.m13992b(a);
            this.f2490d.updateViewLayout(this, this.f2491e);
        }
    }
}
