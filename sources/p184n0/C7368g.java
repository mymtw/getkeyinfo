package p184n0;

/* renamed from: n0.g */
public final class C7368g {

    /* renamed from: a */
    public float f16424a;

    /* renamed from: b */
    public float f16425b;

    /* renamed from: c */
    public float f16426c;

    /* renamed from: d */
    public float f16427d;

    /* renamed from: e */
    public float f16428e;

    /* renamed from: f */
    public float f16429f;

    /* renamed from: a */
    public final void mo19664a(float f, float f2, int i, int i2, float[] fArr) {
        int i3 = i;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = (f - 0.5f) * 2.0f;
        float f6 = (f2 - 0.5f) * 2.0f;
        float f7 = f3 + this.f16426c;
        float f8 = f4 + this.f16427d;
        float f9 = (this.f16424a * f5) + f7;
        float f10 = (this.f16425b * f6) + f8;
        float radians = (float) Math.toRadians((double) this.f16429f);
        float radians2 = (float) Math.toRadians((double) this.f16428e);
        double d = (double) radians;
        double sin = Math.sin(d);
        double d2 = (double) (((float) i2) * f6);
        double cos = Math.cos(d);
        fArr[0] = (((float) ((sin * ((double) (((float) (-i3)) * f5))) - (Math.cos(d) * d2))) * radians2) + f9;
        fArr[1] = (radians2 * ((float) ((cos * ((double) (((float) i3) * f5))) - (Math.sin(d) * d2)))) + f10;
    }
}
