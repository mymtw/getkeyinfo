package androidx.constraintlayout.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.solver.C2190c;
import androidx.constraintlayout.solver.widgets.C2220d;
import androidx.constraintlayout.solver.widgets.C2223f;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.analyzer.C2200b;
import androidx.core.internal.view.SupportMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.reflect.C19421p;
import p194o0.C7509b;
import p203p0.C7648c;
import p212q0.C7709a;
import p212q0.C7712b;

public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.0.4";
    public SparseArray<View> mChildrenByIds = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    public C7709a mConstraintLayoutSpec = null;
    private C2236a mConstraintSet = null;
    private int mConstraintSetId = -1;
    private C7712b mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    public boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    public int mLastMeasureHeightMode = 0;
    public int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    public int mLastMeasureWidthMode = 0;
    public int mLastMeasureWidthSize = -1;
    public C2220d mLayoutWidget = new C2220d();
    private int mMaxHeight = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    private int mMaxWidth = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    public C2235b mMeasurer = new C2235b(this);
    private C7509b mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOnMeasureHeightMeasureSpec = 0;
    private int mOnMeasureWidthMeasureSpec = 0;
    /* access modifiers changed from: private */
    public int mOptimizationLevel = 257;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static /* synthetic */ class C2234a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5362a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5362a = r0
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5362a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5362a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5362a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C2234a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public class C2235b implements C2200b.C2202b {

        /* renamed from: a */
        public ConstraintLayout f5363a;

        /* renamed from: b */
        public int f5364b;

        /* renamed from: c */
        public int f5365c;

        /* renamed from: d */
        public int f5366d;

        /* renamed from: e */
        public int f5367e;

        /* renamed from: f */
        public int f5368f;

        /* renamed from: g */
        public int f5369g;

        public C2235b(ConstraintLayout constraintLayout) {
            this.f5363a = constraintLayout;
        }

        /* renamed from: a */
        public static boolean m4919a(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
            }
            return false;
        }

        /* JADX WARNING: Removed duplicated region for block: B:194:0x0293  */
        /* JADX WARNING: Removed duplicated region for block: B:195:0x029a  */
        /* JADX WARNING: Removed duplicated region for block: B:197:0x02a0  */
        /* JADX WARNING: Removed duplicated region for block: B:200:0x02be  */
        /* JADX WARNING: Removed duplicated region for block: B:201:0x02c0  */
        /* JADX WARNING: Removed duplicated region for block: B:206:0x02ca  */
        /* JADX WARNING: Removed duplicated region for block: B:207:0x02cc  */
        /* JADX WARNING: Removed duplicated region for block: B:210:0x02d3  */
        @android.annotation.SuppressLint({"WrongCall"})
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo8460b(androidx.constraintlayout.solver.widgets.ConstraintWidget r18, androidx.constraintlayout.solver.widgets.analyzer.C2200b.C2201a r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r18
                r2 = r19
                if (r1 != 0) goto L_0x0009
                return
            L_0x0009:
                int r3 = r1.f5143d0
                r4 = 8
                r5 = 0
                if (r3 != r4) goto L_0x001b
                boolean r3 = r1.f5110A
                if (r3 != 0) goto L_0x001b
                r2.f5213e = r5
                r2.f5214f = r5
                r2.f5215g = r5
                return
            L_0x001b:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = r1.f5126Q
                if (r3 != 0) goto L_0x0020
                return
            L_0x0020:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r3 = r2.f5209a
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = r2.f5210b
                int r6 = r2.f5211c
                int r7 = r2.f5212d
                int r8 = r0.f5364b
                int r9 = r0.f5365c
                int r8 = r8 + r9
                int r9 = r0.f5366d
                java.lang.Object r10 = r1.f5141c0
                android.view.View r10 = (android.view.View) r10
                int[] r11 = androidx.constraintlayout.widget.ConstraintLayout.C2234a.f5362a
                int r12 = r3.ordinal()
                r12 = r11[r12]
                r13 = 3
                r14 = 2
                r15 = 4
                r5 = 1
                if (r12 == r5) goto L_0x00b2
                if (r12 == r14) goto L_0x00aa
                if (r12 == r13) goto L_0x0090
                if (r12 == r15) goto L_0x004a
                r6 = 0
                goto L_0x00b8
            L_0x004a:
                int r6 = r0.f5368f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                int r9 = r1.f5160m
                if (r9 != r5) goto L_0x0057
                r9 = r5
                goto L_0x0058
            L_0x0057:
                r9 = 0
            L_0x0058:
                int r12 = r2.f5218j
                if (r12 == r5) goto L_0x005e
                if (r12 != r14) goto L_0x00b8
            L_0x005e:
                int r12 = r10.getMeasuredHeight()
                int r15 = r18.mo8286o()
                if (r12 != r15) goto L_0x006a
                r12 = r5
                goto L_0x006b
            L_0x006a:
                r12 = 0
            L_0x006b:
                int r15 = r2.f5218j
                if (r15 == r14) goto L_0x0082
                if (r9 == 0) goto L_0x0082
                if (r9 == 0) goto L_0x0075
                if (r12 != 0) goto L_0x0082
            L_0x0075:
                boolean r9 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r9 != 0) goto L_0x0082
                boolean r9 = r18.mo8261A()
                if (r9 == 0) goto L_0x0080
                goto L_0x0082
            L_0x0080:
                r9 = 0
                goto L_0x0083
            L_0x0082:
                r9 = r5
            L_0x0083:
                if (r9 == 0) goto L_0x00b8
                int r6 = r18.mo8289r()
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
                goto L_0x00b8
            L_0x0090:
                int r6 = r0.f5368f
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r1.f5114E
                if (r12 == 0) goto L_0x009b
                int r12 = r12.f5106g
                r15 = 0
                int r12 = r12 + r15
                goto L_0x009c
            L_0x009b:
                r12 = 0
            L_0x009c:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r15 = r1.f5116G
                if (r15 == 0) goto L_0x00a3
                int r15 = r15.f5106g
                int r12 = r12 + r15
            L_0x00a3:
                int r9 = r9 + r12
                r12 = -1
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00b8
            L_0x00aa:
                int r6 = r0.f5368f
                r12 = -2
                int r6 = android.view.ViewGroup.getChildMeasureSpec(r6, r9, r12)
                goto L_0x00b8
            L_0x00b2:
                r9 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r9)
            L_0x00b8:
                int r9 = r4.ordinal()
                r9 = r11[r9]
                if (r9 == r5) goto L_0x0136
                if (r9 == r14) goto L_0x012e
                if (r9 == r13) goto L_0x0110
                r7 = 4
                if (r9 == r7) goto L_0x00ca
                r7 = 0
                goto L_0x013c
            L_0x00ca:
                int r7 = r0.f5369g
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                int r8 = r1.f5162n
                if (r8 != r5) goto L_0x00d7
                r8 = r5
                goto L_0x00d8
            L_0x00d7:
                r8 = 0
            L_0x00d8:
                int r9 = r2.f5218j
                if (r9 == r5) goto L_0x00de
                if (r9 != r14) goto L_0x013c
            L_0x00de:
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.mo8289r()
                if (r9 != r11) goto L_0x00ea
                r9 = r5
                goto L_0x00eb
            L_0x00ea:
                r9 = 0
            L_0x00eb:
                int r11 = r2.f5218j
                if (r11 == r14) goto L_0x0102
                if (r8 == 0) goto L_0x0102
                if (r8 == 0) goto L_0x00f5
                if (r9 != 0) goto L_0x0102
            L_0x00f5:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.Placeholder
                if (r8 != 0) goto L_0x0102
                boolean r8 = r18.mo8262B()
                if (r8 == 0) goto L_0x0100
                goto L_0x0102
            L_0x0100:
                r8 = 0
                goto L_0x0103
            L_0x0102:
                r8 = r5
            L_0x0103:
                if (r8 == 0) goto L_0x013c
                int r7 = r18.mo8286o()
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
                goto L_0x013c
            L_0x0110:
                int r7 = r0.f5369g
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r1.f5114E
                if (r9 == 0) goto L_0x011d
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r9 = r1.f5115F
                int r9 = r9.f5106g
                r11 = 0
                int r9 = r9 + r11
                goto L_0x011e
            L_0x011d:
                r9 = 0
            L_0x011e:
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r1.f5116G
                if (r11 == 0) goto L_0x0127
                androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r1.f5117H
                int r11 = r11.f5106g
                int r9 = r9 + r11
            L_0x0127:
                int r8 = r8 + r9
                r9 = -1
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                goto L_0x013c
            L_0x012e:
                int r7 = r0.f5369g
                r9 = -2
                int r7 = android.view.ViewGroup.getChildMeasureSpec(r7, r8, r9)
                goto L_0x013c
            L_0x0136:
                r8 = 1073741824(0x40000000, float:2.0)
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            L_0x013c:
                androidx.constraintlayout.solver.widgets.ConstraintWidget r8 = r1.f5126Q
                androidx.constraintlayout.solver.widgets.d r8 = (androidx.constraintlayout.solver.widgets.C2220d) r8
                if (r8 == 0) goto L_0x01b4
                androidx.constraintlayout.widget.ConstraintLayout r9 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r9 = r9.mOptimizationLevel
                r11 = 256(0x100, float:3.59E-43)
                boolean r9 = androidx.constraintlayout.solver.widgets.C2225g.m4906b(r9, r11)
                if (r9 == 0) goto L_0x01b4
                int r9 = r10.getMeasuredWidth()
                int r11 = r18.mo8289r()
                if (r9 != r11) goto L_0x01b4
                int r9 = r10.getMeasuredWidth()
                int r11 = r8.mo8289r()
                if (r9 >= r11) goto L_0x01b4
                int r9 = r10.getMeasuredHeight()
                int r11 = r18.mo8286o()
                if (r9 != r11) goto L_0x01b4
                int r9 = r10.getMeasuredHeight()
                int r8 = r8.mo8286o()
                if (r9 >= r8) goto L_0x01b4
                int r8 = r10.getBaseline()
                int r9 = r1.f5133X
                if (r8 != r9) goto L_0x01b4
                boolean r8 = r18.mo8298z()
                if (r8 != 0) goto L_0x01b4
                int r8 = r1.f5112C
                int r9 = r18.mo8289r()
                boolean r8 = m4919a(r8, r6, r9)
                if (r8 == 0) goto L_0x01a0
                int r8 = r1.f5113D
                int r9 = r18.mo8286o()
                boolean r8 = m4919a(r8, r7, r9)
                if (r8 == 0) goto L_0x01a0
                r8 = r5
                goto L_0x01a1
            L_0x01a0:
                r8 = 0
            L_0x01a1:
                if (r8 == 0) goto L_0x01b4
                int r3 = r18.mo8289r()
                r2.f5213e = r3
                int r3 = r18.mo8286o()
                r2.f5214f = r3
                int r1 = r1.f5133X
                r2.f5215g = r1
                return
            L_0x01b4:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
                if (r3 != r8) goto L_0x01ba
                r9 = r5
                goto L_0x01bb
            L_0x01ba:
                r9 = 0
            L_0x01bb:
                if (r4 != r8) goto L_0x01bf
                r8 = r5
                goto L_0x01c0
            L_0x01bf:
                r8 = 0
            L_0x01c0:
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
                if (r4 == r11) goto L_0x01cb
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r4 != r12) goto L_0x01c9
                goto L_0x01cb
            L_0x01c9:
                r15 = 0
                goto L_0x01cc
            L_0x01cb:
                r15 = r5
            L_0x01cc:
                if (r3 == r11) goto L_0x01d5
                androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r4 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
                if (r3 != r4) goto L_0x01d3
                goto L_0x01d5
            L_0x01d3:
                r3 = 0
                goto L_0x01d6
            L_0x01d5:
                r3 = r5
            L_0x01d6:
                r4 = 0
                if (r9 == 0) goto L_0x01e1
                float r11 = r1.f5129T
                int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r11 <= 0) goto L_0x01e1
                r11 = r5
                goto L_0x01e2
            L_0x01e1:
                r11 = 0
            L_0x01e2:
                if (r8 == 0) goto L_0x01ec
                float r12 = r1.f5129T
                int r4 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
                if (r4 <= 0) goto L_0x01ec
                r4 = r5
                goto L_0x01ed
            L_0x01ec:
                r4 = 0
            L_0x01ed:
                if (r10 != 0) goto L_0x01f0
                return
            L_0x01f0:
                android.view.ViewGroup$LayoutParams r12 = r10.getLayoutParams()
                androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r12 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r12
                int r13 = r2.f5218j
                if (r13 == r5) goto L_0x0210
                if (r13 == r14) goto L_0x0210
                if (r9 == 0) goto L_0x0210
                int r9 = r1.f5160m
                if (r9 != 0) goto L_0x0210
                if (r8 == 0) goto L_0x0210
                int r8 = r1.f5162n
                if (r8 == 0) goto L_0x0209
                goto L_0x0210
            L_0x0209:
                r0 = 0
                r3 = 0
                r4 = -1
                r13 = 0
            L_0x020d:
                r15 = 0
                goto L_0x02bc
            L_0x0210:
                boolean r8 = r10 instanceof androidx.constraintlayout.widget.VirtualLayout
                if (r8 == 0) goto L_0x0222
                boolean r8 = r1 instanceof androidx.constraintlayout.solver.widgets.C2226h
                if (r8 == 0) goto L_0x0222
                r8 = r1
                androidx.constraintlayout.solver.widgets.h r8 = (androidx.constraintlayout.solver.widgets.C2226h) r8
                r9 = r10
                androidx.constraintlayout.widget.VirtualLayout r9 = (androidx.constraintlayout.widget.VirtualLayout) r9
                r9.onMeasure(r8, r6, r7)
                goto L_0x0225
            L_0x0222:
                r10.measure(r6, r7)
            L_0x0225:
                r1.f5112C = r6
                r1.f5113D = r7
                r8 = 0
                r1.f5148g = r8
                int r8 = r10.getMeasuredWidth()
                int r9 = r10.getMeasuredHeight()
                int r13 = r10.getBaseline()
                int r14 = r1.f5166p
                if (r14 <= 0) goto L_0x0241
                int r14 = java.lang.Math.max(r14, r8)
                goto L_0x0242
            L_0x0241:
                r14 = r8
            L_0x0242:
                int r5 = r1.f5167q
                if (r5 <= 0) goto L_0x024a
                int r14 = java.lang.Math.min(r5, r14)
            L_0x024a:
                int r5 = r1.f5169s
                if (r5 <= 0) goto L_0x0255
                int r5 = java.lang.Math.max(r5, r9)
                r16 = r6
                goto L_0x0258
            L_0x0255:
                r16 = r6
                r5 = r9
            L_0x0258:
                int r6 = r1.f5170t
                if (r6 <= 0) goto L_0x0260
                int r5 = java.lang.Math.min(r6, r5)
            L_0x0260:
                androidx.constraintlayout.widget.ConstraintLayout r6 = androidx.constraintlayout.widget.ConstraintLayout.this
                int r6 = r6.mOptimizationLevel
                r0 = 1
                boolean r6 = androidx.constraintlayout.solver.widgets.C2225g.m4906b(r6, r0)
                if (r6 != 0) goto L_0x0286
                r0 = 1056964608(0x3f000000, float:0.5)
                if (r11 == 0) goto L_0x027b
                if (r15 == 0) goto L_0x027b
                float r3 = r1.f5129T
                float r4 = (float) r5
                float r4 = r4 * r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r15 = r0
                goto L_0x0287
            L_0x027b:
                if (r4 == 0) goto L_0x0286
                if (r3 == 0) goto L_0x0286
                float r3 = r1.f5129T
                float r4 = (float) r14
                float r4 = r4 / r3
                float r4 = r4 + r0
                int r0 = (int) r4
                r5 = r0
            L_0x0286:
                r15 = r14
            L_0x0287:
                if (r8 != r15) goto L_0x0291
                if (r9 == r5) goto L_0x028c
                goto L_0x0291
            L_0x028c:
                r3 = r5
                r0 = r15
                r4 = -1
                goto L_0x020d
            L_0x0291:
                if (r8 == r15) goto L_0x029a
                r0 = 1073741824(0x40000000, float:2.0)
                int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r0)
                goto L_0x029e
            L_0x029a:
                r0 = 1073741824(0x40000000, float:2.0)
                r6 = r16
            L_0x029e:
                if (r9 == r5) goto L_0x02a4
                int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r0)
            L_0x02a4:
                r10.measure(r6, r7)
                r1.f5112C = r6
                r1.f5113D = r7
                r15 = 0
                r1.f5148g = r15
                int r0 = r10.getMeasuredWidth()
                int r3 = r10.getMeasuredHeight()
                int r4 = r10.getBaseline()
                r13 = r4
                r4 = -1
            L_0x02bc:
                if (r13 == r4) goto L_0x02c0
                r4 = 1
                goto L_0x02c1
            L_0x02c0:
                r4 = r15
            L_0x02c1:
                int r5 = r2.f5211c
                if (r0 != r5) goto L_0x02cc
                int r5 = r2.f5212d
                if (r3 == r5) goto L_0x02ca
                goto L_0x02cc
            L_0x02ca:
                r5 = r15
                goto L_0x02cd
            L_0x02cc:
                r5 = 1
            L_0x02cd:
                r2.f5217i = r5
                boolean r5 = r12.needsBaseline
                if (r5 == 0) goto L_0x02d4
                r4 = 1
            L_0x02d4:
                if (r4 == 0) goto L_0x02e0
                r5 = -1
                if (r13 == r5) goto L_0x02e0
                int r1 = r1.f5133X
                if (r1 == r13) goto L_0x02e0
                r1 = 1
                r2.f5217i = r1
            L_0x02e0:
                r2.f5213e = r0
                r2.f5214f = r3
                r2.f5216h = r4
                r2.f5215g = r13
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C2235b.mo8460b(androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.solver.widgets.analyzer.b$a):void");
        }
    }

    public ConstraintLayout(Context context) {
        super(context);
        init((AttributeSet) null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    private final ConstraintWidget getTargetWidget(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    private void init(AttributeSet attributeSet, int i, int i2) {
        C2220d dVar = this.mLayoutWidget;
        dVar.f5141c0 = this;
        C2235b bVar = this.mMeasurer;
        dVar.f5272s0 = bVar;
        dVar.f5271r0.f5226f = bVar;
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C19421p.f43325o, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == 9) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == 10) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == 7) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == 8) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == 90) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == 39) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == 18) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C2236a aVar = new C2236a();
                        this.mConstraintSet = aVar;
                        aVar.mo8491k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        C2220d dVar2 = this.mLayoutWidget;
        dVar2.f5262B0 = this.mOptimizationLevel;
        C2190c.f5077p = dVar2.mo8343U(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    private void markHierarchyDirty() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    private void setChildrenConstraints() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo8263C();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    getTargetWidget(childAt.getId()).f5145e0 = resourceName;
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C2236a aVar = this.mConstraintSet;
        if (aVar != null) {
            aVar.mo8485c(this);
        }
        this.mLayoutWidget.f16944p0.clear();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).updatePreLayout(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).updatePreLayout(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                LayoutParams layoutParams = (LayoutParams) childAt5.getLayoutParams();
                C2220d dVar = this.mLayoutWidget;
                dVar.f16944p0.add(viewWidget2);
                ConstraintWidget constraintWidget = viewWidget2.f5126Q;
                if (constraintWidget != null) {
                    ((C7648c) constraintWidget).f16944p0.remove(viewWidget2);
                    viewWidget2.mo8263C();
                }
                viewWidget2.f5126Q = dVar;
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, layoutParams, this.mTempMapIdToWidget);
            }
        }
    }

    private boolean updateHierarchy() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            setChildrenConstraints();
        }
        return z;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
    }

    /* JADX WARNING: Removed duplicated region for block: B:149:0x02f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void applyConstraintsFromLayoutParams(boolean r20, android.view.View r21, androidx.constraintlayout.solver.widgets.ConstraintWidget r22, androidx.constraintlayout.widget.ConstraintLayout.LayoutParams r23, android.util.SparseArray<androidx.constraintlayout.solver.widgets.ConstraintWidget> r24) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r23.validate()
            r10 = 0
            r8.helped = r10
            int r2 = r21.getVisibility()
            r7.f5143d0 = r2
            boolean r2 = r8.isInPlaceholder
            r11 = 1
            if (r2 == 0) goto L_0x0021
            r7.f5110A = r11
            r2 = 8
            r7.f5143d0 = r2
        L_0x0021:
            r7.f5141c0 = r1
            boolean r2 = r1 instanceof androidx.constraintlayout.widget.ConstraintHelper
            if (r2 == 0) goto L_0x0030
            androidx.constraintlayout.widget.ConstraintHelper r1 = (androidx.constraintlayout.widget.ConstraintHelper) r1
            androidx.constraintlayout.solver.widgets.d r2 = r0.mLayoutWidget
            boolean r2 = r2.f5273t0
            r1.resolveRtl(r7, r2)
        L_0x0030:
            boolean r1 = r8.isGuideline
            r12 = -1
            if (r1 == 0) goto L_0x0066
            r1 = r7
            androidx.constraintlayout.solver.widgets.f r1 = (androidx.constraintlayout.solver.widgets.C2223f) r1
            int r2 = r8.resolvedGuideBegin
            int r3 = r8.resolvedGuideEnd
            float r4 = r8.resolvedGuidePercent
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 == 0) goto L_0x004e
            if (r6 <= 0) goto L_0x0350
            r1.f5323p0 = r4
            r1.f5324q0 = r12
            r1.f5325r0 = r12
            goto L_0x0350
        L_0x004e:
            if (r2 == r12) goto L_0x005a
            if (r2 <= r12) goto L_0x0350
            r1.f5323p0 = r5
            r1.f5324q0 = r2
            r1.f5325r0 = r12
            goto L_0x0350
        L_0x005a:
            if (r3 == r12) goto L_0x0350
            if (r3 <= r12) goto L_0x0350
            r1.f5323p0 = r5
            r1.f5324q0 = r12
            r1.f5325r0 = r3
            goto L_0x0350
        L_0x0066:
            int r1 = r8.resolvedLeftToLeft
            int r2 = r8.resolvedLeftToRight
            int r13 = r8.resolvedRightToLeft
            int r14 = r8.resolvedRightToRight
            int r6 = r8.resolveGoneLeftMargin
            int r15 = r8.resolveGoneRightMargin
            float r5 = r8.resolvedHorizontalBias
            int r3 = r8.circleConstraint
            r4 = 0
            if (r3 == r12) goto L_0x0099
            java.lang.Object r1 = r9.get(r3)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0095
            float r9 = r8.circleAngle
            int r5 = r8.circleRadius
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r6 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.CENTER
            r13 = 0
            r1 = r22
            r2 = r6
            r14 = r4
            r4 = r6
            r6 = r13
            r1.mo8294v(r2, r3, r4, r5, r6)
            r7.f5175y = r9
            goto L_0x0096
        L_0x0095:
            r14 = r4
        L_0x0096:
            r2 = r14
            goto L_0x01c9
        L_0x0099:
            if (r1 == r12) goto L_0x00bb
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x00b8
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r16 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r2 = r8.leftMargin
            r1 = r22
            r17 = r2
            r2 = r16
            r4 = r16
            r18 = r5
            r5 = r17
            r1.mo8294v(r2, r3, r4, r5, r6)
            goto L_0x00d3
        L_0x00b8:
            r18 = r5
            goto L_0x00d3
        L_0x00bb:
            r18 = r5
            if (r2 == r12) goto L_0x00d3
            java.lang.Object r1 = r9.get(r2)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x00d3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r5 = r8.leftMargin
            r1 = r22
            r1.mo8294v(r2, r3, r4, r5, r6)
        L_0x00d3:
            if (r13 == r12) goto L_0x00eb
            java.lang.Object r1 = r9.get(r13)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0101
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            int r5 = r8.rightMargin
            r1 = r22
            r6 = r15
            r1.mo8294v(r2, r3, r4, r5, r6)
            goto L_0x0101
        L_0x00eb:
            if (r14 == r12) goto L_0x0101
            java.lang.Object r1 = r9.get(r14)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0101
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            int r5 = r8.rightMargin
            r1 = r22
            r2 = r4
            r6 = r15
            r1.mo8294v(r2, r3, r4, r5, r6)
        L_0x0101:
            int r1 = r8.topToTop
            if (r1 == r12) goto L_0x011b
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0135
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r5 = r8.topMargin
            int r6 = r8.goneTopMargin
            r1 = r22
            r2 = r4
            r1.mo8294v(r2, r3, r4, r5, r6)
            goto L_0x0135
        L_0x011b:
            int r1 = r8.topToBottom
            if (r1 == r12) goto L_0x0135
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0135
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r5 = r8.topMargin
            int r6 = r8.goneTopMargin
            r1 = r22
            r1.mo8294v(r2, r3, r4, r5, r6)
        L_0x0135:
            int r1 = r8.bottomToTop
            if (r1 == r12) goto L_0x0150
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0169
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r2 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            int r5 = r8.bottomMargin
            int r6 = r8.goneBottomMargin
            r1 = r22
            r1.mo8294v(r2, r3, r4, r5, r6)
            goto L_0x0169
        L_0x0150:
            int r1 = r8.bottomToBottom
            if (r1 == r12) goto L_0x0169
            java.lang.Object r1 = r9.get(r1)
            r3 = r1
            androidx.constraintlayout.solver.widgets.ConstraintWidget r3 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r3
            if (r3 == 0) goto L_0x0169
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r4 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            int r5 = r8.bottomMargin
            int r6 = r8.goneBottomMargin
            r1 = r22
            r2 = r4
            r1.mo8294v(r2, r3, r4, r5, r6)
        L_0x0169:
            int r1 = r8.baselineToBaseline
            if (r1 == r12) goto L_0x01b8
            android.util.SparseArray<android.view.View> r2 = r0.mChildrenByIds
            java.lang.Object r1 = r2.get(r1)
            android.view.View r1 = (android.view.View) r1
            int r2 = r8.baselineToBaseline
            java.lang.Object r2 = r9.get(r2)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r2 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r2
            if (r2 == 0) goto L_0x01b8
            if (r1 == 0) goto L_0x01b8
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r3 == 0) goto L_0x01b8
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r1 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r1
            r8.needsBaseline = r11
            r1.needsBaseline = r11
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BASELINE
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r4 = r7.mo8284m(r3)
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r2 = r2.mo8284m(r3)
            r4.mo8249b(r2, r10, r12, r11)
            r7.f5176z = r11
            androidx.constraintlayout.solver.widgets.ConstraintWidget r1 = r1.widget
            r1.f5176z = r11
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.mo8284m(r1)
            r1.mo8257j()
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.mo8284m(r1)
            r1.mo8257j()
        L_0x01b8:
            r1 = r18
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 < 0) goto L_0x01c1
            r7.f5137a0 = r1
        L_0x01c1:
            float r1 = r8.verticalBias
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 < 0) goto L_0x01c9
            r7.f5139b0 = r1
        L_0x01c9:
            if (r20 == 0) goto L_0x01d9
            int r1 = r8.editorAbsoluteX
            if (r1 != r12) goto L_0x01d3
            int r3 = r8.editorAbsoluteY
            if (r3 == r12) goto L_0x01d9
        L_0x01d3:
            int r3 = r8.editorAbsoluteY
            r7.f5131V = r1
            r7.f5132W = r3
        L_0x01d9:
            boolean r1 = r8.horizontalDimensionFixed
            r3 = -2
            if (r1 != 0) goto L_0x020f
            int r1 = r8.width
            if (r1 != r12) goto L_0x0206
            boolean r1 = r8.constrainedWidth
            if (r1 == 0) goto L_0x01ec
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r7.mo8270J(r1)
            goto L_0x01f1
        L_0x01ec:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r7.mo8270J(r1)
        L_0x01f1:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.LEFT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.mo8284m(r1)
            int r4 = r8.leftMargin
            r1.f5106g = r4
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.mo8284m(r1)
            int r4 = r8.rightMargin
            r1.f5106g = r4
            goto L_0x0222
        L_0x0206:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r7.mo8270J(r1)
            r7.mo8272L(r10)
            goto L_0x0222
        L_0x020f:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7.mo8270J(r1)
            int r1 = r8.width
            r7.mo8272L(r1)
            int r1 = r8.width
            if (r1 != r3) goto L_0x0222
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7.mo8270J(r1)
        L_0x0222:
            boolean r1 = r8.verticalDimensionFixed
            if (r1 != 0) goto L_0x0257
            int r1 = r8.height
            if (r1 != r12) goto L_0x024e
            boolean r1 = r8.constrainedHeight
            if (r1 == 0) goto L_0x0234
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r7.mo8271K(r1)
            goto L_0x0239
        L_0x0234:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            r7.mo8271K(r1)
        L_0x0239:
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.TOP
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.mo8284m(r1)
            int r3 = r8.topMargin
            r1.f5106g = r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r1 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r1 = r7.mo8284m(r1)
            int r3 = r8.bottomMargin
            r1.f5106g = r3
            goto L_0x026a
        L_0x024e:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            r7.mo8271K(r1)
            r7.mo8269I(r10)
            goto L_0x026a
        L_0x0257:
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r7.mo8271K(r1)
            int r1 = r8.height
            r7.mo8269I(r1)
            int r1 = r8.height
            if (r1 != r3) goto L_0x026a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            r7.mo8271K(r1)
        L_0x026a:
            java.lang.String r1 = r8.dimensionRatio
            if (r1 == 0) goto L_0x02f7
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0276
            goto L_0x02f7
        L_0x0276:
            int r3 = r1.length()
            r4 = 44
            int r4 = r1.indexOf(r4)
            if (r4 <= 0) goto L_0x029f
            int r5 = r3 + -1
            if (r4 >= r5) goto L_0x029f
            java.lang.String r5 = r1.substring(r10, r4)
            java.lang.String r6 = "W"
            boolean r6 = r5.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0294
            r12 = r10
            goto L_0x029d
        L_0x0294:
            java.lang.String r6 = "H"
            boolean r5 = r5.equalsIgnoreCase(r6)
            if (r5 == 0) goto L_0x029d
            r12 = r11
        L_0x029d:
            int r4 = r4 + r11
            goto L_0x02a0
        L_0x029f:
            r4 = r10
        L_0x02a0:
            r5 = 58
            int r5 = r1.indexOf(r5)
            if (r5 < 0) goto L_0x02de
            int r3 = r3 - r11
            if (r5 >= r3) goto L_0x02de
            java.lang.String r3 = r1.substring(r4, r5)
            int r5 = r5 + r11
            java.lang.String r1 = r1.substring(r5)
            int r4 = r3.length()
            if (r4 <= 0) goto L_0x02ed
            int r4 = r1.length()
            if (r4 <= 0) goto L_0x02ed
            float r3 = java.lang.Float.parseFloat(r3)     // Catch:{ NumberFormatException -> 0x02ed }
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x02ed }
            int r4 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x02ed
            int r4 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x02ed
            if (r12 != r11) goto L_0x02d8
            float r1 = r1 / r3
            float r4 = java.lang.Math.abs(r1)     // Catch:{ NumberFormatException -> 0x02ed }
            goto L_0x02ee
        L_0x02d8:
            float r3 = r3 / r1
            float r4 = java.lang.Math.abs(r3)     // Catch:{ NumberFormatException -> 0x02ed }
            goto L_0x02ee
        L_0x02de:
            java.lang.String r1 = r1.substring(r4)
            int r3 = r1.length()
            if (r3 <= 0) goto L_0x02ed
            float r4 = java.lang.Float.parseFloat(r1)     // Catch:{ NumberFormatException -> 0x02ed }
            goto L_0x02ee
        L_0x02ed:
            r4 = r2
        L_0x02ee:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x02f9
            r7.f5129T = r4
            r7.f5130U = r12
            goto L_0x02f9
        L_0x02f7:
            r7.f5129T = r2
        L_0x02f9:
            float r1 = r8.horizontalWeight
            float[] r3 = r7.f5153i0
            r3[r10] = r1
            float r1 = r8.verticalWeight
            r3[r11] = r1
            int r1 = r8.horizontalChainStyle
            r7.f5149g0 = r1
            int r1 = r8.verticalChainStyle
            r7.f5151h0 = r1
            int r1 = r8.matchConstraintDefaultWidth
            int r3 = r8.matchConstraintMinWidth
            int r4 = r8.matchConstraintMaxWidth
            float r5 = r8.matchConstraintPercentWidth
            r7.f5160m = r1
            r7.f5166p = r3
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r3) goto L_0x031d
            r4 = r10
        L_0x031d:
            r7.f5167q = r4
            r7.f5168r = r5
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 2
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r4 <= 0) goto L_0x0330
            int r4 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x0330
            if (r1 != 0) goto L_0x0330
            r7.f5160m = r6
        L_0x0330:
            int r1 = r8.matchConstraintDefaultHeight
            int r4 = r8.matchConstraintMinHeight
            int r5 = r8.matchConstraintMaxHeight
            float r8 = r8.matchConstraintPercentHeight
            r7.f5162n = r1
            r7.f5169s = r4
            if (r5 != r3) goto L_0x033f
            goto L_0x0340
        L_0x033f:
            r10 = r5
        L_0x0340:
            r7.f5170t = r10
            r7.f5171u = r8
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0350
            int r2 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0350
            if (r1 != 0) goto L_0x0350
            r7.f5162n = r6
        L_0x0350:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.applyConstraintsFromLayoutParams(boolean, android.view.View, androidx.constraintlayout.solver.widgets.ConstraintWidget, androidx.constraintlayout.widget.ConstraintLayout$LayoutParams, android.util.SparseArray):void");
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).updatePreDraw(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = (float) getWidth();
            float height = (float) getHeight();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(SupportMenu.CATEGORY_MASK);
                        float f = (float) i3;
                        float f2 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f3 = (float) i4;
                        float f4 = f;
                        float f5 = f;
                        float f6 = f3;
                        Paint paint2 = paint;
                        float f7 = f2;
                        Paint paint3 = paint2;
                        canvas2.drawLine(f4, f6, f7, f3, paint3);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f2;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f6, f7, f9, paint3);
                        float f10 = parseInt4;
                        float f11 = f5;
                        canvas2.drawLine(f8, f10, f11, f9, paint3);
                        float f12 = f5;
                        canvas2.drawLine(f12, f10, f11, f3, paint3);
                        Paint paint4 = paint2;
                        paint4.setColor(-16711936);
                        Paint paint5 = paint4;
                        float f13 = f2;
                        Paint paint6 = paint5;
                        canvas2.drawLine(f12, f3, f13, parseInt4, paint6);
                        canvas2.drawLine(f12, parseInt4, f13, f3, paint6);
                    }
                }
            }
        }
    }

    public void fillMetrics(C7509b bVar) {
        this.mLayoutWidget.f5274u0.getClass();
    }

    public void forceLayout() {
        markHierarchyDirty();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.f5262B0;
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).widget;
    }

    public boolean isRtl() {
        return ((getContext().getApplicationInfo().flags & 4194304) != 0) && 1 == getLayoutDirection();
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C7709a(getContext(), this, i);
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
            }
        } else {
            this.mConstraintLayoutSpec = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = layoutParams.widget;
            if ((childAt.getVisibility() != 8 || layoutParams.isGuideline || layoutParams.isHelper || layoutParams.isVirtualGroup || isInEditMode) && !layoutParams.isInPlaceholder) {
                int s = constraintWidget.mo8290s();
                int t = constraintWidget.mo8291t();
                int r = constraintWidget.mo8289r() + s;
                int o = constraintWidget.mo8286o() + t;
                childAt.layout(s, t, r, o);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(s, t, r, o);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).updatePostLayout(this);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                } else if (getChildAt(i3).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i3++;
                }
            }
        }
        if (!this.mDirtyHierarchy) {
            int i4 = this.mOnMeasureWidthMeasureSpec;
            if (i4 == i && this.mOnMeasureHeightMeasureSpec == i2) {
                int r = this.mLayoutWidget.mo8289r();
                int o = this.mLayoutWidget.mo8286o();
                C2220d dVar = this.mLayoutWidget;
                resolveMeasuredDimension(i, i2, r, o, dVar.f5263C0, dVar.f5264D0);
                return;
            } else if (i4 == i && View.MeasureSpec.getMode(i) == 1073741824 && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && View.MeasureSpec.getMode(this.mOnMeasureHeightMeasureSpec) == Integer.MIN_VALUE && View.MeasureSpec.getSize(i2) >= this.mLayoutWidget.mo8286o()) {
                this.mOnMeasureWidthMeasureSpec = i;
                this.mOnMeasureHeightMeasureSpec = i2;
                int r2 = this.mLayoutWidget.mo8289r();
                int o2 = this.mLayoutWidget.mo8286o();
                C2220d dVar2 = this.mLayoutWidget;
                resolveMeasuredDimension(i, i2, r2, o2, dVar2.f5263C0, dVar2.f5264D0);
                return;
            }
        }
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.f5273t0 = isRtl();
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (updateHierarchy()) {
                C2220d dVar3 = this.mLayoutWidget;
                dVar3.f5270q0.mo8316c(dVar3);
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        int r3 = this.mLayoutWidget.mo8289r();
        int o3 = this.mLayoutWidget.mo8286o();
        C2220d dVar4 = this.mLayoutWidget;
        resolveMeasuredDimension(i, i2, r3, o3, dVar4.f5263C0, dVar4.f5264D0);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C2223f)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            C2223f fVar = new C2223f();
            layoutParams.widget = fVar;
            layoutParams.isGuideline = true;
            fVar.mo8354P(layoutParams.orientation);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.validateParams();
            ((LayoutParams) view.getLayoutParams()).isHelper = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        ConstraintWidget viewWidget = getViewWidget(view);
        this.mLayoutWidget.f16944p0.remove(viewWidget);
        viewWidget.mo8263C();
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C7709a(getContext(), this, i);
    }

    public void removeView(View view) {
        super.removeView(view);
    }

    public void requestLayout() {
        markHierarchyDirty();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C2235b bVar = this.mMeasurer;
        int i5 = bVar.f5367e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + bVar.f5366d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x03b8  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x03c3  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:377:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x010a A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0114  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void resolveSystem(androidx.constraintlayout.solver.widgets.C2220d r22, int r23, int r24, int r25) {
        /*
            r21 = this;
            r6 = r22
            r7 = r23
            int r8 = android.view.View.MeasureSpec.getMode(r24)
            int r0 = android.view.View.MeasureSpec.getSize(r24)
            int r9 = android.view.View.MeasureSpec.getMode(r25)
            int r1 = android.view.View.MeasureSpec.getSize(r25)
            int r2 = r21.getPaddingTop()
            r10 = 0
            int r11 = java.lang.Math.max(r10, r2)
            int r2 = r21.getPaddingBottom()
            int r2 = java.lang.Math.max(r10, r2)
            int r3 = r11 + r2
            int r4 = r21.getPaddingWidth()
            r12 = r21
            androidx.constraintlayout.widget.ConstraintLayout$b r5 = r12.mMeasurer
            r5.f5364b = r11
            r5.f5365c = r2
            r5.f5366d = r4
            r5.f5367e = r3
            r2 = r24
            r5.f5368f = r2
            r2 = r25
            r5.f5369g = r2
            int r2 = r21.getPaddingStart()
            int r2 = java.lang.Math.max(r10, r2)
            int r5 = r21.getPaddingEnd()
            int r5 = java.lang.Math.max(r10, r5)
            if (r2 > 0) goto L_0x005d
            if (r5 <= 0) goto L_0x0054
            goto L_0x005d
        L_0x0054:
            int r2 = r21.getPaddingLeft()
            int r2 = java.lang.Math.max(r10, r2)
            goto L_0x0065
        L_0x005d:
            boolean r13 = r21.isRtl()
            if (r13 == 0) goto L_0x0065
            r13 = r5
            goto L_0x0066
        L_0x0065:
            r13 = r2
        L_0x0066:
            int r14 = r0 - r4
            int r15 = r1 - r3
            r0 = r21
            r1 = r22
            r2 = r8
            r3 = r14
            r4 = r9
            r5 = r15
            r0.setSelfDimensionBehaviour(r1, r2, r3, r4, r5)
            r6.f5275v0 = r13
            r6.f5276w0 = r11
            androidx.constraintlayout.solver.widgets.analyzer.b r0 = r6.f5270q0
            r0.getClass()
            androidx.constraintlayout.solver.widgets.analyzer.b$b r1 = r6.f5272s0
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r2 = r6.f16944p0
            int r2 = r2.size()
            int r3 = r22.mo8289r()
            int r4 = r22.mo8286o()
            r5 = 128(0x80, float:1.794E-43)
            boolean r5 = androidx.constraintlayout.solver.widgets.C2225g.m4906b(r7, r5)
            r11 = 64
            if (r5 != 0) goto L_0x00a1
            boolean r7 = androidx.constraintlayout.solver.widgets.C2225g.m4906b(r7, r11)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r7 = r10
            goto L_0x00a2
        L_0x00a1:
            r7 = 1
        L_0x00a2:
            r16 = 0
            if (r7 == 0) goto L_0x0102
            r11 = r10
        L_0x00a7:
            if (r11 >= r2) goto L_0x0102
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r13 = r6.f16944p0
            java.lang.Object r13 = r13.get(r11)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r13 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r13
            r23 = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r7 = r13.f5125P
            r12 = r7[r10]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r12 != r10) goto L_0x00bd
            r12 = 1
            goto L_0x00be
        L_0x00bd:
            r12 = 0
        L_0x00be:
            r18 = 1
            r7 = r7[r18]
            if (r7 != r10) goto L_0x00c6
            r7 = 1
            goto L_0x00c7
        L_0x00c6:
            r7 = 0
        L_0x00c7:
            if (r12 == 0) goto L_0x00d3
            if (r7 == 0) goto L_0x00d3
            float r7 = r13.f5129T
            int r7 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r7 <= 0) goto L_0x00d3
            r7 = 1
            goto L_0x00d4
        L_0x00d3:
            r7 = 0
        L_0x00d4:
            boolean r10 = r13.mo8296x()
            if (r10 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00dd
            goto L_0x0100
        L_0x00dd:
            boolean r10 = r13.mo8297y()
            if (r10 == 0) goto L_0x00e6
            if (r7 == 0) goto L_0x00e6
            goto L_0x0100
        L_0x00e6:
            boolean r7 = r13 instanceof androidx.constraintlayout.solver.widgets.C2226h
            if (r7 == 0) goto L_0x00eb
            goto L_0x0100
        L_0x00eb:
            boolean r7 = r13.mo8296x()
            if (r7 != 0) goto L_0x0100
            boolean r7 = r13.mo8297y()
            if (r7 == 0) goto L_0x00f8
            goto L_0x0100
        L_0x00f8:
            int r11 = r11 + 1
            r12 = r21
            r7 = r23
            r10 = 0
            goto L_0x00a7
        L_0x0100:
            r7 = 0
            goto L_0x0106
        L_0x0102:
            r23 = r7
            r7 = r23
        L_0x0106:
            r10 = 1073741824(0x40000000, float:2.0)
            if (r8 != r10) goto L_0x010c
            if (r9 == r10) goto L_0x010e
        L_0x010c:
            if (r5 == 0) goto L_0x0110
        L_0x010e:
            r11 = 1
            goto L_0x0111
        L_0x0110:
            r11 = 0
        L_0x0111:
            r7 = r7 & r11
            if (r7 == 0) goto L_0x03b8
            int[] r12 = r6.f5174x
            r13 = 0
            r12 = r12[r13]
            int r12 = java.lang.Math.min(r12, r14)
            int[] r13 = r6.f5174x
            r14 = 1
            r13 = r13[r14]
            int r13 = java.lang.Math.min(r13, r15)
            if (r8 != r10) goto L_0x0135
            int r15 = r22.mo8289r()
            if (r15 == r12) goto L_0x0135
            r6.mo8272L(r12)
            androidx.constraintlayout.solver.widgets.analyzer.e r12 = r6.f5271r0
            r12.f5222b = r14
        L_0x0135:
            if (r9 != r10) goto L_0x0146
            int r12 = r22.mo8286o()
            if (r12 == r13) goto L_0x0146
            r6.mo8269I(r13)
            androidx.constraintlayout.solver.widgets.analyzer.e r12 = r6.f5271r0
            r13 = 1
            r12.f5222b = r13
            goto L_0x0147
        L_0x0146:
            r13 = 1
        L_0x0147:
            if (r8 != r10) goto L_0x0311
            if (r9 != r10) goto L_0x0311
            androidx.constraintlayout.solver.widgets.analyzer.e r12 = r6.f5271r0
            r5 = r5 & r13
            boolean r13 = r12.f5222b
            if (r13 != 0) goto L_0x0159
            boolean r13 = r12.f5223c
            if (r13 == 0) goto L_0x0157
            goto L_0x0159
        L_0x0157:
            r15 = 0
            goto L_0x0196
        L_0x0159:
            androidx.constraintlayout.solver.widgets.d r13 = r12.f5221a
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r13 = r13.f16944p0
            java.util.Iterator r13 = r13.iterator()
        L_0x0161:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x017e
            java.lang.Object r14 = r13.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r14 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r14
            r14.mo8283l()
            r15 = 0
            r14.f5136a = r15
            androidx.constraintlayout.solver.widgets.analyzer.k r11 = r14.f5142d
            r11.mo8329n()
            androidx.constraintlayout.solver.widgets.analyzer.m r11 = r14.f5144e
            r11.mo8331m()
            goto L_0x0161
        L_0x017e:
            r15 = 0
            androidx.constraintlayout.solver.widgets.d r11 = r12.f5221a
            r11.mo8283l()
            androidx.constraintlayout.solver.widgets.d r11 = r12.f5221a
            r11.f5136a = r15
            androidx.constraintlayout.solver.widgets.analyzer.k r11 = r11.f5142d
            r11.mo8329n()
            androidx.constraintlayout.solver.widgets.d r11 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r11 = r11.f5144e
            r11.mo8331m()
            r12.f5223c = r15
        L_0x0196:
            androidx.constraintlayout.solver.widgets.d r11 = r12.f5224d
            r12.mo8321b(r11)
            androidx.constraintlayout.solver.widgets.d r11 = r12.f5221a
            r11.f5131V = r15
            r11.f5132W = r15
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r11.mo8285n(r15)
            androidx.constraintlayout.solver.widgets.d r13 = r12.f5221a
            r14 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r13 = r13.mo8285n(r14)
            boolean r14 = r12.f5222b
            if (r14 == 0) goto L_0x01b3
            r12.mo8322c()
        L_0x01b3:
            androidx.constraintlayout.solver.widgets.d r14 = r12.f5221a
            int r14 = r14.mo8290s()
            androidx.constraintlayout.solver.widgets.d r15 = r12.f5221a
            int r15 = r15.mo8291t()
            androidx.constraintlayout.solver.widgets.d r10 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.k r10 = r10.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.f5202h
            r10.mo8304d(r14)
            androidx.constraintlayout.solver.widgets.d r10 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r10 = r10.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r10.f5202h
            r10.mo8304d(r15)
            r12.mo8326g()
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 == r10) goto L_0x01e0
            if (r13 != r10) goto L_0x01db
            goto L_0x01e0
        L_0x01db:
            r20 = r1
            r19 = r7
            goto L_0x024c
        L_0x01e0:
            if (r5 == 0) goto L_0x01fb
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r10 = r12.f5225e
            java.util.Iterator r10 = r10.iterator()
        L_0x01e8:
            boolean r19 = r10.hasNext()
            if (r19 == 0) goto L_0x01fb
            java.lang.Object r19 = r10.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r19 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r19
            boolean r19 = r19.mo8312k()
            if (r19 != 0) goto L_0x01e8
            r5 = 0
        L_0x01fb:
            if (r5 == 0) goto L_0x0224
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r11 != r10) goto L_0x0224
            androidx.constraintlayout.solver.widgets.d r10 = r12.f5221a
            r19 = r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r10.mo8270J(r7)
            androidx.constraintlayout.solver.widgets.d r7 = r12.f5221a
            r20 = r1
            r10 = 0
            int r1 = r12.mo8323d(r7, r10)
            r7.mo8272L(r1)
            androidx.constraintlayout.solver.widgets.d r1 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.k r7 = r1.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r7 = r7.f5199e
            int r1 = r1.mo8289r()
            r7.mo8304d(r1)
            goto L_0x0228
        L_0x0224:
            r20 = r1
            r19 = r7
        L_0x0228:
            if (r5 == 0) goto L_0x024c
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r13 != r1) goto L_0x024c
            androidx.constraintlayout.solver.widgets.d r1 = r12.f5221a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r5 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            r1.mo8271K(r5)
            androidx.constraintlayout.solver.widgets.d r1 = r12.f5221a
            r5 = 1
            int r7 = r12.mo8323d(r1, r5)
            r1.mo8269I(r7)
            androidx.constraintlayout.solver.widgets.d r1 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r5 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r5 = r5.f5199e
            int r1 = r1.mo8286o()
            r5.mo8304d(r1)
        L_0x024c:
            androidx.constraintlayout.solver.widgets.d r1 = r12.f5221a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f5125P
            r7 = 0
            r5 = r5[r7]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.FIXED
            if (r5 == r7) goto L_0x025e
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r10 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r10) goto L_0x025c
            goto L_0x025e
        L_0x025c:
            r1 = 0
            goto L_0x02a2
        L_0x025e:
            int r1 = r1.mo8289r()
            int r1 = r1 + r14
            androidx.constraintlayout.solver.widgets.d r5 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.k r5 = r5.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.f5203i
            r5.mo8304d(r1)
            androidx.constraintlayout.solver.widgets.d r5 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.k r5 = r5.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r5 = r5.f5199e
            int r1 = r1 - r14
            r5.mo8304d(r1)
            r12.mo8326g()
            androidx.constraintlayout.solver.widgets.d r1 = r12.f5221a
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r5 = r1.f5125P
            r10 = 1
            r5 = r5[r10]
            if (r5 == r7) goto L_0x0286
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r7 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT
            if (r5 != r7) goto L_0x029e
        L_0x0286:
            int r1 = r1.mo8286o()
            int r1 = r1 + r15
            androidx.constraintlayout.solver.widgets.d r5 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r5 = r5.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r5 = r5.f5203i
            r5.mo8304d(r1)
            androidx.constraintlayout.solver.widgets.d r5 = r12.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r5 = r5.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r5 = r5.f5199e
            int r1 = r1 - r15
            r5.mo8304d(r1)
        L_0x029e:
            r12.mo8326g()
            r1 = 1
        L_0x02a2:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r5 = r12.f5225e
            java.util.Iterator r5 = r5.iterator()
        L_0x02a8:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x02c3
            java.lang.Object r7 = r5.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r7.f5196b
            androidx.constraintlayout.solver.widgets.d r14 = r12.f5221a
            if (r10 != r14) goto L_0x02bf
            boolean r10 = r7.f5201g
            if (r10 != 0) goto L_0x02bf
            goto L_0x02a8
        L_0x02bf:
            r7.mo8308e()
            goto L_0x02a8
        L_0x02c3:
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.analyzer.WidgetRun> r5 = r12.f5225e
            java.util.Iterator r5 = r5.iterator()
        L_0x02c9:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0300
            java.lang.Object r7 = r5.next()
            androidx.constraintlayout.solver.widgets.analyzer.WidgetRun r7 = (androidx.constraintlayout.solver.widgets.analyzer.WidgetRun) r7
            if (r1 != 0) goto L_0x02de
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = r7.f5196b
            androidx.constraintlayout.solver.widgets.d r14 = r12.f5221a
            if (r10 != r14) goto L_0x02de
            goto L_0x02c9
        L_0x02de:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r7.f5202h
            boolean r10 = r10.f5192j
            if (r10 != 0) goto L_0x02e5
            goto L_0x02fe
        L_0x02e5:
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r10 = r7.f5203i
            boolean r10 = r10.f5192j
            if (r10 != 0) goto L_0x02f0
            boolean r10 = r7 instanceof androidx.constraintlayout.solver.widgets.analyzer.C2209i
            if (r10 != 0) goto L_0x02f0
            goto L_0x02fe
        L_0x02f0:
            androidx.constraintlayout.solver.widgets.analyzer.f r10 = r7.f5199e
            boolean r10 = r10.f5192j
            if (r10 != 0) goto L_0x02c9
            boolean r10 = r7 instanceof androidx.constraintlayout.solver.widgets.analyzer.C2203c
            if (r10 != 0) goto L_0x02c9
            boolean r7 = r7 instanceof androidx.constraintlayout.solver.widgets.analyzer.C2209i
            if (r7 != 0) goto L_0x02c9
        L_0x02fe:
            r1 = 0
            goto L_0x0301
        L_0x0300:
            r1 = 1
        L_0x0301:
            androidx.constraintlayout.solver.widgets.d r5 = r12.f5221a
            r5.mo8270J(r11)
            androidx.constraintlayout.solver.widgets.d r5 = r12.f5221a
            r5.mo8271K(r13)
            r5 = r1
            r1 = 1073741824(0x40000000, float:2.0)
            r11 = 2
            goto L_0x03a8
        L_0x0311:
            r20 = r1
            r19 = r7
            androidx.constraintlayout.solver.widgets.analyzer.e r1 = r6.f5271r0
            boolean r7 = r1.f5222b
            if (r7 == 0) goto L_0x0372
            androidx.constraintlayout.solver.widgets.d r7 = r1.f5221a
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r7 = r7.f16944p0
            java.util.Iterator r7 = r7.iterator()
        L_0x0323:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x034c
            java.lang.Object r10 = r7.next()
            androidx.constraintlayout.solver.widgets.ConstraintWidget r10 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r10
            r10.mo8283l()
            r11 = 0
            r10.f5136a = r11
            androidx.constraintlayout.solver.widgets.analyzer.k r12 = r10.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r13 = r12.f5199e
            r13.f5192j = r11
            r12.f5201g = r11
            r12.mo8329n()
            androidx.constraintlayout.solver.widgets.analyzer.m r10 = r10.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r12 = r10.f5199e
            r12.f5192j = r11
            r10.f5201g = r11
            r10.mo8331m()
            goto L_0x0323
        L_0x034c:
            r11 = 0
            androidx.constraintlayout.solver.widgets.d r7 = r1.f5221a
            r7.mo8283l()
            androidx.constraintlayout.solver.widgets.d r7 = r1.f5221a
            r7.f5136a = r11
            androidx.constraintlayout.solver.widgets.analyzer.k r7 = r7.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r10 = r7.f5199e
            r10.f5192j = r11
            r7.f5201g = r11
            r7.mo8329n()
            androidx.constraintlayout.solver.widgets.d r7 = r1.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r7 = r7.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r10 = r7.f5199e
            r10.f5192j = r11
            r7.f5201g = r11
            r7.mo8331m()
            r1.mo8322c()
            goto L_0x0373
        L_0x0372:
            r11 = 0
        L_0x0373:
            androidx.constraintlayout.solver.widgets.d r7 = r1.f5224d
            r1.mo8321b(r7)
            androidx.constraintlayout.solver.widgets.d r7 = r1.f5221a
            r7.f5131V = r11
            r7.f5132W = r11
            androidx.constraintlayout.solver.widgets.analyzer.k r7 = r7.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r7 = r7.f5202h
            r7.mo8304d(r11)
            androidx.constraintlayout.solver.widgets.d r1 = r1.f5221a
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r1.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.DependencyNode r1 = r1.f5202h
            r1.mo8304d(r11)
            r1 = 1073741824(0x40000000, float:2.0)
            if (r8 != r1) goto L_0x039a
            boolean r7 = r6.mo8342S(r11, r5)
            r10 = 1
            r7 = r7 & r10
            r11 = r10
            goto L_0x039d
        L_0x039a:
            r10 = 1
            r7 = r10
            r11 = 0
        L_0x039d:
            if (r9 != r1) goto L_0x03a7
            boolean r5 = r6.mo8342S(r10, r5)
            r5 = r5 & r7
            int r11 = r11 + 1
            goto L_0x03a8
        L_0x03a7:
            r5 = r7
        L_0x03a8:
            if (r5 == 0) goto L_0x03be
            if (r8 != r1) goto L_0x03ae
            r7 = 1
            goto L_0x03af
        L_0x03ae:
            r7 = 0
        L_0x03af:
            if (r9 != r1) goto L_0x03b3
            r1 = 1
            goto L_0x03b4
        L_0x03b3:
            r1 = 0
        L_0x03b4:
            r6.mo8273M(r7, r1)
            goto L_0x03be
        L_0x03b8:
            r20 = r1
            r19 = r7
            r5 = 0
            r11 = 0
        L_0x03be:
            if (r5 == 0) goto L_0x03c3
            r1 = 2
            if (r11 == r1) goto L_0x0692
        L_0x03c3:
            int r1 = r6.f5262B0
            if (r2 <= 0) goto L_0x04a6
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r6.f16944p0
            int r5 = r5.size()
            r7 = 64
            boolean r7 = r6.mo8343U(r7)
            androidx.constraintlayout.solver.widgets.analyzer.b$b r8 = r6.f5272s0
            r13 = 0
        L_0x03d6:
            if (r13 >= r5) goto L_0x0464
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r9 = r6.f16944p0
            java.lang.Object r9 = r9.get(r13)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r9 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r9
            boolean r10 = r9 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r10 == 0) goto L_0x03e6
            goto L_0x0460
        L_0x03e6:
            boolean r10 = r9 instanceof androidx.constraintlayout.solver.widgets.C2197a
            if (r10 == 0) goto L_0x03ec
            goto L_0x0460
        L_0x03ec:
            boolean r10 = r9.f5111B
            if (r10 == 0) goto L_0x03f2
            goto L_0x0460
        L_0x03f2:
            if (r7 == 0) goto L_0x0409
            androidx.constraintlayout.solver.widgets.analyzer.k r10 = r9.f5142d
            if (r10 == 0) goto L_0x0409
            androidx.constraintlayout.solver.widgets.analyzer.m r11 = r9.f5144e
            if (r11 == 0) goto L_0x0409
            androidx.constraintlayout.solver.widgets.analyzer.f r10 = r10.f5199e
            boolean r10 = r10.f5192j
            if (r10 == 0) goto L_0x0409
            androidx.constraintlayout.solver.widgets.analyzer.f r10 = r11.f5199e
            boolean r10 = r10.f5192j
            if (r10 == 0) goto L_0x0409
            goto L_0x0460
        L_0x0409:
            r10 = 0
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r11 = r9.mo8285n(r10)
            r10 = 1
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r12 = r9.mo8285n(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r14 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT
            if (r11 != r14) goto L_0x0423
            int r15 = r9.f5160m
            if (r15 == r10) goto L_0x0423
            if (r12 != r14) goto L_0x0423
            int r15 = r9.f5162n
            if (r15 == r10) goto L_0x0423
            r15 = r10
            goto L_0x0424
        L_0x0423:
            r15 = 0
        L_0x0424:
            if (r15 != 0) goto L_0x0459
            boolean r18 = r6.mo8343U(r10)
            if (r18 == 0) goto L_0x0459
            boolean r10 = r9 instanceof androidx.constraintlayout.solver.widgets.C2226h
            if (r10 != 0) goto L_0x0459
            if (r11 != r14) goto L_0x043f
            int r10 = r9.f5160m
            if (r10 != 0) goto L_0x043f
            if (r12 == r14) goto L_0x043f
            boolean r10 = r9.mo8296x()
            if (r10 != 0) goto L_0x043f
            r15 = 1
        L_0x043f:
            if (r12 != r14) goto L_0x044e
            int r10 = r9.f5162n
            if (r10 != 0) goto L_0x044e
            if (r11 == r14) goto L_0x044e
            boolean r10 = r9.mo8296x()
            if (r10 != 0) goto L_0x044e
            r15 = 1
        L_0x044e:
            if (r11 == r14) goto L_0x0452
            if (r12 != r14) goto L_0x0459
        L_0x0452:
            float r10 = r9.f5129T
            int r10 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r10 <= 0) goto L_0x0459
            r15 = 1
        L_0x0459:
            if (r15 == 0) goto L_0x045c
            goto L_0x0460
        L_0x045c:
            r10 = 0
            r0.mo8314a(r8, r9, r10)
        L_0x0460:
            int r13 = r13 + 1
            goto L_0x03d6
        L_0x0464:
            androidx.constraintlayout.widget.ConstraintLayout$b r8 = (androidx.constraintlayout.widget.ConstraintLayout.C2235b) r8
            androidx.constraintlayout.widget.ConstraintLayout r5 = r8.f5363a
            int r5 = r5.getChildCount()
            r13 = 0
        L_0x046d:
            if (r13 >= r5) goto L_0x0483
            androidx.constraintlayout.widget.ConstraintLayout r7 = r8.f5363a
            android.view.View r7 = r7.getChildAt(r13)
            boolean r9 = r7 instanceof androidx.constraintlayout.widget.Placeholder
            if (r9 == 0) goto L_0x0480
            androidx.constraintlayout.widget.Placeholder r7 = (androidx.constraintlayout.widget.Placeholder) r7
            androidx.constraintlayout.widget.ConstraintLayout r9 = r8.f5363a
            r7.updatePostMeasure(r9)
        L_0x0480:
            int r13 = r13 + 1
            goto L_0x046d
        L_0x0483:
            androidx.constraintlayout.widget.ConstraintLayout r5 = r8.f5363a
            java.util.ArrayList r5 = r5.mConstraintHelpers
            int r5 = r5.size()
            if (r5 <= 0) goto L_0x04a6
            r13 = 0
        L_0x0490:
            if (r13 >= r5) goto L_0x04a6
            androidx.constraintlayout.widget.ConstraintLayout r7 = r8.f5363a
            java.util.ArrayList r7 = r7.mConstraintHelpers
            java.lang.Object r7 = r7.get(r13)
            androidx.constraintlayout.widget.ConstraintHelper r7 = (androidx.constraintlayout.widget.ConstraintHelper) r7
            androidx.constraintlayout.widget.ConstraintLayout r9 = r8.f5363a
            r7.updatePostMeasure(r9)
            int r13 = r13 + 1
            goto L_0x0490
        L_0x04a6:
            r0.mo8316c(r6)
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r5 = r0.f5206a
            int r5 = r5.size()
            if (r2 <= 0) goto L_0x04b4
            r0.mo8315b(r6, r3, r4)
        L_0x04b4:
            if (r5 <= 0) goto L_0x0684
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour[] r2 = r6.f5125P
            r18 = 0
            r7 = r2[r18]
            androidx.constraintlayout.solver.widgets.ConstraintWidget$DimensionBehaviour r8 = androidx.constraintlayout.solver.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT
            if (r7 != r8) goto L_0x04c2
            r7 = 1
            goto L_0x04c4
        L_0x04c2:
            r7 = r18
        L_0x04c4:
            r9 = 1
            r2 = r2[r9]
            if (r2 != r8) goto L_0x04cb
            r2 = 1
            goto L_0x04cd
        L_0x04cb:
            r2 = r18
        L_0x04cd:
            int r8 = r22.mo8289r()
            androidx.constraintlayout.solver.widgets.d r9 = r0.f5208c
            int r9 = r9.f5134Y
            int r8 = java.lang.Math.max(r8, r9)
            int r9 = r22.mo8286o()
            androidx.constraintlayout.solver.widgets.d r10 = r0.f5208c
            int r10 = r10.f5135Z
            int r9 = java.lang.Math.max(r9, r10)
            r10 = r18
            r13 = r10
        L_0x04e8:
            if (r13 >= r5) goto L_0x0579
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r11 = r0.f5206a
            java.lang.Object r11 = r11.get(r13)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r11 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r11
            boolean r12 = r11 instanceof androidx.constraintlayout.solver.widgets.C2226h
            if (r12 != 0) goto L_0x04fc
            r16 = r1
            r15 = r20
            goto L_0x0571
        L_0x04fc:
            int r12 = r11.mo8289r()
            int r14 = r11.mo8286o()
            r16 = r1
            r15 = r20
            r1 = 1
            boolean r17 = r0.mo8314a(r15, r11, r1)
            r1 = r10 | r17
            int r10 = r11.mo8289r()
            r24 = r1
            int r1 = r11.mo8286o()
            if (r10 == r12) goto L_0x0541
            r11.mo8272L(r10)
            if (r7 == 0) goto L_0x053f
            int r10 = r11.mo8290s()
            int r12 = r11.f5127R
            int r10 = r10 + r12
            if (r10 <= r8) goto L_0x053f
            int r10 = r11.mo8290s()
            int r12 = r11.f5127R
            int r10 = r10 + r12
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r12 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r12 = r11.mo8284m(r12)
            int r12 = r12.mo8252e()
            int r12 = r12 + r10
            int r8 = java.lang.Math.max(r8, r12)
        L_0x053f:
            r10 = 1
            goto L_0x0543
        L_0x0541:
            r10 = r24
        L_0x0543:
            if (r1 == r14) goto L_0x056b
            r11.mo8269I(r1)
            if (r2 == 0) goto L_0x056a
            int r1 = r11.mo8291t()
            int r10 = r11.f5128S
            int r1 = r1 + r10
            if (r1 <= r9) goto L_0x056a
            int r1 = r11.mo8291t()
            int r10 = r11.f5128S
            int r1 = r1 + r10
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r10 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r10 = r11.mo8284m(r10)
            int r10 = r10.mo8252e()
            int r10 = r10 + r1
            int r1 = java.lang.Math.max(r9, r10)
            r9 = r1
        L_0x056a:
            r10 = 1
        L_0x056b:
            androidx.constraintlayout.solver.widgets.h r11 = (androidx.constraintlayout.solver.widgets.C2226h) r11
            boolean r1 = r11.f5339x0
            r1 = r1 | r10
            r10 = r1
        L_0x0571:
            int r13 = r13 + 1
            r20 = r15
            r1 = r16
            goto L_0x04e8
        L_0x0579:
            r16 = r1
            r15 = r20
            r13 = r18
        L_0x057f:
            r1 = 2
            if (r13 >= r1) goto L_0x065f
            r11 = r10
            r10 = r18
        L_0x0585:
            if (r10 >= r5) goto L_0x0647
            java.util.ArrayList<androidx.constraintlayout.solver.widgets.ConstraintWidget> r12 = r0.f5206a
            java.lang.Object r12 = r12.get(r10)
            androidx.constraintlayout.solver.widgets.ConstraintWidget r12 = (androidx.constraintlayout.solver.widgets.ConstraintWidget) r12
            boolean r14 = r12 instanceof p203p0.C7646a
            if (r14 == 0) goto L_0x0597
            boolean r14 = r12 instanceof androidx.constraintlayout.solver.widgets.C2226h
            if (r14 == 0) goto L_0x05ba
        L_0x0597:
            boolean r14 = r12 instanceof androidx.constraintlayout.solver.widgets.C2223f
            if (r14 == 0) goto L_0x059c
            goto L_0x05ba
        L_0x059c:
            int r14 = r12.f5143d0
            r1 = 8
            if (r14 != r1) goto L_0x05a3
            goto L_0x05ba
        L_0x05a3:
            if (r19 == 0) goto L_0x05b6
            androidx.constraintlayout.solver.widgets.analyzer.k r1 = r12.f5142d
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r1.f5199e
            boolean r1 = r1.f5192j
            if (r1 == 0) goto L_0x05b6
            androidx.constraintlayout.solver.widgets.analyzer.m r1 = r12.f5144e
            androidx.constraintlayout.solver.widgets.analyzer.f r1 = r1.f5199e
            boolean r1 = r1.f5192j
            if (r1 == 0) goto L_0x05b6
            goto L_0x05ba
        L_0x05b6:
            boolean r1 = r12 instanceof androidx.constraintlayout.solver.widgets.C2226h
            if (r1 == 0) goto L_0x05c0
        L_0x05ba:
            r17 = r3
            r24 = r5
            goto L_0x063e
        L_0x05c0:
            int r1 = r12.mo8289r()
            int r14 = r12.mo8286o()
            r24 = r5
            int r5 = r12.f5133X
            r17 = r3
            r3 = 1
            if (r13 != r3) goto L_0x05d2
            r3 = 2
        L_0x05d2:
            boolean r3 = r0.mo8314a(r15, r12, r3)
            r3 = r3 | r11
            int r11 = r12.mo8289r()
            r20 = r3
            int r3 = r12.mo8286o()
            if (r11 == r1) goto L_0x0609
            r12.mo8272L(r11)
            if (r7 == 0) goto L_0x0607
            int r1 = r12.mo8290s()
            int r11 = r12.f5127R
            int r1 = r1 + r11
            if (r1 <= r8) goto L_0x0607
            int r1 = r12.mo8290s()
            int r11 = r12.f5127R
            int r1 = r1 + r11
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r11 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.RIGHT
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r11 = r12.mo8284m(r11)
            int r11 = r11.mo8252e()
            int r11 = r11 + r1
            int r8 = java.lang.Math.max(r8, r11)
        L_0x0607:
            r20 = 1
        L_0x0609:
            if (r3 == r14) goto L_0x0632
            r12.mo8269I(r3)
            if (r2 == 0) goto L_0x0630
            int r1 = r12.mo8291t()
            int r3 = r12.f5128S
            int r1 = r1 + r3
            if (r1 <= r9) goto L_0x0630
            int r1 = r12.mo8291t()
            int r3 = r12.f5128S
            int r1 = r1 + r3
            androidx.constraintlayout.solver.widgets.ConstraintAnchor$Type r3 = androidx.constraintlayout.solver.widgets.ConstraintAnchor.Type.BOTTOM
            androidx.constraintlayout.solver.widgets.ConstraintAnchor r3 = r12.mo8284m(r3)
            int r3 = r3.mo8252e()
            int r3 = r3 + r1
            int r1 = java.lang.Math.max(r9, r3)
            r9 = r1
        L_0x0630:
            r20 = 1
        L_0x0632:
            boolean r1 = r12.f5176z
            if (r1 == 0) goto L_0x063c
            int r1 = r12.f5133X
            if (r5 == r1) goto L_0x063c
            r11 = 1
            goto L_0x063e
        L_0x063c:
            r11 = r20
        L_0x063e:
            int r10 = r10 + 1
            r5 = r24
            r3 = r17
            r1 = 2
            goto L_0x0585
        L_0x0647:
            r17 = r3
            r24 = r5
            if (r11 == 0) goto L_0x065b
            r1 = r17
            r0.mo8315b(r6, r1, r4)
            int r13 = r13 + 1
            r5 = r24
            r3 = r1
            r10 = r18
            goto L_0x057f
        L_0x065b:
            r1 = r17
            r10 = r11
            goto L_0x0660
        L_0x065f:
            r1 = r3
        L_0x0660:
            if (r10 == 0) goto L_0x0686
            r0.mo8315b(r6, r1, r4)
            int r2 = r22.mo8289r()
            if (r2 >= r8) goto L_0x0670
            r6.mo8272L(r8)
            r10 = 1
            goto L_0x0672
        L_0x0670:
            r10 = r18
        L_0x0672:
            int r2 = r22.mo8286o()
            if (r2 >= r9) goto L_0x067d
            r6.mo8269I(r9)
            r13 = 1
            goto L_0x067e
        L_0x067d:
            r13 = r10
        L_0x067e:
            if (r13 == 0) goto L_0x0686
            r0.mo8315b(r6, r1, r4)
            goto L_0x0686
        L_0x0684:
            r16 = r1
        L_0x0686:
            r0 = r16
            r6.f5262B0 = r0
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r6.mo8343U(r0)
            androidx.constraintlayout.solver.C2190c.f5077p = r0
        L_0x0692:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.resolveSystem(androidx.constraintlayout.solver.widgets.d, int, int, int):void");
    }

    public void setConstraintSet(C2236a aVar) {
        this.mConstraintSet = aVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C7712b bVar) {
        C7709a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        C2220d dVar = this.mLayoutWidget;
        dVar.f5262B0 = i;
        C2190c.f5077p = dVar.mo8343U(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN);
    }

    public void setSelfDimensionBehaviour(C2220d dVar, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        C2235b bVar = this.mMeasurer;
        int i5 = bVar.f5367e;
        int i6 = bVar.f5366d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
            } else if (i != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                i2 = Math.min(this.mMaxWidth - i6, i2);
                dimensionBehaviour = dimensionBehaviour2;
            }
            i2 = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (!(i2 == dVar.mo8289r() && i4 == dVar.mo8286o())) {
            dVar.f5271r0.f5223c = true;
        }
        dVar.f5131V = 0;
        dVar.f5132W = 0;
        int[] iArr = dVar.f5174x;
        iArr[0] = this.mMaxWidth - i6;
        iArr[1] = this.mMaxHeight - i5;
        dVar.f5134Y = 0;
        dVar.f5135Z = 0;
        dVar.mo8270J(dimensionBehaviour);
        dVar.mo8272L(i2);
        dVar.mo8271K(dimensionBehaviour2);
        dVar.mo8269I(i4);
        int i7 = this.mMinWidth - i6;
        if (i7 < 0) {
            dVar.f5134Y = 0;
        } else {
            dVar.f5134Y = i7;
        }
        int i8 = this.mMinHeight - i5;
        if (i8 < 0) {
            dVar.f5135Z = 0;
        } else {
            dVar.f5135Z = i8;
        }
    }

    public void setState(int i, int i2, int i3) {
        C7709a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.mo20178b(i, (float) i2, (float) i3);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(attributeSet, i, i2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public static final int BASELINE = 5;
        public static final int BOTTOM = 4;
        public static final int CHAIN_PACKED = 2;
        public static final int CHAIN_SPREAD = 0;
        public static final int CHAIN_SPREAD_INSIDE = 1;
        public static final int END = 7;
        public static final int HORIZONTAL = 0;
        public static final int LEFT = 1;
        public static final int MATCH_CONSTRAINT = 0;
        public static final int MATCH_CONSTRAINT_PERCENT = 2;
        public static final int MATCH_CONSTRAINT_SPREAD = 0;
        public static final int MATCH_CONSTRAINT_WRAP = 1;
        public static final int PARENT_ID = 0;
        public static final int RIGHT = 2;
        public static final int START = 6;
        public static final int TOP = 3;
        public static final int UNSET = -1;
        public static final int VERTICAL = 1;
        public int baselineToBaseline = -1;
        public int bottomToBottom = -1;
        public int bottomToTop = -1;
        public float circleAngle = 0.0f;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public boolean constrainedHeight = false;
        public boolean constrainedWidth = false;
        public String constraintTag = null;
        public String dimensionRatio = null;
        public int dimensionRatioSide = 1;
        public float dimensionRatioValue = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int endToEnd = -1;
        public int endToStart = -1;
        public int goneBottomMargin = -1;
        public int goneEndMargin = -1;
        public int goneLeftMargin = -1;
        public int goneRightMargin = -1;
        public int goneStartMargin = -1;
        public int goneTopMargin = -1;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean helped = false;
        public float horizontalBias = 0.5f;
        public int horizontalChainStyle = 0;
        public boolean horizontalDimensionFixed = true;
        public float horizontalWeight = -1.0f;
        public boolean isGuideline = false;
        public boolean isHelper = false;
        public boolean isInPlaceholder = false;
        public boolean isVirtualGroup = false;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int matchConstraintDefaultHeight = 0;
        public int matchConstraintDefaultWidth = 0;
        public int matchConstraintMaxHeight = 0;
        public int matchConstraintMaxWidth = 0;
        public int matchConstraintMinHeight = 0;
        public int matchConstraintMinWidth = 0;
        public float matchConstraintPercentHeight = 1.0f;
        public float matchConstraintPercentWidth = 1.0f;
        public boolean needsBaseline = false;
        public int orientation = -1;
        public int resolveGoneLeftMargin = -1;
        public int resolveGoneRightMargin = -1;
        public int resolvedGuideBegin;
        public int resolvedGuideEnd;
        public float resolvedGuidePercent;
        public float resolvedHorizontalBias = 0.5f;
        public int resolvedLeftToLeft = -1;
        public int resolvedLeftToRight = -1;
        public int resolvedRightToLeft = -1;
        public int resolvedRightToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int topToBottom = -1;
        public int topToTop = -1;
        public float verticalBias = 0.5f;
        public int verticalChainStyle = 0;
        public boolean verticalDimensionFixed = true;
        public float verticalWeight = -1.0f;
        public ConstraintWidget widget = new ConstraintWidget();

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$LayoutParams$a */
        public static class C2233a {

            /* renamed from: a */
            public static final SparseIntArray f5361a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f5361a = sparseIntArray;
                sparseIntArray.append(64, 8);
                sparseIntArray.append(65, 9);
                sparseIntArray.append(67, 10);
                sparseIntArray.append(68, 11);
                sparseIntArray.append(74, 12);
                sparseIntArray.append(73, 13);
                sparseIntArray.append(46, 14);
                sparseIntArray.append(45, 15);
                sparseIntArray.append(43, 16);
                sparseIntArray.append(47, 2);
                sparseIntArray.append(49, 3);
                sparseIntArray.append(48, 4);
                sparseIntArray.append(82, 49);
                sparseIntArray.append(83, 50);
                sparseIntArray.append(53, 5);
                sparseIntArray.append(54, 6);
                sparseIntArray.append(55, 7);
                sparseIntArray.append(0, 1);
                sparseIntArray.append(69, 17);
                sparseIntArray.append(70, 18);
                sparseIntArray.append(52, 19);
                sparseIntArray.append(51, 20);
                sparseIntArray.append(86, 21);
                sparseIntArray.append(89, 22);
                sparseIntArray.append(87, 23);
                sparseIntArray.append(84, 24);
                sparseIntArray.append(88, 25);
                sparseIntArray.append(85, 26);
                sparseIntArray.append(60, 29);
                sparseIntArray.append(75, 30);
                sparseIntArray.append(50, 44);
                sparseIntArray.append(62, 45);
                sparseIntArray.append(77, 46);
                sparseIntArray.append(61, 47);
                sparseIntArray.append(76, 48);
                sparseIntArray.append(41, 27);
                sparseIntArray.append(40, 28);
                sparseIntArray.append(78, 31);
                sparseIntArray.append(56, 32);
                sparseIntArray.append(80, 33);
                sparseIntArray.append(79, 34);
                sparseIntArray.append(81, 35);
                sparseIntArray.append(58, 36);
                sparseIntArray.append(57, 37);
                sparseIntArray.append(59, 38);
                sparseIntArray.append(63, 39);
                sparseIntArray.append(72, 40);
                sparseIntArray.append(66, 41);
                sparseIntArray.append(44, 42);
                sparseIntArray.append(42, 43);
                sparseIntArray.append(71, 51);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.guideBegin = layoutParams.guideBegin;
            this.guideEnd = layoutParams.guideEnd;
            this.guidePercent = layoutParams.guidePercent;
            this.leftToLeft = layoutParams.leftToLeft;
            this.leftToRight = layoutParams.leftToRight;
            this.rightToLeft = layoutParams.rightToLeft;
            this.rightToRight = layoutParams.rightToRight;
            this.topToTop = layoutParams.topToTop;
            this.topToBottom = layoutParams.topToBottom;
            this.bottomToTop = layoutParams.bottomToTop;
            this.bottomToBottom = layoutParams.bottomToBottom;
            this.baselineToBaseline = layoutParams.baselineToBaseline;
            this.circleConstraint = layoutParams.circleConstraint;
            this.circleRadius = layoutParams.circleRadius;
            this.circleAngle = layoutParams.circleAngle;
            this.startToEnd = layoutParams.startToEnd;
            this.startToStart = layoutParams.startToStart;
            this.endToStart = layoutParams.endToStart;
            this.endToEnd = layoutParams.endToEnd;
            this.goneLeftMargin = layoutParams.goneLeftMargin;
            this.goneTopMargin = layoutParams.goneTopMargin;
            this.goneRightMargin = layoutParams.goneRightMargin;
            this.goneBottomMargin = layoutParams.goneBottomMargin;
            this.goneStartMargin = layoutParams.goneStartMargin;
            this.goneEndMargin = layoutParams.goneEndMargin;
            this.horizontalBias = layoutParams.horizontalBias;
            this.verticalBias = layoutParams.verticalBias;
            this.dimensionRatio = layoutParams.dimensionRatio;
            this.dimensionRatioValue = layoutParams.dimensionRatioValue;
            this.dimensionRatioSide = layoutParams.dimensionRatioSide;
            this.horizontalWeight = layoutParams.horizontalWeight;
            this.verticalWeight = layoutParams.verticalWeight;
            this.horizontalChainStyle = layoutParams.horizontalChainStyle;
            this.verticalChainStyle = layoutParams.verticalChainStyle;
            this.constrainedWidth = layoutParams.constrainedWidth;
            this.constrainedHeight = layoutParams.constrainedHeight;
            this.matchConstraintDefaultWidth = layoutParams.matchConstraintDefaultWidth;
            this.matchConstraintDefaultHeight = layoutParams.matchConstraintDefaultHeight;
            this.matchConstraintMinWidth = layoutParams.matchConstraintMinWidth;
            this.matchConstraintMaxWidth = layoutParams.matchConstraintMaxWidth;
            this.matchConstraintMinHeight = layoutParams.matchConstraintMinHeight;
            this.matchConstraintMaxHeight = layoutParams.matchConstraintMaxHeight;
            this.matchConstraintPercentWidth = layoutParams.matchConstraintPercentWidth;
            this.matchConstraintPercentHeight = layoutParams.matchConstraintPercentHeight;
            this.editorAbsoluteX = layoutParams.editorAbsoluteX;
            this.editorAbsoluteY = layoutParams.editorAbsoluteY;
            this.orientation = layoutParams.orientation;
            this.horizontalDimensionFixed = layoutParams.horizontalDimensionFixed;
            this.verticalDimensionFixed = layoutParams.verticalDimensionFixed;
            this.needsBaseline = layoutParams.needsBaseline;
            this.isGuideline = layoutParams.isGuideline;
            this.resolvedLeftToLeft = layoutParams.resolvedLeftToLeft;
            this.resolvedLeftToRight = layoutParams.resolvedLeftToRight;
            this.resolvedRightToLeft = layoutParams.resolvedRightToLeft;
            this.resolvedRightToRight = layoutParams.resolvedRightToRight;
            this.resolveGoneLeftMargin = layoutParams.resolveGoneLeftMargin;
            this.resolveGoneRightMargin = layoutParams.resolveGoneRightMargin;
            this.resolvedHorizontalBias = layoutParams.resolvedHorizontalBias;
            this.constraintTag = layoutParams.constraintTag;
            this.widget = layoutParams.widget;
        }

        public String getConstraintTag() {
            return this.constraintTag;
        }

        public ConstraintWidget getConstraintWidget() {
            return this.widget;
        }

        public void reset() {
            ConstraintWidget constraintWidget = this.widget;
            if (constraintWidget != null) {
                constraintWidget.mo8263C();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0056  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0062  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x007c  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r10) {
            /*
                r9 = this;
                int r0 = r9.leftMargin
                int r1 = r9.rightMargin
                super.resolveLayoutDirection(r10)
                int r10 = r9.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r10) goto L_0x0011
                r10 = r3
                goto L_0x0012
            L_0x0011:
                r10 = r2
            L_0x0012:
                r4 = -1
                r9.resolvedRightToLeft = r4
                r9.resolvedRightToRight = r4
                r9.resolvedLeftToLeft = r4
                r9.resolvedLeftToRight = r4
                int r5 = r9.goneLeftMargin
                r9.resolveGoneLeftMargin = r5
                int r5 = r9.goneRightMargin
                r9.resolveGoneRightMargin = r5
                float r5 = r9.horizontalBias
                r9.resolvedHorizontalBias = r5
                int r6 = r9.guideBegin
                r9.resolvedGuideBegin = r6
                int r7 = r9.guideEnd
                r9.resolvedGuideEnd = r7
                float r8 = r9.guidePercent
                r9.resolvedGuidePercent = r8
                if (r10 == 0) goto L_0x008e
                int r10 = r9.startToEnd
                if (r10 == r4) goto L_0x003d
                r9.resolvedRightToLeft = r10
            L_0x003b:
                r2 = r3
                goto L_0x0044
            L_0x003d:
                int r10 = r9.startToStart
                if (r10 == r4) goto L_0x0044
                r9.resolvedRightToRight = r10
                goto L_0x003b
            L_0x0044:
                int r10 = r9.endToStart
                if (r10 == r4) goto L_0x004b
                r9.resolvedLeftToRight = r10
                r2 = r3
            L_0x004b:
                int r10 = r9.endToEnd
                if (r10 == r4) goto L_0x0052
                r9.resolvedLeftToLeft = r10
                r2 = r3
            L_0x0052:
                int r10 = r9.goneStartMargin
                if (r10 == r4) goto L_0x0058
                r9.resolveGoneRightMargin = r10
            L_0x0058:
                int r10 = r9.goneEndMargin
                if (r10 == r4) goto L_0x005e
                r9.resolveGoneLeftMargin = r10
            L_0x005e:
                r10 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0066
                float r2 = r10 - r5
                r9.resolvedHorizontalBias = r2
            L_0x0066:
                boolean r2 = r9.isGuideline
                if (r2 == 0) goto L_0x00b2
                int r2 = r9.orientation
                if (r2 != r3) goto L_0x00b2
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x007c
                float r10 = r10 - r8
                r9.resolvedGuidePercent = r10
                r9.resolvedGuideBegin = r4
                r9.resolvedGuideEnd = r4
                goto L_0x00b2
            L_0x007c:
                if (r6 == r4) goto L_0x0085
                r9.resolvedGuideEnd = r6
                r9.resolvedGuideBegin = r4
                r9.resolvedGuidePercent = r2
                goto L_0x00b2
            L_0x0085:
                if (r7 == r4) goto L_0x00b2
                r9.resolvedGuideBegin = r7
                r9.resolvedGuideEnd = r4
                r9.resolvedGuidePercent = r2
                goto L_0x00b2
            L_0x008e:
                int r10 = r9.startToEnd
                if (r10 == r4) goto L_0x0094
                r9.resolvedLeftToRight = r10
            L_0x0094:
                int r10 = r9.startToStart
                if (r10 == r4) goto L_0x009a
                r9.resolvedLeftToLeft = r10
            L_0x009a:
                int r10 = r9.endToStart
                if (r10 == r4) goto L_0x00a0
                r9.resolvedRightToLeft = r10
            L_0x00a0:
                int r10 = r9.endToEnd
                if (r10 == r4) goto L_0x00a6
                r9.resolvedRightToRight = r10
            L_0x00a6:
                int r10 = r9.goneStartMargin
                if (r10 == r4) goto L_0x00ac
                r9.resolveGoneLeftMargin = r10
            L_0x00ac:
                int r10 = r9.goneEndMargin
                if (r10 == r4) goto L_0x00b2
                r9.resolveGoneRightMargin = r10
            L_0x00b2:
                int r10 = r9.endToStart
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.endToEnd
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.startToStart
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.startToEnd
                if (r10 != r4) goto L_0x00fc
                int r10 = r9.rightToLeft
                if (r10 == r4) goto L_0x00d1
                r9.resolvedRightToLeft = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00df
                if (r1 <= 0) goto L_0x00df
                r9.rightMargin = r1
                goto L_0x00df
            L_0x00d1:
                int r10 = r9.rightToRight
                if (r10 == r4) goto L_0x00df
                r9.resolvedRightToRight = r10
                int r10 = r9.rightMargin
                if (r10 > 0) goto L_0x00df
                if (r1 <= 0) goto L_0x00df
                r9.rightMargin = r1
            L_0x00df:
                int r10 = r9.leftToLeft
                if (r10 == r4) goto L_0x00ee
                r9.resolvedLeftToLeft = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00fc
                if (r0 <= 0) goto L_0x00fc
                r9.leftMargin = r0
                goto L_0x00fc
            L_0x00ee:
                int r10 = r9.leftToRight
                if (r10 == r4) goto L_0x00fc
                r9.resolvedLeftToRight = r10
                int r10 = r9.leftMargin
                if (r10 > 0) goto L_0x00fc
                if (r0 <= 0) goto L_0x00fc
                r9.leftMargin = r0
            L_0x00fc:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.LayoutParams.resolveLayoutDirection(int):void");
        }

        public void setWidgetDebugName(String str) {
            this.widget.f5145e0 = str;
        }

        public void validate() {
            this.isGuideline = false;
            this.horizontalDimensionFixed = true;
            this.verticalDimensionFixed = true;
            int i = this.width;
            if (i == -2 && this.constrainedWidth) {
                this.horizontalDimensionFixed = false;
                if (this.matchConstraintDefaultWidth == 0) {
                    this.matchConstraintDefaultWidth = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.constrainedHeight) {
                this.verticalDimensionFixed = false;
                if (this.matchConstraintDefaultHeight == 0) {
                    this.matchConstraintDefaultHeight = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.horizontalDimensionFixed = false;
                if (i == 0 && this.matchConstraintDefaultWidth == 1) {
                    this.width = -2;
                    this.constrainedWidth = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.verticalDimensionFixed = false;
                if (i2 == 0 && this.matchConstraintDefaultHeight == 1) {
                    this.height = -2;
                    this.constrainedHeight = true;
                }
            }
            if (this.guidePercent != -1.0f || this.guideBegin != -1 || this.guideEnd != -1) {
                this.isGuideline = true;
                this.horizontalDimensionFixed = true;
                this.verticalDimensionFixed = true;
                if (!(this.widget instanceof C2223f)) {
                    this.widget = new C2223f();
                }
                ((C2223f) this.widget).mo8354P(this.orientation);
            }
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            int i;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C19421p.f43325o);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = C2233a.f5361a.get(index);
                switch (i3) {
                    case 1:
                        this.orientation = obtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.circleConstraint);
                        this.circleConstraint = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.circleConstraint = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.circleRadius = obtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.circleAngle) % 360.0f;
                        this.circleAngle = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.circleAngle = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.guideBegin = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 6:
                        this.guideEnd = obtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 7:
                        this.guidePercent = obtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.leftToLeft);
                        this.leftToLeft = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.leftToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.leftToRight);
                        this.leftToRight = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.leftToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.rightToLeft);
                        this.rightToLeft = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.rightToLeft = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.rightToRight);
                        this.rightToRight = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.rightToRight = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.topToTop);
                        this.topToTop = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.topToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.topToBottom);
                        this.topToBottom = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.topToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.bottomToTop);
                        this.bottomToTop = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.bottomToTop = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.bottomToBottom);
                        this.bottomToBottom = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.bottomToBottom = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.baselineToBaseline);
                        this.baselineToBaseline = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.baselineToBaseline = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.startToEnd);
                        this.startToEnd = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.startToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.startToStart);
                        this.startToStart = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.startToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.endToStart);
                        this.endToStart = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.endToStart = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.endToEnd);
                        this.endToEnd = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.endToEnd = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.goneLeftMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 22:
                        this.goneTopMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 23:
                        this.goneRightMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 24:
                        this.goneBottomMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 25:
                        this.goneStartMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 26:
                        this.goneEndMargin = obtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 27:
                        this.constrainedWidth = obtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                        break;
                    case 28:
                        this.constrainedHeight = obtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                        break;
                    case 29:
                        this.horizontalBias = obtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 30:
                        this.verticalBias = obtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 31:
                        int i4 = obtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultWidth = i4;
                        if (i4 != 1) {
                            break;
                        } else {
                            Log.e(ConstraintLayout.TAG, "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                            break;
                        }
                    case 32:
                        int i5 = obtainStyledAttributes.getInt(index, 0);
                        this.matchConstraintDefaultHeight = i5;
                        if (i5 != 1) {
                            break;
                        } else {
                            Log.e(ConstraintLayout.TAG, "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                            break;
                        }
                    case 33:
                        try {
                            this.matchConstraintMinWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinWidth);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinWidth) != -2) {
                                break;
                            } else {
                                this.matchConstraintMinWidth = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.matchConstraintMaxWidth = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxWidth);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxWidth) != -2) {
                                break;
                            } else {
                                this.matchConstraintMaxWidth = -2;
                                break;
                            }
                        }
                    case 35:
                        this.matchConstraintPercentWidth = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentWidth));
                        this.matchConstraintDefaultWidth = 2;
                        break;
                    case 36:
                        try {
                            this.matchConstraintMinHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMinHeight);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMinHeight) != -2) {
                                break;
                            } else {
                                this.matchConstraintMinHeight = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.matchConstraintMaxHeight = obtainStyledAttributes.getDimensionPixelSize(index, this.matchConstraintMaxHeight);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.matchConstraintMaxHeight) != -2) {
                                break;
                            } else {
                                this.matchConstraintMaxHeight = -2;
                                break;
                            }
                        }
                    case 38:
                        this.matchConstraintPercentHeight = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.matchConstraintPercentHeight));
                        this.matchConstraintDefaultHeight = 2;
                        break;
                    default:
                        switch (i3) {
                            case 44:
                                String string = obtainStyledAttributes.getString(index);
                                this.dimensionRatio = string;
                                this.dimensionRatioValue = Float.NaN;
                                this.dimensionRatioSide = -1;
                                if (string == null) {
                                    break;
                                } else {
                                    int length = string.length();
                                    int indexOf = this.dimensionRatio.indexOf(44);
                                    if (indexOf <= 0 || indexOf >= length - 1) {
                                        i = 0;
                                    } else {
                                        String substring = this.dimensionRatio.substring(0, indexOf);
                                        if (substring.equalsIgnoreCase("W")) {
                                            this.dimensionRatioSide = 0;
                                        } else if (substring.equalsIgnoreCase("H")) {
                                            this.dimensionRatioSide = 1;
                                        }
                                        i = indexOf + 1;
                                    }
                                    int indexOf2 = this.dimensionRatio.indexOf(58);
                                    if (indexOf2 >= 0 && indexOf2 < length - 1) {
                                        String substring2 = this.dimensionRatio.substring(i, indexOf2);
                                        String substring3 = this.dimensionRatio.substring(indexOf2 + 1);
                                        if (substring2.length() > 0 && substring3.length() > 0) {
                                            try {
                                                float parseFloat = Float.parseFloat(substring2);
                                                float parseFloat2 = Float.parseFloat(substring3);
                                                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                                                    if (this.dimensionRatioSide != 1) {
                                                        this.dimensionRatioValue = Math.abs(parseFloat / parseFloat2);
                                                        break;
                                                    } else {
                                                        this.dimensionRatioValue = Math.abs(parseFloat2 / parseFloat);
                                                        break;
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                                break;
                                            }
                                        }
                                    } else {
                                        String substring4 = this.dimensionRatio.substring(i);
                                        if (substring4.length() <= 0) {
                                            break;
                                        } else {
                                            this.dimensionRatioValue = Float.parseFloat(substring4);
                                            break;
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.horizontalWeight = obtainStyledAttributes.getFloat(index, this.horizontalWeight);
                                break;
                            case 46:
                                this.verticalWeight = obtainStyledAttributes.getFloat(index, this.verticalWeight);
                                break;
                            case 47:
                                this.horizontalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.verticalChainStyle = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.editorAbsoluteX = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                                break;
                            case 50:
                                this.editorAbsoluteY = obtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                                break;
                            case 51:
                                this.constraintTag = obtainStyledAttributes.getString(index);
                                break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
            validate();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
