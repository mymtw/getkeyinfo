package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import java.io.Serializable;
import java.text.ParseException;
import org.apache.commons.lang3.ClassUtils;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.e */
public abstract class C6240e implements Serializable {

    /* renamed from: a */
    private Payload f13654a = null;

    /* renamed from: b */
    private Base64URL[] f13655b = null;

    /* renamed from: a */
    public static Base64URL[] m12492a(String str) {
        String trim = str.trim();
        int indexOf = trim.indexOf(".");
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = trim.indexOf(".", i);
            if (indexOf2 != -1) {
                int i2 = indexOf2 + 1;
                int indexOf3 = trim.indexOf(".", i2);
                if (indexOf3 == -1) {
                    return new Base64URL[]{new Base64URL(trim.substring(0, indexOf)), new Base64URL(trim.substring(i, indexOf2)), new Base64URL(trim.substring(i2))};
                }
                int i3 = indexOf3 + 1;
                int indexOf4 = trim.indexOf(".", i3);
                if (indexOf4 == -1) {
                    throw new ParseException("Invalid serialized JWE object: Missing fourth delimiter", 0);
                } else if (indexOf4 == -1 || trim.indexOf(".", indexOf4 + 1) == -1) {
                    return new Base64URL[]{new Base64URL(trim.substring(0, indexOf)), new Base64URL(trim.substring(i, indexOf2)), new Base64URL(trim.substring(i2, indexOf3)), new Base64URL(trim.substring(i3, indexOf4)), new Base64URL(trim.substring(indexOf4 + 1))};
                } else {
                    throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Too many part delimiters", 0);
                }
            } else {
                throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing second delimiter", 0);
            }
        } else {
            throw new ParseException("Invalid serialized unsecured/JWS/JWE object: Missing part delimiters", 0);
        }
    }

    /* renamed from: a */
    public Payload mo17712a() {
        return this.f13654a;
    }

    /* renamed from: a */
    public void mo17713a(Payload payload) {
        this.f13654a = payload;
    }

    /* renamed from: a */
    public void mo17714a(Base64URL... base64URLArr) {
        this.f13655b = base64URLArr;
    }

    /* renamed from: b */
    public String mo17715b() {
        if (this.f13655b == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Base64URL base64URL : this.f13655b) {
            if (sb.length() > 0) {
                sb.append(ClassUtils.PACKAGE_SEPARATOR_CHAR);
            }
            if (base64URL != null) {
                sb.append(base64URL.toString());
            }
        }
        return sb.toString();
    }
}
