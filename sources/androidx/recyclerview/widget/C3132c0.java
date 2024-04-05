package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Api;

/* renamed from: androidx.recyclerview.widget.c0 */
public class C3132c0 extends C3148g0 {

    /* renamed from: d */
    public C3127a0 f7199d;

    /* renamed from: e */
    public C3205z f7200e;

    /* renamed from: androidx.recyclerview.widget.c0$a */
    public class C3133a extends C3198u {
        public C3133a(Context context) {
            super(context);
        }

        /* renamed from: f */
        public final void mo11711f(View view, RecyclerView.C3114x.C3115a aVar) {
            C3132c0 c0Var = C3132c0.this;
            int[] b = c0Var.mo11820b(c0Var.f7234a.getLayoutManager(), view);
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

        /* renamed from: i */
        public final float mo11827i(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }

        /* renamed from: k */
        public final int mo11828k(int i) {
            return Math.min(100, super.mo11828k(i));
        }
    }

    /* renamed from: i */
    public static View m7668i(RecyclerView.C3100o oVar, C3129b0 b0Var) {
        int y = oVar.mo11676y();
        View view = null;
        if (y == 0) {
            return null;
        }
        int l = (b0Var.mo11812l() / 2) + b0Var.mo11811k();
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < y; i2++) {
            View x = oVar.mo11674x(i2);
            int abs = Math.abs(((b0Var.mo11803c(x) / 2) + b0Var.mo11805e(x)) - l);
            if (abs < i) {
                view = x;
                i = abs;
            }
        }
        return view;
    }

    /* renamed from: b */
    public final int[] mo11820b(RecyclerView.C3100o oVar, View view) {
        int[] iArr = new int[2];
        if (oVar.mo11297f()) {
            iArr[0] = mo11824h(view, mo11825j(oVar));
        } else {
            iArr[0] = 0;
        }
        if (oVar.mo11298g()) {
            iArr[1] = mo11824h(view, mo11826k(oVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    /* renamed from: d */
    public final RecyclerView.C3114x mo11821d(RecyclerView.C3100o oVar) {
        if (!(oVar instanceof RecyclerView.C3114x.C3116b)) {
            return null;
        }
        return new C3133a(this.f7234a.getContext());
    }

    /* renamed from: e */
    public View mo11822e(RecyclerView.C3100o oVar) {
        if (oVar.mo11298g()) {
            return m7668i(oVar, mo11826k(oVar));
        }
        if (oVar.mo11297f()) {
            return m7668i(oVar, mo11825j(oVar));
        }
        return null;
    }

    /* renamed from: f */
    public final int mo11823f(RecyclerView.C3100o oVar, int i, int i2) {
        PointF a;
        int B = oVar.mo11644B();
        if (B == 0) {
            return -1;
        }
        View view = null;
        C3129b0 k = oVar.mo11298g() ? mo11826k(oVar) : oVar.mo11297f() ? mo11825j(oVar) : null;
        if (k == null) {
            return -1;
        }
        int y = oVar.mo11676y();
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i5 = 0; i5 < y; i5++) {
            View x = oVar.mo11674x(i5);
            if (x != null) {
                int h = mo11824h(x, k);
                if (h <= 0 && h > i4) {
                    view2 = x;
                    i4 = h;
                }
                if (h >= 0 && h < i3) {
                    view = x;
                    i3 = h;
                }
            }
        }
        int i6 = 1;
        boolean z2 = !oVar.mo11297f() ? i2 > 0 : i > 0;
        if (z2 && view != null) {
            return RecyclerView.C3100o.m7396I(view);
        }
        if (!z2 && view2 != null) {
            return RecyclerView.C3100o.m7396I(view2);
        }
        if (z2) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int I = RecyclerView.C3100o.m7396I(view);
        int B2 = oVar.mo11644B();
        if ((oVar instanceof RecyclerView.C3114x.C3116b) && (a = ((RecyclerView.C3114x.C3116b) oVar).mo11291a(B2 - 1)) != null && (a.x < 0.0f || a.y < 0.0f)) {
            z = true;
        }
        if (z == z2) {
            i6 = -1;
        }
        int i7 = I + i6;
        if (i7 < 0 || i7 >= B) {
            return -1;
        }
        return i7;
    }

    /* renamed from: h */
    public final int mo11824h(View view, C3129b0 b0Var) {
        return ((b0Var.mo11803c(view) / 2) + b0Var.mo11805e(view)) - ((b0Var.mo11812l() / 2) + b0Var.mo11811k());
    }

    /* renamed from: j */
    public final C3129b0 mo11825j(RecyclerView.C3100o oVar) {
        C3205z zVar = this.f7200e;
        if (zVar == null || zVar.f7191a != oVar) {
            this.f7200e = new C3205z(oVar);
        }
        return this.f7200e;
    }

    /* renamed from: k */
    public final C3129b0 mo11826k(RecyclerView.C3100o oVar) {
        C3127a0 a0Var = this.f7199d;
        if (a0Var == null || a0Var.f7191a != oVar) {
            this.f7199d = new C3127a0(oVar);
        }
        return this.f7199d;
    }
}
