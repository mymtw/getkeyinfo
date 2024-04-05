package androidx.viewpager.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.core.view.C2273a;
import androidx.core.view.C2325q;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p213q2.C7717a;
import p260v0.C8184a;

public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final Comparator<C3331f> COMPARATOR = new C3326a();
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    public static final int[] LAYOUT_ATTRS = {16842931};
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final Interpolator sInterpolator = new C3327b();
    private static final C3338m sPositionComparator = new C3338m();
    private int mActivePointerId = -1;
    public C7717a mAdapter;
    private List<C3333h> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    public int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable = new C3328c();
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout = true;
    private float mFirstOffset = -3.4028235E38f;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private C3334i mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<C3331f> mItems = new ArrayList<>();
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset = Float.MAX_VALUE;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets = false;
    private C3336k mObserver;
    private int mOffscreenPageLimit = 1;
    private C3334i mOnPageChangeListener;
    private List<C3334i> mOnPageChangeListeners;
    private int mPageMargin;
    private C3335j mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState = null;
    private ClassLoader mRestoredClassLoader = null;
    private int mRestoredCurItem = -1;
    private EdgeEffect mRightEdge;
    private int mScrollState = 0;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final C3331f mTempItem = new C3331f();
    private final Rect mTempRect = new Rect();
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3325a();
        public Parcelable adapterState;
        public ClassLoader loader;
        public int position;

        /* renamed from: androidx.viewpager.widget.ViewPager$SavedState$a */
        public static class C3325a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder h = C0072d.m201h("FragmentPager.SavedState{");
            h.append(Integer.toHexString(System.identityHashCode(this)));
            h.append(" position=");
            return C0071c.m191c(h, this.position, "}");
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.position);
            parcel.writeParcelable(this.adapterState, i);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.position = parcel.readInt();
            this.adapterState = parcel.readParcelable(classLoader);
            this.loader = classLoader;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$a */
    public static class C3326a implements Comparator<C3331f> {
        public final int compare(Object obj, Object obj2) {
            return ((C3331f) obj).f7795b - ((C3331f) obj2).f7795b;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$b */
    public static class C3327b implements Interpolator {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$c */
    public class C3328c implements Runnable {
        public C3328c() {
        }

        public final void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.populate();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$d */
    public class C3329d implements C2325q {

        /* renamed from: b */
        public final Rect f7792b = new Rect();

        public C3329d() {
        }

        /* renamed from: b */
        public final C2348w0 mo1389b(View view, C2348w0 w0Var) {
            C2348w0 k = C2364y.m5196k(view, w0Var);
            if (k.f5615a.mo8976n()) {
                return k;
            }
            Rect rect = this.f7792b;
            rect.left = k.mo8945e();
            rect.top = k.mo8948g();
            rect.right = k.mo8947f();
            rect.bottom = k.mo8944d();
            int childCount = ViewPager.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C2348w0 b = C2364y.m5187b(ViewPager.this.getChildAt(i), k);
                rect.left = Math.min(b.mo8945e(), rect.left);
                rect.top = Math.min(b.mo8948g(), rect.top);
                rect.right = Math.min(b.mo8947f(), rect.right);
                rect.bottom = Math.min(b.mo8944d(), rect.bottom);
            }
            return k.mo8950i(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Inherited
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: androidx.viewpager.widget.ViewPager$e */
    public @interface C3330e {
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$f */
    public static class C3331f {

        /* renamed from: a */
        public Object f7794a;

        /* renamed from: b */
        public int f7795b;

        /* renamed from: c */
        public boolean f7796c;

        /* renamed from: d */
        public float f7797d;

        /* renamed from: e */
        public float f7798e;
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$g */
    public class C3332g extends C2273a {
        public C3332g() {
        }

        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            C7717a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            C7717a aVar2 = ViewPager.this.mAdapter;
            boolean z = true;
            if (aVar2 == null || aVar2.mo20184j() <= 1) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            if (accessibilityEvent.getEventType() == 4096 && (aVar = ViewPager.this.mAdapter) != null) {
                accessibilityEvent.setItemCount(aVar.mo20184j());
                accessibilityEvent.setFromIndex(ViewPager.this.mCurItem);
                accessibilityEvent.setToIndex(ViewPager.this.mCurItem);
            }
        }

        public final void onInitializeAccessibilityNodeInfo(View view, C6689b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.mo18867q(ViewPager.class.getName());
            C7717a aVar = ViewPager.this.mAdapter;
            bVar.mo18872u(aVar != null && aVar.mo20184j() > 1);
            if (ViewPager.this.canScrollHorizontally(1)) {
                bVar.mo18850a(RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                bVar.mo18850a(8192);
            }
        }

        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            if (i != 4096) {
                if (i != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.mCurItem - 1);
                return true;
            } else if (!ViewPager.this.canScrollHorizontally(1)) {
                return false;
            } else {
                ViewPager viewPager2 = ViewPager.this;
                viewPager2.setCurrentItem(viewPager2.mCurItem + 1);
                return true;
            }
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$h */
    public interface C3333h {
        /* renamed from: a */
        void mo12624a(ViewPager viewPager, C7717a aVar, C7717a aVar2);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$i */
    public interface C3334i {
        void onPageScrollStateChanged(int i);

        void onPageScrolled(int i, float f, int i2);

        void onPageSelected(int i);
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$j */
    public interface C3335j {
        /* renamed from: a */
        void mo12708a();
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$k */
    public class C3336k extends DataSetObserver {
        public C3336k() {
        }

        public final void onChanged() {
            ViewPager.this.dataSetChanged();
        }

        public final void onInvalidated() {
            ViewPager.this.dataSetChanged();
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$l */
    public static class C3337l implements C3334i {
        public final void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* renamed from: androidx.viewpager.widget.ViewPager$m */
    public static class C3338m implements Comparator<View> {
        public final int compare(Object obj, Object obj2) {
            LayoutParams layoutParams = (LayoutParams) ((View) obj).getLayoutParams();
            LayoutParams layoutParams2 = (LayoutParams) ((View) obj2).getLayoutParams();
            boolean z = layoutParams.isDecor;
            return z != layoutParams2.isDecor ? z ? 1 : -1 : layoutParams.position - layoutParams2.position;
        }
    }

    public ViewPager(Context context) {
        super(context);
        initViewPager();
    }

    private void calculatePageOffsets(C3331f fVar, int i, C3331f fVar2) {
        int i2;
        int i3;
        C3331f fVar3;
        C3331f fVar4;
        int j = this.mAdapter.mo20184j();
        int clientWidth = getClientWidth();
        float f = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        if (fVar2 != null) {
            int i4 = fVar2.f7795b;
            int i5 = fVar.f7795b;
            if (i4 < i5) {
                float f2 = fVar2.f7798e + fVar2.f7797d + f;
                int i6 = i4 + 1;
                int i7 = 0;
                while (i6 <= fVar.f7795b && i7 < this.mItems.size()) {
                    Object obj = this.mItems.get(i7);
                    while (true) {
                        fVar4 = (C3331f) obj;
                        if (i6 > fVar4.f7795b && i7 < this.mItems.size() - 1) {
                            i7++;
                            obj = this.mItems.get(i7);
                        }
                    }
                    while (i6 < fVar4.f7795b) {
                        f2 += this.mAdapter.mo20187m() + f;
                        i6++;
                    }
                    fVar4.f7798e = f2;
                    f2 += fVar4.f7797d + f;
                    i6++;
                }
            } else if (i4 > i5) {
                int size = this.mItems.size() - 1;
                float f3 = fVar2.f7798e;
                while (true) {
                    i4--;
                    if (i4 < fVar.f7795b || size < 0) {
                        break;
                    }
                    Object obj2 = this.mItems.get(size);
                    while (true) {
                        fVar3 = (C3331f) obj2;
                        if (i4 < fVar3.f7795b && size > 0) {
                            size--;
                            obj2 = this.mItems.get(size);
                        }
                    }
                    while (i4 > fVar3.f7795b) {
                        f3 -= this.mAdapter.mo20187m() + f;
                        i4--;
                    }
                    f3 -= fVar3.f7797d + f;
                    fVar3.f7798e = f3;
                }
            }
        }
        int size2 = this.mItems.size();
        float f4 = fVar.f7798e;
        int i8 = fVar.f7795b;
        int i9 = i8 - 1;
        this.mFirstOffset = i8 == 0 ? f4 : -3.4028235E38f;
        int i10 = j - 1;
        this.mLastOffset = i8 == i10 ? (fVar.f7797d + f4) - 1.0f : Float.MAX_VALUE;
        int i11 = i - 1;
        while (i11 >= 0) {
            C3331f fVar5 = this.mItems.get(i11);
            while (true) {
                i3 = fVar5.f7795b;
                if (i9 <= i3) {
                    break;
                }
                i9--;
                f4 -= this.mAdapter.mo20187m() + f;
            }
            f4 -= fVar5.f7797d + f;
            fVar5.f7798e = f4;
            if (i3 == 0) {
                this.mFirstOffset = f4;
            }
            i11--;
            i9--;
        }
        float f5 = fVar.f7798e + fVar.f7797d + f;
        int i12 = fVar.f7795b + 1;
        int i13 = i + 1;
        while (i13 < size2) {
            C3331f fVar6 = this.mItems.get(i13);
            while (true) {
                i2 = fVar6.f7795b;
                if (i12 >= i2) {
                    break;
                }
                i12++;
                f5 += this.mAdapter.mo20187m() + f;
            }
            if (i2 == i10) {
                this.mLastOffset = (fVar6.f7797d + f5) - 1.0f;
            }
            fVar6.f7798e = f5;
            f5 += fVar6.f7797d + f;
            i13++;
            i12++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z) {
        boolean z2 = this.mScrollState == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (!(scrollX == currX && scrollY == currY)) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i = 0; i < this.mItems.size(); i++) {
            C3331f fVar = this.mItems.get(i);
            if (fVar.f7796c) {
                fVar.f7796c = false;
                z2 = true;
            }
        }
        if (!z2) {
            return;
        }
        if (z) {
            Runnable runnable = this.mEndScrollRunnable;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5223m(this, runnable);
            return;
        }
        this.mEndScrollRunnable.run();
    }

    private int determineTargetPage(int i, float f, int i2, int i3) {
        if (Math.abs(i3) <= this.mFlingDistance || Math.abs(i2) <= this.mMinimumVelocity) {
            i += (int) (f + (i >= this.mCurItem ? 0.4f : 0.6f));
        } else if (i2 <= 0) {
            i++;
        }
        if (this.mItems.size() <= 0) {
            return i;
        }
        ArrayList<C3331f> arrayList = this.mItems;
        return Math.max(this.mItems.get(0).f7795b, Math.min(i, arrayList.get(arrayList.size() - 1).f7795b));
    }

    private void dispatchOnPageScrolled(int i, float f, int i2) {
        C3334i iVar = this.mOnPageChangeListener;
        if (iVar != null) {
            iVar.onPageScrolled(i, f, i2);
        }
        List<C3334i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C3334i iVar2 = this.mOnPageChangeListeners.get(i3);
                if (iVar2 != null) {
                    iVar2.onPageScrolled(i, f, i2);
                }
            }
        }
        C3334i iVar3 = this.mInternalPageChangeListener;
        if (iVar3 != null) {
            iVar3.onPageScrolled(i, f, i2);
        }
    }

    private void dispatchOnPageSelected(int i) {
        C3334i iVar = this.mOnPageChangeListener;
        if (iVar != null) {
            iVar.onPageSelected(i);
        }
        List<C3334i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3334i iVar2 = this.mOnPageChangeListeners.get(i2);
                if (iVar2 != null) {
                    iVar2.onPageSelected(i);
                }
            }
        }
        C3334i iVar3 = this.mInternalPageChangeListener;
        if (iVar3 != null) {
            iVar3.onPageSelected(i);
        }
    }

    private void dispatchOnScrollStateChanged(int i) {
        C3334i iVar = this.mOnPageChangeListener;
        if (iVar != null) {
            iVar.onPageScrollStateChanged(i);
        }
        List<C3334i> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                C3334i iVar2 = this.mOnPageChangeListeners.get(i2);
                if (iVar2 != null) {
                    iVar2.onPageScrollStateChanged(i);
                }
            }
        }
        C3334i iVar3 = this.mInternalPageChangeListener;
        if (iVar3 != null) {
            iVar3.onPageScrollStateChanged(i);
        }
    }

    private void enableLayers(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setLayerType(z ? this.mPageTransformerLayerType : 0, (Paint) null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private C3331f infoForCurrentScrollPosition() {
        int i;
        int clientWidth = getClientWidth();
        float f = 0.0f;
        float scrollX = clientWidth > 0 ? ((float) getScrollX()) / ((float) clientWidth) : 0.0f;
        float f2 = clientWidth > 0 ? ((float) this.mPageMargin) / ((float) clientWidth) : 0.0f;
        C3331f fVar = null;
        int i2 = 0;
        boolean z = true;
        int i3 = -1;
        float f3 = 0.0f;
        while (i2 < this.mItems.size()) {
            C3331f fVar2 = this.mItems.get(i2);
            if (!z && fVar2.f7795b != (i = i3 + 1)) {
                fVar2 = this.mTempItem;
                fVar2.f7798e = f + f3 + f2;
                fVar2.f7795b = i;
                fVar2.f7797d = this.mAdapter.mo20187m();
                i2--;
            }
            f = fVar2.f7798e;
            float f4 = fVar2.f7797d + f + f2;
            if (!z && scrollX < f) {
                return fVar;
            }
            if (scrollX < f4 || i2 == this.mItems.size() - 1) {
                return fVar2;
            }
            i3 = fVar2.f7795b;
            f3 = fVar2.f7797d;
            i2++;
            z = false;
            fVar = fVar2;
        }
        return fVar;
    }

    private static boolean isDecorView(View view) {
        return view.getClass().getAnnotation(C3330e.class) != null;
    }

    private boolean isGutterDrag(float f, float f2) {
        return (f < ((float) this.mGutterSize) && f2 > 0.0f) || (f > ((float) (getWidth() - this.mGutterSize)) && f2 < 0.0f);
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mLastMotionX = motionEvent.getX(i);
            this.mActivePointerId = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i) {
        if (this.mItems.size() != 0) {
            C3331f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            int clientWidth = getClientWidth();
            int i2 = this.mPageMargin;
            int i3 = clientWidth + i2;
            float f = (float) clientWidth;
            int i4 = infoForCurrentScrollPosition.f7795b;
            float f2 = ((((float) i) / f) - infoForCurrentScrollPosition.f7798e) / (infoForCurrentScrollPosition.f7797d + (((float) i2) / f));
            this.mCalledSuper = false;
            onPageScrolled(i4, f2, (int) (((float) i3) * f2));
            if (this.mCalledSuper) {
                return true;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        } else if (this.mFirstLayout) {
            return false;
        } else {
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
    }

    private boolean performDrag(float f) {
        boolean z;
        boolean z2;
        float f2 = this.mLastMotionX - f;
        this.mLastMotionX = f;
        float scrollX = ((float) getScrollX()) + f2;
        float clientWidth = (float) getClientWidth();
        float f3 = this.mFirstOffset * clientWidth;
        float f4 = this.mLastOffset * clientWidth;
        boolean z3 = false;
        C3331f fVar = this.mItems.get(0);
        ArrayList<C3331f> arrayList = this.mItems;
        C3331f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f7795b != 0) {
            f3 = fVar.f7798e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        if (fVar2.f7795b != this.mAdapter.mo20184j() - 1) {
            f4 = fVar2.f7798e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.mLeftEdge.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.mRightEdge.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i = (int) scrollX;
        this.mLastMotionX = (scrollX - ((float) i)) + this.mLastMotionX;
        scrollTo(i, getScrollY());
        pageScrolled(i);
        return z3;
    }

    private void recomputeScrollPosition(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.mItems.isEmpty()) {
            C3331f infoForPosition = infoForPosition(this.mCurItem);
            int min = (int) ((infoForPosition != null ? Math.min(infoForPosition.f7798e, this.mLastOffset) : 0.0f) * ((float) ((i - getPaddingLeft()) - getPaddingRight())));
            if (min != getScrollX()) {
                completeScroll(false);
                scrollTo(min, getScrollY());
            }
        } else if (!this.mScroller.isFinished()) {
            this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((((float) getScrollX()) / ((float) (((i2 - getPaddingLeft()) - getPaddingRight()) + i4))) * ((float) (((i - getPaddingLeft()) - getPaddingRight()) + i3))), getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i = 0;
        while (i < getChildCount()) {
            if (!((LayoutParams) getChildAt(i).getLayoutParams()).isDecor) {
                removeViewAt(i);
                i--;
            }
            i++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        return this.mLeftEdge.isFinished() || this.mRightEdge.isFinished();
    }

    private void scrollToItem(int i, boolean z, int i2, boolean z2) {
        int i3;
        C3331f infoForPosition = infoForPosition(i);
        if (infoForPosition != null) {
            i3 = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.f7798e, this.mLastOffset)) * ((float) getClientWidth()));
        } else {
            i3 = 0;
        }
        if (z) {
            smoothScrollTo(i3, 0, i2);
            if (z2) {
                dispatchOnPageSelected(i);
                return;
            }
            return;
        }
        if (z2) {
            dispatchOnPageSelected(i);
        }
        completeScroll(false);
        scrollTo(i3, 0);
        pageScrolled(i3);
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.mScrollingCacheEnabled != z) {
            this.mScrollingCacheEnabled = z;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                this.mDrawingOrderedChildren.add(getChildAt(i));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C3331f infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f7795b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i2 & 1) != 1 || !isInTouchMode() || isFocusableInTouchMode()) {
            arrayList.add(this);
        }
    }

    public C3331f addNewItem(int i, int i2) {
        C3331f fVar = new C3331f();
        fVar.f7795b = i;
        fVar.f7794a = this.mAdapter.mo10625n(this, i);
        fVar.f7797d = this.mAdapter.mo20187m();
        if (i2 < 0 || i2 >= this.mItems.size()) {
            this.mItems.add(fVar);
        } else {
            this.mItems.add(i2, fVar);
        }
        return fVar;
    }

    public void addOnAdapterChangeListener(C3333h hVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(hVar);
    }

    public void addOnPageChangeListener(C3334i iVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(iVar);
    }

    public void addTouchables(ArrayList<View> arrayList) {
        C3331f infoForChild;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f7795b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        boolean isDecorView = layoutParams2.isDecor | isDecorView(view);
        layoutParams2.isDecor = isDecorView;
        if (!this.mInLayout) {
            super.addView(view, i, layoutParams);
        } else if (!isDecorView) {
            layoutParams2.needsMeasure = true;
            addViewInLayout(view, i, layoutParams);
        } else {
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean arrowScroll(int r7) {
        /*
            r6 = this;
            android.view.View r0 = r6.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r6) goto L_0x000a
            goto L_0x0063
        L_0x000a:
            if (r0 == 0) goto L_0x0064
            android.view.ViewParent r4 = r0.getParent()
        L_0x0010:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x001d
            if (r4 != r6) goto L_0x0018
            r4 = r1
            goto L_0x001e
        L_0x0018:
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0010
        L_0x001d:
            r4 = r2
        L_0x001e:
            if (r4 != 0) goto L_0x0064
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L_0x0034:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L_0x004d
            java.lang.String r5 = " => "
            r4.append(r5)
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
            goto L_0x0034
        L_0x004d:
            java.lang.String r0 = "arrowScroll tried to find focus based on non-child current focused view "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
        L_0x0063:
            r0 = r3
        L_0x0064:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r6, r0, r7)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto L_0x00b5
            if (r3 == r0) goto L_0x00b5
            if (r7 != r5) goto L_0x0095
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x008f
            if (r1 < r2) goto L_0x008f
            boolean r0 = r6.pageLeft()
            goto L_0x0093
        L_0x008f:
            boolean r0 = r3.requestFocus()
        L_0x0093:
            r2 = r0
            goto L_0x00c8
        L_0x0095:
            if (r7 != r4) goto L_0x00c8
            android.graphics.Rect r1 = r6.mTempRect
            android.graphics.Rect r1 = r6.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r6.mTempRect
            android.graphics.Rect r2 = r6.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L_0x00b0
            if (r1 > r2) goto L_0x00b0
            boolean r0 = r6.pageRight()
            goto L_0x0093
        L_0x00b0:
            boolean r0 = r3.requestFocus()
            goto L_0x0093
        L_0x00b5:
            if (r7 == r5) goto L_0x00c4
            if (r7 != r1) goto L_0x00ba
            goto L_0x00c4
        L_0x00ba:
            if (r7 == r4) goto L_0x00bf
            r0 = 2
            if (r7 != r0) goto L_0x00c8
        L_0x00bf:
            boolean r2 = r6.pageRight()
            goto L_0x00c8
        L_0x00c4:
            boolean r2 = r6.pageLeft()
        L_0x00c8:
            if (r2 == 0) goto L_0x00d1
            int r7 = android.view.SoundEffectConstants.getContantForFocusDirection(r7)
            r6.playSoundEffect(r7)
        L_0x00d1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        int i4;
        View view2 = view;
        if (view2 instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom()) {
                    if (canScroll(childAt, true, i, i5 - childAt.getLeft(), i4 - childAt.getTop())) {
                        return true;
                    }
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    public boolean canScrollHorizontally(int i) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.mFirstOffset)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.mLastOffset));
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void clearOnPageChangeListeners() {
        List<C3334i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (this.mScroller.isFinished() || !this.mScroller.computeScrollOffset()) {
            completeScroll(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.mScroller.getCurrX();
        int currY = this.mScroller.getCurrY();
        if (!(scrollX == currX && scrollY == currY)) {
            scrollTo(currX, currY);
            if (!pageScrolled(currX)) {
                this.mScroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5221k(this);
    }

    public void dataSetChanged() {
        int j = this.mAdapter.mo20184j();
        this.mExpectedAdapterCount = j;
        boolean z = this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < j;
        int i = this.mCurItem;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < this.mItems.size()) {
            C3331f fVar = this.mItems.get(i2);
            int k = this.mAdapter.mo20185k(fVar.f7794a);
            if (k != -1) {
                if (k == -2) {
                    this.mItems.remove(i2);
                    i2--;
                    if (!z2) {
                        this.mAdapter.mo10630t(this);
                        z2 = true;
                    }
                    this.mAdapter.mo10623h(this, fVar.f7795b, fVar.f7794a);
                    int i3 = this.mCurItem;
                    if (i3 == fVar.f7795b) {
                        i = Math.max(0, Math.min(i3, -1 + j));
                    }
                } else {
                    int i4 = fVar.f7795b;
                    if (i4 != k) {
                        if (i4 == this.mCurItem) {
                            i = k;
                        }
                        fVar.f7795b = k;
                    }
                }
                z = true;
            }
            i2++;
        }
        if (z2) {
            this.mAdapter.mo10624i();
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
                if (!layoutParams.isDecor) {
                    layoutParams.widthFactor = 0.0f;
                }
            }
            setCurrentItemInternal(i, false, true);
            requestLayout();
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C3331f infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f7795b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f) {
        return (float) Math.sin((double) ((f - 0.5f) * 0.47123894f));
    }

    public void draw(Canvas canvas) {
        C7717a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.mAdapter) != null && aVar.mo20184j() > 1)) {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((float) (getPaddingTop() + (-height)), this.mFirstOffset * ((float) width));
                this.mLeftEdge.setSize(height, width);
                z = false | this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate((float) (-getPaddingTop()), (-(this.mLastOffset + 1.0f)) * ((float) width2));
                this.mRightEdge.setSize(height2, width2);
                z |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        } else {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        }
        if (z) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                C3331f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f7795b, ((((float) scrollX) / ((float) clientWidth)) - infoForCurrentScrollPosition.f7798e) / infoForCurrentScrollPosition.f7797d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? pageLeft() : arrowScroll(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? pageRight() : arrowScroll(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return arrowScroll(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return arrowScroll(1);
                }
            }
        }
        return false;
    }

    public void fakeDragBy(float f) {
        if (!this.mFakeDragging) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        } else if (this.mAdapter != null) {
            this.mLastMotionX += f;
            float scrollX = ((float) getScrollX()) - f;
            float clientWidth = (float) getClientWidth();
            float f2 = this.mFirstOffset * clientWidth;
            float f3 = this.mLastOffset * clientWidth;
            C3331f fVar = this.mItems.get(0);
            ArrayList<C3331f> arrayList = this.mItems;
            C3331f fVar2 = arrayList.get(arrayList.size() - 1);
            if (fVar.f7795b != 0) {
                f2 = fVar.f7798e * clientWidth;
            }
            if (fVar2.f7795b != this.mAdapter.mo20184j() - 1) {
                f3 = fVar2.f7798e * clientWidth;
            }
            if (scrollX < f2) {
                scrollX = f2;
            } else if (scrollX > f3) {
                scrollX = f3;
            }
            int i = (int) scrollX;
            this.mLastMotionX = (scrollX - ((float) i)) + this.mLastMotionX;
            scrollTo(i, getScrollY());
            pageScrolled(i);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public C7717a getAdapter() {
        return this.mAdapter;
    }

    public int getChildDrawingOrder(int i, int i2) {
        if (this.mDrawingOrder == 2) {
            i2 = (i - 1) - i2;
        }
        return ((LayoutParams) this.mDrawingOrderedChildren.get(i2).getLayoutParams()).childIndex;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public C3331f infoForAnyChild(View view) {
        while (true) {
            ViewParent parent = view.getParent();
            if (parent == this) {
                return infoForChild(view);
            }
            if (parent == null || !(parent instanceof View)) {
                return null;
            }
            view = (View) parent;
        }
    }

    public C3331f infoForChild(View view) {
        for (int i = 0; i < this.mItems.size(); i++) {
            C3331f fVar = this.mItems.get(i);
            if (this.mAdapter.mo10626o(view, fVar.f7794a)) {
                return fVar;
            }
        }
        return null;
    }

    public C3331f infoForPosition(int i) {
        for (int i2 = 0; i2 < this.mItems.size(); i2++) {
            C3331f fVar = this.mItems.get(i2);
            if (fVar.f7795b == i) {
                return fVar;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f);
        this.mCloseEnough = (int) (2.0f * f);
        this.mDefaultGutterSize = (int) (f * 16.0f);
        C2364y.m5201p(this, new C3332g());
        if (C2364y.C2368d.m5213c(this) == 0) {
            C2364y.C2368d.m5229s(this, 1);
        }
        C2364y.C2373i.m5274u(this, new C3329d());
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r18) {
        /*
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.mPageMargin
            if (r1 <= 0) goto L_0x00a9
            android.graphics.drawable.Drawable r1 = r0.mMarginDrawable
            if (r1 == 0) goto L_0x00a9
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r1 = r0.mItems
            int r1 = r1.size()
            if (r1 <= 0) goto L_0x00a9
            q2.a r1 = r0.mAdapter
            if (r1 == 0) goto L_0x00a9
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.mPageMargin
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.mItems
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C3331f) r5
            float r7 = r5.f7798e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r8 = r0.mItems
            int r8 = r8.size()
            int r9 = r5.f7795b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r10 = r0.mItems
            int r11 = r8 + -1
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$f r10 = (androidx.viewpager.widget.ViewPager.C3331f) r10
            int r10 = r10.f7795b
        L_0x0045:
            if (r9 >= r10) goto L_0x00a9
        L_0x0047:
            int r11 = r5.f7795b
            if (r9 <= r11) goto L_0x0058
            if (r6 >= r8) goto L_0x0058
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r5 = r0.mItems
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$f r5 = (androidx.viewpager.widget.ViewPager.C3331f) r5
            goto L_0x0047
        L_0x0058:
            if (r9 != r11) goto L_0x0063
            float r7 = r5.f7798e
            float r11 = r5.f7797d
            float r7 = r7 + r11
            float r11 = r7 * r4
            float r7 = r7 + r3
            goto L_0x0070
        L_0x0063:
            q2.a r11 = r0.mAdapter
            float r11 = r11.mo20187m()
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r11 = r11 + r7
            r7 = r11
            r11 = r12
        L_0x0070:
            int r12 = r0.mPageMargin
            float r12 = (float) r12
            float r12 = r12 + r11
            float r13 = (float) r1
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L_0x0098
            android.graphics.drawable.Drawable r12 = r0.mMarginDrawable
            int r13 = java.lang.Math.round(r11)
            int r14 = r0.mTopPageBounds
            int r15 = r0.mPageMargin
            float r15 = (float) r15
            float r15 = r15 + r11
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.mBottomPageBounds
            r12.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.mMarginDrawable
            r12 = r18
            r3.draw(r12)
            goto L_0x009c
        L_0x0098:
            r12 = r18
            r16 = r3
        L_0x009c:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x00a4
            goto L_0x00a9
        L_0x00a4:
            int r9 = r9 + 1
            r3 = r16
            goto L_0x0045
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onDraw(android.graphics.Canvas):void");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            resetTouch();
            return false;
        }
        if (action != 0) {
            if (this.mIsBeingDragged) {
                return true;
            }
            if (this.mIsUnableToDrag) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent2.getPointerId(0);
            this.mIsUnableToDrag = false;
            this.mIsScrollStarted = true;
            this.mScroller.computeScrollOffset();
            if (this.mScrollState != 2 || Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) <= this.mCloseEnough) {
                completeScroll(false);
                this.mIsBeingDragged = false;
            } else {
                this.mScroller.abortAnimation();
                this.mPopulatePending = false;
                populate();
                this.mIsBeingDragged = true;
                requestParentDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.mActivePointerId;
            if (i != -1) {
                int findPointerIndex = motionEvent2.findPointerIndex(i);
                float x2 = motionEvent2.getX(findPointerIndex);
                float f = x2 - this.mLastMotionX;
                float abs = Math.abs(f);
                float y2 = motionEvent2.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.mInitialMotionY);
                int i2 = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
                if (i2 != 0 && !isGutterDrag(this.mLastMotionX, f)) {
                    if (canScroll(this, false, (int) f, (int) x2, (int) y2)) {
                        this.mLastMotionX = x2;
                        this.mLastMotionY = y2;
                        this.mIsUnableToDrag = true;
                        return false;
                    }
                }
                int i3 = this.mTouchSlop;
                if (abs > ((float) i3) && abs * 0.5f > abs2) {
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                    float f2 = this.mInitialMotionX;
                    float f3 = (float) this.mTouchSlop;
                    this.mLastMotionX = i2 > 0 ? f2 + f3 : f2 - f3;
                    this.mLastMotionY = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > ((float) i3)) {
                    this.mIsUnableToDrag = true;
                }
                if (this.mIsBeingDragged && performDrag(x2)) {
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2368d.m5221k(this);
                }
            }
        } else if (action == 6) {
            onSecondaryPointerUp(motionEvent);
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent2);
        return this.mIsBeingDragged;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L_0x0020:
            r12 = 8
            if (r10 >= r1) goto L_0x00b6
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto L_0x00b2
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r12 = (androidx.viewpager.widget.ViewPager.LayoutParams) r12
            boolean r14 = r12.isDecor
            if (r14 == 0) goto L_0x00b2
            int r12 = r12.gravity
            r14 = r12 & 7
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L_0x005c
            r15 = 3
            if (r14 == r15) goto L_0x0056
            r15 = 5
            if (r14 == r15) goto L_0x0049
            r14 = r4
            goto L_0x006d
        L_0x0049:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L_0x0068
        L_0x0056:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L_0x006d
        L_0x005c:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L_0x0068:
            r17 = r14
            r14 = r4
            r4 = r17
        L_0x006d:
            r15 = 16
            if (r12 == r15) goto L_0x008e
            r15 = 48
            if (r12 == r15) goto L_0x0088
            r15 = 80
            if (r12 == r15) goto L_0x007b
            r12 = r5
            goto L_0x009f
        L_0x007b:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L_0x009a
        L_0x0088:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto L_0x009f
        L_0x008e:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L_0x009a:
            r17 = r12
            r12 = r5
            r5 = r17
        L_0x009f:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r16 + r5
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        L_0x00b2:
            int r10 = r10 + 1
            goto L_0x0020
        L_0x00b6:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        L_0x00b9:
            if (r6 >= r1) goto L_0x0106
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L_0x0103
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.isDecor
            if (r10 != 0) goto L_0x0103
            androidx.viewpager.widget.ViewPager$f r10 = r0.infoForChild(r8)
            if (r10 == 0) goto L_0x0103
            float r13 = (float) r2
            float r10 = r10.f7798e
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.needsMeasure
            if (r14 == 0) goto L_0x00f6
            r14 = 0
            r9.needsMeasure = r14
            float r9 = r9.widthFactor
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        L_0x00f6:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L_0x0103:
            int r6 = r6 + 1
            goto L_0x00b9
        L_0x0106:
            r0.mTopPageBounds = r5
            int r3 = r3 - r7
            r0.mBottomPageBounds = r3
            r0.mDecorChildCount = r11
            boolean r1 = r0.mFirstLayout
            if (r1 == 0) goto L_0x0118
            int r1 = r0.mCurItem
            r2 = 0
            r0.scrollToItem(r1, r2, r2, r2)
            goto L_0x0119
        L_0x0118:
            r2 = 0
        L_0x0119:
            r0.mFirstLayout = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i, int i2) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (!(childAt.getVisibility() == 8 || (layoutParams2 = (LayoutParams) childAt.getLayoutParams()) == null || !layoutParams2.isDecor)) {
                int i6 = layoutParams2.gravity;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (!(i7 == 3 || i7 == 5)) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = layoutParams2.width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = layoutParams2.height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((layoutParams = (LayoutParams) childAt2.getLayoutParams()) == null || !layoutParams.isDecor)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (((float) paddingLeft) * layoutParams.widthFactor), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onPageScrolled(int r13, float r14, int r15) {
        /*
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x006b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r2
        L_0x001b:
            if (r7 >= r6) goto L_0x006b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.isDecor
            if (r10 != 0) goto L_0x002c
            goto L_0x0068
        L_0x002c:
            int r9 = r9.gravity
            r9 = r9 & 7
            if (r9 == r1) goto L_0x004d
            r10 = 3
            if (r9 == r10) goto L_0x0047
            r10 = 5
            if (r9 == r10) goto L_0x003a
            r9 = r3
            goto L_0x005c
        L_0x003a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L_0x0059
        L_0x0047:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L_0x005c
        L_0x004d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L_0x0059:
            r11 = r9
            r9 = r3
            r3 = r11
        L_0x005c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L_0x0067
            r8.offsetLeftAndRight(r3)
        L_0x0067:
            r3 = r9
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x001b
        L_0x006b:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$j r13 = r12.mPageTransformer
            if (r13 == 0) goto L_0x0098
            r12.getScrollX()
            int r13 = r12.getChildCount()
        L_0x0079:
            if (r2 >= r13) goto L_0x0098
            android.view.View r14 = r12.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r15 = r14.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r15 = (androidx.viewpager.widget.ViewPager.LayoutParams) r15
            boolean r15 = r15.isDecor
            if (r15 == 0) goto L_0x008a
            goto L_0x0095
        L_0x008a:
            r14.getLeft()
            r12.getClientWidth()
            androidx.viewpager.widget.ViewPager$j r14 = r12.mPageTransformer
            r14.mo12708a()
        L_0x0095:
            int r2 = r2 + 1
            goto L_0x0079
        L_0x0098:
            r12.mCalledSuper = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        C3331f infoForChild;
        int childCount = getChildCount();
        int i4 = -1;
        if ((i & 2) != 0) {
            i4 = childCount;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = childCount - 1;
            i2 = -1;
        }
        while (i3 != i4) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.f7795b == this.mCurItem && childAt.requestFocus(i, rect)) {
                return true;
            }
            i3 += i2;
        }
        return false;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        C7717a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.mo10627q();
            setCurrentItemInternal(savedState.position, false, true);
            return;
        }
        this.mRestoredCurItem = savedState.position;
        this.mRestoredAdapterState = savedState.adapterState;
        this.mRestoredClassLoader = savedState.loader;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.position = this.mCurItem;
        C7717a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.mo10628r();
            savedState.adapterState = null;
        }
        return savedState;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.mPageMargin;
            recomputeScrollPosition(i, i3, i5, i5);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C7717a aVar;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.mAdapter) == null || aVar.mo20184j() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x = motionEvent.getX();
            this.mInitialMotionX = x;
            this.mLastMotionX = x;
            float y = motionEvent.getY();
            this.mInitialMotionY = y;
            this.mLastMotionY = y;
            this.mActivePointerId = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.mIsBeingDragged) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                    if (findPointerIndex == -1) {
                        z = resetTouch();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.mLastMotionX);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.mLastMotionY);
                        if (abs > ((float) this.mTouchSlop) && abs > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            float f = this.mInitialMotionX;
                            this.mLastMotionX = x2 - f > 0.0f ? f + ((float) this.mTouchSlop) : f - ((float) this.mTouchSlop);
                            this.mLastMotionY = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.mIsBeingDragged) {
                    z = false | performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.mLastMotionX = motionEvent.getX(actionIndex);
                    this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    onSecondaryPointerUp(motionEvent);
                    this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                }
            } else if (this.mIsBeingDragged) {
                scrollToItem(this.mCurItem, true, 0, false);
                z = resetTouch();
            }
        } else if (this.mIsBeingDragged) {
            VelocityTracker velocityTracker = this.mVelocityTracker;
            velocityTracker.computeCurrentVelocity(1000, (float) this.mMaximumVelocity);
            int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
            this.mPopulatePending = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            C3331f infoForCurrentScrollPosition = infoForCurrentScrollPosition();
            float f2 = (float) clientWidth;
            setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.f7795b, ((((float) scrollX) / f2) - infoForCurrentScrollPosition.f7798e) / (infoForCurrentScrollPosition.f7797d + (((float) this.mPageMargin) / f2)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
            z = resetTouch();
        }
        if (z) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i = this.mCurItem;
        if (i <= 0) {
            return false;
        }
        setCurrentItem(i - 1, true);
        return true;
    }

    public boolean pageRight() {
        C7717a aVar = this.mAdapter;
        if (aVar == null || this.mCurItem >= aVar.mo20184j() - 1) {
            return false;
        }
        setCurrentItem(this.mCurItem + 1, true);
        return true;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(C3333h hVar) {
        List<C3333h> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(hVar);
        }
    }

    public void removeOnPageChangeListener(C3334i iVar) {
        List<C3334i> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(C7717a aVar) {
        C7717a aVar2 = this.mAdapter;
        if (aVar2 != null) {
            synchronized (aVar2) {
                aVar2.f17112c = null;
            }
            this.mAdapter.mo10630t(this);
            for (int i = 0; i < this.mItems.size(); i++) {
                C3331f fVar = this.mItems.get(i);
                this.mAdapter.mo10623h(this, fVar.f7795b, fVar.f7794a);
            }
            this.mAdapter.mo10624i();
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        C7717a aVar3 = this.mAdapter;
        this.mAdapter = aVar;
        this.mExpectedAdapterCount = 0;
        if (aVar != null) {
            if (this.mObserver == null) {
                this.mObserver = new C3336k();
            }
            C7717a aVar4 = this.mAdapter;
            C3336k kVar = this.mObserver;
            synchronized (aVar4) {
                aVar4.f17112c = kVar;
            }
            this.mPopulatePending = false;
            boolean z = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.mo20184j();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.mo10627q();
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<C3333h> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty()) {
            int size = this.mAdapterChangeListeners.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mAdapterChangeListeners.get(i2).mo12624a(this, aVar3, aVar);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2) {
        setCurrentItemInternal(i, z, z2, 0);
    }

    public C3334i setInternalPageChangeListener(C3334i iVar) {
        C3334i iVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = iVar;
        return iVar2;
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i + " too small; defaulting to " + 1);
            i = 1;
        }
        if (i != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(C3334i iVar) {
        this.mOnPageChangeListener = iVar;
    }

    public void setPageMargin(int i) {
        int i2 = this.mPageMargin;
        this.mPageMargin = i;
        int width = getWidth();
        recomputeScrollPosition(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z, C3335j jVar) {
        setPageTransformer(z, jVar, 2);
    }

    public void setScrollState(int i) {
        if (this.mScrollState != i) {
            this.mScrollState = i;
            if (this.mPageTransformer != null) {
                enableLayers(i != 0);
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void smoothScrollTo(int i, int i2) {
        smoothScrollTo(i, i2, 0);
    }

    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.mMarginDrawable;
    }

    public static class LayoutParams extends ViewGroup.LayoutParams {
        public int childIndex;
        public int gravity;
        public boolean isDecor;
        public boolean needsMeasure;
        public int position;
        public float widthFactor = 0.0f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.LAYOUT_ATTRS);
            this.gravity = obtainStyledAttributes.getInteger(0, 48);
            obtainStyledAttributes.recycle();
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005b, code lost:
        if (r5 == r6) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void populate(int r15) {
        /*
            r14 = this;
            int r0 = r14.mCurItem
            if (r0 == r15) goto L_0x000b
            androidx.viewpager.widget.ViewPager$f r0 = r14.infoForPosition(r0)
            r14.mCurItem = r15
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            q2.a r15 = r14.mAdapter
            if (r15 != 0) goto L_0x0014
            r14.sortChildDrawingOrder()
            return
        L_0x0014:
            boolean r15 = r14.mPopulatePending
            if (r15 == 0) goto L_0x001c
            r14.sortChildDrawingOrder()
            return
        L_0x001c:
            android.os.IBinder r15 = r14.getWindowToken()
            if (r15 != 0) goto L_0x0023
            return
        L_0x0023:
            q2.a r15 = r14.mAdapter
            r15.mo10630t(r14)
            int r15 = r14.mOffscreenPageLimit
            int r1 = r14.mCurItem
            int r1 = r1 - r15
            r2 = 0
            int r1 = java.lang.Math.max(r2, r1)
            q2.a r3 = r14.mAdapter
            int r3 = r3.mo20184j()
            int r4 = r3 + -1
            int r5 = r14.mCurItem
            int r5 = r5 + r15
            int r15 = java.lang.Math.min(r4, r5)
            int r4 = r14.mExpectedAdapterCount
            if (r3 != r4) goto L_0x0207
        L_0x0045:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r4 = r14.mItems
            int r4 = r4.size()
            if (r2 >= r4) goto L_0x0061
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r4 = r14.mItems
            java.lang.Object r4 = r4.get(r2)
            androidx.viewpager.widget.ViewPager$f r4 = (androidx.viewpager.widget.ViewPager.C3331f) r4
            int r5 = r4.f7795b
            int r6 = r14.mCurItem
            if (r5 < r6) goto L_0x005e
            if (r5 != r6) goto L_0x0061
            goto L_0x0062
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x0061:
            r4 = 0
        L_0x0062:
            if (r4 != 0) goto L_0x006c
            if (r3 <= 0) goto L_0x006c
            int r4 = r14.mCurItem
            androidx.viewpager.widget.ViewPager$f r4 = r14.addNewItem(r4, r2)
        L_0x006c:
            r5 = 0
            if (r4 == 0) goto L_0x0194
            int r6 = r2 + -1
            if (r6 < 0) goto L_0x007c
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.C3331f) r7
            goto L_0x007d
        L_0x007c:
            r7 = 0
        L_0x007d:
            int r8 = r14.getClientWidth()
            r9 = 1073741824(0x40000000, float:2.0)
            if (r8 > 0) goto L_0x0087
            r11 = r5
            goto L_0x0093
        L_0x0087:
            float r10 = r4.f7797d
            float r10 = r9 - r10
            int r11 = r14.getPaddingLeft()
            float r11 = (float) r11
            float r12 = (float) r8
            float r11 = r11 / r12
            float r11 = r11 + r10
        L_0x0093:
            int r10 = r14.mCurItem
            int r10 = r10 + -1
            r12 = r5
        L_0x0098:
            if (r10 < 0) goto L_0x00f6
            int r13 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x00c6
            if (r10 >= r1) goto L_0x00c6
            if (r7 != 0) goto L_0x00a3
            goto L_0x00f6
        L_0x00a3:
            int r13 = r7.f7795b
            if (r10 != r13) goto L_0x00f3
            boolean r13 = r7.f7796c
            if (r13 != 0) goto L_0x00f3
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r13 = r14.mItems
            r13.remove(r6)
            q2.a r13 = r14.mAdapter
            java.lang.Object r7 = r7.f7794a
            r13.mo10623h(r14, r10, r7)
            int r6 = r6 + -1
            int r2 = r2 + -1
            if (r6 < 0) goto L_0x00f2
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.C3331f) r7
            goto L_0x00f3
        L_0x00c6:
            if (r7 == 0) goto L_0x00dc
            int r13 = r7.f7795b
            if (r10 != r13) goto L_0x00dc
            float r7 = r7.f7797d
            float r12 = r12 + r7
            int r6 = r6 + -1
            if (r6 < 0) goto L_0x00f2
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.C3331f) r7
            goto L_0x00f3
        L_0x00dc:
            int r7 = r6 + 1
            androidx.viewpager.widget.ViewPager$f r7 = r14.addNewItem(r10, r7)
            float r7 = r7.f7797d
            float r12 = r12 + r7
            int r2 = r2 + 1
            if (r6 < 0) goto L_0x00f2
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.C3331f) r7
            goto L_0x00f3
        L_0x00f2:
            r7 = 0
        L_0x00f3:
            int r10 = r10 + -1
            goto L_0x0098
        L_0x00f6:
            float r1 = r4.f7797d
            int r6 = r2 + 1
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0188
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x010f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.C3331f) r7
            goto L_0x0110
        L_0x010f:
            r7 = 0
        L_0x0110:
            if (r8 > 0) goto L_0x0114
            r10 = r5
            goto L_0x011c
        L_0x0114:
            int r10 = r14.getPaddingRight()
            float r10 = (float) r10
            float r8 = (float) r8
            float r10 = r10 / r8
            float r10 = r10 + r9
        L_0x011c:
            int r8 = r14.mCurItem
        L_0x011e:
            int r8 = r8 + 1
            if (r8 >= r3) goto L_0x0188
            int r9 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r9 < 0) goto L_0x0150
            if (r8 <= r15) goto L_0x0150
            if (r7 != 0) goto L_0x012b
            goto L_0x0188
        L_0x012b:
            int r9 = r7.f7795b
            if (r8 != r9) goto L_0x011e
            boolean r9 = r7.f7796c
            if (r9 != 0) goto L_0x011e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r9 = r14.mItems
            r9.remove(r6)
            q2.a r9 = r14.mAdapter
            java.lang.Object r7 = r7.f7794a
            r9.mo10623h(r14, r8, r7)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0186
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.C3331f) r7
            goto L_0x011e
        L_0x0150:
            if (r7 == 0) goto L_0x016c
            int r9 = r7.f7795b
            if (r8 != r9) goto L_0x016c
            float r7 = r7.f7797d
            float r1 = r1 + r7
            int r6 = r6 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0186
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.C3331f) r7
            goto L_0x011e
        L_0x016c:
            androidx.viewpager.widget.ViewPager$f r7 = r14.addNewItem(r8, r6)
            int r6 = r6 + 1
            float r7 = r7.f7797d
            float r1 = r1 + r7
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0186
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$f> r7 = r14.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.viewpager.widget.ViewPager$f r7 = (androidx.viewpager.widget.ViewPager.C3331f) r7
            goto L_0x011e
        L_0x0186:
            r7 = 0
            goto L_0x011e
        L_0x0188:
            r14.calculatePageOffsets(r4, r2, r0)
            q2.a r15 = r14.mAdapter
            int r0 = r14.mCurItem
            java.lang.Object r1 = r4.f7794a
            r15.mo10629s(r14, r0, r1)
        L_0x0194:
            q2.a r15 = r14.mAdapter
            r15.mo10624i()
            int r15 = r14.getChildCount()
            r0 = 0
        L_0x019e:
            if (r0 >= r15) goto L_0x01c7
            android.view.View r1 = r14.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r2 = (androidx.viewpager.widget.ViewPager.LayoutParams) r2
            r2.childIndex = r0
            boolean r3 = r2.isDecor
            if (r3 != 0) goto L_0x01c4
            float r3 = r2.widthFactor
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x01c4
            androidx.viewpager.widget.ViewPager$f r1 = r14.infoForChild(r1)
            if (r1 == 0) goto L_0x01c4
            float r3 = r1.f7797d
            r2.widthFactor = r3
            int r1 = r1.f7795b
            r2.position = r1
        L_0x01c4:
            int r0 = r0 + 1
            goto L_0x019e
        L_0x01c7:
            r14.sortChildDrawingOrder()
            boolean r15 = r14.hasFocus()
            if (r15 == 0) goto L_0x0206
            android.view.View r15 = r14.findFocus()
            if (r15 == 0) goto L_0x01db
            androidx.viewpager.widget.ViewPager$f r15 = r14.infoForAnyChild(r15)
            goto L_0x01dc
        L_0x01db:
            r15 = 0
        L_0x01dc:
            if (r15 == 0) goto L_0x01e4
            int r15 = r15.f7795b
            int r0 = r14.mCurItem
            if (r15 == r0) goto L_0x0206
        L_0x01e4:
            r15 = 0
        L_0x01e5:
            int r0 = r14.getChildCount()
            if (r15 >= r0) goto L_0x0206
            android.view.View r0 = r14.getChildAt(r15)
            androidx.viewpager.widget.ViewPager$f r1 = r14.infoForChild(r0)
            if (r1 == 0) goto L_0x0203
            int r1 = r1.f7795b
            int r2 = r14.mCurItem
            if (r1 != r2) goto L_0x0203
            r1 = 2
            boolean r0 = r0.requestFocus(r1)
            if (r0 == 0) goto L_0x0203
            goto L_0x0206
        L_0x0203:
            int r15 = r15 + 1
            goto L_0x01e5
        L_0x0206:
            return
        L_0x0207:
            android.content.res.Resources r15 = r14.getResources()     // Catch:{ NotFoundException -> 0x0214 }
            int r0 = r14.getId()     // Catch:{ NotFoundException -> 0x0214 }
            java.lang.String r15 = r15.getResourceName(r0)     // Catch:{ NotFoundException -> 0x0214 }
            goto L_0x021c
        L_0x0214:
            int r15 = r14.getId()
            java.lang.String r15 = java.lang.Integer.toHexString(r15)
        L_0x021c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            java.lang.StringBuilder r1 = android.support.p013v4.media.C0072d.m201h(r1)
            int r2 = r14.mExpectedAdapterCount
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = " Pager id: "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = " Pager class: "
            r1.append(r15)
            java.lang.Class r15 = r14.getClass()
            r1.append(r15)
            java.lang.String r15 = " Problematic adapter: "
            r1.append(r15)
            q2.a r15 = r14.mAdapter
            java.lang.Class r15 = r15.getClass()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void setCurrentItemInternal(int i, boolean z, boolean z2, int i2) {
        C7717a aVar = this.mAdapter;
        boolean z3 = false;
        if (aVar == null || aVar.mo20184j() <= 0) {
            setScrollingCacheEnabled(false);
        } else if (z2 || this.mCurItem != i || this.mItems.size() == 0) {
            if (i < 0) {
                i = 0;
            } else if (i >= this.mAdapter.mo20184j()) {
                i = this.mAdapter.mo20184j() - 1;
            }
            int i3 = this.mOffscreenPageLimit;
            int i4 = this.mCurItem;
            if (i > i4 + i3 || i < i4 - i3) {
                for (int i5 = 0; i5 < this.mItems.size(); i5++) {
                    this.mItems.get(i5).f7796c = true;
                }
            }
            if (this.mCurItem != i) {
                z3 = true;
            }
            if (this.mFirstLayout) {
                this.mCurItem = i;
                if (z3) {
                    dispatchOnPageSelected(i);
                }
                requestLayout();
                return;
            }
            populate(i);
            scrollToItem(i, z, i2, z3);
        } else {
            setScrollingCacheEnabled(false);
        }
    }

    public void setPageTransformer(boolean z, C3335j jVar, int i) {
        int i2 = 1;
        boolean z2 = jVar != null;
        boolean z3 = z2 != (this.mPageTransformer != null);
        this.mPageTransformer = jVar;
        setChildrenDrawingOrderEnabled(z2);
        if (z2) {
            if (z) {
                i2 = 2;
            }
            this.mDrawingOrder = i2;
            this.mPageTransformerLayerType = i;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z3) {
            populate();
        }
    }

    public void smoothScrollTo(int i, int i2, int i3) {
        int i4;
        int i5;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            i4 = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            i4 = getScrollX();
        }
        int i6 = i4;
        int scrollY = getScrollY();
        int i7 = i - i6;
        int i8 = i2 - scrollY;
        if (i7 == 0 && i8 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i9 = clientWidth / 2;
        float f = (float) clientWidth;
        float f2 = (float) i9;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (((float) Math.abs(i7)) * 1.0f) / f)) * f2) + f2;
        int abs = Math.abs(i3);
        if (abs > 0) {
            i5 = Math.round(Math.abs(distanceInfluenceForSnapDuration / ((float) abs)) * 1000.0f) * 4;
        } else {
            i5 = (int) (((((float) Math.abs(i7)) / ((this.mAdapter.mo20187m() * f) + ((float) this.mPageMargin))) + 1.0f) * 100.0f);
        }
        int min = Math.min(i5, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i6, scrollY, i7, i8, min);
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5221k(this);
    }

    public void setCurrentItem(int i, boolean z) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i, z, false);
    }

    public void setPageMarginDrawable(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        setPageMarginDrawable(C8184a.C8187c.m16466b(context, i));
    }

    public ViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initViewPager();
    }
}
