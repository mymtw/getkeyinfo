package p649pm;

import com.google.firebase.components.DependencyCycleException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: pm.k */
public final class C18406k {

    /* renamed from: pm.k$a */
    public static class C18407a {

        /* renamed from: a */
        public final C18396b<?> f40482a;

        /* renamed from: b */
        public final HashSet f40483b = new HashSet();

        /* renamed from: c */
        public final HashSet f40484c = new HashSet();

        public C18407a(C18396b<?> bVar) {
            this.f40482a = bVar;
        }
    }

    /* renamed from: pm.k$b */
    public static class C18408b {

        /* renamed from: a */
        public final Class<?> f40485a;

        /* renamed from: b */
        public final boolean f40486b;

        public C18408b() {
            throw null;
        }

        public C18408b(Class cls, boolean z) {
            this.f40485a = cls;
            this.f40486b = z;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C18408b)) {
                return false;
            }
            C18408b bVar = (C18408b) obj;
            return bVar.f40485a.equals(this.f40485a) && bVar.f40486b == this.f40486b;
        }

        public final int hashCode() {
            return ((this.f40485a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f40486b).hashCode();
        }
    }

    /* renamed from: a */
    public static void m31118a(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i = 0;
            if (it.hasNext()) {
                C18396b bVar = (C18396b) it.next();
                C18407a aVar = new C18407a(bVar);
                Iterator<Class<? super T>> it2 = bVar.f40460a.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Class next = it2.next();
                        boolean z = !(bVar.f40463d == 0);
                        C18408b bVar2 = new C18408b(next, z);
                        if (!hashMap.containsKey(bVar2)) {
                            hashMap.put(bVar2, new HashSet());
                        }
                        Set set = (Set) hashMap.get(bVar2);
                        if (set.isEmpty() || z) {
                            set.add(aVar);
                        } else {
                            throw new IllegalArgumentException(String.format("Multiple components provide %s.", new Object[]{next}));
                        }
                    }
                }
            } else {
                for (Set<C18407a> it3 : hashMap.values()) {
                    for (C18407a aVar2 : it3) {
                        for (C18409l next2 : aVar2.f40482a.f40461b) {
                            if (next2.f40489c == 0) {
                                Set<C18407a> set2 = (Set) hashMap.get(new C18408b(next2.f40487a, next2.f40488b == 2));
                                if (set2 != null) {
                                    for (C18407a aVar3 : set2) {
                                        aVar2.f40483b.add(aVar3);
                                        aVar3.f40484c.add(aVar2);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C18407a aVar4 = (C18407a) it4.next();
                    if (aVar4.f40484c.isEmpty()) {
                        hashSet2.add(aVar4);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    C18407a aVar5 = (C18407a) hashSet2.iterator().next();
                    hashSet2.remove(aVar5);
                    i++;
                    Iterator it5 = aVar5.f40483b.iterator();
                    while (it5.hasNext()) {
                        C18407a aVar6 = (C18407a) it5.next();
                        aVar6.f40484c.remove(aVar5);
                        if (aVar6.f40484c.isEmpty()) {
                            hashSet2.add(aVar6);
                        }
                    }
                }
                if (i != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        C18407a aVar7 = (C18407a) it6.next();
                        if (!aVar7.f40484c.isEmpty() && !aVar7.f40483b.isEmpty()) {
                            arrayList2.add(aVar7.f40482a);
                        }
                    }
                    throw new DependencyCycleException(arrayList2);
                }
                return;
            }
        }
    }
}
