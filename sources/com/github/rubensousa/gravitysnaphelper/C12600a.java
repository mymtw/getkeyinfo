package com.github.rubensousa.gravitysnaphelper;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.C3127a0;
import androidx.recyclerview.widget.C3129b0;
import androidx.recyclerview.widget.C3198u;
import androidx.recyclerview.widget.C3199v;
import androidx.recyclerview.widget.C3205z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;
import p032c1.C4361d;

/* renamed from: com.github.rubensousa.gravitysnaphelper.a */
public final class C12600a extends C3199v {

    /* renamed from: f */
    public int f27806f;

    /* renamed from: g */
    public boolean f27807g;

    /* renamed from: h */
    public boolean f27808h;

    /* renamed from: i */
    public int f27809i;

    /* renamed from: j */
    public boolean f27810j = false;

    /* renamed from: k */
    public boolean f27811k = false;

    /* renamed from: l */
    public float f27812l = 100.0f;

    /* renamed from: m */
    public int f27813m = -1;

    /* renamed from: n */
    public float f27814n = -1.0f;

    /* renamed from: o */
    public C3127a0 f27815o;

    /* renamed from: p */
    public C3205z f27816p;

    /* renamed from: q */
    public RecyclerView f27817q;

    /* renamed from: r */
    public C12601a f27818r = new C12601a();

    /* renamed from: com.github.rubensousa.gravitysnaphelper.a$a */
    public class C12601a extends RecyclerView.C3108s {
        public C12601a() {
        }

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            C12600a aVar = C12600a.this;
            boolean z = false;
            if (i == 0) {
                aVar.getClass();
            }
            if (i != 0) {
                z = true;
            }
            aVar.f27810j = z;
        }
    }

    /* renamed from: com.github.rubensousa.gravitysnaphelper.a$b */
    public class C12602b extends C3198u {
        public C12602b(Context context) {
            super(context);
        }

        /* renamed from: f */
        public final void mo11711f(View view, RecyclerView.C3114x.C3115a aVar) {
            RecyclerView recyclerView = C12600a.this.f27817q;
            if (recyclerView != null && recyclerView.getLayoutManager() != null) {
                C12600a aVar2 = C12600a.this;
                int[] b = aVar2.mo11820b(aVar2.f27817q.getLayoutManager(), view);
                int i = b[0];
                int i2 = b[1];
                int j = mo11946j(Math.max(Math.abs(i), Math.abs(i2)));
                if (j > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f7441j;
                    aVar.f7115a = i;
                    aVar.f7116b = i2;
                    aVar.f7117c = j;
                    aVar.f7119e = decelerateInterpolator;
                    aVar.f7120f = true;
                }
            }
        }

        /* renamed from: i */
        public final float mo11827i(DisplayMetrics displayMetrics) {
            return C12600a.this.f27812l / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: com.github.rubensousa.gravitysnaphelper.a$c */
    public interface C12603c {
        /* renamed from: a */
        void mo45369a();
    }

    public C12600a(int i) {
        if (i == 8388611 || i == 8388613 || i == 80 || i == 48 || i == 17) {
            this.f27808h = false;
            this.f27806f = i;
            return;
        }
        throw new IllegalArgumentException("Invalid gravity value. Use START | END | BOTTOM | TOP | CENTER constants");
    }

    /* renamed from: m */
    private C3129b0 m20278m(RecyclerView.C3100o oVar) {
        C3205z zVar = this.f27816p;
        if (zVar == null || zVar.f7191a != oVar) {
            this.f27816p = new C3205z(oVar);
        }
        return this.f27816p;
    }

    /* renamed from: n */
    private C3129b0 m20279n(RecyclerView.C3100o oVar) {
        C3127a0 a0Var = this.f27815o;
        if (a0Var == null || a0Var.f7191a != oVar) {
            this.f27815o = new C3127a0(oVar);
        }
        return this.f27815o;
    }

    /* renamed from: a */
    public final void mo11867a(RecyclerView recyclerView) throws IllegalStateException {
        RecyclerView recyclerView2 = this.f27817q;
        if (recyclerView2 != null) {
            recyclerView2.removeOnScrollListener(this.f27818r);
        }
        if (recyclerView != null) {
            recyclerView.setOnFlingListener((RecyclerView.C3106q) null);
            int i = this.f27806f;
            if (i == 8388611 || i == 8388613) {
                Locale locale = Locale.getDefault();
                int i2 = C4361d.f9600a;
                boolean z = true;
                if (TextUtils.getLayoutDirectionFromLocale(locale) != 1) {
                    z = false;
                }
                this.f27807g = z;
            }
            recyclerView.addOnScrollListener(this.f27818r);
            this.f27817q = recyclerView;
        } else {
            this.f27817q = null;
        }
        super.mo11867a(recyclerView);
    }

    /* renamed from: b */
    public final int[] mo11820b(RecyclerView.C3100o oVar, View view) {
        if (this.f27806f == 17) {
            int[] iArr = new int[2];
            if (oVar.mo11297f()) {
                C3205z zVar = this.f7449e;
                if (zVar == null || zVar.f7191a != oVar) {
                    this.f7449e = new C3205z(oVar);
                }
                C3205z zVar2 = this.f7449e;
                iArr[0] = ((zVar2.mo11803c(view) / 2) + zVar2.mo11805e(view)) - ((zVar2.mo11812l() / 2) + zVar2.mo11811k());
            } else {
                iArr[0] = 0;
            }
            if (oVar.mo11298g()) {
                C3127a0 a0Var = this.f7448d;
                if (a0Var == null || a0Var.f7191a != oVar) {
                    this.f7448d = new C3127a0(oVar);
                }
                C3127a0 a0Var2 = this.f7448d;
                iArr[1] = ((a0Var2.mo11803c(view) / 2) + a0Var2.mo11805e(view)) - ((a0Var2.mo11812l() / 2) + a0Var2.mo11811k());
            } else {
                iArr[1] = 0;
            }
            return iArr;
        }
        int[] iArr2 = new int[2];
        if (!(oVar instanceof LinearLayoutManager)) {
            return iArr2;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) oVar;
        if (linearLayoutManager.mo11297f()) {
            boolean z = this.f27807g;
            if ((!z || this.f27806f != 8388613) && (z || this.f27806f != 8388611)) {
                iArr2[0] = mo45366k(view, m20278m(linearLayoutManager));
            } else {
                iArr2[0] = mo45367l(view, m20278m(linearLayoutManager));
            }
        } else if (linearLayoutManager.mo11298g()) {
            if (this.f27806f == 48) {
                iArr2[1] = mo45367l(view, m20279n(linearLayoutManager));
            } else {
                iArr2[1] = mo45366k(view, m20279n(linearLayoutManager));
            }
        }
        return iArr2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
        if (r1 != -1) goto L_0x0058;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int[] mo11868c(int r14, int r15) {
        /*
            r13 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r13.f27817q
            if (r0 == 0) goto L_0x0075
            androidx.recyclerview.widget.a0 r0 = r13.f27815o
            if (r0 != 0) goto L_0x000c
            androidx.recyclerview.widget.z r0 = r13.f27816p
            if (r0 == 0) goto L_0x0075
        L_0x000c:
            int r0 = r13.f27813m
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = -1
            if (r0 != r2) goto L_0x001a
            float r0 = r13.f27814n
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
            goto L_0x0075
        L_0x001a:
            r0 = 2
            int[] r0 = new int[r0]
            android.widget.Scroller r12 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r3 = r13.f27817q
            android.content.Context r3 = r3.getContext()
            android.view.animation.DecelerateInterpolator r4 = new android.view.animation.DecelerateInterpolator
            r4.<init>()
            r12.<init>(r3, r4)
            float r3 = r13.f27814n
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == 0) goto L_0x0054
            androidx.recyclerview.widget.a0 r1 = r13.f27815o
            if (r1 == 0) goto L_0x0044
            androidx.recyclerview.widget.RecyclerView r1 = r13.f27817q
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r2 = r13.f27814n
            goto L_0x0051
        L_0x0044:
            androidx.recyclerview.widget.z r1 = r13.f27816p
            if (r1 == 0) goto L_0x005a
            androidx.recyclerview.widget.RecyclerView r1 = r13.f27817q
            int r1 = r1.getWidth()
            float r1 = (float) r1
            float r2 = r13.f27814n
        L_0x0051:
            float r1 = r1 * r2
            int r1 = (int) r1
            goto L_0x0058
        L_0x0054:
            int r1 = r13.f27813m
            if (r1 == r2) goto L_0x005a
        L_0x0058:
            r11 = r1
            goto L_0x005b
        L_0x005a:
            r11 = r3
        L_0x005b:
            r4 = 0
            r5 = 0
            int r10 = -r11
            r3 = r12
            r6 = r14
            r7 = r15
            r8 = r10
            r9 = r11
            r3.fling(r4, r5, r6, r7, r8, r9, r10, r11)
            r14 = 0
            int r15 = r12.getFinalX()
            r0[r14] = r15
            r14 = 1
            int r15 = r12.getFinalY()
            r0[r14] = r15
            return r0
        L_0x0075:
            int[] r14 = super.mo11868c(r14, r15)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.rubensousa.gravitysnaphelper.C12600a.mo11868c(int, int):int[]");
    }

    /* renamed from: d */
    public final RecyclerView.C3114x mo11821d(RecyclerView.C3100o oVar) {
        RecyclerView recyclerView;
        if (!(oVar instanceof RecyclerView.C3114x.C3116b) || (recyclerView = this.f27817q) == null) {
            return null;
        }
        return new C12602b(recyclerView.getContext());
    }

    /* renamed from: e */
    public final View mo11822e(RecyclerView.C3100o oVar) {
        return mo45364i(oVar, true);
    }

    /* renamed from: i */
    public final View mo45364i(RecyclerView.C3100o oVar, boolean z) {
        int i = this.f27806f;
        View j = i != 17 ? i != 48 ? i != 80 ? i != 8388611 ? i != 8388613 ? null : mo45365j(oVar, m20278m(oVar), 8388613, z) : mo45365j(oVar, m20278m(oVar), 8388611, z) : mo45365j(oVar, m20279n(oVar), 8388613, z) : mo45365j(oVar, m20279n(oVar), 8388611, z) : oVar.mo11297f() ? mo45365j(oVar, m20278m(oVar), 17, z) : mo45365j(oVar, m20279n(oVar), 17, z);
        if (j != null) {
            this.f27809i = this.f27817q.getChildAdapterPosition(j);
        } else {
            this.f27809i = -1;
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0062, code lost:
        r12 = true;
     */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo45365j(androidx.recyclerview.widget.RecyclerView.C3100o r9, androidx.recyclerview.widget.C3129b0 r10, int r11, boolean r12) {
        /*
            r8 = this;
            int r0 = r9.mo11676y()
            r1 = 0
            if (r0 == 0) goto L_0x010b
            boolean r0 = r9 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 != 0) goto L_0x000d
            goto L_0x010b
        L_0x000d:
            r0 = r9
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            r2 = 8388613(0x800005, float:1.175495E-38)
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r4 = 0
            r5 = 1
            if (r12 == 0) goto L_0x006c
            boolean r12 = r0.f7021t
            if (r12 != 0) goto L_0x0022
            int r6 = r8.f27806f
            if (r6 == r3) goto L_0x0038
        L_0x0022:
            if (r12 == 0) goto L_0x0028
            int r6 = r8.f27806f
            if (r6 == r2) goto L_0x0038
        L_0x0028:
            if (r12 != 0) goto L_0x0030
            int r6 = r8.f27806f
            r7 = 48
            if (r6 == r7) goto L_0x0038
        L_0x0030:
            if (r12 == 0) goto L_0x0044
            int r12 = r8.f27806f
            r6 = 80
            if (r12 != r6) goto L_0x0044
        L_0x0038:
            int r12 = r0.mo11283T0()
            int r6 = r0.mo11644B()
            int r6 = r6 - r5
            if (r12 != r6) goto L_0x0064
            goto L_0x0062
        L_0x0044:
            int r12 = r8.f27806f
            r6 = 17
            if (r12 != r6) goto L_0x005c
            int r12 = r0.mo11279P0()
            if (r12 == 0) goto L_0x0062
            int r12 = r0.mo11283T0()
            int r6 = r0.mo11644B()
            int r6 = r6 - r5
            if (r12 != r6) goto L_0x0064
            goto L_0x0062
        L_0x005c:
            int r12 = r0.mo11279P0()
            if (r12 != 0) goto L_0x0064
        L_0x0062:
            r12 = r5
            goto L_0x0065
        L_0x0064:
            r12 = r4
        L_0x0065:
            if (r12 == 0) goto L_0x006c
            boolean r12 = r8.f27808h
            if (r12 != 0) goto L_0x006c
            return r1
        L_0x006c:
            r12 = 2147483647(0x7fffffff, float:NaN)
            androidx.recyclerview.widget.RecyclerView r9 = r9.f7072b
            if (r9 == 0) goto L_0x0079
            boolean r9 = r9.mClipToPadding
            if (r9 == 0) goto L_0x0079
            r9 = r5
            goto L_0x007a
        L_0x0079:
            r9 = r4
        L_0x007a:
            if (r9 == 0) goto L_0x0088
            int r9 = r10.mo11811k()
            int r6 = r10.mo11812l()
            int r6 = r6 / 2
            int r6 = r6 + r9
            goto L_0x008e
        L_0x0088:
            int r9 = r10.mo11806f()
            int r6 = r9 / 2
        L_0x008e:
            if (r11 != r3) goto L_0x0094
            boolean r9 = r8.f27807g
            if (r9 == 0) goto L_0x009a
        L_0x0094:
            if (r11 != r2) goto L_0x009c
            boolean r9 = r8.f27807g
            if (r9 == 0) goto L_0x009c
        L_0x009a:
            r9 = r5
            goto L_0x009d
        L_0x009c:
            r9 = r4
        L_0x009d:
            if (r11 != r3) goto L_0x00a3
            boolean r3 = r8.f27807g
            if (r3 != 0) goto L_0x00ab
        L_0x00a3:
            if (r11 != r2) goto L_0x00aa
            boolean r11 = r8.f27807g
            if (r11 != 0) goto L_0x00aa
            goto L_0x00ab
        L_0x00aa:
            r5 = r4
        L_0x00ab:
            int r11 = r0.mo11676y()
            if (r4 >= r11) goto L_0x010b
            android.view.View r11 = r0.mo11674x(r4)
            if (r9 == 0) goto L_0x00d2
            boolean r2 = r8.f27811k
            if (r2 != 0) goto L_0x00c4
            int r2 = r10.mo11805e(r11)
            int r2 = java.lang.Math.abs(r2)
            goto L_0x0104
        L_0x00c4:
            int r2 = r10.mo11811k()
            int r3 = r10.mo11805e(r11)
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            goto L_0x0104
        L_0x00d2:
            if (r5 == 0) goto L_0x00f4
            boolean r2 = r8.f27811k
            if (r2 != 0) goto L_0x00e6
            int r2 = r10.mo11802b(r11)
            int r3 = r10.mo11806f()
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            goto L_0x0104
        L_0x00e6:
            int r2 = r10.mo11807g()
            int r3 = r10.mo11802b(r11)
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            goto L_0x0104
        L_0x00f4:
            int r2 = r10.mo11805e(r11)
            int r3 = r10.mo11803c(r11)
            int r3 = r3 / 2
            int r3 = r3 + r2
            int r3 = r3 - r6
            int r2 = java.lang.Math.abs(r3)
        L_0x0104:
            if (r2 >= r12) goto L_0x0108
            r1 = r11
            r12 = r2
        L_0x0108:
            int r4 = r4 + 1
            goto L_0x00ab
        L_0x010b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.rubensousa.gravitysnaphelper.C12600a.mo45365j(androidx.recyclerview.widget.RecyclerView$o, androidx.recyclerview.widget.b0, int, boolean):android.view.View");
    }

    /* renamed from: k */
    public final int mo45366k(View view, C3129b0 b0Var) {
        int i;
        int i2;
        if (!this.f27811k) {
            int b = b0Var.mo11802b(view);
            if (b < b0Var.mo11806f() - ((b0Var.mo11806f() - b0Var.mo11807g()) / 2)) {
                return b - b0Var.mo11807g();
            }
            i2 = b0Var.mo11802b(view);
            i = b0Var.mo11806f();
        } else {
            i2 = b0Var.mo11802b(view);
            i = b0Var.mo11807g();
        }
        return i2 - i;
    }

    /* renamed from: l */
    public final int mo45367l(View view, C3129b0 b0Var) {
        int i;
        int i2;
        if (!this.f27811k) {
            i2 = b0Var.mo11805e(view);
            if (i2 < b0Var.mo11811k() / 2) {
                return i2;
            }
            i = b0Var.mo11811k();
        } else {
            i2 = b0Var.mo11805e(view);
            i = b0Var.mo11811k();
        }
        return i2 - i;
    }

    /* renamed from: o */
    public final boolean mo45368o(int i, boolean z) {
        if (this.f27817q.getLayoutManager() != null) {
            if (z) {
                RecyclerView.C3114x d = mo11821d(this.f27817q.getLayoutManager());
                if (d != null) {
                    d.f7107a = i;
                    this.f27817q.getLayoutManager().mo11650F0(d);
                    return true;
                }
            } else {
                RecyclerView.C3084b0 findViewHolderForAdapterPosition = this.f27817q.findViewHolderForAdapterPosition(i);
                if (findViewHolderForAdapterPosition != null) {
                    int[] b = mo11820b(this.f27817q.getLayoutManager(), findViewHolderForAdapterPosition.itemView);
                    this.f27817q.scrollBy(b[0], b[1]);
                    return true;
                }
            }
        }
        return false;
    }
}
