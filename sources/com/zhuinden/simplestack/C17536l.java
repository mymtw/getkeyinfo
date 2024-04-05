package com.zhuinden.simplestack;

import android.support.p013v4.media.C0072d;
import com.zhuinden.simplestack.C17534k;
import com.zhuinden.simplestack.C17541n;
import com.zhuinden.statebundle.StateBundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p003a2.C0023f;

/* renamed from: com.zhuinden.simplestack.l */
public final class C17536l {

    /* renamed from: p */
    public static final C17525d f38354p = new C17525d(new C17540m(new C17540m()));

    /* renamed from: a */
    public final C17538b f38355a = new C17538b((Object) null, "__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__", Collections.emptyList(), true, false);

    /* renamed from: b */
    public final C17539c f38356b = new C17539c();

    /* renamed from: c */
    public final IdentityHashMap<C17541n.C17543b, Boolean> f38357c = new IdentityHashMap<>();

    /* renamed from: d */
    public final LinkedHashSet<Object> f38358d = new LinkedHashSet<>();

    /* renamed from: e */
    public final IdentityHashMap<Object, Set<String>> f38359e = new IdentityHashMap<>();

    /* renamed from: f */
    public final IdentityHashMap<Object, Set<String>> f38360f = new IdentityHashMap<>();

    /* renamed from: g */
    public final IdentityHashMap<Object, Integer> f38361g = new IdentityHashMap<>();

    /* renamed from: h */
    public boolean f38362h = true;

    /* renamed from: i */
    public C17525d f38363i = f38354p;

    /* renamed from: j */
    public C17541n f38364j = new C17537a();

    /* renamed from: k */
    public C17518a f38365k;

    /* renamed from: l */
    public final StateBundle f38366l = new StateBundle();

    /* renamed from: m */
    public boolean f38367m = false;

    /* renamed from: n */
    public boolean f38368n = false;

    /* renamed from: o */
    public IdentityHashMap<Object, String> f38369o = new IdentityHashMap<>();

    /* renamed from: com.zhuinden.simplestack.l$a */
    public static class C17537a implements C17541n {
    }

    /* renamed from: com.zhuinden.simplestack.l$b */
    public static class C17538b {

        /* renamed from: a */
        public Object f38370a;

        /* renamed from: b */
        public String f38371b;

        /* renamed from: c */
        public List<String> f38372c;

        /* renamed from: d */
        public boolean f38373d;

        /* renamed from: e */
        public boolean f38374e;

        public C17538b(Object obj, String str, List list, boolean z, boolean z2) {
            if (str == null) {
                throw new NullPointerException("scopeTag must not be null!");
            } else if (list != null) {
                this.f38370a = obj;
                this.f38371b = str;
                this.f38372c = list;
                this.f38373d = z;
                this.f38374e = z2;
            } else {
                throw new NullPointerException("explicitParentScopes must not be null!");
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C17538b) && ((C17538b) obj).f38371b.equals(this.f38371b);
        }

        public final int hashCode() {
            return this.f38371b.hashCode();
        }

        public final String toString() {
            StringBuilder h = C0072d.m201h("ScopeRegistration[scopeTag=[");
            h.append(this.f38371b);
            h.append("], explicitParents=[");
            h.append(Arrays.toString(this.f38372c.toArray()));
            h.append("]]");
            return h.toString();
        }
    }

    /* renamed from: com.zhuinden.simplestack.l$c */
    public class C17539c {

        /* renamed from: a */
        public final LinkedHashMap f38375a = new LinkedHashMap();

        /* renamed from: a */
        public final boolean mo68765a(String str) {
            for (C17538b bVar : this.f38375a.keySet()) {
                if (bVar.f38371b.equals(str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final LinkedHashSet<String> mo68766b(Object obj, boolean z) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            ArrayList arrayList = new ArrayList(this.f38375a.keySet());
            int i = -1;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    Object obj2 = ((C17538b) arrayList.get(size)).f38370a;
                    if (obj2 != null && obj2.equals(obj)) {
                        i = size;
                        break;
                    }
                    size--;
                } else {
                    break;
                }
            }
            if (i >= 0) {
                int i2 = z ? i : 0;
                while (i >= i2) {
                    C17538b bVar = (C17538b) arrayList.get(i);
                    if (!bVar.f38373d) {
                        if (!bVar.f38374e) {
                            linkedHashSet.add(bVar.f38371b);
                        }
                        ArrayList arrayList2 = new ArrayList(bVar.f38372c);
                        Collections.reverse(arrayList2);
                        linkedHashSet.addAll(arrayList2);
                    }
                    i--;
                }
            }
            return linkedHashSet;
        }

        /* renamed from: c */
        public final LinkedHashSet<String> mo68767c(String str, boolean z) {
            LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
            ArrayList arrayList = new ArrayList(this.f38375a.keySet());
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                } else if (str.equals(((C17538b) arrayList.get(size)).f38371b)) {
                    break;
                } else {
                    size--;
                }
            }
            if (size >= 0) {
                int i = z ? size : 0;
                while (size >= i) {
                    C17538b bVar = (C17538b) arrayList.get(size);
                    int indexOf = bVar.f38372c.indexOf(str);
                    if (indexOf != -1) {
                        while (indexOf >= 0) {
                            linkedHashSet.add(bVar.f38372c.get(indexOf));
                            indexOf--;
                        }
                    } else {
                        if (!bVar.f38374e) {
                            linkedHashSet.add(bVar.f38371b);
                        }
                        ArrayList arrayList2 = new ArrayList(bVar.f38372c);
                        Collections.reverse(arrayList2);
                        linkedHashSet.addAll(arrayList2);
                    }
                    size--;
                }
            }
            return linkedHashSet;
        }

        /* renamed from: d */
        public final C17540m mo68768d(String str) {
            for (C17538b bVar : this.f38375a.keySet()) {
                if (bVar.f38371b.equals(str)) {
                    return (C17540m) this.f38375a.get(bVar);
                }
            }
            return null;
        }

        /* renamed from: e */
        public final Set<String> mo68769e() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (C17538b bVar : this.f38375a.keySet()) {
                linkedHashSet.add(bVar.f38371b);
                linkedHashSet.addAll(bVar.f38372c);
            }
            return Collections.unmodifiableSet(linkedHashSet);
        }
    }

    /* renamed from: b */
    public static void m29400b(C17534k.C17535a aVar) {
        if (aVar.mo68756a() == null) {
            throw new IllegalArgumentException("Parent scopes cannot be null!");
        }
    }

    /* renamed from: e */
    public static boolean m29401e(Object obj, String str, IdentityHashMap identityHashMap) {
        return !identityHashMap.containsKey(obj) || !((Set) identityHashMap.get(obj)).contains(str);
    }

    /* renamed from: a */
    public final void mo68757a(Object obj, String str, boolean z, boolean z2) {
        if (str == null) {
            throw new IllegalArgumentException("Scope tag provided by scope key cannot be null!");
        } else if (!this.f38356b.mo68765a(str)) {
            C17540m mVar = new C17540m();
            C17539c cVar = this.f38356b;
            cVar.getClass();
            cVar.f38375a.put(new C17538b(obj, str, obj instanceof C17534k.C17535a ? ((C17534k.C17535a) obj).mo68756a() : Collections.emptyList(), false, z2), mVar);
            if (!z2) {
                ((C17537a) this.f38364j).getClass();
                throw new IllegalStateException("No scoped services are defined. To create scoped services, an instance of ScopedServices must be provided to configure the services that are available in a given scope.");
            }
        }
    }

    /* renamed from: c */
    public final void mo68758c(String str) {
        C17540m mVar;
        if (this.f38356b.mo68765a(str)) {
            Iterator it = this.f38356b.f38375a.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    mVar = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((C17538b) entry.getKey()).f38371b.equals(str)) {
                    mVar = (C17540m) entry.getValue();
                    it.remove();
                    break;
                }
            }
            Set<Map.Entry<String, Object>> c = mVar.mo68772c();
            ArrayList arrayList = new ArrayList(c.size());
            for (Map.Entry<String, Object> value : c) {
                arrayList.add(value.getValue());
            }
            Collections.reverse(arrayList);
            this.f38361g.clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!m29401e(next, str, this.f38359e)) {
                    IdentityHashMap<Object, Set<String>> identityHashMap = this.f38359e;
                    Set set = identityHashMap.get(next);
                    set.remove(str);
                    if (set.isEmpty()) {
                        identityHashMap.remove(next);
                    }
                }
                if ((!this.f38359e.containsKey(next) || this.f38359e.get(next).isEmpty()) && (next instanceof C17541n.C17544c) && !this.f38361g.containsKey(next)) {
                    this.f38361g.put(next, 1);
                    ((C17541n.C17544c) next).mo68776a();
                }
            }
            this.f38361g.clear();
            this.f38366l.remove(str);
        }
    }

    /* renamed from: d */
    public final void mo68759d(LinkedHashSet linkedHashSet, Set set) {
        if (this.f38362h) {
            this.f38362h = false;
            mo68760f("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__", this.f38363i.f38336a);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f38356b.mo68765a(str)) {
                mo68760f(str, this.f38356b.mo68768d(str));
            } else {
                StringBuilder l = C0023f.m111l("The new scope [", str, "] should exist, but it doesn't exist in [");
                l.append(Arrays.toString(this.f38356b.mo68769e().toArray()));
                l.append("]! This shouldn't happen. If you see this error, this functionality is broken.");
                throw new AssertionError(l.toString());
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            if (this.f38356b.mo68765a(str2)) {
                mo68761g(str2, this.f38356b.mo68768d(str2));
            } else {
                StringBuilder l2 = C0023f.m111l("The previous scope [", str2, "] should exist in [");
                l2.append(Arrays.toString(this.f38356b.mo68769e().toArray()));
                l2.append("]! This shouldn't happen. If you see this error, this functionality is broken.");
                throw new AssertionError(l2.toString());
            }
        }
    }

    /* renamed from: f */
    public final void mo68760f(String str, C17540m mVar) {
        for (Map.Entry<String, Object> value : mVar.mo68772c()) {
            Object value2 = value.getValue();
            if ((!this.f38360f.containsKey(value2) || this.f38360f.get(value2).isEmpty()) && (value2 instanceof C17541n.C17542a)) {
                ((C17541n.C17542a) value2).mo68773a();
            }
            if (m29401e(value2, str, this.f38360f)) {
                IdentityHashMap<Object, Set<String>> identityHashMap = this.f38360f;
                Set set = identityHashMap.get(value2);
                if (set == null) {
                    set = new LinkedHashSet();
                    identityHashMap.put(value2, set);
                }
                set.add(str);
            }
        }
    }

    /* renamed from: g */
    public final void mo68761g(String str, C17540m mVar) {
        Set<Map.Entry<String, Object>> c = mVar.mo68772c();
        ArrayList arrayList = new ArrayList(c.size());
        for (Map.Entry<String, Object> value : c) {
            arrayList.add(value.getValue());
        }
        Collections.reverse(arrayList);
        this.f38361g.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!m29401e(next, str, this.f38360f)) {
                IdentityHashMap<Object, Set<String>> identityHashMap = this.f38360f;
                Set set = identityHashMap.get(next);
                set.remove(str);
                if (set.isEmpty()) {
                    identityHashMap.remove(next);
                }
            }
            if ((!this.f38360f.containsKey(next) || this.f38360f.get(next).isEmpty()) && (next instanceof C17541n.C17542a) && !this.f38361g.containsKey(next)) {
                this.f38361g.put(next, 1);
                ((C17541n.C17542a) next).mo68774b();
            }
        }
        this.f38361g.clear();
    }
}
