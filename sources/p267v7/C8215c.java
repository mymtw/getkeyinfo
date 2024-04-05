package p267v7;

import java.security.PrivilegedAction;
import java.util.Map;

/* renamed from: v7.c */
public final class C8215c implements PrivilegedAction {

    /* renamed from: a */
    public final /* synthetic */ String f18042a = "com.cardinalcommerce.dependencies.internal.bouncycastle.asn1.allow_unsafe_integer";

    public final Object run() {
        Map map = (Map) C8216d.f18043a.get();
        return map != null ? map.get(this.f18042a) : System.getProperty(this.f18042a);
    }
}
