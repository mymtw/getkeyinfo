package p168l4;

import androidx.activity.C0114h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p036c5.C4422i;
import p036c5.C4426l;
import p080d5.C6652a;
import p080d5.C6660d;
import p150j4.C7109b;

/* renamed from: l4.k */
public final class C7262k {

    /* renamed from: a */
    public final C4422i<C7109b, String> f16118a = new C4422i<>(1000);

    /* renamed from: b */
    public final C6652a.C6655c f16119b = C6652a.m13024a(10, new C7263a());

    /* renamed from: l4.k$a */
    public class C7263a implements C6652a.C6654b<C7264b> {
        public final Object create() {
            try {
                return new C7264b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: l4.k$b */
    public static final class C7264b implements C6652a.C6656d {

        /* renamed from: b */
        public final MessageDigest f16120b;

        /* renamed from: c */
        public final C6660d.C6661a f16121c = new C6660d.C6661a();

        public C7264b(MessageDigest messageDigest) {
            this.f16120b = messageDigest;
        }

        /* renamed from: c */
        public final C6660d.C6661a mo16872c() {
            return this.f16121c;
        }
    }

    /* renamed from: a */
    public final String mo19521a(C7109b bVar) {
        String a;
        synchronized (this.f16118a) {
            a = this.f16118a.mo14373a(bVar);
        }
        if (a == null) {
            Object b = this.f16119b.mo18807b();
            C0114h.m281L(b);
            C7264b bVar2 = (C7264b) b;
            try {
                bVar.mo12991b(bVar2.f16120b);
                byte[] digest = bVar2.f16120b.digest();
                char[] cArr = C4426l.f9711b;
                synchronized (cArr) {
                    for (int i = 0; i < digest.length; i++) {
                        byte b2 = digest[i] & 255;
                        int i2 = i * 2;
                        char[] cArr2 = C4426l.f9710a;
                        cArr[i2] = cArr2[b2 >>> 4];
                        cArr[i2 + 1] = cArr2[b2 & 15];
                    }
                    a = new String(cArr);
                }
                this.f16119b.mo18806a(bVar2);
            } catch (Throwable th) {
                this.f16119b.mo18806a(bVar2);
                throw th;
            }
        }
        synchronized (this.f16118a) {
            this.f16118a.mo14376d(bVar, a);
        }
        return a;
    }
}
