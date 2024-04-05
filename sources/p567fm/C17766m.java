package p567fm;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import p567fm.C17767n;

/* renamed from: fm.m */
public final class C17766m<T_WRAPPER extends C17767n<T_ENGINE>, T_ENGINE> {

    /* renamed from: c */
    public static final Logger f38610c = Logger.getLogger(C17766m.class.getName());

    /* renamed from: d */
    public static final ArrayList f38611d;

    /* renamed from: e */
    public static final C17766m<C17767n.C17768a, Cipher> f38612e = new C17766m<>(new C17767n.C17768a());

    /* renamed from: f */
    public static final C17766m<C17767n.C17770c, Mac> f38613f = new C17766m<>(new C17767n.C17770c());

    /* renamed from: g */
    public static final C17766m<C17767n.C17769b, KeyFactory> f38614g = new C17766m<>(new C17767n.C17769b());

    /* renamed from: a */
    public T_WRAPPER f38615a;

    /* renamed from: b */
    public List<Provider> f38616b = f38611d;

    static {
        boolean z;
        try {
            Class.forName("android.app.Application", false, (ClassLoader) null);
            z = true;
        } catch (Exception unused) {
            z = false;
        }
        if (z) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f38610c.info(String.format("Provider %s not available", new Object[]{str}));
                }
            }
            f38611d = arrayList;
        } else {
            f38611d = new ArrayList();
        }
    }

    public C17766m(T_WRAPPER t_wrapper) {
        this.f38615a = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE mo69010a(String str) throws GeneralSecurityException {
        Exception exc = null;
        for (Provider a : this.f38616b) {
            try {
                return this.f38615a.mo69011a(str, a);
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        return this.f38615a.mo69011a(str, (Provider) null);
    }
}
