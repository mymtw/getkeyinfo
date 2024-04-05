package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.C3132c0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.C3339a;
import androidx.viewpager2.widget.C3362f;
import com.google.android.material.badge.BadgeDrawable;
import java.util.WeakHashMap;
import p088e1.C6689b;
import p088e1.C6697d;
import p405nc.C13110a;

public final class ViewPager2 extends ViewGroup {
    public static final int OFFSCREEN_PAGE_LIMIT_DEFAULT = -1;
    public static final int ORIENTATION_HORIZONTAL = 0;
    public static final int ORIENTATION_VERTICAL = 1;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static boolean sFeatureEnhancedA11yEnabled = true;
    public C3345e mAccessibilityProvider;
    public int mCurrentItem;
    private RecyclerView.C3091i mCurrentItemDataSetChangeObserver = new C3341a();
    public boolean mCurrentItemDirty = false;
    private C3359c mExternalPageChangeCallbacks = new C3359c();
    private C3360d mFakeDragger;
    private LinearLayoutManager mLayoutManager;
    private int mOffscreenPageLimit = -1;
    private C3359c mPageChangeEventDispatcher;
    private C3361e mPageTransformerAdapter;
    private C3132c0 mPagerSnapHelper;
    private Parcelable mPendingAdapterState;
    private int mPendingCurrentItem = -1;
    public RecyclerView mRecyclerView;
    private RecyclerView.C3094l mSavedItemAnimator = null;
    private boolean mSavedItemAnimatorPresent = false;
    public C3362f mScrollEventAdapter;
    private final Rect mTmpChildRect = new Rect();
    private final Rect mTmpContainerRect = new Rect();
    private boolean mUserInputEnabled = true;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C3341a extends C3347g {
        public C3341a() {
            super(0);
        }

        /* renamed from: a */
        public final void mo11115a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.mCurrentItemDirty = true;
            viewPager2.mScrollEventAdapter.f7842m = true;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C3342b extends C3349i {
        public C3342b() {
        }

        /* renamed from: a */
        public final void mo12762a(int i) {
            if (i == 0) {
                ViewPager2.this.updateCurrentItem();
            }
        }

        /* renamed from: c */
        public final void mo12763c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.mCurrentItem != i) {
                viewPager2.mCurrentItem = i;
                viewPager2.mAccessibilityProvider.mo12778o();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C3343c extends C3349i {
        public C3343c() {
        }

        /* renamed from: c */
        public final void mo12763c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.mRecyclerView.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public class C3344d implements RecyclerView.C3105p {
        /* renamed from: a */
        public final void mo11683a(View view) {
        }

        /* renamed from: b */
        public final void mo11684b(View view) {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            if (layoutParams.width != -1 || layoutParams.height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public abstract class C3345e {
        /* renamed from: a */
        public boolean mo12764a(int i) {
            return false;
        }

        /* renamed from: b */
        public boolean mo12765b(int i) {
            return false;
        }

        /* renamed from: c */
        public void mo12766c(RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: d */
        public void mo12767d(RecyclerView.Adapter<?> adapter) {
        }

        /* renamed from: e */
        public String mo12768e() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: f */
        public void mo12769f(RecyclerView recyclerView) {
        }

        /* renamed from: g */
        public void mo12770g(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        /* renamed from: h */
        public void mo12771h(C6689b bVar) {
        }

        /* renamed from: i */
        public boolean mo12772i(int i) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: j */
        public boolean mo12773j(int i, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: k */
        public void mo12774k() {
        }

        /* renamed from: l */
        public CharSequence mo12775l() {
            throw new IllegalStateException("Not implemented.");
        }

        /* renamed from: m */
        public void mo12776m(AccessibilityEvent accessibilityEvent) {
        }

        /* renamed from: n */
        public void mo12777n() {
        }

        /* renamed from: o */
        public void mo12778o() {
        }

        /* renamed from: p */
        public void mo12779p() {
        }

        /* renamed from: q */
        public void mo12780q() {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C3346f extends C3345e {
        public C3346f() {
        }

        /* renamed from: a */
        public final boolean mo12764a(int i) {
            return (i == 8192 || i == 4096) && !ViewPager2.this.isUserInputEnabled();
        }

        /* renamed from: h */
        public final void mo12771h(C6689b bVar) {
            if (!ViewPager2.this.isUserInputEnabled()) {
                bVar.mo18862l(C6689b.C6690a.f14769l);
                bVar.mo18862l(C6689b.C6690a.f14768k);
                bVar.mo18872u(false);
            }
        }

        /* renamed from: i */
        public final boolean mo12772i(int i) {
            if (mo12764a(i)) {
                return false;
            }
            throw new IllegalStateException();
        }

        /* renamed from: l */
        public final CharSequence mo12775l() {
            return "androidx.viewpager.widget.ViewPager";
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class C3347g extends RecyclerView.C3091i {
        public C3347g(int i) {
        }

        /* renamed from: a */
        public abstract void mo11115a();

        /* renamed from: b */
        public final void mo11116b() {
            mo11115a();
        }

        /* renamed from: c */
        public final void mo11117c(int i, int i2, Object obj) {
            mo11115a();
        }

        /* renamed from: d */
        public final void mo11118d(int i, int i2) {
            mo11115a();
        }

        /* renamed from: e */
        public final void mo11119e(int i, int i2) {
            mo11115a();
        }

        /* renamed from: f */
        public final void mo11120f(int i, int i2) {
            mo11115a();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C3348h extends LinearLayoutManager {
        public C3348h() {
        }

        /* renamed from: H0 */
        public final void mo11271H0(RecyclerView.C3117y yVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.mo11271H0(yVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        /* renamed from: Z */
        public final void mo11659Z(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, C6689b bVar) {
            super.mo11659Z(uVar, yVar, bVar);
            ViewPager2.this.mAccessibilityProvider.mo12771h(bVar);
        }

        /* renamed from: m0 */
        public final boolean mo11665m0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, int i, Bundle bundle) {
            return ViewPager2.this.mAccessibilityProvider.mo12764a(i) ? ViewPager2.this.mAccessibilityProvider.mo12772i(i) : super.mo11665m0(uVar, yVar, i, bundle);
        }

        /* renamed from: r0 */
        public final boolean mo11671r0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public static abstract class C3349i {
        /* renamed from: a */
        public void mo12762a(int i) {
        }

        /* renamed from: b */
        public void mo12781b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo12763c(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C3350j extends C3345e {

        /* renamed from: a */
        public final C3351a f7809a = new C3351a();

        /* renamed from: b */
        public final C3352b f7810b = new C3352b();

        /* renamed from: c */
        public C3364g f7811c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$a */
        public class C3351a implements C6697d {
            public C3351a() {
            }

            /* renamed from: a */
            public final boolean mo10006a(View view) {
                C3350j jVar = C3350j.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                if (ViewPager2.this.isUserInputEnabled()) {
                    ViewPager2.this.setCurrentItemInternal(currentItem, true);
                }
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$j$b */
        public class C3352b implements C6697d {
            public C3352b() {
            }

            /* renamed from: a */
            public final boolean mo10006a(View view) {
                C3350j jVar = C3350j.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                if (ViewPager2.this.isUserInputEnabled()) {
                    ViewPager2.this.setCurrentItemInternal(currentItem, true);
                }
                return true;
            }
        }

        public C3350j() {
        }

        /* renamed from: b */
        public final boolean mo12765b(int i) {
            return i == 8192 || i == 4096;
        }

        /* renamed from: c */
        public final void mo12766c(RecyclerView.Adapter<?> adapter) {
            mo12782r();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(this.f7811c);
            }
        }

        /* renamed from: d */
        public final void mo12767d(RecyclerView.Adapter<?> adapter) {
            if (adapter != null) {
                adapter.unregisterAdapterDataObserver(this.f7811c);
            }
        }

        /* renamed from: e */
        public final String mo12768e() {
            return "androidx.viewpager.widget.ViewPager";
        }

        /* renamed from: f */
        public final void mo12769f(RecyclerView recyclerView) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5229s(recyclerView, 2);
            this.f7811c = new C3364g(this);
            if (C2364y.C2368d.m5213c(ViewPager2.this) == 0) {
                C2364y.C2368d.m5229s(ViewPager2.this, 1);
            }
        }

        /* renamed from: g */
        public final void mo12770g(AccessibilityNodeInfo accessibilityNodeInfo) {
            int i;
            int i2;
            int itemCount;
            if (ViewPager2.this.getAdapter() == null) {
                i2 = 0;
                i = 0;
            } else if (ViewPager2.this.getOrientation() == 1) {
                i2 = ViewPager2.this.getAdapter().getItemCount();
                i = 0;
            } else {
                i = ViewPager2.this.getAdapter().getItemCount();
                i2 = 0;
            }
            accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) C6689b.C6691b.m13081a(i2, i, 0).f14782a);
            RecyclerView.Adapter adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.isUserInputEnabled()) {
                if (ViewPager2.this.mCurrentItem > 0) {
                    accessibilityNodeInfo.addAction(8192);
                }
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    accessibilityNodeInfo.addAction(RecyclerView.C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                }
                accessibilityNodeInfo.setScrollable(true);
            }
        }

        /* renamed from: j */
        public final boolean mo12773j(int i, Bundle bundle) {
            if (mo12765b(i)) {
                int currentItem = i == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1;
                if (ViewPager2.this.isUserInputEnabled()) {
                    ViewPager2.this.setCurrentItemInternal(currentItem, true);
                }
                return true;
            }
            throw new IllegalStateException();
        }

        /* renamed from: k */
        public final void mo12774k() {
            mo12782r();
        }

        /* renamed from: m */
        public final void mo12776m(AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        /* renamed from: n */
        public final void mo12777n() {
            mo12782r();
        }

        /* renamed from: o */
        public final void mo12778o() {
            mo12782r();
        }

        /* renamed from: p */
        public final void mo12779p() {
            mo12782r();
        }

        /* renamed from: q */
        public final void mo12780q() {
            mo12782r();
        }

        /* renamed from: r */
        public final void mo12782r() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i = 16908360;
            C2364y.m5198m(16908360, viewPager2);
            C2364y.m5195j(0, viewPager2);
            C2364y.m5198m(16908361, viewPager2);
            C2364y.m5195j(0, viewPager2);
            C2364y.m5198m(16908358, viewPager2);
            C2364y.m5195j(0, viewPager2);
            C2364y.m5198m(16908359, viewPager2);
            C2364y.m5195j(0, viewPager2);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.isUserInputEnabled()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean isRtl = ViewPager2.this.isRtl();
                    int i2 = isRtl ? 16908360 : 16908361;
                    if (isRtl) {
                        i = 16908361;
                    }
                    if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                        C2364y.m5199n(viewPager2, new C6689b.C6690a(i2, (CharSequence) null), this.f7809a);
                    }
                    if (ViewPager2.this.mCurrentItem > 0) {
                        C2364y.m5199n(viewPager2, new C6689b.C6690a(i, (CharSequence) null), this.f7810b);
                        return;
                    }
                    return;
                }
                if (ViewPager2.this.mCurrentItem < itemCount - 1) {
                    C2364y.m5199n(viewPager2, new C6689b.C6690a(16908359, (CharSequence) null), this.f7809a);
                }
                if (ViewPager2.this.mCurrentItem > 0) {
                    C2364y.m5199n(viewPager2, new C6689b.C6690a(16908358, (CharSequence) null), this.f7810b);
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public interface C3353k {
        /* renamed from: a */
        void mo12783a();
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public class C3354l extends C3132c0 {
        public C3354l() {
        }

        /* renamed from: e */
        public final View mo11822e(RecyclerView.C3100o oVar) {
            if (ViewPager2.this.isFakeDragging()) {
                return null;
            }
            return super.mo11822e(oVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$m */
    public class C3355m extends RecyclerView {
        public C3355m(Context context) {
            super(context);
        }

        public final CharSequence getAccessibilityClassName() {
            C3345e eVar = ViewPager2.this.mAccessibilityProvider;
            eVar.getClass();
            return eVar instanceof C3346f ? ViewPager2.this.mAccessibilityProvider.mo12775l() : super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.mCurrentItem);
            accessibilityEvent.setToIndex(ViewPager2.this.mCurrentItem);
            ViewPager2.this.mAccessibilityProvider.mo12776m(accessibilityEvent);
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onInterceptTouchEvent(motionEvent);
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.isUserInputEnabled() && super.onTouchEvent(motionEvent);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$n */
    public static class C3356n implements Runnable {

        /* renamed from: b */
        public final int f7817b;

        /* renamed from: c */
        public final RecyclerView f7818c;

        public C3356n(RecyclerView recyclerView, int i) {
            this.f7817b = i;
            this.f7818c = recyclerView;
        }

        public final void run() {
            this.f7818c.smoothScrollToPosition(this.f7817b);
        }
    }

    public ViewPager2(Context context) {
        super(context);
        initialize(context, (AttributeSet) null);
    }

    private RecyclerView.C3105p enforceChildFillListener() {
        return new C3344d();
    }

    private void initialize(Context context, AttributeSet attributeSet) {
        this.mAccessibilityProvider = sFeatureEnhancedA11yEnabled ? new C3350j() : new C3346f();
        C3355m mVar = new C3355m(context);
        this.mRecyclerView = mVar;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        mVar.setId(C2364y.C2369e.m5230a());
        this.mRecyclerView.setDescendantFocusability(131072);
        C3348h hVar = new C3348h();
        this.mLayoutManager = hVar;
        this.mRecyclerView.setLayoutManager(hVar);
        this.mRecyclerView.setScrollingTouchSlop(1);
        setOrientation(context, attributeSet);
        this.mRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.mRecyclerView.addOnChildAttachStateChangeListener(enforceChildFillListener());
        C3362f fVar = new C3362f(this);
        this.mScrollEventAdapter = fVar;
        this.mFakeDragger = new C3360d(this, fVar, this.mRecyclerView);
        C3354l lVar = new C3354l();
        this.mPagerSnapHelper = lVar;
        lVar.mo11867a(this.mRecyclerView);
        this.mRecyclerView.addOnScrollListener(this.mScrollEventAdapter);
        C3359c cVar = new C3359c();
        this.mPageChangeEventDispatcher = cVar;
        this.mScrollEventAdapter.f7831b = cVar;
        C3342b bVar = new C3342b();
        C3343c cVar2 = new C3343c();
        this.mPageChangeEventDispatcher.f7821a.add(bVar);
        this.mPageChangeEventDispatcher.f7821a.add(cVar2);
        this.mAccessibilityProvider.mo12769f(this.mRecyclerView);
        this.mPageChangeEventDispatcher.f7821a.add(this.mExternalPageChangeCallbacks);
        C3361e eVar = new C3361e(this.mLayoutManager);
        this.mPageTransformerAdapter = eVar;
        this.mPageChangeEventDispatcher.f7821a.add(eVar);
        RecyclerView recyclerView = this.mRecyclerView;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void registerCurrentItemDataSetTracker(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    private void restorePendingState() {
        RecyclerView.Adapter adapter;
        if (this.mPendingCurrentItem != -1 && (adapter = getAdapter()) != null) {
            if (this.mPendingAdapterState != null) {
                if (adapter instanceof C3339a) {
                    ((C3339a) adapter).mo12713b();
                }
                this.mPendingAdapterState = null;
            }
            int max = Math.max(0, Math.min(this.mPendingCurrentItem, adapter.getItemCount() - 1));
            this.mCurrentItem = max;
            this.mPendingCurrentItem = -1;
            this.mRecyclerView.scrollToPosition(max);
            this.mAccessibilityProvider.mo12774k();
        }
    }

    private void setOrientation(Context context, AttributeSet attributeSet) {
        int[] iArr = C13110a.f28825c;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(0, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private void unregisterCurrentItemDataSetTracker(RecyclerView.Adapter<?> adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.mCurrentItemDataSetChangeObserver);
        }
    }

    public void addItemDecoration(RecyclerView.C3099n nVar) {
        this.mRecyclerView.addItemDecoration(nVar);
    }

    public boolean beginFakeDrag() {
        C3360d dVar = this.mFakeDragger;
        boolean z = false;
        if (dVar.f7823b.f7836g == 1) {
            return false;
        }
        dVar.f7828g = 0;
        dVar.f7827f = (float) 0;
        dVar.f7829h = SystemClock.uptimeMillis();
        VelocityTracker velocityTracker = dVar.f7825d;
        if (velocityTracker == null) {
            dVar.f7825d = VelocityTracker.obtain();
            dVar.f7826e = ViewConfiguration.get(dVar.f7822a.getContext()).getScaledMaximumFlingVelocity();
        } else {
            velocityTracker.clear();
        }
        C3362f fVar = dVar.f7823b;
        fVar.f7835f = 4;
        fVar.mo12790d(true);
        if (dVar.f7823b.f7836g == 0) {
            z = true;
        }
        if (!z) {
            dVar.f7824c.stopScroll();
        }
        long j = dVar.f7829h;
        MotionEvent obtain = MotionEvent.obtain(j, j, 0, 0.0f, 0.0f, 0);
        dVar.f7825d.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public boolean canScrollHorizontally(int i) {
        return this.mRecyclerView.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        return this.mRecyclerView.canScrollVertically(i);
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f7801b;
            sparseArray.put(this.mRecyclerView.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        restorePendingState();
    }

    public boolean endFakeDrag() {
        C3360d dVar = this.mFakeDragger;
        C3362f fVar = dVar.f7823b;
        boolean z = fVar.f7843n;
        if (!z) {
            return false;
        }
        if (!(fVar.f7836g == 1) || z) {
            fVar.f7843n = false;
            fVar.mo12791e();
            C3362f.C3363a aVar = fVar.f7837h;
            if (aVar.f7846c == 0) {
                int i = aVar.f7844a;
                if (i != fVar.f7838i) {
                    fVar.mo12787a(i);
                }
                fVar.mo12788b(0);
                fVar.mo12789c();
            } else {
                fVar.mo12788b(2);
            }
        }
        VelocityTracker velocityTracker = dVar.f7825d;
        velocityTracker.computeCurrentVelocity(1000, (float) dVar.f7826e);
        if (dVar.f7824c.fling((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            return true;
        }
        dVar.f7822a.snapToPage();
        return true;
    }

    public boolean fakeDragBy(@SuppressLint({"SupportAnnotationUsage"}) float f) {
        C3360d dVar = this.mFakeDragger;
        int i = 0;
        if (!dVar.f7823b.f7843n) {
            return false;
        }
        float f2 = dVar.f7827f - f;
        dVar.f7827f = f2;
        int round = Math.round(f2 - ((float) dVar.f7828g));
        dVar.f7828g += round;
        long uptimeMillis = SystemClock.uptimeMillis();
        boolean z = dVar.f7822a.getOrientation() == 0;
        int i2 = z ? round : 0;
        if (!z) {
            i = round;
        }
        float f3 = 0.0f;
        float f4 = z ? dVar.f7827f : 0.0f;
        if (!z) {
            f3 = dVar.f7827f;
        }
        dVar.f7824c.scrollBy(i2, i);
        MotionEvent obtain = MotionEvent.obtain(dVar.f7829h, uptimeMillis, 2, f4, f3, 0);
        dVar.f7825d.addMovement(obtain);
        obtain.recycle();
        return true;
    }

    public CharSequence getAccessibilityClassName() {
        C3345e eVar = this.mAccessibilityProvider;
        eVar.getClass();
        return eVar instanceof C3350j ? this.mAccessibilityProvider.mo12768e() : super.getAccessibilityClassName();
    }

    public RecyclerView.Adapter getAdapter() {
        return this.mRecyclerView.getAdapter();
    }

    public int getCurrentItem() {
        return this.mCurrentItem;
    }

    public RecyclerView.C3099n getItemDecorationAt(int i) {
        return this.mRecyclerView.getItemDecorationAt(i);
    }

    public int getItemDecorationCount() {
        return this.mRecyclerView.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getOrientation() {
        return this.mLayoutManager.f7017p;
    }

    public int getPageSize() {
        int i;
        int i2;
        RecyclerView recyclerView = this.mRecyclerView;
        if (getOrientation() == 0) {
            i = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            i2 = recyclerView.getPaddingRight();
        } else {
            i = recyclerView.getHeight() - recyclerView.getPaddingTop();
            i2 = recyclerView.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.mScrollEventAdapter.f7836g;
    }

    public void invalidateItemDecorations() {
        this.mRecyclerView.invalidateItemDecorations();
    }

    public boolean isFakeDragging() {
        return this.mFakeDragger.f7823b.f7843n;
    }

    public boolean isRtl() {
        return this.mLayoutManager.mo11646C() == 1;
    }

    public boolean isUserInputEnabled() {
        return this.mUserInputEnabled;
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.mAccessibilityProvider.mo12770g(accessibilityNodeInfo);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        this.mTmpContainerRect.left = getPaddingLeft();
        this.mTmpContainerRect.right = (i3 - i) - getPaddingRight();
        this.mTmpContainerRect.top = getPaddingTop();
        this.mTmpContainerRect.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(BadgeDrawable.TOP_START, measuredWidth, measuredHeight, this.mTmpContainerRect, this.mTmpChildRect);
        RecyclerView recyclerView = this.mRecyclerView;
        Rect rect = this.mTmpChildRect;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.mCurrentItemDirty) {
            updateCurrentItem();
        }
    }

    public void onMeasure(int i, int i2) {
        measureChild(this.mRecyclerView, i, i2);
        int measuredWidth = this.mRecyclerView.getMeasuredWidth();
        int measuredHeight = this.mRecyclerView.getMeasuredHeight();
        int measuredState = this.mRecyclerView.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.mPendingCurrentItem = savedState.f7802c;
        this.mPendingAdapterState = savedState.f7803d;
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7801b = this.mRecyclerView.getId();
        int i = this.mPendingCurrentItem;
        if (i == -1) {
            i = this.mCurrentItem;
        }
        savedState.f7802c = i;
        Parcelable parcelable = this.mPendingAdapterState;
        if (parcelable != null) {
            savedState.f7803d = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.mRecyclerView.getAdapter();
            if (adapter instanceof C3339a) {
                savedState.f7803d = ((C3339a) adapter).mo12712a();
            }
        }
        return savedState;
    }

    public void onViewAdded(View view) {
        Class<ViewPager2> cls = ViewPager2.class;
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public boolean performAccessibilityAction(int i, Bundle bundle) {
        return this.mAccessibilityProvider.mo12765b(i) ? this.mAccessibilityProvider.mo12773j(i, bundle) : super.performAccessibilityAction(i, bundle);
    }

    public void registerOnPageChangeCallback(C3349i iVar) {
        this.mExternalPageChangeCallbacks.f7821a.add(iVar);
    }

    public void removeItemDecoration(RecyclerView.C3099n nVar) {
        this.mRecyclerView.removeItemDecoration(nVar);
    }

    public void removeItemDecorationAt(int i) {
        this.mRecyclerView.removeItemDecorationAt(i);
    }

    public void requestTransform() {
        this.mPageTransformerAdapter.getClass();
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.mRecyclerView.getAdapter();
        this.mAccessibilityProvider.mo12767d(adapter2);
        unregisterCurrentItemDataSetTracker(adapter2);
        this.mRecyclerView.setAdapter(adapter);
        this.mCurrentItem = 0;
        restorePendingState();
        this.mAccessibilityProvider.mo12766c(adapter);
        registerCurrentItemDataSetTracker(adapter);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, true);
    }

    public void setCurrentItemInternal(int i, boolean z) {
        RecyclerView.Adapter adapter = getAdapter();
        boolean z2 = false;
        if (adapter == null) {
            if (this.mPendingCurrentItem != -1) {
                this.mPendingCurrentItem = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            int i2 = this.mCurrentItem;
            if (min == i2) {
                if (this.mScrollEventAdapter.f7836g == 0) {
                    return;
                }
            }
            if (min != i2 || !z) {
                double d = (double) i2;
                this.mCurrentItem = min;
                this.mAccessibilityProvider.mo12778o();
                C3362f fVar = this.mScrollEventAdapter;
                if (!(fVar.f7836g == 0)) {
                    fVar.mo12791e();
                    C3362f.C3363a aVar = fVar.f7837h;
                    d = ((double) aVar.f7844a) + ((double) aVar.f7845b);
                }
                C3362f fVar2 = this.mScrollEventAdapter;
                fVar2.f7835f = z ? 2 : 3;
                fVar2.f7843n = false;
                if (fVar2.f7839j != min) {
                    z2 = true;
                }
                fVar2.f7839j = min;
                fVar2.mo12788b(2);
                if (z2) {
                    fVar2.mo12787a(min);
                }
                if (!z) {
                    this.mRecyclerView.scrollToPosition(min);
                    return;
                }
                double d2 = (double) min;
                if (Math.abs(d2 - d) > 3.0d) {
                    this.mRecyclerView.scrollToPosition(d2 > d ? min - 3 : min + 3);
                    RecyclerView recyclerView = this.mRecyclerView;
                    recyclerView.post(new C3356n(recyclerView, min));
                    return;
                }
                this.mRecyclerView.smoothScrollToPosition(min);
            }
        }
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.mAccessibilityProvider.mo12777n();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.mOffscreenPageLimit = i;
            this.mRecyclerView.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setPageTransformer(C3353k kVar) {
        if (kVar != null) {
            if (!this.mSavedItemAnimatorPresent) {
                this.mSavedItemAnimator = this.mRecyclerView.getItemAnimator();
                this.mSavedItemAnimatorPresent = true;
            }
            this.mRecyclerView.setItemAnimator((RecyclerView.C3094l) null);
        } else if (this.mSavedItemAnimatorPresent) {
            this.mRecyclerView.setItemAnimator(this.mSavedItemAnimator);
            this.mSavedItemAnimator = null;
            this.mSavedItemAnimatorPresent = false;
        }
        C3361e eVar = this.mPageTransformerAdapter;
        eVar.getClass();
        if (kVar != null) {
            eVar.getClass();
            requestTransform();
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.mUserInputEnabled = z;
        this.mAccessibilityProvider.mo12780q();
    }

    public void snapToPage() {
        View e = this.mPagerSnapHelper.mo11822e(this.mLayoutManager);
        if (e != null) {
            int[] b = this.mPagerSnapHelper.mo11820b(this.mLayoutManager, e);
            int i = b[0];
            if (i != 0 || b[1] != 0) {
                this.mRecyclerView.smoothScrollBy(i, b[1]);
            }
        }
    }

    public void unregisterOnPageChangeCallback(C3349i iVar) {
        this.mExternalPageChangeCallbacks.f7821a.remove(iVar);
    }

    public void updateCurrentItem() {
        C3132c0 c0Var = this.mPagerSnapHelper;
        if (c0Var != null) {
            View e = c0Var.mo11822e(this.mLayoutManager);
            if (e != null) {
                this.mLayoutManager.getClass();
                int I = RecyclerView.C3100o.m7396I(e);
                if (I != this.mCurrentItem && getScrollState() == 0) {
                    this.mPageChangeEventDispatcher.mo12763c(I);
                }
                this.mCurrentItemDirty = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public void addItemDecoration(RecyclerView.C3099n nVar, int i) {
        this.mRecyclerView.addItemDecoration(nVar, i);
    }

    public void setCurrentItem(int i, boolean z) {
        if (!isFakeDragging()) {
            setCurrentItemInternal(i, z);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3340a();

        /* renamed from: b */
        public int f7801b;

        /* renamed from: c */
        public int f7802c;

        /* renamed from: d */
        public Parcelable f7803d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public static class C3340a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }
        }

        public SavedState() {
            throw null;
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f7801b = parcel.readInt();
            this.f7802c = parcel.readInt();
            this.f7803d = parcel.readParcelable(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f7801b);
            parcel.writeInt(this.f7802c);
            parcel.writeParcelable(this.f7803d, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public void setOrientation(int i) {
        this.mLayoutManager.mo11309l1(i);
        this.mAccessibilityProvider.mo12779p();
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initialize(context, attributeSet);
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initialize(context, attributeSet);
    }
}
