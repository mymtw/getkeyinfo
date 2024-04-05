package androidx.datastore.preferences.core;

import androidx.datastore.preferences.core.C2493b;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;

public final class MutablePreferences extends C2493b {

    /* renamed from: a */
    public final Map<C2493b.C2494a<?>, Object> f5761a;

    /* renamed from: b */
    public final AtomicBoolean f5762b;

    public MutablePreferences() {
        this(false, 3);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutablePreferences(boolean z, int i) {
        this((Map<C2493b.C2494a<?>, Object>) (i & 1) != 0 ? new LinkedHashMap() : null, (i & 2) != 0 ? true : z);
    }

    /* renamed from: a */
    public final Map<C2493b.C2494a<?>, Object> mo9350a() {
        Map<C2493b.C2494a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f5761a);
        C19383o.m32796f(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    /* renamed from: b */
    public final <T> T mo9351b(C2493b.C2494a<T> aVar) {
        C19383o.m32797g(aVar, "key");
        return this.f5761a.get(aVar);
    }

    /* renamed from: c */
    public final void mo9352c() {
        if (!(!this.f5762b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    /* renamed from: d */
    public final void mo9353d(C2493b.C2494a<?> aVar, Object obj) {
        C19383o.m32797g(aVar, "key");
        mo9352c();
        if (obj == null) {
            mo9352c();
            this.f5761a.remove(aVar);
        } else if (obj instanceof Set) {
            Map<C2493b.C2494a<?>, Object> map = this.f5761a;
            Set unmodifiableSet = Collections.unmodifiableSet(C19327t.m32664t1((Iterable) obj));
            C19383o.m32796f(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.f5761a.put(aVar, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof MutablePreferences) {
            return C19383o.m32792b(this.f5761a, ((MutablePreferences) obj).f5761a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5761a.hashCode();
    }

    public final String toString() {
        return C19327t.m32644Z0(this.f5761a.entrySet(), ",\n", "{\n", "\n}", MutablePreferences$toString$1.INSTANCE, 24);
    }

    public MutablePreferences(Map<C2493b.C2494a<?>, Object> map, boolean z) {
        C19383o.m32797g(map, "preferencesMap");
        this.f5761a = map;
        this.f5762b = new AtomicBoolean(z);
    }
}
