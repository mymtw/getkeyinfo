package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.dependencies.internal.minidev.json.JSONObject;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.C6255m;
import com.fasterxml.jackson.core.JsonFactory;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.io.Serializable;
import p305z7.C8458a;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.d */
public final class C6247d implements C8458a, Serializable {

    /* renamed from: a */
    public static final C6247d f13695a = new C6247d("EC", C6255m.RECOMMENDED);

    /* renamed from: b */
    public static final C6247d f13696b = new C6247d(BaseSecureKeyWrapper.RSA_ALGORITHM, C6255m.REQUIRED);

    /* renamed from: c */
    public static final C6247d f13697c;

    /* renamed from: d */
    public static final C6247d f13698d;

    /* renamed from: e */
    private final String f13699e;

    /* renamed from: f */
    private final C6255m f13700f;

    static {
        C6255m mVar = C6255m.OPTIONAL;
        f13697c = new C6247d("oct", mVar);
        f13698d = new C6247d("OKP", mVar);
    }

    public C6247d(String str, C6255m mVar) {
        if (str != null) {
            this.f13699e = str;
            this.f13700f = mVar;
            return;
        }
        throw new IllegalArgumentException("The key type value must not be null");
    }

    /* renamed from: a */
    public static C6247d m12528a(String str) {
        if (str != null) {
            C6247d dVar = f13695a;
            if (str.equals(dVar.mo17738a())) {
                return dVar;
            }
            C6247d dVar2 = f13696b;
            if (str.equals(dVar2.mo17738a())) {
                return dVar2;
            }
            C6247d dVar3 = f13697c;
            if (str.equals(dVar3.mo17738a())) {
                return dVar3;
            }
            C6247d dVar4 = f13698d;
            return str.equals(dVar4.mo17738a()) ? dVar4 : new C6247d(str, (C6255m) null);
        }
        throw new IllegalArgumentException("The key type to parse must not be null");
    }

    /* renamed from: a */
    public String mo17738a() {
        return this.f13699e;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof C6247d) && toString().equals(obj.toString());
    }

    public int hashCode() {
        return this.f13699e.hashCode();
    }

    public String toJSONString() {
        StringBuilder h = C0072d.m201h("\"");
        h.append(JSONObject.escape(this.f13699e));
        h.append(JsonFactory.DEFAULT_QUOTE_CHAR);
        return h.toString();
    }

    public String toString() {
        return this.f13699e;
    }
}
