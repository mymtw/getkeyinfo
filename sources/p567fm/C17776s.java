package p567fm;

import java.security.SecureRandom;

/* renamed from: fm.s */
public final class C17776s {

    /* renamed from: a */
    public static final C17777a f38627a = new C17777a();

    /* renamed from: fm.s$a */
    public class C17777a extends ThreadLocal<SecureRandom> {
        public final Object initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    /* renamed from: a */
    public static byte[] m29816a(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) f38627a.get()).nextBytes(bArr);
        return bArr;
    }
}
