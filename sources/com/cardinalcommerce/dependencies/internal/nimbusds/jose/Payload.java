package com.cardinalcommerce.dependencies.internal.nimbusds.jose;

import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.util.Base64URL;
import com.cardinalcommerce.dependencies.internal.nimbusds.jwt.C6259b;
import java.io.Serializable;
import p130h8.C6961b;

public final class Payload implements Serializable {

    /* renamed from: a */
    private final C6235a f13628a;

    /* renamed from: b */
    private final JSONObject f13629b;

    /* renamed from: c */
    private final String f13630c;

    /* renamed from: d */
    private final byte[] f13631d;

    /* renamed from: e */
    private final Base64URL f13632e;

    /* renamed from: f */
    private final JWSObject f13633f;

    /* renamed from: g */
    private final C6259b f13634g;

    /* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.Payload$a */
    public enum C6235a {
        JSON,
        STRING,
        BYTE_ARRAY,
        BASE64URL,
        JWS_OBJECT,
        SIGNED_JWT
    }

    public Payload(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f13629b = jSONObject;
            this.f13630c = null;
            this.f13631d = null;
            this.f13632e = null;
            this.f13633f = null;
            this.f13634g = null;
            this.f13628a = C6235a.JSON;
            return;
        }
        throw new IllegalArgumentException("The JSON object must not be null");
    }

    public Payload(Base64URL base64URL) {
        if (base64URL != null) {
            this.f13629b = null;
            this.f13630c = null;
            this.f13631d = null;
            this.f13632e = base64URL;
            this.f13633f = null;
            this.f13634g = null;
            this.f13628a = C6235a.BASE64URL;
            return;
        }
        throw new IllegalArgumentException("The Base64URL-encoded object must not be null");
    }

    public Payload(String str) {
        if (str != null) {
            this.f13629b = null;
            this.f13630c = str;
            this.f13631d = null;
            this.f13632e = null;
            this.f13633f = null;
            this.f13634g = null;
            this.f13628a = C6235a.STRING;
            return;
        }
        throw new IllegalArgumentException("The string must not be null");
    }

    public Payload(byte[] bArr) {
        if (bArr != null) {
            this.f13629b = null;
            this.f13630c = null;
            this.f13631d = bArr;
            this.f13632e = null;
            this.f13633f = null;
            this.f13634g = null;
            this.f13628a = C6235a.BYTE_ARRAY;
            return;
        }
        throw new IllegalArgumentException("The byte array must not be null");
    }

    /* renamed from: a */
    public byte[] mo17698a() {
        byte[] bArr = this.f13631d;
        if (bArr != null) {
            return bArr;
        }
        Base64URL base64URL = this.f13632e;
        if (base64URL != null) {
            return base64URL.mo17747a();
        }
        String payload = toString();
        if (payload != null) {
            return payload.getBytes(C6961b.f15443a);
        }
        return null;
    }

    /* renamed from: b */
    public Base64URL mo17699b() {
        Base64URL base64URL = this.f13632e;
        return base64URL != null ? base64URL : Base64URL.m12549a(mo17698a());
    }

    public String toString() {
        String str = this.f13630c;
        if (str != null) {
            return str;
        }
        JWSObject jWSObject = this.f13633f;
        if (jWSObject != null) {
            return jWSObject.mo17715b() != null ? this.f13633f.mo17715b() : this.f13633f.mo17697f();
        }
        JSONObject jSONObject = this.f13629b;
        if (jSONObject != null) {
            return jSONObject.toString();
        }
        byte[] bArr = this.f13631d;
        if (bArr == null) {
            Base64URL base64URL = this.f13632e;
            if (base64URL != null) {
                return base64URL.mo17749c();
            }
            return null;
        } else if (bArr != null) {
            return new String(bArr, C6961b.f15443a);
        } else {
            return null;
        }
    }
}
