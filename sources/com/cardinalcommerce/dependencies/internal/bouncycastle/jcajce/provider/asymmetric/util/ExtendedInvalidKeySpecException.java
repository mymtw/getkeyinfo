package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.spec.InvalidKeySpecException;

public class ExtendedInvalidKeySpecException extends InvalidKeySpecException {

    /* renamed from: a */
    private Throwable f13394a;

    public ExtendedInvalidKeySpecException(String str, Throwable th) {
        super(str);
        this.f13394a = th;
    }

    public Throwable getCause() {
        return this.f13394a;
    }
}
