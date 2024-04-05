package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost12;

import java.security.InvalidKeyException;

class KeyAgreementSpi$1 extends InvalidKeyException {

    /* renamed from: a */
    public final /* synthetic */ Exception f13361a;

    /* renamed from: b */
    public final /* synthetic */ C6167a f13362b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAgreementSpi$1(C6167a aVar, String str, Exception exc) {
        super(str);
        this.f13361a = exc;
    }

    public Throwable getCause() {
        return this.f13361a;
    }
}
