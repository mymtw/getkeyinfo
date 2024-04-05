package p244t5;

import java.io.InputStream;

/* renamed from: t5.c1 */
public abstract class C7968c1 extends InputStream {

    /* renamed from: b */
    public final InputStream f17449b;

    /* renamed from: c */
    public int f17450c;

    public C7968c1(InputStream inputStream, int i) {
        this.f17449b = inputStream;
        this.f17450c = i;
    }

    /* renamed from: a */
    public int mo20531a() {
        return this.f17450c;
    }

    /* renamed from: b */
    public final void mo20532b() {
        InputStream inputStream = this.f17449b;
        if (inputStream instanceof C8035y0) {
            C8035y0 y0Var = (C8035y0) inputStream;
            y0Var.f17523g = true;
            y0Var.mo20590d();
        }
    }
}
