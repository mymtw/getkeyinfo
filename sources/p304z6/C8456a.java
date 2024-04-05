package p304z6;

import com.cardinalcommerce.dependencies.internal.bouncycastle.p050b.p052b.C6158a;
import java.security.Provider;
import java.security.Security;

/* renamed from: z6.a */
public final class C8456a implements C8457b {

    /* renamed from: b */
    public static volatile C6158a f18480b;

    /* renamed from: a */
    public final Provider f18481a;

    public C8456a() {
        Provider provider;
        synchronized (C8456a.class) {
            if (Security.getProvider("BC") != null) {
                provider = Security.getProvider("BC");
            } else {
                if (f18480b == null) {
                    f18480b = new C6158a();
                }
                provider = f18480b;
            }
        }
        this.f18481a = provider;
    }
}
