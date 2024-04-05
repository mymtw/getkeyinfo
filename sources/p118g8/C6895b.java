package p118g8;

import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6246c;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.jwk.C6248e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: g8.b */
public final class C6895b {

    /* renamed from: a */
    public static Map<C6248e, Set<C6246c>> f15275a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(C6248e.f13701a, new HashSet(Arrays.asList(new C6246c[]{C6246c.SIGN, C6246c.VERIFY})));
        hashMap.put(C6248e.f13702b, new HashSet(Arrays.asList(new C6246c[]{C6246c.ENCRYPT, C6246c.DECRYPT, C6246c.WRAP_KEY, C6246c.UNWRAP_KEY})));
        f15275a = Collections.unmodifiableMap(hashMap);
    }
}
