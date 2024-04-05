package p567fm;

import androidx.appcompat.widget.C0326j;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import p523cm.C14171a;

@Immutable
/* renamed from: fm.q */
public final class C17773q implements C14171a {

    /* renamed from: a */
    public final C17774a f38620a;

    /* renamed from: b */
    public final String f38621b;

    /* renamed from: c */
    public final Key f38622c;

    /* renamed from: d */
    public final int f38623d;

    /* renamed from: fm.q$a */
    public class C17774a extends ThreadLocal<Mac> {
        public C17774a() {
        }

        public final Object initialValue() {
            try {
                Mac a = C17766m.f38613f.mo69010a(C17773q.this.f38621b);
                a.init(C17773q.this.f38622c);
                return a;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
    }

    public C17773q(String str, SecretKeySpec secretKeySpec) throws GeneralSecurityException {
        C17774a aVar = new C17774a();
        this.f38620a = aVar;
        this.f38621b = str;
        this.f38622c = secretKeySpec;
        if (secretKeySpec.getEncoded().length >= 16) {
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1823053428:
                    if (str.equals("HMACSHA1")) {
                        c = 0;
                        break;
                    }
                    break;
                case 392315118:
                    if (str.equals("HMACSHA256")) {
                        c = 1;
                        break;
                    }
                    break;
                case 392316170:
                    if (str.equals("HMACSHA384")) {
                        c = 2;
                        break;
                    }
                    break;
                case 392317873:
                    if (str.equals("HMACSHA512")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f38623d = 20;
                    break;
                case 1:
                    this.f38623d = 32;
                    break;
                case 2:
                    this.f38623d = 48;
                    break;
                case 3:
                    this.f38623d = 64;
                    break;
                default:
                    throw new NoSuchAlgorithmException(C0326j.m864i("unknown Hmac algorithm: ", str));
            }
            aVar.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }

    /* renamed from: a */
    public final byte[] mo47113a(int i, byte[] bArr) throws GeneralSecurityException {
        if (i <= this.f38623d) {
            ((Mac) this.f38620a.get()).update(bArr);
            return Arrays.copyOf(((Mac) this.f38620a.get()).doFinal(), i);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
