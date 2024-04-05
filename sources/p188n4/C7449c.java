package p188n4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: n4.c */
public final class C7449c {

    /* renamed from: a */
    public final Map<C7450d, Integer> f16644a;

    /* renamed from: b */
    public final ArrayList f16645b;

    /* renamed from: c */
    public int f16646c;

    /* renamed from: d */
    public int f16647d;

    public C7449c(HashMap hashMap) {
        this.f16644a = hashMap;
        this.f16645b = new ArrayList(hashMap.keySet());
        for (Integer intValue : hashMap.values()) {
            this.f16646c = intValue.intValue() + this.f16646c;
        }
    }
}
