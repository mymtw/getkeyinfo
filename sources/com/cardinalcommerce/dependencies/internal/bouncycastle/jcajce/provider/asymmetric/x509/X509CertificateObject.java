package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.x509;

import com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.util.C6172e;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import p161k6.C7200c;
import p161k6.C7201d;
import p161k6.C7203f;
import p180m6.C7338b;
import p267v7.C8217e;
import p276w7.C8260c;
import p304z6.C8457b;

class X509CertificateObject extends X509Certificate implements C7338b {

    /* renamed from: a */
    private C8457b f13402a;

    /* renamed from: b */
    private C7201d f13403b;

    /* renamed from: c */
    private C7200c f13404c;

    /* renamed from: d */
    private boolean[] f13405d;

    /* renamed from: e */
    private boolean f13406e;

    /* renamed from: f */
    private int f13407f;

    /* renamed from: g */
    private C7338b f13408g = new C6172e();

    public X509CertificateObject(C8457b bVar, C7201d dVar) {
        this.f13402a = bVar;
        try {
            throw null;
        } catch (Exception e) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e);
        }
    }

    public void checkValidity() {
        checkValidity(new Date());
    }

    public void checkValidity(Date date) {
        if (date.getTime() > getNotAfter().getTime()) {
            new StringBuilder().append("certificate expired on ");
            throw null;
        } else if (date.getTime() < getNotBefore().getTime()) {
            new StringBuilder().append("certificate not valid till ");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CertificateObject)) {
            return super.equals(obj);
        }
        X509CertificateObject x509CertificateObject = (X509CertificateObject) obj;
        if (this.f13406e && x509CertificateObject.f13406e && this.f13407f != x509CertificateObject.f13407f) {
            return false;
        }
        x509CertificateObject.getClass();
        throw null;
    }

    public int getBasicConstraints() {
        C7200c cVar = this.f13404c;
        if (cVar == null) {
            return -1;
        }
        cVar.getClass();
        return -1;
    }

    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        new HashSet();
        throw null;
    }

    public byte[] getEncoded() {
        throw null;
    }

    public List getExtendedKeyUsage() {
        throw null;
    }

    public byte[] getExtensionValue(String str) {
        throw null;
    }

    public Collection getIssuerAlternativeNames() {
        String str = C7203f.f15989c.f17434b;
        throw null;
    }

    public Principal getIssuerDN() {
        try {
            throw null;
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean[] getIssuerUniqueID() {
        throw null;
    }

    public X500Principal getIssuerX500Principal() {
        try {
            new ByteArrayOutputStream();
            throw null;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public boolean[] getKeyUsage() {
        return this.f13405d;
    }

    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        new HashSet();
        throw null;
    }

    public Date getNotAfter() {
        throw null;
    }

    public Date getNotBefore() {
        throw null;
    }

    public PublicKey getPublicKey() {
        throw null;
    }

    public BigInteger getSerialNumber() {
        throw null;
    }

    public String getSigAlgName() {
        throw null;
    }

    public String getSigAlgOID() {
        throw null;
    }

    public byte[] getSigAlgParams() {
        throw null;
    }

    public byte[] getSignature() {
        throw null;
    }

    public Collection getSubjectAlternativeNames() {
        String str = C7203f.f15988b.f17434b;
        throw null;
    }

    public Principal getSubjectDN() {
        throw null;
    }

    public boolean[] getSubjectUniqueID() {
        throw null;
    }

    public X500Principal getSubjectX500Principal() {
        try {
            new ByteArrayOutputStream();
            throw null;
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public byte[] getTBSCertificate() {
        throw null;
    }

    public int getVersion() {
        throw null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        if (getVersion() != 3) {
            return false;
        }
        throw null;
    }

    public synchronized int hashCode() {
        if (!this.f13406e) {
            this.f13407f = super.hashCode();
            this.f13406e = true;
        }
        return this.f13407f;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        String str = C8217e.f18044a;
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(str);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(str);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(str);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(str);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(str);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(str);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(str);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(str);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(C8260c.m16546b(0, 20, signature)));
        stringBuffer.append(str);
        int i = 20;
        while (i < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i < length ? new String(C8260c.m16546b(i, 20, signature)) : new String(C8260c.m16546b(i, signature.length - i, signature)));
            stringBuffer.append(str);
            i += 20;
        }
        throw null;
    }

    public final void verify(PublicKey publicKey) {
        throw null;
    }

    public final void verify(PublicKey publicKey, String str) {
        throw null;
    }

    public final void verify(PublicKey publicKey, Provider provider) {
        throw null;
    }
}
