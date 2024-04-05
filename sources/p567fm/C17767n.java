package p567fm;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: fm.n */
public interface C17767n<T> {

    /* renamed from: fm.n$a */
    public static class C17768a implements C17767n<Cipher> {
        /* renamed from: a */
        public final Object mo69011a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Cipher.getInstance(str) : Cipher.getInstance(str, provider);
        }
    }

    /* renamed from: fm.n$b */
    public static class C17769b implements C17767n<KeyFactory> {
        /* renamed from: a */
        public final Object mo69011a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
        }
    }

    /* renamed from: fm.n$c */
    public static class C17770c implements C17767n<Mac> {
        /* renamed from: a */
        public final Object mo69011a(String str, Provider provider) throws GeneralSecurityException {
            return provider == null ? Mac.getInstance(str) : Mac.getInstance(str, provider);
        }
    }

    /* renamed from: a */
    T mo69011a(String str, Provider provider) throws GeneralSecurityException;
}
