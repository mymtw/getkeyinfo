package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.C1369e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19457k;
import p568fn.C17782b;
import p753kq.C19846a;
import p753kq.C19857l;

/* renamed from: androidx.compose.runtime.saveable.f */
public final class C1371f implements C1369e {

    /* renamed from: a */
    public final C19857l<Object, Boolean> f2972a;

    /* renamed from: b */
    public final LinkedHashMap f2973b;

    /* renamed from: c */
    public final LinkedHashMap f2974c;

    /* renamed from: androidx.compose.runtime.saveable.f$a */
    public static final class C1372a implements C1369e.C1370a {

        /* renamed from: a */
        public final /* synthetic */ C1371f f2975a;

        /* renamed from: b */
        public final /* synthetic */ String f2976b;

        /* renamed from: c */
        public final /* synthetic */ C19846a<Object> f2977c;

        public C1372a(C1371f fVar, String str, C19846a<? extends Object> aVar) {
            this.f2975a = fVar;
            this.f2976b = str;
            this.f2977c = aVar;
        }

        /* renamed from: a */
        public final void mo5927a() {
            List list = (List) this.f2975a.f2974c.remove(this.f2976b);
            if (list != null) {
                list.remove(this.f2977c);
            }
            if (list != null && (!list.isEmpty())) {
                this.f2975a.f2974c.put(this.f2976b, list);
            }
        }
    }

    public C1371f(Map<String, ? extends List<? extends Object>> map, C19857l<Object, Boolean> lVar) {
        C19383o.m32797g(lVar, "canBeSaved");
        this.f2972a = lVar;
        this.f2973b = map != null ? C19294b0.m32558A0(map) : new LinkedHashMap();
        this.f2974c = new LinkedHashMap();
    }

    /* renamed from: a */
    public final boolean mo5923a(Object obj) {
        C19383o.m32797g(obj, "value");
        return this.f2972a.invoke(obj).booleanValue();
    }

    /* renamed from: b */
    public final C1369e.C1370a mo5924b(String str, C19846a<? extends Object> aVar) {
        C19383o.m32797g(str, "key");
        if (!C19457k.m33020X0(str)) {
            LinkedHashMap linkedHashMap = this.f2974c;
            Object obj = linkedHashMap.get(str);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(str, obj);
            }
            ((List) obj).add(aVar);
            return new C1372a(this, str, aVar);
        }
        throw new IllegalArgumentException("Registered key is empty or blank".toString());
    }

    /* renamed from: c */
    public final Map<String, List<Object>> mo5925c() {
        LinkedHashMap A0 = C19294b0.m32558A0(this.f2973b);
        for (Map.Entry entry : this.f2974c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            int i = 0;
            if (list.size() == 1) {
                Object invoke = ((C19846a) list.get(0)).invoke();
                if (invoke == null) {
                    continue;
                } else if (mo5923a(invoke)) {
                    A0.put(str, C17782b.m29888u(invoke));
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    Object invoke2 = ((C19846a) list.get(i)).invoke();
                    if (invoke2 == null || mo5923a(invoke2)) {
                        arrayList.add(invoke2);
                        i++;
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                }
                A0.put(str, arrayList);
            }
        }
        return A0;
    }

    /* renamed from: d */
    public final Object mo5926d(String str) {
        C19383o.m32797g(str, "key");
        List list = (List) this.f2973b.remove(str);
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        if (list.size() > 1) {
            this.f2973b.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
