package p713xl;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import p516bm.C14092a;
import p516bm.C14095b;
import p516bm.C14099c;
import p516bm.C14100d;
import p551dm.C17633h0;
import p705wl.C18745o;

/* renamed from: xl.a */
public final class C18788a {
    static {
        new C18791c();
        new C18800f();
        new C18803g();
        new C18797e();
        new C18809i();
        new C18813k();
        new C18806h();
        new C18816l();
        int i = C17633h0.CONFIG_NAME_FIELD_NUMBER;
        try {
            m31707a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    /* renamed from: a */
    public static void m31707a() throws GeneralSecurityException {
        boolean z;
        int i = C14099c.f31051a;
        C18745o.m31615e(new C14095b(), true);
        C18745o.m31615e(new C14092a(), true);
        C18745o.m31616f(new C14100d());
        C18745o.m31615e(new C18791c(), true);
        C18745o.m31615e(new C18797e(), true);
        C18745o.m31615e(new C18800f(), true);
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            z = true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            z = false;
        }
        if (z) {
            C18745o.m31615e(new C18803g(), true);
        }
        C18745o.m31615e(new C18806h(), true);
        C18745o.m31615e(new C18809i(), true);
        C18745o.m31615e(new C18813k(), true);
        C18745o.m31615e(new C18816l(), true);
        C18745o.m31616f(new C18789b());
    }
}
