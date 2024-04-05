package com.bugsnag.android;

import android.support.p013v4.media.C0072d;
import com.bugsnag.android.C5748g1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p568fn.C17782b;

/* renamed from: com.bugsnag.android.r1 */
public final class C5829r1 implements C5748g1.C5749a {

    /* renamed from: d */
    public static final C5830a f12466d = new C5830a();

    /* renamed from: b */
    public final C5923v1 f12467b;

    /* renamed from: c */
    public final Map<String, Map<String, Object>> f12468c;

    /* renamed from: com.bugsnag.android.r1$a */
    public static final class C5830a {
        /* renamed from: a */
        public static ConcurrentHashMap m11601a(List list) {
            C19383o.m32798h(list, "data");
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C19324q.m32628J0(((Map) it.next()).keySet(), arrayList);
            }
            Set<String> t1 = C19327t.m32664t1(arrayList);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Map map = (Map) it2.next();
                for (String str : t1) {
                    Object obj = concurrentHashMap.get(str);
                    Object obj2 = map.get(str);
                    if (obj2 != null) {
                        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
                            concurrentHashMap.put(str, obj2);
                        } else {
                            concurrentHashMap.put(str, m11601a(C17782b.m29865e0((Map) obj, (Map) obj2)));
                        }
                    } else if (obj != null) {
                        concurrentHashMap.put(str, obj);
                    }
                }
            }
            return concurrentHashMap;
        }
    }

    public C5829r1() {
        this(0);
    }

    public C5829r1(Map<String, Map<String, Object>> map) {
        C19383o.m32798h(map, "store");
        this.f12468c = map;
        this.f12467b = new C5923v1();
    }

    /* renamed from: a */
    public final void mo16615a(String str, String str2, Object obj) {
        C19383o.m32798h(str, "section");
        C19383o.m32798h(str2, "key");
        if (obj == null) {
            mo16617c(str, str2);
            return;
        }
        Map map = this.f12468c.get(str);
        if (map == null) {
            map = new ConcurrentHashMap();
        }
        this.f12468c.put(str, map);
        Object obj2 = map.get(str2);
        if (obj2 != null && (obj instanceof Map)) {
            List e0 = C17782b.m29865e0((Map) obj2, (Map) obj);
            f12466d.getClass();
            obj = C5830a.m11601a(e0);
        }
        map.put(str2, obj);
    }

    /* renamed from: b */
    public final void mo16616b(String str, Map<String, ? extends Object> map) {
        C19383o.m32798h(str, "section");
        C19383o.m32798h(map, "value");
        for (Map.Entry entry : map.entrySet()) {
            mo16615a(str, (String) entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    public final void mo16617c(String str, String str2) {
        C19383o.m32798h(str, "section");
        C19383o.m32798h(str2, "key");
        Map map = this.f12468c.get(str);
        if (map != null) {
            map.remove(str2);
        }
        if (map == null || map.isEmpty()) {
            this.f12468c.remove(str);
        }
    }

    /* renamed from: d */
    public final C5829r1 mo16618d() {
        C5829r1 r1Var = new C5829r1((Map<String, Map<String, Object>>) mo16619e());
        Set<String> t1 = C19327t.m32664t1(this.f12467b.f12669a);
        C19383o.m32798h(t1, "value");
        C5923v1 v1Var = r1Var.f12467b;
        v1Var.getClass();
        v1Var.f12669a = t1;
        return r1Var;
    }

    /* renamed from: e */
    public final ConcurrentHashMap mo16619e() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.f12468c);
        for (Map.Entry entry : this.f12468c.entrySet()) {
            concurrentHashMap.put(entry.getKey(), new ConcurrentHashMap((Map) entry.getValue()));
        }
        return concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C5829r1) && C19383o.m32792b(this.f12468c, ((C5829r1) obj).f12468c);
        }
        return true;
    }

    public final int hashCode() {
        Map<String, Map<String, Object>> map = this.f12468c;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final void toStream(C5748g1 g1Var) throws IOException {
        C19383o.m32798h(g1Var, "writer");
        this.f12467b.mo16692a(this.f12468c, g1Var, true);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("Metadata(store=");
        h.append(this.f12468c);
        h.append(")");
        return h.toString();
    }

    public /* synthetic */ C5829r1(int i) {
        this((Map<String, Map<String, Object>>) new ConcurrentHashMap());
    }
}
