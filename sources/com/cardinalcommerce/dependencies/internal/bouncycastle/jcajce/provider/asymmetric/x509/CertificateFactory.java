package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import java.security.cert.CertificateException;
import java.security.cert.CertificateFactorySpi;

public final class CertificateFactory extends CertificateFactorySpi {

    public class ExCertificateException extends CertificateException {

        /* renamed from: a */
        public final /* synthetic */ CertificateFactory f13396a;

        /* renamed from: b */
        private Throwable f13397b;

        public ExCertificateException(CertificateFactory certificateFactory, String str, Throwable th) {
            super(str);
            this.f13397b = th;
        }

        public Throwable getCause() {
            return this.f13397b;
        }
    }
}
