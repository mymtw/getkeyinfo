package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Objects;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.e */
public final class C6248e implements Serializable {

    /* renamed from: a */
    public static final C6248e f13701a = new C6248e("sig");

    /* renamed from: b */
    public static final C6248e f13702b = new C6248e("enc");

    /* renamed from: c */
    private final String f13703c;

    public C6248e(String str) {
        if (str != null) {
            this.f13703c = str;
            return;
        }
        throw new IllegalArgumentException("The key use identifier must not be null");
    }

    /* renamed from: a */
    public static C6248e m12530a(String str) {
        if (str == null) {
            return null;
        }
        C6248e eVar = f13701a;
        if (str.equals(eVar.mo17742a())) {
            return eVar;
        }
        C6248e eVar2 = f13702b;
        if (str.equals(eVar2.mo17742a())) {
            return eVar2;
        }
        if (!str.trim().isEmpty()) {
            return new C6248e(str);
        }
        throw new ParseException("JWK use value must not be empty or blank", 0);
    }

    /* renamed from: a */
    public String mo17742a() {
        return this.f13703c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6248e)) {
            return false;
        }
        return Objects.equals(this.f13703c, ((C6248e) obj).f13703c);
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f13703c});
    }

    public String toString() {
        return mo17742a();
    }
}
