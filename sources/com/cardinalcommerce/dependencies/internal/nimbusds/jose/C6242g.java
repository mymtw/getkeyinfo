package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.g */
public final class C6242g {

    /* renamed from: a */
    public final JWEHeader f13660a;

    /* renamed from: b */
    public final Base64URL f13661b;

    /* renamed from: c */
    public final Base64URL f13662c;

    /* renamed from: d */
    public final Base64URL f13663d;

    public C6242g(JWEHeader jWEHeader, Base64URL base64URL, Base64URL base64URL2, Base64URL base64URL3) {
        this.f13660a = jWEHeader;
        this.f13661b = base64URL;
        if (base64URL2 != null) {
            this.f13662c = base64URL2;
            this.f13663d = base64URL3;
            return;
        }
        throw new IllegalArgumentException("The cipher text must not be null");
    }
}
