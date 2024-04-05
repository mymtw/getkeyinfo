package p179m5;

import androidx.work.C3436p;

/* renamed from: m5.g */
public final class C7335g extends C7330b {
    /* renamed from: a */
    public final String mo19523a() {
        return "SHA-512";
    }

    /* renamed from: b */
    public final int mo19524b() {
        return 64;
    }

    /* renamed from: c */
    public final int mo19526c(byte[] bArr) {
        mo19610i();
        C3436p.m8246h(this.f16253e, bArr, 0);
        C3436p.m8246h(this.f16254f, bArr, 8);
        C3436p.m8246h(this.f16255g, bArr, 16);
        C3436p.m8246h(this.f16256h, bArr, 24);
        C3436p.m8246h(this.f16257i, bArr, 32);
        C3436p.m8246h(this.f16258j, bArr, 40);
        C3436p.m8246h(this.f16259k, bArr, 48);
        C3436p.m8246h(this.f16260l, bArr, 56);
        mo19609h();
        return 64;
    }

    /* renamed from: h */
    public final void mo19609h() {
        super.mo19609h();
        this.f16253e = 7640891576956012808L;
        this.f16254f = -4942790177534073029L;
        this.f16255g = 4354685564936845355L;
        this.f16256h = -6534734903238641935L;
        this.f16257i = 5840696475078001361L;
        this.f16258j = -7276294671716946913L;
        this.f16259k = 2270897969802886507L;
        this.f16260l = 6620516959819538809L;
    }
}
