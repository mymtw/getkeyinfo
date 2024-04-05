package p649pm;

import android.util.Log;
import androidx.preference.C3039b;
import com.etsy.android.p327ui.shop.C11141e;
import com.google.firebase.components.InvalidRegistrarException;
import com.google.firebase.components.MissingDependencyException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p427qb.C13281a;
import p603ki.C18095a;
import p666rm.C18498a;
import p706wm.C18749a;
import p706wm.C18751c;
import p706wm.C18752d;
import p722ym.C18895a;

/* renamed from: pm.j */
public final class C18405j extends C3039b implements C18498a {

    /* renamed from: h */
    public static final C18403h f40476h = new C18403h();

    /* renamed from: c */
    public final HashMap f40477c = new HashMap();

    /* renamed from: d */
    public final HashMap f40478d = new HashMap();

    /* renamed from: e */
    public final HashMap f40479e = new HashMap();

    /* renamed from: f */
    public final C18410m f40480f;

    /* renamed from: g */
    public final AtomicReference<Boolean> f40481g = new AtomicReference<>();

    public C18405j(Executor executor, ArrayList arrayList, ArrayList arrayList2) {
        C18410m mVar = new C18410m(executor);
        this.f40480f = mVar;
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(C18396b.m31104b(mVar, C18410m.class, C18752d.class, C18751c.class));
        arrayList3.add(C18396b.m31104b(this, C18498a.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            C18396b bVar = (C18396b) it.next();
            if (bVar != null) {
                arrayList3.add(bVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    C18401f fVar = (C18401f) ((C18895a) it3.next()).get();
                    if (fVar != null) {
                        arrayList3.addAll(fVar.getComponents());
                        it3.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            if (this.f40477c.isEmpty()) {
                C18406k.m31118a(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(this.f40477c.keySet());
                arrayList6.addAll(arrayList3);
                C18406k.m31118a(arrayList6);
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                C18396b bVar2 = (C18396b) it4.next();
                this.f40477c.put(bVar2, new C18411n(new C18402g(this, bVar2)));
            }
            arrayList5.addAll(mo69941w0(arrayList3));
            arrayList5.addAll(mo69942x0());
            mo69940v0();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = this.f40481g.get();
        if (bool != null) {
            mo69939u0(this.f40477c, bool.booleanValue());
        }
    }

    /* renamed from: a */
    public final synchronized <T> C18895a<Set<T>> mo69937a(Class<T> cls) {
        C18412o oVar = (C18412o) this.f40479e.get(cls);
        if (oVar != null) {
            return oVar;
        }
        return f40476h;
    }

    /* renamed from: d */
    public final synchronized <T> C18895a<T> mo69938d(Class<T> cls) {
        return (C18895a) this.f40478d.get(cls);
    }

    /* renamed from: u0 */
    public final void mo69939u0(Map<C18396b<?>, C18895a<?>> map, boolean z) {
        ArrayDeque<C18749a> arrayDeque;
        Set<Map.Entry> emptySet;
        for (Map.Entry next : map.entrySet()) {
            C18895a aVar = (C18895a) next.getValue();
            int i = ((C18396b) next.getKey()).f40462c;
            boolean z2 = false;
            if (!(i == 1)) {
                if (i == 2) {
                    z2 = true;
                }
                if (z2) {
                    if (!z) {
                    }
                }
            }
            aVar.get();
        }
        C18410m mVar = this.f40480f;
        synchronized (mVar) {
            try {
                arrayDeque = mVar.f40491b;
                if (arrayDeque != null) {
                    mVar.f40491b = null;
                } else {
                    arrayDeque = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        if (arrayDeque != null) {
            for (C18749a aVar2 : arrayDeque) {
                aVar2.getClass();
                synchronized (mVar) {
                    ArrayDeque arrayDeque2 = mVar.f40491b;
                    if (arrayDeque2 != null) {
                        arrayDeque2.add(aVar2);
                    } else {
                        synchronized (mVar) {
                            Map map2 = (Map) mVar.f40490a.get((Object) null);
                            emptySet = map2 == null ? Collections.emptySet() : map2.entrySet();
                        }
                        for (Map.Entry entry : emptySet) {
                            ((Executor) entry.getValue()).execute(new C13281a(4, entry, aVar2));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: v0 */
    public final void mo69940v0() {
        for (C18396b bVar : this.f40477c.keySet()) {
            Iterator<C18409l> it = bVar.f40461b.iterator();
            while (true) {
                if (it.hasNext()) {
                    C18409l next = it.next();
                    boolean z = true;
                    if ((next.f40488b == 2) && !this.f40479e.containsKey(next.f40487a)) {
                        this.f40479e.put(next.f40487a, new C18412o(Collections.emptySet()));
                    } else if (this.f40478d.containsKey(next.f40487a)) {
                        continue;
                    } else {
                        int i = next.f40488b;
                        if (!(i == 1)) {
                            if (i != 2) {
                                z = false;
                            }
                            if (!z) {
                                this.f40478d.put(next.f40487a, new C18414q());
                            }
                        } else {
                            throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", new Object[]{bVar, next.f40487a}));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: w0 */
    public final ArrayList mo69941w0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C18396b bVar = (C18396b) it.next();
            if (bVar.f40463d == 0) {
                C18895a aVar = (C18895a) this.f40477c.get(bVar);
                for (Class next : bVar.f40460a) {
                    if (!this.f40478d.containsKey(next)) {
                        this.f40478d.put(next, aVar);
                    } else {
                        arrayList2.add(new C11141e(3, (C18414q) ((C18895a) this.f40478d.get(next)), aVar));
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: x0 */
    public final ArrayList mo69942x0() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f40477c.entrySet()) {
            C18396b bVar = (C18396b) entry.getKey();
            if (!(bVar.f40463d == 0)) {
                C18895a aVar = (C18895a) entry.getValue();
                for (Class next : bVar.f40460a) {
                    if (!hashMap.containsKey(next)) {
                        hashMap.put(next, new HashSet());
                    }
                    ((Set) hashMap.get(next)).add(aVar);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!this.f40479e.containsKey(entry2.getKey())) {
                this.f40479e.put((Class) entry2.getKey(), new C18412o((Set) ((Collection) entry2.getValue())));
            } else {
                C18412o oVar = (C18412o) this.f40479e.get(entry2.getKey());
                for (C18895a aVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new C18095a(oVar, aVar2));
                }
            }
        }
        return arrayList;
    }
}
