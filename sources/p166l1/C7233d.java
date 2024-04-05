package p166l1;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import com.google.android.material.shadow.ShadowDrawableWrapper;
import p166l1.C7212a;

/* renamed from: l1.d */
public final class C7233d extends C7218b<C7233d> {

    /* renamed from: u */
    public C7234e f16039u = null;

    /* renamed from: v */
    public float f16040v = Float.MAX_VALUE;

    /* renamed from: w */
    public boolean f16041w = false;

    public <K> C7233d(K k, C7232c<K> cVar) {
        super(k, cVar);
    }

    /* renamed from: c */
    public final void mo19506c(float f) {
        if (this.f16031f) {
            this.f16040v = f;
            return;
        }
        if (this.f16039u == null) {
            this.f16039u = new C7234e(f);
        }
        C7234e eVar = this.f16039u;
        double d = (double) f;
        eVar.f16050i = d;
        double d2 = (double) ((float) d);
        if (d2 > ((double) Float.MAX_VALUE)) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        } else if (d2 >= ((double) this.f16032g)) {
            double abs = Math.abs((double) (this.f16034i * 0.75f));
            eVar.f16045d = abs;
            eVar.f16046e = abs * 62.5d;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                boolean z = this.f16031f;
                if (!z && !z) {
                    this.f16031f = true;
                    if (!this.f16028c) {
                        this.f16027b = this.f16030e.mo19502a(this.f16029d);
                    }
                    float f2 = this.f16027b;
                    if (f2 > Float.MAX_VALUE || f2 < this.f16032g) {
                        throw new IllegalArgumentException("Starting value need to be in between min value and max value");
                    }
                    ThreadLocal<C7212a> threadLocal = C7212a.f16005g;
                    if (threadLocal.get() == null) {
                        threadLocal.set(new C7212a());
                    }
                    C7212a aVar = threadLocal.get();
                    if (aVar.f16007b.size() == 0) {
                        if (aVar.f16009d == null) {
                            aVar.f16009d = new C7212a.C7216d(aVar.f16008c);
                        }
                        C7212a.C7216d dVar = aVar.f16009d;
                        dVar.f16014b.postFrameCallback(dVar.f16015c);
                    }
                    if (!aVar.f16007b.contains(this)) {
                        aVar.f16007b.add(this);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    /* renamed from: d */
    public final void mo19507d() {
        if (!(this.f16039u.f16043b > ShadowDrawableWrapper.COS_45)) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        } else if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        } else if (this.f16031f) {
            this.f16041w = true;
        }
    }
}
