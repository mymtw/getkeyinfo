package androidx.drawerlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.activity.C0114h;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import com.etsy.android.R;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p088e1.C6697d;
import p123h1.C6916c;
import p260v0.C8184a;
import p289y0.C8352d;

public class DrawerLayout extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.drawerlayout.widget.DrawerLayout";
    private static final boolean ALLOW_EDGE_LOCK = false;
    public static final boolean CAN_HIDE_DESCENDANTS = true;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    public static final int[] LAYOUT_ATTRS = {16842931};
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION = true;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "DrawerLayout";
    private static final int[] THEME_ATTRS = {16843828};
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private static boolean sEdgeSizeUsingSystemGestureInsets;
    private final C6697d mActionDismiss;
    private final C2649d mChildAccessibilityDelegate;
    private Rect mChildHitRect;
    private Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private Object mLastInsets;
    private final C2651f mLeftCallback;
    private final C6916c mLeftDragger;
    private C2650e mListener;
    private List<C2650e> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final ArrayList<View> mNonDrawerViews;
    private final C2651f mRightCallback;
    private final C6916c mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private Paint mScrimPaint;
    private Drawable mShadowEnd;
    private Drawable mShadowLeft;
    private Drawable mShadowLeftResolved;
    private Drawable mShadowRight;
    private Drawable mShadowRightResolved;
    private Drawable mShadowStart;
    private Drawable mStatusBarBackground;
    private CharSequence mTitleLeft;
    private CharSequence mTitleRight;

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$a */
    public class C2646a implements C6697d {
        public C2646a() {
        }

        /* renamed from: a */
        public final boolean mo10006a(View view) {
            if (!DrawerLayout.this.isDrawerOpen(view) || DrawerLayout.this.getDrawerLockMode(view) == 2) {
                return false;
            }
            DrawerLayout.this.closeDrawer(view);
            return true;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$b */
    public class C2647b implements View.OnApplyWindowInsetsListener {
        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ((DrawerLayout) view).setChildInsets(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
            return windowInsets.consumeSystemWindowInsets();
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$c */
    public class C2648c extends C2273a {

        /* renamed from: a */
        public final Rect f5989a = new Rect();

        public C2648c() {
        }

        public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            CharSequence drawerTitle;
            if (accessibilityEvent.getEventType() != 32) {
                return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
            }
            List<CharSequence> text = accessibilityEvent.getText();
            View findVisibleDrawer = DrawerLayout.this.findVisibleDrawer();
            if (findVisibleDrawer == null || (drawerTitle = DrawerLayout.this.getDrawerTitle(DrawerLayout.this.getDrawerViewAbsoluteGravity(findVisibleDrawer))) == null) {
                return true;
            }
            text.add(drawerTitle);
            return true;
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(DrawerLayout.ACCESSIBILITY_CLASS_NAME);
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
                super.onInitializeAccessibilityNodeInfo(view, bVar);
            } else {
                AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(bVar.f14759a);
                C6689b bVar2 = new C6689b(obtain);
                super.onInitializeAccessibilityNodeInfo(view, bVar2);
                bVar.f14761c = -1;
                bVar.f14759a.setSource(view);
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                ViewParent f = C2364y.C2368d.m5216f(view);
                if (f instanceof View) {
                    bVar.f14760b = -1;
                    bVar.f14759a.setParent((View) f);
                }
                Rect rect = this.f5989a;
                obtain.getBoundsInScreen(rect);
                bVar.f14759a.setBoundsInScreen(rect);
                bVar.f14759a.setVisibleToUser(bVar2.mo18860i());
                bVar.f14759a.setPackageName(obtain.getPackageName());
                bVar.mo18867q(obtain.getClassName());
                bVar.mo18870t(bVar2.mo18856f());
                bVar.f14759a.setEnabled(obtain.isEnabled());
                bVar.f14759a.setFocused(obtain.isFocused());
                bVar.mo18863m(obtain.isAccessibilityFocused());
                bVar.f14759a.setSelected(obtain.isSelected());
                bVar.mo18850a(obtain.getActions());
                bVar2.mo18861k();
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (DrawerLayout.includeChildForAccessibility(childAt)) {
                        bVar.f14759a.addChild(childAt);
                    }
                }
            }
            bVar.mo18867q(DrawerLayout.ACCESSIBILITY_CLASS_NAME);
            bVar.f14759a.setFocusable(false);
            bVar.f14759a.setFocused(false);
            bVar.mo18862l(C6689b.C6690a.f14762e);
            bVar.mo18862l(C6689b.C6690a.f14763f);
        }

        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
                return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
            }
            return false;
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$d */
    public static final class C2649d extends C2273a {
        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            if (!DrawerLayout.includeChildForAccessibility(view)) {
                bVar.f14760b = -1;
                bVar.f14759a.setParent((View) null);
            }
        }
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$e */
    public interface C2650e {
        /* renamed from: a */
        void mo10008a();

        /* renamed from: b */
        void mo10009b();

        /* renamed from: c */
        void mo10010c();

        /* renamed from: d */
        void mo10011d();
    }

    /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f */
    public class C2651f extends C6916c.C6919c {

        /* renamed from: a */
        public final int f5991a;

        /* renamed from: b */
        public C6916c f5992b;

        /* renamed from: c */
        public final C2652a f5993c = new C2652a();

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$f$a */
        public class C2652a implements Runnable {
            public C2652a() {
            }

            public final void run() {
                View view;
                int i;
                C2651f fVar = C2651f.this;
                int i2 = fVar.f5992b.f15322o;
                int i3 = 3;
                int i4 = 0;
                boolean z = fVar.f5991a == 3;
                if (z) {
                    view = DrawerLayout.this.findDrawerWithGravity(3);
                    if (view != null) {
                        i4 = -view.getWidth();
                    }
                    i = i4 + i2;
                } else {
                    view = DrawerLayout.this.findDrawerWithGravity(5);
                    i = DrawerLayout.this.getWidth() - i2;
                }
                if (view == null) {
                    return;
                }
                if (((z && view.getLeft() < i) || (!z && view.getLeft() > i)) && DrawerLayout.this.getDrawerLockMode(view) == 0) {
                    fVar.f5992b.mo19058v(view, i, view.getTop());
                    ((LayoutParams) view.getLayoutParams()).isPeeking = true;
                    DrawerLayout.this.invalidate();
                    if (fVar.f5991a == 3) {
                        i3 = 5;
                    }
                    View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i3);
                    if (findDrawerWithGravity != null) {
                        DrawerLayout.this.closeDrawer(findDrawerWithGravity);
                    }
                    DrawerLayout.this.cancelChildViewTouch();
                }
            }
        }

        public C2651f(int i) {
            this.f5991a = i;
        }

        /* renamed from: a */
        public final int mo10012a(View view, int i) {
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        /* renamed from: b */
        public final int mo10013b(View view, int i) {
            return view.getTop();
        }

        /* renamed from: c */
        public final int mo10014c(View view) {
            if (DrawerLayout.this.isDrawerView(view)) {
                return view.getWidth();
            }
            return 0;
        }

        /* renamed from: e */
        public final void mo10015e(int i, int i2) {
            View findDrawerWithGravity = (i & 1) == 1 ? DrawerLayout.this.findDrawerWithGravity(3) : DrawerLayout.this.findDrawerWithGravity(5);
            if (findDrawerWithGravity != null && DrawerLayout.this.getDrawerLockMode(findDrawerWithGravity) == 0) {
                this.f5992b.mo19041c(i2, findDrawerWithGravity);
            }
        }

        /* renamed from: f */
        public final void mo10016f() {
            DrawerLayout.this.postDelayed(this.f5993c, 160);
        }

        /* renamed from: g */
        public final void mo10017g(int i, View view) {
            ((LayoutParams) view.getLayoutParams()).isPeeking = false;
            int i2 = 3;
            if (this.f5991a == 3) {
                i2 = 5;
            }
            View findDrawerWithGravity = DrawerLayout.this.findDrawerWithGravity(i2);
            if (findDrawerWithGravity != null) {
                DrawerLayout.this.closeDrawer(findDrawerWithGravity);
            }
        }

        /* renamed from: h */
        public final void mo10018h(int i) {
            DrawerLayout.this.updateDrawerState(i, this.f5992b.f15327t);
        }

        /* renamed from: i */
        public final void mo10019i(View view, int i, int i2) {
            int width = view.getWidth();
            float width2 = (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3) ? (float) (i + width) : (float) (DrawerLayout.this.getWidth() - i)) / ((float) width);
            DrawerLayout.this.setDrawerViewOffset(view, width2);
            view.setVisibility(width2 == 0.0f ? 4 : 0);
            DrawerLayout.this.invalidate();
        }

        /* renamed from: j */
        public final void mo10020j(float f, float f2, View view) {
            int i;
            float drawerViewOffset = DrawerLayout.this.getDrawerViewOffset(view);
            int width = view.getWidth();
            if (DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, 3)) {
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && drawerViewOffset > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f < 0.0f || (f == 0.0f && drawerViewOffset > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f5992b.mo19056t(i, view.getTop());
            DrawerLayout.this.invalidate();
        }

        /* renamed from: k */
        public final boolean mo10021k(int i, View view) {
            return DrawerLayout.this.isDrawerView(view) && DrawerLayout.this.checkDrawerViewAbsoluteGravity(view, this.f5991a) && DrawerLayout.this.getDrawerLockMode(view) == 0;
        }
    }

    static {
        boolean z = true;
        int i = Build.VERSION.SDK_INT;
        if (i < 29) {
            z = false;
        }
        sEdgeSizeUsingSystemGestureInsets = z;
    }

    public DrawerLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private boolean dispatchTransformedGenericPointerEvent(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent transformedMotionEvent = getTransformedMotionEvent(motionEvent, view);
            boolean dispatchGenericMotionEvent = view.dispatchGenericMotionEvent(transformedMotionEvent);
            transformedMotionEvent.recycle();
            return dispatchGenericMotionEvent;
        }
        float scrollX = (float) (getScrollX() - view.getLeft());
        float scrollY = (float) (getScrollY() - view.getTop());
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean dispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return dispatchGenericMotionEvent2;
    }

    private MotionEvent getTransformedMotionEvent(MotionEvent motionEvent, View view) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.offsetLocation((float) (getScrollX() - view.getLeft()), (float) (getScrollY() - view.getTop()));
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.mChildInvertedMatrix == null) {
                this.mChildInvertedMatrix = new Matrix();
            }
            matrix.invert(this.mChildInvertedMatrix);
            obtain.transform(this.mChildInvertedMatrix);
        }
        return obtain;
    }

    public static String gravityToString(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    private static boolean hasOpaqueBackground(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    private boolean hasPeekingDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).isPeeking) {
                return true;
            }
        }
        return false;
    }

    private boolean hasVisibleDrawer() {
        return findVisibleDrawer() != null;
    }

    public static boolean includeChildForAccessibility(View view) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return (C2364y.C2368d.m5213c(view) == 4 || C2364y.C2368d.m5213c(view) == 2) ? false : true;
    }

    private boolean isInBoundsOfChild(float f, float f2, View view) {
        if (this.mChildHitRect == null) {
            this.mChildHitRect = new Rect();
        }
        view.getHitRect(this.mChildHitRect);
        return this.mChildHitRect.contains((int) f, (int) f2);
    }

    private void mirror(Drawable drawable, int i) {
        if (drawable != null && drawable.isAutoMirrored()) {
            drawable.setLayoutDirection(i);
        }
    }

    private Drawable resolveLeftShadow() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int d = C2364y.C2369e.m5233d(this);
        if (d == 0) {
            Drawable drawable = this.mShadowStart;
            if (drawable != null) {
                mirror(drawable, d);
                return this.mShadowStart;
            }
        } else {
            Drawable drawable2 = this.mShadowEnd;
            if (drawable2 != null) {
                mirror(drawable2, d);
                return this.mShadowEnd;
            }
        }
        return this.mShadowLeft;
    }

    private Drawable resolveRightShadow() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int d = C2364y.C2369e.m5233d(this);
        if (d == 0) {
            Drawable drawable = this.mShadowEnd;
            if (drawable != null) {
                mirror(drawable, d);
                return this.mShadowEnd;
            }
        } else {
            Drawable drawable2 = this.mShadowStart;
            if (drawable2 != null) {
                mirror(drawable2, d);
                return this.mShadowStart;
            }
        }
        return this.mShadowRight;
    }

    private void resolveShadowDrawables() {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            this.mShadowLeftResolved = resolveLeftShadow();
            this.mShadowRightResolved = resolveRightShadow();
        }
    }

    private void updateChildAccessibilityAction(View view) {
        C6689b.C6690a aVar = C6689b.C6690a.f14772o;
        C2364y.m5198m(aVar.mo18875a(), view);
        C2364y.m5195j(0, view);
        if (isDrawerOpen(view) && getDrawerLockMode(view) != 2) {
            C2364y.m5199n(view, aVar, this.mActionDismiss);
        }
    }

    private void updateChildrenImportantForAccessibility(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((z || isDrawerView(childAt)) && (!z || childAt != view)) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5229s(childAt, 4);
            } else {
                WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                C2364y.C2368d.m5229s(childAt, 1);
            }
        }
    }

    public void addDrawerListener(C2650e eVar) {
        if (eVar != null) {
            if (this.mListeners == null) {
                this.mListeners = new ArrayList();
            }
            this.mListeners.add(eVar);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() != 393216) {
            int childCount = getChildCount();
            boolean z = false;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (!isDrawerView(childAt)) {
                    this.mNonDrawerViews.add(childAt);
                } else if (isDrawerOpen(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            }
            if (!z) {
                int size = this.mNonDrawerViews.size();
                for (int i4 = 0; i4 < size; i4++) {
                    View view = this.mNonDrawerViews.get(i4);
                    if (view.getVisibility() == 0) {
                        view.addFocusables(arrayList, i, i2);
                    }
                }
            }
            this.mNonDrawerViews.clear();
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (findOpenDrawer() != null || isDrawerView(view)) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5229s(view, 4);
        } else {
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            C2364y.C2368d.m5229s(view, 1);
        }
        if (!CAN_HIDE_DESCENDANTS) {
            C2364y.m5201p(view, this.mChildAccessibilityDelegate);
        }
    }

    public void cancelChildViewTouch() {
        if (!this.mChildrenCanceledTouch) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.mChildrenCanceledTouch = true;
        }
    }

    public boolean checkDrawerViewAbsoluteGravity(View view, int i) {
        return (getDrawerViewAbsoluteGravity(view) & i) == i;
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void close() {
        closeDrawer(8388611);
    }

    public void closeDrawer(View view) {
        closeDrawer(view, true);
    }

    public void closeDrawers() {
        closeDrawers(false);
    }

    public void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((LayoutParams) getChildAt(i).getLayoutParams()).onScreen);
        }
        this.mScrimOpacity = f;
        boolean h = this.mLeftDragger.mo19046h();
        boolean h2 = this.mRightDragger.mo19046h();
        if (h || h2) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() == 10 || this.mScrimOpacity <= 0.0f) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        int childCount = getChildCount();
        if (childCount == 0) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        for (int i = childCount - 1; i >= 0; i--) {
            View childAt = getChildAt(i);
            if (isInBoundsOfChild(x, y, childAt) && !isContentView(childAt) && dispatchTransformedGenericPointerEvent(motionEvent, childAt)) {
                return true;
            }
        }
        return false;
    }

    public void dispatchOnDrawerClosed(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.openState & 1) == 1) {
            layoutParams.openState = 0;
            List<C2650e> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).mo10010c();
                }
            }
            updateChildrenImportantForAccessibility(view, false);
            updateChildAccessibilityAction(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    public void dispatchOnDrawerOpened(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.openState & 1) == 0) {
            layoutParams.openState = 1;
            List<C2650e> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).mo10011d();
                }
            }
            updateChildrenImportantForAccessibility(view, true);
            updateChildAccessibilityAction(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public void dispatchOnDrawerSlide(View view, float f) {
        List<C2650e> list = this.mListeners;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    this.mListeners.get(size).mo10009b();
                } else {
                    return;
                }
            }
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Canvas canvas2 = canvas;
        View view2 = view;
        int height = getHeight();
        boolean isContentView = isContentView(view2);
        int width = getWidth();
        int save = canvas.save();
        int i = 0;
        if (isContentView) {
            int childCount = getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view2 && childAt.getVisibility() == 0 && hasOpaqueBackground(childAt) && isDrawerView(childAt) && childAt.getHeight() >= height) {
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, width, getHeight());
            i = i2;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.mScrimOpacity;
        if (f > 0.0f && isContentView) {
            int i4 = this.mScrimColor;
            this.mScrimPaint.setColor((i4 & 16777215) | (((int) (((float) ((-16777216 & i4) >>> 24)) * f)) << 24));
            canvas.drawRect((float) i, 0.0f, (float) width, (float) getHeight(), this.mScrimPaint);
        } else if (this.mShadowLeftResolved != null && checkDrawerViewAbsoluteGravity(view2, 3)) {
            int intrinsicWidth = this.mShadowLeftResolved.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max(0.0f, Math.min(((float) right2) / ((float) this.mLeftDragger.f15322o), 1.0f));
            this.mShadowLeftResolved.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.mShadowLeftResolved.setAlpha((int) (max * 255.0f));
            this.mShadowLeftResolved.draw(canvas);
        } else if (this.mShadowRightResolved != null && checkDrawerViewAbsoluteGravity(view2, 5)) {
            int intrinsicWidth2 = this.mShadowRightResolved.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max(0.0f, Math.min(((float) (getWidth() - left2)) / ((float) this.mRightDragger.f15322o), 1.0f));
            this.mShadowRightResolved.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.mShadowRightResolved.setAlpha((int) (max2 * 255.0f));
            this.mShadowRightResolved.draw(canvas);
        }
        return drawChild;
    }

    public View findDrawerWithGravity(int i) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C2364y.C2369e.m5233d(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((getDrawerViewAbsoluteGravity(childAt) & 7) == absoluteGravity) {
                return childAt;
            }
        }
        return null;
    }

    public View findOpenDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((LayoutParams) childAt.getLayoutParams()).openState & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public View findVisibleDrawer() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt) && isDrawerVisible(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public float getDrawerElevation() {
        if (SET_DRAWER_SHADOW_FROM_ELEVATION) {
            return this.mDrawerElevation;
        }
        return 0.0f;
    }

    public int getDrawerLockMode(int i) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int d = C2364y.C2369e.m5233d(this);
        if (i == 3) {
            int i2 = this.mLockModeLeft;
            if (i2 != 3) {
                return i2;
            }
            int i3 = d == 0 ? this.mLockModeStart : this.mLockModeEnd;
            if (i3 != 3) {
                return i3;
            }
            return 0;
        } else if (i == 5) {
            int i4 = this.mLockModeRight;
            if (i4 != 3) {
                return i4;
            }
            int i5 = d == 0 ? this.mLockModeEnd : this.mLockModeStart;
            if (i5 != 3) {
                return i5;
            }
            return 0;
        } else if (i == 8388611) {
            int i6 = this.mLockModeStart;
            if (i6 != 3) {
                return i6;
            }
            int i7 = d == 0 ? this.mLockModeLeft : this.mLockModeRight;
            if (i7 != 3) {
                return i7;
            }
            return 0;
        } else if (i != 8388613) {
            return 0;
        } else {
            int i8 = this.mLockModeEnd;
            if (i8 != 3) {
                return i8;
            }
            int i9 = d == 0 ? this.mLockModeRight : this.mLockModeLeft;
            if (i9 != 3) {
                return i9;
            }
            return 0;
        }
    }

    public CharSequence getDrawerTitle(int i) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C2364y.C2369e.m5233d(this));
        if (absoluteGravity == 3) {
            return this.mTitleLeft;
        }
        if (absoluteGravity == 5) {
            return this.mTitleRight;
        }
        return null;
    }

    public int getDrawerViewAbsoluteGravity(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).gravity;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        return Gravity.getAbsoluteGravity(i, C2364y.C2369e.m5233d(this));
    }

    public float getDrawerViewOffset(View view) {
        return ((LayoutParams) view.getLayoutParams()).onScreen;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.mStatusBarBackground;
    }

    public boolean isContentView(View view) {
        return ((LayoutParams) view.getLayoutParams()).gravity == 0;
    }

    public boolean isDrawerOpen(View view) {
        if (isDrawerView(view)) {
            return (((LayoutParams) view.getLayoutParams()).openState & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isDrawerView(View view) {
        int i = ((LayoutParams) view.getLayoutParams()).gravity;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C2364y.C2369e.m5233d(view));
        return ((absoluteGravity & 3) == 0 && (absoluteGravity & 5) == 0) ? false : true;
    }

    public boolean isDrawerVisible(View view) {
        if (isDrawerView(view)) {
            return ((LayoutParams) view.getLayoutParams()).onScreen > 0.0f;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean isOpen() {
        return isDrawerOpen(8388611);
    }

    public void moveDrawerToOffset(View view, float f) {
        float drawerViewOffset = getDrawerViewOffset(view);
        float width = (float) view.getWidth();
        int i = ((int) (width * f)) - ((int) (drawerViewOffset * width));
        if (!checkDrawerViewAbsoluteGravity(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        setDrawerViewOffset(view, f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mFirstLayout = true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.mDrawStatusBarBackground && this.mStatusBarBackground != null) {
            Object obj = this.mLastInsets;
            int systemWindowInsetTop = obj != null ? ((WindowInsets) obj).getSystemWindowInsetTop() : 0;
            if (systemWindowInsetTop > 0) {
                this.mStatusBarBackground.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.mStatusBarBackground.draw(canvas);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        if (r0 != 3) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057 A[LOOP:0: B:8:0x0024->B:20:0x0057, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0055 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            h1.c r1 = r8.mLeftDragger
            boolean r1 = r1.mo19057u(r9)
            h1.c r2 = r8.mRightDragger
            boolean r2 = r2.mo19057u(r9)
            r1 = r1 | r2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0077
            if (r0 == r3) goto L_0x0070
            r9 = 2
            if (r0 == r9) goto L_0x001e
            r9 = 3
            if (r0 == r9) goto L_0x0070
            goto L_0x0075
        L_0x001e:
            h1.c r9 = r8.mLeftDragger
            float[] r0 = r9.f15311d
            int r0 = r0.length
            r4 = r2
        L_0x0024:
            if (r4 >= r0) goto L_0x005a
            int r5 = r9.f15318k
            int r6 = r3 << r4
            r5 = r5 & r6
            if (r5 == 0) goto L_0x002f
            r5 = r3
            goto L_0x0030
        L_0x002f:
            r5 = r2
        L_0x0030:
            if (r5 != 0) goto L_0x0033
            goto L_0x0052
        L_0x0033:
            float[] r5 = r9.f15313f
            r5 = r5[r4]
            float[] r6 = r9.f15311d
            r6 = r6[r4]
            float r5 = r5 - r6
            float[] r6 = r9.f15314g
            r6 = r6[r4]
            float[] r7 = r9.f15312e
            r7 = r7[r4]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r9.f15309b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0052
            r5 = r3
            goto L_0x0053
        L_0x0052:
            r5 = r2
        L_0x0053:
            if (r5 == 0) goto L_0x0057
            r9 = r3
            goto L_0x005b
        L_0x0057:
            int r4 = r4 + 1
            goto L_0x0024
        L_0x005a:
            r9 = r2
        L_0x005b:
            if (r9 == 0) goto L_0x0075
            androidx.drawerlayout.widget.DrawerLayout$f r9 = r8.mLeftCallback
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$f$a r9 = r9.f5993c
            r0.removeCallbacks(r9)
            androidx.drawerlayout.widget.DrawerLayout$f r9 = r8.mRightCallback
            androidx.drawerlayout.widget.DrawerLayout r0 = androidx.drawerlayout.widget.DrawerLayout.this
            androidx.drawerlayout.widget.DrawerLayout$f$a r9 = r9.f5993c
            r0.removeCallbacks(r9)
            goto L_0x0075
        L_0x0070:
            r8.closeDrawers(r3)
            r8.mChildrenCanceledTouch = r2
        L_0x0075:
            r9 = r2
            goto L_0x009f
        L_0x0077:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.mInitialMotionX = r0
            r8.mInitialMotionY = r9
            float r4 = r8.mScrimOpacity
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x009c
            h1.c r4 = r8.mLeftDragger
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r4.mo19047j(r0, r9)
            if (r9 == 0) goto L_0x009c
            boolean r9 = r8.isContentView(r9)
            if (r9 == 0) goto L_0x009c
            r9 = r3
            goto L_0x009d
        L_0x009c:
            r9 = r2
        L_0x009d:
            r8.mChildrenCanceledTouch = r2
        L_0x009f:
            if (r1 != 0) goto L_0x00ad
            if (r9 != 0) goto L_0x00ad
            boolean r9 = r8.hasPeekingDrawer()
            if (r9 != 0) goto L_0x00ad
            boolean r9 = r8.mChildrenCanceledTouch
            if (r9 == 0) goto L_0x00ae
        L_0x00ad:
            r2 = r3
        L_0x00ae:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4 || !hasVisibleDrawer()) {
            return super.onKeyDown(i, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        View findVisibleDrawer = findVisibleDrawer();
        if (findVisibleDrawer != null && getDrawerLockMode(findVisibleDrawer) == 0) {
            closeDrawers();
        }
        return findVisibleDrawer != null;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        WindowInsets rootWindowInsets;
        float f;
        int i5;
        boolean z2 = true;
        this.mInLayout = true;
        int i6 = i3 - i;
        int childCount = getChildCount();
        int i7 = 0;
        while (i7 < childCount) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (isContentView(childAt)) {
                    int i8 = layoutParams.leftMargin;
                    childAt.layout(i8, layoutParams.topMargin, childAt.getMeasuredWidth() + i8, childAt.getMeasuredHeight() + layoutParams.topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                        float f2 = (float) measuredWidth;
                        i5 = (-measuredWidth) + ((int) (layoutParams.onScreen * f2));
                        f = ((float) (measuredWidth + i5)) / f2;
                    } else {
                        float f3 = (float) measuredWidth;
                        int i9 = i6 - ((int) (layoutParams.onScreen * f3));
                        f = ((float) (i6 - i9)) / f3;
                        i5 = i9;
                    }
                    boolean z3 = f != layoutParams.onScreen ? z2 : false;
                    int i10 = layoutParams.gravity & 112;
                    if (i10 == 16) {
                        int i11 = i4 - i2;
                        int i12 = (i11 - measuredHeight) / 2;
                        int i13 = layoutParams.topMargin;
                        if (i12 < i13) {
                            i12 = i13;
                        } else {
                            int i14 = i12 + measuredHeight;
                            int i15 = layoutParams.bottomMargin;
                            if (i14 > i11 - i15) {
                                i12 = (i11 - i15) - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i12, measuredWidth + i5, measuredHeight + i12);
                    } else if (i10 != 80) {
                        int i16 = layoutParams.topMargin;
                        childAt.layout(i5, i16, measuredWidth + i5, measuredHeight + i16);
                    } else {
                        int i17 = i4 - i2;
                        childAt.layout(i5, (i17 - layoutParams.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i17 - layoutParams.bottomMargin);
                    }
                    if (z3) {
                        setDrawerViewOffset(childAt, f);
                    }
                    int i18 = layoutParams.onScreen > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i18) {
                        childAt.setVisibility(i18);
                    }
                }
            }
            i7++;
            z2 = true;
        }
        if (sEdgeSizeUsingSystemGestureInsets && (rootWindowInsets = getRootWindowInsets()) != null) {
            C8352d j = C2348w0.m5100k((View) null, rootWindowInsets).f5615a.mo8982j();
            C6916c cVar = this.mLeftDragger;
            cVar.f15322o = Math.max(cVar.f15323p, j.f18320a);
            C6916c cVar2 = this.mRightDragger;
            cVar2.f15322o = Math.max(cVar2.f15323p, j.f18322c);
        }
        this.mInLayout = false;
        this.mFirstLayout = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r17, int r18) {
        /*
            r16 = this;
            r0 = r16
            int r1 = android.view.View.MeasureSpec.getMode(r17)
            int r2 = android.view.View.MeasureSpec.getMode(r18)
            int r3 = android.view.View.MeasureSpec.getSize(r17)
            int r4 = android.view.View.MeasureSpec.getSize(r18)
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 1073741824(0x40000000, float:2.0)
            if (r1 != r6) goto L_0x001a
            if (r2 == r6) goto L_0x0026
        L_0x001a:
            boolean r6 = r16.isInEditMode()
            if (r6 == 0) goto L_0x01a1
            if (r1 != 0) goto L_0x0023
            r3 = r5
        L_0x0023:
            if (r2 != 0) goto L_0x0026
            r4 = r5
        L_0x0026:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.mLastInsets
            r2 = 0
            if (r1 == 0) goto L_0x0038
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r1 = androidx.core.view.C2364y.f5646a
            boolean r1 = androidx.core.view.C2364y.C2368d.m5212b(r16)
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = r2
        L_0x0039:
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r5 = androidx.core.view.C2364y.f5646a
            int r5 = androidx.core.view.C2364y.C2369e.m5233d(r16)
            int r6 = r16.getChildCount()
            r7 = r2
            r8 = r7
            r9 = r8
        L_0x0046:
            if (r2 >= r6) goto L_0x01a0
            android.view.View r10 = r0.getChildAt(r2)
            int r11 = r10.getVisibility()
            r12 = 8
            if (r11 != r12) goto L_0x0056
            goto L_0x00fc
        L_0x0056:
            android.view.ViewGroup$LayoutParams r11 = r10.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r11 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r11
            r12 = 3
            if (r1 == 0) goto L_0x00db
            int r13 = r11.gravity
            int r13 = android.view.Gravity.getAbsoluteGravity(r13, r5)
            boolean r14 = androidx.core.view.C2364y.C2368d.m5212b(r10)
            r15 = 5
            if (r14 == 0) goto L_0x0099
            java.lang.Object r14 = r0.mLastInsets
            android.view.WindowInsets r14 = (android.view.WindowInsets) r14
            if (r13 != r12) goto L_0x0083
            int r12 = r14.getSystemWindowInsetLeft()
            int r13 = r14.getSystemWindowInsetTop()
            int r15 = r14.getSystemWindowInsetBottom()
            android.view.WindowInsets r14 = r14.replaceSystemWindowInsets(r12, r13, r7, r15)
            goto L_0x0095
        L_0x0083:
            if (r13 != r15) goto L_0x0095
            int r12 = r14.getSystemWindowInsetTop()
            int r13 = r14.getSystemWindowInsetRight()
            int r15 = r14.getSystemWindowInsetBottom()
            android.view.WindowInsets r14 = r14.replaceSystemWindowInsets(r7, r12, r13, r15)
        L_0x0095:
            r10.dispatchApplyWindowInsets(r14)
            goto L_0x00db
        L_0x0099:
            java.lang.Object r12 = r0.mLastInsets
            android.view.WindowInsets r12 = (android.view.WindowInsets) r12
            r14 = 3
            if (r13 != r14) goto L_0x00b1
            int r13 = r12.getSystemWindowInsetLeft()
            int r14 = r12.getSystemWindowInsetTop()
            int r15 = r12.getSystemWindowInsetBottom()
            android.view.WindowInsets r12 = r12.replaceSystemWindowInsets(r13, r14, r7, r15)
            goto L_0x00c3
        L_0x00b1:
            if (r13 != r15) goto L_0x00c3
            int r13 = r12.getSystemWindowInsetTop()
            int r14 = r12.getSystemWindowInsetRight()
            int r15 = r12.getSystemWindowInsetBottom()
            android.view.WindowInsets r12 = r12.replaceSystemWindowInsets(r7, r13, r14, r15)
        L_0x00c3:
            int r13 = r12.getSystemWindowInsetLeft()
            r11.leftMargin = r13
            int r13 = r12.getSystemWindowInsetTop()
            r11.topMargin = r13
            int r13 = r12.getSystemWindowInsetRight()
            r11.rightMargin = r13
            int r12 = r12.getSystemWindowInsetBottom()
            r11.bottomMargin = r12
        L_0x00db:
            boolean r12 = r0.isContentView(r10)
            if (r12 == 0) goto L_0x0102
            int r7 = r11.leftMargin
            int r7 = r3 - r7
            int r12 = r11.rightMargin
            int r7 = r7 - r12
            r12 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r12)
            int r13 = r11.topMargin
            int r13 = r4 - r13
            int r11 = r11.bottomMargin
            int r13 = r13 - r11
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r13, r12)
            r10.measure(r7, r11)
        L_0x00fc:
            r13 = r17
            r14 = r18
            goto L_0x0177
        L_0x0102:
            boolean r12 = r0.isDrawerView(r10)
            if (r12 == 0) goto L_0x017c
            boolean r12 = SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r12 == 0) goto L_0x0119
            float r12 = androidx.core.view.C2364y.C2373i.m5262i(r10)
            float r13 = r0.mDrawerElevation
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x0119
            androidx.core.view.C2364y.C2373i.m5272s(r10, r13)
        L_0x0119:
            int r12 = r0.getDrawerViewAbsoluteGravity(r10)
            r12 = r12 & 7
            r13 = 3
            if (r12 != r13) goto L_0x0123
            r7 = 1
        L_0x0123:
            if (r7 == 0) goto L_0x0127
            if (r8 != 0) goto L_0x012c
        L_0x0127:
            if (r7 != 0) goto L_0x0152
            if (r9 != 0) goto L_0x012c
            goto L_0x0152
        L_0x012c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Child drawer has absolute gravity "
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            java.lang.String r3 = gravityToString(r12)
            r2.append(r3)
            java.lang.String r3 = " but this "
            r2.append(r3)
            java.lang.String r3 = "DrawerLayout"
            r2.append(r3)
            java.lang.String r3 = " already has a drawer view along that edge"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0152:
            if (r7 == 0) goto L_0x0156
            r8 = 1
            goto L_0x0157
        L_0x0156:
            r9 = 1
        L_0x0157:
            int r7 = r0.mMinDrawerMargin
            int r12 = r11.leftMargin
            int r7 = r7 + r12
            int r12 = r11.rightMargin
            int r7 = r7 + r12
            int r12 = r11.width
            r13 = r17
            int r7 = android.view.ViewGroup.getChildMeasureSpec(r13, r7, r12)
            int r12 = r11.topMargin
            int r14 = r11.bottomMargin
            int r12 = r12 + r14
            int r11 = r11.height
            r14 = r18
            int r11 = android.view.ViewGroup.getChildMeasureSpec(r14, r12, r11)
            r10.measure(r7, r11)
        L_0x0177:
            int r2 = r2 + 1
            r7 = 0
            goto L_0x0046
        L_0x017c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Child "
            r3.append(r4)
            r3.append(r10)
            java.lang.String r4 = " at index "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L_0x01a0:
            return
        L_0x01a1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onMeasure(int, int):void");
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        View findDrawerWithGravity;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        int i = savedState.openDrawerGravity;
        if (!(i == 0 || (findDrawerWithGravity = findDrawerWithGravity(i)) == null)) {
            openDrawer(findDrawerWithGravity);
        }
        int i2 = savedState.lockModeLeft;
        if (i2 != 3) {
            setDrawerLockMode(i2, 3);
        }
        int i3 = savedState.lockModeRight;
        if (i3 != 3) {
            setDrawerLockMode(i3, 5);
        }
        int i4 = savedState.lockModeStart;
        if (i4 != 3) {
            setDrawerLockMode(i4, 8388611);
        }
        int i5 = savedState.lockModeEnd;
        if (i5 != 3) {
            setDrawerLockMode(i5, 8388613);
        }
    }

    public void onRtlPropertiesChanged(int i) {
        resolveShadowDrawables();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            }
            LayoutParams layoutParams = (LayoutParams) getChildAt(i).getLayoutParams();
            int i2 = layoutParams.openState;
            boolean z = true;
            boolean z2 = i2 == 1;
            if (i2 != 2) {
                z = false;
            }
            if (z2 || z) {
                savedState.openDrawerGravity = layoutParams.gravity;
            } else {
                i++;
            }
        }
        savedState.lockModeLeft = this.mLockModeLeft;
        savedState.lockModeRight = this.mLockModeRight;
        savedState.lockModeStart = this.mLockModeStart;
        savedState.lockModeEnd = this.mLockModeEnd;
        return savedState;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0056, code lost:
        if (getDrawerLockMode(r7) != 2) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            h1.c r0 = r6.mLeftDragger
            r0.mo19050n(r7)
            h1.c r0 = r6.mRightDragger
            r0.mo19050n(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 == r2) goto L_0x0020
            r7 = 3
            if (r0 == r7) goto L_0x001a
            goto L_0x006b
        L_0x001a:
            r6.closeDrawers(r2)
            r6.mChildrenCanceledTouch = r1
            goto L_0x006b
        L_0x0020:
            float r0 = r7.getX()
            float r7 = r7.getY()
            h1.c r3 = r6.mLeftDragger
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.mo19047j(r4, r5)
            if (r3 == 0) goto L_0x0058
            boolean r3 = r6.isContentView(r3)
            if (r3 == 0) goto L_0x0058
            float r3 = r6.mInitialMotionX
            float r0 = r0 - r3
            float r3 = r6.mInitialMotionY
            float r7 = r7 - r3
            h1.c r3 = r6.mLeftDragger
            int r3 = r3.f15309b
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r7 = r7 + r0
            int r3 = r3 * r3
            float r0 = (float) r3
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x0058
            android.view.View r7 = r6.findOpenDrawer()
            if (r7 == 0) goto L_0x0058
            int r7 = r6.getDrawerLockMode((android.view.View) r7)
            r0 = 2
            if (r7 != r0) goto L_0x0059
        L_0x0058:
            r1 = r2
        L_0x0059:
            r6.closeDrawers(r1)
            goto L_0x006b
        L_0x005d:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.mInitialMotionX = r0
            r6.mInitialMotionY = r7
            r6.mChildrenCanceledTouch = r1
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.drawerlayout.widget.DrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void open() {
        openDrawer(8388611);
    }

    public void openDrawer(View view) {
        openDrawer(view, true);
    }

    public void removeDrawerListener(C2650e eVar) {
        List<C2650e> list;
        if (eVar != null && (list = this.mListeners) != null) {
            list.remove(eVar);
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            closeDrawers(true);
        }
    }

    public void requestLayout() {
        if (!this.mInLayout) {
            super.requestLayout();
        }
    }

    public void setChildInsets(Object obj, boolean z) {
        this.mLastInsets = obj;
        this.mDrawStatusBarBackground = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setDrawerElevation(float f) {
        this.mDrawerElevation = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (isDrawerView(childAt)) {
                float f2 = this.mDrawerElevation;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2373i.m5272s(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(C2650e eVar) {
        C2650e eVar2 = this.mListener;
        if (eVar2 != null) {
            removeDrawerListener(eVar2);
        }
        if (eVar != null) {
            addDrawerListener(eVar);
        }
        this.mListener = eVar;
    }

    public void setDrawerLockMode(int i) {
        setDrawerLockMode(i, 3);
        setDrawerLockMode(i, 5);
    }

    public void setDrawerShadow(Drawable drawable, int i) {
        if (!SET_DRAWER_SHADOW_FROM_ELEVATION) {
            if ((i & 8388611) == 8388611) {
                this.mShadowStart = drawable;
            } else if ((i & 8388613) == 8388613) {
                this.mShadowEnd = drawable;
            } else if ((i & 3) == 3) {
                this.mShadowLeft = drawable;
            } else if ((i & 5) == 5) {
                this.mShadowRight = drawable;
            } else {
                return;
            }
            resolveShadowDrawables();
            invalidate();
        }
    }

    public void setDrawerTitle(int i, CharSequence charSequence) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, C2364y.C2369e.m5233d(this));
        if (absoluteGravity == 3) {
            this.mTitleLeft = charSequence;
        } else if (absoluteGravity == 5) {
            this.mTitleRight = charSequence;
        }
    }

    public void setDrawerViewOffset(View view, float f) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f != layoutParams.onScreen) {
            layoutParams.onScreen = f;
            dispatchOnDrawerSlide(view, f);
        }
    }

    public void setScrimColor(int i) {
        this.mScrimColor = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.mStatusBarBackground = new ColorDrawable(i);
        invalidate();
    }

    public void updateDrawerState(int i, View view) {
        int i2 = this.mLeftDragger.f15308a;
        int i3 = this.mRightDragger.f15308a;
        int i4 = 2;
        if (i2 == 1 || i3 == 1) {
            i4 = 1;
        } else if (!(i2 == 2 || i3 == 2)) {
            i4 = 0;
        }
        if (view != null && i == 0) {
            float f = ((LayoutParams) view.getLayoutParams()).onScreen;
            if (f == 0.0f) {
                dispatchOnDrawerClosed(view);
            } else if (f == 1.0f) {
                dispatchOnDrawerOpened(view);
            }
        }
        if (i4 != this.mDrawerState) {
            this.mDrawerState = i4;
            List<C2650e> list = this.mListeners;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.mListeners.get(size).mo10008a();
                }
            }
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.drawerLayoutStyle);
    }

    public void closeDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.mFirstLayout) {
                layoutParams.onScreen = 0.0f;
                layoutParams.openState = 0;
            } else if (z) {
                layoutParams.openState |= 4;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.mo19058v(view, -view.getWidth(), view.getTop());
                } else {
                    this.mRightDragger.mo19058v(view, getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 0.0f);
                updateDrawerState(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public void closeDrawers(boolean z) {
        boolean z2;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (isDrawerView(childAt) && (!z || layoutParams.isPeeking)) {
                int width = childAt.getWidth();
                if (checkDrawerViewAbsoluteGravity(childAt, 3)) {
                    z2 = this.mLeftDragger.mo19058v(childAt, -width, childAt.getTop());
                } else {
                    z2 = this.mRightDragger.mo19058v(childAt, getWidth(), childAt.getTop());
                }
                z3 |= z2;
                layoutParams.isPeeking = false;
            }
        }
        C2651f fVar = this.mLeftCallback;
        DrawerLayout.this.removeCallbacks(fVar.f5993c);
        C2651f fVar2 = this.mRightCallback;
        DrawerLayout.this.removeCallbacks(fVar2.f5993c);
        if (z3) {
            invalidate();
        }
    }

    public void openDrawer(View view, boolean z) {
        if (isDrawerView(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.mFirstLayout) {
                layoutParams.onScreen = 1.0f;
                layoutParams.openState = 1;
                updateChildrenImportantForAccessibility(view, true);
                updateChildAccessibilityAction(view);
            } else if (z) {
                layoutParams.openState |= 2;
                if (checkDrawerViewAbsoluteGravity(view, 3)) {
                    this.mLeftDragger.mo19058v(view, 0, view.getTop());
                } else {
                    this.mRightDragger.mo19058v(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                moveDrawerToOffset(view, 1.0f);
                updateDrawerState(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    /* JADX INFO: finally extract failed */
    public DrawerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mChildAccessibilityDelegate = new C2649d();
        this.mScrimColor = DEFAULT_SCRIM_COLOR;
        this.mScrimPaint = new Paint();
        this.mFirstLayout = true;
        this.mLockModeLeft = 3;
        this.mLockModeRight = 3;
        this.mLockModeStart = 3;
        this.mLockModeEnd = 3;
        this.mShadowStart = null;
        this.mShadowEnd = null;
        this.mShadowLeft = null;
        this.mShadowRight = null;
        this.mActionDismiss = new C2646a();
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        float f = getResources().getDisplayMetrics().density;
        this.mMinDrawerMargin = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        C2651f fVar = new C2651f(3);
        this.mLeftCallback = fVar;
        C2651f fVar2 = new C2651f(5);
        this.mRightCallback = fVar2;
        C6916c i2 = C6916c.m13375i(this, 1.0f, fVar);
        this.mLeftDragger = i2;
        i2.f15324q = 1;
        i2.f15321n = f2;
        fVar.f5992b = i2;
        C6916c i3 = C6916c.m13375i(this, 1.0f, fVar2);
        this.mRightDragger = i3;
        i3.f15324q = 2;
        i3.f15321n = f2;
        fVar2.f5992b = i3;
        setFocusableInTouchMode(true);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5229s(this, 1);
        C2364y.m5201p(this, new C2648c());
        setMotionEventSplittingEnabled(false);
        if (C2364y.C2368d.m5212b(this)) {
            setOnApplyWindowInsetsListener(new C2647b());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(THEME_ATTRS);
            try {
                this.mStatusBarBackground = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, C0114h.f181r, i, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.mDrawerElevation = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.mDrawerElevation = getResources().getDimension(R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.mNonDrawerViews = new ArrayList<>();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public void setDrawerLockMode(int i, int i2) {
        View findDrawerWithGravity;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, C2364y.C2369e.m5233d(this));
        if (i2 == 3) {
            this.mLockModeLeft = i;
        } else if (i2 == 5) {
            this.mLockModeRight = i;
        } else if (i2 == 8388611) {
            this.mLockModeStart = i;
        } else if (i2 == 8388613) {
            this.mLockModeEnd = i;
        }
        if (i != 0) {
            (absoluteGravity == 3 ? this.mLeftDragger : this.mRightDragger).mo19040b();
        }
        if (i == 1) {
            View findDrawerWithGravity2 = findDrawerWithGravity(absoluteGravity);
            if (findDrawerWithGravity2 != null) {
                closeDrawer(findDrawerWithGravity2);
            }
        } else if (i == 2 && (findDrawerWithGravity = findDrawerWithGravity(absoluteGravity)) != null) {
            openDrawer(findDrawerWithGravity);
        }
    }

    public void setStatusBarBackground(int i) {
        Drawable drawable;
        if (i != 0) {
            Context context = getContext();
            Object obj = C8184a.f17966a;
            drawable = C8184a.C8187c.m16466b(context, i);
        } else {
            drawable = null;
        }
        this.mStatusBarBackground = drawable;
        invalidate();
    }

    public boolean isDrawerVisible(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerVisible(findDrawerWithGravity);
        }
        return false;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int FLAG_IS_CLOSING = 4;
        private static final int FLAG_IS_OPENED = 1;
        private static final int FLAG_IS_OPENING = 2;
        public int gravity;
        public boolean isPeeking;
        public float onScreen;
        public int openState;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.gravity = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.gravity = 0;
        }

        public LayoutParams(int i, int i2, int i3) {
            this(i, i2);
            this.gravity = i3;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
            this.gravity = layoutParams.gravity;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.gravity = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.gravity = 0;
        }
    }

    public boolean isDrawerOpen(int i) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            return isDrawerOpen(findDrawerWithGravity);
        }
        return false;
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2645a();
        public int lockModeEnd;
        public int lockModeLeft;
        public int lockModeRight;
        public int lockModeStart;
        public int openDrawerGravity = 0;

        /* renamed from: androidx.drawerlayout.widget.DrawerLayout$SavedState$a */
        public class C2645a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.openDrawerGravity = parcel.readInt();
            this.lockModeLeft = parcel.readInt();
            this.lockModeRight = parcel.readInt();
            this.lockModeStart = parcel.readInt();
            this.lockModeEnd = parcel.readInt();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.openDrawerGravity);
            parcel.writeInt(this.lockModeLeft);
            parcel.writeInt(this.lockModeRight);
            parcel.writeInt(this.lockModeStart);
            parcel.writeInt(this.lockModeEnd);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setDrawerShadow(int i, int i2) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setDrawerShadow(C8184a.C8187c.m16466b(context, i), i2);
    }

    public int getDrawerLockMode(View view) {
        if (isDrawerView(view)) {
            return getDrawerLockMode(((LayoutParams) view.getLayoutParams()).gravity);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void setDrawerLockMode(int i, View view) {
        if (isDrawerView(view)) {
            setDrawerLockMode(i, ((LayoutParams) view.getLayoutParams()).gravity);
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer with appropriate layout_gravity");
    }

    public void closeDrawer(int i) {
        closeDrawer(i, true);
    }

    public void closeDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            closeDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder h = C0072d.m201h("No drawer view found with gravity ");
        h.append(gravityToString(i));
        throw new IllegalArgumentException(h.toString());
    }

    public void openDrawer(int i) {
        openDrawer(i, true);
    }

    public void openDrawer(int i, boolean z) {
        View findDrawerWithGravity = findDrawerWithGravity(i);
        if (findDrawerWithGravity != null) {
            openDrawer(findDrawerWithGravity, z);
            return;
        }
        StringBuilder h = C0072d.m201h("No drawer view found with gravity ");
        h.append(gravityToString(i));
        throw new IllegalArgumentException(h.toString());
    }
}
