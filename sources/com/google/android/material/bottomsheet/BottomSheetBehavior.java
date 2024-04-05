package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C2273a;
import androidx.core.view.C2330s0;
import androidx.core.view.C2348w0;
import androidx.core.view.C2364y;
import androidx.customview.view.AbsSavedState;
import com.etsy.android.R;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import com.google.android.material.internal.C15370j;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import kotlinx.coroutines.C19543e0;
import p088e1.C6689b;
import p088e1.C6697d;
import p123h1.C6916c;
import p507al.C14025c;
import p610kp.C18161c;

public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.C2245c<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = 2132018405;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    private static final int NO_MAX_SIZE = -1;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final String TAG = "BottomSheetBehavior";
    public int activePointerId;
    private final ArrayList<C15221f> callbacks = new ArrayList<>();
    private int childHeight;
    public int collapsedOffset;
    private final C6916c.C6919c dragCallback = new C15219d();
    /* access modifiers changed from: private */
    public boolean draggable = true;
    public float elevation = -1.0f;
    private int expandHalfwayActionId = -1;
    public int expandedOffset;
    /* access modifiers changed from: private */
    public boolean fitToContents = true;
    public int fitToContentsOffset;
    /* access modifiers changed from: private */
    public int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    public int halfExpandedOffset;
    public float halfExpandedRatio = 0.5f;
    public boolean hideable;
    private boolean ignoreEvents;
    private Map<View, Integer> importantForAccessibilityMap;
    private int initialY;
    /* access modifiers changed from: private */
    public int insetBottom;
    /* access modifiers changed from: private */
    public int insetTop;
    private ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    public int lastStableState = 4;
    /* access modifiers changed from: private */
    public MaterialShapeDrawable materialShapeDrawable;
    private int maxHeight = -1;
    private int maxWidth = -1;
    private float maximumVelocity;
    private boolean nestedScrolled;
    public WeakReference<View> nestedScrollingChildRef;
    /* access modifiers changed from: private */
    public boolean paddingBottomSystemWindowInsets;
    /* access modifiers changed from: private */
    public boolean paddingLeftSystemWindowInsets;
    /* access modifiers changed from: private */
    public boolean paddingRightSystemWindowInsets;
    private boolean paddingTopSystemWindowInsets;
    public int parentHeight;
    public int parentWidth;
    /* access modifiers changed from: private */
    public int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags = 0;
    private BottomSheetBehavior<V>.g settleRunnable = null;
    private C15401a shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    /* access modifiers changed from: private */
    public boolean skipCollapsed;
    public int state = 4;
    public boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings = false;
    private VelocityTracker velocityTracker;
    public C6916c viewDragHelper;
    public WeakReference<V> viewRef;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C15215a();
        public boolean fitToContents;
        public boolean hideable;
        public int peekHeight;
        public boolean skipCollapsed;
        public final int state;

        /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$a */
        public static class C15215a implements Parcelable.ClassLoaderCreator<SavedState> {
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

        public SavedState(Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.state);
            parcel.writeInt(this.peekHeight);
            parcel.writeInt(this.fitToContents ? 1 : 0);
            parcel.writeInt(this.hideable ? 1 : 0);
            parcel.writeInt(this.skipCollapsed ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.state = parcel.readInt();
            this.peekHeight = parcel.readInt();
            boolean z = false;
            this.fitToContents = parcel.readInt() == 1;
            this.hideable = parcel.readInt() == 1;
            this.skipCollapsed = parcel.readInt() == 1 ? true : z;
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.state = bottomSheetBehavior.state;
            this.peekHeight = bottomSheetBehavior.peekHeight;
            this.fitToContents = bottomSheetBehavior.fitToContents;
            this.hideable = bottomSheetBehavior.hideable;
            this.skipCollapsed = bottomSheetBehavior.skipCollapsed;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i) {
            super(parcelable);
            this.state = i;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$a */
    public class C15216a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ View f34141b;

        /* renamed from: c */
        public final /* synthetic */ int f34142c;

        public C15216a(View view, int i) {
            this.f34141b = view;
            this.f34142c = i;
        }

        public final void run() {
            BottomSheetBehavior.this.settleToState(this.f34141b, this.f34142c);
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$b */
    public class C15217b implements ValueAnimator.AnimatorUpdateListener {
        public C15217b() {
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.materialShapeDrawable != null) {
                BottomSheetBehavior.this.materialShapeDrawable.setInterpolation(floatValue);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$c */
    public class C15218c implements C15370j.C15372b {

        /* renamed from: a */
        public final /* synthetic */ boolean f34145a;

        public C15218c(boolean z) {
            this.f34145a = z;
        }

        /* renamed from: a */
        public final C2348w0 mo53146a(View view, C2348w0 w0Var, C15370j.C15373c cVar) {
            int unused = BottomSheetBehavior.this.insetTop = w0Var.mo8948g();
            boolean d = C15370j.m24963d(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets) {
                int unused2 = BottomSheetBehavior.this.insetBottom = w0Var.mo8944d();
                paddingBottom = cVar.f34525d + BottomSheetBehavior.this.insetBottom;
            }
            if (BottomSheetBehavior.this.paddingLeftSystemWindowInsets) {
                paddingLeft = (d ? cVar.f34524c : cVar.f34522a) + w0Var.mo8945e();
            }
            if (BottomSheetBehavior.this.paddingRightSystemWindowInsets) {
                paddingRight = w0Var.mo8947f() + (d ? cVar.f34522a : cVar.f34524c);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f34145a) {
                int unused3 = BottomSheetBehavior.this.gestureInsetBottom = w0Var.f5615a.mo8981h().f18323d;
            }
            if (BottomSheetBehavior.this.paddingBottomSystemWindowInsets || this.f34145a) {
                BottomSheetBehavior.this.updatePeekHeight(false);
            }
            return w0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$d */
    public class C15219d extends C6916c.C6919c {

        /* renamed from: a */
        public long f34147a;

        public C15219d() {
        }

        /* renamed from: a */
        public final int mo10012a(View view, int i) {
            return view.getLeft();
        }

        /* renamed from: b */
        public final int mo10013b(View view, int i) {
            int expandedOffset = BottomSheetBehavior.this.getExpandedOffset();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return C19543e0.m33285A(i, expandedOffset, bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset);
        }

        /* renamed from: d */
        public final int mo19062d() {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return bottomSheetBehavior.hideable ? bottomSheetBehavior.parentHeight : bottomSheetBehavior.collapsedOffset;
        }

        /* renamed from: h */
        public final void mo10018h(int i) {
            if (i == 1 && BottomSheetBehavior.this.draggable) {
                BottomSheetBehavior.this.setStateInternal(1);
            }
        }

        /* renamed from: i */
        public final void mo10019i(View view, int i, int i2) {
            BottomSheetBehavior.this.dispatchOnSlide(i2);
        }

        /* renamed from: j */
        public final void mo10020j(float f, float f2, View view) {
            int i;
            int i2;
            int i3;
            int i4 = 6;
            if (f2 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.hideable && bottomSheetBehavior.shouldHide(view, f2)) {
                    if (Math.abs(f) >= Math.abs(f2) || f2 <= 500.0f) {
                        int top = view.getTop();
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        if (!(top > (bottomSheetBehavior2.getExpandedOffset() + bottomSheetBehavior2.parentHeight) / 2)) {
                            if (BottomSheetBehavior.this.fitToContents) {
                                i2 = BottomSheetBehavior.this.fitToContentsOffset;
                            } else if (Math.abs(view.getTop() - BottomSheetBehavior.this.getExpandedOffset()) < Math.abs(view.getTop() - BottomSheetBehavior.this.halfExpandedOffset)) {
                                i2 = BottomSheetBehavior.this.getExpandedOffset();
                            } else {
                                i = BottomSheetBehavior.this.halfExpandedOffset;
                                BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                                bottomSheetBehavior3.startSettlingAnimation(view, i4, i, bottomSheetBehavior3.shouldSkipSmoothAnimation());
                            }
                        }
                    }
                    i = BottomSheetBehavior.this.parentHeight;
                    i4 = 5;
                    BottomSheetBehavior bottomSheetBehavior32 = BottomSheetBehavior.this;
                    bottomSheetBehavior32.startSettlingAnimation(view, i4, i, bottomSheetBehavior32.shouldSkipSmoothAnimation());
                } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                    int top2 = view.getTop();
                    if (!BottomSheetBehavior.this.fitToContents) {
                        BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
                        int i5 = bottomSheetBehavior4.halfExpandedOffset;
                        if (top2 >= i5) {
                            if (Math.abs(top2 - i5) >= Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                                i3 = BottomSheetBehavior.this.collapsedOffset;
                            } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                                i3 = BottomSheetBehavior.this.collapsedOffset;
                            } else {
                                i = BottomSheetBehavior.this.halfExpandedOffset;
                                BottomSheetBehavior bottomSheetBehavior322 = BottomSheetBehavior.this;
                                bottomSheetBehavior322.startSettlingAnimation(view, i4, i, bottomSheetBehavior322.shouldSkipSmoothAnimation());
                            }
                            i4 = 4;
                            i = i2;
                            BottomSheetBehavior bottomSheetBehavior3222 = BottomSheetBehavior.this;
                            bottomSheetBehavior3222.startSettlingAnimation(view, i4, i, bottomSheetBehavior3222.shouldSkipSmoothAnimation());
                        } else if (top2 < Math.abs(top2 - bottomSheetBehavior4.collapsedOffset)) {
                            i2 = BottomSheetBehavior.this.getExpandedOffset();
                        } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i3 = BottomSheetBehavior.this.collapsedOffset;
                            i4 = 4;
                            i = i2;
                            BottomSheetBehavior bottomSheetBehavior32222 = BottomSheetBehavior.this;
                            bottomSheetBehavior32222.startSettlingAnimation(view, i4, i, bottomSheetBehavior32222.shouldSkipSmoothAnimation());
                        } else {
                            i = BottomSheetBehavior.this.halfExpandedOffset;
                            BottomSheetBehavior bottomSheetBehavior322222 = BottomSheetBehavior.this;
                            bottomSheetBehavior322222.startSettlingAnimation(view, i4, i, bottomSheetBehavior322222.shouldSkipSmoothAnimation());
                        }
                    } else if (Math.abs(top2 - BottomSheetBehavior.this.fitToContentsOffset) < Math.abs(top2 - BottomSheetBehavior.this.collapsedOffset)) {
                        i2 = BottomSheetBehavior.this.fitToContentsOffset;
                    } else {
                        i3 = BottomSheetBehavior.this.collapsedOffset;
                        i4 = 4;
                        i = i2;
                        BottomSheetBehavior bottomSheetBehavior3222222 = BottomSheetBehavior.this;
                        bottomSheetBehavior3222222.startSettlingAnimation(view, i4, i, bottomSheetBehavior3222222.shouldSkipSmoothAnimation());
                    }
                } else {
                    if (BottomSheetBehavior.this.fitToContents) {
                        i3 = BottomSheetBehavior.this.collapsedOffset;
                    } else {
                        int top3 = view.getTop();
                        if (Math.abs(top3 - BottomSheetBehavior.this.halfExpandedOffset) >= Math.abs(top3 - BottomSheetBehavior.this.collapsedOffset)) {
                            i3 = BottomSheetBehavior.this.collapsedOffset;
                        } else if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                            i3 = BottomSheetBehavior.this.collapsedOffset;
                        } else {
                            i = BottomSheetBehavior.this.halfExpandedOffset;
                            BottomSheetBehavior bottomSheetBehavior32222222 = BottomSheetBehavior.this;
                            bottomSheetBehavior32222222.startSettlingAnimation(view, i4, i, bottomSheetBehavior32222222.shouldSkipSmoothAnimation());
                        }
                    }
                    i4 = 4;
                    i = i2;
                    BottomSheetBehavior bottomSheetBehavior322222222 = BottomSheetBehavior.this;
                    bottomSheetBehavior322222222.startSettlingAnimation(view, i4, i, bottomSheetBehavior322222222.shouldSkipSmoothAnimation());
                }
            } else if (BottomSheetBehavior.this.fitToContents) {
                i2 = BottomSheetBehavior.this.fitToContentsOffset;
            } else {
                int top4 = view.getTop();
                long currentTimeMillis = System.currentTimeMillis() - this.f34147a;
                if (BottomSheetBehavior.this.shouldSkipHalfExpandedStateWhenDragging()) {
                    BottomSheetBehavior bottomSheetBehavior5 = BottomSheetBehavior.this;
                    if (bottomSheetBehavior5.shouldExpandOnUpwardDrag(currentTimeMillis, (((float) top4) * 100.0f) / ((float) bottomSheetBehavior5.parentHeight))) {
                        i2 = BottomSheetBehavior.this.expandedOffset;
                    } else {
                        i3 = BottomSheetBehavior.this.collapsedOffset;
                        i4 = 4;
                        i = i2;
                        BottomSheetBehavior bottomSheetBehavior3222222222 = BottomSheetBehavior.this;
                        bottomSheetBehavior3222222222.startSettlingAnimation(view, i4, i, bottomSheetBehavior3222222222.shouldSkipSmoothAnimation());
                    }
                } else {
                    BottomSheetBehavior bottomSheetBehavior6 = BottomSheetBehavior.this;
                    i = bottomSheetBehavior6.halfExpandedOffset;
                    if (top4 <= i) {
                        i2 = bottomSheetBehavior6.getExpandedOffset();
                    }
                    BottomSheetBehavior bottomSheetBehavior32222222222 = BottomSheetBehavior.this;
                    bottomSheetBehavior32222222222.startSettlingAnimation(view, i4, i, bottomSheetBehavior32222222222.shouldSkipSmoothAnimation());
                }
            }
            i4 = 3;
            i = i2;
            BottomSheetBehavior bottomSheetBehavior322222222222 = BottomSheetBehavior.this;
            bottomSheetBehavior322222222222.startSettlingAnimation(view, i4, i, bottomSheetBehavior322222222222.shouldSkipSmoothAnimation());
        }

        /* renamed from: k */
        public final boolean mo10021k(int i, View view) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i2 = bottomSheetBehavior.state;
            if (i2 == 1 || bottomSheetBehavior.touchingScrollingChild) {
                return false;
            }
            if (i2 == 3 && bottomSheetBehavior.activePointerId == i) {
                WeakReference<View> weakReference = bottomSheetBehavior.nestedScrollingChildRef;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f34147a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.viewRef;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$e */
    public class C15220e implements C6697d {

        /* renamed from: a */
        public final /* synthetic */ int f34149a;

        public C15220e(int i) {
            this.f34149a = i;
        }

        /* renamed from: a */
        public final boolean mo10006a(View view) {
            BottomSheetBehavior.this.setState(this.f34149a);
            return true;
        }
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$f */
    public static abstract class C15221f {
        public abstract void onSlide(View view, float f);

        public abstract void onStateChanged(View view, int i);
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$g */
    public class C15222g implements Runnable {

        /* renamed from: b */
        public final View f34151b;

        /* renamed from: c */
        public boolean f34152c;

        /* renamed from: d */
        public int f34153d;

        public C15222g(View view, int i) {
            this.f34151b = view;
            this.f34153d = i;
        }

        public final void run() {
            C6916c cVar = BottomSheetBehavior.this.viewDragHelper;
            if (cVar == null || !cVar.mo19046h()) {
                BottomSheetBehavior.this.setStateInternal(this.f34153d);
            } else {
                View view = this.f34151b;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5223m(view, this);
            }
            this.f34152c = false;
        }
    }

    public BottomSheetBehavior() {
    }

    private int addAccessibilityActionForState(V v, int i, int i2) {
        int i3;
        String string = v.getResources().getString(i);
        C6697d createAccessibilityViewCommandForState = createAccessibilityViewCommandForState(i2);
        ArrayList f = C2364y.m5191f(v);
        int i4 = 0;
        while (true) {
            if (i4 >= f.size()) {
                int i5 = 0;
                int i6 = -1;
                while (true) {
                    int[] iArr = C2364y.f5649d;
                    if (i5 >= iArr.length || i6 != -1) {
                        i3 = i6;
                    } else {
                        int i7 = iArr[i5];
                        boolean z = true;
                        for (int i8 = 0; i8 < f.size(); i8++) {
                            z &= ((C6689b.C6690a) f.get(i8)).mo18875a() != i7;
                        }
                        if (z) {
                            i6 = i7;
                        }
                        i5++;
                    }
                }
                i3 = i6;
            } else if (TextUtils.equals(string, ((C6689b.C6690a) f.get(i4)).mo18876b())) {
                i3 = ((C6689b.C6690a) f.get(i4)).mo18875a();
                break;
            } else {
                i4++;
            }
        }
        if (i3 != -1) {
            C6689b.C6690a aVar = new C6689b.C6690a((Object) null, i3, string, createAccessibilityViewCommandForState, (Class<? extends C6697d.C6698a>) null);
            C2273a d = C2364y.m5189d(v);
            if (d == null) {
                d = new C2273a();
            }
            C2364y.m5201p(v, d);
            C2364y.m5198m(aVar.mo18875a(), v);
            C2364y.m5191f(v).add(aVar);
            C2364y.m5195j(0, v);
        }
        return i3;
    }

    private void calculateCollapsedOffset() {
        int calculatePeekHeight = calculatePeekHeight();
        if (this.fitToContents) {
            this.collapsedOffset = Math.max(this.parentHeight - calculatePeekHeight, this.fitToContentsOffset);
        } else {
            this.collapsedOffset = this.parentHeight - calculatePeekHeight;
        }
    }

    private void calculateHalfExpandedOffset() {
        this.halfExpandedOffset = (int) ((1.0f - this.halfExpandedRatio) * ((float) this.parentHeight));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        r0 = r3.gestureInsetBottom;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int calculatePeekHeight() {
        /*
            r3 = this;
            boolean r0 = r3.peekHeightAuto
            if (r0 == 0) goto L_0x001d
            int r0 = r3.peekHeightMin
            int r1 = r3.parentHeight
            int r2 = r3.parentWidth
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.childHeight
            int r0 = java.lang.Math.min(r0, r1)
            int r1 = r3.insetBottom
            int r0 = r0 + r1
            return r0
        L_0x001d:
            boolean r0 = r3.gestureInsetBottomIgnored
            if (r0 != 0) goto L_0x0033
            boolean r0 = r3.paddingBottomSystemWindowInsets
            if (r0 != 0) goto L_0x0033
            int r0 = r3.gestureInsetBottom
            if (r0 <= 0) goto L_0x0033
            int r1 = r3.peekHeight
            int r2 = r3.peekHeightGestureInsetBuffer
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L_0x0033:
            int r0 = r3.peekHeight
            int r1 = r3.insetBottom
            int r0 = r0 + r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.calculatePeekHeight():int");
    }

    private C6697d createAccessibilityViewCommandForState(int i) {
        return new C15220e(i);
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z) {
        createMaterialShapeDrawable(context, attributeSet, z, (ColorStateList) null);
    }

    private void createShapeValueAnimator() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.interpolatorAnimator = ofFloat;
        ofFloat.setDuration(500);
        this.interpolatorAnimator.addUpdateListener(new C15217b());
    }

    public static <V extends View> BottomSheetBehavior<V> from(V v) {
        ViewGroup.LayoutParams layoutParams = v.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.C2245c behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof BottomSheetBehavior) {
                return (BottomSheetBehavior) behavior;
            }
            throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    private int getChildMeasureSpec(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
        }
        if (size != 0) {
            i3 = Math.min(size, i3);
        }
        return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
    }

    private float getYVelocity() {
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 == null) {
            return 0.0f;
        }
        velocityTracker2.computeCurrentVelocity(1000, this.maximumVelocity);
        return this.velocityTracker.getYVelocity(this.activePointerId);
    }

    private void replaceAccessibilityActionForState(V v, C6689b.C6690a aVar, int i) {
        C2364y.m5199n(v, aVar, createAccessibilityViewCommandForState(i));
    }

    private void reset() {
        this.activePointerId = -1;
        VelocityTracker velocityTracker2 = this.velocityTracker;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.velocityTracker = null;
        }
    }

    private void restoreOptionalState(SavedState savedState) {
        int i = this.saveFlags;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.peekHeight = savedState.peekHeight;
            }
            if (i == -1 || (i & 2) == 2) {
                this.fitToContents = savedState.fitToContents;
            }
            if (i == -1 || (i & 4) == 4) {
                this.hideable = savedState.hideable;
            }
            if (i == -1 || (i & 8) == 8) {
                this.skipCollapsed = savedState.skipCollapsed;
            }
        }
    }

    private void setWindowInsetsListener(View view) {
        boolean z = Build.VERSION.SDK_INT >= 29 && !isGestureInsetBottomIgnored() && !this.peekHeightAuto;
        if (this.paddingBottomSystemWindowInsets || this.paddingLeftSystemWindowInsets || this.paddingRightSystemWindowInsets || z) {
            C15370j.m24960a(view, new C15218c(z));
        }
    }

    private void settleToStatePendingLayout(int i) {
        View view = (View) this.viewRef.get();
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent != null && parent.isLayoutRequested()) {
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                if (C2364y.C2371g.m5245b(view)) {
                    view.post(new C15216a(view, i));
                    return;
                }
            }
            settleToState(view, i);
        }
    }

    private boolean shouldHandleDraggingWithHelper() {
        return this.viewDragHelper != null && (this.draggable || this.state == 1);
    }

    private void updateAccessibilityActions() {
        View view;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            C2364y.m5198m(524288, view);
            C2364y.m5195j(0, view);
            C2364y.m5198m(PrimitiveArrayBuilder.MAX_CHUNK_SIZE, view);
            C2364y.m5195j(0, view);
            C2364y.m5198m(1048576, view);
            C2364y.m5195j(0, view);
            int i = this.expandHalfwayActionId;
            if (i != -1) {
                C2364y.m5198m(i, view);
                C2364y.m5195j(0, view);
            }
            int i2 = 6;
            if (!this.fitToContents && this.state != 6) {
                this.expandHalfwayActionId = addAccessibilityActionForState(view, R.string.bottomsheet_action_expand_halfway, 6);
            }
            if (this.hideable && this.state != 5) {
                replaceAccessibilityActionForState(view, C6689b.C6690a.f14772o, 5);
            }
            int i3 = this.state;
            if (i3 == 3) {
                if (this.fitToContents) {
                    i2 = 4;
                }
                replaceAccessibilityActionForState(view, C6689b.C6690a.f14771n, i2);
            } else if (i3 == 4) {
                if (this.fitToContents) {
                    i2 = 3;
                }
                replaceAccessibilityActionForState(view, C6689b.C6690a.f14770m, i2);
            } else if (i3 == 6) {
                replaceAccessibilityActionForState(view, C6689b.C6690a.f14771n, 4);
                replaceAccessibilityActionForState(view, C6689b.C6690a.f14770m, 3);
            }
        }
    }

    private void updateDrawableForTargetState(int i) {
        ValueAnimator valueAnimator;
        if (i != 2) {
            boolean z = i == 3;
            if (this.isShapeExpanded != z) {
                this.isShapeExpanded = z;
                if (this.materialShapeDrawable != null && (valueAnimator = this.interpolatorAnimator) != null) {
                    if (valueAnimator.isRunning()) {
                        this.interpolatorAnimator.reverse();
                        return;
                    }
                    float f = z ? 0.0f : 1.0f;
                    this.interpolatorAnimator.setFloatValues(new float[]{1.0f - f, f});
                    this.interpolatorAnimator.start();
                }
            }
        }
    }

    private void updateImportantForAccessibility(boolean z) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.viewRef;
        if (weakReference != null) {
            ViewParent parent = ((View) weakReference.get()).getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                int childCount = coordinatorLayout.getChildCount();
                if (z) {
                    if (this.importantForAccessibilityMap == null) {
                        this.importantForAccessibilityMap = new HashMap(childCount);
                    } else {
                        return;
                    }
                }
                for (int i = 0; i < childCount; i++) {
                    V childAt = coordinatorLayout.getChildAt(i);
                    if (childAt != this.viewRef.get()) {
                        if (z) {
                            this.importantForAccessibilityMap.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                            if (this.updateImportantForAccessibilityOnSiblings) {
                                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                                C2364y.C2368d.m5229s(childAt, 4);
                            }
                        } else if (this.updateImportantForAccessibilityOnSiblings && (map = this.importantForAccessibilityMap) != null && map.containsKey(childAt)) {
                            int intValue = this.importantForAccessibilityMap.get(childAt).intValue();
                            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                            C2364y.C2368d.m5229s(childAt, intValue);
                        }
                    }
                }
                if (!z) {
                    this.importantForAccessibilityMap = null;
                } else if (this.updateImportantForAccessibilityOnSiblings) {
                    ((View) this.viewRef.get()).sendAccessibilityEvent(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void updatePeekHeight(boolean z) {
        View view;
        if (this.viewRef != null) {
            calculateCollapsedOffset();
            if (this.state == 4 && (view = (View) this.viewRef.get()) != null) {
                if (z) {
                    settleToStatePendingLayout(this.state);
                } else {
                    view.requestLayout();
                }
            }
        }
    }

    public void addBottomSheetCallback(C15221f fVar) {
        if (!this.callbacks.contains(fVar)) {
            this.callbacks.add(fVar);
        }
    }

    public void disableShapeAnimations() {
        this.interpolatorAnimator = null;
    }

    public void dispatchOnSlide(int i) {
        float f;
        float f2;
        View view = (View) this.viewRef.get();
        if (view != null && !this.callbacks.isEmpty()) {
            int i2 = this.collapsedOffset;
            if (i > i2 || i2 == getExpandedOffset()) {
                int i3 = this.collapsedOffset;
                f = (float) (i3 - i);
                f2 = (float) (this.parentHeight - i3);
            } else {
                int i4 = this.collapsedOffset;
                f = (float) (i4 - i);
                f2 = (float) (i4 - getExpandedOffset());
            }
            float f3 = f / f2;
            for (int i5 = 0; i5 < this.callbacks.size(); i5++) {
                this.callbacks.get(i5).onSlide(view, f3);
            }
        }
    }

    public View findScrollingChild(View view) {
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2373i.m5269p(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View findScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (findScrollingChild != null) {
                return findScrollingChild;
            }
        }
        return null;
    }

    public int getExpandedOffset() {
        if (this.fitToContents) {
            return this.fitToContentsOffset;
        }
        return Math.max(this.expandedOffset, this.paddingTopSystemWindowInsets ? 0 : this.insetTop);
    }

    public float getHalfExpandedRatio() {
        return this.halfExpandedRatio;
    }

    public int getLastStableState() {
        return this.lastStableState;
    }

    public MaterialShapeDrawable getMaterialShapeDrawable() {
        return this.materialShapeDrawable;
    }

    public int getMaxHeight() {
        return this.maxHeight;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getPeekHeight() {
        if (this.peekHeightAuto) {
            return -1;
        }
        return this.peekHeight;
    }

    public int getPeekHeightMin() {
        return this.peekHeightMin;
    }

    public int getSaveFlags() {
        return this.saveFlags;
    }

    public boolean getSkipCollapsed() {
        return this.skipCollapsed;
    }

    public int getState() {
        return this.state;
    }

    public boolean isDraggable() {
        return this.draggable;
    }

    public boolean isFitToContents() {
        return this.fitToContents;
    }

    public boolean isGestureInsetBottomIgnored() {
        return this.gestureInsetBottomIgnored;
    }

    public boolean isHideable() {
        return this.hideable;
    }

    public boolean isNestedScrollingCheckEnabled() {
        return true;
    }

    public void onAttachedToLayoutParams(CoordinatorLayout.LayoutParams layoutParams) {
        super.onAttachedToLayoutParams(layoutParams);
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    public void onDetachedFromLayoutParams() {
        super.onDetachedFromLayoutParams();
        this.viewRef = null;
        this.viewDragHelper = null;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C6916c cVar;
        if (!v.isShown() || !this.draggable) {
            this.ignoreEvents = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        View view = null;
        if (actionMasked == 0) {
            int x = (int) motionEvent.getX();
            this.initialY = (int) motionEvent.getY();
            if (this.state != 2) {
                WeakReference<View> weakReference = this.nestedScrollingChildRef;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && coordinatorLayout.isPointInChildBounds(view2, x, this.initialY)) {
                    this.activePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.touchingScrollingChild = true;
                }
            }
            this.ignoreEvents = this.activePointerId == -1 && !coordinatorLayout.isPointInChildBounds(v, x, this.initialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.touchingScrollingChild = false;
            this.activePointerId = -1;
            if (this.ignoreEvents) {
                this.ignoreEvents = false;
                return false;
            }
        }
        if (!this.ignoreEvents && (cVar = this.viewDragHelper) != null && cVar.mo19057u(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.nestedScrollingChildRef;
        if (weakReference2 != null) {
            view = weakReference2.get();
        }
        return actionMasked == 2 && view != null && !this.ignoreEvents && this.state != 1 && !coordinatorLayout.isPointInChildBounds(view, (int) motionEvent.getX(), (int) motionEvent.getY()) && this.viewDragHelper != null && Math.abs(((float) this.initialY) - motionEvent.getY()) > ((float) this.viewDragHelper.f15309b);
    }

    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        MaterialShapeDrawable materialShapeDrawable2;
        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
        if (C2364y.C2368d.m5212b(coordinatorLayout) && !C2364y.C2368d.m5212b(v)) {
            v.setFitsSystemWindows(true);
        }
        if (this.viewRef == null) {
            this.peekHeightMin = coordinatorLayout.getResources().getDimensionPixelSize(R.dimen.design_bottom_sheet_peek_height_min);
            setWindowInsetsListener(v);
            this.viewRef = new WeakReference<>(v);
            if (this.shapeThemingEnabled && (materialShapeDrawable2 = this.materialShapeDrawable) != null) {
                C2364y.C2368d.m5227q(v, materialShapeDrawable2);
            }
            MaterialShapeDrawable materialShapeDrawable3 = this.materialShapeDrawable;
            if (materialShapeDrawable3 != null) {
                float f = this.elevation;
                if (f == -1.0f) {
                    f = C2364y.C2373i.m5262i(v);
                }
                materialShapeDrawable3.setElevation(f);
                boolean z = this.state == 3;
                this.isShapeExpanded = z;
                this.materialShapeDrawable.setInterpolation(z ? 0.0f : 1.0f);
            }
            updateAccessibilityActions();
            if (C2364y.C2368d.m5213c(v) == 0) {
                C2364y.C2368d.m5229s(v, 1);
            }
        }
        if (this.viewDragHelper == null) {
            this.viewDragHelper = new C6916c(coordinatorLayout.getContext(), coordinatorLayout, this.dragCallback);
        }
        int top = v.getTop();
        coordinatorLayout.onLayoutChild(v, i);
        this.parentWidth = coordinatorLayout.getWidth();
        this.parentHeight = coordinatorLayout.getHeight();
        int height = v.getHeight();
        this.childHeight = height;
        int i2 = this.parentHeight;
        int i3 = i2 - height;
        int i4 = this.insetTop;
        if (i3 < i4) {
            if (this.paddingTopSystemWindowInsets) {
                this.childHeight = i2;
            } else {
                this.childHeight = i2 - i4;
            }
        }
        this.fitToContentsOffset = Math.max(0, i2 - this.childHeight);
        calculateHalfExpandedOffset();
        calculateCollapsedOffset();
        int i5 = this.state;
        if (i5 == 3) {
            v.offsetTopAndBottom(getExpandedOffset());
        } else if (i5 == 6) {
            v.offsetTopAndBottom(this.halfExpandedOffset);
        } else if (this.hideable && i5 == 5) {
            v.offsetTopAndBottom(this.parentHeight);
        } else if (i5 == 4) {
            v.offsetTopAndBottom(this.collapsedOffset);
        } else if (i5 == 1 || i5 == 2) {
            v.offsetTopAndBottom(top - v.getTop());
        }
        this.nestedScrollingChildRef = new WeakReference<>(findScrollingChild(v));
        return true;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
        v.measure(getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.maxWidth, marginLayoutParams.width), getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i4, this.maxHeight, marginLayoutParams.height));
        return true;
    }

    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        WeakReference<View> weakReference;
        if (!isNestedScrollingCheckEnabled() || (weakReference = this.nestedScrollingChildRef) == null || view != weakReference.get()) {
            return false;
        }
        return this.state != 3 || super.onNestedPreFling(coordinatorLayout, v, view, f, f2);
    }

    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr, int i3) {
        if (i3 != 1) {
            WeakReference<View> weakReference = this.nestedScrollingChildRef;
            View view2 = weakReference != null ? weakReference.get() : null;
            if (!isNestedScrollingCheckEnabled() || view == view2) {
                int top = v.getTop();
                int i4 = top - i2;
                if (i2 > 0) {
                    if (i4 < getExpandedOffset()) {
                        int expandedOffset2 = top - getExpandedOffset();
                        iArr[1] = expandedOffset2;
                        int i5 = -expandedOffset2;
                        WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                        v.offsetTopAndBottom(i5);
                        setStateInternal(3);
                    } else if (this.draggable) {
                        iArr[1] = i2;
                        WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
                        v.offsetTopAndBottom(-i2);
                        setStateInternal(1);
                    } else {
                        return;
                    }
                } else if (i2 < 0 && !view.canScrollVertically(-1)) {
                    int i6 = this.collapsedOffset;
                    if (i4 > i6 && !this.hideable) {
                        int i7 = top - i6;
                        iArr[1] = i7;
                        int i8 = -i7;
                        WeakHashMap<View, C2330s0> weakHashMap3 = C2364y.f5646a;
                        v.offsetTopAndBottom(i8);
                        setStateInternal(4);
                    } else if (this.draggable) {
                        iArr[1] = i2;
                        WeakHashMap<View, C2330s0> weakHashMap4 = C2364y.f5646a;
                        v.offsetTopAndBottom(-i2);
                        setStateInternal(1);
                    } else {
                        return;
                    }
                }
                dispatchOnSlide(v.getTop());
                this.lastNestedScrollDy = i2;
                this.nestedScrolled = true;
            }
        }
    }

    public void onNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    public void onRestoreInstanceState(CoordinatorLayout coordinatorLayout, V v, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(coordinatorLayout, v, savedState.getSuperState());
        restoreOptionalState(savedState);
        int i = savedState.state;
        if (i == 1 || i == 2) {
            this.state = 4;
            this.lastStableState = 4;
            return;
        }
        this.state = i;
        this.lastStableState = i;
    }

    public Parcelable onSaveInstanceState(CoordinatorLayout coordinatorLayout, V v) {
        return new SavedState(super.onSaveInstanceState(coordinatorLayout, v), (BottomSheetBehavior<?>) this);
    }

    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        this.lastNestedScrollDy = 0;
        this.nestedScrolled = false;
        return (i & 2) != 0;
    }

    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V v, View view, int i) {
        int i2;
        int i3;
        WeakReference<View> weakReference;
        int i4 = 3;
        if (v.getTop() == getExpandedOffset()) {
            setStateInternal(3);
        } else if (!isNestedScrollingCheckEnabled() || ((weakReference = this.nestedScrollingChildRef) != null && view == weakReference.get() && this.nestedScrolled)) {
            if (this.lastNestedScrollDy > 0) {
                if (this.fitToContents) {
                    i2 = this.fitToContentsOffset;
                } else {
                    int top = v.getTop();
                    int i5 = this.halfExpandedOffset;
                    if (top > i5) {
                        i4 = 6;
                        i2 = i5;
                    } else {
                        i2 = getExpandedOffset();
                    }
                }
            } else if (!this.hideable || !shouldHide(v, getYVelocity())) {
                if (this.lastNestedScrollDy == 0) {
                    int top2 = v.getTop();
                    if (!this.fitToContents) {
                        int i6 = this.halfExpandedOffset;
                        if (top2 < i6) {
                            if (top2 < Math.abs(top2 - this.collapsedOffset)) {
                                i2 = getExpandedOffset();
                            } else if (shouldSkipHalfExpandedStateWhenDragging()) {
                                i3 = this.collapsedOffset;
                            } else {
                                i2 = this.halfExpandedOffset;
                                i4 = 6;
                            }
                        } else if (Math.abs(top2 - i6) < Math.abs(top2 - this.collapsedOffset)) {
                            i2 = this.halfExpandedOffset;
                            i4 = 6;
                        } else {
                            i3 = this.collapsedOffset;
                        }
                    } else if (Math.abs(top2 - this.fitToContentsOffset) < Math.abs(top2 - this.collapsedOffset)) {
                        i2 = this.fitToContentsOffset;
                    } else {
                        i3 = this.collapsedOffset;
                    }
                } else if (this.fitToContents) {
                    i3 = this.collapsedOffset;
                } else {
                    int top3 = v.getTop();
                    if (Math.abs(top3 - this.halfExpandedOffset) < Math.abs(top3 - this.collapsedOffset)) {
                        i2 = this.halfExpandedOffset;
                        i4 = 6;
                    } else {
                        i3 = this.collapsedOffset;
                    }
                }
                i4 = 4;
            } else {
                i2 = this.parentHeight;
                i4 = 5;
            }
            startSettlingAnimation(v, i4, i2, false);
            this.nestedScrolled = false;
        }
    }

    public boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        if (!v.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.state == 1 && actionMasked == 0) {
            return true;
        }
        if (shouldHandleDraggingWithHelper()) {
            this.viewDragHelper.mo19050n(motionEvent);
        }
        if (actionMasked == 0) {
            reset();
        }
        if (this.velocityTracker == null) {
            this.velocityTracker = VelocityTracker.obtain();
        }
        this.velocityTracker.addMovement(motionEvent);
        if (shouldHandleDraggingWithHelper() && actionMasked == 2 && !this.ignoreEvents) {
            float abs = Math.abs(((float) this.initialY) - motionEvent.getY());
            C6916c cVar = this.viewDragHelper;
            if (abs > ((float) cVar.f15309b)) {
                cVar.mo19041c(motionEvent.getPointerId(motionEvent.getActionIndex()), v);
            }
        }
        return !this.ignoreEvents;
    }

    public void removeBottomSheetCallback(C15221f fVar) {
        this.callbacks.remove(fVar);
    }

    @Deprecated
    public void setBottomSheetCallback(C15221f fVar) {
        Log.w(TAG, "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
        this.callbacks.clear();
        if (fVar != null) {
            this.callbacks.add(fVar);
        }
    }

    public void setDraggable(boolean z) {
        this.draggable = z;
    }

    public void setExpandedOffset(int i) {
        if (i >= 0) {
            this.expandedOffset = i;
            return;
        }
        throw new IllegalArgumentException("offset must be greater than or equal to 0");
    }

    public void setFitToContents(boolean z) {
        if (this.fitToContents != z) {
            this.fitToContents = z;
            if (this.viewRef != null) {
                calculateCollapsedOffset();
            }
            setStateInternal((!this.fitToContents || this.state != 6) ? this.state : 3);
            updateAccessibilityActions();
        }
    }

    public void setGestureInsetBottomIgnored(boolean z) {
        this.gestureInsetBottomIgnored = z;
    }

    public void setHalfExpandedRatio(float f) {
        if (f <= 0.0f || f >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.halfExpandedRatio = f;
        if (this.viewRef != null) {
            calculateHalfExpandedOffset();
        }
    }

    public void setHideable(boolean z) {
        if (this.hideable != z) {
            this.hideable = z;
            if (!z && this.state == 5) {
                setState(4);
            }
            updateAccessibilityActions();
        }
    }

    public void setHideableInternal(boolean z) {
        this.hideable = z;
    }

    public void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public void setPeekHeight(int i) {
        setPeekHeight(i, false);
    }

    public void setSaveFlags(int i) {
        this.saveFlags = i;
    }

    public void setSkipCollapsed(boolean z) {
        this.skipCollapsed = z;
    }

    public void setState(int i) {
        if (i != this.state) {
            if (this.viewRef != null) {
                settleToStatePendingLayout(i);
            } else if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.state = i;
                this.lastStableState = i;
            }
        }
    }

    public void setStateInternal(int i) {
        View view;
        if (this.state != i) {
            this.state = i;
            if (i == 4 || i == 3 || i == 6 || (this.hideable && i == 5)) {
                this.lastStableState = i;
            }
            WeakReference<V> weakReference = this.viewRef;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                if (i == 3) {
                    updateImportantForAccessibility(true);
                } else if (i == 6 || i == 5 || i == 4) {
                    updateImportantForAccessibility(false);
                }
                updateDrawableForTargetState(i);
                for (int i2 = 0; i2 < this.callbacks.size(); i2++) {
                    this.callbacks.get(i2).onStateChanged(view, i);
                }
                updateAccessibilityActions();
            }
        }
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean z) {
        this.updateImportantForAccessibilityOnSiblings = z;
    }

    public void settleToState(View view, int i) {
        int i2;
        int i3;
        if (i == 4) {
            i2 = this.collapsedOffset;
        } else if (i == 6) {
            int i4 = this.halfExpandedOffset;
            if (!this.fitToContents || i4 > (i3 = this.fitToContentsOffset)) {
                i2 = i4;
            } else {
                i = 3;
                i2 = i3;
            }
        } else if (i == 3) {
            i2 = getExpandedOffset();
        } else if (!this.hideable || i != 5) {
            Log.w(TAG, "The bottom sheet may be in an invalid state. Ensure `hideable` is true when using `STATE_HIDDEN`.");
            return;
        } else {
            i2 = this.parentHeight;
        }
        startSettlingAnimation(view, i, i2, false);
    }

    public boolean shouldExpandOnUpwardDrag(long j, float f) {
        return false;
    }

    public boolean shouldHide(View view, float f) {
        if (this.skipCollapsed) {
            return true;
        }
        if (view.getTop() < this.collapsedOffset) {
            return false;
        }
        return Math.abs(((f * 0.1f) + ((float) view.getTop())) - ((float) this.collapsedOffset)) / ((float) calculatePeekHeight()) > 0.5f;
    }

    public boolean shouldSkipHalfExpandedStateWhenDragging() {
        return false;
    }

    public boolean shouldSkipSmoothAnimation() {
        return true;
    }

    public void startSettlingAnimation(View view, int i, int i2, boolean z) {
        C6916c cVar = this.viewDragHelper;
        if (cVar != null && (!z ? cVar.mo19058v(view, view.getLeft(), i2) : cVar.mo19056t(view.getLeft(), i2))) {
            setStateInternal(2);
            updateDrawableForTargetState(i);
            if (this.settleRunnable == null) {
                this.settleRunnable = new C15222g(view, i);
            }
            BottomSheetBehavior<V>.g gVar = this.settleRunnable;
            if (!gVar.f34152c) {
                gVar.f34153d = i;
                WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
                C2364y.C2368d.m5223m(view, gVar);
                this.settleRunnable.f34152c = true;
                return;
            }
            gVar.f34153d = i;
            return;
        }
        setStateInternal(i);
    }

    private void createMaterialShapeDrawable(Context context, AttributeSet attributeSet, boolean z, ColorStateList colorStateList) {
        if (this.shapeThemingEnabled) {
            this.shapeAppearanceModelDefault = C15401a.m24981b(context, attributeSet, R.attr.bottomSheetStyle, DEF_STYLE_RES).mo54616a();
            MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.shapeAppearanceModelDefault);
            this.materialShapeDrawable = materialShapeDrawable2;
            materialShapeDrawable2.initializeElevationOverlay(context);
            if (!z || colorStateList == null) {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(16842801, typedValue, true);
                this.materialShapeDrawable.setTint(typedValue.data);
                return;
            }
            this.materialShapeDrawable.setFillColor(colorStateList);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setPeekHeight(int r4, boolean r5) {
        /*
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = -1
            if (r4 != r2) goto L_0x000c
            boolean r4 = r3.peekHeightAuto
            if (r4 != 0) goto L_0x0015
            r3.peekHeightAuto = r0
            goto L_0x001f
        L_0x000c:
            boolean r2 = r3.peekHeightAuto
            if (r2 != 0) goto L_0x0017
            int r2 = r3.peekHeight
            if (r2 == r4) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r0 = r1
            goto L_0x001f
        L_0x0017:
            r3.peekHeightAuto = r1
            int r4 = java.lang.Math.max(r1, r4)
            r3.peekHeight = r4
        L_0x001f:
            if (r0 == 0) goto L_0x0024
            r3.updatePeekHeight(r5)
        L_0x0024:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.setPeekHeight(int, boolean):void");
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.peekHeightGestureInsetBuffer = context.getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C18161c.f39690i);
        this.shapeThemingEnabled = obtainStyledAttributes.hasValue(17);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        if (hasValue) {
            createMaterialShapeDrawable(context, attributeSet, hasValue, C14025c.m21582a(context, obtainStyledAttributes, 3));
        } else {
            createMaterialShapeDrawable(context, attributeSet, hasValue);
        }
        createShapeValueAnimator();
        this.elevation = obtainStyledAttributes.getDimension(2, -1.0f);
        if (obtainStyledAttributes.hasValue(0)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(0, -1));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(1, -1));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue == null || (i = peekValue.data) != -1) {
            setPeekHeight(obtainStyledAttributes.getDimensionPixelSize(9, -1));
        } else {
            setPeekHeight(i);
        }
        setHideable(obtainStyledAttributes.getBoolean(8, false));
        setGestureInsetBottomIgnored(obtainStyledAttributes.getBoolean(12, false));
        setFitToContents(obtainStyledAttributes.getBoolean(6, true));
        setSkipCollapsed(obtainStyledAttributes.getBoolean(11, false));
        setDraggable(obtainStyledAttributes.getBoolean(4, true));
        setSaveFlags(obtainStyledAttributes.getInt(10, 0));
        setHalfExpandedRatio(obtainStyledAttributes.getFloat(7, 0.5f));
        TypedValue peekValue2 = obtainStyledAttributes.peekValue(5);
        if (peekValue2 == null || peekValue2.type != 16) {
            setExpandedOffset(obtainStyledAttributes.getDimensionPixelOffset(5, 0));
        } else {
            setExpandedOffset(peekValue2.data);
        }
        this.paddingBottomSystemWindowInsets = obtainStyledAttributes.getBoolean(13, false);
        this.paddingLeftSystemWindowInsets = obtainStyledAttributes.getBoolean(14, false);
        this.paddingRightSystemWindowInsets = obtainStyledAttributes.getBoolean(15, false);
        this.paddingTopSystemWindowInsets = obtainStyledAttributes.getBoolean(16, true);
        obtainStyledAttributes.recycle();
        this.maximumVelocity = (float) ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
