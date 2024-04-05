package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.C3181p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
import java.util.WeakHashMap;

public class StaggeredGridLayoutManager extends RecyclerView.C3100o implements RecyclerView.C3114x.C3116b {

    /* renamed from: A */
    public int f7136A;

    /* renamed from: B */
    public LazySpanLookup f7137B;

    /* renamed from: C */
    public int f7138C;

    /* renamed from: D */
    public boolean f7139D;

    /* renamed from: E */
    public boolean f7140E;

    /* renamed from: F */
    public SavedState f7141F;

    /* renamed from: G */
    public int f7142G;

    /* renamed from: H */
    public final Rect f7143H;

    /* renamed from: I */
    public final C3122b f7144I;

    /* renamed from: J */
    public boolean f7145J;

    /* renamed from: K */
    public boolean f7146K;

    /* renamed from: L */
    public int[] f7147L;

    /* renamed from: M */
    public final C3121a f7148M;

    /* renamed from: p */
    public int f7149p;

    /* renamed from: q */
    public C3123c[] f7150q;

    /* renamed from: r */
    public C3129b0 f7151r;

    /* renamed from: s */
    public C3129b0 f7152s;

    /* renamed from: t */
    public int f7153t;

    /* renamed from: u */
    public int f7154u;

    /* renamed from: v */
    public final C3197t f7155v;

    /* renamed from: w */
    public boolean f7156w;

    /* renamed from: x */
    public boolean f7157x;

    /* renamed from: y */
    public BitSet f7158y;

    /* renamed from: z */
    public int f7159z;

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public boolean mFullSpan;
        public C3123c mSpan;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public final int getSpanIndex() {
            C3123c cVar = this.mSpan;
            if (cVar == null) {
                return -1;
            }
            return cVar.f7178e;
        }

        public boolean isFullSpan() {
            return this.mFullSpan;
        }

        public void setFullSpan(boolean z) {
            this.mFullSpan = z;
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

        public LayoutParams(RecyclerView.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3120a();
        public boolean mAnchorLayoutFromEnd;
        public int mAnchorPosition;
        public List<LazySpanLookup.FullSpanItem> mFullSpanItems;
        public boolean mLastLayoutRTL;
        public boolean mReverseLayout;
        public int[] mSpanLookup;
        public int mSpanLookupSize;
        public int[] mSpanOffsets;
        public int mSpanOffsetsSize;
        public int mVisibleAnchorPosition;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public class C3120a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public int describeContents() {
            return 0;
        }

        public void invalidateAnchorPositionInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mAnchorPosition = -1;
            this.mVisibleAnchorPosition = -1;
        }

        public void invalidateSpanInfo() {
            this.mSpanOffsets = null;
            this.mSpanOffsetsSize = 0;
            this.mSpanLookupSize = 0;
            this.mSpanLookup = null;
            this.mFullSpanItems = null;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mVisibleAnchorPosition);
            parcel.writeInt(this.mSpanOffsetsSize);
            if (this.mSpanOffsetsSize > 0) {
                parcel.writeIntArray(this.mSpanOffsets);
            }
            parcel.writeInt(this.mSpanLookupSize);
            if (this.mSpanLookupSize > 0) {
                parcel.writeIntArray(this.mSpanLookup);
            }
            parcel.writeInt(this.mReverseLayout ? 1 : 0);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
            parcel.writeInt(this.mLastLayoutRTL ? 1 : 0);
            parcel.writeList(this.mFullSpanItems);
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mVisibleAnchorPosition = parcel.readInt();
            int readInt = parcel.readInt();
            this.mSpanOffsetsSize = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.mSpanOffsets = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.mSpanLookupSize = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.mSpanLookup = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.mReverseLayout = parcel.readInt() == 1;
            this.mAnchorLayoutFromEnd = parcel.readInt() == 1;
            this.mLastLayoutRTL = parcel.readInt() == 1 ? true : z;
            this.mFullSpanItems = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.mSpanOffsetsSize = savedState.mSpanOffsetsSize;
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mVisibleAnchorPosition = savedState.mVisibleAnchorPosition;
            this.mSpanOffsets = savedState.mSpanOffsets;
            this.mSpanLookupSize = savedState.mSpanLookupSize;
            this.mSpanLookup = savedState.mSpanLookup;
            this.mReverseLayout = savedState.mReverseLayout;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
            this.mLastLayoutRTL = savedState.mLastLayoutRTL;
            this.mFullSpanItems = savedState.mFullSpanItems;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C3121a implements Runnable {
        public C3121a() {
        }

        public final void run() {
            StaggeredGridLayoutManager.this.mo11718I0();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C3122b {

        /* renamed from: a */
        public int f7167a;

        /* renamed from: b */
        public int f7168b;

        /* renamed from: c */
        public boolean f7169c;

        /* renamed from: d */
        public boolean f7170d;

        /* renamed from: e */
        public boolean f7171e;

        /* renamed from: f */
        public int[] f7172f;

        public C3122b() {
            mo11772a();
        }

        /* renamed from: a */
        public final void mo11772a() {
            this.f7167a = -1;
            this.f7168b = Integer.MIN_VALUE;
            this.f7169c = false;
            this.f7170d = false;
            this.f7171e = false;
            int[] iArr = this.f7172f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public class C3123c {

        /* renamed from: a */
        public ArrayList<View> f7174a = new ArrayList<>();

        /* renamed from: b */
        public int f7175b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f7176c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f7177d = 0;

        /* renamed from: e */
        public final int f7178e;

        public C3123c(int i) {
            this.f7178e = i;
        }

        /* renamed from: j */
        public static LayoutParams m7608j(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: a */
        public final void mo11773a(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpan = this;
            this.f7174a.add(view);
            this.f7176c = Integer.MIN_VALUE;
            if (this.f7174a.size() == 1) {
                this.f7175b = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.f7177d = StaggeredGridLayoutManager.this.f7151r.mo11803c(view) + this.f7177d;
            }
        }

        /* renamed from: b */
        public final void mo11774b() {
            LazySpanLookup.FullSpanItem f;
            ArrayList<View> arrayList = this.f7174a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams j = m7608j(view);
            this.f7176c = StaggeredGridLayoutManager.this.f7151r.mo11802b(view);
            if (j.mFullSpan && (f = StaggeredGridLayoutManager.this.f7137B.mo11756f(j.getViewLayoutPosition())) != null && f.f7163c == 1) {
                int i = this.f7176c;
                int i2 = this.f7178e;
                int[] iArr = f.f7164d;
                this.f7176c = i + (iArr == null ? 0 : iArr[i2]);
            }
        }

        /* renamed from: c */
        public final void mo11775c() {
            LazySpanLookup.FullSpanItem f;
            int i = 0;
            View view = this.f7174a.get(0);
            LayoutParams j = m7608j(view);
            this.f7175b = StaggeredGridLayoutManager.this.f7151r.mo11805e(view);
            if (j.mFullSpan && (f = StaggeredGridLayoutManager.this.f7137B.mo11756f(j.getViewLayoutPosition())) != null && f.f7163c == -1) {
                int i2 = this.f7175b;
                int i3 = this.f7178e;
                int[] iArr = f.f7164d;
                if (iArr != null) {
                    i = iArr[i3];
                }
                this.f7175b = i2 - i;
            }
        }

        /* renamed from: d */
        public final void mo11776d() {
            this.f7174a.clear();
            this.f7175b = Integer.MIN_VALUE;
            this.f7176c = Integer.MIN_VALUE;
            this.f7177d = 0;
        }

        /* renamed from: e */
        public final int mo11777e() {
            return StaggeredGridLayoutManager.this.f7156w ? mo11779g(this.f7174a.size() - 1, -1) : mo11779g(0, this.f7174a.size());
        }

        /* renamed from: f */
        public final int mo11778f() {
            return StaggeredGridLayoutManager.this.f7156w ? mo11779g(0, this.f7174a.size()) : mo11779g(this.f7174a.size() - 1, -1);
        }

        /* renamed from: g */
        public final int mo11779g(int i, int i2) {
            int k = StaggeredGridLayoutManager.this.f7151r.mo11811k();
            int g = StaggeredGridLayoutManager.this.f7151r.mo11807g();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f7174a.get(i);
                int e = StaggeredGridLayoutManager.this.f7151r.mo11805e(view);
                int b = StaggeredGridLayoutManager.this.f7151r.mo11802b(view);
                boolean z = false;
                boolean z2 = e <= g;
                if (b >= k) {
                    z = true;
                }
                if (!z2 || !z || (e >= k && b <= g)) {
                    i += i3;
                } else {
                    StaggeredGridLayoutManager.this.getClass();
                    return RecyclerView.C3100o.m7396I(view);
                }
            }
            return -1;
        }

        /* renamed from: h */
        public final int mo11780h(int i) {
            int i2 = this.f7176c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f7174a.size() == 0) {
                return i;
            }
            mo11774b();
            return this.f7176c;
        }

        /* renamed from: i */
        public final View mo11781i(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f7174a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f7174a.get(size);
                    if ((StaggeredGridLayoutManager.this.f7156w && RecyclerView.C3100o.m7396I(view2) >= i) || ((!StaggeredGridLayoutManager.this.f7156w && RecyclerView.C3100o.m7396I(view2) <= i) || !view2.hasFocusable())) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f7174a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f7174a.get(i3);
                    if ((StaggeredGridLayoutManager.this.f7156w && RecyclerView.C3100o.m7396I(view3) <= i) || ((!StaggeredGridLayoutManager.this.f7156w && RecyclerView.C3100o.m7396I(view3) >= i) || !view3.hasFocusable())) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: k */
        public final int mo11782k(int i) {
            int i2 = this.f7175b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f7174a.size() == 0) {
                return i;
            }
            mo11775c();
            return this.f7175b;
        }

        /* renamed from: l */
        public final void mo11783l() {
            int size = this.f7174a.size();
            View remove = this.f7174a.remove(size - 1);
            LayoutParams j = m7608j(remove);
            j.mSpan = null;
            if (j.isItemRemoved() || j.isItemChanged()) {
                this.f7177d -= StaggeredGridLayoutManager.this.f7151r.mo11803c(remove);
            }
            if (size == 1) {
                this.f7175b = Integer.MIN_VALUE;
            }
            this.f7176c = Integer.MIN_VALUE;
        }

        /* renamed from: m */
        public final void mo11784m() {
            View remove = this.f7174a.remove(0);
            LayoutParams j = m7608j(remove);
            j.mSpan = null;
            if (this.f7174a.size() == 0) {
                this.f7176c = Integer.MIN_VALUE;
            }
            if (j.isItemRemoved() || j.isItemChanged()) {
                this.f7177d -= StaggeredGridLayoutManager.this.f7151r.mo11803c(remove);
            }
            this.f7175b = Integer.MIN_VALUE;
        }

        /* renamed from: n */
        public final void mo11785n(View view) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            layoutParams.mSpan = this;
            this.f7174a.add(0, view);
            this.f7175b = Integer.MIN_VALUE;
            if (this.f7174a.size() == 1) {
                this.f7176c = Integer.MIN_VALUE;
            }
            if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
                this.f7177d = StaggeredGridLayoutManager.this.f7151r.mo11803c(view) + this.f7177d;
            }
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f7149p = -1;
        this.f7156w = false;
        this.f7157x = false;
        this.f7159z = -1;
        this.f7136A = Integer.MIN_VALUE;
        this.f7137B = new LazySpanLookup();
        this.f7138C = 2;
        this.f7143H = new Rect();
        this.f7144I = new C3122b();
        this.f7145J = false;
        this.f7146K = true;
        this.f7148M = new C3121a();
        RecyclerView.C3100o.C3104d J = RecyclerView.C3100o.m7397J(context, attributeSet, i, i2);
        int i3 = J.f7088a;
        if (i3 == 0 || i3 == 1) {
            mo11294c((String) null);
            if (i3 != this.f7153t) {
                this.f7153t = i3;
                C3129b0 b0Var = this.f7151r;
                this.f7151r = this.f7152s;
                this.f7152s = b0Var;
                mo11672s0();
            }
            mo11744i1(J.f7089b);
            boolean z = J.f7090c;
            mo11294c((String) null);
            SavedState savedState = this.f7141F;
            if (!(savedState == null || savedState.mReverseLayout == z)) {
                savedState.mReverseLayout = z;
            }
            this.f7156w = z;
            mo11672s0();
            this.f7155v = new C3197t();
            this.f7151r = C3129b0.m7653a(this, this.f7153t);
            this.f7152s = C3129b0.m7653a(this, 1 - this.f7153t);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: m1 */
    public static int m7528m1(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* renamed from: E0 */
    public final void mo11270E0(RecyclerView recyclerView, int i) {
        C3198u uVar = new C3198u(recyclerView.getContext());
        uVar.f7107a = i;
        mo11650F0(uVar);
    }

    /* renamed from: G0 */
    public final boolean mo11227G0() {
        return this.f7141F == null;
    }

    /* renamed from: H0 */
    public final int mo11717H0(int i) {
        if (mo11676y() == 0) {
            return this.f7157x ? 1 : -1;
        }
        return (i < mo11727R0()) != this.f7157x ? -1 : 1;
    }

    /* renamed from: I0 */
    public final boolean mo11718I0() {
        int i;
        int i2;
        if (mo11676y() == 0 || this.f7138C == 0 || !this.f7077g) {
            return false;
        }
        if (this.f7157x) {
            i2 = mo11728S0();
            i = mo11727R0();
        } else {
            i2 = mo11727R0();
            i = mo11728S0();
        }
        if (i2 == 0 && mo11732W0() != null) {
            this.f7137B.mo11752b();
            this.f7076f = true;
            mo11672s0();
            return true;
        } else if (!this.f7145J) {
            return false;
        } else {
            int i3 = this.f7157x ? -1 : 1;
            int i4 = i + 1;
            LazySpanLookup.FullSpanItem e = this.f7137B.mo11755e(i2, i4, i3);
            if (e == null) {
                this.f7145J = false;
                this.f7137B.mo11754d(i4);
                return false;
            }
            LazySpanLookup.FullSpanItem e2 = this.f7137B.mo11755e(i2, e.f7162b, i3 * -1);
            if (e2 == null) {
                this.f7137B.mo11754d(e.f7162b);
            } else {
                this.f7137B.mo11754d(e2.f7162b + 1);
            }
            this.f7076f = true;
            mo11672s0();
            return true;
        }
    }

    /* renamed from: J0 */
    public final int mo11719J0(RecyclerView.C3117y yVar) {
        if (mo11676y() == 0) {
            return 0;
        }
        return C3142e0.m7688a(yVar, this.f7151r, mo11724O0(!this.f7146K), mo11723N0(!this.f7146K), this, this.f7146K);
    }

    /* renamed from: K0 */
    public final int mo11720K0(RecyclerView.C3117y yVar) {
        if (mo11676y() == 0) {
            return 0;
        }
        return C3142e0.m7689b(yVar, this.f7151r, mo11724O0(!this.f7146K), mo11723N0(!this.f7146K), this, this.f7146K, this.f7157x);
    }

    /* renamed from: L0 */
    public final int mo11721L0(RecyclerView.C3117y yVar) {
        if (mo11676y() == 0) {
            return 0;
        }
        return C3142e0.m7690c(yVar, this.f7151r, mo11724O0(!this.f7146K), mo11723N0(!this.f7146K), this, this.f7146K);
    }

    /* JADX WARNING: Removed duplicated region for block: B:127:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x028d  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x02a5  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x02ea  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x030d  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0311  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0318  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0344  */
    /* renamed from: M0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo11722M0(androidx.recyclerview.widget.RecyclerView.C3111u r19, androidx.recyclerview.widget.C3197t r20, androidx.recyclerview.widget.RecyclerView.C3117y r21) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.BitSet r3 = r0.f7158y
            int r4 = r0.f7149p
            r5 = 0
            r6 = 1
            r3.set(r5, r4, r6)
            androidx.recyclerview.widget.t r3 = r0.f7155v
            boolean r3 = r3.f7439i
            if (r3 == 0) goto L_0x0020
            int r3 = r2.f7435e
            if (r3 != r6) goto L_0x001d
            r3 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x002f
        L_0x001d:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x002f
        L_0x0020:
            int r3 = r2.f7435e
            if (r3 != r6) goto L_0x002a
            int r3 = r2.f7437g
            int r8 = r2.f7432b
            int r3 = r3 + r8
            goto L_0x002f
        L_0x002a:
            int r3 = r2.f7436f
            int r8 = r2.f7432b
            int r3 = r3 - r8
        L_0x002f:
            int r8 = r2.f7435e
            r0.mo11745j1(r8, r3)
            boolean r8 = r0.f7157x
            if (r8 == 0) goto L_0x003f
            androidx.recyclerview.widget.b0 r8 = r0.f7151r
            int r8 = r8.mo11807g()
            goto L_0x0045
        L_0x003f:
            androidx.recyclerview.widget.b0 r8 = r0.f7151r
            int r8 = r8.mo11811k()
        L_0x0045:
            r9 = r5
        L_0x0046:
            int r10 = r2.f7433c
            if (r10 < 0) goto L_0x0052
            int r11 = r21.mo11715b()
            if (r10 >= r11) goto L_0x0052
            r10 = r6
            goto L_0x0053
        L_0x0052:
            r10 = r5
        L_0x0053:
            r11 = -1
            if (r10 == 0) goto L_0x0353
            androidx.recyclerview.widget.t r10 = r0.f7155v
            boolean r10 = r10.f7439i
            if (r10 != 0) goto L_0x0064
            java.util.BitSet r10 = r0.f7158y
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0353
        L_0x0064:
            int r9 = r2.f7433c
            r12 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            androidx.recyclerview.widget.RecyclerView$b0 r9 = r1.mo11701k(r9, r12)
            android.view.View r9 = r9.itemView
            int r10 = r2.f7433c
            int r12 = r2.f7434d
            int r10 = r10 + r12
            r2.f7433c = r10
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r10
            int r12 = r10.getViewLayoutPosition()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r13 = r0.f7137B
            int[] r13 = r13.f7160a
            if (r13 == 0) goto L_0x008f
            int r14 = r13.length
            if (r12 < r14) goto L_0x008c
            goto L_0x008f
        L_0x008c:
            r13 = r13[r12]
            goto L_0x0090
        L_0x008f:
            r13 = r11
        L_0x0090:
            if (r13 != r11) goto L_0x0094
            r14 = r6
            goto L_0x0095
        L_0x0094:
            r14 = r5
        L_0x0095:
            if (r14 == 0) goto L_0x0100
            boolean r13 = r10.mFullSpan
            if (r13 == 0) goto L_0x00a0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r0.f7150q
            r13 = r13[r5]
            goto L_0x00f4
        L_0x00a0:
            int r13 = r2.f7435e
            boolean r13 = r0.mo11736a1(r13)
            if (r13 == 0) goto L_0x00af
            int r13 = r0.f7149p
            int r13 = r13 - r6
            r15 = r11
            r16 = r15
            goto L_0x00b5
        L_0x00af:
            int r13 = r0.f7149p
            r16 = r6
            r15 = r13
            r13 = r5
        L_0x00b5:
            int r4 = r2.f7435e
            r17 = 0
            if (r4 != r6) goto L_0x00d8
            androidx.recyclerview.widget.b0 r4 = r0.f7151r
            int r4 = r4.mo11811k()
            r7 = 2147483647(0x7fffffff, float:NaN)
        L_0x00c4:
            if (r13 == r15) goto L_0x00f2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r0.f7150q
            r5 = r5[r13]
            int r11 = r5.mo11780h(r4)
            if (r11 >= r7) goto L_0x00d3
            r17 = r5
            r7 = r11
        L_0x00d3:
            int r13 = r13 + r16
            r5 = 0
            r11 = -1
            goto L_0x00c4
        L_0x00d8:
            androidx.recyclerview.widget.b0 r4 = r0.f7151r
            int r4 = r4.mo11807g()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00e0:
            if (r13 == r15) goto L_0x00f2
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r0.f7150q
            r7 = r7[r13]
            int r11 = r7.mo11782k(r4)
            if (r11 <= r5) goto L_0x00ef
            r17 = r7
            r5 = r11
        L_0x00ef:
            int r13 = r13 + r16
            goto L_0x00e0
        L_0x00f2:
            r13 = r17
        L_0x00f4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r0.f7137B
            r4.mo11753c(r12)
            int[] r4 = r4.f7160a
            int r5 = r13.f7178e
            r4[r12] = r5
            goto L_0x0104
        L_0x0100:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r4 = r0.f7150q
            r13 = r4[r13]
        L_0x0104:
            r10.mSpan = r13
            int r4 = r2.f7435e
            if (r4 != r6) goto L_0x0110
            r4 = -1
            r5 = 0
            r0.mo11661b(r9, r4, r5)
            goto L_0x0114
        L_0x0110:
            r5 = 0
            r0.mo11661b(r9, r5, r5)
        L_0x0114:
            boolean r4 = r10.mFullSpan
            if (r4 == 0) goto L_0x0150
            int r4 = r0.f7153t
            if (r4 != r6) goto L_0x0136
            int r4 = r0.f7142G
            int r5 = r0.f7085o
            int r7 = r0.f7083m
            int r11 = r18.mo11652H()
            int r15 = r18.mo11648E()
            int r15 = r15 + r11
            int r11 = r10.height
            int r5 = androidx.recyclerview.widget.RecyclerView.C3100o.m7404z(r5, r7, r15, r11, r6)
            r7 = 0
            r0.mo11734Y0(r9, r4, r5, r7)
            goto L_0x0198
        L_0x0136:
            r7 = 0
            int r4 = r0.f7084n
            int r5 = r0.f7082l
            int r11 = r18.mo11649F()
            int r15 = r18.mo11651G()
            int r15 = r15 + r11
            int r11 = r10.width
            int r4 = androidx.recyclerview.widget.RecyclerView.C3100o.m7404z(r4, r5, r15, r11, r6)
            int r5 = r0.f7142G
            r0.mo11734Y0(r9, r4, r5, r7)
            goto L_0x0198
        L_0x0150:
            r7 = 0
            int r4 = r0.f7153t
            if (r4 != r6) goto L_0x0177
            int r4 = r0.f7154u
            int r5 = r0.f7082l
            int r11 = r10.width
            int r4 = androidx.recyclerview.widget.RecyclerView.C3100o.m7404z(r4, r5, r7, r11, r7)
            int r5 = r0.f7085o
            int r11 = r0.f7083m
            int r15 = r18.mo11652H()
            int r16 = r18.mo11648E()
            int r15 = r16 + r15
            int r1 = r10.height
            int r1 = androidx.recyclerview.widget.RecyclerView.C3100o.m7404z(r5, r11, r15, r1, r6)
            r0.mo11734Y0(r9, r4, r1, r7)
            goto L_0x0198
        L_0x0177:
            int r1 = r0.f7084n
            int r4 = r0.f7082l
            int r5 = r18.mo11649F()
            int r7 = r18.mo11651G()
            int r7 = r7 + r5
            int r5 = r10.width
            int r1 = androidx.recyclerview.widget.RecyclerView.C3100o.m7404z(r1, r4, r7, r5, r6)
            int r4 = r0.f7154u
            int r5 = r0.f7083m
            int r7 = r10.height
            r11 = 0
            int r4 = androidx.recyclerview.widget.RecyclerView.C3100o.m7404z(r4, r5, r11, r7, r11)
            r0.mo11734Y0(r9, r1, r4, r11)
        L_0x0198:
            int r1 = r2.f7435e
            if (r1 != r6) goto L_0x01e2
            boolean r1 = r10.mFullSpan
            if (r1 == 0) goto L_0x01a5
            int r1 = r0.mo11729T0(r8)
            goto L_0x01a9
        L_0x01a5:
            int r1 = r13.mo11780h(r8)
        L_0x01a9:
            androidx.recyclerview.widget.b0 r4 = r0.f7151r
            int r4 = r4.mo11803c(r9)
            int r4 = r4 + r1
            if (r14 == 0) goto L_0x0227
            boolean r5 = r10.mFullSpan
            if (r5 == 0) goto L_0x0227
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r5.<init>()
            int r7 = r0.f7149p
            int[] r7 = new int[r7]
            r5.f7164d = r7
            r7 = 0
        L_0x01c2:
            int r11 = r0.f7149p
            if (r7 >= r11) goto L_0x01d7
            int[] r11 = r5.f7164d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r15 = r0.f7150q
            r15 = r15[r7]
            int r15 = r15.mo11780h(r1)
            int r15 = r1 - r15
            r11[r7] = r15
            int r7 = r7 + 1
            goto L_0x01c2
        L_0x01d7:
            r7 = -1
            r5.f7163c = r7
            r5.f7162b = r12
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r0.f7137B
            r7.mo11751a(r5)
            goto L_0x0227
        L_0x01e2:
            boolean r1 = r10.mFullSpan
            if (r1 == 0) goto L_0x01eb
            int r1 = r0.mo11730U0(r8)
            goto L_0x01ef
        L_0x01eb:
            int r1 = r13.mo11782k(r8)
        L_0x01ef:
            r4 = r1
            androidx.recyclerview.widget.b0 r1 = r0.f7151r
            int r1 = r1.mo11803c(r9)
            int r1 = r4 - r1
            if (r14 == 0) goto L_0x0227
            boolean r5 = r10.mFullSpan
            if (r5 == 0) goto L_0x0227
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r5.<init>()
            int r7 = r0.f7149p
            int[] r7 = new int[r7]
            r5.f7164d = r7
            r7 = 0
        L_0x020a:
            int r11 = r0.f7149p
            if (r7 >= r11) goto L_0x021e
            int[] r11 = r5.f7164d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r15 = r0.f7150q
            r15 = r15[r7]
            int r15 = r15.mo11782k(r4)
            int r15 = r15 - r4
            r11[r7] = r15
            int r7 = r7 + 1
            goto L_0x020a
        L_0x021e:
            r5.f7163c = r6
            r5.f7162b = r12
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r0.f7137B
            r7.mo11751a(r5)
        L_0x0227:
            boolean r5 = r10.mFullSpan
            if (r5 == 0) goto L_0x0287
            int r5 = r2.f7434d
            r7 = -1
            if (r5 != r7) goto L_0x0287
            if (r14 == 0) goto L_0x0235
            r0.f7145J = r6
            goto L_0x0287
        L_0x0235:
            int r5 = r2.f7435e
            if (r5 != r6) goto L_0x0257
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r0.f7150q
            r7 = 0
            r5 = r5[r7]
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            int r5 = r5.mo11780h(r7)
            r11 = r6
        L_0x0245:
            int r14 = r0.f7149p
            if (r11 >= r14) goto L_0x0276
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r14 = r0.f7150q
            r14 = r14[r11]
            int r14 = r14.mo11780h(r7)
            if (r14 == r5) goto L_0x0254
            goto L_0x0271
        L_0x0254:
            int r11 = r11 + 1
            goto L_0x0245
        L_0x0257:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r5 = r0.f7150q
            r11 = 0
            r5 = r5[r11]
            int r5 = r5.mo11782k(r7)
            r11 = r6
        L_0x0263:
            int r14 = r0.f7149p
            if (r11 >= r14) goto L_0x0276
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r14 = r0.f7150q
            r14 = r14[r11]
            int r14 = r14.mo11782k(r7)
            if (r14 == r5) goto L_0x0273
        L_0x0271:
            r5 = 0
            goto L_0x0277
        L_0x0273:
            int r11 = r11 + 1
            goto L_0x0263
        L_0x0276:
            r5 = r6
        L_0x0277:
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0289
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r5 = r0.f7137B
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r5 = r5.mo11756f(r12)
            if (r5 == 0) goto L_0x0284
            r5.f7165e = r6
        L_0x0284:
            r0.f7145J = r6
            goto L_0x0289
        L_0x0287:
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0289:
            int r5 = r2.f7435e
            if (r5 != r6) goto L_0x02a5
            boolean r5 = r10.mFullSpan
            if (r5 == 0) goto L_0x029f
            int r5 = r0.f7149p
        L_0x0293:
            r11 = -1
            int r5 = r5 + r11
            if (r5 < 0) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r11 = r0.f7150q
            r11 = r11[r5]
            r11.mo11773a(r9)
            goto L_0x0293
        L_0x029f:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = r10.mSpan
            r5.mo11773a(r9)
            goto L_0x02bc
        L_0x02a5:
            boolean r5 = r10.mFullSpan
            if (r5 == 0) goto L_0x02b7
            int r5 = r0.f7149p
        L_0x02ab:
            r11 = -1
            int r5 = r5 + r11
            if (r5 < 0) goto L_0x02bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r11 = r0.f7150q
            r11 = r11[r5]
            r11.mo11785n(r9)
            goto L_0x02ab
        L_0x02b7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = r10.mSpan
            r5.mo11785n(r9)
        L_0x02bc:
            boolean r5 = r18.mo11733X0()
            if (r5 == 0) goto L_0x02ea
            int r5 = r0.f7153t
            if (r5 != r6) goto L_0x02ea
            boolean r5 = r10.mFullSpan
            if (r5 == 0) goto L_0x02d1
            androidx.recyclerview.widget.b0 r5 = r0.f7152s
            int r5 = r5.mo11807g()
            goto L_0x02e1
        L_0x02d1:
            androidx.recyclerview.widget.b0 r5 = r0.f7152s
            int r5 = r5.mo11807g()
            int r11 = r0.f7149p
            int r11 = r11 - r6
            int r12 = r13.f7178e
            int r11 = r11 - r12
            int r12 = r0.f7154u
            int r11 = r11 * r12
            int r5 = r5 - r11
        L_0x02e1:
            androidx.recyclerview.widget.b0 r11 = r0.f7152s
            int r11 = r11.mo11803c(r9)
            int r11 = r5 - r11
            goto L_0x0309
        L_0x02ea:
            boolean r5 = r10.mFullSpan
            if (r5 == 0) goto L_0x02f6
            androidx.recyclerview.widget.b0 r5 = r0.f7152s
            int r5 = r5.mo11811k()
            r11 = r5
            goto L_0x0302
        L_0x02f6:
            int r5 = r13.f7178e
            int r11 = r0.f7154u
            int r5 = r5 * r11
            androidx.recyclerview.widget.b0 r11 = r0.f7152s
            int r11 = r11.mo11811k()
            int r11 = r11 + r5
        L_0x0302:
            androidx.recyclerview.widget.b0 r5 = r0.f7152s
            int r5 = r5.mo11803c(r9)
            int r5 = r5 + r11
        L_0x0309:
            int r12 = r0.f7153t
            if (r12 != r6) goto L_0x0311
            androidx.recyclerview.widget.RecyclerView.C3100o.m7401Q(r9, r11, r1, r5, r4)
            goto L_0x0314
        L_0x0311:
            androidx.recyclerview.widget.RecyclerView.C3100o.m7401Q(r9, r1, r11, r4, r5)
        L_0x0314:
            boolean r1 = r10.mFullSpan
            if (r1 == 0) goto L_0x0320
            androidx.recyclerview.widget.t r1 = r0.f7155v
            int r1 = r1.f7435e
            r0.mo11745j1(r1, r3)
            goto L_0x0327
        L_0x0320:
            androidx.recyclerview.widget.t r1 = r0.f7155v
            int r1 = r1.f7435e
            r0.mo11747l1(r13, r1, r3)
        L_0x0327:
            androidx.recyclerview.widget.t r1 = r0.f7155v
            r4 = r19
            r0.mo11738c1(r4, r1)
            androidx.recyclerview.widget.t r1 = r0.f7155v
            boolean r1 = r1.f7438h
            if (r1 == 0) goto L_0x034d
            boolean r1 = r9.hasFocusable()
            if (r1 == 0) goto L_0x034d
            boolean r1 = r10.mFullSpan
            if (r1 == 0) goto L_0x0344
            java.util.BitSet r1 = r0.f7158y
            r1.clear()
            goto L_0x034d
        L_0x0344:
            java.util.BitSet r1 = r0.f7158y
            int r5 = r13.f7178e
            r10 = 0
            r1.set(r5, r10)
            goto L_0x034e
        L_0x034d:
            r10 = 0
        L_0x034e:
            r1 = r4
            r9 = r6
            r5 = r10
            goto L_0x0046
        L_0x0353:
            r4 = r1
            r10 = r5
            if (r9 != 0) goto L_0x035c
            androidx.recyclerview.widget.t r1 = r0.f7155v
            r0.mo11738c1(r4, r1)
        L_0x035c:
            androidx.recyclerview.widget.t r1 = r0.f7155v
            int r1 = r1.f7435e
            r3 = -1
            if (r1 != r3) goto L_0x0375
            androidx.recyclerview.widget.b0 r1 = r0.f7151r
            int r1 = r1.mo11811k()
            int r1 = r0.mo11730U0(r1)
            androidx.recyclerview.widget.b0 r3 = r0.f7151r
            int r3 = r3.mo11811k()
            int r3 = r3 - r1
            goto L_0x0387
        L_0x0375:
            androidx.recyclerview.widget.b0 r1 = r0.f7151r
            int r1 = r1.mo11807g()
            int r1 = r0.mo11729T0(r1)
            androidx.recyclerview.widget.b0 r3 = r0.f7151r
            int r3 = r3.mo11807g()
            int r3 = r1 - r3
        L_0x0387:
            if (r3 <= 0) goto L_0x0390
            int r1 = r2.f7432b
            int r5 = java.lang.Math.min(r1, r3)
            goto L_0x0391
        L_0x0390:
            r5 = r10
        L_0x0391:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo11722M0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.t, androidx.recyclerview.widget.RecyclerView$y):int");
    }

    /* renamed from: N0 */
    public final View mo11723N0(boolean z) {
        int k = this.f7151r.mo11811k();
        int g = this.f7151r.mo11807g();
        View view = null;
        for (int y = mo11676y() - 1; y >= 0; y--) {
            View x = mo11674x(y);
            int e = this.f7151r.mo11805e(x);
            int b = this.f7151r.mo11802b(x);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    /* renamed from: O */
    public final boolean mo11277O() {
        return this.f7138C != 0;
    }

    /* renamed from: O0 */
    public final View mo11724O0(boolean z) {
        int k = this.f7151r.mo11811k();
        int g = this.f7151r.mo11807g();
        int y = mo11676y();
        View view = null;
        for (int i = 0; i < y; i++) {
            View x = mo11674x(i);
            int e = this.f7151r.mo11805e(x);
            if (this.f7151r.mo11802b(x) > k && e < g) {
                if (e >= k || !z) {
                    return x;
                }
                if (view == null) {
                    view = x;
                }
            }
        }
        return view;
    }

    /* renamed from: P0 */
    public final void mo11725P0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, boolean z) {
        int g;
        int T0 = mo11729T0(Integer.MIN_VALUE);
        if (T0 != Integer.MIN_VALUE && (g = this.f7151r.mo11807g() - T0) > 0) {
            int i = g - (-mo11742g1(-g, uVar, yVar));
            if (z && i > 0) {
                this.f7151r.mo11815o(i);
            }
        }
    }

    /* renamed from: Q0 */
    public final void mo11726Q0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, boolean z) {
        int k;
        int U0 = mo11730U0(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        if (U0 != Integer.MAX_VALUE && (k = U0 - this.f7151r.mo11811k()) > 0) {
            int g1 = k - mo11742g1(k, uVar, yVar);
            if (z && g1 > 0) {
                this.f7151r.mo11815o(-g1);
            }
        }
    }

    /* renamed from: R0 */
    public final int mo11727R0() {
        if (mo11676y() == 0) {
            return 0;
        }
        return RecyclerView.C3100o.m7396I(mo11674x(0));
    }

    /* renamed from: S */
    public final void mo11655S(int i) {
        super.mo11655S(i);
        for (int i2 = 0; i2 < this.f7149p; i2++) {
            C3123c cVar = this.f7150q[i2];
            int i3 = cVar.f7175b;
            if (i3 != Integer.MIN_VALUE) {
                cVar.f7175b = i3 + i;
            }
            int i4 = cVar.f7176c;
            if (i4 != Integer.MIN_VALUE) {
                cVar.f7176c = i4 + i;
            }
        }
    }

    /* renamed from: S0 */
    public final int mo11728S0() {
        int y = mo11676y();
        if (y == 0) {
            return 0;
        }
        return RecyclerView.C3100o.m7396I(mo11674x(y - 1));
    }

    /* renamed from: T */
    public final void mo11656T(int i) {
        super.mo11656T(i);
        for (int i2 = 0; i2 < this.f7149p; i2++) {
            C3123c cVar = this.f7150q[i2];
            int i3 = cVar.f7175b;
            if (i3 != Integer.MIN_VALUE) {
                cVar.f7175b = i3 + i;
            }
            int i4 = cVar.f7176c;
            if (i4 != Integer.MIN_VALUE) {
                cVar.f7176c = i4 + i;
            }
        }
    }

    /* renamed from: T0 */
    public final int mo11729T0(int i) {
        int h = this.f7150q[0].mo11780h(i);
        for (int i2 = 1; i2 < this.f7149p; i2++) {
            int h2 = this.f7150q[i2].mo11780h(i);
            if (h2 > h) {
                h = h2;
            }
        }
        return h;
    }

    /* renamed from: U */
    public final void mo11657U(RecyclerView.Adapter adapter) {
        this.f7137B.mo11752b();
        for (int i = 0; i < this.f7149p; i++) {
            this.f7150q[i].mo11776d();
        }
    }

    /* renamed from: U0 */
    public final int mo11730U0(int i) {
        int k = this.f7150q[0].mo11782k(i);
        for (int i2 = 1; i2 < this.f7149p; i2++) {
            int k2 = this.f7150q[i2].mo11782k(i);
            if (k2 < k) {
                k = k2;
            }
        }
        return k;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: V0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11731V0(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f7157x
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo11728S0()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo11727R0()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f7137B
            r4.mo11757g(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f7137B
            r9.mo11759i(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f7137B
            r7.mo11758h(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f7137B
            r9.mo11759i(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f7137B
            r9.mo11758h(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f7157x
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo11727R0()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo11728S0()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.mo11672s0()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo11731V0(int, int, int):void");
    }

    /* renamed from: W */
    public final void mo11286W(RecyclerView recyclerView) {
        C3121a aVar = this.f7148M;
        RecyclerView recyclerView2 = this.f7072b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(aVar);
        }
        for (int i = 0; i < this.f7149p; i++) {
            this.f7150q[i].mo11776d();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        if (r11 == r12) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        if (r11 == r12) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r11 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0099 A[SYNTHETIC] */
    /* renamed from: W0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo11732W0() {
        /*
            r13 = this;
            int r0 = r13.mo11676y()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f7149p
            r2.<init>(r3)
            int r3 = r13.f7149p
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f7153t
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.mo11733X0()
            if (r3 == 0) goto L_0x0020
            r3 = r1
            goto L_0x0021
        L_0x0020:
            r3 = r5
        L_0x0021:
            boolean r6 = r13.f7157x
            if (r6 == 0) goto L_0x0027
            r6 = r5
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L_0x002b:
            if (r0 >= r6) goto L_0x002f
            r7 = r1
            goto L_0x0030
        L_0x002f:
            r7 = r5
        L_0x0030:
            if (r0 == r6) goto L_0x00f9
            android.view.View r8 = r13.mo11674x(r0)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r9.mSpan
            int r10 = r10.f7178e
            boolean r10 = r2.get(r10)
            if (r10 == 0) goto L_0x00a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r9.mSpan
            boolean r11 = r13.f7157x
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0074
            int r11 = r10.f7176c
            if (r11 == r12) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r10.mo11774b()
            int r11 = r10.f7176c
        L_0x0058:
            androidx.recyclerview.widget.b0 r12 = r13.f7151r
            int r12 = r12.mo11807g()
            if (r11 >= r12) goto L_0x0096
            java.util.ArrayList<android.view.View> r10 = r10.f7174a
            int r11 = r10.size()
            int r11 = r11 + r5
            java.lang.Object r10 = r10.get(r11)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.C3123c.m7608j(r10)
            boolean r10 = r10.mFullSpan
            goto L_0x0094
        L_0x0074:
            int r11 = r10.f7175b
            if (r11 == r12) goto L_0x0079
            goto L_0x007e
        L_0x0079:
            r10.mo11775c()
            int r11 = r10.f7175b
        L_0x007e:
            androidx.recyclerview.widget.b0 r12 = r13.f7151r
            int r12 = r12.mo11811k()
            if (r11 <= r12) goto L_0x0096
            java.util.ArrayList<android.view.View> r10 = r10.f7174a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.C3123c.m7608j(r10)
            boolean r10 = r10.mFullSpan
        L_0x0094:
            r10 = r10 ^ r1
            goto L_0x0097
        L_0x0096:
            r10 = r4
        L_0x0097:
            if (r10 == 0) goto L_0x009a
            return r8
        L_0x009a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r9.mSpan
            int r10 = r10.f7178e
            r2.clear(r10)
        L_0x00a1:
            boolean r10 = r9.mFullSpan
            if (r10 == 0) goto L_0x00a6
            goto L_0x00f6
        L_0x00a6:
            int r10 = r0 + r7
            if (r10 == r6) goto L_0x00f6
            android.view.View r10 = r13.mo11674x(r10)
            boolean r11 = r13.f7157x
            if (r11 == 0) goto L_0x00c4
            androidx.recyclerview.widget.b0 r11 = r13.f7151r
            int r11 = r11.mo11802b(r8)
            androidx.recyclerview.widget.b0 r12 = r13.f7151r
            int r12 = r12.mo11802b(r10)
            if (r11 >= r12) goto L_0x00c1
            return r8
        L_0x00c1:
            if (r11 != r12) goto L_0x00d7
            goto L_0x00d5
        L_0x00c4:
            androidx.recyclerview.widget.b0 r11 = r13.f7151r
            int r11 = r11.mo11805e(r8)
            androidx.recyclerview.widget.b0 r12 = r13.f7151r
            int r12 = r12.mo11805e(r10)
            if (r11 <= r12) goto L_0x00d3
            return r8
        L_0x00d3:
            if (r11 != r12) goto L_0x00d7
        L_0x00d5:
            r11 = r1
            goto L_0x00d8
        L_0x00d7:
            r11 = r4
        L_0x00d8:
            if (r11 == 0) goto L_0x00f6
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.mSpan
            int r9 = r9.f7178e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r10.mSpan
            int r10 = r10.f7178e
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x00ed
            r9 = r1
            goto L_0x00ee
        L_0x00ed:
            r9 = r4
        L_0x00ee:
            if (r3 >= 0) goto L_0x00f2
            r10 = r1
            goto L_0x00f3
        L_0x00f2:
            r10 = r4
        L_0x00f3:
            if (r9 == r10) goto L_0x00f6
            return r8
        L_0x00f6:
            int r0 = r0 + r7
            goto L_0x0030
        L_0x00f9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo11732W0():android.view.View");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004a, code lost:
        if (r9.f7153t == 1) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        if (r9.f7153t == 0) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005d, code lost:
        if (mo11733X0() == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0069, code lost:
        if (mo11733X0() == false) goto L_0x006d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0070 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0071  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo11230X(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.C3111u r12, androidx.recyclerview.widget.RecyclerView.C3117y r13) {
        /*
            r9 = this;
            int r0 = r9.mo11676y()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r0 = r9.f7072b
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            r10 = r1
            goto L_0x001e
        L_0x000e:
            android.view.View r10 = r0.findContainingItemView(r10)
            if (r10 != 0) goto L_0x0015
            goto L_0x000c
        L_0x0015:
            androidx.recyclerview.widget.g r0 = r9.f7071a
            boolean r0 = r0.mo11855k(r10)
            if (r0 == 0) goto L_0x001e
            goto L_0x000c
        L_0x001e:
            if (r10 != 0) goto L_0x0021
            return r1
        L_0x0021:
            r9.mo11741f1()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1
            r3 = -1
            if (r11 == r2) goto L_0x0060
            r4 = 2
            if (r11 == r4) goto L_0x0054
            r4 = 17
            if (r11 == r4) goto L_0x004d
            r4 = 33
            if (r11 == r4) goto L_0x0048
            r4 = 66
            if (r11 == r4) goto L_0x0043
            r4 = 130(0x82, float:1.82E-43)
            if (r11 == r4) goto L_0x003e
            goto L_0x0052
        L_0x003e:
            int r11 = r9.f7153t
            if (r11 != r2) goto L_0x0052
            goto L_0x006b
        L_0x0043:
            int r11 = r9.f7153t
            if (r11 != 0) goto L_0x0052
            goto L_0x006b
        L_0x0048:
            int r11 = r9.f7153t
            if (r11 != r2) goto L_0x0052
            goto L_0x006d
        L_0x004d:
            int r11 = r9.f7153t
            if (r11 != 0) goto L_0x0052
            goto L_0x006d
        L_0x0052:
            r11 = r0
            goto L_0x006e
        L_0x0054:
            int r11 = r9.f7153t
            if (r11 != r2) goto L_0x0059
            goto L_0x006b
        L_0x0059:
            boolean r11 = r9.mo11733X0()
            if (r11 == 0) goto L_0x006b
            goto L_0x006d
        L_0x0060:
            int r11 = r9.f7153t
            if (r11 != r2) goto L_0x0065
            goto L_0x006d
        L_0x0065:
            boolean r11 = r9.mo11733X0()
            if (r11 == 0) goto L_0x006d
        L_0x006b:
            r11 = r2
            goto L_0x006e
        L_0x006d:
            r11 = r3
        L_0x006e:
            if (r11 != r0) goto L_0x0071
            return r1
        L_0x0071:
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r0
            boolean r4 = r0.mFullSpan
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r0 = r0.mSpan
            if (r11 != r2) goto L_0x0082
            int r5 = r9.mo11728S0()
            goto L_0x0086
        L_0x0082:
            int r5 = r9.mo11727R0()
        L_0x0086:
            r9.mo11746k1(r5, r13)
            r9.mo11743h1(r11)
            androidx.recyclerview.widget.t r6 = r9.f7155v
            int r7 = r6.f7434d
            int r7 = r7 + r5
            r6.f7433c = r7
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.b0 r8 = r9.f7151r
            int r8 = r8.mo11812l()
            float r8 = (float) r8
            float r8 = r8 * r7
            int r7 = (int) r8
            r6.f7432b = r7
            androidx.recyclerview.widget.t r6 = r9.f7155v
            r6.f7438h = r2
            r7 = 0
            r6.f7431a = r7
            r9.mo11722M0(r12, r6, r13)
            boolean r12 = r9.f7157x
            r9.f7139D = r12
            if (r4 != 0) goto L_0x00ba
            android.view.View r12 = r0.mo11781i(r5, r11)
            if (r12 == 0) goto L_0x00ba
            if (r12 == r10) goto L_0x00ba
            return r12
        L_0x00ba:
            boolean r12 = r9.mo11736a1(r11)
            if (r12 == 0) goto L_0x00d5
            int r12 = r9.f7149p
            int r12 = r12 - r2
        L_0x00c3:
            if (r12 < 0) goto L_0x00ea
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r9.f7150q
            r13 = r13[r12]
            android.view.View r13 = r13.mo11781i(r5, r11)
            if (r13 == 0) goto L_0x00d2
            if (r13 == r10) goto L_0x00d2
            return r13
        L_0x00d2:
            int r12 = r12 + -1
            goto L_0x00c3
        L_0x00d5:
            r12 = r7
        L_0x00d6:
            int r13 = r9.f7149p
            if (r12 >= r13) goto L_0x00ea
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r9.f7150q
            r13 = r13[r12]
            android.view.View r13 = r13.mo11781i(r5, r11)
            if (r13 == 0) goto L_0x00e7
            if (r13 == r10) goto L_0x00e7
            return r13
        L_0x00e7:
            int r12 = r12 + 1
            goto L_0x00d6
        L_0x00ea:
            boolean r12 = r9.f7156w
            r12 = r12 ^ r2
            if (r11 != r3) goto L_0x00f1
            r13 = r2
            goto L_0x00f2
        L_0x00f1:
            r13 = r7
        L_0x00f2:
            if (r12 != r13) goto L_0x00f6
            r12 = r2
            goto L_0x00f7
        L_0x00f6:
            r12 = r7
        L_0x00f7:
            if (r4 != 0) goto L_0x010d
            if (r12 == 0) goto L_0x0100
            int r13 = r0.mo11777e()
            goto L_0x0104
        L_0x0100:
            int r13 = r0.mo11778f()
        L_0x0104:
            android.view.View r13 = r9.mo11314s(r13)
            if (r13 == 0) goto L_0x010d
            if (r13 == r10) goto L_0x010d
            return r13
        L_0x010d:
            boolean r11 = r9.mo11736a1(r11)
            if (r11 == 0) goto L_0x013c
            int r11 = r9.f7149p
            int r11 = r11 - r2
        L_0x0116:
            if (r11 < 0) goto L_0x015f
            int r13 = r0.f7178e
            if (r11 != r13) goto L_0x011d
            goto L_0x0139
        L_0x011d:
            if (r12 == 0) goto L_0x0128
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r9.f7150q
            r13 = r13[r11]
            int r13 = r13.mo11777e()
            goto L_0x0130
        L_0x0128:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r13 = r9.f7150q
            r13 = r13[r11]
            int r13 = r13.mo11778f()
        L_0x0130:
            android.view.View r13 = r9.mo11314s(r13)
            if (r13 == 0) goto L_0x0139
            if (r13 == r10) goto L_0x0139
            return r13
        L_0x0139:
            int r11 = r11 + -1
            goto L_0x0116
        L_0x013c:
            int r11 = r9.f7149p
            if (r7 >= r11) goto L_0x015f
            if (r12 == 0) goto L_0x014b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r11 = r9.f7150q
            r11 = r11[r7]
            int r11 = r11.mo11777e()
            goto L_0x0153
        L_0x014b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r11 = r9.f7150q
            r11 = r11[r7]
            int r11 = r11.mo11778f()
        L_0x0153:
            android.view.View r11 = r9.mo11314s(r11)
            if (r11 == 0) goto L_0x015c
            if (r11 == r10) goto L_0x015c
            return r11
        L_0x015c:
            int r7 = r7 + 1
            goto L_0x013c
        L_0x015f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo11230X(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    /* renamed from: X0 */
    public final boolean mo11733X0() {
        return mo11646C() == 1;
    }

    /* renamed from: Y */
    public final void mo11288Y(AccessibilityEvent accessibilityEvent) {
        super.mo11288Y(accessibilityEvent);
        if (mo11676y() > 0) {
            View O0 = mo11724O0(false);
            View N0 = mo11723N0(false);
            if (O0 != null && N0 != null) {
                int I = RecyclerView.C3100o.m7396I(O0);
                int I2 = RecyclerView.C3100o.m7396I(N0);
                if (I < I2) {
                    accessibilityEvent.setFromIndex(I);
                    accessibilityEvent.setToIndex(I2);
                    return;
                }
                accessibilityEvent.setFromIndex(I2);
                accessibilityEvent.setToIndex(I);
            }
        }
    }

    /* renamed from: Y0 */
    public final void mo11734Y0(View view, int i, int i2, boolean z) {
        mo11663e(view, this.f7143H);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.f7143H;
        int m1 = m7528m1(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.f7143H;
        int m12 = m7528m1(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (mo11645B0(view, m1, m12, layoutParams)) {
            view.measure(m1, m12);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0432, code lost:
        if (mo11718I0() != false) goto L_0x0436;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01c7  */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11735Z0(androidx.recyclerview.widget.RecyclerView.C3111u r12, androidx.recyclerview.widget.RecyclerView.C3117y r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.f7144I
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.f7141F
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f7159z
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.mo11715b()
            if (r1 != 0) goto L_0x0018
            r11.mo11666n0(r12)
            r0.mo11772a()
            return
        L_0x0018:
            boolean r1 = r0.f7171e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f7159z
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.f7141F
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = r3
            goto L_0x002a
        L_0x0029:
            r1 = r4
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x0206
            r0.mo11772a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f7141F
            if (r6 == 0) goto L_0x00b5
            int r7 = r6.mSpanOffsetsSize
            if (r7 <= 0) goto L_0x0077
            int r8 = r11.f7149p
            if (r7 != r8) goto L_0x006e
            r6 = r3
        L_0x003e:
            int r7 = r11.f7149p
            if (r6 >= r7) goto L_0x0077
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f7150q
            r7 = r7[r6]
            r7.mo11776d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f7141F
            int[] r8 = r7.mSpanOffsets
            r8 = r8[r6]
            if (r8 == r5) goto L_0x0063
            boolean r7 = r7.mAnchorLayoutFromEnd
            if (r7 == 0) goto L_0x005c
            androidx.recyclerview.widget.b0 r7 = r11.f7151r
            int r7 = r7.mo11807g()
            goto L_0x0062
        L_0x005c:
            androidx.recyclerview.widget.b0 r7 = r11.f7151r
            int r7 = r7.mo11811k()
        L_0x0062:
            int r8 = r8 + r7
        L_0x0063:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f7150q
            r7 = r7[r6]
            r7.f7175b = r8
            r7.f7176c = r8
            int r6 = r6 + 1
            goto L_0x003e
        L_0x006e:
            r6.invalidateSpanInfo()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f7141F
            int r7 = r6.mVisibleAnchorPosition
            r6.mAnchorPosition = r7
        L_0x0077:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f7141F
            boolean r7 = r6.mLastLayoutRTL
            r11.f7140E = r7
            boolean r6 = r6.mReverseLayout
            r7 = 0
            r11.mo11294c(r7)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f7141F
            if (r7 == 0) goto L_0x008d
            boolean r8 = r7.mReverseLayout
            if (r8 == r6) goto L_0x008d
            r7.mReverseLayout = r6
        L_0x008d:
            r11.f7156w = r6
            r11.mo11672s0()
            r11.mo11741f1()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f7141F
            int r7 = r6.mAnchorPosition
            if (r7 == r2) goto L_0x00a2
            r11.f7159z = r7
            boolean r7 = r6.mAnchorLayoutFromEnd
            r0.f7169c = r7
            goto L_0x00a6
        L_0x00a2:
            boolean r7 = r11.f7157x
            r0.f7169c = r7
        L_0x00a6:
            int r7 = r6.mSpanLookupSize
            if (r7 <= r4) goto L_0x00bc
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r11.f7137B
            int[] r8 = r6.mSpanLookup
            r7.f7160a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r6 = r6.mFullSpanItems
            r7.f7161b = r6
            goto L_0x00bc
        L_0x00b5:
            r11.mo11741f1()
            boolean r6 = r11.f7157x
            r0.f7169c = r6
        L_0x00bc:
            boolean r6 = r13.f7128g
            if (r6 != 0) goto L_0x01c3
            int r6 = r11.f7159z
            if (r6 != r2) goto L_0x00c6
            goto L_0x01c3
        L_0x00c6:
            if (r6 < 0) goto L_0x01bf
            int r7 = r13.mo11715b()
            if (r6 < r7) goto L_0x00d0
            goto L_0x01bf
        L_0x00d0:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f7141F
            if (r6 == 0) goto L_0x00e5
            int r7 = r6.mAnchorPosition
            if (r7 == r2) goto L_0x00e5
            int r6 = r6.mSpanOffsetsSize
            if (r6 >= r4) goto L_0x00dd
            goto L_0x00e5
        L_0x00dd:
            r0.f7168b = r5
            int r6 = r11.f7159z
            r0.f7167a = r6
            goto L_0x01bd
        L_0x00e5:
            int r6 = r11.f7159z
            android.view.View r6 = r11.mo11314s(r6)
            if (r6 == 0) goto L_0x0177
            boolean r7 = r11.f7157x
            if (r7 == 0) goto L_0x00f6
            int r7 = r11.mo11728S0()
            goto L_0x00fa
        L_0x00f6:
            int r7 = r11.mo11727R0()
        L_0x00fa:
            r0.f7167a = r7
            int r7 = r11.f7136A
            if (r7 == r5) goto L_0x012c
            boolean r7 = r0.f7169c
            if (r7 == 0) goto L_0x0118
            androidx.recyclerview.widget.b0 r7 = r11.f7151r
            int r7 = r7.mo11807g()
            int r8 = r11.f7136A
            int r7 = r7 - r8
            androidx.recyclerview.widget.b0 r8 = r11.f7151r
            int r6 = r8.mo11802b(r6)
            int r7 = r7 - r6
            r0.f7168b = r7
            goto L_0x01bd
        L_0x0118:
            androidx.recyclerview.widget.b0 r7 = r11.f7151r
            int r7 = r7.mo11811k()
            int r8 = r11.f7136A
            int r7 = r7 + r8
            androidx.recyclerview.widget.b0 r8 = r11.f7151r
            int r6 = r8.mo11805e(r6)
            int r7 = r7 - r6
            r0.f7168b = r7
            goto L_0x01bd
        L_0x012c:
            androidx.recyclerview.widget.b0 r7 = r11.f7151r
            int r7 = r7.mo11803c(r6)
            androidx.recyclerview.widget.b0 r8 = r11.f7151r
            int r8 = r8.mo11812l()
            if (r7 <= r8) goto L_0x014f
            boolean r6 = r0.f7169c
            if (r6 == 0) goto L_0x0145
            androidx.recyclerview.widget.b0 r6 = r11.f7151r
            int r6 = r6.mo11807g()
            goto L_0x014b
        L_0x0145:
            androidx.recyclerview.widget.b0 r6 = r11.f7151r
            int r6 = r6.mo11811k()
        L_0x014b:
            r0.f7168b = r6
            goto L_0x01bd
        L_0x014f:
            androidx.recyclerview.widget.b0 r7 = r11.f7151r
            int r7 = r7.mo11805e(r6)
            androidx.recyclerview.widget.b0 r8 = r11.f7151r
            int r8 = r8.mo11811k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x0162
            int r6 = -r7
            r0.f7168b = r6
            goto L_0x01bd
        L_0x0162:
            androidx.recyclerview.widget.b0 r7 = r11.f7151r
            int r7 = r7.mo11807g()
            androidx.recyclerview.widget.b0 r8 = r11.f7151r
            int r6 = r8.mo11802b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x0174
            r0.f7168b = r7
            goto L_0x01bd
        L_0x0174:
            r0.f7168b = r5
            goto L_0x01bd
        L_0x0177:
            int r6 = r11.f7159z
            r0.f7167a = r6
            int r7 = r11.f7136A
            if (r7 != r5) goto L_0x01a0
            int r6 = r11.mo11717H0(r6)
            if (r6 != r4) goto L_0x0187
            r6 = r4
            goto L_0x0188
        L_0x0187:
            r6 = r3
        L_0x0188:
            r0.f7169c = r6
            if (r6 == 0) goto L_0x0195
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.b0 r6 = r6.f7151r
            int r6 = r6.mo11807g()
            goto L_0x019d
        L_0x0195:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.b0 r6 = r6.f7151r
            int r6 = r6.mo11811k()
        L_0x019d:
            r0.f7168b = r6
            goto L_0x01bb
        L_0x01a0:
            boolean r6 = r0.f7169c
            if (r6 == 0) goto L_0x01b0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.b0 r6 = r6.f7151r
            int r6 = r6.mo11807g()
            int r6 = r6 - r7
            r0.f7168b = r6
            goto L_0x01bb
        L_0x01b0:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.b0 r6 = r6.f7151r
            int r6 = r6.mo11811k()
            int r6 = r6 + r7
            r0.f7168b = r6
        L_0x01bb:
            r0.f7170d = r4
        L_0x01bd:
            r6 = r4
            goto L_0x01c4
        L_0x01bf:
            r11.f7159z = r2
            r11.f7136A = r5
        L_0x01c3:
            r6 = r3
        L_0x01c4:
            if (r6 == 0) goto L_0x01c7
            goto L_0x0204
        L_0x01c7:
            boolean r6 = r11.f7139D
            if (r6 == 0) goto L_0x01e3
            int r6 = r13.mo11715b()
            int r7 = r11.mo11676y()
        L_0x01d3:
            int r7 = r7 + r2
            if (r7 < 0) goto L_0x01ff
            android.view.View r8 = r11.mo11674x(r7)
            int r8 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r8)
            if (r8 < 0) goto L_0x01d3
            if (r8 >= r6) goto L_0x01d3
            goto L_0x0200
        L_0x01e3:
            int r6 = r13.mo11715b()
            int r7 = r11.mo11676y()
            r8 = r3
        L_0x01ec:
            if (r8 >= r7) goto L_0x01ff
            android.view.View r9 = r11.mo11674x(r8)
            int r9 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r9)
            if (r9 < 0) goto L_0x01fc
            if (r9 >= r6) goto L_0x01fc
            r8 = r9
            goto L_0x0200
        L_0x01fc:
            int r8 = r8 + 1
            goto L_0x01ec
        L_0x01ff:
            r8 = r3
        L_0x0200:
            r0.f7167a = r8
            r0.f7168b = r5
        L_0x0204:
            r0.f7171e = r4
        L_0x0206:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f7141F
            if (r6 != 0) goto L_0x0223
            int r6 = r11.f7159z
            if (r6 != r2) goto L_0x0223
            boolean r6 = r0.f7169c
            boolean r7 = r11.f7139D
            if (r6 != r7) goto L_0x021c
            boolean r6 = r11.mo11733X0()
            boolean r7 = r11.f7140E
            if (r6 == r7) goto L_0x0223
        L_0x021c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r11.f7137B
            r6.mo11752b()
            r0.f7170d = r4
        L_0x0223:
            int r6 = r11.mo11676y()
            if (r6 <= 0) goto L_0x02db
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f7141F
            if (r6 == 0) goto L_0x0231
            int r6 = r6.mSpanOffsetsSize
            if (r6 >= r4) goto L_0x02db
        L_0x0231:
            boolean r6 = r0.f7170d
            if (r6 == 0) goto L_0x0250
            r1 = r3
        L_0x0236:
            int r6 = r11.f7149p
            if (r1 >= r6) goto L_0x02db
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f7150q
            r6 = r6[r1]
            r6.mo11776d()
            int r6 = r0.f7168b
            if (r6 == r5) goto L_0x024d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f7150q
            r7 = r7[r1]
            r7.f7175b = r6
            r7.f7176c = r6
        L_0x024d:
            int r1 = r1 + 1
            goto L_0x0236
        L_0x0250:
            if (r1 != 0) goto L_0x0272
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f7144I
            int[] r1 = r1.f7172f
            if (r1 != 0) goto L_0x0259
            goto L_0x0272
        L_0x0259:
            r1 = r3
        L_0x025a:
            int r6 = r11.f7149p
            if (r1 >= r6) goto L_0x02db
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f7150q
            r6 = r6[r1]
            r6.mo11776d()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.f7144I
            int[] r7 = r7.f7172f
            r7 = r7[r1]
            r6.f7175b = r7
            r6.f7176c = r7
            int r1 = r1 + 1
            goto L_0x025a
        L_0x0272:
            r1 = r3
        L_0x0273:
            int r6 = r11.f7149p
            if (r1 >= r6) goto L_0x02b3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f7150q
            r6 = r6[r1]
            boolean r7 = r11.f7157x
            int r8 = r0.f7168b
            if (r7 == 0) goto L_0x0286
            int r9 = r6.mo11780h(r5)
            goto L_0x028a
        L_0x0286:
            int r9 = r6.mo11782k(r5)
        L_0x028a:
            r6.mo11776d()
            if (r9 != r5) goto L_0x0290
            goto L_0x02b0
        L_0x0290:
            if (r7 == 0) goto L_0x029c
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.b0 r10 = r10.f7151r
            int r10 = r10.mo11807g()
            if (r9 < r10) goto L_0x02b0
        L_0x029c:
            if (r7 != 0) goto L_0x02a9
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.b0 r7 = r7.f7151r
            int r7 = r7.mo11811k()
            if (r9 <= r7) goto L_0x02a9
            goto L_0x02b0
        L_0x02a9:
            if (r8 == r5) goto L_0x02ac
            int r9 = r9 + r8
        L_0x02ac:
            r6.f7176c = r9
            r6.f7175b = r9
        L_0x02b0:
            int r1 = r1 + 1
            goto L_0x0273
        L_0x02b3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f7144I
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f7150q
            r1.getClass()
            int r7 = r6.length
            int[] r8 = r1.f7172f
            if (r8 == 0) goto L_0x02c2
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02cb
        L_0x02c2:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r8 = r8.f7150q
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f7172f = r8
        L_0x02cb:
            r8 = r3
        L_0x02cc:
            if (r8 >= r7) goto L_0x02db
            int[] r9 = r1.f7172f
            r10 = r6[r8]
            int r10 = r10.mo11782k(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02cc
        L_0x02db:
            r11.mo11670r(r12)
            androidx.recyclerview.widget.t r1 = r11.f7155v
            r1.f7431a = r3
            r11.f7145J = r3
            androidx.recyclerview.widget.b0 r1 = r11.f7152s
            int r1 = r1.mo11812l()
            int r6 = r11.f7149p
            int r6 = r1 / r6
            r11.f7154u = r6
            androidx.recyclerview.widget.b0 r6 = r11.f7152s
            int r6 = r6.mo11809i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r11.f7142G = r1
            int r1 = r0.f7167a
            r11.mo11746k1(r1, r13)
            boolean r1 = r0.f7169c
            if (r1 == 0) goto L_0x031d
            r11.mo11743h1(r2)
            androidx.recyclerview.widget.t r1 = r11.f7155v
            r11.mo11722M0(r12, r1, r13)
            r11.mo11743h1(r4)
            androidx.recyclerview.widget.t r1 = r11.f7155v
            int r2 = r0.f7167a
            int r6 = r1.f7434d
            int r2 = r2 + r6
            r1.f7433c = r2
            r11.mo11722M0(r12, r1, r13)
            goto L_0x0334
        L_0x031d:
            r11.mo11743h1(r4)
            androidx.recyclerview.widget.t r1 = r11.f7155v
            r11.mo11722M0(r12, r1, r13)
            r11.mo11743h1(r2)
            androidx.recyclerview.widget.t r1 = r11.f7155v
            int r2 = r0.f7167a
            int r6 = r1.f7434d
            int r2 = r2 + r6
            r1.f7433c = r2
            r11.mo11722M0(r12, r1, r13)
        L_0x0334:
            androidx.recyclerview.widget.b0 r1 = r11.f7152s
            int r1 = r1.mo11809i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0340
            goto L_0x03ef
        L_0x0340:
            r1 = 0
            int r2 = r11.mo11676y()
            r6 = r3
        L_0x0346:
            if (r6 >= r2) goto L_0x0372
            android.view.View r7 = r11.mo11674x(r6)
            androidx.recyclerview.widget.b0 r8 = r11.f7152s
            int r8 = r8.mo11803c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0358
            goto L_0x036f
        L_0x0358:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            boolean r7 = r7.isFullSpan()
            if (r7 == 0) goto L_0x036b
            r7 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 * r7
            int r7 = r11.f7149p
            float r7 = (float) r7
            float r8 = r8 / r7
        L_0x036b:
            float r1 = java.lang.Math.max(r1, r8)
        L_0x036f:
            int r6 = r6 + 1
            goto L_0x0346
        L_0x0372:
            int r6 = r11.f7154u
            int r7 = r11.f7149p
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.b0 r7 = r11.f7152s
            int r7 = r7.mo11809i()
            if (r7 != r5) goto L_0x038e
            androidx.recyclerview.widget.b0 r5 = r11.f7152s
            int r5 = r5.mo11812l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x038e:
            int r5 = r11.f7149p
            int r5 = r1 / r5
            r11.f7154u = r5
            androidx.recyclerview.widget.b0 r5 = r11.f7152s
            int r5 = r5.mo11809i()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            r11.f7142G = r1
            int r1 = r11.f7154u
            if (r1 != r6) goto L_0x03a5
            goto L_0x03ef
        L_0x03a5:
            r1 = r3
        L_0x03a6:
            if (r1 >= r2) goto L_0x03ef
            android.view.View r5 = r11.mo11674x(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            boolean r8 = r7.mFullSpan
            if (r8 == 0) goto L_0x03b7
            goto L_0x03ec
        L_0x03b7:
            boolean r8 = r11.mo11733X0()
            if (r8 == 0) goto L_0x03d7
            int r8 = r11.f7153t
            if (r8 != r4) goto L_0x03d7
            int r8 = r11.f7149p
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r7.mSpan
            int r7 = r7.f7178e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f7154u
            int r9 = r9 * r10
            int r8 = r8 - r4
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03ec
        L_0x03d7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r7.mSpan
            int r7 = r7.f7178e
            int r8 = r11.f7154u
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f7153t
            if (r9 != r4) goto L_0x03e8
            int r8 = r8 - r7
            r5.offsetLeftAndRight(r8)
            goto L_0x03ec
        L_0x03e8:
            int r8 = r8 - r7
            r5.offsetTopAndBottom(r8)
        L_0x03ec:
            int r1 = r1 + 1
            goto L_0x03a6
        L_0x03ef:
            int r1 = r11.mo11676y()
            if (r1 <= 0) goto L_0x0406
            boolean r1 = r11.f7157x
            if (r1 == 0) goto L_0x0400
            r11.mo11725P0(r12, r13, r4)
            r11.mo11726Q0(r12, r13, r3)
            goto L_0x0406
        L_0x0400:
            r11.mo11726Q0(r12, r13, r4)
            r11.mo11725P0(r12, r13, r3)
        L_0x0406:
            if (r14 == 0) goto L_0x0435
            boolean r14 = r13.f7128g
            if (r14 != 0) goto L_0x0435
            int r14 = r11.f7138C
            if (r14 == 0) goto L_0x0422
            int r14 = r11.mo11676y()
            if (r14 <= 0) goto L_0x0422
            boolean r14 = r11.f7145J
            if (r14 != 0) goto L_0x0420
            android.view.View r14 = r11.mo11732W0()
            if (r14 == 0) goto L_0x0422
        L_0x0420:
            r14 = r4
            goto L_0x0423
        L_0x0422:
            r14 = r3
        L_0x0423:
            if (r14 == 0) goto L_0x0435
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r14 = r11.f7148M
            androidx.recyclerview.widget.RecyclerView r1 = r11.f7072b
            if (r1 == 0) goto L_0x042e
            r1.removeCallbacks(r14)
        L_0x042e:
            boolean r14 = r11.mo11718I0()
            if (r14 == 0) goto L_0x0435
            goto L_0x0436
        L_0x0435:
            r4 = r3
        L_0x0436:
            boolean r14 = r13.f7128g
            if (r14 == 0) goto L_0x043f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f7144I
            r14.mo11772a()
        L_0x043f:
            boolean r14 = r0.f7169c
            r11.f7139D = r14
            boolean r14 = r11.mo11733X0()
            r11.f7140E = r14
            if (r4 == 0) goto L_0x0453
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f7144I
            r14.mo11772a()
            r11.mo11735Z0(r12, r13, r3)
        L_0x0453:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo11735Z0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, boolean):void");
    }

    /* renamed from: a */
    public final PointF mo11291a(int i) {
        int H0 = mo11717H0(i);
        PointF pointF = new PointF();
        if (H0 == 0) {
            return null;
        }
        if (this.f7153t == 0) {
            pointF.x = (float) H0;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) H0;
        }
        return pointF;
    }

    /* renamed from: a1 */
    public final boolean mo11736a1(int i) {
        if (this.f7153t == 0) {
            return (i == -1) != this.f7157x;
        }
        return ((i == -1) == this.f7157x) == mo11733X0();
    }

    /* renamed from: b1 */
    public final void mo11737b1(int i, RecyclerView.C3117y yVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo11728S0();
            i2 = 1;
        } else {
            i2 = -1;
            i3 = mo11727R0();
        }
        this.f7155v.f7431a = true;
        mo11746k1(i3, yVar);
        mo11743h1(i2);
        C3197t tVar = this.f7155v;
        tVar.f7433c = i3 + tVar.f7434d;
        tVar.f7432b = Math.abs(i);
    }

    /* renamed from: c */
    public final void mo11294c(String str) {
        if (this.f7141F == null) {
            super.mo11294c(str);
        }
    }

    /* renamed from: c0 */
    public final void mo11233c0(int i, int i2) {
        mo11731V0(i, i2, 1);
    }

    /* renamed from: c1 */
    public final void mo11738c1(RecyclerView.C3111u uVar, C3197t tVar) {
        if (tVar.f7431a && !tVar.f7439i) {
            if (tVar.f7432b != 0) {
                int i = 1;
                if (tVar.f7435e == -1) {
                    int i2 = tVar.f7436f;
                    int k = this.f7150q[0].mo11782k(i2);
                    while (i < this.f7149p) {
                        int k2 = this.f7150q[i].mo11782k(i2);
                        if (k2 > k) {
                            k = k2;
                        }
                        i++;
                    }
                    int i3 = i2 - k;
                    mo11739d1(i3 < 0 ? tVar.f7437g : tVar.f7437g - Math.min(i3, tVar.f7432b), uVar);
                    return;
                }
                int i4 = tVar.f7437g;
                int h = this.f7150q[0].mo11780h(i4);
                while (i < this.f7149p) {
                    int h2 = this.f7150q[i].mo11780h(i4);
                    if (h2 < h) {
                        h = h2;
                    }
                    i++;
                }
                int i5 = h - tVar.f7437g;
                mo11740e1(i5 < 0 ? tVar.f7436f : Math.min(i5, tVar.f7432b) + tVar.f7436f, uVar);
            } else if (tVar.f7435e == -1) {
                mo11739d1(tVar.f7437g, uVar);
            } else {
                mo11740e1(tVar.f7436f, uVar);
            }
        }
    }

    /* renamed from: d0 */
    public final void mo11234d0() {
        this.f7137B.mo11752b();
        mo11672s0();
    }

    /* renamed from: d1 */
    public final void mo11739d1(int i, RecyclerView.C3111u uVar) {
        int y = mo11676y() - 1;
        while (y >= 0) {
            View x = mo11674x(y);
            if (this.f7151r.mo11805e(x) >= i && this.f7151r.mo11814n(x) >= i) {
                LayoutParams layoutParams = (LayoutParams) x.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    int i2 = 0;
                    while (i2 < this.f7149p) {
                        if (this.f7150q[i2].f7174a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f7149p; i3++) {
                        this.f7150q[i3].mo11783l();
                    }
                } else if (layoutParams.mSpan.f7174a.size() != 1) {
                    layoutParams.mSpan.mo11783l();
                } else {
                    return;
                }
                mo11668p0(x);
                uVar.mo11697g(x);
                y--;
            } else {
                return;
            }
        }
    }

    /* renamed from: e0 */
    public final void mo11235e0(int i, int i2) {
        mo11731V0(i, i2, 8);
    }

    /* renamed from: e1 */
    public final void mo11740e1(int i, RecyclerView.C3111u uVar) {
        while (mo11676y() > 0) {
            View x = mo11674x(0);
            if (this.f7151r.mo11802b(x) <= i && this.f7151r.mo11813m(x) <= i) {
                LayoutParams layoutParams = (LayoutParams) x.getLayoutParams();
                if (layoutParams.mFullSpan) {
                    int i2 = 0;
                    while (i2 < this.f7149p) {
                        if (this.f7150q[i2].f7174a.size() != 1) {
                            i2++;
                        } else {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.f7149p; i3++) {
                        this.f7150q[i3].mo11784m();
                    }
                } else if (layoutParams.mSpan.f7174a.size() != 1) {
                    layoutParams.mSpan.mo11784m();
                } else {
                    return;
                }
                mo11668p0(x);
                uVar.mo11697g(x);
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo11297f() {
        return this.f7153t == 0;
    }

    /* renamed from: f0 */
    public final void mo11237f0(int i, int i2) {
        mo11731V0(i, i2, 2);
    }

    /* renamed from: f1 */
    public final void mo11741f1() {
        if (this.f7153t == 1 || !mo11733X0()) {
            this.f7157x = this.f7156w;
        } else {
            this.f7157x = !this.f7156w;
        }
    }

    /* renamed from: g */
    public final boolean mo11298g() {
        return this.f7153t == 1;
    }

    /* renamed from: g0 */
    public final void mo11239g0(int i, int i2) {
        mo11731V0(i, i2, 4);
    }

    /* renamed from: g1 */
    public final int mo11742g1(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (mo11676y() == 0 || i == 0) {
            return 0;
        }
        mo11737b1(i, yVar);
        int M0 = mo11722M0(uVar, this.f7155v, yVar);
        if (this.f7155v.f7432b >= M0) {
            i = i < 0 ? -M0 : M0;
        }
        this.f7151r.mo11815o(-i);
        this.f7139D = this.f7157x;
        C3197t tVar = this.f7155v;
        tVar.f7432b = 0;
        mo11738c1(uVar, tVar);
        return i;
    }

    /* renamed from: h */
    public final boolean mo11240h(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: h0 */
    public final void mo11241h0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        mo11735Z0(uVar, yVar, true);
    }

    /* renamed from: h1 */
    public final void mo11743h1(int i) {
        C3197t tVar = this.f7155v;
        tVar.f7435e = i;
        int i2 = 1;
        if (this.f7157x != (i == -1)) {
            i2 = -1;
        }
        tVar.f7434d = i2;
    }

    /* renamed from: i0 */
    public final void mo11242i0(RecyclerView.C3117y yVar) {
        this.f7159z = -1;
        this.f7136A = Integer.MIN_VALUE;
        this.f7141F = null;
        this.f7144I.mo11772a();
    }

    /* renamed from: i1 */
    public final void mo11744i1(int i) {
        mo11294c((String) null);
        if (i != this.f7149p) {
            this.f7137B.mo11752b();
            mo11672s0();
            this.f7149p = i;
            this.f7158y = new BitSet(this.f7149p);
            this.f7150q = new C3123c[this.f7149p];
            for (int i2 = 0; i2 < this.f7149p; i2++) {
                this.f7150q[i2] = new C3123c(i2);
            }
            mo11672s0();
        }
    }

    /* renamed from: j */
    public final void mo11302j(int i, int i2, RecyclerView.C3117y yVar, RecyclerView.C3100o.C3103c cVar) {
        int i3;
        int i4;
        if (this.f7153t != 0) {
            i = i2;
        }
        if (mo11676y() != 0 && i != 0) {
            mo11737b1(i, yVar);
            int[] iArr = this.f7147L;
            if (iArr == null || iArr.length < this.f7149p) {
                this.f7147L = new int[this.f7149p];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f7149p; i6++) {
                C3197t tVar = this.f7155v;
                if (tVar.f7434d == -1) {
                    i4 = tVar.f7436f;
                    i3 = this.f7150q[i6].mo11782k(i4);
                } else {
                    i4 = this.f7150q[i6].mo11780h(tVar.f7437g);
                    i3 = this.f7155v.f7437g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f7147L[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f7147L, 0, i5);
            int i8 = 0;
            while (i8 < i5) {
                int i9 = this.f7155v.f7433c;
                if (i9 >= 0 && i9 < yVar.mo11715b()) {
                    ((C3181p.C3183b) cVar).mo11915a(this.f7155v.f7433c, this.f7147L[i8]);
                    C3197t tVar2 = this.f7155v;
                    tVar2.f7433c += tVar2.f7434d;
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: j0 */
    public final void mo11303j0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7141F = savedState;
            if (this.f7159z != -1) {
                savedState.invalidateAnchorPositionInfo();
                this.f7141F.invalidateSpanInfo();
            }
            mo11672s0();
        }
    }

    /* renamed from: j1 */
    public final void mo11745j1(int i, int i2) {
        for (int i3 = 0; i3 < this.f7149p; i3++) {
            if (!this.f7150q[i3].f7174a.isEmpty()) {
                mo11747l1(this.f7150q[i3], i, i2);
            }
        }
    }

    /* renamed from: k0 */
    public final Parcelable mo11306k0() {
        int i;
        int i2;
        int[] iArr;
        SavedState savedState = this.f7141F;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.mReverseLayout = this.f7156w;
        savedState2.mAnchorLayoutFromEnd = this.f7139D;
        savedState2.mLastLayoutRTL = this.f7140E;
        LazySpanLookup lazySpanLookup = this.f7137B;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f7160a) == null) {
            savedState2.mSpanLookupSize = 0;
        } else {
            savedState2.mSpanLookup = iArr;
            savedState2.mSpanLookupSize = iArr.length;
            savedState2.mFullSpanItems = lazySpanLookup.f7161b;
        }
        int i3 = -1;
        if (mo11676y() > 0) {
            savedState2.mAnchorPosition = this.f7139D ? mo11728S0() : mo11727R0();
            View N0 = this.f7157x ? mo11723N0(true) : mo11724O0(true);
            if (N0 != null) {
                i3 = RecyclerView.C3100o.m7396I(N0);
            }
            savedState2.mVisibleAnchorPosition = i3;
            int i4 = this.f7149p;
            savedState2.mSpanOffsetsSize = i4;
            savedState2.mSpanOffsets = new int[i4];
            for (int i5 = 0; i5 < this.f7149p; i5++) {
                if (this.f7139D) {
                    i = this.f7150q[i5].mo11780h(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f7151r.mo11807g();
                    } else {
                        savedState2.mSpanOffsets[i5] = i;
                    }
                } else {
                    i = this.f7150q[i5].mo11782k(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.f7151r.mo11811k();
                    } else {
                        savedState2.mSpanOffsets[i5] = i;
                    }
                }
                i -= i2;
                savedState2.mSpanOffsets[i5] = i;
            }
        } else {
            savedState2.mAnchorPosition = -1;
            savedState2.mVisibleAnchorPosition = -1;
            savedState2.mSpanOffsetsSize = 0;
        }
        return savedState2;
    }

    /* renamed from: k1 */
    public final void mo11746k1(int i, RecyclerView.C3117y yVar) {
        int i2;
        int i3;
        int i4;
        C3197t tVar = this.f7155v;
        boolean z = false;
        tVar.f7432b = 0;
        tVar.f7433c = i;
        RecyclerView.C3114x xVar = this.f7075e;
        if (!(xVar != null && xVar.f7111e) || (i4 = yVar.f7122a) == -1) {
            i3 = 0;
            i2 = 0;
        } else {
            if (this.f7157x == (i4 < i)) {
                i3 = this.f7151r.mo11812l();
                i2 = 0;
            } else {
                i2 = this.f7151r.mo11812l();
                i3 = 0;
            }
        }
        RecyclerView recyclerView = this.f7072b;
        if (recyclerView != null && recyclerView.mClipToPadding) {
            this.f7155v.f7436f = this.f7151r.mo11811k() - i2;
            this.f7155v.f7437g = this.f7151r.mo11807g() + i3;
        } else {
            this.f7155v.f7437g = this.f7151r.mo11806f() + i3;
            this.f7155v.f7436f = -i2;
        }
        C3197t tVar2 = this.f7155v;
        tVar2.f7438h = false;
        tVar2.f7431a = true;
        if (this.f7151r.mo11809i() == 0 && this.f7151r.mo11806f() == 0) {
            z = true;
        }
        tVar2.f7439i = z;
    }

    /* renamed from: l */
    public final int mo11308l(RecyclerView.C3117y yVar) {
        return mo11719J0(yVar);
    }

    /* renamed from: l0 */
    public final void mo11664l0(int i) {
        if (i == 0) {
            mo11718I0();
        }
    }

    /* renamed from: l1 */
    public final void mo11747l1(C3123c cVar, int i, int i2) {
        int i3 = cVar.f7177d;
        if (i == -1) {
            int i4 = cVar.f7175b;
            if (i4 == Integer.MIN_VALUE) {
                cVar.mo11775c();
                i4 = cVar.f7175b;
            }
            if (i4 + i3 <= i2) {
                this.f7158y.set(cVar.f7178e, false);
                return;
            }
            return;
        }
        int i5 = cVar.f7176c;
        if (i5 == Integer.MIN_VALUE) {
            cVar.mo11774b();
            i5 = cVar.f7176c;
        }
        if (i5 - i3 >= i2) {
            this.f7158y.set(cVar.f7178e, false);
        }
    }

    /* renamed from: m */
    public final int mo11243m(RecyclerView.C3117y yVar) {
        return mo11720K0(yVar);
    }

    /* renamed from: n */
    public final int mo11245n(RecyclerView.C3117y yVar) {
        return mo11721L0(yVar);
    }

    /* renamed from: o */
    public final int mo11311o(RecyclerView.C3117y yVar) {
        return mo11719J0(yVar);
    }

    /* renamed from: p */
    public final int mo11246p(RecyclerView.C3117y yVar) {
        return mo11720K0(yVar);
    }

    /* renamed from: q */
    public final int mo11247q(RecyclerView.C3117y yVar) {
        return mo11721L0(yVar);
    }

    /* renamed from: t */
    public final RecyclerView.LayoutParams mo11251t() {
        return this.f7153t == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    /* renamed from: t0 */
    public final int mo11252t0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        return mo11742g1(i, uVar, yVar);
    }

    /* renamed from: u */
    public final RecyclerView.LayoutParams mo11254u(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: u0 */
    public final void mo11315u0(int i) {
        SavedState savedState = this.f7141F;
        if (!(savedState == null || savedState.mAnchorPosition == i)) {
            savedState.invalidateAnchorPositionInfo();
        }
        this.f7159z = i;
        this.f7136A = Integer.MIN_VALUE;
        mo11672s0();
    }

    /* renamed from: v */
    public final RecyclerView.LayoutParams mo11256v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: v0 */
    public final int mo11257v0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        return mo11742g1(i, uVar, yVar);
    }

    /* renamed from: y0 */
    public final void mo11261y0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int G = mo11651G() + mo11649F();
        int E = mo11648E() + mo11652H();
        if (this.f7153t == 1) {
            int height = rect.height() + E;
            RecyclerView recyclerView = this.f7072b;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            i4 = RecyclerView.C3100o.m7402i(i2, height, C2364y.C2368d.m5214d(recyclerView));
            i3 = RecyclerView.C3100o.m7402i(i, (this.f7154u * this.f7149p) + G, C2364y.C2368d.m5215e(this.f7072b));
        } else {
            int width = rect.width() + G;
            RecyclerView recyclerView2 = this.f7072b;
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            i3 = RecyclerView.C3100o.m7402i(i, width, C2364y.C2368d.m5215e(recyclerView2));
            i4 = RecyclerView.C3100o.m7402i(i2, (this.f7154u * this.f7149p) + E, C2364y.C2368d.m5214d(this.f7072b));
        }
        this.f7072b.setMeasuredDimension(i3, i4);
    }

    public static class LazySpanLookup {

        /* renamed from: a */
        public int[] f7160a;

        /* renamed from: b */
        public List<FullSpanItem> f7161b;

        /* renamed from: a */
        public final void mo11751a(FullSpanItem fullSpanItem) {
            if (this.f7161b == null) {
                this.f7161b = new ArrayList();
            }
            int size = this.f7161b.size();
            for (int i = 0; i < size; i++) {
                FullSpanItem fullSpanItem2 = this.f7161b.get(i);
                if (fullSpanItem2.f7162b == fullSpanItem.f7162b) {
                    this.f7161b.remove(i);
                }
                if (fullSpanItem2.f7162b >= fullSpanItem.f7162b) {
                    this.f7161b.add(i, fullSpanItem);
                    return;
                }
            }
            this.f7161b.add(fullSpanItem);
        }

        /* renamed from: b */
        public final void mo11752b() {
            int[] iArr = this.f7160a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f7161b = null;
        }

        /* renamed from: c */
        public final void mo11753c(int i) {
            int[] iArr = this.f7160a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f7160a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f7160a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f7160a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* renamed from: d */
        public final void mo11754d(int i) {
            List<FullSpanItem> list = this.f7161b;
            if (list != null) {
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else if (this.f7161b.get(size).f7162b >= i) {
                        this.f7161b.remove(size);
                    }
                }
            }
            mo11757g(i);
        }

        /* renamed from: e */
        public final FullSpanItem mo11755e(int i, int i2, int i3) {
            List<FullSpanItem> list = this.f7161b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                FullSpanItem fullSpanItem = this.f7161b.get(i4);
                int i5 = fullSpanItem.f7162b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || fullSpanItem.f7163c == i3 || fullSpanItem.f7165e)) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* renamed from: f */
        public final FullSpanItem mo11756f(int i) {
            List<FullSpanItem> list = this.f7161b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                FullSpanItem fullSpanItem = this.f7161b.get(size);
                if (fullSpanItem.f7162b == i) {
                    return fullSpanItem;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo11757g(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.f7160a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f7161b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = r1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = r4.mo11756f(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r2 = r4.f7161b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f7161b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.f7161b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f7162b
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = r1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r4.f7161b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r4.f7161b
                r3.remove(r2)
                int r0 = r0.f7162b
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.f7160a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.f7160a
                int r5 = r5.length
                return r5
            L_0x0052:
                int r0 = r0 + 1
                int[] r2 = r4.f7160a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r4.f7160a
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.mo11757g(int):int");
        }

        /* renamed from: h */
        public final void mo11758h(int i, int i2) {
            int[] iArr = this.f7160a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo11753c(i3);
                int[] iArr2 = this.f7160a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f7160a, i, i3, -1);
                List<FullSpanItem> list = this.f7161b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f7161b.get(size);
                        int i4 = fullSpanItem.f7162b;
                        if (i4 >= i) {
                            fullSpanItem.f7162b = i4 + i2;
                        }
                    }
                }
            }
        }

        /* renamed from: i */
        public final void mo11759i(int i, int i2) {
            int[] iArr = this.f7160a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo11753c(i3);
                int[] iArr2 = this.f7160a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f7160a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<FullSpanItem> list = this.f7161b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f7161b.get(size);
                        int i4 = fullSpanItem.f7162b;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f7161b.remove(size);
                            } else {
                                fullSpanItem.f7162b = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C3119a();

            /* renamed from: b */
            public int f7162b;

            /* renamed from: c */
            public int f7163c;

            /* renamed from: d */
            public int[] f7164d;

            /* renamed from: e */
            public boolean f7165e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C3119a implements Parcelable.Creator<FullSpanItem> {
                public final Object createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public final Object[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f7162b = parcel.readInt();
                this.f7163c = parcel.readInt();
                this.f7165e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f7164d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder h = C0072d.m201h("FullSpanItem{mPosition=");
                h.append(this.f7162b);
                h.append(", mGapDir=");
                h.append(this.f7163c);
                h.append(", mHasUnwantedGapAfter=");
                h.append(this.f7165e);
                h.append(", mGapPerSpan=");
                h.append(Arrays.toString(this.f7164d));
                h.append('}');
                return h.toString();
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f7162b);
                parcel.writeInt(this.f7163c);
                parcel.writeInt(this.f7165e ? 1 : 0);
                int[] iArr = this.f7164d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f7164d);
            }

            public FullSpanItem() {
            }
        }
    }

    public StaggeredGridLayoutManager(int i) {
        this.f7149p = -1;
        this.f7156w = false;
        this.f7157x = false;
        this.f7159z = -1;
        this.f7136A = Integer.MIN_VALUE;
        this.f7137B = new LazySpanLookup();
        this.f7138C = 2;
        this.f7143H = new Rect();
        this.f7144I = new C3122b();
        this.f7145J = false;
        this.f7146K = true;
        this.f7148M = new C3121a();
        this.f7153t = 1;
        mo11744i1(i);
        this.f7155v = new C3197t();
        this.f7151r = C3129b0.m7653a(this, this.f7153t);
        this.f7152s = C3129b0.m7653a(this, 1 - this.f7153t);
    }
}
