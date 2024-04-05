package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import java.security.spec.InvalidKeySpecException;

class KeyFactorySpi$1 extends InvalidKeySpecException {

    /* renamed from: a */
    public final /* synthetic */ Exception f13312a;

    /* renamed from: b */
    public final /* synthetic */ C6164b f13313b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyFactorySpi$1(C6164b bVar, String str, Exception exc) {
        super(str);
        this.f13312a = exc;
    }

    public Throwable getCause() {
        return this.f13312a;
    }
}
