package p170l6;

import java.io.IOException;
import java.security.Principal;
import p161k6.C7204g;

/* renamed from: l6.a */
public final class C7268a extends C7204g implements Principal {
    /* renamed from: c */
    public final byte[] mo19527c() {
        try {
            return mo20561a("DER");
        } catch (IOException e) {
            throw new RuntimeException(e.toString());
        }
    }

    public final String getName() {
        return toString();
    }
}
