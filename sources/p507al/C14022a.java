package p507al;

import android.graphics.Typeface;

/* renamed from: al.a */
public final class C14022a extends C14029f {

    /* renamed from: a */
    public final Typeface f30856a;

    /* renamed from: b */
    public final C14023a f30857b;

    /* renamed from: c */
    public boolean f30858c;

    /* renamed from: al.a$a */
    public interface C14023a {
        /* renamed from: a */
        void mo46842a(Typeface typeface);
    }

    public C14022a(C14023a aVar, Typeface typeface) {
        this.f30856a = typeface;
        this.f30857b = aVar;
    }

    /* renamed from: a */
    public final void mo46840a(int i) {
        Typeface typeface = this.f30856a;
        if (!this.f30858c) {
            this.f30857b.mo46842a(typeface);
        }
    }

    /* renamed from: b */
    public final void mo46841b(Typeface typeface, boolean z) {
        if (!this.f30858c) {
            this.f30857b.mo46842a(typeface);
        }
    }
}
