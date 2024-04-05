package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.C0073e;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.compose.animation.C0391c;
import androidx.core.view.C2273a;
import androidx.core.view.C2315l;
import androidx.core.view.C2317m;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.C3124a;
import androidx.recyclerview.widget.C3137d0;
import androidx.recyclerview.widget.C3145g;
import androidx.recyclerview.widget.C3156h0;
import androidx.recyclerview.widget.C3160i0;
import androidx.recyclerview.widget.C3181p;
import com.etsy.android.R;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.gms.common.api.Api;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.commons.lang3.ClassUtils;
import p001a0.C0005b;
import p002a1.C0013g;
import p088e1.C6689b;
import p772tq.C20203a;

public class RecyclerView extends ViewGroup implements C2315l {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator = new C3085c();
    public C3137d0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public Adapter mAdapter;
    public C3124a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private C3092j mChildDrawingOrderCallback;
    public C3145g mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private C3093k mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public C3181p mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private C3107r mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public C3094l mItemAnimator;
    private C3094l.C3096b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<C3099n> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    public C3100o mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final C3113w mObserver;
    private List<C3105p> mOnChildAttachStateListeners;
    private C3106q mOnFlingListener;
    private final ArrayList<C3107r> mOnItemTouchListeners;
    public final List<C3084b0> mPendingAccessibilityImportanceChange;
    public SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public C3181p.C3183b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final C3111u mRecycler;
    public C3112v mRecyclerListener;
    public final List<C3112v> mRecyclerListeners;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private C3108s mScrollListener;
    private List<C3108s> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C2317m mScrollingChildHelper;
    public final C3117y mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final C3082a0 mViewFlinger;
    private final C3160i0.C3162b mViewInfoProcessCallback;
    public final C3160i0 mViewInfoStore;

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a */
    public class C3081a implements Runnable {
        public C3081a() {
        }

        public final void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$a0 */
    public class C3082a0 implements Runnable {

        /* renamed from: b */
        public int f7050b;

        /* renamed from: c */
        public int f7051c;

        /* renamed from: d */
        public OverScroller f7052d;

        /* renamed from: e */
        public Interpolator f7053e;

        /* renamed from: f */
        public boolean f7054f = false;

        /* renamed from: g */
        public boolean f7055g = false;

        public C3082a0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.f7053e = interpolator;
            this.f7052d = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        /* renamed from: a */
        public final void mo11565a() {
            if (this.f7054f) {
                this.f7055g = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5223m(recyclerView, this);
        }

        /* renamed from: b */
        public final void mo11566b(int i, int i2, Interpolator interpolator, int i3) {
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i3 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), RecyclerView.MAX_SCROLL_DURATION);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f7053e != interpolator) {
                this.f7053e = interpolator;
                this.f7052d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f7051c = 0;
            this.f7050b = 0;
            RecyclerView.this.setScrollState(2);
            this.f7052d.startScroll(0, 0, i, i2, i4);
            mo11565a();
        }

        public final void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                recyclerView.removeCallbacks(this);
                this.f7052d.abortAnimation();
                return;
            }
            this.f7055g = false;
            this.f7054f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f7052d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f7050b;
                int i4 = currY - this.f7051c;
                this.f7050b = currX;
                this.f7051c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    C3114x xVar = recyclerView4.mLayout.f7075e;
                    if (xVar != null && !xVar.f7110d && xVar.f7111e) {
                        int b = recyclerView4.mState.mo11715b();
                        if (b == 0) {
                            xVar.mo11712g();
                        } else if (xVar.f7107a >= b) {
                            xVar.f7107a = b - 1;
                            xVar.mo11707b(i, i2);
                        } else {
                            xVar.mo11707b(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                C3114x xVar2 = recyclerView7.mLayout.f7075e;
                if ((xVar2 != null && xVar2.f7110d) || !z) {
                    mo11565a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    C3181p pVar = recyclerView8.mGapWorker;
                    if (pVar != null) {
                        pVar.mo11911a(recyclerView8, i, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        C3181p.C3183b bVar = RecyclerView.this.mPrefetchRegistry;
                        int[] iArr7 = bVar.f7369c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.f7370d = 0;
                    }
                }
            }
            C3114x xVar3 = RecyclerView.this.mLayout.f7075e;
            if (xVar3 != null && xVar3.f7110d) {
                xVar3.mo11707b(0, 0);
            }
            this.f7054f = false;
            if (this.f7055g) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView9 = RecyclerView.this;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5223m(recyclerView9, this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b */
    public class C3083b implements Runnable {
        public C3083b() {
        }

        public final void run() {
            C3094l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.mo11636m();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$b0 */
    public static abstract class C3084b0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        public Adapter<? extends C3084b0> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public int mOldPosition = -1;
        public RecyclerView mOwnerRecyclerView;
        public List<Object> mPayloads = null;
        public int mPendingAccessibilityState = -1;
        public int mPosition = -1;
        public int mPreLayoutPosition = -1;
        public C3111u mScrapContainer = null;
        public C3084b0 mShadowedHolder = null;
        public C3084b0 mShadowingHolder = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public C3084b0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2368d.m5219i(view)) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends C3084b0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            return (list == null || list.size() == 0) ? FULLUPDATE_PAYLOADS : this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: package-private */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (!C2364y.C2368d.m5219i(view)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).mInsetsDirty = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                this.mWasImportantForAccessibilityBeforeHidden = C2364y.C2368d.m5213c(view);
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(C3111u uVar, boolean z) {
            this.mScrapContainer = uVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder k = C0073e.m211k(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            k.append(Integer.toHexString(hashCode()));
            k.append(" position=");
            k.append(this.mPosition);
            k.append(" id=");
            k.append(this.mItemId);
            k.append(", oldPos=");
            k.append(this.mOldPosition);
            k.append(", pLpos:");
            k.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(k.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder h = C0072d.m201h(" not recyclable(");
                h.append(this.mIsRecyclableCount);
                h.append(")");
                sb.append(h.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.mo11702l(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$c */
    public class C3085c implements Interpolator {
        public final float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$d */
    public class C3086d implements C3160i0.C3162b {
        public C3086d() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$e */
    public class C3087e implements C3145g.C3147b {
        public C3087e() {
        }

        /* renamed from: a */
        public final int mo11613a() {
            return RecyclerView.this.getChildCount();
        }

        /* renamed from: b */
        public final void mo11614b(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$f */
    public class C3088f implements C3124a.C3125a {
        public C3088f() {
        }

        /* renamed from: a */
        public final void mo11615a(C3124a.C3126b bVar) {
            int i = bVar.f7186a;
            if (i == 1) {
                RecyclerView.this.mLayout.mo11233c0(bVar.f7187b, bVar.f7189d);
            } else if (i == 2) {
                RecyclerView.this.mLayout.mo11237f0(bVar.f7187b, bVar.f7189d);
            } else if (i == 4) {
                RecyclerView.this.mLayout.mo11239g0(bVar.f7187b, bVar.f7189d);
            } else if (i == 8) {
                RecyclerView.this.mLayout.mo11235e0(bVar.f7187b, bVar.f7189d);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$g */
    public static /* synthetic */ class C3089g {

        /* renamed from: a */
        public static final /* synthetic */ int[] f7061a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy[] r0 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f7061a = r0
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f7061a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy r1 = androidx.recyclerview.widget.RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3089g.<clinit>():void");
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$h */
    public static class C3090h extends Observable<C3091i> {
        /* renamed from: a */
        public final boolean mo11616a() {
            return !this.mObservers.isEmpty();
        }

        /* renamed from: b */
        public final void mo11617b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C3091i) this.mObservers.get(size)).mo11115a();
            }
        }

        /* renamed from: c */
        public final void mo11618c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C3091i) this.mObservers.get(size)).mo11119e(i, i2);
            }
        }

        /* renamed from: d */
        public final void mo11619d(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C3091i) this.mObservers.get(size)).mo11117c(i, i2, obj);
            }
        }

        /* renamed from: e */
        public final void mo11620e(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C3091i) this.mObservers.get(size)).mo11118d(i, i2);
            }
        }

        /* renamed from: f */
        public final void mo11621f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C3091i) this.mObservers.get(size)).mo11120f(i, i2);
            }
        }

        /* renamed from: g */
        public final void mo11622g() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((C3091i) this.mObservers.get(size)).mo11623g();
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$i */
    public static abstract class C3091i {
        /* renamed from: a */
        public void mo11115a() {
        }

        /* renamed from: b */
        public void mo11116b() {
        }

        /* renamed from: c */
        public void mo11117c(int i, int i2, Object obj) {
            mo11116b();
        }

        /* renamed from: d */
        public void mo11118d(int i, int i2) {
        }

        /* renamed from: e */
        public void mo11119e(int i, int i2) {
        }

        /* renamed from: f */
        public void mo11120f(int i, int i2) {
        }

        /* renamed from: g */
        public void mo11623g() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$j */
    public interface C3092j {
        /* renamed from: a */
        int mo11624a(int i, int i2);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$k */
    public static class C3093k {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$l */
    public static abstract class C3094l {

        /* renamed from: a */
        public C3096b f7062a = null;

        /* renamed from: b */
        public ArrayList<C3095a> f7063b = new ArrayList<>();

        /* renamed from: c */
        public long f7064c = 120;

        /* renamed from: d */
        public long f7065d = 120;

        /* renamed from: e */
        public long f7066e = 250;

        /* renamed from: f */
        public long f7067f = 250;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$a */
        public interface C3095a {
            /* renamed from: a */
            void mo11637a();
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$b */
        public interface C3096b {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$l$c */
        public static class C3097c {

            /* renamed from: a */
            public int f7068a;

            /* renamed from: b */
            public int f7069b;

            /* renamed from: a */
            public final void mo11638a(C3084b0 b0Var) {
                View view = b0Var.itemView;
                this.f7068a = view.getLeft();
                this.f7069b = view.getTop();
                view.getRight();
                view.getBottom();
            }
        }

        /* renamed from: e */
        public static void m7380e(C3084b0 b0Var) {
            int i = b0Var.mFlags & 14;
            if (!b0Var.isInvalid() && (i & 4) == 0) {
                b0Var.getOldPosition();
                b0Var.getAbsoluteAdapterPosition();
            }
        }

        /* renamed from: a */
        public abstract boolean mo11625a(C3084b0 b0Var, C3097c cVar, C3097c cVar2);

        /* renamed from: b */
        public abstract boolean mo11626b(C3084b0 b0Var, C3084b0 b0Var2, C3097c cVar, C3097c cVar2);

        /* renamed from: c */
        public abstract boolean mo11627c(C3084b0 b0Var, C3097c cVar, C3097c cVar2);

        /* renamed from: d */
        public abstract boolean mo11628d(C3084b0 b0Var, C3097c cVar, C3097c cVar2);

        /* renamed from: f */
        public abstract boolean mo11629f(C3084b0 b0Var);

        /* renamed from: g */
        public boolean mo11630g(C3084b0 b0Var, List<Object> list) {
            return mo11629f(b0Var);
        }

        /* renamed from: h */
        public final void mo11631h(C3084b0 b0Var) {
            C3096b bVar = this.f7062a;
            if (bVar != null) {
                C3098m mVar = (C3098m) bVar;
                mVar.getClass();
                b0Var.setIsRecyclable(true);
                if (b0Var.mShadowedHolder != null && b0Var.mShadowingHolder == null) {
                    b0Var.mShadowedHolder = null;
                }
                b0Var.mShadowingHolder = null;
                if (!b0Var.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(b0Var.itemView) && b0Var.isTmpDetached()) {
                    RecyclerView.this.removeDetachedView(b0Var.itemView, false);
                }
            }
        }

        /* renamed from: i */
        public final void mo11632i() {
            int size = this.f7063b.size();
            for (int i = 0; i < size; i++) {
                this.f7063b.get(i).mo11637a();
            }
            this.f7063b.clear();
        }

        /* renamed from: j */
        public abstract void mo11633j(C3084b0 b0Var);

        /* renamed from: k */
        public abstract void mo11634k();

        /* renamed from: l */
        public abstract boolean mo11635l();

        /* renamed from: m */
        public abstract void mo11636m();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$m */
    public class C3098m implements C3094l.C3096b {
        public C3098m() {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$n */
    public static abstract class C3099n {
        @Deprecated
        public void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        @Deprecated
        public void onDraw(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, C3117y yVar) {
            onDraw(canvas, recyclerView);
        }

        @Deprecated
        public void onDrawOver(Canvas canvas, RecyclerView recyclerView) {
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, C3117y yVar) {
            onDrawOver(canvas, recyclerView);
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C3117y yVar) {
            getItemOffsets(rect, ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition(), recyclerView);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$o */
    public static abstract class C3100o {

        /* renamed from: a */
        public C3145g f7071a;

        /* renamed from: b */
        public RecyclerView f7072b;

        /* renamed from: c */
        public C3156h0 f7073c;

        /* renamed from: d */
        public C3156h0 f7074d;

        /* renamed from: e */
        public C3114x f7075e;

        /* renamed from: f */
        public boolean f7076f = false;

        /* renamed from: g */
        public boolean f7077g = false;

        /* renamed from: h */
        public boolean f7078h = true;

        /* renamed from: i */
        public boolean f7079i = true;

        /* renamed from: j */
        public int f7080j;

        /* renamed from: k */
        public boolean f7081k;

        /* renamed from: l */
        public int f7082l;

        /* renamed from: m */
        public int f7083m;

        /* renamed from: n */
        public int f7084n;

        /* renamed from: o */
        public int f7085o;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$a */
        public class C3101a implements C3156h0.C3158b {
            public C3101a() {
            }

            /* renamed from: a */
            public final int mo11678a(View view) {
                C3100o.this.getClass();
                return (view.getLeft() - C3100o.m7395D(view)) - ((LayoutParams) view.getLayoutParams()).leftMargin;
            }

            /* renamed from: b */
            public final int mo11679b() {
                return C3100o.this.mo11649F();
            }

            /* renamed from: c */
            public final int mo11680c() {
                C3100o oVar = C3100o.this;
                return oVar.f7084n - oVar.mo11651G();
            }

            /* renamed from: d */
            public final View mo11681d(int i) {
                return C3100o.this.mo11674x(i);
            }

            /* renamed from: e */
            public final int mo11682e(View view) {
                C3100o.this.getClass();
                return C3100o.m7398K(view) + view.getRight() + ((LayoutParams) view.getLayoutParams()).rightMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$b */
        public class C3102b implements C3156h0.C3158b {
            public C3102b() {
            }

            /* renamed from: a */
            public final int mo11678a(View view) {
                C3100o.this.getClass();
                return (view.getTop() - C3100o.m7399M(view)) - ((LayoutParams) view.getLayoutParams()).topMargin;
            }

            /* renamed from: b */
            public final int mo11679b() {
                return C3100o.this.mo11652H();
            }

            /* renamed from: c */
            public final int mo11680c() {
                C3100o oVar = C3100o.this;
                return oVar.f7085o - oVar.mo11648E();
            }

            /* renamed from: d */
            public final View mo11681d(int i) {
                return C3100o.this.mo11674x(i);
            }

            /* renamed from: e */
            public final int mo11682e(View view) {
                C3100o.this.getClass();
                return C3100o.m7403w(view) + view.getBottom() + ((LayoutParams) view.getLayoutParams()).bottomMargin;
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$c */
        public interface C3103c {
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$o$d */
        public static class C3104d {

            /* renamed from: a */
            public int f7088a;

            /* renamed from: b */
            public int f7089b;

            /* renamed from: c */
            public boolean f7090c;

            /* renamed from: d */
            public boolean f7091d;
        }

        public C3100o() {
            C3101a aVar = new C3101a();
            C3102b bVar = new C3102b();
            this.f7073c = new C3156h0(aVar);
            this.f7074d = new C3156h0(bVar);
        }

        /* renamed from: D */
        public static int m7395D(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.left;
        }

        /* renamed from: I */
        public static int m7396I(View view) {
            return ((LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
        }

        /* renamed from: J */
        public static C3104d m7397J(Context context, AttributeSet attributeSet, int i, int i2) {
            C3104d dVar = new C3104d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C20203a.f44793w, i, i2);
            dVar.f7088a = obtainStyledAttributes.getInt(0, 1);
            dVar.f7089b = obtainStyledAttributes.getInt(10, 1);
            dVar.f7090c = obtainStyledAttributes.getBoolean(9, false);
            dVar.f7091d = obtainStyledAttributes.getBoolean(11, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        /* renamed from: K */
        public static int m7398K(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.right;
        }

        /* renamed from: M */
        public static int m7399M(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.top;
        }

        /* renamed from: P */
        public static boolean m7400P(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        /* renamed from: Q */
        public static void m7401Q(View view, int i, int i2, int i3, int i4) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.mDecorInsets;
            view.layout(i + rect.left + layoutParams.leftMargin, i2 + rect.top + layoutParams.topMargin, (i3 - rect.right) - layoutParams.rightMargin, (i4 - rect.bottom) - layoutParams.bottomMargin);
        }

        /* renamed from: i */
        public static int m7402i(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        /* renamed from: w */
        public static int m7403w(View view) {
            return ((LayoutParams) view.getLayoutParams()).mDecorInsets.bottom;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m7404z(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3100o.m7404z(int, int, int, int, boolean):int");
        }

        /* renamed from: A */
        public int mo11226A(C3111u uVar, C3117y yVar) {
            return -1;
        }

        /* renamed from: A0 */
        public final void mo11643A0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f7072b = null;
                this.f7071a = null;
                this.f7084n = 0;
                this.f7085o = 0;
            } else {
                this.f7072b = recyclerView;
                this.f7071a = recyclerView.mChildHelper;
                this.f7084n = recyclerView.getWidth();
                this.f7085o = recyclerView.getHeight();
            }
            this.f7082l = 1073741824;
            this.f7083m = 1073741824;
        }

        /* renamed from: B */
        public final int mo11644B() {
            RecyclerView recyclerView = this.f7072b;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        /* renamed from: B0 */
        public final boolean mo11645B0(View view, int i, int i2, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.f7078h || !m7400P(view.getWidth(), i, layoutParams.width) || !m7400P(view.getHeight(), i2, layoutParams.height);
        }

        /* renamed from: C */
        public final int mo11646C() {
            RecyclerView recyclerView = this.f7072b;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            return C2364y.C2369e.m5233d(recyclerView);
        }

        /* renamed from: C0 */
        public boolean mo11269C0() {
            return false;
        }

        /* renamed from: D0 */
        public final boolean mo11647D0(View view, int i, int i2, LayoutParams layoutParams) {
            return !this.f7078h || !m7400P(view.getMeasuredWidth(), i, layoutParams.width) || !m7400P(view.getMeasuredHeight(), i2, layoutParams.height);
        }

        /* renamed from: E */
        public final int mo11648E() {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        /* renamed from: E0 */
        public void mo11270E0(RecyclerView recyclerView, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        /* renamed from: F */
        public final int mo11649F() {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        /* renamed from: F0 */
        public final void mo11650F0(C3114x xVar) {
            C3114x xVar2 = this.f7075e;
            if (!(xVar2 == null || xVar == xVar2 || !xVar2.f7111e)) {
                xVar2.mo11712g();
            }
            this.f7075e = xVar;
            RecyclerView recyclerView = this.f7072b;
            xVar.getClass();
            C3082a0 a0Var = recyclerView.mViewFlinger;
            RecyclerView.this.removeCallbacks(a0Var);
            a0Var.f7052d.abortAnimation();
            if (xVar.f7114h) {
                StringBuilder h = C0072d.m201h("An instance of ");
                h.append(xVar.getClass().getSimpleName());
                h.append(" was started more than once. Each instance of");
                h.append(xVar.getClass().getSimpleName());
                h.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w(RecyclerView.TAG, h.toString());
            }
            xVar.f7108b = recyclerView;
            xVar.f7109c = this;
            int i = xVar.f7107a;
            if (i != -1) {
                recyclerView.mState.f7122a = i;
                xVar.f7111e = true;
                xVar.f7110d = true;
                xVar.f7112f = recyclerView.mLayout.mo11314s(i);
                xVar.mo11709d();
                xVar.f7108b.mViewFlinger.mo11565a();
                xVar.f7114h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        /* renamed from: G */
        public final int mo11651G() {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        /* renamed from: G0 */
        public boolean mo11227G0() {
            return false;
        }

        /* renamed from: H */
        public final int mo11652H() {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        /* renamed from: L */
        public int mo11229L(C3111u uVar, C3117y yVar) {
            return -1;
        }

        /* renamed from: N */
        public final void mo11653N(View view, Rect rect) {
            Matrix matrix;
            Rect rect2 = ((LayoutParams) view.getLayoutParams()).mDecorInsets;
            rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            if (!(this.f7072b == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.f7072b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        /* renamed from: O */
        public boolean mo11277O() {
            return false;
        }

        /* renamed from: R */
        public final void mo11654R(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f7072b.getItemDecorInsetsForChild(view);
            int z = m7404z(this.f7084n, this.f7082l, mo11651G() + mo11649F() + layoutParams.leftMargin + layoutParams.rightMargin + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + 0, layoutParams.width, mo11297f());
            int z2 = m7404z(this.f7085o, this.f7083m, mo11648E() + mo11652H() + layoutParams.topMargin + layoutParams.bottomMargin + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + 0, layoutParams.height, mo11298g());
            if (mo11645B0(view, z, z2, layoutParams)) {
                view.measure(z, z2);
            }
        }

        /* renamed from: S */
        public void mo11655S(int i) {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        /* renamed from: T */
        public void mo11656T(int i) {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        /* renamed from: U */
        public void mo11657U(Adapter adapter) {
        }

        /* renamed from: V */
        public void mo11658V(RecyclerView recyclerView) {
        }

        /* renamed from: W */
        public void mo11286W(RecyclerView recyclerView) {
        }

        /* renamed from: X */
        public View mo11230X(View view, int i, C3111u uVar, C3117y yVar) {
            return null;
        }

        /* renamed from: Y */
        public void mo11288Y(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f7072b;
            C3111u uVar = recyclerView.mRecycler;
            C3117y yVar = recyclerView.mState;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.f7072b.canScrollVertically(-1) && !this.f7072b.canScrollHorizontally(-1) && !this.f7072b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                Adapter adapter = this.f7072b.mAdapter;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        /* renamed from: Z */
        public void mo11659Z(C3111u uVar, C3117y yVar, C6689b bVar) {
            if (this.f7072b.canScrollVertically(-1) || this.f7072b.canScrollHorizontally(-1)) {
                bVar.mo18850a(8192);
                bVar.mo18872u(true);
            }
            if (this.f7072b.canScrollVertically(1) || this.f7072b.canScrollHorizontally(1)) {
                bVar.mo18850a(C3084b0.FLAG_APPEARED_IN_PRE_LAYOUT);
                bVar.mo18872u(true);
            }
            bVar.mo18868r(C6689b.C6691b.m13081a(mo11229L(uVar, yVar), mo11226A(uVar, yVar), 0));
        }

        /* renamed from: a0 */
        public final void mo11660a0(View view, C6689b bVar) {
            C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.f7071a.mo11855k(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.f7072b;
                mo11232b0(recyclerView.mRecycler, recyclerView.mState, view, bVar);
            }
        }

        /* renamed from: b */
        public final void mo11661b(View view, int i, boolean z) {
            C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                C3160i0 i0Var = this.f7072b.mViewInfoStore;
                C3160i0.C3161a orDefault = i0Var.f7279a.getOrDefault(childViewHolderInt, null);
                if (orDefault == null) {
                    orDefault = C3160i0.C3161a.m7759a();
                    i0Var.f7279a.put(childViewHolderInt, orDefault);
                }
                orDefault.f7282a |= 1;
            } else {
                this.f7072b.mViewInfoStore.mo11886d(childViewHolderInt);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.f7071a.mo11846b(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f7072b) {
                int j = this.f7071a.mo11854j(view);
                if (i == -1) {
                    i = this.f7071a.mo11849e();
                }
                if (j == -1) {
                    StringBuilder h = C0072d.m201h("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    h.append(this.f7072b.indexOfChild(view));
                    throw new IllegalStateException(C0069a.m173d(this.f7072b, h));
                } else if (j != i) {
                    C3100o oVar = this.f7072b.mLayout;
                    View x = oVar.mo11674x(j);
                    if (x != null) {
                        oVar.mo11674x(j);
                        oVar.f7071a.mo11847c(j);
                        oVar.mo11662d(i, x);
                    } else {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + j + oVar.f7072b.toString());
                    }
                }
            } else {
                this.f7071a.mo11845a(view, i, false);
                layoutParams.mInsetsDirty = true;
                C3114x xVar = this.f7075e;
                if (xVar != null && xVar.f7111e && xVar.f7108b.getChildLayoutPosition(view) == xVar.f7107a) {
                    xVar.f7112f = view;
                }
            }
            if (layoutParams.mPendingInvalidate) {
                childViewHolderInt.itemView.invalidate();
                layoutParams.mPendingInvalidate = false;
            }
        }

        /* renamed from: b0 */
        public void mo11232b0(C3111u uVar, C3117y yVar, View view, C6689b bVar) {
        }

        /* renamed from: c */
        public void mo11294c(String str) {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        /* renamed from: c0 */
        public void mo11233c0(int i, int i2) {
        }

        /* renamed from: d */
        public final void mo11662d(int i, View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                C3160i0 i0Var = this.f7072b.mViewInfoStore;
                C3160i0.C3161a orDefault = i0Var.f7279a.getOrDefault(childViewHolderInt, null);
                if (orDefault == null) {
                    orDefault = C3160i0.C3161a.m7759a();
                    i0Var.f7279a.put(childViewHolderInt, orDefault);
                }
                orDefault.f7282a |= 1;
            } else {
                this.f7072b.mViewInfoStore.mo11886d(childViewHolderInt);
            }
            this.f7071a.mo11846b(view, i, layoutParams, childViewHolderInt.isRemoved());
        }

        /* renamed from: d0 */
        public void mo11234d0() {
        }

        /* renamed from: e */
        public final void mo11663e(View view, Rect rect) {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        /* renamed from: e0 */
        public void mo11235e0(int i, int i2) {
        }

        /* renamed from: f */
        public boolean mo11297f() {
            return false;
        }

        /* renamed from: f0 */
        public void mo11237f0(int i, int i2) {
        }

        /* renamed from: g */
        public boolean mo11298g() {
            return false;
        }

        /* renamed from: g0 */
        public void mo11239g0(int i, int i2) {
        }

        /* renamed from: h */
        public boolean mo11240h(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        /* renamed from: h0 */
        public void mo11241h0(C3111u uVar, C3117y yVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        /* renamed from: i0 */
        public void mo11242i0(C3117y yVar) {
        }

        /* renamed from: j */
        public void mo11302j(int i, int i2, C3117y yVar, C3103c cVar) {
        }

        /* renamed from: j0 */
        public void mo11303j0(Parcelable parcelable) {
        }

        /* renamed from: k */
        public void mo11305k(int i, C3103c cVar) {
        }

        /* renamed from: k0 */
        public Parcelable mo11306k0() {
            return null;
        }

        /* renamed from: l */
        public int mo11308l(C3117y yVar) {
            return 0;
        }

        /* renamed from: l0 */
        public void mo11664l0(int i) {
        }

        /* renamed from: m */
        public int mo11243m(C3117y yVar) {
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[ADDED_TO_REGION] */
        /* renamed from: m0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo11665m0(androidx.recyclerview.widget.RecyclerView.C3111u r8, androidx.recyclerview.widget.RecyclerView.C3117y r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.f7072b
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x003e
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x006b
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0027
                int r8 = r7.f7085o
                int r11 = r7.mo11652H()
                int r8 = r8 - r11
                int r11 = r7.mo11648E()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x0028
            L_0x0027:
                r8 = r9
            L_0x0028:
                androidx.recyclerview.widget.RecyclerView r11 = r7.f7072b
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.f7084n
                int r11 = r7.mo11649F()
                int r10 = r10 - r11
                int r11 = r7.mo11651G()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x0066
            L_0x003e:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0051
                int r8 = r7.f7085o
                int r10 = r7.mo11652H()
                int r8 = r8 - r10
                int r10 = r7.mo11648E()
                int r8 = r8 - r10
                goto L_0x0052
            L_0x0051:
                r8 = r9
            L_0x0052:
                androidx.recyclerview.widget.RecyclerView r10 = r7.f7072b
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0069
                int r10 = r7.f7084n
                int r11 = r7.mo11649F()
                int r10 = r10 - r11
                int r11 = r7.mo11651G()
                int r10 = r10 - r11
            L_0x0066:
                r3 = r8
                r2 = r10
                goto L_0x006b
            L_0x0069:
                r3 = r8
                r2 = r9
            L_0x006b:
                if (r3 != 0) goto L_0x0070
                if (r2 != 0) goto L_0x0070
                return r9
            L_0x0070:
                androidx.recyclerview.widget.RecyclerView r1 = r7.f7072b
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3100o.mo11665m0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        /* renamed from: n */
        public int mo11245n(C3117y yVar) {
            return 0;
        }

        /* renamed from: n0 */
        public final void mo11666n0(C3111u uVar) {
            int y = mo11676y();
            while (true) {
                y--;
                if (y < 0) {
                    return;
                }
                if (!RecyclerView.getChildViewHolderInt(mo11674x(y)).shouldIgnore()) {
                    View x = mo11674x(y);
                    mo11669q0(y);
                    uVar.mo11697g(x);
                }
            }
        }

        /* renamed from: o */
        public int mo11311o(C3117y yVar) {
            return 0;
        }

        /* renamed from: o0 */
        public final void mo11667o0(C3111u uVar) {
            int size = uVar.f7098a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = uVar.f7098a.get(i).itemView;
                C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.f7072b.removeDetachedView(view, false);
                    }
                    C3094l lVar = this.f7072b.mItemAnimator;
                    if (lVar != null) {
                        lVar.mo11633j(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    C3084b0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    uVar.mo11698h(childViewHolderInt2);
                }
            }
            uVar.f7098a.clear();
            ArrayList<C3084b0> arrayList = uVar.f7099b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.f7072b.invalidate();
            }
        }

        /* renamed from: p */
        public int mo11246p(C3117y yVar) {
            return 0;
        }

        /* renamed from: p0 */
        public final void mo11668p0(View view) {
            C3145g gVar = this.f7071a;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (gVar.f7230b.mo11863f(indexOfChild)) {
                    gVar.mo11856l(view);
                }
                ((C3087e) gVar.f7229a).mo11614b(indexOfChild);
            }
        }

        /* renamed from: q */
        public int mo11247q(C3117y yVar) {
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
            r0 = r3.f7071a;
            r4 = r0.mo11850f(r4);
         */
        /* renamed from: q0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11669q0(int r4) {
            /*
                r3 = this;
                android.view.View r0 = r3.mo11674x(r4)
                if (r0 == 0) goto L_0x002b
                androidx.recyclerview.widget.g r0 = r3.f7071a
                int r4 = r0.mo11850f(r4)
                androidx.recyclerview.widget.g$b r1 = r0.f7229a
                androidx.recyclerview.widget.RecyclerView$e r1 = (androidx.recyclerview.widget.RecyclerView.C3087e) r1
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r1 = r1.getChildAt(r4)
                if (r1 != 0) goto L_0x0019
                goto L_0x002b
            L_0x0019:
                androidx.recyclerview.widget.g$a r2 = r0.f7230b
                boolean r2 = r2.mo11863f(r4)
                if (r2 == 0) goto L_0x0024
                r0.mo11856l(r1)
            L_0x0024:
                androidx.recyclerview.widget.g$b r0 = r0.f7229a
                androidx.recyclerview.widget.RecyclerView$e r0 = (androidx.recyclerview.widget.RecyclerView.C3087e) r0
                r0.mo11614b(r4)
            L_0x002b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3100o.mo11669q0(int):void");
        }

        /* renamed from: r */
        public final void mo11670r(C3111u uVar) {
            int y = mo11676y();
            while (true) {
                y--;
                if (y >= 0) {
                    View x = mo11674x(y);
                    C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(x);
                    if (!childViewHolderInt.shouldIgnore()) {
                        if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.f7072b.mAdapter.hasStableIds()) {
                            mo11674x(y);
                            this.f7071a.mo11847c(y);
                            uVar.mo11699i(x);
                            this.f7072b.mViewInfoStore.mo11886d(childViewHolderInt);
                        } else {
                            mo11669q0(y);
                            uVar.mo11698h(childViewHolderInt);
                        }
                    }
                } else {
                    return;
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a8, code lost:
            if (r10 == false) goto L_0x00af;
         */
        /* renamed from: r0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo11671r0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
            /*
                r8 = this;
                int r0 = r8.mo11649F()
                int r1 = r8.mo11652H()
                int r2 = r8.f7084n
                int r3 = r8.mo11651G()
                int r2 = r2 - r3
                int r3 = r8.f7085o
                int r4 = r8.mo11648E()
                int r3 = r3 - r4
                int r4 = r10.getLeft()
                int r5 = r11.left
                int r4 = r4 + r5
                int r5 = r10.getScrollX()
                int r4 = r4 - r5
                int r5 = r10.getTop()
                int r6 = r11.top
                int r5 = r5 + r6
                int r10 = r10.getScrollY()
                int r5 = r5 - r10
                int r10 = r11.width()
                int r10 = r10 + r4
                int r11 = r11.height()
                int r11 = r11 + r5
                int r4 = r4 - r0
                r0 = 0
                int r6 = java.lang.Math.min(r0, r4)
                int r5 = r5 - r1
                int r1 = java.lang.Math.min(r0, r5)
                int r10 = r10 - r2
                int r2 = java.lang.Math.max(r0, r10)
                int r11 = r11 - r3
                int r11 = java.lang.Math.max(r0, r11)
                int r3 = r8.mo11646C()
                r7 = 1
                if (r3 != r7) goto L_0x005c
                if (r2 == 0) goto L_0x0057
                goto L_0x0064
            L_0x0057:
                int r2 = java.lang.Math.max(r6, r10)
                goto L_0x0064
            L_0x005c:
                if (r6 == 0) goto L_0x005f
                goto L_0x0063
            L_0x005f:
                int r6 = java.lang.Math.min(r4, r2)
            L_0x0063:
                r2 = r6
            L_0x0064:
                if (r1 == 0) goto L_0x0067
                goto L_0x006b
            L_0x0067:
                int r1 = java.lang.Math.min(r5, r11)
            L_0x006b:
                if (r13 == 0) goto L_0x00aa
                android.view.View r10 = r9.getFocusedChild()
                if (r10 != 0) goto L_0x0075
            L_0x0073:
                r10 = r0
                goto L_0x00a8
            L_0x0075:
                int r11 = r8.mo11649F()
                int r13 = r8.mo11652H()
                int r3 = r8.f7084n
                int r4 = r8.mo11651G()
                int r3 = r3 - r4
                int r4 = r8.f7085o
                int r5 = r8.mo11648E()
                int r4 = r4 - r5
                androidx.recyclerview.widget.RecyclerView r5 = r8.f7072b
                android.graphics.Rect r5 = r5.mTempRect
                androidx.recyclerview.widget.RecyclerView.getDecoratedBoundsWithMarginsInt(r10, r5)
                int r10 = r5.left
                int r10 = r10 - r2
                if (r10 >= r3) goto L_0x0073
                int r10 = r5.right
                int r10 = r10 - r2
                if (r10 <= r11) goto L_0x0073
                int r10 = r5.top
                int r10 = r10 - r1
                if (r10 >= r4) goto L_0x0073
                int r10 = r5.bottom
                int r10 = r10 - r1
                if (r10 > r13) goto L_0x00a7
                goto L_0x0073
            L_0x00a7:
                r10 = r7
            L_0x00a8:
                if (r10 == 0) goto L_0x00af
            L_0x00aa:
                if (r2 != 0) goto L_0x00b0
                if (r1 == 0) goto L_0x00af
                goto L_0x00b0
            L_0x00af:
                return r0
            L_0x00b0:
                if (r12 == 0) goto L_0x00b6
                r9.scrollBy(r2, r1)
                goto L_0x00b9
            L_0x00b6:
                r9.smoothScrollBy(r2, r1)
            L_0x00b9:
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3100o.mo11671r0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
        }

        /* renamed from: s */
        public View mo11314s(int i) {
            int y = mo11676y();
            for (int i2 = 0; i2 < y; i2++) {
                View x = mo11674x(i2);
                C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(x);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.f7072b.mState.f7128g || !childViewHolderInt.isRemoved())) {
                    return x;
                }
            }
            return null;
        }

        /* renamed from: s0 */
        public final void mo11672s0() {
            RecyclerView recyclerView = this.f7072b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        /* renamed from: t */
        public abstract LayoutParams mo11251t();

        /* renamed from: t0 */
        public int mo11252t0(int i, C3111u uVar, C3117y yVar) {
            return 0;
        }

        /* renamed from: u */
        public LayoutParams mo11254u(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        /* renamed from: u0 */
        public void mo11315u0(int i) {
        }

        /* renamed from: v */
        public LayoutParams mo11256v(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
        }

        /* renamed from: v0 */
        public int mo11257v0(int i, C3111u uVar, C3117y yVar) {
            return 0;
        }

        /* renamed from: w0 */
        public final void mo11673w0(RecyclerView recyclerView) {
            mo11675x0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        /* renamed from: x */
        public final View mo11674x(int i) {
            C3145g gVar = this.f7071a;
            if (gVar != null) {
                return gVar.mo11848d(i);
            }
            return null;
        }

        /* renamed from: x0 */
        public final void mo11675x0(int i, int i2) {
            this.f7084n = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.f7082l = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f7084n = 0;
            }
            this.f7085o = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.f7083m = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.f7085o = 0;
            }
        }

        /* renamed from: y */
        public final int mo11676y() {
            C3145g gVar = this.f7071a;
            if (gVar != null) {
                return gVar.mo11849e();
            }
            return 0;
        }

        /* renamed from: y0 */
        public void mo11261y0(Rect rect, int i, int i2) {
            int G = mo11651G() + mo11649F() + rect.width();
            int E = mo11648E() + mo11652H() + rect.height();
            RecyclerView recyclerView = this.f7072b;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            this.f7072b.setMeasuredDimension(m7402i(i, G, C2364y.C2368d.m5215e(recyclerView)), m7402i(i2, E, C2364y.C2368d.m5214d(this.f7072b)));
        }

        /* renamed from: z0 */
        public final void mo11677z0(int i, int i2) {
            int y = mo11676y();
            if (y == 0) {
                this.f7072b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < y; i7++) {
                View x = mo11674x(i7);
                Rect rect = this.f7072b.mTempRect;
                RecyclerView.getDecoratedBoundsWithMarginsInt(x, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f7072b.mTempRect.set(i4, i5, i3, i6);
            mo11261y0(this.f7072b.mTempRect, i, i2);
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$p */
    public interface C3105p {
        /* renamed from: a */
        void mo11683a(View view);

        /* renamed from: b */
        void mo11684b(View view);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$q */
    public static abstract class C3106q {
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$r */
    public interface C3107r {
        /* renamed from: c */
        void mo11685c(boolean z);

        /* renamed from: d */
        void mo11686d(MotionEvent motionEvent);

        /* renamed from: e */
        boolean mo11687e(MotionEvent motionEvent);
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$s */
    public static abstract class C3108s {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$t */
    public static class C3109t {

        /* renamed from: a */
        public SparseArray<C3110a> f7092a = new SparseArray<>();

        /* renamed from: b */
        public int f7093b = 0;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$t$a */
        public static class C3110a {

            /* renamed from: a */
            public final ArrayList<C3084b0> f7094a = new ArrayList<>();

            /* renamed from: b */
            public int f7095b = 5;

            /* renamed from: c */
            public long f7096c = 0;

            /* renamed from: d */
            public long f7097d = 0;
        }

        /* renamed from: a */
        public final C3110a mo11690a(int i) {
            C3110a aVar = this.f7092a.get(i);
            if (aVar != null) {
                return aVar;
            }
            C3110a aVar2 = new C3110a();
            this.f7092a.put(i, aVar2);
            return aVar2;
        }

        /* renamed from: b */
        public final void mo11691b(int i) {
            C3110a a = mo11690a(i);
            a.f7095b = 0;
            ArrayList<C3084b0> arrayList = a.f7094a;
            while (arrayList.size() > 0) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$u */
    public final class C3111u {

        /* renamed from: a */
        public final ArrayList<C3084b0> f7098a;

        /* renamed from: b */
        public ArrayList<C3084b0> f7099b = null;

        /* renamed from: c */
        public final ArrayList<C3084b0> f7100c = new ArrayList<>();

        /* renamed from: d */
        public final List<C3084b0> f7101d;

        /* renamed from: e */
        public int f7102e;

        /* renamed from: f */
        public int f7103f;

        /* renamed from: g */
        public C3109t f7104g;

        public C3111u() {
            ArrayList<C3084b0> arrayList = new ArrayList<>();
            this.f7098a = arrayList;
            this.f7101d = Collections.unmodifiableList(arrayList);
            this.f7102e = 2;
            this.f7103f = 2;
        }

        /* renamed from: d */
        public static void m7496d(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    m7496d((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        /* renamed from: a */
        public final void mo11692a(C3084b0 b0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(b0Var);
            View view = b0Var.itemView;
            C3137d0 d0Var = RecyclerView.this.mAccessibilityDelegate;
            if (d0Var != null) {
                C2273a a = d0Var.mo11207a();
                C2364y.m5201p(view, a instanceof C3137d0.C3138a ? (C2273a) ((C3137d0.C3138a) a).f7213b.remove(view) : null);
            }
            if (z) {
                C3112v vVar = RecyclerView.this.mRecyclerListener;
                if (vVar != null) {
                    vVar.mo11704a();
                }
                int size = RecyclerView.this.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    RecyclerView.this.mRecyclerListeners.get(i).mo11704a();
                }
                Adapter adapter = RecyclerView.this.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(b0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.mo11887e(b0Var);
                }
            }
            b0Var.mBindingAdapter = null;
            b0Var.mOwnerRecyclerView = null;
            C3109t c = mo11694c();
            c.getClass();
            int itemViewType = b0Var.getItemViewType();
            ArrayList<C3084b0> arrayList = c.mo11690a(itemViewType).f7094a;
            if (c.f7092a.get(itemViewType).f7095b > arrayList.size()) {
                b0Var.resetInternal();
                arrayList.add(b0Var);
            }
        }

        /* renamed from: b */
        public final int mo11693b(int i) {
            if (i < 0 || i >= RecyclerView.this.mState.mo11715b()) {
                StringBuilder h = C0069a.m177h("invalid position ", i, ". State item count is ");
                h.append(RecyclerView.this.mState.mo11715b());
                throw new IndexOutOfBoundsException(C0069a.m173d(RecyclerView.this, h));
            }
            RecyclerView recyclerView = RecyclerView.this;
            return !recyclerView.mState.f7128g ? i : recyclerView.mAdapterHelper.mo11791f(i, 0);
        }

        /* renamed from: c */
        public final C3109t mo11694c() {
            if (this.f7104g == null) {
                this.f7104g = new C3109t();
            }
            return this.f7104g;
        }

        /* renamed from: e */
        public final void mo11695e() {
            for (int size = this.f7100c.size() - 1; size >= 0; size--) {
                mo11696f(size);
            }
            this.f7100c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                C3181p.C3183b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.f7369c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.f7370d = 0;
            }
        }

        /* renamed from: f */
        public final void mo11696f(int i) {
            mo11692a(this.f7100c.get(i), true);
            this.f7100c.remove(i);
        }

        /* renamed from: g */
        public final void mo11697g(View view) {
            C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            mo11698h(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.mo11633j(childViewHolderInt);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:40:0x0081 A[LOOP:1: B:40:0x0081->B:51:0x00aa, LOOP_START, PHI: r3 
          PHI: (r3v17 int) = (r3v14 int), (r3v18 int) binds: [B:39:0x007f, B:51:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11698h(androidx.recyclerview.widget.RecyclerView.C3084b0 r10) {
            /*
                r9 = this;
                boolean r0 = r10.isScrap()
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x00fb
                android.view.View r0 = r10.itemView
                android.view.ViewParent r0 = r0.getParent()
                if (r0 == 0) goto L_0x0012
                goto L_0x00fb
            L_0x0012:
                boolean r0 = r10.isTmpDetached()
                if (r0 != 0) goto L_0x00e2
                boolean r0 = r10.shouldIgnore()
                if (r0 != 0) goto L_0x00d0
                boolean r0 = r10.doesTransientStatePreventRecycling()
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r3 = r3.mAdapter
                if (r3 == 0) goto L_0x0032
                if (r0 == 0) goto L_0x0032
                boolean r3 = r3.onFailedToRecycleView(r10)
                if (r3 == 0) goto L_0x0032
                r3 = r1
                goto L_0x0033
            L_0x0032:
                r3 = r2
            L_0x0033:
                if (r3 != 0) goto L_0x003f
                boolean r3 = r10.isRecyclable()
                if (r3 == 0) goto L_0x003c
                goto L_0x003f
            L_0x003c:
                r1 = r2
                goto L_0x00bd
            L_0x003f:
                int r3 = r9.f7103f
                if (r3 <= 0) goto L_0x00b4
                r3 = 526(0x20e, float:7.37E-43)
                boolean r3 = r10.hasAnyOfTheFlags(r3)
                if (r3 != 0) goto L_0x00b4
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r3 = r9.f7100c
                int r3 = r3.size()
                int r4 = r9.f7103f
                if (r3 < r4) goto L_0x005c
                if (r3 <= 0) goto L_0x005c
                r9.mo11696f(r2)
                int r3 = r3 + -1
            L_0x005c:
                boolean r4 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r4 == 0) goto L_0x00ad
                if (r3 <= 0) goto L_0x00ad
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.p$b r4 = r4.mPrefetchRegistry
                int r5 = r10.mPosition
                int[] r6 = r4.f7369c
                if (r6 == 0) goto L_0x007e
                int r6 = r4.f7370d
                int r6 = r6 * 2
                r7 = r2
            L_0x0071:
                if (r7 >= r6) goto L_0x007e
                int[] r8 = r4.f7369c
                r8 = r8[r7]
                if (r8 != r5) goto L_0x007b
                r4 = r1
                goto L_0x007f
            L_0x007b:
                int r7 = r7 + 2
                goto L_0x0071
            L_0x007e:
                r4 = r2
            L_0x007f:
                if (r4 != 0) goto L_0x00ad
            L_0x0081:
                int r3 = r3 + -1
                if (r3 < 0) goto L_0x00ac
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r9.f7100c
                java.lang.Object r4 = r4.get(r3)
                androidx.recyclerview.widget.RecyclerView$b0 r4 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r4
                int r4 = r4.mPosition
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.p$b r5 = r5.mPrefetchRegistry
                int[] r6 = r5.f7369c
                if (r6 == 0) goto L_0x00a9
                int r6 = r5.f7370d
                int r6 = r6 * 2
                r7 = r2
            L_0x009c:
                if (r7 >= r6) goto L_0x00a9
                int[] r8 = r5.f7369c
                r8 = r8[r7]
                if (r8 != r4) goto L_0x00a6
                r4 = r1
                goto L_0x00aa
            L_0x00a6:
                int r7 = r7 + 2
                goto L_0x009c
            L_0x00a9:
                r4 = r2
            L_0x00aa:
                if (r4 != 0) goto L_0x0081
            L_0x00ac:
                int r3 = r3 + r1
            L_0x00ad:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r9.f7100c
                r4.add(r3, r10)
                r3 = r1
                goto L_0x00b5
            L_0x00b4:
                r3 = r2
            L_0x00b5:
                if (r3 != 0) goto L_0x00bb
                r9.mo11692a(r10, r1)
                goto L_0x00bc
            L_0x00bb:
                r1 = r2
            L_0x00bc:
                r2 = r3
            L_0x00bd:
                androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.i0 r3 = r3.mViewInfoStore
                r3.mo11887e(r10)
                if (r2 != 0) goto L_0x00cf
                if (r1 != 0) goto L_0x00cf
                if (r0 == 0) goto L_0x00cf
                r0 = 0
                r10.mBindingAdapter = r0
                r10.mOwnerRecyclerView = r0
            L_0x00cf:
                return
            L_0x00d0:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."
                java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r0 = android.support.p013v4.media.C0069a.m173d(r1, r0)
                r10.<init>(r0)
                throw r10
            L_0x00e2:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Tmp detached view should be removed from RecyclerView before it can be recycled: "
                r1.append(r2)
                r1.append(r10)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = android.support.p013v4.media.C0069a.m173d(r10, r1)
                r0.<init>(r10)
                throw r0
            L_0x00fb:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r3 = "Scrapped or attached views may not be recycled. isScrap:"
                java.lang.StringBuilder r3 = android.support.p013v4.media.C0072d.m201h(r3)
                boolean r4 = r10.isScrap()
                r3.append(r4)
                java.lang.String r4 = " isAttached:"
                r3.append(r4)
                android.view.View r10 = r10.itemView
                android.view.ViewParent r10 = r10.getParent()
                if (r10 == 0) goto L_0x0118
                goto L_0x0119
            L_0x0118:
                r1 = r2
            L_0x0119:
                r3.append(r1)
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r10 = android.support.p013v4.media.C0069a.m173d(r10, r3)
                r0.<init>(r10)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3111u.mo11698h(androidx.recyclerview.widget.RecyclerView$b0):void");
        }

        /* renamed from: i */
        public final void mo11699i(View view) {
            C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f7099b == null) {
                    this.f7099b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.f7099b.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.f7098a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException(C0069a.m173d(RecyclerView.this, C0072d.m201h("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
        }

        /* renamed from: j */
        public final boolean mo11700j(C3084b0 b0Var, int i, int i2, long j) {
            b0Var.mBindingAdapter = null;
            b0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = b0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j2 = this.f7104g.mo11690a(itemViewType).f7097d;
                if (!(j2 == 0 || j2 + nanoTime < j)) {
                    return false;
                }
            }
            RecyclerView.this.mAdapter.bindViewHolder(b0Var, i);
            long nanoTime2 = RecyclerView.this.getNanoTime() - nanoTime;
            C3109t.C3110a a = this.f7104g.mo11690a(b0Var.getItemViewType());
            long j3 = a.f7097d;
            if (j3 != 0) {
                nanoTime2 = (nanoTime2 / 4) + ((j3 / 4) * 3);
            }
            a.f7097d = nanoTime2;
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = b0Var.itemView;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2368d.m5213c(view) == 0) {
                    C2364y.C2368d.m5229s(view, 1);
                }
                C3137d0 d0Var = RecyclerView.this.mAccessibilityDelegate;
                if (d0Var != null) {
                    C2273a a2 = d0Var.mo11207a();
                    if (a2 instanceof C3137d0.C3138a) {
                        C3137d0.C3138a aVar = (C3137d0.C3138a) a2;
                        aVar.getClass();
                        C2273a d = C2364y.m5189d(view);
                        if (!(d == null || d == aVar)) {
                            aVar.f7213b.put(view, d);
                        }
                    }
                    C2364y.m5201p(view, a2);
                }
            }
            if (RecyclerView.this.mState.f7128g) {
                b0Var.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:152:0x0310, code lost:
            r5 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
            r10.addFlags(32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:86:0x01b7, code lost:
            r5 = r10;
         */
        /* JADX WARNING: Removed duplicated region for block: B:119:0x0253  */
        /* JADX WARNING: Removed duplicated region for block: B:204:0x040a  */
        /* JADX WARNING: Removed duplicated region for block: B:209:0x0432  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x0435  */
        /* JADX WARNING: Removed duplicated region for block: B:220:0x0465  */
        /* JADX WARNING: Removed duplicated region for block: B:221:0x0473  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
        /* renamed from: k */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final androidx.recyclerview.widget.RecyclerView.C3084b0 mo11701k(int r17, long r18) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                if (r3 < 0) goto L_0x0495
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                int r0 = r0.mo11715b()
                if (r3 >= r0) goto L_0x0495
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                boolean r0 = r0.f7128g
                r1 = 32
                r7 = 0
                r2 = 0
                r8 = 1
                if (r0 == 0) goto L_0x0092
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r6.f7099b
                if (r0 == 0) goto L_0x008d
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0028
                goto L_0x008d
            L_0x0028:
                r4 = r7
            L_0x0029:
                if (r4 >= r0) goto L_0x0046
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.f7099b
                java.lang.Object r5 = r5.get(r4)
                androidx.recyclerview.widget.RecyclerView$b0 r5 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r5
                boolean r9 = r5.wasReturnedFromScrap()
                if (r9 != 0) goto L_0x0043
                int r9 = r5.getLayoutPosition()
                if (r9 != r3) goto L_0x0043
                r5.addFlags(r1)
                goto L_0x008e
            L_0x0043:
                int r4 = r4 + 1
                goto L_0x0029
            L_0x0046:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r4 = r4.mAdapter
                boolean r4 = r4.hasStableIds()
                if (r4 == 0) goto L_0x008d
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r4 = r4.mAdapterHelper
                int r4 = r4.mo11791f(r3, r7)
                if (r4 <= 0) goto L_0x008d
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                int r5 = r5.getItemCount()
                if (r4 >= r5) goto L_0x008d
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                long r4 = r5.getItemId(r4)
                r9 = r7
            L_0x006d:
                if (r9 >= r0) goto L_0x008d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r10 = r6.f7099b
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r10
                boolean r11 = r10.wasReturnedFromScrap()
                if (r11 != 0) goto L_0x008a
                long r11 = r10.getItemId()
                int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r11 != 0) goto L_0x008a
                r10.addFlags(r1)
                r5 = r10
                goto L_0x008e
            L_0x008a:
                int r9 = r9 + 1
                goto L_0x006d
            L_0x008d:
                r5 = r2
            L_0x008e:
                if (r5 == 0) goto L_0x0093
                r0 = r8
                goto L_0x0094
            L_0x0092:
                r5 = r2
            L_0x0093:
                r0 = r7
            L_0x0094:
                r4 = -1
                if (r5 != 0) goto L_0x0251
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.f7098a
                int r5 = r5.size()
                r9 = r7
            L_0x009e:
                if (r9 >= r5) goto L_0x00d0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r10 = r6.f7098a
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r10
                boolean r11 = r10.wasReturnedFromScrap()
                if (r11 != 0) goto L_0x00cd
                int r11 = r10.getLayoutPosition()
                if (r11 != r3) goto L_0x00cd
                boolean r11 = r10.isInvalid()
                if (r11 != 0) goto L_0x00cd
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r11 = r11.mState
                boolean r11 = r11.f7128g
                if (r11 != 0) goto L_0x00c8
                boolean r11 = r10.isRemoved()
                if (r11 != 0) goto L_0x00cd
            L_0x00c8:
                r10.addFlags(r1)
                goto L_0x01b7
            L_0x00cd:
                int r9 = r9 + 1
                goto L_0x009e
            L_0x00d0:
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.g r5 = r5.mChildHelper
                java.util.ArrayList r9 = r5.f7231c
                int r9 = r9.size()
                r10 = r7
            L_0x00db:
                if (r10 >= r9) goto L_0x0106
                java.util.ArrayList r11 = r5.f7231c
                java.lang.Object r11 = r11.get(r10)
                android.view.View r11 = (android.view.View) r11
                androidx.recyclerview.widget.g$b r12 = r5.f7229a
                androidx.recyclerview.widget.RecyclerView$e r12 = (androidx.recyclerview.widget.RecyclerView.C3087e) r12
                r12.getClass()
                androidx.recyclerview.widget.RecyclerView$b0 r12 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r11)
                int r13 = r12.getLayoutPosition()
                if (r13 != r3) goto L_0x0103
                boolean r13 = r12.isInvalid()
                if (r13 != 0) goto L_0x0103
                boolean r12 = r12.isRemoved()
                if (r12 != 0) goto L_0x0103
                goto L_0x0107
            L_0x0103:
                int r10 = r10 + 1
                goto L_0x00db
            L_0x0106:
                r11 = r2
            L_0x0107:
                if (r11 == 0) goto L_0x018f
                androidx.recyclerview.widget.RecyclerView$b0 r5 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r11)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.g r9 = r9.mChildHelper
                androidx.recyclerview.widget.g$b r10 = r9.f7229a
                androidx.recyclerview.widget.RecyclerView$e r10 = (androidx.recyclerview.widget.RecyclerView.C3087e) r10
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                int r10 = r10.indexOfChild(r11)
                if (r10 < 0) goto L_0x0178
                androidx.recyclerview.widget.g$a r12 = r9.f7230b
                boolean r12 = r12.mo11861d(r10)
                if (r12 == 0) goto L_0x0161
                androidx.recyclerview.widget.g$a r12 = r9.f7230b
                r12.mo11858a(r10)
                r9.mo11856l(r11)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.g r9 = r9.mChildHelper
                int r9 = r9.mo11854j(r11)
                if (r9 == r4) goto L_0x0148
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.g r10 = r10.mChildHelper
                r10.mo11847c(r9)
                r6.mo11699i(r11)
                r9 = 8224(0x2020, float:1.1524E-41)
                r5.addFlags(r9)
                goto L_0x01bd
            L_0x0148:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "layout index should not be -1 after unhiding a view:"
                r1.append(r2)
                r1.append(r5)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = android.support.p013v4.media.C0069a.m173d(r2, r1)
                r0.<init>(r1)
                throw r0
            L_0x0161:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "trying to unhide a view that was not hidden"
                r1.append(r2)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0178:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "view is not a child, cannot hide "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x018f:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.f7100c
                int r5 = r5.size()
                r9 = r7
            L_0x0196:
                if (r9 >= r5) goto L_0x01bc
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r10 = r6.f7100c
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r10
                boolean r11 = r10.isInvalid()
                if (r11 != 0) goto L_0x01b9
                int r11 = r10.getLayoutPosition()
                if (r11 != r3) goto L_0x01b9
                boolean r11 = r10.isAttachedToTransitionOverlay()
                if (r11 != 0) goto L_0x01b9
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.f7100c
                r5.remove(r9)
            L_0x01b7:
                r5 = r10
                goto L_0x01bd
            L_0x01b9:
                int r9 = r9 + 1
                goto L_0x0196
            L_0x01bc:
                r5 = r2
            L_0x01bd:
                if (r5 == 0) goto L_0x0251
                boolean r9 = r5.isRemoved()
                if (r9 == 0) goto L_0x01cc
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r9 = r9.mState
                boolean r9 = r9.f7128g
                goto L_0x0211
            L_0x01cc:
                int r9 = r5.mPosition
                if (r9 < 0) goto L_0x0238
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.mAdapter
                int r10 = r10.getItemCount()
                if (r9 >= r10) goto L_0x0238
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r10 = r9.mState
                boolean r10 = r10.f7128g
                if (r10 != 0) goto L_0x01f1
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                int r10 = r5.mPosition
                int r9 = r9.getItemViewType(r10)
                int r10 = r5.getItemViewType()
                if (r9 == r10) goto L_0x01f1
                goto L_0x020e
            L_0x01f1:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                boolean r9 = r9.hasStableIds()
                if (r9 == 0) goto L_0x0210
                long r9 = r5.getItemId()
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r11 = r11.mAdapter
                int r12 = r5.mPosition
                long r11 = r11.getItemId(r12)
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 != 0) goto L_0x020e
                goto L_0x0210
            L_0x020e:
                r9 = r7
                goto L_0x0211
            L_0x0210:
                r9 = r8
            L_0x0211:
                if (r9 != 0) goto L_0x0236
                r9 = 4
                r5.addFlags(r9)
                boolean r9 = r5.isScrap()
                if (r9 == 0) goto L_0x0228
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r5.itemView
                r9.removeDetachedView(r10, r7)
                r5.unScrap()
                goto L_0x0231
            L_0x0228:
                boolean r9 = r5.wasReturnedFromScrap()
                if (r9 == 0) goto L_0x0231
                r5.clearReturnedFromScrapFlag()
            L_0x0231:
                r6.mo11698h(r5)
                r5 = r2
                goto L_0x0251
            L_0x0236:
                r0 = r8
                goto L_0x0251
            L_0x0238:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
                r1.append(r2)
                r1.append(r5)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = android.support.p013v4.media.C0069a.m173d(r2, r1)
                r0.<init>(r1)
                throw r0
            L_0x0251:
                if (r5 != 0) goto L_0x03eb
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r9 = r9.mAdapterHelper
                int r9 = r9.mo11791f(r3, r7)
                if (r9 < 0) goto L_0x03ca
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.mAdapter
                int r10 = r10.getItemCount()
                if (r9 >= r10) goto L_0x03ca
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.mAdapter
                int r10 = r10.getItemViewType(r9)
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r11 = r11.mAdapter
                boolean r11 = r11.hasStableIds()
                if (r11 == 0) goto L_0x0316
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                long r11 = r5.getItemId(r9)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.f7098a
                int r5 = r5.size()
                int r5 = r5 + r4
            L_0x0288:
                if (r5 < 0) goto L_0x02de
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r13 = r6.f7098a
                java.lang.Object r13 = r13.get(r5)
                androidx.recyclerview.widget.RecyclerView$b0 r13 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r13
                long r14 = r13.getItemId()
                int r14 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
                if (r14 != 0) goto L_0x02db
                boolean r14 = r13.wasReturnedFromScrap()
                if (r14 != 0) goto L_0x02db
                int r14 = r13.getItemViewType()
                if (r10 != r14) goto L_0x02bf
                r13.addFlags(r1)
                boolean r1 = r13.isRemoved()
                if (r1 == 0) goto L_0x02bd
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r1 = r1.mState
                boolean r1 = r1.f7128g
                if (r1 != 0) goto L_0x02bd
                r1 = 2
                r5 = 14
                r13.setFlags(r1, r5)
            L_0x02bd:
                r5 = r13
                goto L_0x0311
            L_0x02bf:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r14 = r6.f7098a
                r14.remove(r5)
                androidx.recyclerview.widget.RecyclerView r14 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r15 = r13.itemView
                r14.removeDetachedView(r15, r7)
                android.view.View r13 = r13.itemView
                androidx.recyclerview.widget.RecyclerView$b0 r13 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r13)
                r13.mScrapContainer = r2
                r13.mInChangeScrap = r7
                r13.clearReturnedFromScrapFlag()
                r6.mo11698h(r13)
            L_0x02db:
                int r5 = r5 + -1
                goto L_0x0288
            L_0x02de:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r1 = r6.f7100c
                int r1 = r1.size()
                int r1 = r1 + r4
            L_0x02e5:
                if (r1 < 0) goto L_0x0310
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.f7100c
                java.lang.Object r5 = r5.get(r1)
                androidx.recyclerview.widget.RecyclerView$b0 r5 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r5
                long r13 = r5.getItemId()
                int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r13 != 0) goto L_0x030d
                boolean r13 = r5.isAttachedToTransitionOverlay()
                if (r13 != 0) goto L_0x030d
                int r11 = r5.getItemViewType()
                if (r10 != r11) goto L_0x0309
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r11 = r6.f7100c
                r11.remove(r1)
                goto L_0x0311
            L_0x0309:
                r6.mo11696f(r1)
                goto L_0x0310
            L_0x030d:
                int r1 = r1 + -1
                goto L_0x02e5
            L_0x0310:
                r5 = r2
            L_0x0311:
                if (r5 == 0) goto L_0x0316
                r5.mPosition = r9
                r0 = r8
            L_0x0316:
                if (r5 != 0) goto L_0x0363
                androidx.recyclerview.widget.RecyclerView$t r1 = r16.mo11694c()
                android.util.SparseArray<androidx.recyclerview.widget.RecyclerView$t$a> r1 = r1.f7092a
                java.lang.Object r1 = r1.get(r10)
                androidx.recyclerview.widget.RecyclerView$t$a r1 = (androidx.recyclerview.widget.RecyclerView.C3109t.C3110a) r1
                if (r1 == 0) goto L_0x034d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r1.f7094a
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L_0x034d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r1 = r1.f7094a
                int r5 = r1.size()
                int r5 = r5 + r4
            L_0x0335:
                if (r5 < 0) goto L_0x034d
                java.lang.Object r4 = r1.get(r5)
                androidx.recyclerview.widget.RecyclerView$b0 r4 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r4
                boolean r4 = r4.isAttachedToTransitionOverlay()
                if (r4 != 0) goto L_0x034a
                java.lang.Object r1 = r1.remove(r5)
                androidx.recyclerview.widget.RecyclerView$b0 r1 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r1
                goto L_0x034e
            L_0x034a:
                int r5 = r5 + -1
                goto L_0x0335
            L_0x034d:
                r1 = r2
            L_0x034e:
                if (r1 == 0) goto L_0x0362
                r1.resetInternal()
                boolean r4 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r4 == 0) goto L_0x0362
                android.view.View r4 = r1.itemView
                boolean r5 = r4 instanceof android.view.ViewGroup
                if (r5 == 0) goto L_0x0362
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                m7496d(r4, r7)
            L_0x0362:
                r5 = r1
            L_0x0363:
                if (r5 != 0) goto L_0x03eb
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                long r4 = r1.getNanoTime()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r1 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
                r11 = 0
                if (r1 == 0) goto L_0x038e
                androidx.recyclerview.widget.RecyclerView$t r1 = r6.f7104g
                androidx.recyclerview.widget.RecyclerView$t$a r1 = r1.mo11690a(r10)
                long r13 = r1.f7096c
                int r1 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r1 == 0) goto L_0x038a
                long r13 = r13 + r4
                int r1 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
                if (r1 >= 0) goto L_0x0388
                goto L_0x038a
            L_0x0388:
                r1 = r7
                goto L_0x038b
            L_0x038a:
                r1 = r8
            L_0x038b:
                if (r1 != 0) goto L_0x038e
                return r2
            L_0x038e:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r2 = r1.mAdapter
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r2.createViewHolder(r1, r10)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r2 == 0) goto L_0x03a9
                android.view.View r2 = r1.itemView
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r2)
                if (r2 == 0) goto L_0x03a9
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r2)
                r1.mNestedRecyclerView = r9
            L_0x03a9:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                long r13 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$t r2 = r6.f7104g
                long r13 = r13 - r4
                androidx.recyclerview.widget.RecyclerView$t$a r2 = r2.mo11690a(r10)
                long r4 = r2.f7096c
                int r9 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r9 != 0) goto L_0x03bd
                goto L_0x03c5
            L_0x03bd:
                r9 = 4
                long r4 = r4 / r9
                r11 = 3
                long r4 = r4 * r11
                long r13 = r13 / r9
                long r13 = r13 + r4
            L_0x03c5:
                r2.f7096c = r13
                r9 = r0
                r10 = r1
                goto L_0x03ed
            L_0x03ca:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Inconsistency detected. Invalid item position "
                java.lang.String r2 = "(offset:"
                java.lang.String r4 = ").state:"
                java.lang.StringBuilder r1 = androidx.compose.animation.C0472h.m1244g(r1, r3, r2, r9, r4)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r2 = r2.mState
                int r2 = r2.mo11715b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = android.support.p013v4.media.C0069a.m173d(r2, r1)
                r0.<init>(r1)
                throw r0
            L_0x03eb:
                r9 = r0
                r10 = r5
            L_0x03ed:
                if (r9 == 0) goto L_0x0424
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                boolean r0 = r0.f7128g
                if (r0 != 0) goto L_0x0424
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x0424
                r10.setFlags(r7, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                boolean r0 = r0.f7131j
                if (r0 == 0) goto L_0x0424
                androidx.recyclerview.widget.RecyclerView.C3094l.m7380e(r10)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$l r0 = r0.mItemAnimator
                r10.getUnmodifiedPayloads()
                r0.getClass()
                androidx.recyclerview.widget.RecyclerView$l$c r0 = new androidx.recyclerview.widget.RecyclerView$l$c
                r0.<init>()
                r0.mo11638a(r10)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r10, r0)
            L_0x0424:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                boolean r0 = r0.f7128g
                if (r0 == 0) goto L_0x0435
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x0435
                r10.mPreLayoutPosition = r3
                goto L_0x0448
            L_0x0435:
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x044a
                boolean r0 = r10.needsUpdate()
                if (r0 != 0) goto L_0x044a
                boolean r0 = r10.isInvalid()
                if (r0 == 0) goto L_0x0448
                goto L_0x044a
            L_0x0448:
                r0 = r7
                goto L_0x045d
            L_0x044a:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                int r2 = r0.mo11791f(r3, r7)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r18
                boolean r0 = r0.mo11700j(r1, r2, r3, r4)
            L_0x045d:
                android.view.View r1 = r10.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0473
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x048b
            L_0x0473:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x0489
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x048b
            L_0x0489:
                androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            L_0x048b:
                r1.mViewHolder = r10
                if (r9 == 0) goto L_0x0492
                if (r0 == 0) goto L_0x0492
                r7 = r8
            L_0x0492:
                r1.mPendingInvalidate = r7
                return r10
            L_0x0495:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Invalid item position "
                java.lang.String r2 = "("
                java.lang.String r4 = "). Item count:"
                java.lang.StringBuilder r1 = androidx.compose.animation.C0472h.m1244g(r1, r3, r2, r3, r4)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r2 = r2.mState
                int r2 = r2.mo11715b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = android.support.p013v4.media.C0069a.m173d(r2, r1)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3111u.mo11701k(int, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        /* renamed from: l */
        public final void mo11702l(C3084b0 b0Var) {
            if (b0Var.mInChangeScrap) {
                this.f7099b.remove(b0Var);
            } else {
                this.f7098a.remove(b0Var);
            }
            b0Var.mScrapContainer = null;
            b0Var.mInChangeScrap = false;
            b0Var.clearReturnedFromScrapFlag();
        }

        /* renamed from: m */
        public final void mo11703m() {
            C3100o oVar = RecyclerView.this.mLayout;
            this.f7103f = this.f7102e + (oVar != null ? oVar.f7080j : 0);
            for (int size = this.f7100c.size() - 1; size >= 0 && this.f7100c.size() > this.f7103f; size--) {
                mo11696f(size);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$v */
    public interface C3112v {
        /* renamed from: a */
        void mo11704a();
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$w */
    public class C3113w extends C3091i {
        public C3113w() {
        }

        /* renamed from: a */
        public final void mo11115a() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f7127f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.mo11792g()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
            if (r0.f7181b.size() == 1) goto L_0x002a;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11117c(int r5, int r6, java.lang.Object r7) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                r1 = 1
                if (r6 >= r1) goto L_0x0011
                r0.getClass()
                goto L_0x0029
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r2 = r0.f7181b
                r3 = 4
                androidx.recyclerview.widget.a$b r5 = r0.mo11793h(r7, r3, r5, r6)
                r2.add(r5)
                int r5 = r0.f7185f
                r5 = r5 | r3
                r0.f7185f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f7181b
                int r5 = r5.size()
                if (r5 != r1) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r1 = 0
            L_0x002a:
                if (r1 == 0) goto L_0x002f
                r4.mo11705h()
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3113w.mo11117c(int, int, java.lang.Object):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0025, code lost:
            if (r0.f7181b.size() == 1) goto L_0x0029;
         */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11118d(int r5, int r6) {
            /*
                r4 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                r2 = 1
                if (r6 >= r2) goto L_0x0011
                r0.getClass()
                goto L_0x0028
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f7181b
                androidx.recyclerview.widget.a$b r5 = r0.mo11793h(r1, r2, r5, r6)
                r3.add(r5)
                int r5 = r0.f7185f
                r5 = r5 | r2
                r0.f7185f = r5
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r5 = r0.f7181b
                int r5 = r5.size()
                if (r5 != r2) goto L_0x0028
                goto L_0x0029
            L_0x0028:
                r2 = 0
            L_0x0029:
                if (r2 == 0) goto L_0x002e
                r4.mo11705h()
            L_0x002e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3113w.mo11118d(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
            if (r0.f7181b.size() == 1) goto L_0x002b;
         */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11119e(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                r0.getClass()
                if (r6 != r7) goto L_0x0010
                goto L_0x002a
            L_0x0010:
                r2 = 1
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f7181b
                r4 = 8
                androidx.recyclerview.widget.a$b r6 = r0.mo11793h(r1, r4, r6, r7)
                r3.add(r6)
                int r6 = r0.f7185f
                r6 = r6 | r4
                r0.f7185f = r6
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r0.f7181b
                int r6 = r6.size()
                if (r6 != r2) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r2 = 0
            L_0x002b:
                if (r2 == 0) goto L_0x0030
                r5.mo11705h()
            L_0x0030:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3113w.mo11119e(int, int):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
            if (r0.f7181b.size() == 1) goto L_0x002a;
         */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo11120f(int r6, int r7) {
            /*
                r5 = this;
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                r1 = 0
                r0.assertNotInLayoutOrScroll(r1)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.a r0 = r0.mAdapterHelper
                r2 = 1
                if (r7 >= r2) goto L_0x0011
                r0.getClass()
                goto L_0x0029
            L_0x0011:
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r3 = r0.f7181b
                r4 = 2
                androidx.recyclerview.widget.a$b r6 = r0.mo11793h(r1, r4, r6, r7)
                r3.add(r6)
                int r6 = r0.f7185f
                r6 = r6 | r4
                r0.f7185f = r6
                java.util.ArrayList<androidx.recyclerview.widget.a$b> r6 = r0.f7181b
                int r6 = r6.size()
                if (r6 != r2) goto L_0x0029
                goto L_0x002a
            L_0x0029:
                r2 = 0
            L_0x002a:
                if (r2 == 0) goto L_0x002f
                r5.mo11705h()
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.C3113w.mo11120f(int, int):void");
        }

        /* renamed from: g */
        public final void mo11623g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (adapter = recyclerView.mAdapter) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        /* renamed from: h */
        public final void mo11705h() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                    WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                    C2364y.C2368d.m5223m(recyclerView, runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$x */
    public static abstract class C3114x {

        /* renamed from: a */
        public int f7107a = -1;

        /* renamed from: b */
        public RecyclerView f7108b;

        /* renamed from: c */
        public C3100o f7109c;

        /* renamed from: d */
        public boolean f7110d;

        /* renamed from: e */
        public boolean f7111e;

        /* renamed from: f */
        public View f7112f;

        /* renamed from: g */
        public final C3115a f7113g = new C3115a();

        /* renamed from: h */
        public boolean f7114h;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$x$a */
        public static class C3115a {

            /* renamed from: a */
            public int f7115a = 0;

            /* renamed from: b */
            public int f7116b = 0;

            /* renamed from: c */
            public int f7117c = Integer.MIN_VALUE;

            /* renamed from: d */
            public int f7118d = -1;

            /* renamed from: e */
            public Interpolator f7119e = null;

            /* renamed from: f */
            public boolean f7120f = false;

            /* renamed from: g */
            public int f7121g = 0;

            /* renamed from: a */
            public final void mo11713a(RecyclerView recyclerView) {
                int i = this.f7118d;
                if (i >= 0) {
                    this.f7118d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f7120f = false;
                } else if (this.f7120f) {
                    Interpolator interpolator = this.f7119e;
                    if (interpolator == null || this.f7117c >= 1) {
                        int i2 = this.f7117c;
                        if (i2 >= 1) {
                            recyclerView.mViewFlinger.mo11566b(this.f7115a, this.f7116b, interpolator, i2);
                            int i3 = this.f7121g + 1;
                            this.f7121g = i3;
                            if (i3 > 10) {
                                Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f7120f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.f7121g = 0;
                }
            }
        }

        /* renamed from: androidx.recyclerview.widget.RecyclerView$x$b */
        public interface C3116b {
            /* renamed from: a */
            PointF mo11291a(int i);
        }

        /* renamed from: a */
        public PointF mo11706a(int i) {
            C3100o oVar = this.f7109c;
            if (oVar instanceof C3116b) {
                return ((C3116b) oVar).mo11291a(i);
            }
            StringBuilder h = C0072d.m201h("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            h.append(C3116b.class.getCanonicalName());
            Log.w(RecyclerView.TAG, h.toString());
            return null;
        }

        /* renamed from: b */
        public final void mo11707b(int i, int i2) {
            PointF a;
            RecyclerView recyclerView = this.f7108b;
            if (this.f7107a == -1 || recyclerView == null) {
                mo11712g();
            }
            if (this.f7110d && this.f7112f == null && this.f7109c != null && (a = mo11706a(this.f7107a)) != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    recyclerView.scrollStep((int) Math.signum(f), (int) Math.signum(a.y), (int[]) null);
                }
            }
            boolean z = false;
            this.f7110d = false;
            View view = this.f7112f;
            if (view != null) {
                if (this.f7108b.getChildLayoutPosition(view) == this.f7107a) {
                    View view2 = this.f7112f;
                    C3117y yVar = recyclerView.mState;
                    mo11711f(view2, this.f7113g);
                    this.f7113g.mo11713a(recyclerView);
                    mo11712g();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f7112f = null;
                }
            }
            if (this.f7111e) {
                C3117y yVar2 = recyclerView.mState;
                mo11708c(i, i2, this.f7113g);
                C3115a aVar = this.f7113g;
                if (aVar.f7118d >= 0) {
                    z = true;
                }
                aVar.mo11713a(recyclerView);
                if (z && this.f7111e) {
                    this.f7110d = true;
                    recyclerView.mViewFlinger.mo11565a();
                }
            }
        }

        /* renamed from: c */
        public abstract void mo11708c(int i, int i2, C3115a aVar);

        /* renamed from: d */
        public abstract void mo11709d();

        /* renamed from: e */
        public abstract void mo11710e();

        /* renamed from: f */
        public abstract void mo11711f(View view, C3115a aVar);

        /* renamed from: g */
        public final void mo11712g() {
            if (this.f7111e) {
                this.f7111e = false;
                mo11710e();
                this.f7108b.mState.f7122a = -1;
                this.f7112f = null;
                this.f7107a = -1;
                this.f7110d = false;
                C3100o oVar = this.f7109c;
                if (oVar.f7075e == this) {
                    oVar.f7075e = null;
                }
                this.f7109c = null;
                this.f7108b = null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$y */
    public static class C3117y {

        /* renamed from: a */
        public int f7122a = -1;

        /* renamed from: b */
        public int f7123b = 0;

        /* renamed from: c */
        public int f7124c = 0;

        /* renamed from: d */
        public int f7125d = 1;

        /* renamed from: e */
        public int f7126e = 0;

        /* renamed from: f */
        public boolean f7127f = false;

        /* renamed from: g */
        public boolean f7128g = false;

        /* renamed from: h */
        public boolean f7129h = false;

        /* renamed from: i */
        public boolean f7130i = false;

        /* renamed from: j */
        public boolean f7131j = false;

        /* renamed from: k */
        public boolean f7132k = false;

        /* renamed from: l */
        public int f7133l;

        /* renamed from: m */
        public long f7134m;

        /* renamed from: n */
        public int f7135n;

        /* renamed from: a */
        public final void mo11714a(int i) {
            if ((this.f7125d & i) == 0) {
                StringBuilder h = C0072d.m201h("Layout state should be one of ");
                h.append(Integer.toBinaryString(i));
                h.append(" but it is ");
                h.append(Integer.toBinaryString(this.f7125d));
                throw new IllegalStateException(h.toString());
            }
        }

        /* renamed from: b */
        public final int mo11715b() {
            return this.f7128g ? this.f7123b - this.f7124c : this.f7126e;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("State{mTargetPosition=");
            h.append(this.f7122a);
            h.append(", mData=");
            h.append((Object) null);
            h.append(", mItemCount=");
            h.append(this.f7126e);
            h.append(", mIsMeasuring=");
            h.append(this.f7130i);
            h.append(", mPreviousLayoutItemCount=");
            h.append(this.f7123b);
            h.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            h.append(this.f7124c);
            h.append(", mStructureChanged=");
            h.append(this.f7127f);
            h.append(", mInPreLayout=");
            h.append(this.f7128g);
            h.append(", mRunSimpleAnimations=");
            h.append(this.f7131j);
            h.append(", mRunPredictiveAnimations=");
            return C0391c.m1058d(h, this.f7132k, '}');
        }
    }

    /* renamed from: androidx.recyclerview.widget.RecyclerView$z */
    public static abstract class C3118z {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            NESTED_SCROLLING_ATTRS = r1
            FORCE_INVALIDATE_DISPLAY_LIST = r3
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r0
            POST_UPDATES_ON_ANIMATION = r0
            ALLOW_THREAD_GAP_WORK = r0
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r3
            IGNORE_DETACHED_FOCUSED_CHILD = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addAnimatingView(C3084b0 b0Var) {
        View view = b0Var.itemView;
        boolean z = view.getParent() == this;
        this.mRecycler.mo11702l(getChildViewHolder(view));
        if (b0Var.isTmpDetached()) {
            this.mChildHelper.mo11846b(view, -1, view.getLayoutParams(), true);
        } else if (!z) {
            this.mChildHelper.mo11845a(view, -1, true);
        } else {
            C3145g gVar = this.mChildHelper;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                gVar.f7230b.mo11865h(indexOfChild);
                gVar.mo11853i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(C3084b0 b0Var, C3084b0 b0Var2, C3094l.C3097c cVar, C3094l.C3097c cVar2, boolean z, boolean z2) {
        b0Var.setIsRecyclable(false);
        if (z) {
            addAnimatingView(b0Var);
        }
        if (b0Var != b0Var2) {
            if (z2) {
                addAnimatingView(b0Var2);
            }
            b0Var.mShadowedHolder = b0Var2;
            addAnimatingView(b0Var);
            this.mRecycler.mo11702l(b0Var);
            b0Var2.setIsRecyclable(false);
            b0Var2.mShadowingHolder = b0Var;
        }
        if (this.mItemAnimator.mo11626b(b0Var, b0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(C3084b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = weakReference.get();
            while (view != null) {
                if (view != b0Var.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            b0Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i, int i2) {
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(C3100o.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
                    } catch (NoSuchMethodException e) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((C3100o) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e2) {
                    e2.initCause(e);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e2);
                } catch (ClassNotFoundException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e3);
                } catch (InvocationTargetException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e4);
                } catch (InstantiationException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
                } catch (ClassCastException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e7);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i, int i2) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i && iArr[1] == i2) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(C3084b0.FLAG_MOVED);
            obtain.setContentChangeTypes(i);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        this.mState.mo11714a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f7130i = false;
        startInterceptRequestLayout();
        C3160i0 i0Var = this.mViewInfoStore;
        i0Var.f7279a.clear();
        i0Var.f7280b.mo19885b();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        C3117y yVar = this.mState;
        yVar.f7129h = yVar.f7131j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        yVar.f7128g = yVar.f7132k;
        yVar.f7126e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f7131j) {
            int e = this.mChildHelper.mo11849e();
            for (int i = 0; i < e; i++) {
                C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11848d(i));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    C3094l lVar = this.mItemAnimator;
                    C3094l.m7380e(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    lVar.getClass();
                    C3094l.C3097c cVar = new C3094l.C3097c();
                    cVar.mo11638a(childViewHolderInt);
                    this.mViewInfoStore.mo11884b(childViewHolderInt, cVar);
                    if (this.mState.f7129h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f7280b.mo19890h(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f7132k) {
            saveOldPositions();
            C3117y yVar2 = this.mState;
            boolean z = yVar2.f7127f;
            yVar2.f7127f = false;
            this.mLayout.mo11241h0(this.mRecycler, yVar2);
            this.mState.f7127f = z;
            for (int i2 = 0; i2 < this.mChildHelper.mo11849e(); i2++) {
                C3084b0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.mo11848d(i2));
                if (!childViewHolderInt2.shouldIgnore()) {
                    C3160i0.C3161a orDefault = this.mViewInfoStore.f7279a.getOrDefault(childViewHolderInt2, null);
                    if (!((orDefault == null || (orDefault.f7282a & 4) == 0) ? false : true)) {
                        C3094l.m7380e(childViewHolderInt2);
                        boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        C3094l lVar2 = this.mItemAnimator;
                        childViewHolderInt2.getUnmodifiedPayloads();
                        lVar2.getClass();
                        C3094l.C3097c cVar2 = new C3094l.C3097c();
                        cVar2.mo11638a(childViewHolderInt2);
                        if (hasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, cVar2);
                        } else {
                            C3160i0 i0Var2 = this.mViewInfoStore;
                            C3160i0.C3161a orDefault2 = i0Var2.f7279a.getOrDefault(childViewHolderInt2, null);
                            if (orDefault2 == null) {
                                orDefault2 = C3160i0.C3161a.m7759a();
                                i0Var2.f7279a.put(childViewHolderInt2, orDefault2);
                            }
                            orDefault2.f7282a |= 2;
                            orDefault2.f7283b = cVar2;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f7125d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.mo11714a(6);
        this.mAdapterHelper.mo11788c();
        this.mState.f7126e = this.mAdapter.getItemCount();
        this.mState.f7124c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.mLayoutState;
            if (parcelable != null) {
                this.mLayout.mo11303j0(parcelable);
            }
            this.mPendingSavedState = null;
        }
        C3117y yVar = this.mState;
        yVar.f7128g = false;
        this.mLayout.mo11241h0(this.mRecycler, yVar);
        C3117y yVar2 = this.mState;
        yVar2.f7127f = false;
        yVar2.f7131j = yVar2.f7131j && this.mItemAnimator != null;
        yVar2.f7125d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.mo11714a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        C3117y yVar = this.mState;
        yVar.f7125d = 1;
        if (yVar.f7131j) {
            for (int e = this.mChildHelper.mo11849e() - 1; e >= 0; e--) {
                C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11848d(e));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    C3094l.C3097c cVar = new C3094l.C3097c();
                    cVar.mo11638a(childViewHolderInt);
                    C3084b0 b0Var = (C3084b0) this.mViewInfoStore.f7280b.mo19889f(changedHolderKey, (Long) null);
                    if (b0Var == null || b0Var.shouldIgnore()) {
                        this.mViewInfoStore.mo11883a(childViewHolderInt, cVar);
                    } else {
                        C3160i0.C3161a orDefault = this.mViewInfoStore.f7279a.getOrDefault(b0Var, null);
                        boolean z = (orDefault == null || (orDefault.f7282a & 1) == 0) ? false : true;
                        C3160i0.C3161a orDefault2 = this.mViewInfoStore.f7279a.getOrDefault(childViewHolderInt, null);
                        boolean z2 = (orDefault2 == null || (orDefault2.f7282a & 1) == 0) ? false : true;
                        if (!z || b0Var != childViewHolderInt) {
                            C3094l.C3097c c = this.mViewInfoStore.mo11885c(b0Var, 4);
                            this.mViewInfoStore.mo11883a(childViewHolderInt, cVar);
                            C3094l.C3097c c2 = this.mViewInfoStore.mo11885c(childViewHolderInt, 8);
                            if (c == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, b0Var);
                            } else {
                                animateChange(b0Var, childViewHolderInt, c, c2, z, z2);
                            }
                        } else {
                            this.mViewInfoStore.mo11883a(childViewHolderInt, cVar);
                        }
                    }
                }
            }
            C3160i0 i0Var = this.mViewInfoStore;
            C3160i0.C3162b bVar = this.mViewInfoProcessCallback;
            int i = i0Var.f7279a.f16745d;
            while (true) {
                i--;
                if (i < 0) {
                    break;
                }
                C3084b0 h = i0Var.f7279a.mo19978h(i);
                C3160i0.C3161a j = i0Var.f7279a.mo14353j(i);
                int i2 = j.f7282a;
                if ((i2 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    C3100o oVar = recyclerView.mLayout;
                    View view = h.itemView;
                    C3111u uVar = recyclerView.mRecycler;
                    oVar.mo11668p0(view);
                    uVar.mo11697g(view);
                } else if ((i2 & 1) != 0) {
                    C3094l.C3097c cVar2 = j.f7283b;
                    if (cVar2 == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        C3100o oVar2 = recyclerView2.mLayout;
                        View view2 = h.itemView;
                        C3111u uVar2 = recyclerView2.mRecycler;
                        oVar2.mo11668p0(view2);
                        uVar2.mo11697g(view2);
                    } else {
                        C3094l.C3097c cVar3 = j.f7284c;
                        C3086d dVar = (C3086d) bVar;
                        RecyclerView.this.mRecycler.mo11702l(h);
                        RecyclerView.this.animateDisappearance(h, cVar2, cVar3);
                    }
                } else if ((i2 & 14) == 14) {
                    RecyclerView.this.animateAppearance(h, j.f7283b, j.f7284c);
                } else if ((i2 & 12) == 12) {
                    C3094l.C3097c cVar4 = j.f7283b;
                    C3094l.C3097c cVar5 = j.f7284c;
                    C3086d dVar2 = (C3086d) bVar;
                    dVar2.getClass();
                    h.setIsRecyclable(false);
                    RecyclerView recyclerView3 = RecyclerView.this;
                    if (recyclerView3.mDataSetHasChangedAfterLayout) {
                        if (recyclerView3.mItemAnimator.mo11626b(h, h, cVar4, cVar5)) {
                            RecyclerView.this.postAnimationRunner();
                        }
                    } else if (recyclerView3.mItemAnimator.mo11628d(h, cVar4, cVar5)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if ((i2 & 4) != 0) {
                    C3094l.C3097c cVar6 = j.f7283b;
                    C3086d dVar3 = (C3086d) bVar;
                    RecyclerView.this.mRecycler.mo11702l(h);
                    RecyclerView.this.animateDisappearance(h, cVar6, (C3094l.C3097c) null);
                } else if ((i2 & 8) != 0) {
                    RecyclerView.this.animateAppearance(h, j.f7283b, j.f7284c);
                }
                j.f7282a = 0;
                j.f7283b = null;
                j.f7284c = null;
                C3160i0.C3161a.f7281d.mo18806a(j);
            }
        }
        this.mLayout.mo11667o0(this.mRecycler);
        C3117y yVar2 = this.mState;
        yVar2.f7123b = yVar2.f7126e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        yVar2.f7131j = false;
        yVar2.f7132k = false;
        this.mLayout.f7076f = false;
        ArrayList<C3084b0> arrayList = this.mRecycler.f7099b;
        if (arrayList != null) {
            arrayList.clear();
        }
        C3100o oVar3 = this.mLayout;
        if (oVar3.f7081k) {
            oVar3.f7080j = 0;
            oVar3.f7081k = false;
            this.mRecycler.mo11703m();
        }
        this.mLayout.mo11242i0(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        C3160i0 i0Var2 = this.mViewInfoStore;
        i0Var2.f7279a.clear();
        i0Var2.f7280b.mo19885b();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        C3107r rVar = this.mInterceptingOnItemTouchListener;
        if (rVar != null) {
            rVar.mo11686d(motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i = 0;
        while (i < size) {
            C3107r rVar = this.mOnItemTouchListeners.get(i);
            if (!rVar.mo11687e(motionEvent) || action == 3) {
                i++;
            } else {
                this.mInterceptingOnItemTouchListener = rVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e = this.mChildHelper.mo11849e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11848d(i3));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i) {
                    i = layoutPosition;
                }
                if (layoutPosition > i2) {
                    i2 = layoutPosition;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        C3084b0 findViewHolderForAdapterPosition;
        C3117y yVar = this.mState;
        int i = yVar.f7133l;
        if (i == -1) {
            i = 0;
        }
        int b = yVar.mo11715b();
        int i2 = i;
        while (i2 < b) {
            C3084b0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i2);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            } else {
                i2++;
            }
        }
        int min = Math.min(b, i);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    public static C3084b0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).mViewHolder;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.mDecorInsets;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + ClassUtils.PACKAGE_SEPARATOR_CHAR + str;
        }
    }

    private C2317m getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C2317m(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j, C3084b0 b0Var, C3084b0 b0Var2) {
        int e = this.mChildHelper.mo11849e();
        for (int i = 0; i < e; i++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11848d(i));
            if (childViewHolderInt != b0Var && getChangedHolderKey(childViewHolderInt) == j) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(b0Var);
                    throw new IllegalStateException(C0069a.m173d(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(b0Var);
                throw new IllegalStateException(C0069a.m173d(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b0Var2 + " cannot be found but it is necessary for " + b0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e = this.mChildHelper.mo11849e();
        for (int i = 0; i < e; i++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11848d(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2377l.m5291b(this) == 0) {
            C2364y.C2377l.m5301l(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new C3145g(new C3087e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i) {
        int i2;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c = 65535;
        int i3 = this.mLayout.mo11646C() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i4 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i5 = rect2.left;
        if ((i4 < i5 || rect.right <= i5) && rect.right < rect2.right) {
            i2 = 1;
        } else {
            int i6 = rect.right;
            int i7 = rect2.right;
            i2 = ((i6 > i7 || i4 >= i7) && i4 > i5) ? -1 : 0;
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
            c = 1;
        } else {
            int i10 = rect.bottom;
            int i11 = rect2.bottom;
            if ((i10 <= i11 && i8 < i11) || i8 <= i9) {
                c = 0;
            }
        }
        if (i == 1) {
            return c < 0 || (c == 0 && i2 * i3 < 0);
        }
        if (i == 2) {
            return c > 0 || (c == 0 && i2 * i3 > 0);
        }
        if (i == 17) {
            return i2 < 0;
        }
        if (i == 33) {
            return c < 0;
        }
        if (i == 66) {
            return i2 > 0;
        }
        if (i == 130) {
            return c > 0;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid direction: ");
        sb.append(i);
        throw new IllegalArgumentException(C0069a.m173d(this, sb));
    }

    private void nestedScrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        C3100o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int[] iArr = this.mReusableIntPair;
            int i4 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean f = oVar.mo11297f();
            boolean g = this.mLayout.mo11298g();
            startNestedScroll(g ? f | true : f ? 1 : 0, i3);
            if (dispatchNestedPreScroll(f ? i : 0, g ? i2 : 0, this.mReusableIntPair, this.mScrollOffset, i3)) {
                int[] iArr2 = this.mReusableIntPair;
                i -= iArr2[0];
                i2 -= iArr2[1];
            }
            int i5 = f ? i : 0;
            if (g) {
                i4 = i2;
            }
            scrollByInternal(i5, i4, motionEvent, i3);
            C3181p pVar = this.mGapWorker;
            if (!(pVar == null || (i == 0 && i2 == 0))) {
                pVar.mo11911a(this, i, i2);
            }
            stopNestedScroll(i3);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.mo11227G0();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z;
        boolean z2 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C3124a aVar = this.mAdapterHelper;
            aVar.mo11797l(aVar.f7181b);
            aVar.mo11797l(aVar.f7182c);
            aVar.f7185f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.mo11234d0();
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.mo11795j();
        } else {
            this.mAdapterHelper.mo11788c();
        }
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.f7131j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z = this.mDataSetHasChangedAfterLayout) || z3 || this.mLayout.f7076f) && (!z || this.mAdapter.hasStableIds());
        C3117y yVar = this.mState;
        if (yVar.f7131j && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        yVar.f7132k = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            r1.onPull(r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            r1.onPull(r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            r9.onPull(r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            r9.onPull(r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0081
        L_0x007c:
            java.util.WeakHashMap<android.view.View, androidx.core.view.s0> r7 = androidx.core.view.C2364y.f5646a
            androidx.core.view.C2364y.C2368d.m5221k(r6)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.mo11855k(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.mo11849e() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                C3084b0 findViewHolderForItemId = (this.mState.f7134m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.f7134m);
                if (findViewHolderForItemId != null && !this.mChildHelper.mo11855k(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                    view = findViewHolderForItemId.itemView;
                } else if (this.mChildHelper.mo11849e() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i = this.mState.f7135n;
                    if (!(((long) i) == -1 || (findViewById = view.findViewById(i)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.mLeftGlow.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.mInsetsDirty) {
                Rect rect = layoutParams2.mDecorInsets;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.mo11671r0(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        C3117y yVar = this.mState;
        yVar.f7134m = -1;
        yVar.f7133l = -1;
        yVar.f7135n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        C3084b0 b0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            b0Var = findContainingViewHolder(focusedChild);
        }
        if (b0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.f7134m = this.mAdapter.hasStableIds() ? b0Var.getItemId() : -1;
        this.mState.f7133l = this.mDataSetHasChangedAfterLayout ? -1 : b0Var.isRemoved() ? b0Var.mOldPosition : b0Var.getAbsoluteAdapterPosition();
        this.mState.f7135n = getDeepestFocusedViewWithId(b0Var.itemView);
    }

    private void setAdapterInternal(Adapter adapter, boolean z, boolean z2) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z || z2) {
            removeAndRecycleViews();
        }
        C3124a aVar = this.mAdapterHelper;
        aVar.mo11797l(aVar.f7181b);
        aVar.mo11797l(aVar.f7182c);
        aVar.f7185f = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo11657U(this.mAdapter);
        }
        C3111u uVar = this.mRecycler;
        Adapter adapter4 = this.mAdapter;
        uVar.f7098a.clear();
        uVar.mo11695e();
        C3109t c = uVar.mo11694c();
        if (adapter3 != null) {
            c.f7093b--;
        }
        if (!z && c.f7093b == 0) {
            for (int i = 0; i < c.f7092a.size(); i++) {
                c.f7092a.valueAt(i).f7094a.clear();
            }
        }
        if (adapter4 != null) {
            c.f7093b++;
        } else {
            c.getClass();
        }
        this.mState.f7127f = true;
    }

    private void stopScrollersInternal() {
        C3114x xVar;
        C3082a0 a0Var = this.mViewFlinger;
        RecyclerView.this.removeCallbacks(a0Var);
        a0Var.f7052d.abortAnimation();
        C3100o oVar = this.mLayout;
        if (oVar != null && (xVar = oVar.f7075e) != null) {
            xVar.mo11712g();
        }
    }

    public void absorbGlows(int i, int i2) {
        if (i < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i);
            }
        } else if (i > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i);
            }
        }
        if (i2 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i2);
            }
        }
        if (i != 0 || i2 != 0) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            oVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public void addItemDecoration(C3099n nVar, int i) {
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo11294c("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(C3105p pVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(pVar);
    }

    public void addOnItemTouchListener(C3107r rVar) {
        this.mOnItemTouchListeners.add(rVar);
    }

    public void addOnScrollListener(C3108s sVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(sVar);
    }

    public void addRecyclerListener(C3112v vVar) {
        C0005b.m20N(vVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(vVar);
    }

    public void animateAppearance(C3084b0 b0Var, C3094l.C3097c cVar, C3094l.C3097c cVar2) {
        b0Var.setIsRecyclable(false);
        if (this.mItemAnimator.mo11625a(b0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(C3084b0 b0Var, C3094l.C3097c cVar, C3094l.C3097c cVar2) {
        addAnimatingView(b0Var);
        b0Var.setIsRecyclable(false);
        if (this.mItemAnimator.mo11627c(b0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException(C0069a.m173d(this, C0072d.m201h("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        }
        throw new IllegalStateException(C0069a.m173d(this, C0072d.m201h(str)));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(C0069a.m173d(this, C0072d.m201h("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(C0069a.m173d(this, C0072d.m201h(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(C3084b0 b0Var) {
        C3094l lVar = this.mItemAnimator;
        return lVar == null || lVar.mo11630g(b0Var, b0Var.getUnmodifiedPayloads());
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.mLayout.mo11240h((LayoutParams) layoutParams);
    }

    public void clearOldPositions() {
        int h = this.mChildHelper.mo11852h();
        for (int i = 0; i < h; i++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        C3111u uVar = this.mRecycler;
        int size = uVar.f7100c.size();
        for (int i2 = 0; i2 < size; i2++) {
            uVar.f7100c.get(i2).clearOldPosition();
        }
        int size2 = uVar.f7098a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            uVar.f7098a.get(i3).clearOldPosition();
        }
        ArrayList<C3084b0> arrayList = uVar.f7099b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i4 = 0; i4 < size3; i4++) {
                uVar.f7099b.get(i4).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<C3105p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<C3108s> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        C3100o oVar = this.mLayout;
        if (oVar != null && oVar.mo11297f()) {
            return this.mLayout.mo11308l(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        C3100o oVar = this.mLayout;
        if (oVar != null && oVar.mo11297f()) {
            return this.mLayout.mo11243m(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        C3100o oVar = this.mLayout;
        if (oVar != null && oVar.mo11297f()) {
            return this.mLayout.mo11245n(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        C3100o oVar = this.mLayout;
        if (oVar != null && oVar.mo11298g()) {
            return this.mLayout.mo11311o(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        C3100o oVar = this.mLayout;
        if (oVar != null && oVar.mo11298g()) {
            return this.mLayout.mo11246p(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        C3100o oVar = this.mLayout;
        if (oVar != null && oVar.mo11298g()) {
            return this.mLayout.mo11247q(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            z = false;
        } else {
            this.mLeftGlow.onRelease();
            z = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.mRightGlow.onRelease();
            z |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.mTopGlow.onRelease();
            z |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.mBottomGlow.onRelease();
            z |= this.mBottomGlow.isFinished();
        }
        if (z) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i = C0013g.f24a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
        } else if (this.mAdapterHelper.mo11792g()) {
            C3124a aVar = this.mAdapterHelper;
            int i2 = aVar.f7185f;
            boolean z = false;
            if ((4 & i2) != 0) {
                if ((11 & i2) != 0) {
                    z = true;
                }
                if (!z) {
                    int i3 = C0013g.f24a;
                    Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.mo11795j();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.mo11787b();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    Trace.endSection();
                    return;
                }
            }
            if (aVar.mo11792g()) {
                int i4 = C0013g.f24a;
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
            }
        }
    }

    public void defaultOnMeasure(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        setMeasuredDimension(C3100o.m7402i(i, paddingRight, C2364y.C2368d.m5215e(this)), C3100o.m7402i(i2, getPaddingBottom() + getPaddingTop(), C2364y.C2368d.m5214d(this)));
    }

    public void dispatchChildAttached(View view) {
        C3084b0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || childViewHolderInt == null)) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<C3105p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo11684b(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        C3084b0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || childViewHolderInt == null)) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<C3105p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).mo11683a(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            boolean z = false;
            this.mState.f7130i = false;
            boolean z2 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.f7125d == 1) {
                dispatchLayoutStep1();
                this.mLayout.mo11673w0(this);
                dispatchLayoutStep2();
            } else {
                C3124a aVar = this.mAdapterHelper;
                if (!aVar.f7182c.isEmpty() && !aVar.f7181b.isEmpty()) {
                    z = true;
                }
                if (z || z2 || this.mLayout.f7084n != getWidth() || this.mLayout.f7085o != getHeight()) {
                    this.mLayout.mo11673w0(this);
                    dispatchLayoutStep2();
                } else {
                    this.mLayout.mo11673w0(this);
                }
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().mo8901a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().mo8902b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().mo8903c(i, i2, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().mo8904d(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public void dispatchOnScrollStateChanged(int i) {
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo11664l0(i);
        }
        onScrollStateChanged(i);
        C3108s sVar = this.mScrollListener;
        if (sVar != null) {
            sVar.onScrollStateChanged(this, i);
        }
        List<C3108s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrollStateChanged(this, i);
            }
        }
    }

    public void dispatchOnScrolled(int i, int i2) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        onScrolled(i, i2);
        C3108s sVar = this.mScrollListener;
        if (sVar != null) {
            sVar.onScrolled(this, i, i2);
        }
        List<C3108s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).onScrolled(this, i, i2);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            C3084b0 b0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (b0Var.itemView.getParent() == this && !b0Var.shouldIgnore() && (i = b0Var.mPendingAccessibilityState) != -1) {
                View view = b0Var.itemView;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5229s(view, i);
                b0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z3 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z2 = true;
            }
            z |= z2;
            canvas.restoreToCount(save4);
        }
        if (z || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.mo11635l()) {
            z3 = z;
        }
        if (z3) {
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5221k(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            this.mEdgeEffectFactory.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.mBottomGlow = edgeEffect;
            if (this.mClipToPadding) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            this.mEdgeEffectFactory.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.mLeftGlow = edgeEffect;
            if (this.mClipToPadding) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            this.mEdgeEffectFactory.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.mRightGlow = edgeEffect;
            if (this.mClipToPadding) {
                edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            this.mEdgeEffectFactory.getClass();
            EdgeEffect edgeEffect = new EdgeEffect(getContext());
            this.mTopGlow = edgeEffect;
            if (this.mClipToPadding) {
                edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public String exceptionLabel() {
        StringBuilder h = C0072d.m201h(" ");
        h.append(super.toString());
        h.append(", adapter:");
        h.append(this.mAdapter);
        h.append(", layout:");
        h.append(this.mLayout);
        h.append(", context:");
        h.append(getContext());
        return h.toString();
    }

    public final void fillRemainingScrollValues(C3117y yVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f7052d;
            overScroller.getFinalX();
            overScroller.getCurrX();
            yVar.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        yVar.getClass();
    }

    public View findChildViewUnder(float f, float f2) {
        for (int e = this.mChildHelper.mo11849e() - 1; e >= 0; e--) {
            View d = this.mChildHelper.mo11848d(e);
            float translationX = d.getTranslationX();
            float translationY = d.getTranslationY();
            if (f >= ((float) d.getLeft()) + translationX && f <= ((float) d.getRight()) + translationX && f2 >= ((float) d.getTop()) + translationY && f2 <= ((float) d.getBottom()) + translationY) {
                return d;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public C3084b0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public C3084b0 findViewHolderForAdapterPosition(int i) {
        C3084b0 b0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h = this.mChildHelper.mo11852h();
        for (int i2 = 0; i2 < h; i2++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i) {
                if (!this.mChildHelper.mo11855k(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                b0Var = childViewHolderInt;
            }
        }
        return b0Var;
    }

    public C3084b0 findViewHolderForItemId(long j) {
        Adapter adapter = this.mAdapter;
        C3084b0 b0Var = null;
        if (adapter != null && adapter.hasStableIds()) {
            int h = this.mChildHelper.mo11852h();
            for (int i = 0; i < h; i++) {
                C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j) {
                    if (!this.mChildHelper.mo11855k(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    b0Var = childViewHolderInt;
                }
            }
        }
        return b0Var;
    }

    public C3084b0 findViewHolderForLayoutPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    @Deprecated
    public C3084b0 findViewHolderForPosition(int i) {
        return findViewHolderForPosition(i, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fling(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            androidx.recyclerview.widget.RecyclerView$o r1 = r0.mLayout
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "RecyclerView"
            java.lang.String r3 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r3)
            return r2
        L_0x000f:
            boolean r3 = r0.mLayoutSuppressed
            if (r3 == 0) goto L_0x0014
            return r2
        L_0x0014:
            boolean r1 = r1.mo11297f()
            androidx.recyclerview.widget.RecyclerView$o r3 = r0.mLayout
            boolean r3 = r3.mo11298g()
            if (r1 == 0) goto L_0x002c
            int r4 = java.lang.Math.abs(r19)
            int r5 = r0.mMinFlingVelocity
            if (r4 >= r5) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r4 = r19
            goto L_0x002d
        L_0x002c:
            r4 = r2
        L_0x002d:
            if (r3 == 0) goto L_0x003b
            int r5 = java.lang.Math.abs(r20)
            int r6 = r0.mMinFlingVelocity
            if (r5 >= r6) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r5 = r20
            goto L_0x003c
        L_0x003b:
            r5 = r2
        L_0x003c:
            if (r4 != 0) goto L_0x0041
            if (r5 != 0) goto L_0x0041
            return r2
        L_0x0041:
            float r6 = (float) r4
            float r7 = (float) r5
            boolean r8 = r0.dispatchNestedPreFling(r6, r7)
            if (r8 != 0) goto L_0x00f7
            r8 = 1
            if (r1 != 0) goto L_0x0051
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r9 = r2
            goto L_0x0052
        L_0x0051:
            r9 = r8
        L_0x0052:
            r0.dispatchNestedFling(r6, r7, r9)
            androidx.recyclerview.widget.RecyclerView$q r6 = r0.mOnFlingListener
            if (r6 == 0) goto L_0x00a2
            androidx.recyclerview.widget.g0 r6 = (androidx.recyclerview.widget.C3148g0) r6
            androidx.recyclerview.widget.RecyclerView r7 = r6.f7234a
            androidx.recyclerview.widget.RecyclerView$o r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x0064
            goto L_0x009e
        L_0x0064:
            androidx.recyclerview.widget.RecyclerView r10 = r6.f7234a
            androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x006d
            goto L_0x009e
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r10 = r6.f7234a
            int r10 = r10.getMinFlingVelocity()
            int r11 = java.lang.Math.abs(r5)
            if (r11 > r10) goto L_0x007f
            int r11 = java.lang.Math.abs(r4)
            if (r11 <= r10) goto L_0x009e
        L_0x007f:
            boolean r10 = r7 instanceof androidx.recyclerview.widget.RecyclerView.C3114x.C3116b
            if (r10 != 0) goto L_0x0084
            goto L_0x0092
        L_0x0084:
            androidx.recyclerview.widget.RecyclerView$x r10 = r6.mo11821d(r7)
            if (r10 != 0) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            int r6 = r6.mo11823f(r7, r4, r5)
            r11 = -1
            if (r6 != r11) goto L_0x0094
        L_0x0092:
            r6 = r2
            goto L_0x009a
        L_0x0094:
            r10.f7107a = r6
            r7.mo11650F0(r10)
            r6 = r8
        L_0x009a:
            if (r6 == 0) goto L_0x009e
            r6 = r8
            goto L_0x009f
        L_0x009e:
            r6 = r2
        L_0x009f:
            if (r6 == 0) goto L_0x00a2
            return r8
        L_0x00a2:
            if (r9 == 0) goto L_0x00f7
            if (r3 == 0) goto L_0x00a8
            r1 = r1 | 2
        L_0x00a8:
            r0.startNestedScroll(r1, r8)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r4, r1)
            int r12 = java.lang.Math.max(r3, r1)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r5, r1)
            int r13 = java.lang.Math.max(r3, r1)
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r0.mViewFlinger
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            r4 = 2
            r3.setScrollState(r4)
            r1.f7051c = r2
            r1.f7050b = r2
            android.view.animation.Interpolator r2 = r1.f7053e
            android.view.animation.Interpolator r3 = sQuinticInterpolator
            if (r2 == r3) goto L_0x00e2
            r1.f7053e = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r4 = r4.getContext()
            r2.<init>(r4, r3)
            r1.f7052d = r2
        L_0x00e2:
            android.widget.OverScroller r9 = r1.f7052d
            r10 = 0
            r11 = 0
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = 2147483647(0x7fffffff, float:NaN)
            r9.fling(r10, r11, r12, r13, r14, r15, r16, r17)
            r1.mo11565a()
            return r8
        L_0x00f7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    public View focusSearch(View view, int i) {
        View view2;
        boolean z;
        this.mLayout.getClass();
        boolean z2 = true;
        boolean z3 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i == 2 || i == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.mo11230X(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.mo11298g()) {
                int i2 = i == 2 ? 130 : 33;
                z = instance.findNextFocus(this, view, i2) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i2;
                }
            } else {
                z = false;
            }
            if (!z && this.mLayout.mo11297f()) {
                int i3 = (this.mLayout.mo11646C() == 1) ^ (i == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i3) != null) {
                    z2 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i = i3;
                }
                z = z2;
            }
            if (z) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.mo11230X(view, i, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i) ? view2 : super.focusSearch(view, i);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i);
        }
        requestChildOnScreen(view2, (View) null);
        return view;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo11251t();
        }
        throw new IllegalStateException(C0069a.m173d(this, C0072d.m201h("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo11254u(getContext(), attributeSet);
        }
        throw new IllegalStateException(C0069a.m173d(this, C0072d.m201h("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(C3084b0 b0Var) {
        if (b0Var.hasAnyOfTheFlags(524) || !b0Var.isBound()) {
            return -1;
        }
        C3124a aVar = this.mAdapterHelper;
        int i = b0Var.mPosition;
        int size = aVar.f7181b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3124a.C3126b bVar = aVar.f7181b.get(i2);
            int i3 = bVar.f7186a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f7187b;
                    if (i4 <= i) {
                        int i5 = bVar.f7189d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f7187b;
                    if (i6 == i) {
                        i = bVar.f7189d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f7189d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f7187b <= i) {
                i += bVar.f7189d;
            }
        }
        return i;
    }

    public int getBaseline() {
        C3100o oVar = this.mLayout;
        if (oVar == null) {
            return super.getBaseline();
        }
        oVar.getClass();
        return -1;
    }

    public long getChangedHolderKey(C3084b0 b0Var) {
        return this.mAdapter.hasStableIds() ? b0Var.getItemId() : (long) b0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        C3084b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildDrawingOrder(int i, int i2) {
        C3092j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i, i2) : jVar.mo11624a(i, i2);
    }

    public long getChildItemId(View view) {
        C3084b0 childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        C3084b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public C3084b0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public C3137d0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public C3093k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public C3094l getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.mInsetsDirty) {
            return layoutParams.mDecorInsets;
        }
        if (this.mState.f7128g && (layoutParams.isItemChanged() || layoutParams.isViewInvalid())) {
            return layoutParams.mDecorInsets;
        }
        Rect rect = layoutParams.mDecorInsets;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i2 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i2 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.mInsetsDirty = false;
        return rect;
    }

    public C3099n getItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i >= 0 && i < itemDecorationCount) {
            return this.mItemDecorations.get(i);
        }
        throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public C3100o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public C3106q getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public C3109t getRecycledViewPool() {
        return this.mRecycler.mo11694c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().mo8906f(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.mo11792g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C3124a(new C3088f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(C0069a.m173d(this, C0072d.m201h("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new C3176o(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            C3100o oVar = this.mLayout;
            if (oVar != null) {
                oVar.mo11294c("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        C3094l lVar = this.mItemAnimator;
        return lVar != null && lVar.mo11635l();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f5576d;
    }

    public void jumpToPositionForSmoothScroller(int i) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.mo11315u0(i);
            awakenScrollBars();
        }
    }

    public void markItemDecorInsetsDirty() {
        int h = this.mChildHelper.mo11852h();
        for (int i = 0; i < h; i++) {
            ((LayoutParams) this.mChildHelper.mo11851g(i).getLayoutParams()).mInsetsDirty = true;
        }
        C3111u uVar = this.mRecycler;
        int size = uVar.f7100c.size();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutParams layoutParams = (LayoutParams) uVar.f7100c.get(i2).itemView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.mInsetsDirty = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h = this.mChildHelper.mo11852h();
        for (int i = 0; i < h; i++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C3111u uVar = this.mRecycler;
        int size = uVar.f7100c.size();
        for (int i2 = 0; i2 < size; i2++) {
            C3084b0 b0Var = uVar.f7100c.get(i2);
            if (b0Var != null) {
                b0Var.addFlags(6);
                b0Var.addChangePayload((Object) null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            uVar.mo11695e();
        }
    }

    public void nestedScrollBy(int i, int i2) {
        nestedScrollByInternal(i, i2, (MotionEvent) null, 1);
    }

    public void offsetChildrenHorizontal(int i) {
        int e = this.mChildHelper.mo11849e();
        for (int i2 = 0; i2 < e; i2++) {
            this.mChildHelper.mo11848d(i2).offsetLeftAndRight(i);
        }
    }

    public void offsetChildrenVertical(int i) {
        int e = this.mChildHelper.mo11849e();
        for (int i2 = 0; i2 < e; i2++) {
            this.mChildHelper.mo11848d(i2).offsetTopAndBottom(i);
        }
    }

    public void offsetPositionRecordsForInsert(int i, int i2) {
        int h = this.mChildHelper.mo11852h();
        for (int i3 = 0; i3 < h; i3++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i) {
                childViewHolderInt.offsetPosition(i2, false);
                this.mState.f7127f = true;
            }
        }
        C3111u uVar = this.mRecycler;
        int size = uVar.f7100c.size();
        for (int i4 = 0; i4 < size; i4++) {
            C3084b0 b0Var = uVar.f7100c.get(i4);
            if (b0Var != null && b0Var.mPosition >= i) {
                b0Var.offsetPosition(i2, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int h = this.mChildHelper.mo11852h();
        int i10 = -1;
        if (i < i2) {
            i5 = i;
            i4 = i2;
            i3 = -1;
        } else {
            i4 = i;
            i5 = i2;
            i3 = 1;
        }
        for (int i11 = 0; i11 < h; i11++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i11));
            if (childViewHolderInt != null && (i9 = childViewHolderInt.mPosition) >= i5 && i9 <= i4) {
                if (i9 == i) {
                    childViewHolderInt.offsetPosition(i2 - i, false);
                } else {
                    childViewHolderInt.offsetPosition(i3, false);
                }
                this.mState.f7127f = true;
            }
        }
        C3111u uVar = this.mRecycler;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i10 = 1;
            i7 = i2;
        }
        int size = uVar.f7100c.size();
        for (int i12 = 0; i12 < size; i12++) {
            C3084b0 b0Var = uVar.f7100c.get(i12);
            if (b0Var != null && (i8 = b0Var.mPosition) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    b0Var.offsetPosition(i2 - i, false);
                } else {
                    b0Var.offsetPosition(i10, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.mChildHelper.mo11852h();
        for (int i4 = 0; i4 < h; i4++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i5 = childViewHolderInt.mPosition;
                if (i5 >= i3) {
                    childViewHolderInt.offsetPosition(-i2, z);
                    this.mState.f7127f = true;
                } else if (i5 >= i) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i - 1, -i2, z);
                    this.mState.f7127f = true;
                }
            }
        }
        C3111u uVar = this.mRecycler;
        int size = uVar.f7100c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C3084b0 b0Var = uVar.f7100c.get(size);
                if (b0Var != null) {
                    int i6 = b0Var.mPosition;
                    if (i6 >= i3) {
                        b0Var.offsetPosition(-i2, z);
                    } else if (i6 >= i) {
                        b0Var.addFlags(8);
                        uVar.mo11696f(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        this.mIsAttached = true;
        this.mFirstLayoutComplete = this.mFirstLayoutComplete && !isLayoutRequested();
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            oVar.f7077g = true;
            oVar.mo11658V(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<C3181p> threadLocal = C3181p.f7361f;
            C3181p pVar = threadLocal.get();
            this.mGapWorker = pVar;
            if (pVar == null) {
                this.mGapWorker = new C3181p();
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                Display b = C2364y.C2369e.m5231b(this);
                float f = 60.0f;
                if (!isInEditMode() && b != null) {
                    float refreshRate = b.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f = refreshRate;
                    }
                }
                C3181p pVar2 = this.mGapWorker;
                pVar2.f7365d = (long) (1.0E9f / f);
                threadLocal.set(pVar2);
            }
            this.mGapWorker.f7363b.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onDetachedFromWindow() {
        C3181p pVar;
        super.onDetachedFromWindow();
        C3094l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo11634k();
        }
        stopScroll();
        this.mIsAttached = false;
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            oVar.f7077g = false;
            oVar.mo11286W(this);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        do {
        } while (C3160i0.C3161a.f7281d.mo18807b() != null);
        if (ALLOW_THREAD_GAP_WORK && (pVar = this.mGapWorker) != null) {
            pVar.f7363b.remove(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i = 0; i < size; i++) {
            this.mItemDecorations.get(i).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f;
        float f2;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f2 = this.mLayout.mo11298g() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.mo11297f()) {
                    f = motionEvent.getAxisValue(10);
                    if (!(f2 == 0.0f && f == 0.0f)) {
                        nestedScrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.mo11298g()) {
                        f2 = -axisValue;
                    } else if (this.mLayout.mo11297f()) {
                        f = axisValue;
                        f2 = 0.0f;
                        nestedScrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f2 = 0.0f;
                f = 0.0f;
                nestedScrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
            f = 0.0f;
            nestedScrollByInternal((int) (f * this.mScaledHorizontalScrollFactor), (int) (f2 * this.mScaledVerticalScrollFactor), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        C3100o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean f = oVar.mo11297f();
        boolean g = this.mLayout.mo11298g();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x;
            this.mInitialTouchX = x;
            int y = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y;
            this.mInitialTouchY = y;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (g) {
                f |= true;
            }
            startNestedScroll(f ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                StringBuilder h = C0072d.m201h("Error processing scroll; pointer index for id ");
                h.append(this.mScrollPointerId);
                h.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, h.toString());
                return false;
            }
            int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i = x2 - this.mInitialTouchX;
                int i2 = y2 - this.mInitialTouchY;
                if (!f || Math.abs(i) <= this.mTouchSlop) {
                    z = false;
                } else {
                    this.mLastTouchX = x2;
                    z = true;
                }
                if (g && Math.abs(i2) > this.mTouchSlop) {
                    this.mLastTouchY = y2;
                    z = true;
                }
                if (z) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x3 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x3;
            this.mInitialTouchX = x3;
            int y3 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y3;
            this.mInitialTouchY = y3;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = C0013g.f24a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    public void onMeasure(int i, int i2) {
        C3100o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i, i2);
            return;
        }
        boolean z = false;
        if (oVar.mo11277O()) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mLayout.f7072b.defaultOnMeasure(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z;
            if (!z && this.mAdapter != null) {
                if (this.mState.f7125d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.mo11675x0(i, i2);
                this.mState.f7130i = true;
                dispatchLayoutStep2();
                this.mLayout.mo11677z0(i, i2);
                if (this.mLayout.mo11269C0()) {
                    this.mLayout.mo11675x0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f7130i = true;
                    dispatchLayoutStep2();
                    this.mLayout.mo11677z0(i, i2);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.f7072b.defaultOnMeasure(i, i2);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                C3117y yVar = this.mState;
                if (yVar.f7132k) {
                    yVar.f7128g = true;
                } else {
                    this.mAdapterHelper.mo11788c();
                    this.mState.f7128g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.f7132k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.mAdapter;
            if (adapter != null) {
                this.mState.f7126e = adapter.getItemCount();
            } else {
                this.mState.f7126e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.f7072b.defaultOnMeasure(i, i2);
            stopInterceptRequestLayout(false);
            this.mState.f7128g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.getSuperState());
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.copyFrom(savedState2);
        } else {
            C3100o oVar = this.mLayout;
            if (oVar != null) {
                savedState.mLayoutState = oVar.mo11306k0();
            } else {
                savedState.mLayoutState = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i) {
    }

    public void onScrolled(int i, int i2) {
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01db
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01db
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.mo11297f()
            androidx.recyclerview.widget.RecyclerView$o r0 = r6.mLayout
            boolean r11 = r0.mo11298g()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01af
            if (r0 == r9) goto L_0x016d
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d0
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01d0
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01d0
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01d0
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00ae
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r0 = android.support.p013v4.media.C0072d.m201h(r0)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00ae:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00db
            if (r0 <= 0) goto L_0x00d0
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d7
        L_0x00d0:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d7:
            if (r0 == 0) goto L_0x00db
            r2 = r9
            goto L_0x00dc
        L_0x00db:
            r2 = r8
        L_0x00dc:
            if (r11 == 0) goto L_0x00f2
            if (r1 <= 0) goto L_0x00e8
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00e8:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = r9
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01d0
            int[] r3 = r6.mReusableIntPair
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = r8
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = r8
        L_0x010f:
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013c
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013c:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x014e
            r1 = r15
            goto L_0x014f
        L_0x014e:
            r1 = r8
        L_0x014f:
            if (r11 == 0) goto L_0x0153
            r2 = r0
            goto L_0x0154
        L_0x0153:
            r2 = r8
        L_0x0154:
            boolean r1 = r6.scrollByInternal(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0161
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0161:
            androidx.recyclerview.widget.p r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01d0
            if (r15 != 0) goto L_0x0169
            if (r0 == 0) goto L_0x01d0
        L_0x0169:
            r1.mo11911a(r6, r15, r0)
            goto L_0x01d0
        L_0x016d:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0189
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018a
        L_0x0189:
            r1 = r0
        L_0x018a:
            if (r11 == 0) goto L_0x0196
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0197
        L_0x0196:
            r2 = r0
        L_0x0197:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a7
        L_0x019f:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01aa
        L_0x01a7:
            r6.setScrollState(r8)
        L_0x01aa:
            r17.resetScroll()
            r8 = r9
            goto L_0x01d0
        L_0x01af:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L_0x01cd
            r10 = r10 | 2
        L_0x01cd:
            r6.startNestedScroll(r10, r8)
        L_0x01d0:
            if (r8 != 0) goto L_0x01d7
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01d7:
            r12.recycle()
            return r9
        L_0x01db:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            Runnable runnable = this.mItemAnimatorRunner;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2368d.m5223m(this, runnable);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z) {
        this.mDispatchItemsChangedEvent = z | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(C3084b0 b0Var, C3094l.C3097c cVar) {
        b0Var.setFlags(0, 8192);
        if (this.mState.f7129h && b0Var.isUpdated() && !b0Var.isRemoved() && !b0Var.shouldIgnore()) {
            this.mViewInfoStore.f7280b.mo19890h(getChangedHolderKey(b0Var), b0Var);
        }
        this.mViewInfoStore.mo11884b(b0Var, cVar);
    }

    public void removeAndRecycleViews() {
        C3094l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.mo11634k();
        }
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo11666n0(this.mRecycler);
            this.mLayout.mo11667o0(this.mRecycler);
        }
        C3111u uVar = this.mRecycler;
        uVar.f7098a.clear();
        uVar.mo11695e();
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0032  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean removeAnimatingView(android.view.View r4) {
        /*
            r3 = this;
            r3.startInterceptRequestLayout()
            androidx.recyclerview.widget.g r0 = r3.mChildHelper
            androidx.recyclerview.widget.g$b r1 = r0.f7229a
            androidx.recyclerview.widget.RecyclerView$e r1 = (androidx.recyclerview.widget.RecyclerView.C3087e) r1
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            int r1 = r1.indexOfChild(r4)
            r2 = -1
            if (r1 != r2) goto L_0x0016
            r0.mo11856l(r4)
            goto L_0x002d
        L_0x0016:
            androidx.recyclerview.widget.g$a r2 = r0.f7230b
            boolean r2 = r2.mo11861d(r1)
            if (r2 == 0) goto L_0x002f
            androidx.recyclerview.widget.g$a r2 = r0.f7230b
            r2.mo11863f(r1)
            r0.mo11856l(r4)
            androidx.recyclerview.widget.g$b r0 = r0.f7229a
            androidx.recyclerview.widget.RecyclerView$e r0 = (androidx.recyclerview.widget.RecyclerView.C3087e) r0
            r0.mo11614b(r1)
        L_0x002d:
            r0 = 1
            goto L_0x0030
        L_0x002f:
            r0 = 0
        L_0x0030:
            if (r0 == 0) goto L_0x0040
            androidx.recyclerview.widget.RecyclerView$b0 r4 = getChildViewHolderInt(r4)
            androidx.recyclerview.widget.RecyclerView$u r1 = r3.mRecycler
            r1.mo11702l(r4)
            androidx.recyclerview.widget.RecyclerView$u r1 = r3.mRecycler
            r1.mo11698h(r4)
        L_0x0040:
            r4 = r0 ^ 1
            r3.stopInterceptRequestLayout(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.removeAnimatingView(android.view.View):boolean");
    }

    public void removeDetachedView(View view, boolean z) {
        C3084b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(C0069a.m173d(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z);
    }

    public void removeItemDecoration(C3099n nVar) {
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            oVar.mo11294c("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i) {
        int itemDecorationCount = getItemDecorationCount();
        if (i < 0 || i >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i));
    }

    public void removeOnChildAttachStateChangeListener(C3105p pVar) {
        List<C3105p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(pVar);
        }
    }

    public void removeOnItemTouchListener(C3107r rVar) {
        this.mOnItemTouchListeners.remove(rVar);
        if (this.mInterceptingOnItemTouchListener == rVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(C3108s sVar) {
        List<C3108s> list = this.mScrollListeners;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public void removeRecyclerListener(C3112v vVar) {
        this.mRecyclerListeners.remove(vVar);
    }

    public void repositionShadowingViews() {
        C3084b0 b0Var;
        int e = this.mChildHelper.mo11849e();
        for (int i = 0; i < e; i++) {
            View d = this.mChildHelper.mo11848d(i);
            C3084b0 childViewHolder = getChildViewHolder(d);
            if (!(childViewHolder == null || (b0Var = childViewHolder.mShadowingHolder) == null)) {
                View view = b0Var.itemView;
                int left = d.getLeft();
                int top = d.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        C3114x xVar = this.mLayout.f7075e;
        boolean z = true;
        if (!(xVar != null && xVar.f7111e) && !isComputingLayout()) {
            z = false;
        }
        if (!z && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.mLayout.mo11671r0(this, view, rect, z, false);
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        int size = this.mOnItemTouchListeners.size();
        for (int i = 0; i < size; i++) {
            this.mOnItemTouchListeners.get(i).mo11685c(z);
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int h = this.mChildHelper.mo11852h();
        for (int i = 0; i < h; i++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    public void scrollBy(int i, int i2) {
        C3100o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean f = oVar.mo11297f();
            boolean g = this.mLayout.mo11298g();
            if (f || g) {
                if (!f) {
                    i = 0;
                }
                if (!g) {
                    i2 = 0;
                }
                scrollByInternal(i, i2, (MotionEvent) null, 0);
            }
        }
    }

    public boolean scrollByInternal(int i, int i2, MotionEvent motionEvent, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int i9 = i2;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i8, i9, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i10 = iArr2[0];
            int i11 = iArr2[1];
            i7 = i11;
            i6 = i10;
            i5 = i8 - i10;
            i4 = i9 - i11;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i6, i7, i5, i4, this.mScrollOffset, i3, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i12 = iArr4[0];
        int i13 = i5 - i12;
        int i14 = iArr4[1];
        int i15 = i4 - i14;
        boolean z = (i12 == 0 && i14 == 0) ? false : true;
        int i16 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i17 = iArr5[0];
        this.mLastTouchX = i16 - i17;
        int i18 = this.mLastTouchY;
        int i19 = iArr5[1];
        this.mLastTouchY = i18 - i19;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i17;
        iArr6[1] = iArr6[1] + i19;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    pullGlows(motionEvent.getX(), (float) i13, motionEvent.getY(), (float) i15);
                }
            }
            considerReleasingGlowsOnScroll(i, i2);
        }
        if (!(i6 == 0 && i7 == 0)) {
            dispatchOnScrolled(i6, i7);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z && i6 == 0 && i7 == 0) ? false : true;
    }

    public void scrollStep(int i, int i2, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i3 = C0013g.f24a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int t0 = i != 0 ? this.mLayout.mo11252t0(i, this.mRecycler, this.mState) : 0;
        int v0 = i2 != 0 ? this.mLayout.mo11257v0(i2, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = t0;
            iArr[1] = v0;
        }
    }

    public void scrollTo(int i, int i2) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            C3100o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            oVar.mo11315u0(i);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(C3137d0 d0Var) {
        this.mAccessibilityDelegate = d0Var;
        C2364y.m5201p(this, d0Var);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(C3092j jVar) {
        if (jVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = jVar;
            setChildrenDrawingOrderEnabled(jVar != null);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(C3084b0 b0Var, int i) {
        if (isComputingLayout()) {
            b0Var.mPendingAccessibilityState = i;
            this.mPendingAccessibilityImportanceChange.add(b0Var);
            return false;
        }
        View view = b0Var.itemView;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        C2364y.C2368d.m5229s(view, i);
        return true;
    }

    public void setClipToPadding(boolean z) {
        if (z != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z;
        super.setClipToPadding(z);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(C3093k kVar) {
        kVar.getClass();
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z) {
        this.mHasFixedSize = z;
    }

    public void setItemAnimator(C3094l lVar) {
        C3094l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.mo11634k();
            this.mItemAnimator.f7062a = null;
        }
        this.mItemAnimator = lVar;
        if (lVar != null) {
            lVar.f7062a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i) {
        C3111u uVar = this.mRecycler;
        uVar.f7102e = i;
        uVar.mo11703m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(C3100o oVar) {
        if (oVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                C3094l lVar = this.mItemAnimator;
                if (lVar != null) {
                    lVar.mo11634k();
                }
                this.mLayout.mo11666n0(this.mRecycler);
                this.mLayout.mo11667o0(this.mRecycler);
                C3111u uVar = this.mRecycler;
                uVar.f7098a.clear();
                uVar.mo11695e();
                if (this.mIsAttached) {
                    C3100o oVar2 = this.mLayout;
                    oVar2.f7077g = false;
                    oVar2.mo11286W(this);
                }
                this.mLayout.mo11643A0((RecyclerView) null);
                this.mLayout = null;
            } else {
                C3111u uVar2 = this.mRecycler;
                uVar2.f7098a.clear();
                uVar2.mo11695e();
            }
            C3145g gVar = this.mChildHelper;
            gVar.f7230b.mo11864g();
            int size = gVar.f7231c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C3087e eVar = (C3087e) gVar.f7229a;
                eVar.getClass();
                C3084b0 childViewHolderInt = getChildViewHolderInt((View) gVar.f7231c.get(size));
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
                gVar.f7231c.remove(size);
            }
            C3087e eVar2 = (C3087e) gVar.f7229a;
            int a = eVar2.mo11613a();
            for (int i = 0; i < a; i++) {
                View childAt = RecyclerView.this.getChildAt(i);
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
            this.mLayout = oVar;
            if (oVar != null) {
                if (oVar.f7072b == null) {
                    oVar.mo11643A0(this);
                    if (this.mIsAttached) {
                        C3100o oVar3 = this.mLayout;
                        oVar3.f7077g = true;
                        oVar3.mo11658V(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(oVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(C0069a.m173d(oVar.f7072b, sb));
                }
            }
            this.mRecycler.mo11703m();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z) {
        C2317m scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f5576d) {
            View view = scrollingChildHelper.f5575c;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            C2364y.C2373i.m5279z(view);
        }
        scrollingChildHelper.f5576d = z;
    }

    public void setOnFlingListener(C3106q qVar) {
        this.mOnFlingListener = qVar;
    }

    @Deprecated
    public void setOnScrollListener(C3108s sVar) {
        this.mScrollListener = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.mPreserveFocusAfterLayout = z;
    }

    public void setRecycledViewPool(C3109t tVar) {
        C3111u uVar = this.mRecycler;
        C3109t tVar2 = uVar.f7104g;
        if (tVar2 != null) {
            tVar2.f7093b--;
        }
        uVar.f7104g = tVar;
        if (tVar != null && RecyclerView.this.getAdapter() != null) {
            uVar.f7104g.f7093b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(C3112v vVar) {
        this.mRecyclerListener = vVar;
    }

    /* access modifiers changed from: package-private */
    public void setScrollState(int i) {
        if (i != this.mScrollState) {
            this.mScrollState = i;
            if (i != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i);
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(C3118z zVar) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        if (contentChangeTypes != 0) {
            i = contentChangeTypes;
        }
        this.mEatenAccessibilityChangeFlags |= i;
        return true;
    }

    public void smoothScrollBy(int i, int i2) {
        smoothScrollBy(i, i2, (Interpolator) null);
    }

    public void smoothScrollToPosition(int i) {
        if (!this.mLayoutSuppressed) {
            C3100o oVar = this.mLayout;
            if (oVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                oVar.mo11270E0(this, i);
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i;
        if (i == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i) {
        return getScrollingChildHelper().mo8907g(i, 0);
    }

    public void stopInterceptRequestLayout(boolean z) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().mo8908h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z) {
        if (z != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(Adapter adapter, boolean z) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i, int i2, Object obj) {
        int i3;
        int i4;
        int h = this.mChildHelper.mo11852h();
        int i5 = i2 + i;
        for (int i6 = 0; i6 < h; i6++) {
            View g = this.mChildHelper.mo11851g(i6);
            C3084b0 childViewHolderInt = getChildViewHolderInt(g);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i4 = childViewHolderInt.mPosition) >= i && i4 < i5) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((LayoutParams) g.getLayoutParams()).mInsetsDirty = true;
            }
        }
        C3111u uVar = this.mRecycler;
        int size = uVar.f7100c.size();
        while (true) {
            size--;
            if (size >= 0) {
                C3084b0 b0Var = uVar.f7100c.get(size);
                if (b0Var != null && (i3 = b0Var.mPosition) >= i && i3 < i5) {
                    b0Var.addFlags(2);
                    uVar.mo11696f(size);
                }
            } else {
                return;
            }
        }
    }

    public static abstract class Adapter<VH extends C3084b0> {
        private boolean mHasStableIds = false;
        private final C3090h mObservable = new C3090h();
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i2 = C0013g.f24a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof LayoutParams) {
                    ((LayoutParams) layoutParams).mInsetsDirty = true;
                }
                int i3 = C0013g.f24a;
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int i = C3089g.f7061a[this.mStateRestorationPolicy.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i != 2) {
                return true;
            }
            return getItemCount() > 0;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                int i2 = C0013g.f24a;
                Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    Trace.endSection();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i3 = C0013g.f24a;
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends C3084b0> adapter, C3084b0 b0Var, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.mo11616a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.mo11617b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.mo11619d(i, 1, (Object) null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.mo11620e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.mo11618c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.mo11619d(i, i2, (Object) null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.mo11620e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.mo11621f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.mo11621f(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(C3091i iVar) {
            this.mObservable.registerObserver(iVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.mo11622g();
        }

        public void unregisterAdapterDataObserver(C3091i iVar) {
            this.mObservable.unregisterObserver(iVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.mo11619d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.mo11619d(i, i2, obj);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public C3084b0 findViewHolderForPosition(int i, boolean z) {
        int h = this.mChildHelper.mo11852h();
        C3084b0 b0Var = null;
        for (int i2 = 0; i2 < h; i2++) {
            C3084b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.mo11851g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z) {
                    if (childViewHolderInt.mPosition != i) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i) {
                    continue;
                }
                if (!this.mChildHelper.mo11855k(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                b0Var = childViewHolderInt;
            }
        }
        return b0Var;
    }

    public void onExitLayoutOrScroll(boolean z) {
        int i = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i;
        if (i < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator) {
        smoothScrollBy(i, i2, interpolator, Integer.MIN_VALUE);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3080a();
        public Parcelable mLayoutState;

        /* renamed from: androidx.recyclerview.widget.RecyclerView$SavedState$a */
        public class C3080a implements Parcelable.ClassLoaderCreator<SavedState> {
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
            this.mLayoutState = parcel.readParcelable(classLoader == null ? C3100o.class.getClassLoader() : classLoader);
        }

        public void copyFrom(SavedState savedState) {
            this.mLayoutState = savedState.mLayoutState;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.mLayoutState, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        this.mObserver = new C3113w();
        this.mRecycler = new C3111u();
        this.mViewInfoStore = new C3160i0();
        this.mUpdateChildViewsRunnable = new C3081a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new C3093k();
        this.mItemAnimator = new C3150h();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new C3082a0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new C3181p.C3183b() : null;
        this.mState = new C3117y();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new C3098m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new C3083b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new C3086d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = viewConfiguration.getScaledHorizontalScrollFactor();
        this.mScaledVerticalScrollFactor = viewConfiguration.getScaledVerticalScrollFactor();
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.f7062a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2368d.m5213c(this) == 0) {
            C2364y.C2368d.m5229s(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new C3137d0(this));
        int[] iArr = C20203a.f44793w;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        C2364y.m5200o(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(8);
        if (obtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(PrimitiveArrayBuilder.MAX_CHUNK_SIZE);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(1, true);
        boolean z = obtainStyledAttributes.getBoolean(3, false);
        this.mEnableFastScroller = z;
        if (z) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(6), obtainStyledAttributes.getDrawable(7), (StateListDrawable) obtainStyledAttributes.getDrawable(4), obtainStyledAttributes.getDrawable(5));
        }
        obtainStyledAttributes.recycle();
        Context context3 = context;
        AttributeSet attributeSet3 = attributeSet;
        createLayoutManager(context3, string, attributeSet3, i, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i2, 0);
        C2364y.m5200o(this, context3, iArr2, attributeSet3, obtainStyledAttributes2, i);
        boolean z2 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return getScrollingChildHelper().mo8903c(i, i2, iArr, iArr2, i3);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return getScrollingChildHelper().mo8904d(i, i2, i3, i4, iArr, i5, (int[]) null);
    }

    public boolean hasNestedScrollingParent(int i) {
        return getScrollingChildHelper().mo8906f(i);
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3) {
        smoothScrollBy(i, i2, interpolator, i3, false);
    }

    public boolean startNestedScroll(int i, int i2) {
        return getScrollingChildHelper().mo8907g(i, i2);
    }

    public void stopNestedScroll(int i) {
        getScrollingChildHelper().mo8908h(i);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public final Rect mDecorInsets = new Rect();
        public boolean mInsetsDirty = true;
        public boolean mPendingInvalidate = false;
        public C3084b0 mViewHolder;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int getAbsoluteAdapterPosition() {
            return this.mViewHolder.getAbsoluteAdapterPosition();
        }

        public int getBindingAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        @Deprecated
        public int getViewAdapterPosition() {
            return this.mViewHolder.getBindingAdapterPosition();
        }

        public int getViewLayoutPosition() {
            return this.mViewHolder.getLayoutPosition();
        }

        @Deprecated
        public int getViewPosition() {
            return this.mViewHolder.getPosition();
        }

        public boolean isItemChanged() {
            return this.mViewHolder.isUpdated();
        }

        public boolean isItemRemoved() {
            return this.mViewHolder.isRemoved();
        }

        public boolean isViewInvalid() {
            return this.mViewHolder.isInvalid();
        }

        public boolean viewNeedsUpdate() {
            return this.mViewHolder.needsUpdate();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public void smoothScrollBy(int i, int i2, Interpolator interpolator, int i3, boolean z) {
        C3100o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i4 = 0;
            if (!oVar.mo11297f()) {
                i = 0;
            }
            if (!this.mLayout.mo11298g()) {
                i2 = 0;
            }
            if (i != 0 || i2 != 0) {
                if (i3 == Integer.MIN_VALUE || i3 > 0) {
                    if (z) {
                        if (i != 0) {
                            i4 = 1;
                        }
                        if (i2 != 0) {
                            i4 |= 2;
                        }
                        startNestedScroll(i4, 1);
                    }
                    this.mViewFlinger.mo11566b(i, i2, interpolator, i3);
                    return;
                }
                scrollBy(i, i2);
            }
        }
    }

    public final void dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().mo8904d(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public void addItemDecoration(C3099n nVar) {
        addItemDecoration(nVar, -1);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C3100o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.mo11256v(layoutParams);
        }
        throw new IllegalStateException(C0069a.m173d(this, C0072d.m201h("RecyclerView has no LayoutManager")));
    }
}
