package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.text.ParseException;
import org.apache.commons.lang3.ClassUtils;
import p130h8.C6961b;

public class JWSObject extends C6240e {

    /* renamed from: a */
    private final C6245j f13622a;

    /* renamed from: b */
    private final String f13623b;

    /* renamed from: c */
    private Base64URL f13624c;

    /* renamed from: d */
    private C6234a f13625d;

    /* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWSObject$a */
    public enum C6234a {
        UNSIGNED,
        SIGNED,
        VERIFIED
    }

    public JWSObject(Base64URL base64URL, Payload payload, Base64URL base64URL2) {
        String str;
        StringBuilder sb;
        if (base64URL != null) {
            try {
                C6245j a = C6245j.m12499a(base64URL);
                this.f13622a = a;
                if (payload != null) {
                    mo17713a(payload);
                    if (a.mo17721h()) {
                        sb = new StringBuilder();
                        sb.append(mo17694c().mo17710e().toString());
                        sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                        str = mo17712a().mo17699b().toString();
                    } else {
                        sb = new StringBuilder();
                        sb.append(mo17694c().mo17710e().toString());
                        sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
                        str = mo17712a().toString();
                    }
                    sb.append(str);
                    this.f13623b = sb.toString();
                    if (base64URL2 != null) {
                        this.f13624c = base64URL2;
                        this.f13625d = C6234a.SIGNED;
                        if (mo17694c().mo17721h()) {
                            mo17714a(base64URL, payload.mo17699b(), base64URL2);
                            return;
                        }
                        mo17714a(base64URL, new Base64URL(""), base64URL2);
                        return;
                    }
                    throw new IllegalArgumentException("The third part must not be null");
                }
                throw new IllegalArgumentException("The payload (second part) must not be null");
            } catch (ParseException e) {
                StringBuilder h = C0072d.m201h("Invalid JWS header: ");
                h.append(e.getMessage());
                throw new ParseException(h.toString(), 0);
            }
        } else {
            throw new IllegalArgumentException("The first part must not be null");
        }
    }

    public JWSObject(Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
        this(base64URL, new Payload(base64URL2), base64URL3);
    }

    /* renamed from: b */
    public static JWSObject m12473b(String str) {
        Base64URL[] a = C6240e.m12492a(str);
        if (a.length == 3) {
            return new JWSObject(a[0], a[1], a[2]);
        }
        throw new ParseException("Unexpected number of Base64URL parts, must be three", 0);
    }

    /* renamed from: a */
    public String mo17692a(boolean z) {
        StringBuilder sb;
        C6234a aVar = this.f13625d;
        if (aVar == C6234a.SIGNED || aVar == C6234a.VERIFIED) {
            if (z) {
                sb = new StringBuilder();
                sb.append(this.f13622a.mo17710e().toString());
                sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            } else {
                sb = new StringBuilder();
                sb.append(this.f13623b);
            }
            sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            sb.append(this.f13624c.toString());
            return sb.toString();
        }
        throw new IllegalStateException("The JWS object must be in a signed or verified state");
    }

    /* renamed from: c */
    public C6245j mo17694c() {
        return this.f13622a;
    }

    /* renamed from: d */
    public byte[] mo17695d() {
        return this.f13623b.getBytes(C6961b.f15443a);
    }

    /* renamed from: e */
    public Base64URL mo17696e() {
        return this.f13624c;
    }

    /* renamed from: f */
    public String mo17697f() {
        return mo17692a(false);
    }

    /* renamed from: a */
    public synchronized boolean mo17693a(C6243h hVar) {
        boolean a;
        C6234a aVar = this.f13625d;
        if (aVar != C6234a.SIGNED) {
            if (aVar != C6234a.VERIFIED) {
                throw new IllegalStateException("The JWS object must be in a signed or verified state");
            }
        }
        try {
            a = hVar.mo17719a(mo17694c(), mo17695d(), mo17696e());
            if (a) {
                this.f13625d = C6234a.VERIFIED;
            }
        } catch (JOSEException e) {
            throw e;
        } catch (Exception e2) {
            throw new JOSEException(e2.getMessage(), e2);
        }
        return a;
    }
}
