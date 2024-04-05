package p550dl;

import com.google.android.material.shape.C15408d;

/* renamed from: dl.f */
public final class C17580f extends C17579e {

    /* renamed from: b */
    public final float f38450b;

    public C17580f(float f) {
        this.f38450b = f - 0.001f;
    }

    /* renamed from: b */
    public final void mo53159b(float f, float f2, float f3, C15408d dVar) {
        float sqrt = (float) ((Math.sqrt(2.0d) * ((double) this.f38450b)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f38450b, 2.0d) - Math.pow((double) sqrt, 2.0d));
        dVar.mo54630e(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.f38450b)) - ((double) this.f38450b)))) + sqrt2, 270.0f, 0.0f);
        dVar.mo54629d(f2, (float) (-((Math.sqrt(2.0d) * ((double) this.f38450b)) - ((double) this.f38450b))));
        dVar.mo54629d(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.f38450b)) - ((double) this.f38450b)))) + sqrt2);
    }
}
