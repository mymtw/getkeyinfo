package p106f8;

import androidx.recyclerview.widget.RecyclerView;
import com.cardinalcommerce.dependencies.internal.nimbusds.jose.EncryptionMethod;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: f8.d */
public final class C6813d {

    /* renamed from: a */
    public static final Set<EncryptionMethod> f14996a;

    /* renamed from: b */
    public static final Map<Integer, Set<EncryptionMethod>> f14997b;

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        EncryptionMethod encryptionMethod = EncryptionMethod.f13566b;
        linkedHashSet.add(encryptionMethod);
        EncryptionMethod encryptionMethod2 = EncryptionMethod.f13567c;
        linkedHashSet.add(encryptionMethod2);
        EncryptionMethod encryptionMethod3 = EncryptionMethod.f13568d;
        linkedHashSet.add(encryptionMethod3);
        EncryptionMethod encryptionMethod4 = EncryptionMethod.f13571g;
        linkedHashSet.add(encryptionMethod4);
        EncryptionMethod encryptionMethod5 = EncryptionMethod.f13572h;
        linkedHashSet.add(encryptionMethod5);
        EncryptionMethod encryptionMethod6 = EncryptionMethod.f13573i;
        linkedHashSet.add(encryptionMethod6);
        EncryptionMethod encryptionMethod7 = EncryptionMethod.f13569e;
        linkedHashSet.add(encryptionMethod7);
        EncryptionMethod encryptionMethod8 = EncryptionMethod.f13570f;
        linkedHashSet.add(encryptionMethod8);
        f14996a = Collections.unmodifiableSet(linkedHashSet);
        HashMap hashMap = new HashMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        hashSet.add(encryptionMethod4);
        hashSet2.add(encryptionMethod5);
        hashSet3.add(encryptionMethod6);
        hashSet3.add(encryptionMethod);
        hashSet3.add(encryptionMethod7);
        hashSet4.add(encryptionMethod2);
        hashSet5.add(encryptionMethod3);
        hashSet5.add(encryptionMethod8);
        hashMap.put(128, Collections.unmodifiableSet(hashSet));
        hashMap.put(192, Collections.unmodifiableSet(hashSet2));
        hashMap.put(256, Collections.unmodifiableSet(hashSet3));
        hashMap.put(384, Collections.unmodifiableSet(hashSet4));
        hashMap.put(Integer.valueOf(RecyclerView.C3084b0.FLAG_ADAPTER_POSITION_UNKNOWN), Collections.unmodifiableSet(hashSet5));
        f14997b = Collections.unmodifiableMap(hashMap);
    }
}
