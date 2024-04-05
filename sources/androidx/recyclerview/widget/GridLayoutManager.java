package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p013v4.media.C0071c;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.animation.C0472h;
import androidx.core.view.C2330s0;
import androidx.core.view.C2364y;
import androidx.recyclerview.widget.C3181p;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p003a2.C0015b;
import p088e1.C6689b;

public class GridLayoutManager extends LinearLayoutManager {

    /* renamed from: E */
    public boolean f7002E = false;

    /* renamed from: F */
    public int f7003F = -1;

    /* renamed from: G */
    public int[] f7004G;

    /* renamed from: H */
    public View[] f7005H;

    /* renamed from: I */
    public final SparseIntArray f7006I = new SparseIntArray();

    /* renamed from: J */
    public final SparseIntArray f7007J = new SparseIntArray();

    /* renamed from: K */
    public C3075b f7008K = new C3074a();

    /* renamed from: L */
    public final Rect f7009L = new Rect();

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$a */
    public static final class C3074a extends C3075b {
        /* renamed from: c */
        public final int mo11264c(int i, int i2) {
            return i % i2;
        }

        /* renamed from: d */
        public final int mo11265d(int i) {
            return 1;
        }
    }

    /* renamed from: androidx.recyclerview.widget.GridLayoutManager$b */
    public static abstract class C3075b {

        /* renamed from: a */
        public final SparseIntArray f7010a = new SparseIntArray();

        /* renamed from: b */
        public final SparseIntArray f7011b = new SparseIntArray();

        /* renamed from: c */
        public boolean f7012c = false;

        /* renamed from: a */
        public final int mo11266a(int i, int i2) {
            if (!this.f7012c) {
                return mo11264c(i, i2);
            }
            int i3 = this.f7010a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int c = mo11264c(i, i2);
            this.f7010a.put(i, c);
            return c;
        }

        /* renamed from: b */
        public final int mo11267b(int i, int i2) {
            int d = mo11265d(i);
            int i3 = 0;
            int i4 = 0;
            for (int i5 = 0; i5 < i; i5++) {
                int d2 = mo11265d(i5);
                i3 += d2;
                if (i3 == i2) {
                    i4++;
                    i3 = 0;
                } else if (i3 > i2) {
                    i4++;
                    i3 = d2;
                }
            }
            return i3 + d > i2 ? i4 + 1 : i4;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005b A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x005c A[RETURN] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo11264c(int r9, int r10) {
            /*
                r8 = this;
                int r0 = r8.mo11265d(r9)
                r1 = 0
                if (r0 != r10) goto L_0x0008
                return r1
            L_0x0008:
                boolean r2 = r8.f7012c
                if (r2 == 0) goto L_0x0044
                android.util.SparseIntArray r2 = r8.f7010a
                int r3 = r2.size()
                r4 = -1
                int r3 = r3 + r4
                r5 = r1
            L_0x0015:
                if (r5 > r3) goto L_0x0027
                int r6 = r5 + r3
                int r6 = r6 >>> 1
                int r7 = r2.keyAt(r6)
                if (r7 >= r9) goto L_0x0024
                int r5 = r6 + 1
                goto L_0x0015
            L_0x0024:
                int r3 = r6 + -1
                goto L_0x0015
            L_0x0027:
                int r5 = r5 + r4
                if (r5 < 0) goto L_0x0034
                int r3 = r2.size()
                if (r5 >= r3) goto L_0x0034
                int r4 = r2.keyAt(r5)
            L_0x0034:
                if (r4 < 0) goto L_0x0044
                android.util.SparseIntArray r2 = r8.f7010a
                int r2 = r2.get(r4)
                int r3 = r8.mo11265d(r4)
                int r3 = r3 + r2
                r2 = r3
                r3 = r8
                goto L_0x0055
            L_0x0044:
                r3 = r8
                r2 = r1
                r4 = r2
            L_0x0047:
                if (r4 >= r9) goto L_0x0058
                int r5 = r3.mo11265d(r4)
                int r2 = r2 + r5
                if (r2 != r10) goto L_0x0052
                r2 = r1
                goto L_0x0055
            L_0x0052:
                if (r2 <= r10) goto L_0x0055
                r2 = r5
            L_0x0055:
                int r4 = r4 + 1
                goto L_0x0047
            L_0x0058:
                int r0 = r0 + r2
                if (r0 > r10) goto L_0x005c
                return r2
            L_0x005c:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.C3075b.mo11264c(int, int):int");
        }

        /* renamed from: d */
        public abstract int mo11265d(int i);

        /* renamed from: e */
        public final void mo11268e() {
            this.f7010a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo11259w1(RecyclerView.C3100o.m7397J(context, attributeSet, i, i2).f7089b);
    }

    /* renamed from: A */
    public final int mo11226A(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (this.f7017p == 1) {
            return this.f7003F;
        }
        if (yVar.mo11715b() < 1) {
            return 0;
        }
        return mo11250s1(yVar.mo11715b() - 1, uVar, yVar) + 1;
    }

    /* renamed from: G0 */
    public final boolean mo11227G0() {
        return this.f7027z == null && !this.f7002E;
    }

    /* renamed from: I0 */
    public final void mo11228I0(RecyclerView.C3117y yVar, LinearLayoutManager.C3079c cVar, RecyclerView.C3100o.C3103c cVar2) {
        int i = this.f7003F;
        int i2 = 0;
        while (i2 < this.f7003F) {
            int i3 = cVar.f7040d;
            if ((i3 >= 0 && i3 < yVar.mo11715b()) && i > 0) {
                int i4 = cVar.f7040d;
                ((C3181p.C3183b) cVar2).mo11915a(i4, Math.max(0, cVar.f7043g));
                i -= this.f7008K.mo11265d(i4);
                cVar.f7040d += cVar.f7041e;
                i2++;
            } else {
                return;
            }
        }
    }

    /* renamed from: L */
    public final int mo11229L(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (this.f7017p == 0) {
            return this.f7003F;
        }
        if (yVar.mo11715b() < 1) {
            return 0;
        }
        return mo11250s1(yVar.mo11715b() - 1, uVar, yVar) + 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        if (r13 == (r2 > r15)) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0111, code lost:
        if (r13 == (r2 > r9)) goto L_0x0113;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r0.f7071a.mo11855k(r3) != false) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x011d  */
    /* renamed from: X */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo11230X(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.C3111u r25, androidx.recyclerview.widget.RecyclerView.C3117y r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            androidx.recyclerview.widget.RecyclerView r3 = r0.f7072b
            r4 = 0
            if (r3 != 0) goto L_0x000f
            r5 = r23
        L_0x000d:
            r3 = r4
            goto L_0x0021
        L_0x000f:
            r5 = r23
            android.view.View r3 = r3.findContainingItemView(r5)
            if (r3 != 0) goto L_0x0018
        L_0x0017:
            goto L_0x000d
        L_0x0018:
            androidx.recyclerview.widget.g r6 = r0.f7071a
            boolean r6 = r6.mo11855k(r3)
            if (r6 == 0) goto L_0x0021
            goto L_0x0017
        L_0x0021:
            if (r3 != 0) goto L_0x0024
            return r4
        L_0x0024:
            android.view.ViewGroup$LayoutParams r6 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r6 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r6
            int r7 = r6.mSpanIndex
            int r6 = r6.mSpanSize
            int r6 = r6 + r7
            android.view.View r5 = super.mo11230X(r23, r24, r25, r26)
            if (r5 != 0) goto L_0x0036
            return r4
        L_0x0036:
            r5 = r24
            int r5 = r0.mo11275M0(r5)
            r8 = 1
            if (r5 != r8) goto L_0x0041
            r5 = r8
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            boolean r10 = r0.f7022u
            if (r5 == r10) goto L_0x0048
            r5 = r8
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            r10 = -1
            if (r5 == 0) goto L_0x0054
            int r5 = r22.mo11676y()
            int r5 = r5 - r8
            r11 = r10
            r12 = r11
            goto L_0x005b
        L_0x0054:
            int r5 = r22.mo11676y()
            r11 = r5
            r12 = r8
            r5 = 0
        L_0x005b:
            int r13 = r0.f7017p
            if (r13 != r8) goto L_0x0067
            boolean r13 = r22.mo11296d1()
            if (r13 == 0) goto L_0x0067
            r13 = r8
            goto L_0x0068
        L_0x0067:
            r13 = 0
        L_0x0068:
            int r14 = r0.mo11250s1(r5, r1, r2)
            r9 = r10
            r15 = r9
            r16 = r12
            r8 = 0
            r12 = 0
            r10 = r5
            r5 = r4
        L_0x0074:
            if (r10 == r11) goto L_0x0155
            r17 = r11
            int r11 = r0.mo11250s1(r10, r1, r2)
            android.view.View r1 = r0.mo11674x(r10)
            if (r1 != r3) goto L_0x0084
            goto L_0x0155
        L_0x0084:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x009a
            if (r11 == r14) goto L_0x009a
            if (r4 == 0) goto L_0x0090
            goto L_0x0155
        L_0x0090:
            r18 = r3
            r21 = r5
            r19 = r8
            r20 = 1
            goto L_0x0145
        L_0x009a:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$LayoutParams r11 = (androidx.recyclerview.widget.GridLayoutManager.LayoutParams) r11
            int r2 = r11.mSpanIndex
            r18 = r3
            int r3 = r11.mSpanSize
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00b2
            if (r2 != r7) goto L_0x00b2
            if (r3 != r6) goto L_0x00b2
            return r1
        L_0x00b2:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00ba
            if (r4 == 0) goto L_0x00c2
        L_0x00ba:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00c5
            if (r5 != 0) goto L_0x00c5
        L_0x00c2:
            r21 = r5
            goto L_0x00e3
        L_0x00c5:
            int r19 = java.lang.Math.max(r2, r7)
            int r20 = java.lang.Math.min(r3, r6)
            r21 = r5
            int r5 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00e9
            if (r5 <= r8) goto L_0x00da
            goto L_0x00e3
        L_0x00da:
            if (r5 != r8) goto L_0x0116
            if (r2 <= r15) goto L_0x00e0
            r5 = 1
            goto L_0x00e1
        L_0x00e0:
            r5 = 0
        L_0x00e1:
            if (r13 != r5) goto L_0x0116
        L_0x00e3:
            r19 = r8
            r5 = 1
            r20 = 1
            goto L_0x011b
        L_0x00e9:
            if (r4 != 0) goto L_0x0116
            r19 = r8
            androidx.recyclerview.widget.h0 r8 = r0.f7073c
            boolean r8 = r8.mo11879b(r1)
            if (r8 == 0) goto L_0x00ff
            androidx.recyclerview.widget.h0 r8 = r0.f7074d
            boolean r8 = r8.mo11879b(r1)
            if (r8 == 0) goto L_0x00ff
            r8 = 1
            goto L_0x0100
        L_0x00ff:
            r8 = 0
        L_0x0100:
            r20 = 1
            r8 = r8 ^ 1
            if (r8 == 0) goto L_0x011a
            if (r5 <= r12) goto L_0x0109
            goto L_0x0113
        L_0x0109:
            if (r5 != r12) goto L_0x011a
            if (r2 <= r9) goto L_0x0110
            r5 = r20
            goto L_0x0111
        L_0x0110:
            r5 = 0
        L_0x0111:
            if (r13 != r5) goto L_0x011a
        L_0x0113:
            r5 = r20
            goto L_0x011b
        L_0x0116:
            r19 = r8
            r20 = 1
        L_0x011a:
            r5 = 0
        L_0x011b:
            if (r5 == 0) goto L_0x0145
            boolean r5 = r1.hasFocusable()
            if (r5 == 0) goto L_0x0134
            int r4 = r11.mSpanIndex
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r8 = r3 - r2
            r15 = r4
            r5 = r21
            r4 = r1
            goto L_0x0149
        L_0x0134:
            int r5 = r11.mSpanIndex
            int r3 = java.lang.Math.min(r3, r6)
            int r2 = java.lang.Math.max(r2, r7)
            int r12 = r3 - r2
            r9 = r5
            r8 = r19
            r5 = r1
            goto L_0x0149
        L_0x0145:
            r8 = r19
            r5 = r21
        L_0x0149:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            goto L_0x0074
        L_0x0155:
            r21 = r5
            if (r4 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            r4 = r21
        L_0x015c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.mo11230X(android.view.View, int, androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y):android.view.View");
    }

    /* renamed from: X0 */
    public final View mo11231X0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, boolean z, boolean z2) {
        int i;
        int y = mo11676y();
        int i2 = -1;
        if (z2) {
            i = mo11676y() - 1;
            y = -1;
        } else {
            i = 0;
            i2 = 1;
        }
        int b = yVar.mo11715b();
        mo11276N0();
        int k = this.f7019r.mo11811k();
        int g = this.f7019r.mo11807g();
        View view = null;
        View view2 = null;
        while (i != y) {
            View x = mo11674x(i);
            int I = RecyclerView.C3100o.m7396I(x);
            if (I >= 0 && I < b && mo11253t1(I, uVar, yVar) == 0) {
                if (((RecyclerView.LayoutParams) x.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = x;
                    }
                } else if (this.f7019r.mo11805e(x) < g && this.f7019r.mo11802b(x) >= k) {
                    return x;
                } else {
                    if (view == null) {
                        view = x;
                    }
                }
            }
            i += i2;
        }
        return view != null ? view : view2;
    }

    /* renamed from: b0 */
    public final void mo11232b0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, View view, C6689b bVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof LayoutParams)) {
            mo11660a0(view, bVar);
            return;
        }
        LayoutParams layoutParams2 = (LayoutParams) layoutParams;
        int s1 = mo11250s1(layoutParams2.getViewLayoutPosition(), uVar, yVar);
        if (this.f7017p == 0) {
            bVar.mo18869s(C6689b.C6692c.m13082a(layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), s1, 1, false, false));
            return;
        }
        bVar.mo18869s(C6689b.C6692c.m13082a(s1, 1, layoutParams2.getSpanIndex(), layoutParams2.getSpanSize(), false, false));
    }

    /* renamed from: c0 */
    public final void mo11233c0(int i, int i2) {
        this.f7008K.mo11268e();
        this.f7008K.f7011b.clear();
    }

    /* renamed from: d0 */
    public final void mo11234d0() {
        this.f7008K.mo11268e();
        this.f7008K.f7011b.clear();
    }

    /* renamed from: e0 */
    public final void mo11235e0(int i, int i2) {
        this.f7008K.mo11268e();
        this.f7008K.f7011b.clear();
    }

    /* renamed from: e1 */
    public final void mo11236e1(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, LinearLayoutManager.C3079c cVar, LinearLayoutManager.C3078b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        View b;
        RecyclerView.C3111u uVar2 = uVar;
        RecyclerView.C3117y yVar2 = yVar;
        LinearLayoutManager.C3079c cVar2 = cVar;
        LinearLayoutManager.C3078b bVar2 = bVar;
        int j = this.f7019r.mo11810j();
        int i12 = 1;
        boolean z2 = j != 1073741824;
        int i13 = mo11676y() > 0 ? this.f7004G[this.f7003F] : 0;
        if (z2) {
            mo11260x1();
        }
        boolean z3 = cVar2.f7041e == 1;
        int i14 = this.f7003F;
        if (!z3) {
            i14 = mo11253t1(cVar2.f7040d, uVar2, yVar2) + mo11255u1(cVar2.f7040d, uVar2, yVar2);
        }
        int i15 = 0;
        while (i15 < this.f7003F) {
            int i16 = cVar2.f7040d;
            if (!(i16 >= 0 && i16 < yVar.mo11715b()) || i14 <= 0) {
                break;
            }
            int i17 = cVar2.f7040d;
            int u1 = mo11255u1(i17, uVar2, yVar2);
            if (u1 <= this.f7003F) {
                i14 -= u1;
                if (i14 < 0 || (b = cVar2.mo11328b(uVar2)) == null) {
                    break;
                }
                this.f7005H[i15] = b;
                i15++;
            } else {
                throw new IllegalArgumentException(C0071c.m191c(C0472h.m1244g("Item at position ", i17, " requires ", u1, " spans but GridLayoutManager has only "), this.f7003F, " spans."));
            }
        }
        if (i15 == 0) {
            bVar2.f7034b = true;
            return;
        }
        if (z3) {
            i2 = 0;
            i = i15;
        } else {
            i2 = i15 - 1;
            i12 = -1;
            i = -1;
        }
        int i18 = 0;
        while (i2 != i) {
            View view = this.f7005H[i2];
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int u12 = mo11255u1(RecyclerView.C3100o.m7396I(view), uVar2, yVar2);
            layoutParams.mSpanSize = u12;
            layoutParams.mSpanIndex = i18;
            i18 += u12;
            i2 += i12;
        }
        float f = 0.0f;
        int i19 = 0;
        for (int i20 = 0; i20 < i15; i20++) {
            View view2 = this.f7005H[i20];
            if (cVar2.f7047k != null) {
                z = false;
                if (z3) {
                    mo11661b(view2, -1, true);
                } else {
                    mo11661b(view2, 0, true);
                }
            } else if (z3) {
                z = false;
                mo11661b(view2, -1, false);
            } else {
                z = false;
                mo11661b(view2, 0, false);
            }
            mo11663e(view2, this.f7009L);
            mo11258v1(view2, j, z);
            int c = this.f7019r.mo11803c(view2);
            if (c > i19) {
                i19 = c;
            }
            float d = (((float) this.f7019r.mo11804d(view2)) * 1.0f) / ((float) ((LayoutParams) view2.getLayoutParams()).mSpanSize);
            if (d > f) {
                f = d;
            }
        }
        if (z2) {
            mo11248q1(Math.max(Math.round(f * ((float) this.f7003F)), i13));
            i19 = 0;
            for (int i21 = 0; i21 < i15; i21++) {
                View view3 = this.f7005H[i21];
                mo11258v1(view3, 1073741824, true);
                int c2 = this.f7019r.mo11803c(view3);
                if (c2 > i19) {
                    i19 = c2;
                }
            }
        }
        for (int i22 = 0; i22 < i15; i22++) {
            View view4 = this.f7005H[i22];
            if (this.f7019r.mo11803c(view4) != i19) {
                LayoutParams layoutParams2 = (LayoutParams) view4.getLayoutParams();
                Rect rect = layoutParams2.mDecorInsets;
                int i23 = rect.top + rect.bottom + layoutParams2.topMargin + layoutParams2.bottomMargin;
                int i24 = rect.left + rect.right + layoutParams2.leftMargin + layoutParams2.rightMargin;
                int r1 = mo11249r1(layoutParams2.mSpanIndex, layoutParams2.mSpanSize);
                if (this.f7017p == 1) {
                    i11 = RecyclerView.C3100o.m7404z(r1, 1073741824, i24, layoutParams2.width, false);
                    i10 = View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);
                } else {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                    i10 = RecyclerView.C3100o.m7404z(r1, 1073741824, i23, layoutParams2.height, false);
                    i11 = makeMeasureSpec;
                }
                if (mo11647D0(view4, i11, i10, (RecyclerView.LayoutParams) view4.getLayoutParams())) {
                    view4.measure(i11, i10);
                }
            }
        }
        bVar2.f7033a = i19;
        if (this.f7017p == 1) {
            if (cVar2.f7042f == -1) {
                i9 = cVar2.f7038b;
                i8 = i9 - i19;
            } else {
                i8 = cVar2.f7038b;
                i9 = i19 + i8;
            }
            i4 = 0;
            i3 = i8;
            i5 = i9;
            i6 = 0;
        } else {
            if (cVar2.f7042f == -1) {
                i6 = cVar2.f7038b;
                i7 = i6 - i19;
            } else {
                i7 = cVar2.f7038b;
                i6 = i19 + i7;
            }
            i3 = 0;
            i4 = i7;
            i5 = 0;
        }
        for (int i25 = 0; i25 < i15; i25++) {
            View view5 = this.f7005H[i25];
            LayoutParams layoutParams3 = (LayoutParams) view5.getLayoutParams();
            if (this.f7017p != 1) {
                int H = mo11652H() + this.f7004G[layoutParams3.mSpanIndex];
                i3 = H;
                i5 = this.f7019r.mo11804d(view5) + H;
            } else if (mo11296d1()) {
                i6 = mo11649F() + this.f7004G[this.f7003F - layoutParams3.mSpanIndex];
                i4 = i6 - this.f7019r.mo11804d(view5);
            } else {
                i4 = this.f7004G[layoutParams3.mSpanIndex] + mo11649F();
                i6 = this.f7019r.mo11804d(view5) + i4;
            }
            RecyclerView.C3100o.m7401Q(view5, i4, i3, i6, i5);
            if (layoutParams3.isItemRemoved() || layoutParams3.isItemChanged()) {
                bVar2.f7035c = true;
            }
            bVar2.f7036d = view5.hasFocusable() | bVar2.f7036d;
        }
        Arrays.fill(this.f7005H, (Object) null);
    }

    /* renamed from: f0 */
    public final void mo11237f0(int i, int i2) {
        this.f7008K.mo11268e();
        this.f7008K.f7011b.clear();
    }

    /* renamed from: f1 */
    public final void mo11238f1(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar, LinearLayoutManager.C3077a aVar, int i) {
        mo11260x1();
        if (yVar.mo11715b() > 0 && !yVar.f7128g) {
            boolean z = i == 1;
            int t1 = mo11253t1(aVar.f7029b, uVar, yVar);
            if (z) {
                while (t1 > 0) {
                    int i2 = aVar.f7029b;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    aVar.f7029b = i3;
                    t1 = mo11253t1(i3, uVar, yVar);
                }
            } else {
                int b = yVar.mo11715b() - 1;
                int i4 = aVar.f7029b;
                while (i4 < b) {
                    int i5 = i4 + 1;
                    int t12 = mo11253t1(i5, uVar, yVar);
                    if (t12 <= t1) {
                        break;
                    }
                    i4 = i5;
                    t1 = t12;
                }
                aVar.f7029b = i4;
            }
        }
        View[] viewArr = this.f7005H;
        if (viewArr == null || viewArr.length != this.f7003F) {
            this.f7005H = new View[this.f7003F];
        }
    }

    /* renamed from: g0 */
    public final void mo11239g0(int i, int i2) {
        this.f7008K.mo11268e();
        this.f7008K.f7011b.clear();
    }

    /* renamed from: h */
    public final boolean mo11240h(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    /* renamed from: h0 */
    public void mo11241h0(RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (yVar.f7128g) {
            int y = mo11676y();
            for (int i = 0; i < y; i++) {
                LayoutParams layoutParams = (LayoutParams) mo11674x(i).getLayoutParams();
                int viewLayoutPosition = layoutParams.getViewLayoutPosition();
                this.f7006I.put(viewLayoutPosition, layoutParams.getSpanSize());
                this.f7007J.put(viewLayoutPosition, layoutParams.getSpanIndex());
            }
        }
        super.mo11241h0(uVar, yVar);
        this.f7006I.clear();
        this.f7007J.clear();
    }

    /* renamed from: i0 */
    public final void mo11242i0(RecyclerView.C3117y yVar) {
        super.mo11242i0(yVar);
        this.f7002E = false;
    }

    /* renamed from: m */
    public int mo11243m(RecyclerView.C3117y yVar) {
        return mo11273K0(yVar);
    }

    /* renamed from: m1 */
    public final void mo11244m1(boolean z) {
        if (!z) {
            super.mo11244m1(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* renamed from: n */
    public int mo11245n(RecyclerView.C3117y yVar) {
        return mo11274L0(yVar);
    }

    /* renamed from: p */
    public int mo11246p(RecyclerView.C3117y yVar) {
        return mo11273K0(yVar);
    }

    /* renamed from: q */
    public int mo11247q(RecyclerView.C3117y yVar) {
        return mo11274L0(yVar);
    }

    /* renamed from: q1 */
    public final void mo11248q1(int i) {
        int i2;
        int[] iArr = this.f7004G;
        int i3 = this.f7003F;
        if (!(iArr != null && iArr.length == i3 + 1 && iArr[iArr.length - 1] == i)) {
            iArr = new int[(i3 + 1)];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 <= 0 || i3 - i4 >= i6) {
                i2 = i5;
            } else {
                i2 = i5 + 1;
                i4 -= i3;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.f7004G = iArr;
    }

    /* renamed from: r1 */
    public final int mo11249r1(int i, int i2) {
        if (this.f7017p != 1 || !mo11296d1()) {
            int[] iArr = this.f7004G;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.f7004G;
        int i3 = this.f7003F;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    /* renamed from: s1 */
    public final int mo11250s1(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (!yVar.f7128g) {
            return this.f7008K.mo11267b(i, this.f7003F);
        }
        int b = uVar.mo11693b(i);
        if (b != -1) {
            return this.f7008K.mo11267b(b, this.f7003F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    /* renamed from: t */
    public final RecyclerView.LayoutParams mo11251t() {
        return this.f7017p == 0 ? new LayoutParams(-2, -1) : new LayoutParams(-1, -2);
    }

    /* renamed from: t0 */
    public int mo11252t0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        mo11260x1();
        View[] viewArr = this.f7005H;
        if (viewArr == null || viewArr.length != this.f7003F) {
            this.f7005H = new View[this.f7003F];
        }
        return super.mo11252t0(i, uVar, yVar);
    }

    /* renamed from: t1 */
    public final int mo11253t1(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (!yVar.f7128g) {
            return this.f7008K.mo11266a(i, this.f7003F);
        }
        int i2 = this.f7007J.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = uVar.mo11693b(i);
        if (b != -1) {
            return this.f7008K.mo11266a(b, this.f7003F);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    /* renamed from: u */
    public final RecyclerView.LayoutParams mo11254u(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    /* renamed from: u1 */
    public final int mo11255u1(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        if (!yVar.f7128g) {
            return this.f7008K.mo11265d(i);
        }
        int i2 = this.f7006I.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int b = uVar.mo11693b(i);
        if (b != -1) {
            return this.f7008K.mo11265d(b);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    /* renamed from: v */
    public final RecyclerView.LayoutParams mo11256v(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    /* renamed from: v0 */
    public int mo11257v0(int i, RecyclerView.C3111u uVar, RecyclerView.C3117y yVar) {
        mo11260x1();
        View[] viewArr = this.f7005H;
        if (viewArr == null || viewArr.length != this.f7003F) {
            this.f7005H = new View[this.f7003F];
        }
        return super.mo11257v0(i, uVar, yVar);
    }

    /* renamed from: v1 */
    public final void mo11258v1(View view, int i, boolean z) {
        int i2;
        int i3;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect = layoutParams.mDecorInsets;
        int i4 = rect.top + rect.bottom + layoutParams.topMargin + layoutParams.bottomMargin;
        int i5 = rect.left + rect.right + layoutParams.leftMargin + layoutParams.rightMargin;
        int r1 = mo11249r1(layoutParams.mSpanIndex, layoutParams.mSpanSize);
        if (this.f7017p == 1) {
            i2 = RecyclerView.C3100o.m7404z(r1, i, i5, layoutParams.width, false);
            i3 = RecyclerView.C3100o.m7404z(this.f7019r.mo11812l(), this.f7083m, i4, layoutParams.height, true);
        } else {
            int z2 = RecyclerView.C3100o.m7404z(r1, i, i4, layoutParams.height, false);
            int z3 = RecyclerView.C3100o.m7404z(this.f7019r.mo11812l(), this.f7082l, i5, layoutParams.width, true);
            i3 = z2;
            i2 = z3;
        }
        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z ? mo11647D0(view, i2, i3, layoutParams2) : mo11645B0(view, i2, i3, layoutParams2)) {
            view.measure(i2, i3);
        }
    }

    /* renamed from: w1 */
    public final void mo11259w1(int i) {
        if (i != this.f7003F) {
            this.f7002E = true;
            if (i >= 1) {
                this.f7003F = i;
                this.f7008K.mo11268e();
                mo11672s0();
                return;
            }
            throw new IllegalArgumentException(C0015b.m88g("Span count should be at least 1. Provided ", i));
        }
    }

    /* renamed from: x1 */
    public final void mo11260x1() {
        int i;
        int i2;
        if (this.f7017p == 1) {
            i2 = this.f7084n - mo11651G();
            i = mo11649F();
        } else {
            i2 = this.f7085o - mo11648E();
            i = mo11652H();
        }
        mo11248q1(i2 - i);
    }

    /* renamed from: y0 */
    public final void mo11261y0(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.f7004G == null) {
            super.mo11261y0(rect, i, i2);
        }
        int G = mo11651G() + mo11649F();
        int E = mo11648E() + mo11652H();
        if (this.f7017p == 1) {
            int height = rect.height() + E;
            RecyclerView recyclerView = this.f7072b;
            WeakHashMap<View, C2330s0> weakHashMap = C2364y.f5646a;
            i4 = RecyclerView.C3100o.m7402i(i2, height, C2364y.C2368d.m5214d(recyclerView));
            int[] iArr = this.f7004G;
            i3 = RecyclerView.C3100o.m7402i(i, iArr[iArr.length - 1] + G, C2364y.C2368d.m5215e(this.f7072b));
        } else {
            int width = rect.width() + G;
            RecyclerView recyclerView2 = this.f7072b;
            WeakHashMap<View, C2330s0> weakHashMap2 = C2364y.f5646a;
            i3 = RecyclerView.C3100o.m7402i(i, width, C2364y.C2368d.m5215e(recyclerView2));
            int[] iArr2 = this.f7004G;
            i4 = RecyclerView.C3100o.m7402i(i2, iArr2[iArr2.length - 1] + E, C2364y.C2368d.m5214d(this.f7072b));
        }
        this.f7072b.setMeasuredDimension(i3, i4);
    }

    public static class LayoutParams extends RecyclerView.LayoutParams {
        public static final int INVALID_SPAN_ID = -1;
        public int mSpanIndex = -1;
        public int mSpanSize = 0;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int getSpanIndex() {
            return this.mSpanIndex;
        }

        public int getSpanSize() {
            return this.mSpanSize;
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

    public GridLayoutManager(int i) {
        mo11259w1(i);
    }

    public GridLayoutManager(int i, int i2) {
        super(i2, false);
        mo11259w1(i);
    }
}
