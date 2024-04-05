package p181m7;

import com.google.android.play.core.appupdate.C15567i;
import p244t5.C7964b0;
import p244t5.C7976f0;
import p244t5.C7999m1;
import p244t5.C8005o1;
import p244t5.C8018s1;
import p267v7.C8212a;

/* renamed from: m7.l */
public final class C7350l extends C8005o1 {

    /* renamed from: b */
    public final byte[] f16360b;

    /* renamed from: c */
    public final byte[] f16361c;

    public C7350l(byte[] bArr, byte[] bArr2) {
        this.f16360b = C8212a.m16504k(bArr);
        this.f16361c = C8212a.m16504k(bArr2);
    }

    /* renamed from: i */
    public final C8018s1 mo12996i() {
        C15567i iVar = new C15567i(2);
        iVar.mo55343b(new C7999m1(0));
        iVar.mo55343b(new C7964b0(this.f16360b));
        iVar.mo55343b(new C7964b0(this.f16361c));
        return new C7976f0(iVar);
    }
}
