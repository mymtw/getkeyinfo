package p106f8;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.crypto.SecretKey;

/* renamed from: f8.e */
public abstract class C6814e extends C6812c {

    /* renamed from: e */
    public static final Set<JWEAlgorithm> f14998e;

    /* renamed from: f */
    public static final Set<EncryptionMethod> f14999f = C6813d.f14996a;

    /* renamed from: d */
    public final SecretKey f15000d;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(JWEAlgorithm.f13581h);
        f14998e = Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6814e(javax.crypto.spec.SecretKeySpec r4) {
        /*
            r3 = this;
            java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm> r0 = f14998e
            byte[] r1 = r4.getEncoded()
            if (r1 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000d
        L_0x000a:
            int r1 = r1.length
            int r1 = r1 * 8
        L_0x000d:
            java.util.Map<java.lang.Integer, java.util.Set<com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod>> r2 = p106f8.C6813d.f14997b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r2.get(r1)
            java.util.Set r1 = (java.util.Set) r1
            if (r1 == 0) goto L_0x0021
            r3.<init>(r0, r1)
            r3.f15000d = r4
            return
        L_0x0021:
            com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException r4 = new com.cardinalcommerce.dependencies.internal.nimbusds.jose.KeyLengthException
            java.lang.String r0 = "The Content Encryption Key length must be 128 bits (16 bytes), 192 bits (24 bytes), 256 bits (32 bytes), 384 bits (48 bytes) or 512 bites (64 bytes)"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p106f8.C6814e.<init>(javax.crypto.spec.SecretKeySpec):void");
    }
}
