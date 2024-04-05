package p214q3;

import android.graphics.PointF;
import android.support.p013v4.media.C0072d;
import android.view.animation.Interpolator;
import com.airbnb.lottie.C4828c;

/* renamed from: q3.a */
public class C7718a<T> {

    /* renamed from: a */
    public final C4828c f17113a;

    /* renamed from: b */
    public final T f17114b;

    /* renamed from: c */
    public T f17115c;

    /* renamed from: d */
    public final Interpolator f17116d;

    /* renamed from: e */
    public final float f17117e;

    /* renamed from: f */
    public Float f17118f;

    /* renamed from: g */
    public float f17119g;

    /* renamed from: h */
    public float f17120h;

    /* renamed from: i */
    public int f17121i;

    /* renamed from: j */
    public int f17122j;

    /* renamed from: k */
    public float f17123k;

    /* renamed from: l */
    public float f17124l;

    /* renamed from: m */
    public PointF f17125m;

    /* renamed from: n */
    public PointF f17126n;

    public C7718a(C4828c cVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.f17119g = -3987645.8f;
        this.f17120h = -3987645.8f;
        this.f17121i = 784923401;
        this.f17122j = 784923401;
        this.f17123k = Float.MIN_VALUE;
        this.f17124l = Float.MIN_VALUE;
        this.f17125m = null;
        this.f17126n = null;
        this.f17113a = cVar;
        this.f17114b = t;
        this.f17115c = t2;
        this.f17116d = interpolator;
        this.f17117e = f;
        this.f17118f = f2;
    }

    /* renamed from: a */
    public final float mo20189a() {
        if (this.f17113a == null) {
            return 1.0f;
        }
        if (this.f17124l == Float.MIN_VALUE) {
            if (this.f17118f == null) {
                this.f17124l = 1.0f;
            } else {
                float b = mo20190b();
                float floatValue = this.f17118f.floatValue() - this.f17117e;
                C4828c cVar = this.f17113a;
                this.f17124l = (floatValue / (cVar.f10852l - cVar.f10851k)) + b;
            }
        }
        return this.f17124l;
    }

    /* renamed from: b */
    public final float mo20190b() {
        C4828c cVar = this.f17113a;
        if (cVar == null) {
            return 0.0f;
        }
        if (this.f17123k == Float.MIN_VALUE) {
            float f = this.f17117e;
            float f2 = cVar.f10851k;
            this.f17123k = (f - f2) / (cVar.f10852l - f2);
        }
        return this.f17123k;
    }

    /* renamed from: c */
    public final boolean mo20191c() {
        return this.f17116d == null;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Keyframe{startValue=");
        h.append(this.f17114b);
        h.append(", endValue=");
        h.append(this.f17115c);
        h.append(", startFrame=");
        h.append(this.f17117e);
        h.append(", endFrame=");
        h.append(this.f17118f);
        h.append(", interpolator=");
        h.append(this.f17116d);
        h.append('}');
        return h.toString();
    }

    public C7718a(T t) {
        this.f17119g = -3987645.8f;
        this.f17120h = -3987645.8f;
        this.f17121i = 784923401;
        this.f17122j = 784923401;
        this.f17123k = Float.MIN_VALUE;
        this.f17124l = Float.MIN_VALUE;
        this.f17125m = null;
        this.f17126n = null;
        this.f17113a = null;
        this.f17114b = t;
        this.f17115c = t;
        this.f17116d = null;
        this.f17117e = Float.MIN_VALUE;
        this.f17118f = Float.valueOf(Float.MAX_VALUE);
    }
}
