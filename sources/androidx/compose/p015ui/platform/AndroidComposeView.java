package androidx.compose.p015ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.activity.C0114h;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.autofill.AutofillCallback;
import androidx.compose.p015ui.focus.C1465a;
import androidx.compose.p015ui.focus.C1469d;
import androidx.compose.p015ui.focus.C1470e;
import androidx.compose.p015ui.focus.C1482p;
import androidx.compose.p015ui.focus.C1484q;
import androidx.compose.p015ui.focus.FocusManagerImpl;
import androidx.compose.p015ui.focus.FocusModifier;
import androidx.compose.p015ui.focus.FocusStateImpl;
import androidx.compose.p015ui.graphics.C1491b;
import androidx.compose.p015ui.graphics.C1539p;
import androidx.compose.p015ui.input.key.C1611a;
import androidx.compose.p015ui.input.key.C1612b;
import androidx.compose.p015ui.input.key.C1613c;
import androidx.compose.p015ui.input.key.C1614d;
import androidx.compose.p015ui.input.pointer.C1634f;
import androidx.compose.p015ui.input.pointer.C1636h;
import androidx.compose.p015ui.input.pointer.C1639k;
import androidx.compose.p015ui.input.pointer.C1641m;
import androidx.compose.p015ui.input.pointer.C1642n;
import androidx.compose.p015ui.input.pointer.C1647r;
import androidx.compose.p015ui.input.pointer.C1648s;
import androidx.compose.p015ui.input.pointer.C1649t;
import androidx.compose.p015ui.input.pointer.C1654y;
import androidx.compose.p015ui.input.rotary.C1658a;
import androidx.compose.p015ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.p015ui.layout.RootMeasurePolicy;
import androidx.compose.p015ui.node.C1741h;
import androidx.compose.p015ui.node.C1743j;
import androidx.compose.p015ui.node.C1749o;
import androidx.compose.p015ui.node.C1750p;
import androidx.compose.p015ui.node.C1755t;
import androidx.compose.p015ui.node.LayoutNode;
import androidx.compose.p015ui.node.LayoutNodeWrapper;
import androidx.compose.p015ui.node.OwnerSnapshotObserver;
import androidx.compose.p015ui.semantics.C1904k;
import androidx.compose.p015ui.semantics.C1906m;
import androidx.compose.p015ui.semantics.C1907n;
import androidx.compose.p015ui.semantics.SemanticsNode;
import androidx.compose.p015ui.text.font.C1950f;
import androidx.compose.p015ui.text.font.C1952g;
import androidx.compose.p015ui.text.input.C1998p;
import androidx.compose.p015ui.text.input.C2002t;
import androidx.compose.p015ui.text.input.TextInputServiceAndroid;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.p015ui.viewinterop.AndroidViewHolder;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.C1422x0;
import androidx.compose.runtime.snapshots.C1384e;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.lifecycle.C2857f;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import androidx.savedstate.C3269d;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.play.core.assetpacks.C15588c1;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.C19394m;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.collections.C19318k;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19389t;
import kotlin.reflect.C19421p;
import p020b0.C3449a;
import p020b0.C3450b;
import p031c0.C4350a;
import p031c0.C4351b;
import p031c0.C4352c;
import p076d0.C6616b;
import p088e1.C6689b;
import p173m.C7279a;
import p174m0.C7280a;
import p174m0.C7282b;
import p174m0.C7287g;
import p219r.C7734e;
import p279x.C8277a;
import p279x.C8278b;
import p279x.C8279c;
import p279x.C8280d;
import p279x.C8281e;
import p279x.C8282f;
import p288y.C8343c;
import p288y.C8345d;
import p628nj.C18263b;
import p753kq.C19846a;
import p753kq.C19857l;

@SuppressLint({"ViewConstructor", "VisibleForTests"})
/* renamed from: androidx.compose.ui.platform.AndroidComposeView */
public final class AndroidComposeView extends ViewGroup implements C1750p, C1857n1, C1654y, C2857f {
    public static final C1758a Companion = new C1758a();
    private static final String FocusTag = "Compose Focus";
    private static final int MaximumLayerCacheSize = 10;
    /* access modifiers changed from: private */
    public static Method getBooleanMethod;
    /* access modifiers changed from: private */
    public static Class<?> systemPropertiesClass;
    private AndroidViewsHandler _androidViewsHandler;
    private final C8277a _autofill;
    private final FocusManagerImpl _focusManager;
    private final C4352c _inputModeManager;
    private final C1866q1 _windowInfo;
    private final AndroidComposeViewAccessibilityDelegateCompat accessibilityDelegate;
    private final C1841j accessibilityManager;
    private final C8282f autofillTree;
    private final C1539p canvasHolder;
    private final C1844k clipboardManager;
    private C19857l<? super Configuration, C19394m> configurationChangeObserver;
    private int currentFontWeightAdjustment;
    private C7282b density;
    /* access modifiers changed from: private */
    public C1641m desiredPointerIcon;
    private final List<C1749o> dirtyLayers;
    private final C7734e<C19846a<C19394m>> endApplyChangesListeners;
    private final C1338j0 fontFamilyResolver$delegate;
    private final C1950f.C1951a fontLoader;
    private boolean forceUseMatrixCache;
    private final ViewTreeObserver.OnGlobalLayoutListener globalLayoutListener;
    private long globalPosition;
    private final C3449a hapticFeedBack;
    private boolean hoverExitReceived;
    private boolean isDrawingContent;
    private boolean isRenderNodeCompatible;
    private final C1614d keyInputModifier;
    private long lastDownPointerPosition = C8343c.f18297d;
    private long lastMatrixRecalculationAnimationTime;
    private final C1860o1<C1749o> layerCache;
    private final C1338j0 layoutDirection$delegate;
    private final C1818b0 matrixToWindow;
    private final C1743j measureAndLayoutDelegate;
    private final C1636h motionEventAdapter;
    private boolean observationClearRequested;
    private C7280a onMeasureConstraints;
    private C19857l<? super C1759b, C19394m> onViewTreeOwnersAvailable;
    private final C1642n pointerIconService;
    private final C1649t pointerInputEventProcessor;
    private List<C1749o> postponedDirtyLayers;
    /* access modifiers changed from: private */
    public MotionEvent previousMotionEvent;
    /* access modifiers changed from: private */
    public long relayoutTime;
    private final C19846a<C19394m> resendMotionEventOnLayout;
    /* access modifiers changed from: private */
    public final C1762e resendMotionEventRunnable;
    private final LayoutNode root;
    private final C1755t rootForTest;
    private final C1436d rotaryInputModifier;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final C1906m semanticsModifier;
    private final C1907n semanticsOwner;
    private final Runnable sendHoverExitEvent;
    private final C1741h sharedDrawScope = new C1741h();
    private boolean showLayoutBounds;
    private final OwnerSnapshotObserver snapshotObserver;
    private boolean superclassInitComplete = true;
    private final C2002t textInputService;
    private final TextInputServiceAndroid textInputServiceAndroid;
    private final C1822c1 textToolbar;
    private final int[] tmpPositionArray;
    private final ViewTreeObserver.OnTouchModeChangeListener touchModeChangeListener;
    private final C1843j1 viewConfiguration;
    private DrawChildContainer viewLayersContainer;
    private final float[] viewToWindowMatrix;
    private final C1338j0 viewTreeOwners$delegate;
    private boolean wasMeasuredWithMultipleConstraints;
    private long windowPosition;
    private final float[] windowToViewMatrix;

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$a */
    public static final class C1758a {
        /* renamed from: a */
        public static final boolean m3900a(C1758a aVar) {
            Object obj;
            Method method;
            aVar.getClass();
            try {
                Boolean bool = null;
                if (AndroidComposeView.systemPropertiesClass == null) {
                    AndroidComposeView.systemPropertiesClass = Class.forName("android.os.SystemProperties");
                    Class access$getSystemPropertiesClass$cp = AndroidComposeView.systemPropertiesClass;
                    if (access$getSystemPropertiesClass$cp != null) {
                        method = access$getSystemPropertiesClass$cp.getDeclaredMethod("getBoolean", new Class[]{String.class, Boolean.TYPE});
                    } else {
                        method = null;
                    }
                    AndroidComposeView.getBooleanMethod = method;
                }
                Method access$getGetBooleanMethod$cp = AndroidComposeView.getBooleanMethod;
                if (access$getGetBooleanMethod$cp != null) {
                    obj = access$getGetBooleanMethod$cp.invoke((Object) null, new Object[]{"debug.layout", Boolean.FALSE});
                } else {
                    obj = null;
                }
                if (obj instanceof Boolean) {
                    bool = (Boolean) obj;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$b */
    public static final class C1759b {

        /* renamed from: a */
        public final C2887s f3946a;

        /* renamed from: b */
        public final C3269d f3947b;

        public C1759b(C2887s sVar, C3269d dVar) {
            this.f3946a = sVar;
            this.f3947b = dVar;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$c */
    public static final class C1760c extends C2273a {

        /* renamed from: a */
        public final /* synthetic */ LayoutNode f3948a;

        /* renamed from: b */
        public final /* synthetic */ AndroidComposeView f3949b;

        /* renamed from: c */
        public final /* synthetic */ AndroidComposeView f3950c;

        public C1760c(LayoutNode layoutNode, AndroidComposeView androidComposeView, AndroidComposeView androidComposeView2) {
            this.f3948a = layoutNode;
            this.f3949b = androidComposeView;
            this.f3950c = androidComposeView2;
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            C19383o.m32797g(view, "host");
            C19383o.m32797g(bVar, "info");
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            C1904k T = C18263b.m30825T(this.f3948a);
            C19383o.m32794d(T);
            SemanticsNode g = new SemanticsNode(T, false).mo7308g();
            C19383o.m32794d(g);
            int i = g.f4187f;
            if (i == this.f3949b.getSemanticsOwner().mo7355a().f4187f) {
                i = -1;
            }
            AndroidComposeView androidComposeView = this.f3950c;
            bVar.f14760b = i;
            bVar.f14759a.setParent(androidComposeView, i);
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$d */
    public static final class C1761d implements C1642n {

        /* renamed from: a */
        public final /* synthetic */ AndroidComposeView f3951a;

        public C1761d(AndroidComposeView androidComposeView) {
            this.f3951a = androidComposeView;
        }

        /* renamed from: a */
        public final void mo6610a(C1641m mVar) {
            C19383o.m32797g(mVar, "value");
            this.f3951a.desiredPointerIcon = mVar;
        }
    }

    /* renamed from: androidx.compose.ui.platform.AndroidComposeView$e */
    public static final class C1762e implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AndroidComposeView f3952b;

        public C1762e(AndroidComposeView androidComposeView) {
            this.f3952b = androidComposeView;
        }

        public final void run() {
            this.f3952b.removeCallbacks(this);
            MotionEvent access$getPreviousMotionEvent$p = this.f3952b.previousMotionEvent;
            if (access$getPreviousMotionEvent$p != null) {
                boolean z = false;
                boolean z2 = access$getPreviousMotionEvent$p.getToolType(0) == 3;
                int actionMasked = access$getPreviousMotionEvent$p.getActionMasked();
                if (!z2 ? actionMasked != 1 : !(actionMasked == 10 || actionMasked == 1)) {
                    z = true;
                }
                if (z) {
                    int i = 7;
                    if (!(actionMasked == 7 || actionMasked == 9)) {
                        i = 2;
                    }
                    AndroidComposeView androidComposeView = this.f3952b;
                    androidComposeView.sendSimulatedEvent(access$getPreviousMotionEvent$p, i, androidComposeView.relayoutTime, false);
                }
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView(Context context) {
        super(context);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this.density = C15588c1.m25318c(context);
        C1906m mVar = new C1906m(C1906m.f4249d.addAndGet(1), false, false, AndroidComposeView$semanticsModifier$1.INSTANCE);
        this.semanticsModifier = mVar;
        FocusManagerImpl focusManagerImpl = new FocusManagerImpl();
        this._focusManager = focusManagerImpl;
        this._windowInfo = new C1866q1();
        C1614d dVar = new C1614d(new AndroidComposeView$keyInputModifier$1(this), (C19857l<? super C1612b, Boolean>) null);
        this.keyInputModifier = dVar;
        C1436d a = RotaryInputModifierKt.m3529a(AndroidComposeView$rotaryInputModifier$1.INSTANCE);
        this.rotaryInputModifier = a;
        this.canvasHolder = new C1539p();
        LayoutNode layoutNode = new LayoutNode(false);
        layoutNode.mo6728j(RootMeasurePolicy.f3700b);
        layoutNode.mo6729k(mVar.mo6148i0(a).mo6148i0(focusManagerImpl.f3147b).mo6148i0(dVar));
        layoutNode.mo6727g(getDensity());
        this.root = layoutNode;
        this.rootForTest = this;
        this.semanticsOwner = new C1907n(getRoot());
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.accessibilityDelegate = androidComposeViewAccessibilityDelegateCompat;
        this.autofillTree = new C8282f();
        this.dirtyLayers = new ArrayList();
        this.motionEventAdapter = new C1636h();
        this.pointerInputEventProcessor = new C1649t(getRoot());
        this.configurationChangeObserver = AndroidComposeView$configurationChangeObserver$1.INSTANCE;
        this._autofill = autofillSupported() ? new C8277a(this, getAutofillTree()) : null;
        this.clipboardManager = new C1844k(context);
        this.accessibilityManager = new C1841j(context);
        this.snapshotObserver = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.measureAndLayoutDelegate = new C1743j(getRoot());
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(context);
        C19383o.m32796f(viewConfiguration2, "get(context)");
        this.viewConfiguration = new C1891z(viewConfiguration2);
        this.globalPosition = C7287g.f16164b;
        int i = 2;
        this.tmpPositionArray = new int[]{0, 0};
        this.viewToWindowMatrix = C0761x.m1671I();
        this.windowToViewMatrix = C0761x.m1671I();
        this.lastMatrixRecalculationAnimationTime = -1;
        this.windowPosition = C8343c.f18296c;
        this.isRenderNodeCompatible = true;
        this.viewTreeOwners$delegate = C0761x.m1751w0((Object) null, C1351n1.f2948a);
        this.globalLayoutListener = new C1847l(this);
        this.scrollChangedListener = new C1850m(this);
        this.touchModeChangeListener = new C1854n(this);
        TextInputServiceAndroid textInputServiceAndroid2 = new TextInputServiceAndroid(this);
        this.textInputServiceAndroid = textInputServiceAndroid2;
        this.textInputService = (C2002t) AndroidComposeView_androidKt.f3985a.invoke(textInputServiceAndroid2);
        this.fontLoader = new C1840i1(context);
        this.fontFamilyResolver$delegate = C0761x.m1751w0(C15588c1.m25304S(context), C1422x0.f3093a);
        Configuration configuration = context.getResources().getConfiguration();
        C19383o.m32796f(configuration, "context.resources.configuration");
        this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
        Configuration configuration2 = context.getResources().getConfiguration();
        C19383o.m32796f(configuration2, "context.resources.configuration");
        int layoutDirection = configuration2.getLayoutDirection();
        this.layoutDirection$delegate = C0761x.m1751w0(layoutDirection != 0 ? layoutDirection != 1 ? LayoutDirection.Ltr : LayoutDirection.Rtl : LayoutDirection.Ltr, C1351n1.f2948a);
        this.hapticFeedBack = new C3450b(this);
        this._inputModeManager = new C4352c(new AndroidComposeView$_inputModeManager$1(this), isInTouchMode() ? 1 : i);
        this.textToolbar = new AndroidTextToolbar(this);
        this.layerCache = new C1860o1<>();
        this.endApplyChangesListeners = new C7734e<>(new C19846a[16]);
        this.resendMotionEventRunnable = new C1762e(this);
        this.sendHoverExitEvent = new C1858o(this, 0);
        this.resendMotionEventOnLayout = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        int i2 = Build.VERSION.SDK_INT;
        this.matrixToWindow = i2 >= 29 ? new C1824d0() : new C1821c0();
        setWillNotDraw(false);
        setFocusable(true);
        C1887x.f4167a.mo7289a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        C2364y.m5201p(this, androidComposeViewAccessibilityDelegateCompat);
        getRoot().mo6758o(this);
        if (i2 >= 29) {
            C1881v.f4162a.mo7285a(this);
        }
        this.pointerIconService = new C1761d(this);
    }

    private final boolean autofillSupported() {
        return true;
    }

    private final void clearChildInvalidObservations(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).onEndApplyChanges();
            } else if (childAt instanceof ViewGroup) {
                clearChildInvalidObservations((ViewGroup) childAt);
            }
        }
    }

    private final Pair<Integer, Integer> convertMeasureSpec(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            return new Pair<>(0, Integer.valueOf(size));
        }
        if (mode == 0) {
            return new Pair<>(0, Integer.valueOf(Api.BaseClientBuilder.API_PRIORITY_OTHER));
        }
        if (mode == 1073741824) {
            return new Pair<>(Integer.valueOf(size), Integer.valueOf(size));
        }
        throw new IllegalStateException();
    }

    private final View findViewByAccessibilityIdRootedAtCurrentView(int i, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (C19383o.m32792b(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            C19383o.m32796f(childAt, "currentView.getChildAt(i)");
            View findViewByAccessibilityIdRootedAtCurrentView = findViewByAccessibilityIdRootedAtCurrentView(i, childAt);
            if (findViewByAccessibilityIdRootedAtCurrentView != null) {
                return findViewByAccessibilityIdRootedAtCurrentView;
            }
        }
        return null;
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    private final int getFontWeightAdjustmentCompat(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    /* access modifiers changed from: private */
    /* renamed from: globalLayoutListener$lambda-1  reason: not valid java name */
    public static final void m34785globalLayoutListener$lambda1(AndroidComposeView androidComposeView) {
        C19383o.m32797g(androidComposeView, "this$0");
        androidComposeView.updatePositionCacheAndDispatch();
    }

    /* renamed from: handleMotionEvent-8iAsVTc  reason: not valid java name */
    private final int m34786handleMotionEvent8iAsVTc(MotionEvent motionEvent) {
        removeCallbacks(this.resendMotionEventRunnable);
        try {
            recalculateWindowPosition(motionEvent);
            boolean z = true;
            this.forceUseMatrixCache = true;
            measureAndLayout(false);
            this.desiredPointerIcon = null;
            Trace.beginSection("AndroidOwner:onTouch");
            int actionMasked = motionEvent.getActionMasked();
            MotionEvent motionEvent2 = this.previousMotionEvent;
            boolean z2 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
            if (motionEvent2 != null && hasChangedDevices(motionEvent, motionEvent2)) {
                if (isDevicePressEvent(motionEvent2)) {
                    C1649t tVar = this.pointerInputEventProcessor;
                    tVar.f3684c.f3667a.clear();
                    C1634f fVar = tVar.f3683b;
                    ((C1639k) fVar.f3631d).mo6604c();
                    ((C1639k) fVar.f3631d).f3650a.mo20235g();
                } else if (motionEvent2.getActionMasked() != 10 && z2) {
                    sendSimulatedEvent$default(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, (Object) null);
                }
            }
            if (motionEvent.getToolType(0) != 3) {
                z = false;
            }
            if (!z2 && z && actionMasked != 3 && actionMasked != 9 && isInBounds(motionEvent)) {
                sendSimulatedEvent$default(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, (Object) null);
            }
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            this.previousMotionEvent = MotionEvent.obtainNoHistory(motionEvent);
            int r15 = m34789sendMotionEvent8iAsVTc(motionEvent);
            Trace.endSection();
            C1884w.f4164a.mo7287a(this, this.desiredPointerIcon);
            this.forceUseMatrixCache = false;
            return r15;
        } catch (Throwable th) {
            this.forceUseMatrixCache = false;
            throw th;
        }
    }

    private final boolean handleRotaryEvent(MotionEvent motionEvent) {
        C6616b<C1658a> bVar;
        ViewConfiguration viewConfiguration2 = ViewConfiguration.get(getContext());
        float f = -motionEvent.getAxisValue(26);
        getContext();
        getContext();
        C1658a aVar = new C1658a(viewConfiguration2.getScaledVerticalScrollFactor() * f, motionEvent.getEventTime(), viewConfiguration2.getScaledHorizontalScrollFactor() * f);
        FocusModifier a = C1470e.m3128a(this._focusManager.f3146a);
        if (a == null || (bVar = a.f3156h) == null) {
            return false;
        }
        return bVar.mo18801b(aVar) || bVar.mo18800a(aVar);
    }

    private final boolean hasChangedDevices(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    private final void invalidateLayers(LayoutNode layoutNode) {
        layoutNode.mo6741E();
        C7734e<LayoutNode> y = layoutNode.mo6768y();
        int i = y.f17157d;
        if (i > 0) {
            int i2 = 0;
            T[] tArr = y.f17155b;
            do {
                invalidateLayers((LayoutNode) tArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    private final void invalidateLayoutNodeMeasurement(LayoutNode layoutNode) {
        int i = 0;
        this.measureAndLayoutDelegate.mo6927h(layoutNode, false);
        C7734e<LayoutNode> y = layoutNode.mo6768y();
        int i2 = y.f17157d;
        if (i2 > 0) {
            T[] tArr = y.f17155b;
            do {
                invalidateLayoutNodeMeasurement((LayoutNode) tArr[i]);
                i++;
            } while (i < i2);
        }
    }

    private final boolean isBadMotionEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!(!Float.isInfinite(x) && !Float.isNaN(x))) {
            return true;
        }
        float y = motionEvent.getY();
        if (!(!Float.isInfinite(y) && !Float.isNaN(y))) {
            return true;
        }
        float rawX = motionEvent.getRawX();
        if (!(!Float.isInfinite(rawX) && !Float.isNaN(rawX))) {
            return true;
        }
        float rawY = motionEvent.getRawY();
        return !(!Float.isInfinite(rawY) && !Float.isNaN(rawY));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        r3 = r3.getActionMasked();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean isDevicePressEvent(android.view.MotionEvent r3) {
        /*
            r2 = this;
            int r0 = r3.getButtonState()
            r1 = 1
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            int r3 = r3.getActionMasked()
            if (r3 == 0) goto L_0x0015
            r0 = 2
            if (r3 == r0) goto L_0x0015
            r0 = 6
            if (r3 == r0) goto L_0x0015
            r1 = 0
        L_0x0015:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeView.isDevicePressEvent(android.view.MotionEvent):boolean");
    }

    private final boolean isInBounds(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= ((float) getWidth())) {
            if (0.0f <= y && y <= ((float) getHeight())) {
                return true;
            }
        }
        return false;
    }

    private final boolean isPositionChanged(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.previousMotionEvent) == null) {
            return true;
        }
        if (!(motionEvent.getRawX() == motionEvent2.getRawX())) {
            return true;
        }
        return !((motionEvent.getRawY() > motionEvent2.getRawY() ? 1 : (motionEvent.getRawY() == motionEvent2.getRawY() ? 0 : -1)) == 0);
    }

    private final void recalculateWindowPosition() {
        if (!this.forceUseMatrixCache) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.lastMatrixRecalculationAnimationTime) {
                this.lastMatrixRecalculationAnimationTime = currentAnimationTimeMillis;
                recalculateWindowViewTransforms();
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                view.getLocationOnScreen(this.tmpPositionArray);
                int[] iArr = this.tmpPositionArray;
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.tmpPositionArray;
                this.windowPosition = C19421p.m32952q(((float) iArr[0]) - ((float) iArr2[0]), ((float) iArr[1]) - ((float) iArr2[1]));
            }
        }
    }

    private final void recalculateWindowViewTransforms() {
        this.matrixToWindow.mo7197a(this, this.viewToWindowMatrix);
        C15588c1.m25342q0(this.viewToWindowMatrix, this.windowToViewMatrix);
    }

    private final void scheduleMeasureAndLayout(LayoutNode layoutNode) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (this.wasMeasuredWithMultipleConstraints && layoutNode != null) {
                while (layoutNode != null && layoutNode.f3841z == LayoutNode.UsageByParent.InMeasureBlock) {
                    layoutNode = layoutNode.mo6766w();
                }
                if (layoutNode == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() == 0 || getHeight() == 0) {
                requestLayout();
            } else {
                invalidate();
            }
        }
    }

    public static /* synthetic */ void scheduleMeasureAndLayout$default(AndroidComposeView androidComposeView, LayoutNode layoutNode, int i, Object obj) {
        if ((i & 1) != 0) {
            layoutNode = null;
        }
        androidComposeView.scheduleMeasureAndLayout(layoutNode);
    }

    /* access modifiers changed from: private */
    /* renamed from: scrollChangedListener$lambda-2  reason: not valid java name */
    public static final void m34787scrollChangedListener$lambda2(AndroidComposeView androidComposeView) {
        C19383o.m32797g(androidComposeView, "this$0");
        androidComposeView.updatePositionCacheAndDispatch();
    }

    /* access modifiers changed from: private */
    /* renamed from: sendHoverExitEvent$lambda-5  reason: not valid java name */
    public static final void m34788sendHoverExitEvent$lambda5(AndroidComposeView androidComposeView) {
        C19383o.m32797g(androidComposeView, "this$0");
        boolean z = false;
        androidComposeView.hoverExitReceived = false;
        MotionEvent motionEvent = androidComposeView.previousMotionEvent;
        C19383o.m32794d(motionEvent);
        if (motionEvent.getActionMasked() == 10) {
            z = true;
        }
        if (z) {
            androidComposeView.m34789sendMotionEvent8iAsVTc(motionEvent);
            return;
        }
        throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.".toString());
    }

    /* renamed from: sendMotionEvent-8iAsVTc  reason: not valid java name */
    private final int m34789sendMotionEvent8iAsVTc(MotionEvent motionEvent) {
        C1648s sVar;
        C1647r a = this.motionEventAdapter.mo6600a(motionEvent, this);
        boolean z = false;
        if (a != null) {
            List<C1648s> list = a.f3671a;
            ListIterator<C1648s> listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    sVar = null;
                    break;
                }
                sVar = listIterator.previous();
                if (sVar.f3677e) {
                    break;
                }
            }
            C1648s sVar2 = sVar;
            if (sVar2 != null) {
                this.lastDownPointerPosition = sVar2.f3676d;
            }
            int a2 = this.pointerInputEventProcessor.mo6621a(a, this, isInBounds(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0 || actionMasked == 5) {
                if ((a2 & 1) != 0) {
                    z = true;
                }
                if (!z) {
                    C1636h hVar = this.motionEventAdapter;
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    hVar.f3637c.delete(pointerId);
                    hVar.f3636b.delete(pointerId);
                }
            }
            return a2;
        }
        C1649t tVar = this.pointerInputEventProcessor;
        tVar.f3684c.f3667a.clear();
        C1634f fVar = tVar.f3683b;
        ((C1639k) fVar.f3631d).mo6604c();
        ((C1639k) fVar.f3631d).f3650a.mo20235g();
        return 0;
    }

    /* access modifiers changed from: private */
    public final void sendSimulatedEvent(MotionEvent motionEvent, int i, long j, boolean z) {
        MotionEvent motionEvent2 = motionEvent;
        int i2 = i;
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (!(i2 == 9 || i2 == 10)) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i3 >= 0 ? 1 : 0);
        if (pointerCount != 0) {
            MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
            for (int i4 = 0; i4 < pointerCount; i4++) {
                pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
            }
            MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
            for (int i5 = 0; i5 < pointerCount; i5++) {
                pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
            }
            int i6 = 0;
            while (i6 < pointerCount) {
                int i7 = ((i3 < 0 || i6 < i3) ? 0 : 1) + i6;
                motionEvent2.getPointerProperties(i7, pointerPropertiesArr[i6]);
                MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
                motionEvent2.getPointerCoords(i7, pointerCoords);
                long r11 = m34794localToScreenMKHz9U(C19421p.m32952q(pointerCoords.x, pointerCoords.y));
                pointerCoords.x = C8343c.m16642c(r11);
                pointerCoords.y = C8343c.m16643d(r11);
                i6++;
            }
            MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j : motionEvent.getDownTime(), j, i, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
            C1636h hVar = this.motionEventAdapter;
            C19383o.m32796f(obtain, "event");
            C1647r a = hVar.mo6600a(obtain, this);
            C19383o.m32794d(a);
            this.pointerInputEventProcessor.mo6621a(a, this, true);
            obtain.recycle();
        }
    }

    public static /* synthetic */ void sendSimulatedEvent$default(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i, long j, boolean z, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            z = true;
        }
        androidComposeView.sendSimulatedEvent(motionEvent, i, j, z);
    }

    private void setFontFamilyResolver(C1952g.C1953a aVar) {
        this.fontFamilyResolver$delegate.setValue(aVar);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.layoutDirection$delegate.setValue(layoutDirection);
    }

    private final void setViewTreeOwners(C1759b bVar) {
        this.viewTreeOwners$delegate.setValue(bVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: touchModeChangeListener$lambda-3  reason: not valid java name */
    public static final void m34790touchModeChangeListener$lambda3(AndroidComposeView androidComposeView, boolean z) {
        C19383o.m32797g(androidComposeView, "this$0");
        androidComposeView._inputModeManager.f9580b.setValue(new C4350a(z ? 1 : 2));
        C1470e.m3129b(androidComposeView._focusManager.f3146a);
    }

    private final void updatePositionCacheAndDispatch() {
        getLocationOnScreen(this.tmpPositionArray);
        long j = this.globalPosition;
        int i = C7287g.f16165c;
        boolean z = false;
        if (!(((int) (j >> 32)) == this.tmpPositionArray[0] && C7287g.m13992b(j) == this.tmpPositionArray[1])) {
            int[] iArr = this.tmpPositionArray;
            this.globalPosition = C19421p.m32949o(iArr[0], iArr[1]);
            z = true;
        }
        this.measureAndLayoutDelegate.mo6920a(z);
    }

    public final void addAndroidView(AndroidViewHolder androidViewHolder, LayoutNode layoutNode) {
        C19383o.m32797g(androidViewHolder, "view");
        C19383o.m32797g(layoutNode, "layoutNode");
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(androidViewHolder, layoutNode);
        getAndroidViewsHandler$ui_release().addView(androidViewHolder);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(layoutNode, androidViewHolder);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5229s(androidViewHolder, 1);
        C2364y.m5201p(androidViewHolder, new C1760c(layoutNode, this, this));
    }

    public void autofill(SparseArray<AutofillValue> sparseArray) {
        C8277a aVar;
        C19383o.m32797g(sparseArray, ResponseConstants.VALUES);
        if (autofillSupported() && (aVar = this._autofill) != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                AutofillValue autofillValue = sparseArray.get(keyAt);
                C8280d dVar = C8280d.f18147a;
                C19383o.m32796f(autofillValue, "value");
                if (dVar.mo20881d(autofillValue)) {
                    C8282f fVar = aVar.f18144b;
                    String obj = dVar.mo20886i(autofillValue).toString();
                    fVar.getClass();
                    C19383o.m32797g(obj, "value");
                    C8281e eVar = (C8281e) fVar.f18148a.get(Integer.valueOf(keyAt));
                } else if (dVar.mo20879b(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for date");
                } else if (dVar.mo20880c(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541: Add onFill() callback for list");
                } else if (dVar.mo20882e(autofillValue)) {
                    throw new NotImplementedError("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                }
            }
        }
    }

    public final Object boundsUpdatesEventLoop(C19340c<? super C19394m> cVar) {
        Object a = this.accessibilityDelegate.mo7067a(cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    /* renamed from: calculateLocalPosition-MK-Hz9U  reason: not valid java name */
    public long m34791calculateLocalPositionMKHz9U(long j) {
        recalculateWindowPosition();
        return C0761x.m1747u0(j, this.windowToViewMatrix);
    }

    /* renamed from: calculatePositionInWindow-MK-Hz9U  reason: not valid java name */
    public long m34792calculatePositionInWindowMKHz9U(long j) {
        recalculateWindowPosition();
        return C0761x.m1747u0(j, this.viewToWindowMatrix);
    }

    public boolean canScrollHorizontally(int i) {
        return this.accessibilityDelegate.mo7068b(i, this.lastDownPointerPosition, false);
    }

    public boolean canScrollVertically(int i) {
        return this.accessibilityDelegate.mo7068b(i, this.lastDownPointerPosition, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x001b A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.p015ui.node.C1749o createLayer(p753kq.C19857l<? super androidx.compose.p015ui.graphics.C1537o, kotlin.C19394m> r4, p753kq.C19846a<kotlin.C19394m> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "drawBlock"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            java.lang.String r0 = "invalidateParentLayer"
            kotlin.jvm.internal.C19383o.m32797g(r5, r0)
            androidx.compose.ui.platform.o1<androidx.compose.ui.node.o> r0 = r3.layerCache
        L_0x000c:
            java.lang.ref.ReferenceQueue<T> r1 = r0.f4116b
            java.lang.ref.Reference r1 = r1.poll()
            if (r1 == 0) goto L_0x0019
            r.e<java.lang.ref.Reference<T>> r2 = r0.f4115a
            r2.mo20241o(r1)
        L_0x0019:
            if (r1 != 0) goto L_0x000c
        L_0x001b:
            r.e<java.lang.ref.Reference<T>> r1 = r0.f4115a
            boolean r1 = r1.mo20240n()
            if (r1 == 0) goto L_0x0036
            r.e<java.lang.ref.Reference<T>> r1 = r0.f4115a
            int r2 = r1.f17157d
            int r2 = r2 + -1
            java.lang.Object r1 = r1.mo20243q(r2)
            java.lang.ref.Reference r1 = (java.lang.ref.Reference) r1
            java.lang.Object r1 = r1.get()
            if (r1 == 0) goto L_0x001b
            goto L_0x0037
        L_0x0036:
            r1 = 0
        L_0x0037:
            androidx.compose.ui.node.o r1 = (androidx.compose.p015ui.node.C1749o) r1
            if (r1 == 0) goto L_0x003f
            r1.reuseLayer(r4, r5)
            return r1
        L_0x003f:
            boolean r0 = r3.isHardwareAccelerated()
            if (r0 == 0) goto L_0x0052
            boolean r0 = r3.isRenderNodeCompatible
            if (r0 == 0) goto L_0x0052
            androidx.compose.ui.platform.RenderNodeLayer r0 = new androidx.compose.ui.platform.RenderNodeLayer     // Catch:{ all -> 0x004f }
            r0.<init>(r3, r4, r5)     // Catch:{ all -> 0x004f }
            return r0
        L_0x004f:
            r0 = 0
            r3.isRenderNodeCompatible = r0
        L_0x0052:
            androidx.compose.ui.platform.DrawChildContainer r0 = r3.viewLayersContainer
            if (r0 != 0) goto L_0x0093
            androidx.compose.ui.platform.ViewLayer$a r0 = androidx.compose.p015ui.platform.ViewLayer.Companion
            r0.getClass()
            boolean r0 = androidx.compose.p015ui.platform.ViewLayer.hasRetrievedMethod
            if (r0 != 0) goto L_0x006d
            android.view.View r0 = new android.view.View
            android.content.Context r1 = r3.getContext()
            r0.<init>(r1)
            androidx.compose.p015ui.platform.ViewLayer.C1796a.m3952a(r0)
        L_0x006d:
            boolean r0 = androidx.compose.p015ui.platform.ViewLayer.shouldUseDispatchDraw
            java.lang.String r1 = "context"
            if (r0 == 0) goto L_0x0082
            androidx.compose.ui.platform.DrawChildContainer r0 = new androidx.compose.ui.platform.DrawChildContainer
            android.content.Context r2 = r3.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r2, r1)
            r0.<init>(r2)
            goto L_0x008e
        L_0x0082:
            androidx.compose.ui.platform.ViewLayerContainer r0 = new androidx.compose.ui.platform.ViewLayerContainer
            android.content.Context r2 = r3.getContext()
            kotlin.jvm.internal.C19383o.m32796f(r2, r1)
            r0.<init>(r2)
        L_0x008e:
            r3.viewLayersContainer = r0
            r3.addView(r0)
        L_0x0093:
            androidx.compose.ui.platform.ViewLayer r0 = new androidx.compose.ui.platform.ViewLayer
            androidx.compose.ui.platform.DrawChildContainer r1 = r3.viewLayersContainer
            kotlin.jvm.internal.C19383o.m32794d(r1)
            r0.<init>(r3, r1, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeView.createLayer(kq.l, kq.a):androidx.compose.ui.node.o");
    }

    public void dispatchDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
        if (!isAttachedToWindow()) {
            invalidateLayers(getRoot());
        }
        measureAndLayout(true);
        this.isDrawingContent = true;
        C1539p pVar = this.canvasHolder;
        C1491b bVar = pVar.f3336a;
        Canvas canvas2 = bVar.f3219a;
        bVar.f3219a = canvas;
        LayoutNode root2 = getRoot();
        root2.getClass();
        C19383o.m32797g(bVar, "canvas");
        root2.f3801E.f3875g.mo6785V0(bVar);
        pVar.f3336a.mo6272z(canvas2);
        if (!this.dirtyLayers.isEmpty()) {
            int size = this.dirtyLayers.size();
            for (int i = 0; i < size; i++) {
                this.dirtyLayers.get(i).updateDisplayList();
            }
        }
        ViewLayer.Companion.getClass();
        if (ViewLayer.shouldUseDispatchDraw) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        this.dirtyLayers.clear();
        this.isDrawingContent = false;
        List<C1749o> list = this.postponedDirtyLayers;
        if (list != null) {
            this.dirtyLayers.addAll(list);
            list.clear();
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "event");
        return motionEvent.getActionMasked() == 8 ? motionEvent.isFromSource(4194304) ? handleRotaryEvent(motionEvent) : (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : (m34786handleMotionEvent8iAsVTc(motionEvent) & 1) != 0 : super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x010c, code lost:
        if (r1 != Integer.MIN_VALUE) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchHoverEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.C19383o.m32797g(r15, r0)
            boolean r0 = r14.hoverExitReceived
            if (r0 == 0) goto L_0x0013
            java.lang.Runnable r0 = r14.sendHoverExitEvent
            r14.removeCallbacks(r0)
            java.lang.Runnable r0 = r14.sendHoverExitEvent
            r0.run()
        L_0x0013:
            boolean r0 = r14.isBadMotionEvent(r15)
            r1 = 0
            if (r0 != 0) goto L_0x0153
            boolean r0 = r14.isAttachedToWindow()
            if (r0 != 0) goto L_0x0022
            goto L_0x0153
        L_0x0022:
            r0 = 4098(0x1002, float:5.743E-42)
            boolean r0 = r15.isFromSource(r0)
            r2 = 10
            r3 = 7
            r4 = 1
            if (r0 == 0) goto L_0x0112
            int r0 = r15.getToolType(r1)
            if (r0 != r4) goto L_0x0112
            androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat r0 = r14.accessibilityDelegate
            r0.getClass()
            boolean r5 = r0.mo7075j()
            if (r5 != 0) goto L_0x0041
            goto L_0x0111
        L_0x0041:
            int r5 = r15.getAction()
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r3) goto L_0x0067
            r3 = 9
            if (r5 == r3) goto L_0x0067
            if (r5 == r2) goto L_0x0051
            goto L_0x0111
        L_0x0051:
            int r1 = r0.f3955b
            if (r1 == r6) goto L_0x005a
            r0.mo7085z(r6)
            goto L_0x0110
        L_0x005a:
            androidx.compose.ui.platform.AndroidComposeView r0 = r0.f3954a
            androidx.compose.ui.platform.AndroidViewsHandler r0 = r0.getAndroidViewsHandler$ui_release()
            boolean r15 = r0.dispatchGenericMotionEvent(r15)
        L_0x0064:
            r1 = r15
            goto L_0x0111
        L_0x0067:
            float r1 = r15.getX()
            float r2 = r15.getY()
            androidx.compose.ui.platform.AndroidComposeView r3 = r0.f3954a
            r5 = 0
            r3.measureAndLayout(r4)
            androidx.compose.ui.node.c r3 = new androidx.compose.ui.node.c
            r3.<init>()
            androidx.compose.ui.platform.AndroidComposeView r7 = r0.f3954a
            androidx.compose.ui.node.LayoutNode r7 = r7.getRoot()
            long r1 = kotlin.reflect.C19421p.m32952q(r1, r2)
            androidx.compose.ui.node.LayoutNode$b r8 = androidx.compose.p015ui.node.LayoutNode.f3792V
            r13 = 1
            r7.getClass()
            androidx.compose.ui.node.OuterMeasurablePlaceable r8 = r7.f3801E
            androidx.compose.ui.node.LayoutNodeWrapper r8 = r8.f3875g
            long r9 = r8.mo6788Y0(r1)
            androidx.compose.ui.node.OuterMeasurablePlaceable r1 = r7.f3801E
            androidx.compose.ui.node.LayoutNodeWrapper r7 = r1.f3875g
            androidx.compose.ui.node.LayoutNodeWrapper$b r8 = androidx.compose.p015ui.node.LayoutNodeWrapper.f3846B
            r12 = 1
            r11 = r3
            r7.mo6796g1(r8, r9, r11, r12, r13)
            java.lang.Object r1 = kotlin.collections.C19327t.m32646b1(r3)
            androidx.compose.ui.semantics.k r1 = (androidx.compose.p015ui.semantics.C1904k) r1
            if (r1 == 0) goto L_0x00af
            androidx.compose.ui.node.LayoutNodeWrapper r1 = r1.f3919b
            androidx.compose.ui.node.LayoutNode r1 = r1.f3850f
            if (r1 == 0) goto L_0x00af
            androidx.compose.ui.semantics.k r5 = p628nj.C18263b.m30825T(r1)
        L_0x00af:
            if (r5 == 0) goto L_0x00fe
            androidx.compose.ui.semantics.j r1 = r5.mo7349c()
            M r2 = r5.f3920c
            androidx.compose.ui.semantics.l r2 = (androidx.compose.p015ui.semantics.C1905l) r2
            r2.getId()
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r5.f3919b
            androidx.compose.ui.node.LayoutNode r3 = r2.f3850f
            boolean r7 = r1.f4247c
            if (r7 == 0) goto L_0x00cd
            androidx.compose.ui.semantics.k r2 = p628nj.C18263b.m30824S(r3)
            if (r2 != 0) goto L_0x00cb
            r2 = r5
        L_0x00cb:
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r2.f3919b
        L_0x00cd:
            androidx.compose.ui.semantics.p<kotlin.m> r3 = androidx.compose.p015ui.semantics.SemanticsProperties.f4201l
            boolean r1 = r1.mo7343c(r3)
            if (r1 != 0) goto L_0x00fe
            boolean r1 = r2.mo6799j1()
            if (r1 != 0) goto L_0x00fe
            androidx.compose.ui.platform.AndroidComposeView r1 = r0.f3954a
            androidx.compose.ui.platform.AndroidViewsHandler r1 = r1.getAndroidViewsHandler$ui_release()
            java.util.HashMap r1 = r1.getLayoutNodeToHolder()
            androidx.compose.ui.node.LayoutNodeWrapper r2 = r5.f3919b
            androidx.compose.ui.node.LayoutNode r2 = r2.f3850f
            java.lang.Object r1 = r1.get(r2)
            androidx.compose.ui.viewinterop.AndroidViewHolder r1 = (androidx.compose.p015ui.viewinterop.AndroidViewHolder) r1
            if (r1 != 0) goto L_0x00fe
            M r1 = r5.f3920c
            androidx.compose.ui.semantics.l r1 = (androidx.compose.p015ui.semantics.C1905l) r1
            int r1 = r1.getId()
            int r1 = r0.mo7077p(r1)
            goto L_0x00ff
        L_0x00fe:
            r1 = r6
        L_0x00ff:
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.f3954a
            androidx.compose.ui.platform.AndroidViewsHandler r2 = r2.getAndroidViewsHandler$ui_release()
            boolean r15 = r2.dispatchGenericMotionEvent(r15)
            r0.mo7085z(r1)
            if (r1 != r6) goto L_0x0110
            goto L_0x0064
        L_0x0110:
            r1 = r4
        L_0x0111:
            return r1
        L_0x0112:
            int r0 = r15.getActionMasked()
            if (r0 == r3) goto L_0x0144
            if (r0 == r2) goto L_0x011b
            goto L_0x014b
        L_0x011b:
            boolean r0 = r14.isInBounds(r15)
            if (r0 == 0) goto L_0x014b
            int r0 = r15.getToolType(r1)
            r2 = 3
            if (r0 == r2) goto L_0x013d
            android.view.MotionEvent r0 = r14.previousMotionEvent
            if (r0 == 0) goto L_0x012f
            r0.recycle()
        L_0x012f:
            android.view.MotionEvent r15 = android.view.MotionEvent.obtainNoHistory(r15)
            r14.previousMotionEvent = r15
            r14.hoverExitReceived = r4
            java.lang.Runnable r15 = r14.sendHoverExitEvent
            r14.post(r15)
            return r1
        L_0x013d:
            int r0 = r15.getButtonState()
            if (r0 == 0) goto L_0x014b
            return r1
        L_0x0144:
            boolean r0 = r14.isPositionChanged(r15)
            if (r0 != 0) goto L_0x014b
            return r1
        L_0x014b:
            int r15 = r14.m34786handleMotionEvent8iAsVTc(r15)
            r15 = r15 & r4
            if (r15 == 0) goto L_0x0153
            r1 = r4
        L_0x0153:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "event");
        return isFocused() ? m34797sendKeyEventZmokQxo(keyEvent) : super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C19383o.m32797g(motionEvent, "motionEvent");
        if (this.hoverExitReceived) {
            removeCallbacks(this.sendHoverExitEvent);
            MotionEvent motionEvent2 = this.previousMotionEvent;
            C19383o.m32794d(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || hasChangedDevices(motionEvent, motionEvent2)) {
                this.sendHoverExitEvent.run();
            } else {
                this.hoverExitReceived = false;
            }
        }
        if (isBadMotionEvent(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !isPositionChanged(motionEvent)) {
            return false;
        }
        int r4 = m34786handleMotionEvent8iAsVTc(motionEvent);
        if ((r4 & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (r4 & 1) != 0;
    }

    public final void drawAndroidView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        C19383o.m32797g(androidViewHolder, "view");
        C19383o.m32797g(canvas, "canvas");
        getAndroidViewsHandler$ui_release().drawView(androidViewHolder, canvas);
    }

    public final View findViewByAccessibilityIdTraversal(int i) {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return findViewByAccessibilityIdRootedAtCurrentView(i, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[]{Integer.TYPE});
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(this, new Object[]{Integer.valueOf(i)});
            if (invoke instanceof View) {
                return (View) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public void forceMeasureTheSubtree(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "layoutNode");
        this.measureAndLayoutDelegate.mo6922c(layoutNode);
    }

    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this._androidViewsHandler == null) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(context);
            this._androidViewsHandler = androidViewsHandler;
            addView(androidViewsHandler);
        }
        AndroidViewsHandler androidViewsHandler2 = this._androidViewsHandler;
        C19383o.m32794d(androidViewsHandler2);
        return androidViewsHandler2;
    }

    public C8278b getAutofill() {
        return this._autofill;
    }

    public C8282f getAutofillTree() {
        return this.autofillTree;
    }

    public final C19857l<Configuration, C19394m> getConfigurationChangeObserver() {
        return this.configurationChangeObserver;
    }

    public C7282b getDensity() {
        return this.density;
    }

    /* renamed from: getFocusDirection-P8AzH3I  reason: not valid java name */
    public C1465a m34793getFocusDirectionP8AzH3I(KeyEvent keyEvent) {
        C1465a aVar;
        C19383o.m32797g(keyEvent, "keyEvent");
        long a = C1613c.m3423a(keyEvent);
        int i = C1611a.f3586k;
        int i2 = 1;
        if (C1611a.m3422a(a, C1611a.f3582g)) {
            if (keyEvent.isShiftPressed()) {
                i2 = 2;
            }
            return new C1465a(i2);
        }
        if (C1611a.m3422a(a, C1611a.f3580e)) {
            aVar = new C1465a(4);
        } else if (C1611a.m3422a(a, C1611a.f3579d)) {
            aVar = new C1465a(3);
        } else if (C1611a.m3422a(a, C1611a.f3577b)) {
            aVar = new C1465a(5);
        } else if (C1611a.m3422a(a, C1611a.f3578c)) {
            aVar = new C1465a(6);
        } else {
            if (C1611a.m3422a(a, C1611a.f3581f) ? true : C1611a.m3422a(a, C1611a.f3583h) ? true : C1611a.m3422a(a, C1611a.f3585j)) {
                aVar = new C1465a(7);
            } else {
                if (!C1611a.m3422a(a, C1611a.f3576a)) {
                    i2 = C1611a.m3422a(a, C1611a.f3584i);
                }
                if (i2 == 0) {
                    return null;
                }
                aVar = new C1465a(8);
            }
        }
        return aVar;
    }

    public C1469d getFocusManager() {
        return this._focusManager;
    }

    public void getFocusedRect(Rect rect) {
        C19394m mVar;
        C19383o.m32797g(rect, "rect");
        FocusModifier a = C1470e.m3128a(this._focusManager.f3146a);
        if (a != null) {
            C8345d d = C1484q.m3155d(a);
            rect.left = C7279a.m13954l(d.f18301a);
            rect.top = C7279a.m13954l(d.f18302b);
            rect.right = C7279a.m13954l(d.f18303c);
            rect.bottom = C7279a.m13954l(d.f18304d);
            mVar = C19394m.f43287a;
        } else {
            mVar = null;
        }
        if (mVar == null) {
            super.getFocusedRect(rect);
        }
    }

    public C1952g.C1953a getFontFamilyResolver() {
        return (C1952g.C1953a) this.fontFamilyResolver$delegate.getValue();
    }

    public C1950f.C1951a getFontLoader() {
        return this.fontLoader;
    }

    public C3449a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !this.measureAndLayoutDelegate.f3924b.f3890b.isEmpty();
    }

    public C4351b getInputModeManager() {
        return this._inputModeManager;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.lastMatrixRecalculationAnimationTime;
    }

    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.layoutDirection$delegate.getValue();
    }

    public long getMeasureIteration() {
        C1743j jVar = this.measureAndLayoutDelegate;
        if (jVar.f3925c) {
            return jVar.f3928f;
        }
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass".toString());
    }

    public C1642n getPointerIconService() {
        return this.pointerIconService;
    }

    public LayoutNode getRoot() {
        return this.root;
    }

    public C1755t getRootForTest() {
        return this.rootForTest;
    }

    public C1907n getSemanticsOwner() {
        return this.semanticsOwner;
    }

    public C1741h getSharedDrawScope() {
        return this.sharedDrawScope;
    }

    public boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.snapshotObserver;
    }

    public C2002t getTextInputService() {
        return this.textInputService;
    }

    public C1822c1 getTextToolbar() {
        return this.textToolbar;
    }

    public View getView() {
        return this;
    }

    public C1843j1 getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final C1759b getViewTreeOwners() {
        return (C1759b) this.viewTreeOwners$delegate.getValue();
    }

    public C1863p1 getWindowInfo() {
        return this._windowInfo;
    }

    public void invalidateDescendants() {
        invalidateLayers(getRoot());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (r0 = r0.f3946a).getLifecycle();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isLifecycleInResumedState() {
        /*
            r2 = this;
            androidx.compose.ui.platform.AndroidComposeView$b r0 = r2.getViewTreeOwners()
            if (r0 == 0) goto L_0x0015
            androidx.lifecycle.s r0 = r0.f3946a
            if (r0 == 0) goto L_0x0015
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L_0x0015
            androidx.lifecycle.Lifecycle$State r0 = r0.mo10734b()
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            androidx.lifecycle.Lifecycle$State r1 = androidx.lifecycle.Lifecycle.State.RESUMED
            if (r0 != r1) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeView.isLifecycleInResumedState():boolean");
    }

    public final Object keyboardVisibilityEventLoop(C19340c<? super C19394m> cVar) {
        Object f = this.textInputServiceAndroid.mo7642f(cVar);
        return f == CoroutineSingletons.COROUTINE_SUSPENDED ? f : C19394m.f43287a;
    }

    /* renamed from: localToScreen-MK-Hz9U  reason: not valid java name */
    public long m34794localToScreenMKHz9U(long j) {
        recalculateWindowPosition();
        long u0 = C0761x.m1747u0(j, this.viewToWindowMatrix);
        return C19421p.m32952q(C8343c.m16642c(this.windowPosition) + C8343c.m16642c(u0), C8343c.m16643d(this.windowPosition) + C8343c.m16643d(u0));
    }

    public void measureAndLayout(boolean z) {
        C19846a<C19394m> aVar;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z) {
            try {
                aVar = this.resendMotionEventOnLayout;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            aVar = null;
        }
        if (this.measureAndLayoutDelegate.mo6923d(aVar)) {
            requestLayout();
        }
        this.measureAndLayoutDelegate.mo6920a(false);
        C19394m mVar = C19394m.f43287a;
        Trace.endSection();
    }

    /* renamed from: measureAndLayout-0kLqBqw  reason: not valid java name */
    public void m34795measureAndLayout0kLqBqw(LayoutNode layoutNode, long j) {
        C19383o.m32797g(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.measureAndLayoutDelegate.mo6924e(layoutNode, j);
            this.measureAndLayoutDelegate.mo6920a(false);
            C19394m mVar = C19394m.f43287a;
        } finally {
            Trace.endSection();
        }
    }

    public final void notifyLayerIsDirty$ui_release(C1749o oVar, boolean z) {
        C19383o.m32797g(oVar, "layer");
        if (!z) {
            if (!this.isDrawingContent && !this.dirtyLayers.remove(oVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else if (!this.isDrawingContent) {
            this.dirtyLayers.add(oVar);
        } else {
            List list = this.postponedDirtyLayers;
            if (list == null) {
                list = new ArrayList();
                this.postponedDirtyLayers = list;
            }
            list.add(oVar);
        }
    }

    public void onAttach(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "node");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        r3 = r2.f3946a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            androidx.compose.ui.node.LayoutNode r0 = r4.getRoot()
            r4.invalidateLayoutNodeMeasurement(r0)
            androidx.compose.ui.node.LayoutNode r0 = r4.getRoot()
            r4.invalidateLayers(r0)
            androidx.compose.ui.node.OwnerSnapshotObserver r0 = r4.getSnapshotObserver()
            androidx.compose.runtime.snapshots.SnapshotStateObserver r0 = r0.f3885a
            r0.mo5986c()
            boolean r0 = r4.autofillSupported()
            if (r0 == 0) goto L_0x0029
            x.a r0 = r4._autofill
            if (r0 == 0) goto L_0x0029
            androidx.compose.ui.autofill.AutofillCallback r1 = androidx.compose.p015ui.autofill.AutofillCallback.INSTANCE
            r1.register(r0)
        L_0x0029:
            androidx.lifecycle.s r0 = com.google.android.play.core.assetpacks.C15588c1.m25325f0(r4)
            androidx.savedstate.d r1 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.m7916a(r4)
            androidx.compose.ui.platform.AndroidComposeView$b r2 = r4.getViewTreeOwners()
            if (r2 == 0) goto L_0x0044
            if (r0 == 0) goto L_0x0042
            if (r1 == 0) goto L_0x0042
            androidx.lifecycle.s r3 = r2.f3946a
            if (r0 != r3) goto L_0x0044
            if (r1 == r3) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r3 = 0
            goto L_0x0045
        L_0x0044:
            r3 = 1
        L_0x0045:
            if (r3 == 0) goto L_0x0084
            if (r0 == 0) goto L_0x007c
            if (r1 == 0) goto L_0x0074
            if (r2 == 0) goto L_0x005a
            androidx.lifecycle.s r2 = r2.f3946a
            if (r2 == 0) goto L_0x005a
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            if (r2 == 0) goto L_0x005a
            r2.mo10735c(r4)
        L_0x005a:
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
            r2.mo10733a(r4)
            androidx.compose.ui.platform.AndroidComposeView$b r2 = new androidx.compose.ui.platform.AndroidComposeView$b
            r2.<init>(r0, r1)
            r4.setViewTreeOwners(r2)
            kq.l<? super androidx.compose.ui.platform.AndroidComposeView$b, kotlin.m> r0 = r4.onViewTreeOwnersAvailable
            if (r0 == 0) goto L_0x0070
            r0.invoke(r2)
        L_0x0070:
            r0 = 0
            r4.onViewTreeOwnersAvailable = r0
            goto L_0x0084
        L_0x0074:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!"
            r0.<init>(r1)
            throw r0
        L_0x007c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            r0.<init>(r1)
            throw r0
        L_0x0084:
            androidx.compose.ui.platform.AndroidComposeView$b r0 = r4.getViewTreeOwners()
            kotlin.jvm.internal.C19383o.m32794d(r0)
            androidx.lifecycle.s r0 = r0.f3946a
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.mo10733a(r4)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r4.globalLayoutListener
            r0.addOnGlobalLayoutListener(r1)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnScrollChangedListener r1 = r4.scrollChangedListener
            r0.addOnScrollChangedListener(r1)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            android.view.ViewTreeObserver$OnTouchModeChangeListener r1 = r4.touchModeChangeListener
            r0.addOnTouchModeChangeListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeView.onAttachedToWindow():void");
    }

    public boolean onCheckIsTextEditor() {
        return this.textInputServiceAndroid.f4453c;
    }

    public void onConfigurationChanged(Configuration configuration) {
        C19383o.m32797g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        this.density = C15588c1.m25318c(context);
        if (getFontWeightAdjustmentCompat(configuration) != this.currentFontWeightAdjustment) {
            this.currentFontWeightAdjustment = getFontWeightAdjustmentCompat(configuration);
            Context context2 = getContext();
            C19383o.m32796f(context2, ResponseConstants.CONTEXT);
            setFontFamilyResolver(C15588c1.m25304S(context2));
        }
        this.configurationChangeObserver.invoke(configuration);
    }

    public /* bridge */ /* synthetic */ void onCreate(C2887s sVar) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:110:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r18) {
        /*
            r17 = this;
            r0 = r18
            java.lang.String r1 = "outAttrs"
            kotlin.jvm.internal.C19383o.m32797g(r0, r1)
            r1 = r17
            androidx.compose.ui.text.input.TextInputServiceAndroid r2 = r1.textInputServiceAndroid
            r2.getClass()
            boolean r3 = r2.f4453c
            if (r3 != 0) goto L_0x0015
            r0 = 0
            goto L_0x0181
        L_0x0015:
            androidx.compose.ui.text.input.j r3 = r2.f4457g
            androidx.compose.ui.text.input.TextFieldValue r4 = r2.f4456f
            java.lang.String r5 = "imeOptions"
            kotlin.jvm.internal.C19383o.m32797g(r3, r5)
            java.lang.String r5 = "textFieldValue"
            kotlin.jvm.internal.C19383o.m32797g(r4, r5)
            int r5 = r3.f4485e
            r6 = 1
            r7 = 0
            if (r5 != r6) goto L_0x002b
            r8 = r6
            goto L_0x002c
        L_0x002b:
            r8 = r7
        L_0x002c:
            r9 = 4
            r10 = 7
            r11 = 5
            r12 = 6
            r13 = 3
            r14 = 2
            if (r8 == 0) goto L_0x003d
            boolean r8 = r3.f4481a
            if (r8 == 0) goto L_0x003a
            goto L_0x007a
        L_0x003a:
            r8 = r7
            goto L_0x007b
        L_0x003d:
            if (r5 != 0) goto L_0x0041
            r8 = r6
            goto L_0x0042
        L_0x0041:
            r8 = r7
        L_0x0042:
            if (r8 == 0) goto L_0x0046
            r8 = r6
            goto L_0x007b
        L_0x0046:
            if (r5 != r14) goto L_0x004a
            r8 = r6
            goto L_0x004b
        L_0x004a:
            r8 = r7
        L_0x004b:
            if (r8 == 0) goto L_0x004f
            r8 = r14
            goto L_0x007b
        L_0x004f:
            if (r5 != r12) goto L_0x0053
            r8 = r6
            goto L_0x0054
        L_0x0053:
            r8 = r7
        L_0x0054:
            if (r8 == 0) goto L_0x0058
            r8 = r11
            goto L_0x007b
        L_0x0058:
            if (r5 != r11) goto L_0x005c
            r8 = r6
            goto L_0x005d
        L_0x005c:
            r8 = r7
        L_0x005d:
            if (r8 == 0) goto L_0x0061
            r8 = r10
            goto L_0x007b
        L_0x0061:
            if (r5 != r13) goto L_0x0065
            r8 = r6
            goto L_0x0066
        L_0x0065:
            r8 = r7
        L_0x0066:
            if (r8 == 0) goto L_0x006a
            r8 = r13
            goto L_0x007b
        L_0x006a:
            if (r5 != r9) goto L_0x006e
            r8 = r6
            goto L_0x006f
        L_0x006e:
            r8 = r7
        L_0x006f:
            if (r8 == 0) goto L_0x0073
            r8 = r9
            goto L_0x007b
        L_0x0073:
            if (r5 != r10) goto L_0x0077
            r8 = r6
            goto L_0x0078
        L_0x0077:
            r8 = r7
        L_0x0078:
            if (r8 == 0) goto L_0x018e
        L_0x007a:
            r8 = r12
        L_0x007b:
            r0.imeOptions = r8
            int r15 = r3.f4484d
            if (r15 != r6) goto L_0x0084
            r16 = r6
            goto L_0x0086
        L_0x0084:
            r16 = r7
        L_0x0086:
            if (r16 == 0) goto L_0x008c
            r0.inputType = r6
            goto L_0x00f2
        L_0x008c:
            if (r15 != r14) goto L_0x0091
            r16 = r6
            goto L_0x0093
        L_0x0091:
            r16 = r7
        L_0x0093:
            if (r16 == 0) goto L_0x009e
            r0.inputType = r6
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 | r9
            r0.imeOptions = r8
            goto L_0x00f2
        L_0x009e:
            if (r15 != r13) goto L_0x00a2
            r8 = r6
            goto L_0x00a3
        L_0x00a2:
            r8 = r7
        L_0x00a3:
            if (r8 == 0) goto L_0x00a9
            r0.inputType = r14
            goto L_0x00f2
        L_0x00a9:
            if (r15 != r9) goto L_0x00ad
            r8 = r6
            goto L_0x00ae
        L_0x00ad:
            r8 = r7
        L_0x00ae:
            if (r8 == 0) goto L_0x00b3
            r0.inputType = r13
            goto L_0x00f2
        L_0x00b3:
            if (r15 != r11) goto L_0x00b7
            r8 = r6
            goto L_0x00b8
        L_0x00b7:
            r8 = r7
        L_0x00b8:
            if (r8 == 0) goto L_0x00bf
            r8 = 17
            r0.inputType = r8
            goto L_0x00f2
        L_0x00bf:
            if (r15 != r12) goto L_0x00c3
            r8 = r6
            goto L_0x00c4
        L_0x00c3:
            r8 = r7
        L_0x00c4:
            if (r8 == 0) goto L_0x00cb
            r8 = 33
            r0.inputType = r8
            goto L_0x00f2
        L_0x00cb:
            if (r15 != r10) goto L_0x00cf
            r8 = r6
            goto L_0x00d0
        L_0x00cf:
            r8 = r7
        L_0x00d0:
            if (r8 == 0) goto L_0x00d7
            r8 = 129(0x81, float:1.81E-43)
            r0.inputType = r8
            goto L_0x00f2
        L_0x00d7:
            r8 = 8
            if (r15 != r8) goto L_0x00dd
            r8 = r6
            goto L_0x00de
        L_0x00dd:
            r8 = r7
        L_0x00de:
            if (r8 == 0) goto L_0x00e5
            r8 = 18
            r0.inputType = r8
            goto L_0x00f2
        L_0x00e5:
            r8 = 9
            if (r15 != r8) goto L_0x00eb
            r8 = r6
            goto L_0x00ec
        L_0x00eb:
            r8 = r7
        L_0x00ec:
            if (r8 == 0) goto L_0x0182
            r8 = 8194(0x2002, float:1.1482E-41)
            r0.inputType = r8
        L_0x00f2:
            boolean r8 = r3.f4481a
            if (r8 != 0) goto L_0x0114
            int r8 = r0.inputType
            r9 = r8 & 1
            if (r9 != r6) goto L_0x00fe
            r9 = r6
            goto L_0x00ff
        L_0x00fe:
            r9 = r7
        L_0x00ff:
            if (r9 == 0) goto L_0x0114
            r9 = 131072(0x20000, float:1.83671E-40)
            r8 = r8 | r9
            r0.inputType = r8
            if (r5 != r6) goto L_0x010a
            r5 = r6
            goto L_0x010b
        L_0x010a:
            r5 = r7
        L_0x010b:
            if (r5 == 0) goto L_0x0114
            int r5 = r0.imeOptions
            r8 = 1073741824(0x40000000, float:2.0)
            r5 = r5 | r8
            r0.imeOptions = r5
        L_0x0114:
            int r5 = r0.inputType
            r8 = r5 & 1
            if (r8 != r6) goto L_0x011c
            r8 = r6
            goto L_0x011d
        L_0x011c:
            r8 = r7
        L_0x011d:
            if (r8 == 0) goto L_0x014f
            int r8 = r3.f4482b
            if (r8 != r6) goto L_0x0125
            r9 = r6
            goto L_0x0126
        L_0x0125:
            r9 = r7
        L_0x0126:
            if (r9 == 0) goto L_0x012d
            r5 = r5 | 4096(0x1000, float:5.74E-42)
            r0.inputType = r5
            goto L_0x0143
        L_0x012d:
            if (r8 != r14) goto L_0x0131
            r9 = r6
            goto L_0x0132
        L_0x0131:
            r9 = r7
        L_0x0132:
            if (r9 == 0) goto L_0x0139
            r5 = r5 | 8192(0x2000, float:1.14794E-41)
            r0.inputType = r5
            goto L_0x0143
        L_0x0139:
            if (r8 != r13) goto L_0x013c
            goto L_0x013d
        L_0x013c:
            r6 = r7
        L_0x013d:
            if (r6 == 0) goto L_0x0143
            r5 = r5 | 16384(0x4000, float:2.2959E-41)
            r0.inputType = r5
        L_0x0143:
            boolean r3 = r3.f4483c
            if (r3 == 0) goto L_0x014f
            int r3 = r0.inputType
            r5 = 32768(0x8000, float:4.5918E-41)
            r3 = r3 | r5
            r0.inputType = r3
        L_0x014f:
            long r5 = r4.f4449b
            int r3 = androidx.compose.p015ui.text.C2022r.f4596c
            r3 = 32
            long r7 = r5 >> r3
            int r3 = (int) r7
            r0.initialSelStart = r3
            int r3 = androidx.compose.p015ui.text.C2022r.m4464c(r5)
            r0.initialSelEnd = r3
            androidx.compose.ui.text.a r3 = r4.f4448a
            java.lang.String r3 = r3.f4296b
            p099f1.C6768a.m13160a(r0, r3)
            int r3 = r0.imeOptions
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r3 = r3 | r4
            r0.imeOptions = r3
            androidx.compose.ui.text.input.TextFieldValue r0 = r2.f4456f
            androidx.compose.ui.text.input.j r3 = r2.f4457g
            boolean r3 = r3.f4483c
            androidx.compose.ui.text.input.u r4 = new androidx.compose.ui.text.input.u
            r4.<init>(r2)
            androidx.compose.ui.text.input.RecordingInputConnection r5 = new androidx.compose.ui.text.input.RecordingInputConnection
            r5.<init>(r0, r4, r3)
            r2.f4458h = r5
            r0 = r5
        L_0x0181:
            return r0
        L_0x0182:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid Keyboard Type"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x018e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "invalid ImeAction"
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    public /* bridge */ /* synthetic */ void onDestroy(C2887s sVar) {
    }

    public void onDetach(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "node");
        C1743j jVar = this.measureAndLayoutDelegate;
        jVar.getClass();
        jVar.f3924b.mo6832b(layoutNode);
        requestClearInvalidObservations();
    }

    public void onDetachedFromWindow() {
        C8277a aVar;
        C2887s sVar;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        OwnerSnapshotObserver snapshotObserver2 = getSnapshotObserver();
        C1384e eVar = snapshotObserver2.f3885a.f3003e;
        if (eVar != null) {
            eVar.dispose();
        }
        snapshotObserver2.f3885a.mo5984a();
        C1759b viewTreeOwners = getViewTreeOwners();
        if (!(viewTreeOwners == null || (sVar = viewTreeOwners.f3946a) == null || (lifecycle = sVar.getLifecycle()) == null)) {
            lifecycle.mo10735c(this);
        }
        if (autofillSupported() && (aVar = this._autofill) != null) {
            AutofillCallback.INSTANCE.unregister(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.globalLayoutListener);
        getViewTreeObserver().removeOnScrollChangedListener(this.scrollChangedListener);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.touchModeChangeListener);
    }

    public void onDraw(Canvas canvas) {
        C19383o.m32797g(canvas, "canvas");
    }

    public void onEndApplyChanges() {
        if (this.observationClearRequested) {
            getSnapshotObserver().mo6823a();
            this.observationClearRequested = false;
        }
        AndroidViewsHandler androidViewsHandler = this._androidViewsHandler;
        if (androidViewsHandler != null) {
            clearChildInvalidObservations(androidViewsHandler);
        }
        while (this.endApplyChangesListeners.mo20240n()) {
            int i = this.endApplyChangesListeners.f17157d;
            for (int i2 = 0; i2 < i; i2++) {
                T[] tArr = this.endApplyChangesListeners.f17155b;
                C19846a aVar = (C19846a) tArr[i2];
                tArr[i2] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            C7734e<C19846a<C19394m>> eVar = this.endApplyChangesListeners;
            if (i > 0) {
                int i3 = eVar.f17157d;
                if (i < i3) {
                    T[] tArr2 = eVar.f17155b;
                    C19318k.m32603U0(tArr2, 0, tArr2, i, i3);
                }
                int i4 = eVar.f17157d;
                int i5 = i4 - (i + 0);
                int i6 = i4 - 1;
                if (i5 <= i6) {
                    int i7 = i5;
                    while (true) {
                        eVar.f17155b[i7] = null;
                        if (i7 == i6) {
                            break;
                        }
                        i7++;
                    }
                }
                eVar.f17157d = i5;
            } else {
                eVar.getClass();
            }
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        Log.d(FocusTag, "Owner FocusChanged(" + z + ')');
        FocusManagerImpl focusManagerImpl = this._focusManager;
        if (z) {
            FocusModifier focusModifier = focusManagerImpl.f3146a;
            if (focusModifier.f3153e == FocusStateImpl.Inactive) {
                focusModifier.mo6187b(FocusStateImpl.Active);
                return;
            }
            return;
        }
        C1482p.m3145c(focusManagerImpl.f3146a, true);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.onMeasureConstraints = null;
        updatePositionCacheAndDispatch();
        if (this._androidViewsHandler != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
    }

    public void onLayoutChange(LayoutNode layoutNode) {
        C19383o.m32797g(layoutNode, "layoutNode");
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.accessibilityDelegate;
        androidComposeViewAccessibilityDelegateCompat.getClass();
        androidComposeViewAccessibilityDelegateCompat.f3966m = true;
        if (androidComposeViewAccessibilityDelegateCompat.mo7075j()) {
            androidComposeViewAccessibilityDelegateCompat.mo7076k(layoutNode);
        }
    }

    public void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                invalidateLayoutNodeMeasurement(getRoot());
            }
            Pair<Integer, Integer> convertMeasureSpec = convertMeasureSpec(i);
            int intValue = convertMeasureSpec.component1().intValue();
            int intValue2 = convertMeasureSpec.component2().intValue();
            Pair<Integer, Integer> convertMeasureSpec2 = convertMeasureSpec(i2);
            long q = C0114h.m313q(intValue, intValue2, convertMeasureSpec2.component1().intValue(), convertMeasureSpec2.component2().intValue());
            C7280a aVar = this.onMeasureConstraints;
            boolean z = false;
            if (aVar == null) {
                this.onMeasureConstraints = new C7280a(q);
                this.wasMeasuredWithMultipleConstraints = false;
            } else {
                if (aVar != null) {
                    z = C7280a.m13957b(aVar.f16152a, q);
                }
                if (!z) {
                    this.wasMeasuredWithMultipleConstraints = true;
                }
            }
            this.measureAndLayoutDelegate.mo6928i(q);
            this.measureAndLayoutDelegate.mo6923d(this.resendMotionEventOnLayout);
            setMeasuredDimension(getRoot().f3801E.f3722b, getRoot().f3801E.f3723c);
            if (this._androidViewsHandler != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f3801E.f3722b, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f3801E.f3723c, 1073741824));
            }
            C19394m mVar = C19394m.f43287a;
        } finally {
            Trace.endSection();
        }
    }

    public /* bridge */ /* synthetic */ void onPause(C2887s sVar) {
    }

    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C8277a aVar;
        if (autofillSupported() && viewStructure != null && (aVar = this._autofill) != null) {
            int a = C8279c.f18146a.mo20874a(viewStructure, aVar.f18144b.f18148a.size());
            for (Map.Entry entry : aVar.f18144b.f18148a.entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                C8281e eVar = (C8281e) entry.getValue();
                C8279c cVar = C8279c.f18146a;
                ViewStructure b = cVar.mo20875b(viewStructure, a);
                if (b == null) {
                    a++;
                } else {
                    C8280d dVar = C8280d.f18147a;
                    AutofillId a2 = dVar.mo20878a(viewStructure);
                    C19383o.m32794d(a2);
                    dVar.mo20884g(b, a2, intValue);
                    cVar.mo20877d(b, intValue, aVar.f18143a.getContext().getPackageName(), (String) null, (String) null);
                    dVar.mo20885h(b, 1);
                    eVar.getClass();
                    throw null;
                }
            }
        }
    }

    public void onRequestMeasure(LayoutNode layoutNode, boolean z) {
        C19383o.m32797g(layoutNode, "layoutNode");
        if (this.measureAndLayoutDelegate.mo6927h(layoutNode, z)) {
            scheduleMeasureAndLayout(layoutNode);
        }
    }

    public void onRequestRelayout(LayoutNode layoutNode, boolean z) {
        C19383o.m32797g(layoutNode, "layoutNode");
        if (this.measureAndLayoutDelegate.mo6926g(layoutNode, z)) {
            scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
        }
    }

    public void onResume(C2887s sVar) {
        C19383o.m32797g(sVar, ResponseConstants.OWNER);
        setShowLayoutBounds(C1758a.m3900a(Companion));
    }

    public void onRtlPropertiesChanged(int i) {
        if (this.superclassInitComplete) {
            C19857l<? super C1998p, ? extends C2002t> lVar = AndroidComposeView_androidKt.f3985a;
            LayoutDirection layoutDirection = i != 0 ? i != 1 ? LayoutDirection.Ltr : LayoutDirection.Rtl : LayoutDirection.Ltr;
            setLayoutDirection(layoutDirection);
            FocusManagerImpl focusManagerImpl = this._focusManager;
            focusManagerImpl.getClass();
            C19383o.m32797g(layoutDirection, "<set-?>");
            focusManagerImpl.f3148c = layoutDirection;
        }
    }

    public void onSemanticsChange() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.accessibilityDelegate;
        androidComposeViewAccessibilityDelegateCompat.f3966m = true;
        if (androidComposeViewAccessibilityDelegateCompat.mo7075j() && !androidComposeViewAccessibilityDelegateCompat.f3972s) {
            androidComposeViewAccessibilityDelegateCompat.f3972s = true;
            androidComposeViewAccessibilityDelegateCompat.f3957d.post(androidComposeViewAccessibilityDelegateCompat.f3973t);
        }
    }

    public /* bridge */ /* synthetic */ void onStart(C2887s sVar) {
    }

    public /* bridge */ /* synthetic */ void onStop(C2887s sVar) {
    }

    public void onWindowFocusChanged(boolean z) {
        boolean a;
        this._windowInfo.f4129a.setValue(Boolean.valueOf(z));
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (a = C1758a.m3900a(Companion))) {
            setShowLayoutBounds(a);
            invalidateDescendants();
        }
    }

    public final boolean recycle$ui_release(C1749o oVar) {
        Reference<? extends T> poll;
        C19383o.m32797g(oVar, "layer");
        if (this.viewLayersContainer != null) {
            ViewLayer.Companion.getClass();
            boolean unused = ViewLayer.shouldUseDispatchDraw;
        }
        C1860o1<C1749o> o1Var = this.layerCache;
        do {
            poll = o1Var.f4116b.poll();
            if (poll != null) {
                o1Var.f4115a.mo20241o(poll);
                continue;
            }
        } while (poll != null);
        o1Var.f4115a.mo20232c(new WeakReference(oVar, o1Var.f4116b));
        return true;
    }

    public void registerOnEndApplyChangesListener(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        if (!this.endApplyChangesListeners.mo20236j(aVar)) {
            this.endApplyChangesListeners.mo20232c(aVar);
        }
    }

    public void registerOnLayoutCompletedListener(C1750p.C1751a aVar) {
        C19383o.m32797g(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        C1743j jVar = this.measureAndLayoutDelegate;
        jVar.getClass();
        jVar.f3927e.mo20232c(aVar);
        scheduleMeasureAndLayout$default(this, (LayoutNode) null, 1, (Object) null);
    }

    public final void removeAndroidView(AndroidViewHolder androidViewHolder) {
        C19383o.m32797g(androidViewHolder, "view");
        getAndroidViewsHandler$ui_release().removeView(androidViewHolder);
        HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder = getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
        LayoutNode remove = getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(androidViewHolder);
        C19389t.m32909c(layoutNodeToHolder);
        layoutNodeToHolder.remove(remove);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5229s(androidViewHolder, 0);
    }

    public final void requestClearInvalidObservations() {
        this.observationClearRequested = true;
    }

    /* renamed from: screenToLocal-MK-Hz9U  reason: not valid java name */
    public long m34796screenToLocalMKHz9U(long j) {
        recalculateWindowPosition();
        float c = C8343c.m16642c(j) - C8343c.m16642c(this.windowPosition);
        float d = C8343c.m16643d(j) - C8343c.m16643d(this.windowPosition);
        return C0761x.m1747u0(C19421p.m32952q(c, d), this.windowToViewMatrix);
    }

    /* renamed from: sendKeyEvent-ZmokQxo  reason: not valid java name */
    public boolean m34797sendKeyEventZmokQxo(KeyEvent keyEvent) {
        FocusModifier b;
        LayoutNode layoutNode;
        C19383o.m32797g(keyEvent, "keyEvent");
        C1614d dVar = this.keyInputModifier;
        dVar.getClass();
        FocusModifier focusModifier = dVar.f3590d;
        if (!(focusModifier == null || (b = C1484q.m3153b(focusModifier)) == null)) {
            LayoutNodeWrapper layoutNodeWrapper = b.f3161m;
            C1614d dVar2 = null;
            if (!(layoutNodeWrapper == null || (layoutNode = layoutNodeWrapper.f3850f) == null)) {
                C7734e<C1614d> eVar = b.f3164p;
                int i = eVar.f17157d;
                if (i > 0) {
                    int i2 = 0;
                    T[] tArr = eVar.f17155b;
                    do {
                        C1614d dVar3 = (C1614d) tArr[i2];
                        if (C19383o.m32792b(dVar3.f3592f, layoutNode)) {
                            if (dVar2 != null) {
                                LayoutNode layoutNode2 = dVar3.f3592f;
                                C1614d dVar4 = dVar2;
                                while (true) {
                                    if (!C19383o.m32792b(dVar4, dVar3)) {
                                        dVar4 = dVar4.f3591e;
                                        if (dVar4 != null) {
                                            if (!C19383o.m32792b(dVar4.f3592f, layoutNode2)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                }
                            }
                            dVar2 = dVar3;
                        }
                        i2++;
                    } while (i2 < i);
                }
                if (dVar2 == null) {
                    dVar2 = b.f3163o;
                }
            }
            if (dVar2 != null) {
                if (dVar2.mo6534b(keyEvent)) {
                    return true;
                }
                return dVar2.mo6533a(keyEvent);
            }
        }
        throw new IllegalStateException("KeyEvent can't be processed because this key input node is not active.".toString());
    }

    public final void setConfigurationChangeObserver(C19857l<? super Configuration, C19394m> lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.configurationChangeObserver = lVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.lastMatrixRecalculationAnimationTime = j;
    }

    public final void setOnViewTreeOwnersAvailable(C19857l<? super C1759b, C19394m> lVar) {
        C19383o.m32797g(lVar, "callback");
        C1759b viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.onViewTreeOwnersAvailable = lVar;
        }
    }

    public void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public C1841j getAccessibilityManager() {
        return this.accessibilityManager;
    }

    public C1844k getClipboardManager() {
        return this.clipboardManager;
    }

    private final void recalculateWindowPosition(MotionEvent motionEvent) {
        this.lastMatrixRecalculationAnimationTime = AnimationUtils.currentAnimationTimeMillis();
        recalculateWindowViewTransforms();
        long u0 = C0761x.m1747u0(C19421p.m32952q(motionEvent.getX(), motionEvent.getY()), this.viewToWindowMatrix);
        this.windowPosition = C19421p.m32952q(motionEvent.getRawX() - C8343c.m16642c(u0), motionEvent.getRawY() - C8343c.m16643d(u0));
    }
}
