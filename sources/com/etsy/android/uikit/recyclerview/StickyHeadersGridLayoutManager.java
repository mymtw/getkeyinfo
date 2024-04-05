package com.etsy.android.uikit.recyclerview;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.etsy.android.uikit.recyclerview.C11877a;
import java.util.ArrayList;

public class StickyHeadersGridLayoutManager<T extends RecyclerView.Adapter & C11877a> extends GridLayoutManager {

    /* renamed from: M */
    public T f26413M;

    /* renamed from: N */
    public final ArrayList f26414N = new ArrayList(0);

    /* renamed from: O */
    public final C11876a f26415O = new C11876a();

    /* renamed from: P */
    public View f26416P;

    /* renamed from: Q */
    public int f26417Q = -1;

    /* renamed from: R */
    public int f26418R = -1;

    /* renamed from: S */
    public int f26419S = 0;

    /* renamed from: T */
    public int f26420T = 0;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11875a();
        /* access modifiers changed from: private */
        public int pendingScrollOffset;
        /* access modifiers changed from: private */
        public int pendingScrollPosition;
        /* access modifiers changed from: private */
        public Parcelable superState;

        /* renamed from: com.etsy.android.uikit.recyclerview.StickyHeadersGridLayoutManager$SavedState$a */
        public class C11875a implements Parcelable.Creator<SavedState> {
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

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.superState, i);
            parcel.writeInt(this.pendingScrollPosition);
            parcel.writeInt(this.pendingScrollOffset);
        }

        public SavedState(Parcel parcel) {
            this.superState = parcel.readParcelable(SavedState.class.getClassLoader());
            this.pendingScrollPosition = parcel.readInt();
            this.pendingScrollOffset = parcel.readInt();
        }
    }

    /* renamed from: com.etsy.android.uikit.recyclerview.StickyHeadersGridLayoutManager$a */
    public class C11876a extends RecyclerView.C3091i {
        public C11876a() {
        }

        /* renamed from: a */
        public final void mo11115a() {
            StickyHeadersGridLayoutManager.this.f26414N.clear();
            int itemCount = StickyHeadersGridLayoutManager.this.f26413M.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                if (((C11877a) StickyHeadersGridLayoutManager.this.f26413M).mo36814e(i)) {
                    StickyHeadersGridLayoutManager.this.f26414N.add(Integer.valueOf(i));
                }
            }
            StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager = StickyHeadersGridLayoutManager.this;
            if (stickyHeadersGridLayoutManager.f26416P != null && !stickyHeadersGridLayoutManager.f26414N.contains(Integer.valueOf(stickyHeadersGridLayoutManager.f26417Q))) {
                StickyHeadersGridLayoutManager.this.mo38367E1((RecyclerView.C3111u) null);
            }
        }

        /* renamed from: d */
        public final void mo11118d(int i, int i2) {
            int size = StickyHeadersGridLayoutManager.this.f26414N.size();
            if (size > 0) {
                int y1 = StickyHeadersGridLayoutManager.m19560y1(StickyHeadersGridLayoutManager.this, i);
                while (y1 != -1 && y1 < size) {
                    ArrayList arrayList = StickyHeadersGridLayoutManager.this.f26414N;
                    arrayList.set(y1, Integer.valueOf(((Integer) arrayList.get(y1)).intValue() + i2));
                    y1++;
                }
            }
            for (int i3 = i; i3 < i + i2; i3++) {
                if (((C11877a) StickyHeadersGridLayoutManager.this.f26413M).mo36814e(i3)) {
                    int y12 = StickyHeadersGridLayoutManager.m19560y1(StickyHeadersGridLayoutManager.this, i3);
                    if (y12 != -1) {
                        StickyHeadersGridLayoutManager.this.f26414N.add(y12, Integer.valueOf(i3));
                    } else {
                        StickyHeadersGridLayoutManager.this.f26414N.add(Integer.valueOf(i3));
                    }
                }
            }
        }

        /* renamed from: e */
        public final void mo11119e(int i, int i2) {
            int i3;
            int size = StickyHeadersGridLayoutManager.this.f26414N.size();
            if (size > 0) {
                int y1 = StickyHeadersGridLayoutManager.m19560y1(StickyHeadersGridLayoutManager.this, Math.min(i, i2));
                while (y1 != -1 && y1 < size) {
                    int intValue = ((Integer) StickyHeadersGridLayoutManager.this.f26414N.get(y1)).intValue();
                    if (intValue >= i && intValue < i + 1) {
                        i3 = (i2 - i) + intValue;
                    } else if (i < i2 && intValue >= i + 1 && intValue <= i2) {
                        i3 = intValue - 1;
                    } else if (i > i2 && intValue >= i2 && intValue <= i) {
                        i3 = intValue + 1;
                    } else {
                        return;
                    }
                    if (i3 != intValue) {
                        StickyHeadersGridLayoutManager.this.f26414N.set(y1, Integer.valueOf(i3));
                        int intValue2 = ((Integer) StickyHeadersGridLayoutManager.this.f26414N.remove(y1)).intValue();
                        int y12 = StickyHeadersGridLayoutManager.m19560y1(StickyHeadersGridLayoutManager.this, intValue2);
                        if (y12 != -1) {
                            StickyHeadersGridLayoutManager.this.f26414N.add(y12, Integer.valueOf(intValue2));
                        } else {
                            StickyHeadersGridLayoutManager.this.f26414N.add(Integer.valueOf(intValue2));
                        }
                        y1++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* renamed from: f */
        public final void mo11120f(int i, int i2) {
            int size = StickyHeadersGridLayoutManager.this.f26414N.size();
            if (size > 0) {
                int i3 = i + i2;
                for (int i4 = i3 - 1; i4 >= i; i4--) {
                    int B1 = StickyHeadersGridLayoutManager.this.mo38364B1(i4);
                    if (B1 != -1) {
                        StickyHeadersGridLayoutManager.this.f26414N.remove(B1);
                        size--;
                    }
                }
                StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager = StickyHeadersGridLayoutManager.this;
                if (stickyHeadersGridLayoutManager.f26416P != null && !stickyHeadersGridLayoutManager.f26414N.contains(Integer.valueOf(stickyHeadersGridLayoutManager.f26417Q))) {
                    StickyHeadersGridLayoutManager.this.mo38367E1((RecyclerView.C3111u) null);
                }
                int y1 = StickyHeadersGridLayoutManager.m19560y1(StickyHeadersGridLayoutManager.this, i3);
                while (y1 != -1 && y1 < size) {
                    ArrayList arrayList = StickyHeadersGridLayoutManager.this.f26414N;
                    arrayList.set(y1, Integer.valueOf(((Integer) arrayList.get(y1)).intValue() - i2));
                    y1++;
                }
            }
        }
    }

    public StickyHeadersGridLayoutManager(int i) {
        super(i);
    }

    /* renamed from: y1 */
    public static int m19560y1(StickyHeadersGridLayoutManager stickyHeadersGridLayoutManager, int i) {
        int size = stickyHeadersGridLayoutManager.f26414N.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (((Integer) stickyHeadersGridLayoutManager.f26414N.get(i4)).intValue() >= i) {
                    size = i4;
                }
            }
            if (((Integer) stickyHeadersGridLayoutManager.f26414N.get(i3)).intValue() >= i) {
                return i3;
            }
            i2 = i3 + 1;
        }
        return -1;
    }

    /* renamed from: A1 */
    public final void mo38363A1() {
        View view;
        int j;
        int i = this.f26420T - 1;
        this.f26420T = i;
        if (i == 0 && (view = this.f26416P) != null && (j = this.f7071a.mo11854j(view)) >= 0) {
            this.f7071a.mo11847c(j);
        }
    }

    /* renamed from: B1 */
    public final int mo38364B1(int i) {
        int size = this.f26414N.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Integer) this.f26414N.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else if (((Integer) this.f26414N.get(i3)).intValue() >= i) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: C1 */
    public final int mo38365C1(int i) {
        int size = this.f26414N.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            if (((Integer) this.f26414N.get(i3)).intValue() > i) {
                size = i3 - 1;
            } else {
                if (i3 < this.f26414N.size() - 1) {
                    int i4 = i3 + 1;
                    if (((Integer) this.f26414N.get(i4)).intValue() <= i) {
                        i2 = i4;
                    }
                }
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: D1 */
    public final void mo38366D1(View view) {
        mo11654R(view);
        if (this.f7017p == 1) {
            int F = mo11649F();
            int G = this.f7084n - mo11651G();
            if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                F += marginLayoutParams.leftMargin;
                G -= marginLayoutParams.rightMargin;
            }
            view.layout(F, 0, G, view.getMeasuredHeight());
            return;
        }
        int H = mo11652H();
        int E = this.f7085o - mo11648E();
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            H += marginLayoutParams2.topMargin;
            E -= marginLayoutParams2.bottomMargin;
        }
        view.layout(0, H, view.getMeasuredWidth(), E);
    }

    /* renamed from: E1 */
    public final void mo38367E1(RecyclerView.C3111u uVar) {
        View view = this.f26416P;
        this.f26416P = null;
        this.f26417Q = -1;
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        T t = this.f26413M;
        if (t instanceof C11877a.C11878a) {
            ((C11877a.C11878a) t).mo36816h(view);
        }
        RecyclerView.C3084b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        childViewHolderInt.stopIgnoring();
        childViewHolderInt.resetInternal();
        childViewHolderInt.addFlags(4);
        mo11668p0(view);
        if (uVar != null) {
            uVar.mo11697g(view);
        }
    }

    /* renamed from: F1 */
    public final void mo38368F1(RecyclerView.Adapter adapter) {
        T t = this.f26413M;
        if (t != null) {
            t.unregisterAdapterDataObserver(this.f26415O);
        }
        if (adapter instanceof C11877a) {
            this.f26413M = adapter;
            adapter.registerAdapterDataObserver(this.f26415O);
            this.f26415O.mo11115a();
            return;
        }
        this.f26413M = null;
        this.f26414N.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if ((r5.getTranslationY() + ((float) r5.getTop())) <= (((float) r0.f7085o) + 0.0f)) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0056, code lost:
        if ((((float) r5.getBottom()) - r5.getTranslationY()) >= 0.0f) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        if ((r5.getTranslationX() + ((float) r5.getLeft())) <= (((float) r0.f7084n) + 0.0f)) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if ((((float) r5.getRight()) - r5.getTranslationX()) >= 0.0f) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00d7, code lost:
        if ((((float) r5.getBottom()) - r5.getTranslationY()) > (((float) r0.f7085o) + 0.0f)) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        if ((r5.getTranslationY() + ((float) r5.getTop())) < 0.0f) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00fd, code lost:
        if ((((float) r5.getRight()) - r5.getTranslationX()) > (((float) r0.f7084n) + 0.0f)) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x010c, code lost:
        if ((r5.getTranslationX() + ((float) r5.getLeft())) < 0.0f) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0110, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0111, code lost:
        if (r1 != false) goto L_0x0113;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0083 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x008a A[LOOP:0: B:4:0x0014->B:28:0x008a, LOOP_END] */
    /* renamed from: G1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo38369G1(androidx.recyclerview.widget.RecyclerView.C3111u r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r7 = r17
            java.util.ArrayList r1 = r0.f26414N
            int r1 = r1.size()
            int r2 = r16.mo11676y()
            if (r1 <= 0) goto L_0x030b
            if (r2 <= 0) goto L_0x030b
            r3 = 0
            r4 = r3
        L_0x0014:
            r8 = 0
            r9 = -1
            r10 = 1
            if (r4 >= r2) goto L_0x008d
            android.view.View r5 = r0.mo11674x(r4)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r6 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r6
            boolean r11 = r6.isItemRemoved()
            if (r11 != 0) goto L_0x0080
            boolean r11 = r6.isViewInvalid()
            if (r11 != 0) goto L_0x0080
            int r11 = r0.f7017p
            if (r11 != r10) goto L_0x0059
            boolean r11 = r0.f7021t
            if (r11 == 0) goto L_0x004a
            int r11 = r5.getTop()
            float r11 = (float) r11
            float r12 = r5.getTranslationY()
            float r12 = r12 + r11
            int r11 = r0.f7085o
            float r11 = (float) r11
            float r11 = r11 + r8
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0080
            goto L_0x007e
        L_0x004a:
            int r11 = r5.getBottom()
            float r11 = (float) r11
            float r12 = r5.getTranslationY()
            float r11 = r11 - r12
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x0080
            goto L_0x007e
        L_0x0059:
            boolean r11 = r0.f7021t
            if (r11 == 0) goto L_0x0070
            int r11 = r5.getLeft()
            float r11 = (float) r11
            float r12 = r5.getTranslationX()
            float r12 = r12 + r11
            int r11 = r0.f7084n
            float r11 = (float) r11
            float r11 = r11 + r8
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 > 0) goto L_0x0080
            goto L_0x007e
        L_0x0070:
            int r11 = r5.getRight()
            float r11 = (float) r11
            float r12 = r5.getTranslationX()
            float r11 = r11 - r12
            int r11 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r11 < 0) goto L_0x0080
        L_0x007e:
            r11 = r10
            goto L_0x0081
        L_0x0080:
            r11 = r3
        L_0x0081:
            if (r11 == 0) goto L_0x008a
            int r2 = r6.getViewAdapterPosition()
            r11 = r2
            r12 = r4
            goto L_0x0090
        L_0x008a:
            int r4 = r4 + 1
            goto L_0x0014
        L_0x008d:
            r5 = 0
            r11 = r9
            r12 = r11
        L_0x0090:
            if (r5 == 0) goto L_0x030b
            if (r11 == r9) goto L_0x030b
            int r2 = r0.mo38365C1(r11)
            if (r2 == r9) goto L_0x00a8
            java.util.ArrayList r4 = r0.f26414N
            java.lang.Object r4 = r4.get(r2)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r13 = r4
            goto L_0x00a9
        L_0x00a8:
            r13 = r9
        L_0x00a9:
            int r2 = r2 + r10
            if (r1 <= r2) goto L_0x00ba
            java.util.ArrayList r1 = r0.f26414N
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r14 = r1
            goto L_0x00bb
        L_0x00ba:
            r14 = r9
        L_0x00bb:
            if (r13 == r9) goto L_0x030b
            if (r13 != r11) goto L_0x0113
            int r1 = r0.f7017p
            if (r1 != r10) goto L_0x00e9
            boolean r1 = r0.f7021t
            if (r1 == 0) goto L_0x00da
            int r1 = r5.getBottom()
            float r1 = (float) r1
            float r2 = r5.getTranslationY()
            float r1 = r1 - r2
            int r2 = r0.f7085o
            float r2 = (float) r2
            float r2 = r2 + r8
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0110
            goto L_0x010e
        L_0x00da:
            int r1 = r5.getTop()
            float r1 = (float) r1
            float r2 = r5.getTranslationY()
            float r2 = r2 + r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0110
            goto L_0x010e
        L_0x00e9:
            boolean r1 = r0.f7021t
            if (r1 == 0) goto L_0x0100
            int r1 = r5.getRight()
            float r1 = (float) r1
            float r2 = r5.getTranslationX()
            float r1 = r1 - r2
            int r2 = r0.f7084n
            float r2 = (float) r2
            float r2 = r2 + r8
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0110
            goto L_0x010e
        L_0x0100:
            int r1 = r5.getLeft()
            float r1 = (float) r1
            float r2 = r5.getTranslationX()
            float r2 = r2 + r1
            int r1 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r1 >= 0) goto L_0x0110
        L_0x010e:
            r1 = r10
            goto L_0x0111
        L_0x0110:
            r1 = r3
        L_0x0111:
            if (r1 == 0) goto L_0x030b
        L_0x0113:
            int r1 = r13 + 1
            if (r14 == r1) goto L_0x030b
            android.view.View r1 = r0.f26416P
            if (r1 == 0) goto L_0x012e
            androidx.recyclerview.widget.RecyclerView$b0 r1 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
            int r1 = r1.getItemViewType()
            T r2 = r0.f26413M
            int r2 = r2.getItemViewType(r13)
            if (r1 == r2) goto L_0x012e
            r16.mo38367E1(r17)
        L_0x012e:
            android.view.View r1 = r0.f26416P
            if (r1 != 0) goto L_0x0185
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r7.mo11701k(r13, r1)
            android.view.View r1 = r1.itemView
            T r2 = r0.f26413M
            boolean r4 = r2 instanceof com.etsy.android.uikit.recyclerview.C11877a.C11878a
            if (r4 == 0) goto L_0x0148
            com.etsy.android.uikit.recyclerview.a$a r2 = (com.etsy.android.uikit.recyclerview.C11877a.C11878a) r2
            r2.mo36815f(r1)
        L_0x0148:
            r0.mo11661b(r1, r9, r3)
            r0.mo38366D1(r1)
            android.view.ViewParent r2 = r1.getParent()
            androidx.recyclerview.widget.RecyclerView r4 = r0.f7072b
            if (r2 != r4) goto L_0x0173
            int r2 = r4.indexOfChild(r1)
            if (r2 == r9) goto L_0x0173
            androidx.recyclerview.widget.RecyclerView$b0 r2 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
            r4 = 128(0x80, float:1.794E-43)
            r2.addFlags(r4)
            androidx.recyclerview.widget.RecyclerView r4 = r0.f7072b
            androidx.recyclerview.widget.i0 r4 = r4.mViewInfoStore
            r4.mo11887e(r2)
            r0.f26416P = r1
            r0.f26417Q = r13
            r0.f26420T = r10
            goto L_0x0185
        L_0x0173:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "View should be fully attached to be ignored"
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r0.f7072b
            java.lang.String r2 = android.support.p013v4.media.C0069a.m173d(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x0185:
            if (r18 != 0) goto L_0x018f
            android.view.View r1 = r0.f26416P
            int r1 = androidx.recyclerview.widget.RecyclerView.C3100o.m7396I(r1)
            if (r1 != r13) goto L_0x0212
        L_0x018f:
            android.view.View r1 = r0.f26416P
            r17.getClass()
            androidx.recyclerview.widget.RecyclerView$b0 r15 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r1)
            if (r15 == 0) goto L_0x02f9
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.a r1 = r1.mAdapterHelper
            int r3 = r1.mo11791f(r13, r3)
            if (r3 < 0) goto L_0x02d8
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.mAdapter
            int r1 = r1.getItemCount()
            if (r3 >= r1) goto L_0x02d8
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r1 = r17
            r2 = r15
            r4 = r13
            r1.mo11700j(r2, r3, r4, r5)
            android.view.View r1 = r15.itemView
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 != 0) goto L_0x01d0
            androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
            android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            android.view.View r2 = r15.itemView
            r2.setLayoutParams(r1)
            goto L_0x01e8
        L_0x01d0:
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            boolean r2 = r2.checkLayoutParams(r1)
            if (r2 != 0) goto L_0x01e6
            androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
            android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            android.view.View r2 = r15.itemView
            r2.setLayoutParams(r1)
            goto L_0x01e8
        L_0x01e6:
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
        L_0x01e8:
            r1.mInsetsDirty = r10
            r1.mViewHolder = r15
            android.view.View r2 = r15.itemView
            android.view.ViewParent r2 = r2.getParent()
            if (r2 != 0) goto L_0x01f6
            r2 = r10
            goto L_0x01f7
        L_0x01f6:
            r2 = 0
        L_0x01f7:
            r1.mPendingInvalidate = r2
            r0.f26417Q = r13
            android.view.View r1 = r0.f26416P
            r0.mo38366D1(r1)
            int r1 = r0.f26418R
            if (r1 == r9) goto L_0x0212
            android.view.View r1 = r0.f26416P
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            if.b r2 = new if.b
            r2.<init>(r0, r1)
            r1.addOnGlobalLayoutListener(r2)
        L_0x0212:
            if (r14 == r9) goto L_0x021e
            int r14 = r14 - r11
            int r14 = r14 + r12
            android.view.View r1 = r0.mo11674x(r14)
            android.view.View r2 = r0.f26416P
            if (r1 != r2) goto L_0x021f
        L_0x021e:
            r1 = 0
        L_0x021f:
            android.view.View r2 = r0.f26416P
            int r3 = r0.f7017p
            if (r3 == r10) goto L_0x0279
            boolean r3 = r0.f7021t
            if (r3 == 0) goto L_0x0233
            int r3 = r0.f7084n
            int r4 = r2.getWidth()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 + r8
            goto L_0x0234
        L_0x0233:
            r3 = r8
        L_0x0234:
            if (r1 == 0) goto L_0x027a
            boolean r4 = r0.f7021t
            if (r4 == 0) goto L_0x0257
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            boolean r4 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x024b
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r4 = r4.rightMargin
            goto L_0x024c
        L_0x024b:
            r4 = 0
        L_0x024c:
            int r5 = r1.getRight()
            int r5 = r5 + r4
            float r4 = (float) r5
            float r3 = java.lang.Math.max(r4, r3)
            goto L_0x027a
        L_0x0257:
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            boolean r4 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x0268
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            int r4 = r4.leftMargin
            goto L_0x0269
        L_0x0268:
            r4 = 0
        L_0x0269:
            int r5 = r1.getLeft()
            int r5 = r5 - r4
            int r4 = r2.getWidth()
            int r5 = r5 - r4
            float r4 = (float) r5
            float r3 = java.lang.Math.min(r4, r3)
            goto L_0x027a
        L_0x0279:
            r3 = r8
        L_0x027a:
            r2.setTranslationX(r3)
            android.view.View r2 = r0.f26416P
            int r3 = r0.f7017p
            if (r3 != r10) goto L_0x02d4
            boolean r3 = r0.f7021t
            if (r3 == 0) goto L_0x0290
            int r3 = r0.f7085o
            int r4 = r2.getHeight()
            int r3 = r3 - r4
            float r3 = (float) r3
            float r8 = r8 + r3
        L_0x0290:
            if (r1 == 0) goto L_0x02d4
            boolean r3 = r0.f7021t
            if (r3 == 0) goto L_0x02b3
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x02a7
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = r3.bottomMargin
            goto L_0x02a8
        L_0x02a7:
            r3 = 0
        L_0x02a8:
            int r1 = r1.getBottom()
            int r1 = r1 + r3
            float r1 = (float) r1
            float r8 = java.lang.Math.max(r1, r8)
            goto L_0x02d4
        L_0x02b3:
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            boolean r3 = r3 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L_0x02c4
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = r3.topMargin
            goto L_0x02c5
        L_0x02c4:
            r3 = 0
        L_0x02c5:
            int r1 = r1.getTop()
            int r1 = r1 - r3
            int r3 = r2.getHeight()
            int r1 = r1 - r3
            float r1 = (float) r1
            float r8 = java.lang.Math.min(r1, r8)
        L_0x02d4:
            r2.setTranslationY(r8)
            return
        L_0x02d8:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.String r2 = "Inconsistency detected. Invalid item position "
            java.lang.String r4 = "(offset:"
            java.lang.String r5 = ").state:"
            java.lang.StringBuilder r2 = androidx.compose.animation.C0472h.m1244g(r2, r13, r4, r3, r5)
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            androidx.recyclerview.widget.RecyclerView$y r3 = r3.mState
            int r3 = r3.mo11715b()
            r2.append(r3)
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            java.lang.String r2 = android.support.p013v4.media.C0069a.m173d(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x02f9:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "The view does not have a ViewHolder. You cannot pass arbitrary views to this method, they should be created by the Adapter"
            java.lang.StringBuilder r2 = android.support.p013v4.media.C0072d.m201h(r2)
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            java.lang.String r2 = android.support.p013v4.media.C0069a.m173d(r3, r2)
            r1.<init>(r2)
            throw r1
        L_0x030b:
            android.view.View r1 = r0.f26416P
            if (r1 == 0) goto L_0x0312
            r16.mo38367E1(r17)
        L_0x0312:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.recyclerview.StickyHeadersGridLayoutManager.mo38369G1(androidx.recyclerview.widget.RecyclerView$u, boolean):void");
    }

    /* renamed from: P0 */
    public final int mo11279P0() {
        mo38363A1();
        int P0 = super.mo11279P0();
        mo38370z1();
        return P0;
    }

    /* renamed from: S0 */
    public final int mo11282S0() {
        mo38363A1();
        int S0 = super.mo11282S0();
        mo38370z1();
        return S0;
    }

    /* renamed from: T0 */
    public final int mo11283T0() {
        mo38363A1();
        int T0 = super.mo11283T0();
        mo38370z1();
        return T0;
    }

    /* renamed from: U */
    public final void mo11657U(RecyclerView.Adapter adapter) {
        mo38368F1(adapter);
    }

    /* renamed from: U0 */
    public final int mo11284U0() {
        mo38363A1();
        int U0 = super.mo11284U0();
        mo38370z1();
        return U0;
    }

    /* renamed from: V */
    public final void mo11658V(RecyclerView recyclerView) {
        mo38368F1(recyclerView.getAdapter());
    }

    /* renamed from: X */
    public final View mo11230X(View view, int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        mo38363A1();
        View X = super.mo11230X(view, i, uVar, yVar);
        mo38370z1();
        return X;
    }

    /* renamed from: a */
    public final PointF mo11291a(int i) {
        mo38363A1();
        PointF a = super.mo11291a(i);
        mo38370z1();
        return a;
    }

    /* renamed from: h0 */
    public final void mo11241h0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        mo38363A1();
        super.mo11241h0(uVar, yVar);
        mo38370z1();
        if (!yVar.f7128g) {
            mo38369G1(uVar, true);
        }
    }

    /* renamed from: j0 */
    public final void mo11303j0(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f26418R = savedState.pendingScrollPosition;
            this.f26419S = savedState.pendingScrollOffset;
            parcelable = savedState.superState;
        }
        super.mo11303j0(parcelable);
    }

    /* renamed from: k0 */
    public final Parcelable mo11306k0() {
        SavedState savedState = new SavedState();
        Parcelable unused = savedState.superState = super.mo11306k0();
        int unused2 = savedState.pendingScrollPosition = this.f26418R;
        int unused3 = savedState.pendingScrollOffset = this.f26419S;
        return savedState;
    }

    /* renamed from: k1 */
    public final void mo11307k1(int i, int i2) {
        this.f26418R = -1;
        this.f26419S = Integer.MIN_VALUE;
        int C1 = mo38365C1(i);
        if (C1 == -1 || mo38364B1(i) != -1) {
            super.mo11307k1(i, i2);
            return;
        }
        int i3 = i - 1;
        if (mo38364B1(i3) != -1) {
            super.mo11307k1(i3, i2);
        } else if (this.f26416P == null || C1 != mo38364B1(this.f26417Q)) {
            this.f26418R = i;
            this.f26419S = i2;
            super.mo11307k1(i, i2);
        } else {
            if (i2 == Integer.MIN_VALUE) {
                i2 = 0;
            }
            super.mo11307k1(i, this.f26416P.getHeight() + i2);
        }
    }

    /* renamed from: l */
    public final int mo11308l(RecyclerView.C3117y yVar) {
        mo38363A1();
        int J0 = mo11272J0(yVar);
        mo38370z1();
        return J0;
    }

    /* renamed from: m */
    public final int mo11243m(RecyclerView.C3117y yVar) {
        mo38363A1();
        int K0 = mo11273K0(yVar);
        mo38370z1();
        return K0;
    }

    /* renamed from: n */
    public final int mo11245n(RecyclerView.C3117y yVar) {
        mo38363A1();
        int L0 = mo11274L0(yVar);
        mo38370z1();
        return L0;
    }

    /* renamed from: o */
    public final int mo11311o(RecyclerView.C3117y yVar) {
        mo38363A1();
        int J0 = mo11272J0(yVar);
        mo38370z1();
        return J0;
    }

    /* renamed from: p */
    public final int mo11246p(RecyclerView.C3117y yVar) {
        mo38363A1();
        int K0 = mo11273K0(yVar);
        mo38370z1();
        return K0;
    }

    /* renamed from: q */
    public final int mo11247q(RecyclerView.C3117y yVar) {
        mo38363A1();
        int L0 = mo11274L0(yVar);
        mo38370z1();
        return L0;
    }

    /* renamed from: t0 */
    public final int mo11252t0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        mo38363A1();
        int t0 = super.mo11252t0(i, uVar, yVar);
        mo38370z1();
        if (t0 != 0) {
            mo38369G1(uVar, false);
        }
        return t0;
    }

    /* renamed from: u0 */
    public final void mo11315u0(int i) {
        mo11307k1(i, Integer.MIN_VALUE);
    }

    /* renamed from: v0 */
    public final int mo11257v0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        mo38363A1();
        int v0 = super.mo11257v0(i, uVar, yVar);
        mo38370z1();
        if (v0 != 0) {
            mo38369G1(uVar, false);
        }
        return v0;
    }

    /* renamed from: z1 */
    public final void mo38370z1() {
        View view;
        int i = this.f26420T + 1;
        this.f26420T = i;
        if (i == 1 && (view = this.f26416P) != null) {
            mo11662d(-1, view);
        }
    }

    public StickyHeadersGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
