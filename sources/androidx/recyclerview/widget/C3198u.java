package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.requests.EtsyRequest;

/* renamed from: androidx.recyclerview.widget.u */
public class C3198u extends RecyclerView.C3114x {

    /* renamed from: i */
    public final LinearInterpolator f7440i = new LinearInterpolator();

    /* renamed from: j */
    public final DecelerateInterpolator f7441j = new DecelerateInterpolator();

    /* renamed from: k */
    public PointF f7442k;

    /* renamed from: l */
    public final DisplayMetrics f7443l;

    /* renamed from: m */
    public boolean f7444m = false;

    /* renamed from: n */
    public float f7445n;

    /* renamed from: o */
    public int f7446o = 0;

    /* renamed from: p */
    public int f7447p = 0;

    public C3198u(Context context) {
        this.f7443l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: h */
    public static int m7808h(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 == 0) {
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        } else if (i5 == 1) {
            return i4 - i2;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    /* renamed from: c */
    public final void mo11708c(int i, int i2, RecyclerView.C3114x.C3115a aVar) {
        if (this.f7108b.mLayout.mo11676y() == 0) {
            mo11712g();
            return;
        }
        int i3 = this.f7446o;
        int i4 = i3 - i;
        int i5 = 0;
        if (i3 * i4 <= 0) {
            i4 = 0;
        }
        this.f7446o = i4;
        int i6 = this.f7447p;
        int i7 = i6 - i2;
        if (i6 * i7 > 0) {
            i5 = i7;
        }
        this.f7447p = i5;
        if (i4 == 0 && i5 == 0) {
            PointF a = mo11706a(this.f7107a);
            if (a != null) {
                float f = a.x;
                if (!(f == 0.0f && a.y == 0.0f)) {
                    float f2 = a.y;
                    float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
                    float f3 = a.x / sqrt;
                    a.x = f3;
                    float f4 = a.y / sqrt;
                    a.y = f4;
                    this.f7442k = a;
                    this.f7446o = (int) (f3 * 10000.0f);
                    this.f7447p = (int) (f4 * 10000.0f);
                    int k = mo11828k(EtsyRequest.DEFAULT_TIMEOUT);
                    LinearInterpolator linearInterpolator = this.f7440i;
                    aVar.f7115a = (int) (((float) this.f7446o) * 1.2f);
                    aVar.f7116b = (int) (((float) this.f7447p) * 1.2f);
                    aVar.f7117c = (int) (((float) k) * 1.2f);
                    aVar.f7119e = linearInterpolator;
                    aVar.f7120f = true;
                    return;
                }
            }
            aVar.f7118d = this.f7107a;
            mo11712g();
        }
    }

    /* renamed from: d */
    public final void mo11709d() {
    }

    /* renamed from: e */
    public final void mo11710e() {
        this.f7447p = 0;
        this.f7446o = 0;
        this.f7442k = null;
    }

    /* renamed from: f */
    public void mo11711f(View view, RecyclerView.C3114x.C3115a aVar) {
        int i;
        int i2;
        PointF pointF = this.f7442k;
        int i3 = 0;
        int i4 = (pointF == null || pointF.x == 0.0f) ? 0 : i2 > 0 ? 1 : -1;
        RecyclerView.C3100o oVar = this.f7109c;
        if (oVar == null || !oVar.mo11297f()) {
            i = 0;
        } else {
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
            i = m7808h((view.getLeft() - RecyclerView.C3100o.m7395D(view)) - layoutParams.leftMargin, RecyclerView.C3100o.m7398K(view) + view.getRight() + layoutParams.rightMargin, oVar.mo11649F(), oVar.f7084n - oVar.mo11651G(), i4);
        }
        int l = mo11947l();
        RecyclerView.C3100o oVar2 = this.f7109c;
        if (oVar2 != null && oVar2.mo11298g()) {
            RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) view.getLayoutParams();
            i3 = m7808h((view.getTop() - RecyclerView.C3100o.m7399M(view)) - layoutParams2.topMargin, RecyclerView.C3100o.m7403w(view) + view.getBottom() + layoutParams2.bottomMargin, oVar2.mo11652H(), oVar2.f7085o - oVar2.mo11648E(), l);
        }
        int j = mo11946j((int) Math.sqrt((double) ((i3 * i3) + (i * i))));
        if (j > 0) {
            DecelerateInterpolator decelerateInterpolator = this.f7441j;
            aVar.f7115a = -i;
            aVar.f7116b = -i3;
            aVar.f7117c = j;
            aVar.f7119e = decelerateInterpolator;
            aVar.f7120f = true;
        }
    }

    /* renamed from: i */
    public float mo11827i(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* renamed from: j */
    public final int mo11946j(int i) {
        return (int) Math.ceil(((double) mo11828k(i)) / 0.3356d);
    }

    /* renamed from: k */
    public int mo11828k(int i) {
        float abs = (float) Math.abs(i);
        if (!this.f7444m) {
            this.f7445n = mo11827i(this.f7443l);
            this.f7444m = true;
        }
        return (int) Math.ceil((double) (abs * this.f7445n));
    }

    /* renamed from: l */
    public int mo11947l() {
        PointF pointF = this.f7442k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }
}
