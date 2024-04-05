package p106f8;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.JWEAlgorithm;
import java.util.Collections;
import java.util.Set;
import p083d8.C6670a;

/* renamed from: f8.c */
public abstract class C6812c {

    /* renamed from: a */
    public final Set<JWEAlgorithm> f14993a;

    /* renamed from: b */
    public final Set<EncryptionMethod> f14994b;

    /* renamed from: c */
    public final C6670a f14995c = new C6670a();

    public C6812c(Set<JWEAlgorithm> set, Set<EncryptionMethod> set2) {
        if (set != null) {
            this.f14993a = Collections.unmodifiableSet(set);
            this.f14994b = set2;
            return;
        }
        throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
    }
}
