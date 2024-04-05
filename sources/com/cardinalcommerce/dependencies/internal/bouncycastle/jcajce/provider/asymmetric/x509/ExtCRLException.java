package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CRLException;

class ExtCRLException extends CRLException {

    /* renamed from: a */
    public Throwable f13398a;

    public ExtCRLException(String str, Throwable th) {
        super(str);
        this.f13398a = th;
    }

    public Throwable getCause() {
        return this.f13398a;
    }
}
