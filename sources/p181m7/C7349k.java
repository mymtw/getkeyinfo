package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7992k0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p267v7.C8212a;

/* renamed from: m7.k */
public final class C7349k extends C8005o1 {

    /* renamed from: b */
    public final int f16354b;

    /* renamed from: c */
    public final byte[] f16355c;

    /* renamed from: d */
    public final byte[] f16356d;

    /* renamed from: e */
    public final byte[] f16357e;

    /* renamed from: f */
    public final byte[] f16358f;

    /* renamed from: g */
    public final byte[] f16359g;

    public C7349k(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f16354b = i;
        this.f16355c = C8212a.m16504k(bArr);
        this.f16356d = C8212a.m16504k(bArr2);
        this.f16357e = C8212a.m16504k(bArr3);
        this.f16358f = C8212a.m16504k(bArr4);
        this.f16359g = C8212a.m16504k(bArr5);
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1(0));
        C15567i iVar2 = new C15567i(2);
        iVar2.mo55343b(new C7999m1((long) this.f16354b));
        iVar2.mo55343b(new C7964b0(this.f16355c));
        iVar2.mo55343b(new C7964b0(this.f16356d));
        iVar2.mo55343b(new C7964b0(this.f16357e));
        iVar2.mo55343b(new C7964b0(this.f16358f));
        iVar.mo55343b(new C7976f0(iVar2));
        iVar.mo55343b(new C7992k0(true, 0, new C7964b0(this.f16359g)));
        return new C7976f0(iVar);
    }
}
