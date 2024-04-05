package p508am;

import android.security.keystore.KeyGenParameterSpec;
import com.paypal.android.platform.authsdk.authcommon.partnerauth.security.BaseSecureKeyWrapper;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import java.util.Locale;
import javax.crypto.KeyGenerator;
import p567fm.C17776s;
import p567fm.C17778t;
import p705wl.C18736h;

/* renamed from: am.c */
public final class C14033c implements C18736h {

    /* renamed from: b */
    public static final /* synthetic */ int f30888b = 0;

    /* renamed from: a */
    public KeyStore f30889a;

    /* renamed from: am.c$a */
    public static final class C14034a {

        /* renamed from: a */
        public KeyStore f30890a = null;

        public C14034a() {
            int i = C14033c.f30888b;
            try {
                KeyStore instance = KeyStore.getInstance(BaseSecureKeyWrapper.ANDROID_KEYSTORE);
                this.f30890a = instance;
                instance.load((KeyStore.LoadStoreParameter) null);
            } catch (IOException | GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C14033c() throws GeneralSecurityException {
        this(new C14034a());
    }

    /* renamed from: c */
    public static void m21607c(String str) throws GeneralSecurityException {
        if (!new C14033c().mo46859d(str)) {
            String b = C17778t.m29818b(str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", BaseSecureKeyWrapper.ANDROID_KEYSTORE);
            instance.init(new KeyGenParameterSpec.Builder(b, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
            instance.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
    }

    /* renamed from: a */
    public final synchronized boolean mo46857a(String str) {
        return str.toLowerCase(Locale.US).startsWith("android-keystore://");
    }

    /* renamed from: b */
    public final synchronized C14032b mo46858b(String str) throws GeneralSecurityException {
        C14032b bVar;
        bVar = new C14032b(C17778t.m29818b(str), this.f30889a);
        byte[] a = C17776s.m29816a(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(a, bVar.mo46854b(bVar.mo46853a(a, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return bVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0025 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo46859d(java.lang.String r3) throws java.security.GeneralSecurityException {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r3 = p567fm.C17778t.m29818b(r3)     // Catch:{ all -> 0x0034 }
            java.security.KeyStore r0 = r2.f30889a     // Catch:{ NullPointerException -> 0x000d }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ NullPointerException -> 0x000d }
            monitor-exit(r2)
            return r3
        L_0x000d:
            java.lang.String r0 = "c"
            java.lang.String r1 = "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again."
            android.util.Log.w(r0, r1)     // Catch:{ all -> 0x0034 }
            r0 = 20
            java.lang.Thread.sleep(r0)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            java.lang.String r0 = "AndroidKeyStore"
            java.security.KeyStore r0 = java.security.KeyStore.getInstance(r0)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            r2.f30889a = r0     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
            r1 = 0
            r0.load(r1)     // Catch:{ IOException -> 0x002d, InterruptedException -> 0x0025 }
        L_0x0025:
            java.security.KeyStore r0 = r2.f30889a     // Catch:{ all -> 0x0034 }
            boolean r3 = r0.containsAlias(r3)     // Catch:{ all -> 0x0034 }
            monitor-exit(r2)
            return r3
        L_0x002d:
            r3 = move-exception
            java.security.GeneralSecurityException r0 = new java.security.GeneralSecurityException     // Catch:{ all -> 0x0034 }
            r0.<init>(r3)     // Catch:{ all -> 0x0034 }
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p508am.C14033c.mo46859d(java.lang.String):boolean");
    }

    public C14033c(C14034a aVar) {
        this.f30889a = aVar.f30890a;
    }
}
