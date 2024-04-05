package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ecgost;

import java.security.InvalidKeyException;

class KeyAgreementSpi$1 extends InvalidKeyException {

    /* renamed from: a */
    public final /* synthetic */ Exception f13348a;

    /* renamed from: b */
    public final /* synthetic */ C6166a f13349b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAgreementSpi$1(C6166a aVar, String str, Exception exc) {
        super(str);
        this.f13348a = exc;
    }

    public Throwable getCause() {
        return this.f13348a;
    }
}
