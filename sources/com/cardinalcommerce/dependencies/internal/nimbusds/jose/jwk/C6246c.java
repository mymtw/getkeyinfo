package com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk;

import androidx.appcompat.widget.C0326j;
import java.text.ParseException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.c */
public enum C6246c {
    SIGN("sign"),
    VERIFY("verify"),
    ENCRYPT("encrypt"),
    DECRYPT("decrypt"),
    WRAP_KEY("wrapKey"),
    UNWRAP_KEY("unwrapKey"),
    DERIVE_KEY("deriveKey"),
    DERIVE_BITS("deriveBits");
    
    private final String identifier;

    private C6246c(String str) {
        if (str != null) {
            this.identifier = str;
            return;
        }
        throw new IllegalArgumentException("The key operation identifier must not be null");
    }

    /* renamed from: a */
    public static Set<C6246c> m12526a(List<String> list) {
        C6246c cVar;
        if (list == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String next : list) {
            if (next != null) {
                C6246c[] values = values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        cVar = null;
                        break;
                    }
                    cVar = values[i];
                    if (next.equals(cVar.mo17736a())) {
                        break;
                    }
                    i++;
                }
                if (cVar != null) {
                    linkedHashSet.add(cVar);
                } else {
                    throw new ParseException(C0326j.m864i("Invalid JWK operation: ", next), 0);
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: a */
    public String mo17736a() {
        return this.identifier;
    }

    public String toString() {
        return mo17736a();
    }
}
