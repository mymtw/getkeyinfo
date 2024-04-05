package androidx.compose.p015ui.graphics;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: androidx.compose.ui.graphics.e */
public final class C1516e implements C1490a0 {

    /* renamed from: a */
    public Paint f3288a = new Paint(7);

    /* renamed from: b */
    public int f3289b = 3;

    /* renamed from: c */
    public Shader f3290c;

    /* renamed from: d */
    public C1546t f3291d;

    /* renamed from: a */
    public final long mo6237a() {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        return C18263b.m30834b(paint.getColor());
    }

    /* renamed from: b */
    public final void mo6238b(int i) {
        this.f3289b = i;
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            C1543q0.f3355a.mo6396a(paint, i);
        } else {
            paint.setXfermode(new PorterDuffXfermode(C1489a.m3160b(i)));
        }
    }

    /* renamed from: c */
    public final C1546t mo6239c() {
        return this.f3291d;
    }

    /* renamed from: d */
    public final void mo6240d(int i) {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "$this$setNativeFilterQuality");
        paint.setFilterBitmap(!(i == 0));
    }

    /* renamed from: e */
    public final void mo6241e(long j) {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "$this$setNativeColor");
        paint.setColor(C18263b.m30859o0(j));
    }

    /* renamed from: f */
    public final int mo6242f() {
        return this.f3289b;
    }

    /* renamed from: g */
    public final Paint mo6243g() {
        return this.f3288a;
    }

    public final float getAlpha() {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        return ((float) paint.getAlpha()) / 255.0f;
    }

    /* renamed from: h */
    public final void mo6245h(Shader shader) {
        this.f3290c = shader;
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        paint.setShader(shader);
    }

    /* renamed from: i */
    public final Shader mo6246i() {
        return this.f3290c;
    }

    /* renamed from: j */
    public final void mo6247j(C1546t tVar) {
        this.f3291d = tVar;
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        paint.setColorFilter(tVar != null ? tVar.f3367a : null);
    }

    /* renamed from: k */
    public final int mo6248k() {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        return paint.isFilterBitmap() ? 1 : 0;
    }

    /* renamed from: l */
    public final int mo6326l() {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : C1519f.f3293a[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: m */
    public final int mo6327m() {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : C1519f.f3294b[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    /* renamed from: n */
    public final float mo6328n() {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        return paint.getStrokeMiter();
    }

    /* renamed from: o */
    public final float mo6329o() {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        return paint.getStrokeWidth();
    }

    /* renamed from: p */
    public final void mo6330p(C18263b bVar) {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        paint.setPathEffect((PathEffect) null);
    }

    /* renamed from: q */
    public final void mo6331q(int i) {
        Paint.Cap cap;
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "$this$setNativeStrokeCap");
        boolean z = false;
        if (i == 2) {
            cap = Paint.Cap.SQUARE;
        } else {
            if (i == 1) {
                cap = Paint.Cap.ROUND;
            } else {
                if (i == 0) {
                    z = true;
                }
                cap = z ? Paint.Cap.BUTT : Paint.Cap.BUTT;
            }
        }
        paint.setStrokeCap(cap);
    }

    /* renamed from: r */
    public final void mo6332r(int i) {
        Paint.Join join;
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "$this$setNativeStrokeJoin");
        boolean z = false;
        if (i == 0) {
            join = Paint.Join.MITER;
        } else {
            if (i == 2) {
                join = Paint.Join.BEVEL;
            } else {
                if (i == 1) {
                    z = true;
                }
                join = z ? Paint.Join.ROUND : Paint.Join.MITER;
            }
        }
        paint.setStrokeJoin(join);
    }

    /* renamed from: s */
    public final void mo6333s(float f) {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public final void setAlpha(float f) {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        paint.setAlpha((int) ((float) Math.rint((double) (f * 255.0f))));
    }

    /* renamed from: t */
    public final void mo6334t(float f) {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    /* renamed from: u */
    public final void mo6335u(int i) {
        Paint paint = this.f3288a;
        C19383o.m32797g(paint, "$this$setNativeStyle");
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        paint.setStyle(z ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
