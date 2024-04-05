package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
import org.apache.commons.lang3.ClassUtils;
import p095e8.C6756a;
import p106f8.C6812c;
import p142i8.C6998a;

public class JWEObject extends C6240e {

    /* renamed from: a */
    private JWEHeader f13602a;

    /* renamed from: b */
    private Base64URL f13603b;

    /* renamed from: c */
    private Base64URL f13604c;

    /* renamed from: d */
    private Base64URL f13605d;

    /* renamed from: e */
    private Base64URL f13606e;

    /* renamed from: f */
    private C6233a f13607f;

    /* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEObject$a */
    public enum C6233a {
        UNENCRYPTED,
        ENCRYPTED,
        DECRYPTED
    }

    public JWEObject(JWEHeader jWEHeader, Payload payload) {
        if (jWEHeader != null) {
            this.f13602a = jWEHeader;
            if (payload != null) {
                mo17713a(payload);
                this.f13603b = null;
                this.f13605d = null;
                this.f13607f = C6233a.UNENCRYPTED;
                return;
            }
            throw new IllegalArgumentException("The payload must not be null");
        }
        throw new IllegalArgumentException("The JWE header must not be null");
    }

    public JWEObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3, Base64URL base64URL4, Base64URL base64URL5) {
        if (base64URL != null) {
            try {
                this.f13602a = JWEHeader.m12453a(base64URL);
                if (base64URL2 == null || base64URL2.toString().isEmpty()) {
                    this.f13603b = null;
                } else {
                    this.f13603b = base64URL2;
                }
                if (base64URL3 == null || base64URL3.toString().isEmpty()) {
                    this.f13604c = null;
                } else {
                    this.f13604c = base64URL3;
                }
                if (base64URL4 != null) {
                    this.f13605d = base64URL4;
                    if (base64URL5 == null || base64URL5.toString().isEmpty()) {
                        this.f13606e = null;
                    } else {
                        this.f13606e = base64URL5;
                    }
                    this.f13607f = C6233a.ENCRYPTED;
                    mo17714a(base64URL, base64URL2, base64URL3, base64URL4, base64URL5);
                    return;
                }
                throw new IllegalArgumentException("The fourth part must not be null");
            } catch (ParseException e) {
                StringBuilder h = C0072d.m201h("Invalid JWE header: ");
                h.append(e.getMessage());
                throw new ParseException(h.toString(), 0);
            }
        } else {
            throw new IllegalArgumentException("The first part must not be null");
        }
    }

    /* renamed from: b */
    public static JWEObject m12462b(String str) {
        Base64URL[] a = C6240e.m12492a(str);
        if (a.length == 5) {
            return new JWEObject(a[0], a[1], a[2], a[3], a[4]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
    }

    /* renamed from: a */
    public synchronized void mo17683a(C6244i iVar) {
        if (this.f13607f == C6233a.ENCRYPTED) {
            try {
                mo17713a(new Payload(((C6756a) iVar).mo18907a(mo17685c(), mo17687d(), mo17688e(), mo17689f(), mo17690g())));
                this.f13607f = C6233a.DECRYPTED;
            } catch (JOSEException e) {
                throw e;
            } catch (Exception e2) {
                throw new JOSEException(e2.getMessage(), e2);
            }
        } else {
            throw new IllegalStateException("The JWE object must be in an encrypted state");
        }
    }

    /* renamed from: c */
    public JWEHeader mo17685c() {
        return this.f13602a;
    }

    /* renamed from: c */
    public final void mo17686c(C6253k kVar) {
        if (((C6812c) kVar).f14993a.contains(mo17685c().mo17679c())) {
            C6812c cVar = (C6812c) kVar;
            if (!cVar.f14994b.contains(mo17685c().mo17681h())) {
                StringBuilder h = C0072d.m201h("The \"");
                h.append(mo17685c().mo17681h());
                h.append("\" encryption method or key size is not supported by the JWE encrypter: Supported methods: ");
                h.append(cVar.f14994b);
                throw new JOSEException(h.toString());
            }
            return;
        }
        StringBuilder h2 = C0072d.m201h("The \"");
        h2.append(mo17685c().mo17679c());
        h2.append("\" algorithm is not supported by the JWE encrypter: Supported algorithms: ");
        h2.append(((C6812c) kVar).f14993a);
        throw new JOSEException(h2.toString());
    }

    /* renamed from: d */
    public Base64URL mo17687d() {
        return this.f13603b;
    }

    /* renamed from: e */
    public Base64URL mo17688e() {
        return this.f13604c;
    }

    /* renamed from: f */
    public Base64URL mo17689f() {
        return this.f13605d;
    }

    /* renamed from: g */
    public Base64URL mo17690g() {
        return this.f13606e;
    }

    /* renamed from: h */
    public String mo17691h() {
        C6233a aVar = this.f13607f;
        if (aVar == C6233a.ENCRYPTED || aVar == C6233a.DECRYPTED) {
            StringBuilder sb = new StringBuilder(this.f13602a.mo17710e().toString());
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            Base64URL base64URL = this.f13603b;
            if (base64URL != null) {
                sb.append(base64URL.toString());
            }
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            Base64URL base64URL2 = this.f13604c;
            if (base64URL2 != null) {
                sb.append(base64URL2.toString());
            }
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            sb.append(this.f13605d.toString());
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            Base64URL base64URL3 = this.f13606e;
            if (base64URL3 != null) {
                sb.append(base64URL3.toString());
            }
            return sb.toString();
        }
        throw new IllegalStateException("The JWE object must be in an encrypted or decrypted state");
    }

    /* renamed from: a */
    public synchronized void mo17684a(C6253k kVar) {
        try {
            if (this.f13607f == C6233a.UNENCRYPTED) {
                mo17686c(kVar);
                C6242g a = ((C6998a) kVar).mo19181a(mo17685c(), mo17712a().mo17698a());
                JWEHeader jWEHeader = a.f13660a;
                if (jWEHeader != null) {
                    this.f13602a = jWEHeader;
                }
                this.f13603b = null;
                this.f13604c = a.f13661b;
                this.f13605d = a.f13662c;
                this.f13606e = a.f13663d;
                this.f13607f = C6233a.ENCRYPTED;
            } else {
                throw new IllegalStateException("The JWE object must be in an unencrypted state");
            }
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        } catch (Throwable th) {
            throw th;
        }
    }
}
