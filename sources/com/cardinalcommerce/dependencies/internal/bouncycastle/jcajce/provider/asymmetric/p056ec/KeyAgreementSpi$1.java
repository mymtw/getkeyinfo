package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.p056ec;

import java.security.InvalidKeyException;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.ec.KeyAgreementSpi$1 */
class KeyAgreementSpi$1 extends InvalidKeyException {

    /* renamed from: a */
    public final /* synthetic */ Exception f13335a;

    /* renamed from: b */
    public final /* synthetic */ C6165a f13336b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyAgreementSpi$1(C6165a aVar, String str, Exception exc) {
        super(str);
        this.f13335a = exc;
    }

    public Throwable getCause() {
        return this.f13335a;
    }
}
