package p597jl;

import android.graphics.RectF;

/* renamed from: jl.k */
public final class C18022k {

    /* renamed from: a */
    public static final C18023a f39428a = new C18023a();

    /* renamed from: b */
    public static final C18024b f39429b = new C18024b();

    /* renamed from: jl.k$a */
    public static class C18023a implements C18021j {
        /* renamed from: a */
        public final boolean mo69588a(C18025l lVar) {
            return lVar.f39433d > lVar.f39435f;
        }

        /* renamed from: b */
        public final C18025l mo69589b(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float c = C18035v.m30473c(f4, f6, f2, f3, f, true);
            float f8 = c / f4;
            float f9 = c / f6;
            return new C18025l(f8, f9, c, f5 * f8, c, f7 * f9);
        }

        /* renamed from: c */
        public final void mo69590c(RectF rectF, float f, C18025l lVar) {
            rectF.bottom -= Math.abs(lVar.f39435f - lVar.f39433d) * f;
        }
    }

    /* renamed from: jl.k$b */
    public static class C18024b implements C18021j {
        /* renamed from: a */
        public final boolean mo69588a(C18025l lVar) {
            return lVar.f39432c > lVar.f39434e;
        }

        /* renamed from: b */
        public final C18025l mo69589b(float f, float f2, float f3, float f4, float f5, float f6, float f7) {
            float c = C18035v.m30473c(f5, f7, f2, f3, f, true);
            float f8 = c / f5;
            float f9 = c / f7;
            return new C18025l(f8, f9, f4 * f8, c, f6 * f9, c);
        }

        /* renamed from: c */
        public final void mo69590c(RectF rectF, float f, C18025l lVar) {
            float abs = (Math.abs(lVar.f39434e - lVar.f39432c) / 2.0f) * f;
            rectF.left += abs;
            rectF.right -= abs;
        }
    }
}
