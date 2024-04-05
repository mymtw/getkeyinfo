package p179m5;

import androidx.work.C3436p;

/* renamed from: m5.f */
public final class C7334f extends C7330b {
    /* renamed from: a */
    public final String mo19523a() {
        return "SHA-384";
    }

    /* renamed from: b */
    public final int mo19524b() {
        return 48;
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
        mo19609h();
        return 48;
    }

    /* renamed from: h */
    public final void mo19609h() {
        super.mo19609h();
        this.f16253e = -3766243637369397544L;
        this.f16254f = 7105036623409894663L;
        this.f16255g = -7973340178411365097L;
        this.f16256h = 1526699215303891257L;
        this.f16257i = 7436329637833083697L;
        this.f16258j = -8163818279084223215L;
        this.f16259k = -2662702644619276377L;
        this.f16260l = 5167115440072839076L;
    }
}
