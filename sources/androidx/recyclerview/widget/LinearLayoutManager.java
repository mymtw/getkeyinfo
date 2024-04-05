package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.C0072d;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.compose.animation.C0391c;
import androidx.recyclerview.widget.C3181p;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;
import java.util.List;
import p003a2.C0015b;

public class LinearLayoutManager extends RecyclerView.C3100o implements RecyclerView.C3114x.C3116b {

    /* renamed from: A */
    public final C3077a f7013A;

    /* renamed from: B */
    public final C3078b f7014B;

    /* renamed from: C */
    public int f7015C;

    /* renamed from: D */
    public int[] f7016D;

    /* renamed from: p */
    public int f7017p;

    /* renamed from: q */
    public C3079c f7018q;

    /* renamed from: r */
    public C3129b0 f7019r;

    /* renamed from: s */
    public boolean f7020s;

    /* renamed from: t */
    public boolean f7021t;

    /* renamed from: u */
    public boolean f7022u;

    /* renamed from: v */
    public boolean f7023v;

    /* renamed from: w */
    public boolean f7024w;

    /* renamed from: x */
    public int f7025x;

    /* renamed from: y */
    public int f7026y;

    /* renamed from: z */
    public SavedState f7027z;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C3076a();
        public boolean mAnchorLayoutFromEnd;
        public int mAnchorOffset;
        public int mAnchorPosition;

        /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$SavedState$a */
        public class C3076a implements Parcelable.Creator<SavedState> {
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

        public boolean hasValidAnchor() {
            return this.mAnchorPosition >= 0;
        }

        public void invalidateAnchor() {
            this.mAnchorPosition = -1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mAnchorPosition);
            parcel.writeInt(this.mAnchorOffset);
            parcel.writeInt(this.mAnchorLayoutFromEnd ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            this.mAnchorPosition = parcel.readInt();
            this.mAnchorOffset = parcel.readInt();
            this.mAnchorLayoutFromEnd = parcel.readInt() != 1 ? false : true;
        }

        public SavedState(SavedState savedState) {
            this.mAnchorPosition = savedState.mAnchorPosition;
            this.mAnchorOffset = savedState.mAnchorOffset;
            this.mAnchorLayoutFromEnd = savedState.mAnchorLayoutFromEnd;
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$a */
    public static class C3077a {

        /* renamed from: a */
        public C3129b0 f7028a;

        /* renamed from: b */
        public int f7029b;

        /* renamed from: c */
        public int f7030c;

        /* renamed from: d */
        public boolean f7031d;

        /* renamed from: e */
        public boolean f7032e;

        public C3077a() {
            mo11325d();
        }

        /* renamed from: a */
        public final void mo11322a() {
            this.f7030c = this.f7031d ? this.f7028a.mo11807g() : this.f7028a.mo11811k();
        }

        /* renamed from: b */
        public final void mo11323b(int i, View view) {
            if (this.f7031d) {
                int b = this.f7028a.mo11802b(view);
                C3129b0 b0Var = this.f7028a;
                this.f7030c = (Integer.MIN_VALUE == b0Var.f7192b ? 0 : b0Var.mo11812l() - b0Var.f7192b) + b;
            } else {
                this.f7030c = this.f7028a.mo11805e(view);
            }
            this.f7029b = i;
        }

        /* renamed from: c */
        public final void mo11324c(int i, View view) {
            C3129b0 b0Var = this.f7028a;
            int l = Integer.MIN_VALUE == b0Var.f7192b ? 0 : b0Var.mo11812l() - b0Var.f7192b;
            if (l >= 0) {
                mo11323b(i, view);
                return;
            }
            this.f7029b = i;
            if (this.f7031d) {
                int g = (this.f7028a.mo11807g() - l) - this.f7028a.mo11802b(view);
                this.f7030c = this.f7028a.mo11807g() - g;
                if (g > 0) {
                    int c = this.f7030c - this.f7028a.mo11803c(view);
                    int k = this.f7028a.mo11811k();
                    int min = c - (Math.min(this.f7028a.mo11805e(view) - k, 0) + k);
                    if (min < 0) {
                        this.f7030c = Math.min(g, -min) + this.f7030c;
                        return;
                    }
                    return;
                }
                return;
            }
            int e = this.f7028a.mo11805e(view);
            int k2 = e - this.f7028a.mo11811k();
            this.f7030c = e;
            if (k2 > 0) {
                int g2 = (this.f7028a.mo11807g() - Math.min(0, (this.f7028a.mo11807g() - l) - this.f7028a.mo11802b(view))) - (this.f7028a.mo11803c(view) + e);
                if (g2 < 0) {
                    this.f7030c -= Math.min(k2, -g2);
                }
            }
        }

        /* renamed from: d */
        public final void mo11325d() {
            this.f7029b = -1;
            this.f7030c = Integer.MIN_VALUE;
            this.f7031d = false;
            this.f7032e = false;
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("AnchorInfo{mPosition=");
            h.append(this.f7029b);
            h.append(", mCoordinate=");
            h.append(this.f7030c);
            h.append(", mLayoutFromEnd=");
            h.append(this.f7031d);
            h.append(", mValid=");
            return C0391c.m1058d(h, this.f7032e, '}');
        }
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$b */
    public static class C3078b {

        /* renamed from: a */
        public int f7033a;

        /* renamed from: b */
        public boolean f7034b;

        /* renamed from: c */
        public boolean f7035c;

        /* renamed from: d */
        public boolean f7036d;
    }

    /* renamed from: androidx.recyclerview.widget.LinearLayoutManager$c */
    public static class C3079c {

        /* renamed from: a */
        public boolean f7037a = true;

        /* renamed from: b */
        public int f7038b;

        /* renamed from: c */
        public int f7039c;

        /* renamed from: d */
        public int f7040d;

        /* renamed from: e */
        public int f7041e;

        /* renamed from: f */
        public int f7042f;

        /* renamed from: g */
        public int f7043g;

        /* renamed from: h */
        public int f7044h = 0;

        /* renamed from: i */
        public int f7045i = 0;

        /* renamed from: j */
        public int f7046j;

        /* renamed from: k */
        public List<RecyclerView.C3084b0> f7047k = null;

        /* renamed from: l */
        public boolean f7048l;

        /* renamed from: a */
        public final void mo11327a(View view) {
            int viewLayoutPosition;
            int size = this.f7047k.size();
            View view2 = null;
            int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.f7047k.get(i2).itemView;
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view3.getLayoutParams();
                if (view3 != view && !layoutParams.isItemRemoved() && (viewLayoutPosition = (layoutParams.getViewLayoutPosition() - this.f7040d) * this.f7041e) >= 0 && viewLayoutPosition < i) {
                    view2 = view3;
                    if (viewLayoutPosition == 0) {
                        break;
                    }
                    i = viewLayoutPosition;
                }
            }
            if (view2 == null) {
                this.f7040d = -1;
            } else {
                this.f7040d = ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition();
            }
        }

        /* renamed from: b */
        public final View mo11328b(RecyclerView.C3111u uVar) {
            List<RecyclerView.C3084b0> list = this.f7047k;
            if (list != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    View view = this.f7047k.get(i).itemView;
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    if (!layoutParams.isItemRemoved() && this.f7040d == layoutParams.getViewLayoutPosition()) {
                        mo11327a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = uVar.mo11701k(this.f7040d, Long.MAX_VALUE).itemView;
            this.f7040d += this.f7041e;
            return view2;
        }
    }

    public LinearLayoutManager() {
        this(1, false);
    }

    /* renamed from: C0 */
    public final boolean mo11269C0() {
        boolean z;
        if (!(this.f7083m == 1073741824 || this.f7082l == 1073741824)) {
            int y = mo11676y();
            int i = 0;
            while (true) {
                if (i >= y) {
                    z = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = mo11674x(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z = true;
                    break;
                }
                i++;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: E0 */
    public void mo11270E0(RecyclerView recyclerView, int i) {
        C3198u uVar = new C3198u(recyclerView.getContext());
        uVar.f7107a = i;
        mo11650F0(uVar);
    }

    /* renamed from: G0 */
    public boolean mo11227G0() {
        return this.f7027z == null && this.f7020s == this.f7023v;
    }

    /* renamed from: H0 */
    public void mo11271H0(RecyclerView.C3117y yVar, int[] iArr) {
        int i;
        int c1 = mo11295c1(yVar);
        if (this.f7018q.f7042f == -1) {
            i = 0;
        } else {
            i = c1;
            c1 = 0;
        }
        iArr[0] = c1;
        iArr[1] = i;
    }

    /* renamed from: I0 */
    public void mo11228I0(RecyclerView.C3117y yVar, C3079c cVar, RecyclerView.C3100o.C3103c cVar2) {
        int i = cVar.f7040d;
        if (i >= 0 && i < yVar.mo11715b()) {
            ((C3181p.C3183b) cVar2).mo11915a(i, Math.max(0, cVar.f7043g));
        }
    }

    /* renamed from: J0 */
    public final int mo11272J0(RecyclerView.C3117y yVar) {
        if (mo11676y() == 0) {
            return 0;
        }
        mo11276N0();
        return C3142e0.m7688a(yVar, this.f7019r, mo11281R0(!this.f7024w), mo11280Q0(!this.f7024w), this, this.f7024w);
    }

    /* renamed from: K0 */
    public final int mo11273K0(RecyclerView.C3117y yVar) {
        if (mo11676y() == 0) {
            return 0;
        }
        mo11276N0();
        return C3142e0.m7689b(yVar, this.f7019r, mo11281R0(!this.f7024w), mo11280Q0(!this.f7024w), this, this.f7024w, this.f7022u);
    }

    /* renamed from: L0 */
    public final int mo11274L0(RecyclerView.C3117y yVar) {
        if (mo11676y() == 0) {
            return 0;
        }
        mo11276N0();
        return C3142e0.m7690c(yVar, this.f7019r, mo11281R0(!this.f7024w), mo11280Q0(!this.f7024w), this, this.f7024w);
    }

    /* renamed from: M0 */
    public final int mo11275M0(int i) {
        if (i == 1) {
            return (this.f7017p != 1 && mo11296d1()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f7017p != 1 && mo11296d1()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f7017p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f7017p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 66) {
            return this.f7017p == 0 ? 1 : Integer.MIN_VALUE;
        }
        if (i != 130) {
            return Integer.MIN_VALUE;
        }
        return this.f7017p == 1 ? 1 : Integer.MIN_VALUE;
    }

    /* renamed from: N0 */
    public final void mo11276N0() {
        if (this.f7018q == null) {
            this.f7018q = new C3079c();
        }
    }

    /* renamed from: O */
    public final boolean mo11277O() {
        return true;
    }

    /* renamed from: O0 */
    public final int mo11278O0(RecyclerView.C3111u uVar, C3079c cVar, RecyclerView.C3117y yVar, boolean z) {
        int i = cVar.f7039c;
        int i2 = cVar.f7043g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f7043g = i2 + i;
            }
            mo11299g1(uVar, cVar);
        }
        int i3 = cVar.f7039c + cVar.f7044h;
        C3078b bVar = this.f7014B;
        while (true) {
            if (!cVar.f7048l && i3 <= 0) {
                break;
            }
            int i4 = cVar.f7040d;
            if (!(i4 >= 0 && i4 < yVar.mo11715b())) {
                break;
            }
            bVar.f7033a = 0;
            bVar.f7034b = false;
            bVar.f7035c = false;
            bVar.f7036d = false;
            mo11236e1(uVar, yVar, cVar, bVar);
            if (!bVar.f7034b) {
                int i5 = cVar.f7038b;
                int i6 = bVar.f7033a;
                cVar.f7038b = (cVar.f7042f * i6) + i5;
                if (!bVar.f7035c || cVar.f7047k != null || !yVar.f7128g) {
                    cVar.f7039c -= i6;
                    i3 -= i6;
                }
                int i7 = cVar.f7043g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + i6;
                    cVar.f7043g = i8;
                    int i9 = cVar.f7039c;
                    if (i9 < 0) {
                        cVar.f7043g = i8 + i9;
                    }
                    mo11299g1(uVar, cVar);
                }
                if (z && bVar.f7036d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f7039c;
    }

    /* renamed from: P0 */
    public int mo11279P0() {
        View W0 = mo11287W0(0, mo11676y(), true, false);
        if (W0 == null) {
            return -1;
        }
        return RecyclerView.C3100o.m7396I(W0);
    }

    /* renamed from: Q0 */
    public final View mo11280Q0(boolean z) {
        return this.f7022u ? mo11287W0(0, mo11676y(), z, true) : mo11287W0(mo11676y() - 1, -1, z, true);
    }

    /* renamed from: R0 */
    public final View mo11281R0(boolean z) {
        return this.f7022u ? mo11287W0(mo11676y() - 1, -1, z, true) : mo11287W0(0, mo11676y(), z, true);
    }

    /* renamed from: S0 */
    public int mo11282S0() {
        View W0 = mo11287W0(0, mo11676y(), false, true);
        if (W0 == null) {
            return -1;
        }
        return RecyclerView.C3100o.m7396I(W0);
    }

    /* renamed from: T0 */
    public int mo11283T0() {
        View W0 = mo11287W0(mo11676y() - 1, -1, true, false);
        if (W0 == null) {
            return -1;
        }
        return RecyclerView.C3100o.m7396I(W0);
    }

    /* renamed from: U0 */
    public int mo11284U0() {
        View W0 = mo11287W0(mo11676y() - 1, -1, false, true);
        if (W0 == null) {
            return -1;
        }
        return RecyclerView.C3100o.m7396I(W0);
    }

    /* renamed from: V0 */
    public final View mo11285V0(int i, int i2) {
        int i3;
        int i4;
        mo11276N0();
        if ((i2 > i ? 1 : i2 < i ? (char) 65535 : 0) == 0) {
            return mo11674x(i);
        }
        if (this.f7019r.mo11805e(mo11674x(i)) < this.f7019r.mo11811k()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return this.f7017p == 0 ? this.f7073c.mo11878a(i, i2, i4, i3) : this.f7074d.mo11878a(i, i2, i4, i3);
    }

    /* renamed from: W */
    public final void mo11286W(RecyclerView recyclerView) {
    }

    /* renamed from: W0 */
    public final View mo11287W0(int i, int i2, boolean z, boolean z2) {
        mo11276N0();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return this.f7017p == 0 ? this.f7073c.mo11878a(i, i2, i4, i3) : this.f7074d.mo11878a(i, i2, i4, i3);
    }

    /* renamed from: X */
    public View mo11230X(View view, int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        int M0;
        mo11301i1();
        if (mo11676y() == 0 || (M0 = mo11275M0(i)) == Integer.MIN_VALUE) {
            return null;
        }
        mo11276N0();
        mo11310n1(M0, (int) (((float) this.f7019r.mo11812l()) * 0.33333334f), false, yVar);
        C3079c cVar = this.f7018q;
        cVar.f7043g = Integer.MIN_VALUE;
        cVar.f7037a = false;
        mo11278O0(uVar, cVar, yVar, true);
        View V0 = M0 == -1 ? this.f7022u ? mo11285V0(mo11676y() - 1, -1) : mo11285V0(0, mo11676y()) : this.f7022u ? mo11285V0(0, mo11676y()) : mo11285V0(mo11676y() - 1, -1);
        View b1 = M0 == -1 ? mo11293b1() : mo11292a1();
        if (!b1.hasFocusable()) {
            return V0;
        }
        if (V0 == null) {
            return null;
        }
        return b1;
    }

    /* renamed from: X0 */
    public View mo11231X0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, boolean z, boolean z2) {
        int i;
        int i2;
        mo11276N0();
        int y = mo11676y();
        int i3 = -1;
        if (z2) {
            i2 = mo11676y() - 1;
            i = -1;
        } else {
            i3 = y;
            i2 = 0;
            i = 1;
        }
        int b = yVar.mo11715b();
        int k = this.f7019r.mo11811k();
        int g = this.f7019r.mo11807g();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i2 != i3) {
            View x = mo11674x(i2);
            int I = RecyclerView.C3100o.m7396I(x);
            int e = this.f7019r.mo11805e(x);
            int b2 = this.f7019r.mo11802b(x);
            if (I >= 0 && I < b) {
                if (!((RecyclerView.LayoutParams) x.getLayoutParams()).isItemRemoved()) {
                    boolean z3 = b2 <= k && e < k;
                    boolean z4 = e >= g && b2 > g;
                    if (!z3 && !z4) {
                        return x;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = x;
                        }
                    } else if (!z3) {
                        if (view != null) {
                        }
                        view = x;
                    }
                    view2 = x;
                } else if (view3 == null) {
                    view3 = x;
                }
            }
            i2 += i;
        }
        return view != null ? view : view2 != null ? view2 : view3;
    }

    /* renamed from: Y */
    public final void mo11288Y(AccessibilityEvent accessibilityEvent) {
        super.mo11288Y(accessibilityEvent);
        if (mo11676y() > 0) {
            accessibilityEvent.setFromIndex(mo11282S0());
            accessibilityEvent.setToIndex(mo11284U0());
        }
    }

    /* renamed from: Y0 */
    public final int mo11289Y0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, boolean z) {
        int g;
        int g2 = this.f7019r.mo11807g() - i;
        if (g2 <= 0) {
            return 0;
        }
        int i2 = -mo11304j1(-g2, uVar, yVar);
        int i3 = i + i2;
        if (!z || (g = this.f7019r.mo11807g() - i3) <= 0) {
            return i2;
        }
        this.f7019r.mo11815o(g);
        return g + i2;
    }

    /* renamed from: Z0 */
    public final int mo11290Z0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, boolean z) {
        int k;
        int k2 = i - this.f7019r.mo11811k();
        if (k2 <= 0) {
            return 0;
        }
        int i2 = -mo11304j1(k2, uVar, yVar);
        int i3 = i + i2;
        if (!z || (k = i3 - this.f7019r.mo11811k()) <= 0) {
            return i2;
        }
        this.f7019r.mo11815o(-k);
        return i2 - k;
    }

    /* renamed from: a */
    public PointF mo11291a(int i) {
        if (mo11676y() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < RecyclerView.C3100o.m7396I(mo11674x(0))) {
            z = true;
        }
        if (z != this.f7022u) {
            i2 = -1;
        }
        return this.f7017p == 0 ? new PointF((float) i2, 0.0f) : new PointF(0.0f, (float) i2);
    }

    /* renamed from: a1 */
    public final View mo11292a1() {
        return mo11674x(this.f7022u ? 0 : mo11676y() - 1);
    }

    /* renamed from: b1 */
    public final View mo11293b1() {
        return mo11674x(this.f7022u ? mo11676y() - 1 : 0);
    }

    /* renamed from: c */
    public final void mo11294c(String str) {
        if (this.f7027z == null) {
            super.mo11294c(str);
        }
    }

    @Deprecated
    /* renamed from: c1 */
    public int mo11295c1(RecyclerView.C3117y yVar) {
        if (yVar.f7122a != -1) {
            return this.f7019r.mo11812l();
        }
        return 0;
    }

    /* renamed from: d1 */
    public final boolean mo11296d1() {
        return mo11646C() == 1;
    }

    /* renamed from: e1 */
    public void mo11236e1(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, C3079c cVar, C3078b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View b = cVar.mo11328b(uVar);
        if (b == null) {
            bVar.f7034b = true;
            return;
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) b.getLayoutParams();
        if (cVar.f7047k == null) {
            if (this.f7022u == (cVar.f7042f == -1)) {
                mo11661b(b, -1, false);
            } else {
                mo11661b(b, 0, false);
            }
        } else {
            if (this.f7022u == (cVar.f7042f == -1)) {
                mo11661b(b, -1, true);
            } else {
                mo11661b(b, 0, true);
            }
        }
        mo11654R(b);
        bVar.f7033a = this.f7019r.mo11803c(b);
        if (this.f7017p == 1) {
            if (mo11296d1()) {
                i4 = this.f7084n - mo11651G();
                i3 = i4 - this.f7019r.mo11804d(b);
            } else {
                i3 = mo11649F();
                i4 = this.f7019r.mo11804d(b) + i3;
            }
            if (cVar.f7042f == -1) {
                i = cVar.f7038b;
                i2 = i - bVar.f7033a;
            } else {
                i2 = cVar.f7038b;
                i = bVar.f7033a + i2;
            }
        } else {
            int H = mo11652H();
            int d = this.f7019r.mo11804d(b) + H;
            if (cVar.f7042f == -1) {
                int i5 = cVar.f7038b;
                int i6 = i5 - bVar.f7033a;
                int i7 = H;
                i4 = i5;
                i = d;
                i3 = i6;
                i2 = i7;
            } else {
                int i8 = cVar.f7038b;
                int i9 = bVar.f7033a + i8;
                int i10 = d;
                i3 = i8;
                i = i10;
                int i11 = i9;
                i2 = H;
                i4 = i11;
            }
        }
        RecyclerView.C3100o.m7401Q(b, i3, i2, i4, i);
        if (layoutParams.isItemRemoved() || layoutParams.isItemChanged()) {
            bVar.f7035c = true;
        }
        bVar.f7036d = b.hasFocusable();
    }

    /* renamed from: f */
    public final boolean mo11297f() {
        return this.f7017p == 0;
    }

    /* renamed from: f1 */
    public void mo11238f1(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, C3077a aVar, int i) {
    }

    /* renamed from: g */
    public final boolean mo11298g() {
        return this.f7017p == 1;
    }

    /* renamed from: g1 */
    public final void mo11299g1(RecyclerView.C3111u uVar, C3079c cVar) {
        if (cVar.f7037a && !cVar.f7048l) {
            int i = cVar.f7043g;
            int i2 = cVar.f7045i;
            if (cVar.f7042f == -1) {
                int y = mo11676y();
                if (i >= 0) {
                    int f = (this.f7019r.mo11806f() - i) + i2;
                    if (this.f7022u) {
                        for (int i3 = 0; i3 < y; i3++) {
                            View x = mo11674x(i3);
                            if (this.f7019r.mo11805e(x) < f || this.f7019r.mo11814n(x) < f) {
                                mo11300h1(uVar, 0, i3);
                                return;
                            }
                        }
                        return;
                    }
                    int i4 = y - 1;
                    for (int i5 = i4; i5 >= 0; i5--) {
                        View x2 = mo11674x(i5);
                        if (this.f7019r.mo11805e(x2) < f || this.f7019r.mo11814n(x2) < f) {
                            mo11300h1(uVar, i4, i5);
                            return;
                        }
                    }
                }
            } else if (i >= 0) {
                int i6 = i - i2;
                int y2 = mo11676y();
                if (this.f7022u) {
                    int i7 = y2 - 1;
                    for (int i8 = i7; i8 >= 0; i8--) {
                        View x3 = mo11674x(i8);
                        if (this.f7019r.mo11802b(x3) > i6 || this.f7019r.mo11813m(x3) > i6) {
                            mo11300h1(uVar, i7, i8);
                            return;
                        }
                    }
                    return;
                }
                for (int i9 = 0; i9 < y2; i9++) {
                    View x4 = mo11674x(i9);
                    if (this.f7019r.mo11802b(x4) > i6 || this.f7019r.mo11813m(x4) > i6) {
                        mo11300h1(uVar, 0, i9);
                        return;
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x019b  */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo11241h0(androidx.recyclerview.widget.RecyclerView.C3111u r18, androidx.recyclerview.widget.RecyclerView.C3117y r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r3 = r0.f7027z
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.f7025x
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r19.mo11715b()
            if (r3 != 0) goto L_0x0019
            r17.mo11666n0(r18)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r3 = r0.f7027z
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.hasValidAnchor()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r3 = r0.f7027z
            int r3 = r3.mAnchorPosition
            r0.f7025x = r3
        L_0x0029:
            r17.mo11276N0()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r5 = 0
            r3.f7037a = r5
            r17.mo11301i1()
            androidx.recyclerview.widget.RecyclerView r3 = r0.f7072b
            if (r3 != 0) goto L_0x003a
        L_0x0038:
            r3 = 0
            goto L_0x0049
        L_0x003a:
            android.view.View r3 = r3.getFocusedChild()
            if (r3 == 0) goto L_0x0038
            androidx.recyclerview.widget.g r7 = r0.f7071a
            boolean r7 = r7.mo11855k(r3)
            if (r7 == 0) goto L_0x0049
            goto L_0x0038
        L_0x0049:
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.f7013A
            boolean r8 = r7.f7032e
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            r10 = 1
            if (r8 == 0) goto L_0x0084
            int r8 = r0.f7025x
            if (r8 != r4) goto L_0x0084
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r8 = r0.f7027z
            if (r8 == 0) goto L_0x005b
            goto L_0x0084
        L_0x005b:
            if (r3 == 0) goto L_0x024e
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11805e(r3)
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r8 = r8.mo11807g()
            if (r7 >= r8) goto L_0x0079
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11802b(r3)
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r8 = r8.mo11811k()
            if (r7 > r8) goto L_0x024e
        L_0x0079:
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.f7013A
            int r8 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r3)
            r7.mo11324c(r8, r3)
            goto L_0x024e
        L_0x0084:
            r7.mo11325d()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f7013A
            boolean r7 = r0.f7022u
            boolean r8 = r0.f7023v
            r7 = r7 ^ r8
            r3.f7031d = r7
            boolean r7 = r2.f7128g
            if (r7 != 0) goto L_0x0196
            int r7 = r0.f7025x
            if (r7 != r4) goto L_0x009a
            goto L_0x0196
        L_0x009a:
            if (r7 < 0) goto L_0x0192
            int r8 = r19.mo11715b()
            if (r7 < r8) goto L_0x00a4
            goto L_0x0192
        L_0x00a4:
            int r7 = r0.f7025x
            r3.f7029b = r7
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r7 = r0.f7027z
            if (r7 == 0) goto L_0x00d8
            boolean r7 = r7.hasValidAnchor()
            if (r7 == 0) goto L_0x00d8
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r7 = r0.f7027z
            boolean r7 = r7.mAnchorLayoutFromEnd
            r3.f7031d = r7
            if (r7 == 0) goto L_0x00c9
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11807g()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r8 = r0.f7027z
            int r8 = r8.mAnchorOffset
            int r7 = r7 - r8
            r3.f7030c = r7
            goto L_0x0190
        L_0x00c9:
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11811k()
            androidx.recyclerview.widget.LinearLayoutManager$SavedState r8 = r0.f7027z
            int r8 = r8.mAnchorOffset
            int r7 = r7 + r8
            r3.f7030c = r7
            goto L_0x0190
        L_0x00d8:
            int r7 = r0.f7026y
            if (r7 != r9) goto L_0x0173
            int r7 = r0.f7025x
            android.view.View r7 = r0.mo11314s(r7)
            if (r7 == 0) goto L_0x0151
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r8 = r8.mo11803c(r7)
            androidx.recyclerview.widget.b0 r11 = r0.f7019r
            int r11 = r11.mo11812l()
            if (r8 <= r11) goto L_0x00f7
            r3.mo11322a()
            goto L_0x0190
        L_0x00f7:
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r8 = r8.mo11805e(r7)
            androidx.recyclerview.widget.b0 r11 = r0.f7019r
            int r11 = r11.mo11811k()
            int r8 = r8 - r11
            if (r8 >= 0) goto L_0x0112
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11811k()
            r3.f7030c = r7
            r3.f7031d = r5
            goto L_0x0190
        L_0x0112:
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r8 = r8.mo11807g()
            androidx.recyclerview.widget.b0 r11 = r0.f7019r
            int r11 = r11.mo11802b(r7)
            int r8 = r8 - r11
            if (r8 >= 0) goto L_0x012d
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11807g()
            r3.f7030c = r7
            r3.f7031d = r10
            goto L_0x0190
        L_0x012d:
            boolean r8 = r3.f7031d
            if (r8 == 0) goto L_0x0148
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r7 = r8.mo11802b(r7)
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r11 = r8.f7192b
            if (r9 != r11) goto L_0x013f
            r11 = r5
            goto L_0x0146
        L_0x013f:
            int r11 = r8.mo11812l()
            int r8 = r8.f7192b
            int r11 = r11 - r8
        L_0x0146:
            int r11 = r11 + r7
            goto L_0x014e
        L_0x0148:
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r11 = r8.mo11805e(r7)
        L_0x014e:
            r3.f7030c = r11
            goto L_0x0190
        L_0x0151:
            int r7 = r17.mo11676y()
            if (r7 <= 0) goto L_0x016f
            android.view.View r7 = r0.mo11674x(r5)
            int r7 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r7)
            int r8 = r0.f7025x
            if (r8 >= r7) goto L_0x0165
            r7 = r10
            goto L_0x0166
        L_0x0165:
            r7 = r5
        L_0x0166:
            boolean r8 = r0.f7022u
            if (r7 != r8) goto L_0x016c
            r7 = r10
            goto L_0x016d
        L_0x016c:
            r7 = r5
        L_0x016d:
            r3.f7031d = r7
        L_0x016f:
            r3.mo11322a()
            goto L_0x0190
        L_0x0173:
            boolean r7 = r0.f7022u
            r3.f7031d = r7
            if (r7 == 0) goto L_0x0185
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11807g()
            int r8 = r0.f7026y
            int r7 = r7 - r8
            r3.f7030c = r7
            goto L_0x0190
        L_0x0185:
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11811k()
            int r8 = r0.f7026y
            int r7 = r7 + r8
            r3.f7030c = r7
        L_0x0190:
            r7 = r10
            goto L_0x0197
        L_0x0192:
            r0.f7025x = r4
            r0.f7026y = r9
        L_0x0196:
            r7 = r5
        L_0x0197:
            if (r7 == 0) goto L_0x019b
            goto L_0x024a
        L_0x019b:
            int r7 = r17.mo11676y()
            if (r7 != 0) goto L_0x01a3
            goto L_0x0236
        L_0x01a3:
            androidx.recyclerview.widget.RecyclerView r7 = r0.f7072b
            if (r7 != 0) goto L_0x01a9
        L_0x01a7:
            r7 = 0
            goto L_0x01b8
        L_0x01a9:
            android.view.View r7 = r7.getFocusedChild()
            if (r7 == 0) goto L_0x01a7
            androidx.recyclerview.widget.g r8 = r0.f7071a
            boolean r8 = r8.mo11855k(r7)
            if (r8 == 0) goto L_0x01b8
            goto L_0x01a7
        L_0x01b8:
            if (r7 == 0) goto L_0x01e3
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r8 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r8
            boolean r11 = r8.isItemRemoved()
            if (r11 != 0) goto L_0x01d8
            int r11 = r8.getViewLayoutPosition()
            if (r11 < 0) goto L_0x01d8
            int r8 = r8.getViewLayoutPosition()
            int r11 = r19.mo11715b()
            if (r8 >= r11) goto L_0x01d8
            r8 = r10
            goto L_0x01d9
        L_0x01d8:
            r8 = r5
        L_0x01d9:
            if (r8 == 0) goto L_0x01e3
            int r8 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r7)
            r3.mo11324c(r8, r7)
            goto L_0x0234
        L_0x01e3:
            boolean r7 = r0.f7020s
            boolean r8 = r0.f7023v
            if (r7 == r8) goto L_0x01ea
            goto L_0x0236
        L_0x01ea:
            boolean r7 = r3.f7031d
            android.view.View r7 = r0.mo11231X0(r1, r2, r7, r8)
            if (r7 == 0) goto L_0x0236
            int r8 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r7)
            r3.mo11323b(r8, r7)
            boolean r8 = r2.f7128g
            if (r8 != 0) goto L_0x0234
            boolean r8 = r17.mo11227G0()
            if (r8 == 0) goto L_0x0234
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r8 = r8.mo11805e(r7)
            androidx.recyclerview.widget.b0 r11 = r0.f7019r
            int r7 = r11.mo11802b(r7)
            androidx.recyclerview.widget.b0 r11 = r0.f7019r
            int r11 = r11.mo11811k()
            androidx.recyclerview.widget.b0 r12 = r0.f7019r
            int r12 = r12.mo11807g()
            if (r7 > r11) goto L_0x0221
            if (r8 >= r11) goto L_0x0221
            r13 = r10
            goto L_0x0222
        L_0x0221:
            r13 = r5
        L_0x0222:
            if (r8 < r12) goto L_0x0228
            if (r7 <= r12) goto L_0x0228
            r7 = r10
            goto L_0x0229
        L_0x0228:
            r7 = r5
        L_0x0229:
            if (r13 != 0) goto L_0x022d
            if (r7 == 0) goto L_0x0234
        L_0x022d:
            boolean r7 = r3.f7031d
            if (r7 == 0) goto L_0x0232
            r11 = r12
        L_0x0232:
            r3.f7030c = r11
        L_0x0234:
            r7 = r10
            goto L_0x0237
        L_0x0236:
            r7 = r5
        L_0x0237:
            if (r7 == 0) goto L_0x023a
            goto L_0x024a
        L_0x023a:
            r3.mo11322a()
            boolean r7 = r0.f7023v
            if (r7 == 0) goto L_0x0247
            int r7 = r19.mo11715b()
            int r7 = r7 + r4
            goto L_0x0248
        L_0x0247:
            r7 = r5
        L_0x0248:
            r3.f7029b = r7
        L_0x024a:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f7013A
            r3.f7032e = r10
        L_0x024e:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            int r7 = r3.f7046j
            if (r7 < 0) goto L_0x0256
            r7 = r10
            goto L_0x0257
        L_0x0256:
            r7 = r4
        L_0x0257:
            r3.f7042f = r7
            int[] r3 = r0.f7016D
            r3[r5] = r5
            r3[r10] = r5
            r0.mo11271H0(r2, r3)
            int[] r3 = r0.f7016D
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.b0 r7 = r0.f7019r
            int r7 = r7.mo11811k()
            int r7 = r7 + r3
            int[] r3 = r0.f7016D
            r3 = r3[r10]
            int r3 = java.lang.Math.max(r5, r3)
            androidx.recyclerview.widget.b0 r8 = r0.f7019r
            int r8 = r8.mo11808h()
            int r8 = r8 + r3
            boolean r3 = r2.f7128g
            if (r3 == 0) goto L_0x02bb
            int r3 = r0.f7025x
            if (r3 == r4) goto L_0x02bb
            int r11 = r0.f7026y
            if (r11 == r9) goto L_0x02bb
            android.view.View r3 = r0.mo11314s(r3)
            if (r3 == 0) goto L_0x02bb
            boolean r9 = r0.f7022u
            if (r9 == 0) goto L_0x02a6
            androidx.recyclerview.widget.b0 r9 = r0.f7019r
            int r9 = r9.mo11807g()
            androidx.recyclerview.widget.b0 r11 = r0.f7019r
            int r3 = r11.mo11802b(r3)
            int r9 = r9 - r3
            int r3 = r0.f7026y
            goto L_0x02b5
        L_0x02a6:
            androidx.recyclerview.widget.b0 r9 = r0.f7019r
            int r3 = r9.mo11805e(r3)
            androidx.recyclerview.widget.b0 r9 = r0.f7019r
            int r9 = r9.mo11811k()
            int r3 = r3 - r9
            int r9 = r0.f7026y
        L_0x02b5:
            int r9 = r9 - r3
            if (r9 <= 0) goto L_0x02ba
            int r7 = r7 + r9
            goto L_0x02bb
        L_0x02ba:
            int r8 = r8 - r9
        L_0x02bb:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f7013A
            boolean r9 = r3.f7031d
            if (r9 == 0) goto L_0x02c6
            boolean r9 = r0.f7022u
            if (r9 == 0) goto L_0x02ca
            goto L_0x02cc
        L_0x02c6:
            boolean r9 = r0.f7022u
            if (r9 == 0) goto L_0x02cc
        L_0x02ca:
            r9 = r4
            goto L_0x02cd
        L_0x02cc:
            r9 = r10
        L_0x02cd:
            r0.mo11238f1(r1, r2, r3, r9)
            r17.mo11670r(r18)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            androidx.recyclerview.widget.b0 r9 = r0.f7019r
            int r9 = r9.mo11809i()
            if (r9 != 0) goto L_0x02e7
            androidx.recyclerview.widget.b0 r9 = r0.f7019r
            int r9 = r9.mo11806f()
            if (r9 != 0) goto L_0x02e7
            r9 = r10
            goto L_0x02e8
        L_0x02e7:
            r9 = r5
        L_0x02e8:
            r3.f7048l = r9
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r3.getClass()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r3.f7045i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f7013A
            boolean r9 = r3.f7031d
            if (r9 == 0) goto L_0x0340
            int r9 = r3.f7029b
            int r3 = r3.f7030c
            r0.mo11313p1(r9, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r3.f7044h = r7
            r0.mo11278O0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            int r7 = r3.f7038b
            int r9 = r3.f7040d
            int r3 = r3.f7039c
            if (r3 <= 0) goto L_0x0312
            int r8 = r8 + r3
        L_0x0312:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f7013A
            int r11 = r3.f7029b
            int r3 = r3.f7030c
            r0.mo11312o1(r11, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r3.f7044h = r8
            int r8 = r3.f7040d
            int r11 = r3.f7041e
            int r8 = r8 + r11
            r3.f7040d = r8
            r0.mo11278O0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            int r8 = r3.f7038b
            int r3 = r3.f7039c
            if (r3 <= 0) goto L_0x0386
            r0.mo11313p1(r9, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.f7018q
            r7.f7044h = r3
            r0.mo11278O0(r1, r7, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            int r7 = r3.f7038b
            goto L_0x0386
        L_0x0340:
            int r9 = r3.f7029b
            int r3 = r3.f7030c
            r0.mo11312o1(r9, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r3.f7044h = r8
            r0.mo11278O0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            int r8 = r3.f7038b
            int r9 = r3.f7040d
            int r3 = r3.f7039c
            if (r3 <= 0) goto L_0x0359
            int r7 = r7 + r3
        L_0x0359:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.f7013A
            int r11 = r3.f7029b
            int r3 = r3.f7030c
            r0.mo11313p1(r11, r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r3.f7044h = r7
            int r7 = r3.f7040d
            int r11 = r3.f7041e
            int r7 = r7 + r11
            r3.f7040d = r7
            r0.mo11278O0(r1, r3, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            int r7 = r3.f7038b
            int r3 = r3.f7039c
            if (r3 <= 0) goto L_0x0386
            r0.mo11312o1(r9, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r8 = r0.f7018q
            r8.f7044h = r3
            r0.mo11278O0(r1, r8, r2, r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            int r8 = r3.f7038b
        L_0x0386:
            int r3 = r17.mo11676y()
            if (r3 <= 0) goto L_0x03aa
            boolean r3 = r0.f7022u
            boolean r9 = r0.f7023v
            r3 = r3 ^ r9
            if (r3 == 0) goto L_0x039e
            int r3 = r0.mo11289Y0(r8, r1, r2, r10)
            int r7 = r7 + r3
            int r8 = r8 + r3
            int r3 = r0.mo11290Z0(r7, r1, r2, r5)
            goto L_0x03a8
        L_0x039e:
            int r3 = r0.mo11290Z0(r7, r1, r2, r10)
            int r7 = r7 + r3
            int r8 = r8 + r3
            int r3 = r0.mo11289Y0(r8, r1, r2, r5)
        L_0x03a8:
            int r7 = r7 + r3
            int r8 = r8 + r3
        L_0x03aa:
            boolean r3 = r2.f7132k
            if (r3 == 0) goto L_0x044b
            int r3 = r17.mo11676y()
            if (r3 == 0) goto L_0x044b
            boolean r3 = r2.f7128g
            if (r3 != 0) goto L_0x044b
            boolean r3 = r17.mo11227G0()
            if (r3 != 0) goto L_0x03c0
            goto L_0x044b
        L_0x03c0:
            java.util.List<androidx.recyclerview.widget.RecyclerView$b0> r3 = r1.f7101d
            int r9 = r3.size()
            android.view.View r11 = r0.mo11674x(r5)
            int r11 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r11)
            r12 = r5
            r13 = r12
            r14 = r13
        L_0x03d1:
            if (r12 >= r9) goto L_0x0409
            java.lang.Object r15 = r3.get(r12)
            androidx.recyclerview.widget.RecyclerView$b0 r15 = (androidx.recyclerview.widget.RecyclerView.C3084b0) r15
            boolean r16 = r15.isRemoved()
            if (r16 == 0) goto L_0x03e0
            goto L_0x0405
        L_0x03e0:
            int r10 = r15.getLayoutPosition()
            if (r10 >= r11) goto L_0x03e8
            r10 = 1
            goto L_0x03e9
        L_0x03e8:
            r10 = r5
        L_0x03e9:
            boolean r6 = r0.f7022u
            if (r10 == r6) goto L_0x03ef
            r6 = r4
            goto L_0x03f0
        L_0x03ef:
            r6 = 1
        L_0x03f0:
            if (r6 != r4) goto L_0x03fc
            androidx.recyclerview.widget.b0 r6 = r0.f7019r
            android.view.View r10 = r15.itemView
            int r6 = r6.mo11803c(r10)
            int r13 = r13 + r6
            goto L_0x0405
        L_0x03fc:
            androidx.recyclerview.widget.b0 r6 = r0.f7019r
            android.view.View r10 = r15.itemView
            int r6 = r6.mo11803c(r10)
            int r14 = r14 + r6
        L_0x0405:
            int r12 = r12 + 1
            r10 = 1
            goto L_0x03d1
        L_0x0409:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.f7018q
            r4.f7047k = r3
            if (r13 <= 0) goto L_0x0429
            android.view.View r3 = r17.mo11293b1()
            int r3 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r3)
            r0.mo11313p1(r3, r7)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r3.f7044h = r13
            r3.f7039c = r5
            r4 = 0
            r3.mo11327a(r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r0.mo11278O0(r1, r3, r2, r5)
        L_0x0429:
            if (r14 <= 0) goto L_0x0446
            android.view.View r3 = r17.mo11292a1()
            int r3 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r3)
            r0.mo11312o1(r3, r8)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r3.f7044h = r14
            r3.f7039c = r5
            r4 = 0
            r3.mo11327a(r4)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.f7018q
            r0.mo11278O0(r1, r3, r2, r5)
            goto L_0x0447
        L_0x0446:
            r4 = 0
        L_0x0447:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.f7018q
            r1.f7047k = r4
        L_0x044b:
            boolean r1 = r2.f7128g
            if (r1 != 0) goto L_0x0458
            androidx.recyclerview.widget.b0 r1 = r0.f7019r
            int r2 = r1.mo11812l()
            r1.f7192b = r2
            goto L_0x045d
        L_0x0458:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.f7013A
            r1.mo11325d()
        L_0x045d:
            boolean r1 = r0.f7023v
            r0.f7020s = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.mo11241h0(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):void");
    }

    /* renamed from: h1 */
    public final void mo11300h1(RecyclerView.C3111u uVar, int i, int i2) {
        if (i != i2) {
            if (i2 > i) {
                while (true) {
                    i2--;
                    if (i2 >= i) {
                        View x = mo11674x(i2);
                        mo11669q0(i2);
                        uVar.mo11697g(x);
                    } else {
                        return;
                    }
                }
            } else {
                while (i > i2) {
                    View x2 = mo11674x(i);
                    mo11669q0(i);
                    uVar.mo11697g(x2);
                    i--;
                }
            }
        }
    }

    /* renamed from: i0 */
    public void mo11242i0(RecyclerView.C3117y yVar) {
        this.f7027z = null;
        this.f7025x = -1;
        this.f7026y = Integer.MIN_VALUE;
        this.f7013A.mo11325d();
    }

    /* renamed from: i1 */
    public final void mo11301i1() {
        if (this.f7017p == 1 || !mo11296d1()) {
            this.f7022u = this.f7021t;
        } else {
            this.f7022u = !this.f7021t;
        }
    }

    /* renamed from: j */
    public final void mo11302j(int i, int i2, RecyclerView.C3117y yVar, RecyclerView.C3100o.C3103c cVar) {
        if (this.f7017p != 0) {
            i = i2;
        }
        if (mo11676y() != 0 && i != 0) {
            mo11276N0();
            mo11310n1(i > 0 ? 1 : -1, Math.abs(i), true, yVar);
            mo11228I0(yVar, this.f7018q, cVar);
        }
    }

    /* renamed from: j0 */
    public void mo11303j0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f7027z = savedState;
            if (this.f7025x != -1) {
                savedState.invalidateAnchor();
            }
            mo11672s0();
        }
    }

    /* renamed from: j1 */
    public final int mo11304j1(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (mo11676y() == 0 || i == 0) {
            return 0;
        }
        mo11276N0();
        this.f7018q.f7037a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        mo11310n1(i2, abs, true, yVar);
        C3079c cVar = this.f7018q;
        int O0 = mo11278O0(uVar, cVar, yVar, false) + cVar.f7043g;
        if (O0 < 0) {
            return 0;
        }
        if (abs > O0) {
            i = i2 * O0;
        }
        this.f7019r.mo11815o(-i);
        this.f7018q.f7046j = i;
        return i;
    }

    /* renamed from: k */
    public final void mo11305k(int i, RecyclerView.C3100o.C3103c cVar) {
        boolean z;
        int i2;
        SavedState savedState = this.f7027z;
        int i3 = -1;
        if (savedState == null || !savedState.hasValidAnchor()) {
            mo11301i1();
            z = this.f7022u;
            i2 = this.f7025x;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            SavedState savedState2 = this.f7027z;
            z = savedState2.mAnchorLayoutFromEnd;
            i2 = savedState2.mAnchorPosition;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.f7015C && i2 >= 0 && i2 < i; i4++) {
            ((C3181p.C3183b) cVar).mo11915a(i2, 0);
            i2 += i3;
        }
    }

    /* renamed from: k0 */
    public Parcelable mo11306k0() {
        SavedState savedState = this.f7027z;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (mo11676y() > 0) {
            mo11276N0();
            boolean z = this.f7020s ^ this.f7022u;
            savedState2.mAnchorLayoutFromEnd = z;
            if (z) {
                View a1 = mo11292a1();
                savedState2.mAnchorOffset = this.f7019r.mo11807g() - this.f7019r.mo11802b(a1);
                savedState2.mAnchorPosition = RecyclerView.C3100o.m7396I(a1);
            } else {
                View b1 = mo11293b1();
                savedState2.mAnchorPosition = RecyclerView.C3100o.m7396I(b1);
                savedState2.mAnchorOffset = this.f7019r.mo11805e(b1) - this.f7019r.mo11811k();
            }
        } else {
            savedState2.invalidateAnchor();
        }
        return savedState2;
    }

    /* renamed from: k1 */
    public void mo11307k1(int i, int i2) {
        this.f7025x = i;
        this.f7026y = i2;
        SavedState savedState = this.f7027z;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        mo11672s0();
    }

    /* renamed from: l */
    public int mo11308l(RecyclerView.C3117y yVar) {
        return mo11272J0(yVar);
    }

    /* renamed from: l1 */
    public final void mo11309l1(int i) {
        if (i == 0 || i == 1) {
            mo11294c((String) null);
            if (i != this.f7017p || this.f7019r == null) {
                C3129b0 a = C3129b0.m7653a(this, i);
                this.f7019r = a;
                this.f7013A.f7028a = a;
                this.f7017p = i;
                mo11672s0();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(C0015b.m88g("invalid orientation:", i));
    }

    /* renamed from: m */
    public int mo11243m(RecyclerView.C3117y yVar) {
        return mo11273K0(yVar);
    }

    /* renamed from: m1 */
    public void mo11244m1(boolean z) {
        mo11294c((String) null);
        if (this.f7023v != z) {
            this.f7023v = z;
            mo11672s0();
        }
    }

    /* renamed from: n */
    public int mo11245n(RecyclerView.C3117y yVar) {
        return mo11274L0(yVar);
    }

    /* renamed from: n1 */
    public final void mo11310n1(int i, int i2, boolean z, RecyclerView.C3117y yVar) {
        int i3;
        int i4 = 1;
        boolean z2 = false;
        this.f7018q.f7048l = this.f7019r.mo11809i() == 0 && this.f7019r.mo11806f() == 0;
        this.f7018q.f7042f = i;
        int[] iArr = this.f7016D;
        iArr[0] = 0;
        iArr[1] = 0;
        mo11271H0(yVar, iArr);
        int max = Math.max(0, this.f7016D[0]);
        int max2 = Math.max(0, this.f7016D[1]);
        if (i == 1) {
            z2 = true;
        }
        C3079c cVar = this.f7018q;
        int i5 = z2 ? max2 : max;
        cVar.f7044h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.f7045i = max;
        if (z2) {
            cVar.f7044h = this.f7019r.mo11808h() + i5;
            View a1 = mo11292a1();
            C3079c cVar2 = this.f7018q;
            if (this.f7022u) {
                i4 = -1;
            }
            cVar2.f7041e = i4;
            int I = RecyclerView.C3100o.m7396I(a1);
            C3079c cVar3 = this.f7018q;
            cVar2.f7040d = I + cVar3.f7041e;
            cVar3.f7038b = this.f7019r.mo11802b(a1);
            i3 = this.f7019r.mo11802b(a1) - this.f7019r.mo11807g();
        } else {
            View b1 = mo11293b1();
            C3079c cVar4 = this.f7018q;
            cVar4.f7044h = this.f7019r.mo11811k() + cVar4.f7044h;
            C3079c cVar5 = this.f7018q;
            if (!this.f7022u) {
                i4 = -1;
            }
            cVar5.f7041e = i4;
            int I2 = RecyclerView.C3100o.m7396I(b1);
            C3079c cVar6 = this.f7018q;
            cVar5.f7040d = I2 + cVar6.f7041e;
            cVar6.f7038b = this.f7019r.mo11805e(b1);
            i3 = (-this.f7019r.mo11805e(b1)) + this.f7019r.mo11811k();
        }
        C3079c cVar7 = this.f7018q;
        cVar7.f7039c = i2;
        if (z) {
            cVar7.f7039c = i2 - i3;
        }
        cVar7.f7043g = i3;
    }

    /* renamed from: o */
    public int mo11311o(RecyclerView.C3117y yVar) {
        return mo11272J0(yVar);
    }

    /* renamed from: o1 */
    public final void mo11312o1(int i, int i2) {
        this.f7018q.f7039c = this.f7019r.mo11807g() - i2;
        C3079c cVar = this.f7018q;
        cVar.f7041e = this.f7022u ? -1 : 1;
        cVar.f7040d = i;
        cVar.f7042f = 1;
        cVar.f7038b = i2;
        cVar.f7043g = Integer.MIN_VALUE;
    }

    /* renamed from: p */
    public int mo11246p(RecyclerView.C3117y yVar) {
        return mo11273K0(yVar);
    }

    /* renamed from: p1 */
    public final void mo11313p1(int i, int i2) {
        this.f7018q.f7039c = i2 - this.f7019r.mo11811k();
        C3079c cVar = this.f7018q;
        cVar.f7040d = i;
        cVar.f7041e = this.f7022u ? 1 : -1;
        cVar.f7042f = -1;
        cVar.f7038b = i2;
        cVar.f7043g = Integer.MIN_VALUE;
    }

    /* renamed from: q */
    public int mo11247q(RecyclerView.C3117y yVar) {
        return mo11274L0(yVar);
    }

    /* renamed from: s */
    public final View mo11314s(int i) {
        int y = mo11676y();
        if (y == 0) {
            return null;
        }
        int I = i - RecyclerView.C3100o.m7396I(mo11674x(0));
        if (I >= 0 && I < y) {
            View x = mo11674x(I);
            if (RecyclerView.C3100o.m7396I(x) == i) {
                return x;
            }
        }
        return super.mo11314s(i);
    }

    /* renamed from: t */
    public RecyclerView.LayoutParams mo11251t() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    /* renamed from: t0 */
    public int mo11252t0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (this.f7017p == 1) {
            return 0;
        }
        return mo11304j1(i, uVar, yVar);
    }

    /* renamed from: u0 */
    public void mo11315u0(int i) {
        this.f7025x = i;
        this.f7026y = Integer.MIN_VALUE;
        SavedState savedState = this.f7027z;
        if (savedState != null) {
            savedState.invalidateAnchor();
        }
        mo11672s0();
    }

    /* renamed from: v0 */
    public int mo11257v0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (this.f7017p == 0) {
            return 0;
        }
        return mo11304j1(i, uVar, yVar);
    }

    public LinearLayoutManager(int i, boolean z) {
        this.f7017p = 1;
        this.f7021t = false;
        this.f7022u = false;
        this.f7023v = false;
        this.f7024w = true;
        this.f7025x = -1;
        this.f7026y = Integer.MIN_VALUE;
        this.f7027z = null;
        this.f7013A = new C3077a();
        this.f7014B = new C3078b();
        this.f7015C = 2;
        this.f7016D = new int[2];
        mo11309l1(i);
        mo11294c((String) null);
        if (z != this.f7021t) {
            this.f7021t = z;
            mo11672s0();
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f7017p = 1;
        this.f7021t = false;
        this.f7022u = false;
        this.f7023v = false;
        this.f7024w = true;
        this.f7025x = -1;
        this.f7026y = Integer.MIN_VALUE;
        this.f7027z = null;
        this.f7013A = new C3077a();
        this.f7014B = new C3078b();
        this.f7015C = 2;
        this.f7016D = new int[2];
        RecyclerView.C3100o.C3104d J = RecyclerView.C3100o.m7397J(context, attributeSet, i, i2);
        mo11309l1(J.f7088a);
        boolean z = J.f7090c;
        mo11294c((String) null);
        if (z != this.f7021t) {
            this.f7021t = z;
            mo11672s0();
        }
        mo11244m1(J.f7091d);
    }
}
