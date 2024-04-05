package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import javax.crypto.BadPaddingException;

class BaseCipherSpi$1 extends InvalidKeyException {

    /* renamed from: a */
    public final /* synthetic */ BadPaddingException f13392a;

    /* renamed from: b */
    public final /* synthetic */ C6169b f13393b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseCipherSpi$1(C6169b bVar, String str, BadPaddingException badPaddingException) {
        super(str);
        this.f13392a = badPaddingException;
    }

    public synchronized Throwable getCause() {
        return this.f13392a;
    }
}
