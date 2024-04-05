package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.github.rubensousa.gravitysnaphelper.C12600a;

/* renamed from: androidx.recyclerview.widget.v */
public class C3199v extends C3148g0 {

    /* renamed from: d */
    public C3127a0 f7448d;

    /* renamed from: e */
    public C3205z f7449e;

    /* renamed from: f */
    public final int mo11823f(RecyclerView.C3100o oVar, int i, int i2) {
        int B;
        View i3;
        int I;
        int i4;
        PointF a;
        int i5;
        int i6;
        if (!(oVar instanceof RecyclerView.C3114x.C3116b) || (B = oVar.mo11644B()) == 0 || (i3 = ((C12600a) this).mo45364i(oVar, true)) == null || (I = RecyclerView.C3100o.m7396I(i3)) == -1 || (a = ((RecyclerView.C3114x.C3116b) oVar).mo11291a(i4)) == null) {
            return -1;
        }
        int i7 = 0;
        if (oVar.mo11297f()) {
            C3205z zVar = this.f7449e;
            if (zVar == null || zVar.f7191a != oVar) {
                this.f7449e = new C3205z(oVar);
            }
            i5 = mo11948h(oVar, this.f7449e, i, 0);
            if (a.x < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (oVar.mo11298g()) {
            C3127a0 a0Var = this.f7448d;
            if (a0Var == null || a0Var.f7191a != oVar) {
                this.f7448d = new C3127a0(oVar);
            }
            i6 = mo11948h(oVar, this.f7448d, 0, i2);
            if (a.y < 0.0f) {
                i6 = -i6;
            }
        } else {
            i6 = 0;
        }
        if (oVar.mo11298g()) {
            i5 = i6;
        }
        if (i5 == 0) {
            return -1;
        }
        int i8 = I + i5;
        if (i8 >= 0) {
            i7 = i8;
        }
        return i7 >= B ? B - 1 : i7;
    }

    /* renamed from: h */
    public final int mo11948h(RecyclerView.C3100o oVar, C3129b0 b0Var, int i, int i2) {
        int max;
        int[] c = mo11868c(i, i2);
        int y = oVar.mo11676y();
        float f = 1.0f;
        if (y != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < y; i5++) {
                View x = oVar.mo11674x(i5);
                int I = RecyclerView.C3100o.m7396I(x);
                if (I != -1) {
                    if (I < i4) {
                        view = x;
                        i4 = I;
                    }
                    if (I > i3) {
                        view2 = x;
                        i3 = I;
                    }
                }
            }
            if (!(view == null || view2 == null || (max = Math.max(b0Var.mo11802b(view), b0Var.mo11802b(view2)) - Math.min(b0Var.mo11805e(view), b0Var.mo11805e(view2))) == 0)) {
                f = (((float) max) * 1.0f) / ((float) ((i3 - i4) + 1));
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(((float) (Math.abs(c[0]) > Math.abs(c[1]) ? c[0] : c[1])) / f);
    }
}
