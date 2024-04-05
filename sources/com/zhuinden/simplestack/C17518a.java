package com.zhuinden.simplestack;

import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import com.google.android.gms.measurement.internal.C15123x;
import com.zhuinden.simplestack.C17527e;
import com.zhuinden.simplestack.C17534k;
import com.zhuinden.simplestack.C17536l;
import com.zhuinden.simplestack.C17541n;
import com.zhuinden.simplestack.PendingStateChange;
import com.zhuinden.statebundle.StateBundle;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p010a9.C0048b;

/* renamed from: com.zhuinden.simplestack.a */
public final class C17518a implements C17523b {

    /* renamed from: a */
    public final long f38319a = Thread.currentThread().getId();

    /* renamed from: b */
    public Object f38320b = null;

    /* renamed from: c */
    public final C17519a f38321c = new C17519a();

    /* renamed from: d */
    public final C17520b f38322d = new C17520b();

    /* renamed from: e */
    public C17529f f38323e = new C15123x();

    /* renamed from: f */
    public C17530g f38324f = new C1993m();

    /* renamed from: g */
    public C17522d f38325g = new C17524c();

    /* renamed from: h */
    public C17532i f38326h;

    /* renamed from: i */
    public HashMap f38327i = new HashMap();

    /* renamed from: j */
    public C17536l f38328j;

    /* renamed from: k */
    public C17546p f38329k;

    /* renamed from: l */
    public boolean f38330l;

    /* renamed from: m */
    public boolean f38331m;

    /* renamed from: n */
    public final LinkedHashMap f38332n;

    /* renamed from: o */
    public final StateBundle f38333o;

    /* renamed from: com.zhuinden.simplestack.a$a */
    public class C17519a implements C17546p {
        public C17519a() {
        }

        /* renamed from: a */
        public final void mo37061a(C17545o oVar, C17531h hVar) {
            StateBundle bundle;
            C17536l lVar = C17518a.this.f38328j;
            C17527e a = C17545o.m29420a(oVar.f38379b);
            if (lVar.f38368n) {
                lVar.f38368n = false;
                lVar.f38362h = true;
            }
            if (!lVar.f38367m && !lVar.f38356b.mo68765a("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__")) {
                lVar.getClass();
                C17540m mVar = lVar.f38363i.f38336a;
                lVar.f38356b.f38375a.put(lVar.f38355a, mVar);
                for (Map.Entry next : mVar.mo68772c()) {
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    if (!lVar.f38359e.containsKey(value) || lVar.f38359e.get(value).isEmpty()) {
                        if (lVar.f38366l.containsKey("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__") && (value instanceof C17523b) && (bundle = lVar.f38366l.getBundle("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__")) != null && bundle.containsKey(str)) {
                            ((C17523b) value).mo37056b(bundle.getBundle(str));
                        }
                        if (value instanceof C17541n.C17544c) {
                            ((C17541n.C17544c) value).mo68777b();
                        }
                    }
                    if (C17536l.m29401e(value, "__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__", lVar.f38359e)) {
                        IdentityHashMap<Object, Set<String>> identityHashMap = lVar.f38359e;
                        Set set = identityHashMap.get(value);
                        if (set == null) {
                            set = new LinkedHashSet();
                            identityHashMap.put(value, set);
                        }
                        set.add("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__");
                    }
                }
            }
            lVar.f38367m = true;
            lVar.f38358d.addAll(a);
            Iterator it = a.iterator();
            while (it.hasNext()) {
                Object next2 = it.next();
                if (next2 instanceof C17534k.C17535a) {
                    C17534k.C17535a aVar = (C17534k.C17535a) next2;
                    C17536l.m29400b(aVar);
                    for (String a2 : aVar.mo68756a()) {
                        lVar.mo68757a(next2, a2, true, false);
                    }
                }
                if (next2 instanceof C17534k) {
                    lVar.mo68757a(next2, ((C17534k) next2).mo68755a(), false, false);
                } else {
                    String uuid = lVar.f38369o.containsKey(next2) ? lVar.f38369o.get(next2) : UUID.randomUUID().toString();
                    lVar.f38369o.put(next2, uuid);
                    lVar.mo68757a(next2, uuid, false, true);
                }
            }
            C17518a.this.f38329k.mo37061a(oVar, hVar);
        }
    }

    /* renamed from: com.zhuinden.simplestack.a$b */
    public class C17520b implements C17521c {
        public C17520b() {
        }

        /* renamed from: a */
        public final void mo68707a(C17545o oVar) {
            Object obj;
            C17536l.C17538b bVar;
            C17518a aVar = C17518a.this;
            aVar.mo68699d("A backstack must be set up before navigation.");
            C17532i iVar = aVar.f38326h;
            iVar.mo68747a();
            if (!(!iVar.f38346e.isEmpty())) {
                C17518a aVar2 = C17518a.this;
                if (aVar2.f38330l) {
                    C17532i iVar2 = aVar2.f38326h;
                    iVar2.mo68747a();
                    iVar2.f38347f = null;
                }
                C17518a aVar3 = C17518a.this;
                C17522d dVar = aVar3.f38325g;
                HashMap hashMap = aVar3.f38327i;
                ((C17524c) dVar).getClass();
                C0761x.m1670H0(hashMap.keySet(), C17545o.m29420a(oVar.f38379b));
                C17527e a = C17545o.m29420a(oVar.f38379b);
                int i = 0;
                int size = a.size();
                while (true) {
                    if (i >= size) {
                        obj = null;
                        break;
                    }
                    obj = a.mo68713c(i);
                    if ((obj instanceof C17534k) || (obj instanceof C17534k.C17535a)) {
                        break;
                    }
                    i++;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Object obj2 = C17518a.this.f38320b;
                if (obj2 != null) {
                    if (obj2 instanceof C17534k) {
                        linkedHashSet.add(((C17534k) obj2).mo68755a());
                    }
                    Object obj3 = C17518a.this.f38320b;
                    if (obj3 instanceof C17534k.C17535a) {
                        C17534k.C17535a aVar4 = (C17534k.C17535a) obj3;
                        C17536l.m29400b(aVar4);
                        List<String> a2 = aVar4.mo68756a();
                        for (int size2 = a2.size() - 1; size2 >= 0; size2--) {
                            linkedHashSet.add(a2.get(size2));
                        }
                    }
                }
                if (obj != null) {
                    if (obj instanceof C17534k.C17535a) {
                        C17534k.C17535a aVar5 = (C17534k.C17535a) obj;
                        C17536l.m29400b(aVar5);
                        linkedHashSet2.addAll(aVar5.mo68756a());
                    }
                    if (obj instanceof C17534k) {
                        linkedHashSet2.add(((C17534k) obj).mo68755a());
                    }
                }
                C17518a.this.f38320b = obj;
                Iterator it = linkedHashSet2.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (linkedHashSet.contains(str)) {
                        linkedHashSet.remove(str);
                        it.remove();
                    }
                }
                if (!linkedHashSet2.isEmpty() || !linkedHashSet.isEmpty()) {
                    C17518a.this.f38328j.mo68759d(linkedHashSet, linkedHashSet2);
                }
                C17536l lVar = C17518a.this.f38328j;
                lVar.getClass();
                LinkedHashSet<String> linkedHashSet3 = new LinkedHashSet<>();
                linkedHashSet3.add("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__");
                Iterator it2 = a.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof C17534k.C17535a) {
                        C17534k.C17535a aVar6 = (C17534k.C17535a) next;
                        C17536l.m29400b(aVar6);
                        linkedHashSet3.addAll(aVar6.mo68756a());
                    }
                    if (next instanceof C17534k) {
                        linkedHashSet3.add(((C17534k) next).mo68755a());
                    } else if (lVar.f38369o.containsKey(next)) {
                        linkedHashSet3.add(lVar.f38369o.get(next));
                    }
                }
                ArrayList arrayList = new ArrayList(lVar.f38356b.mo68769e());
                Collections.reverse(arrayList);
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    String str2 = (String) it3.next();
                    if (!linkedHashSet3.contains(str2)) {
                        lVar.mo68758c(str2);
                    }
                }
                C0761x.m1670H0(lVar.f38358d, a);
                C0761x.m1670H0(lVar.f38369o.keySet(), a);
                for (String str3 : linkedHashSet3) {
                    if (arrayList.contains(str3)) {
                        C17536l.C17539c cVar = lVar.f38356b;
                        Iterator it4 = cVar.f38375a.keySet().iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                bVar = null;
                                break;
                            }
                            bVar = (C17536l.C17538b) it4.next();
                            if (str3.equals(bVar.f38371b)) {
                                break;
                            }
                        }
                        if (bVar != null) {
                            cVar.f38375a.put(bVar, (C17540m) cVar.f38375a.remove(bVar));
                        }
                    }
                }
                C17518a aVar7 = C17518a.this;
                if (aVar7.f38330l) {
                    aVar7.f38326h.mo68752f(aVar7.f38321c, 1);
                }
            }
        }
    }

    /* renamed from: com.zhuinden.simplestack.a$c */
    public interface C17521c {
        /* renamed from: a */
        void mo68707a(C17545o oVar);
    }

    /* renamed from: com.zhuinden.simplestack.a$d */
    public interface C17522d {
    }

    public C17518a() {
        C17536l lVar = new C17536l();
        this.f38328j = lVar;
        lVar.f38365k = this;
        this.f38330l = false;
        this.f38331m = false;
        this.f38332n = new LinkedHashMap();
        this.f38333o = new StateBundle();
    }

    /* renamed from: a */
    public final StateBundle mo37055a() {
        mo68698c();
        StateBundle stateBundle = new StateBundle();
        ArrayList arrayList = new ArrayList();
        Iterator it = mo68703h().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            ((C1993m) this.f38324f).getClass();
            arrayList.add((Parcelable) next);
        }
        stateBundle.putParcelableArrayList("HISTORY", arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (C17533j jVar : this.f38327i.values()) {
            ParcelledState parcelledState = new ParcelledState();
            C17530g gVar = this.f38324f;
            Object obj = jVar.f38350a;
            ((C1993m) gVar).getClass();
            parcelledState.f38308b = (Parcelable) obj;
            parcelledState.f38309c = jVar.f38351b;
            parcelledState.f38310d = jVar.f38352c;
            parcelledState.f38311e = jVar.f38353d;
            arrayList2.add(parcelledState);
        }
        stateBundle.putParcelableArrayList("STATES", arrayList2);
        C17536l lVar = this.f38328j;
        lVar.getClass();
        StateBundle stateBundle2 = new StateBundle();
        C17536l.C17539c cVar = lVar.f38356b;
        cVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : cVar.f38375a.entrySet()) {
            linkedHashSet.add(new AbstractMap.SimpleEntry(((C17536l.C17538b) entry.getKey()).f38371b, entry.getValue()));
        }
        for (Map.Entry entry2 : Collections.unmodifiableSet(linkedHashSet)) {
            String str = (String) entry2.getKey();
            StateBundle stateBundle3 = new StateBundle();
            for (Map.Entry next2 : ((C17540m) entry2.getValue()).mo68772c()) {
                String str2 = (String) next2.getKey();
                Object value = next2.getValue();
                if (value instanceof C17523b) {
                    stateBundle3.putBundle(str2, ((C17523b) value).mo37055a());
                }
            }
            stateBundle2.putBundle(str, stateBundle3);
        }
        stateBundle.putParcelable("SCOPES", stateBundle2);
        StateBundle stateBundle4 = new StateBundle();
        for (Map.Entry entry3 : this.f38332n.entrySet()) {
            String str3 = (String) entry3.getKey();
            Object value2 = entry3.getValue();
            if (value2 instanceof C17523b) {
                stateBundle4.putParcelable(str3, ((C17523b) value2).mo37055a());
            }
        }
        stateBundle.putParcelable("RETAINED_OBJECT_STATES_TAG", stateBundle4);
        return stateBundle;
    }

    /* renamed from: b */
    public final void mo37056b(StateBundle stateBundle) {
        mo68699d("A backstack must be set up before it is restored!");
        mo68698c();
        if (stateBundle != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList<Parcelable> parcelableArrayList = stateBundle.getParcelableArrayList("HISTORY");
            if (parcelableArrayList != null) {
                for (Parcelable add : parcelableArrayList) {
                    ((C1993m) this.f38324f).getClass();
                    arrayList.add(add);
                }
            }
            C17529f fVar = this.f38323e;
            ArrayList arrayList2 = new ArrayList(arrayList);
            ((C15123x) fVar).getClass();
            if (!arrayList2.isEmpty()) {
                C17532i iVar = this.f38326h;
                iVar.getClass();
                if (arrayList2.size() > 0) {
                    iVar.f38344c = new ArrayList(arrayList2);
                } else {
                    throw new IllegalArgumentException("At least one initial key must be defined");
                }
            }
            ArrayList<ParcelledState> parcelableArrayList2 = stateBundle.getParcelableArrayList("STATES");
            if (parcelableArrayList2 != null) {
                for (ParcelledState parcelledState : parcelableArrayList2) {
                    C17530g gVar = this.f38324f;
                    Parcelable parcelable = parcelledState.f38308b;
                    ((C1993m) gVar).getClass();
                    if (arrayList2.contains(parcelable)) {
                        new SparseArray();
                        new StateBundle();
                        if (parcelable != null) {
                            SparseArray<Parcelable> sparseArray = parcelledState.f38309c;
                            if (sparseArray != null) {
                                StateBundle stateBundle2 = parcelledState.f38310d;
                                StateBundle stateBundle3 = parcelledState.f38311e;
                                C17533j jVar = new C17533j();
                                jVar.f38350a = parcelable;
                                jVar.f38351b = sparseArray;
                                jVar.f38352c = stateBundle2;
                                jVar.f38353d = stateBundle3;
                                this.f38327i.put(parcelable, jVar);
                            } else {
                                throw new IllegalArgumentException("Provided sparse array for view hierarchy state cannot be null");
                            }
                        } else {
                            throw new IllegalArgumentException("Key cannot be null");
                        }
                    }
                }
            }
            C17536l lVar = this.f38328j;
            StateBundle bundle = stateBundle.getBundle("SCOPES");
            if (bundle != null) {
                lVar.f38366l.putAll(bundle);
            } else {
                lVar.getClass();
            }
            StateBundle bundle2 = stateBundle.getBundle("RETAINED_OBJECT_STATES_TAG");
            if (bundle2 != null) {
                this.f38333o.putAll(bundle2);
                for (Map.Entry entry : this.f38332n.entrySet()) {
                    String str = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (this.f38333o.containsKey(str)) {
                        if (value instanceof C17523b) {
                            ((C17523b) value).mo37056b(this.f38333o.getBundle(str));
                            this.f38333o.remove(str);
                        } else {
                            throw new IllegalStateException(C0048b.m163a("State restoration mismatch: expected [", str, "] to be restored, but was not actually Bundleable anymore."));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo68698c() {
        if (Thread.currentThread().getId() != this.f38319a) {
            throw new IllegalStateException("The backstack is not thread-safe, and must be manipulated only from the thread where it was originally created.");
        }
    }

    /* renamed from: d */
    public final void mo68699d(String str) {
        if (this.f38326h == null) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: e */
    public final void mo68700e() {
        mo68699d("You must call `setup()` before calling `detachStateChanger()`.");
        C17532i iVar = this.f38326h;
        iVar.mo68747a();
        if (iVar.f38347f != null) {
            C17532i iVar2 = this.f38326h;
            iVar2.mo68747a();
            iVar2.f38347f = null;
            this.f38330l = false;
        }
    }

    /* renamed from: f */
    public final void mo68701f() {
        mo68699d("A backstack must be set up before navigation.");
        C17532i iVar = this.f38326h;
        iVar.mo68747a();
        iVar.mo68747a();
        if (!iVar.f38346e.isEmpty()) {
            PendingStateChange first = iVar.f38346e.getFirst();
            if (first.f38316e == PendingStateChange.Status.IN_PROGRESS) {
                first.f38317f.mo68746a();
                first.f38318g = true;
            }
        }
    }

    /* renamed from: g */
    public final void mo68702g() {
        if (!this.f38328j.f38368n) {
            if (this.f38320b != null) {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Object obj = this.f38320b;
                if (obj instanceof C17534k.C17535a) {
                    C17534k.C17535a aVar = (C17534k.C17535a) obj;
                    C17536l.m29400b(aVar);
                    linkedHashSet.addAll(new ArrayList(aVar.mo68756a()));
                }
                Object obj2 = this.f38320b;
                if (obj2 instanceof C17534k) {
                    linkedHashSet.add(((C17534k) obj2).mo68755a());
                }
                ArrayList arrayList = new ArrayList(linkedHashSet);
                Collections.reverse(arrayList);
                this.f38328j.mo68759d(new LinkedHashSet(arrayList), Collections.emptySet());
            }
            C17536l lVar = this.f38328j;
            lVar.mo68761g("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__", lVar.f38363i.f38336a);
            C17527e h = mo68703h();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            int size = h.size();
            for (int i = 0; i < size; i++) {
                Object c = h.mo68713c(i);
                if (c instanceof C17534k) {
                    linkedHashSet2.add(((C17534k) c).mo68755a());
                }
                if (c instanceof C17534k.C17535a) {
                    ArrayList arrayList2 = new ArrayList(((C17534k.C17535a) c).mo68756a());
                    Collections.reverse(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (linkedHashSet2.contains(str)) {
                            linkedHashSet2.remove(str);
                        }
                        linkedHashSet2.add(str);
                    }
                }
            }
            Iterator it2 = new ArrayList(linkedHashSet2).iterator();
            while (it2.hasNext()) {
                this.f38328j.mo68758c((String) it2.next());
            }
            C17536l lVar2 = this.f38328j;
            lVar2.f38368n = true;
            lVar2.mo68758c("__SIMPLE_STACK_INTERNAL_GLOBAL_SCOPE__");
            lVar2.f38367m = false;
            this.f38320b = null;
        }
    }

    /* renamed from: h */
    public final <K> C17527e<K> mo68703h() {
        mo68699d("A backstack must be set up before getting keys from it.");
        C17532i iVar = this.f38326h;
        iVar.getClass();
        ArrayList arrayList = new ArrayList(iVar.f38345d.size());
        Iterator it = iVar.f38345d.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return C17527e.m29386a(arrayList).mo68743a();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public final boolean mo68704i() {
        boolean z;
        mo68699d("A backstack must be set up before navigation.");
        mo68699d("A backstack must be set up before navigation.");
        C17532i iVar = this.f38326h;
        iVar.mo68747a();
        if (!iVar.f38346e.isEmpty()) {
            return true;
        }
        C17527e h = mo68703h();
        Object obj = h.isEmpty() ? null : h.get(h.size() - 1);
        if (obj == null) {
            return false;
        }
        C17536l lVar = this.f38328j;
        lVar.f38357c.clear();
        try {
            Iterator it = new ArrayList(lVar.f38356b.mo68766b(obj, true)).iterator();
            loop0:
            while (true) {
                if (!it.hasNext()) {
                    lVar.f38357c.clear();
                    z = false;
                    break;
                }
                ArrayList arrayList = new ArrayList(lVar.f38356b.mo68768d((String) it.next()).mo68772c());
                int size = arrayList.size() - 1;
                while (true) {
                    if (size >= 0) {
                        Object value = ((Map.Entry) arrayList.get(size)).getValue();
                        if (value instanceof C17541n.C17543b) {
                            C17541n.C17543b bVar = (C17541n.C17543b) value;
                            if (!lVar.f38357c.containsKey(bVar)) {
                                lVar.f38357c.put(bVar, Boolean.TRUE);
                                if (bVar.mo68775a()) {
                                    lVar.f38357c.clear();
                                    z = true;
                                    break loop0;
                                }
                            }
                        }
                        size--;
                    }
                }
            }
            if (z) {
                return true;
            }
            C17532i iVar2 = this.f38326h;
            iVar2.mo68747a();
            iVar2.mo68747a();
            if (!iVar2.f38346e.isEmpty()) {
                return true;
            }
            if (iVar2.f38345d.size() <= 1) {
                return false;
            }
            C17527e.C17528a a = C17527e.m29386a(iVar2.mo68751e());
            a.mo68744c();
            iVar2.mo68750d(a.mo68743a(), -1, true, false);
            return true;
        } catch (Throwable th) {
            lVar.f38357c.clear();
            throw th;
        }
    }

    /* renamed from: j */
    public final void mo68705j(C17546p pVar) {
        mo68699d("You must call `setup()` before calling `setStateChanger()`.");
        C17532i iVar = this.f38326h;
        iVar.mo68747a();
        if (iVar.f38347f != null) {
            C17532i iVar2 = this.f38326h;
            iVar2.mo68747a();
            iVar2.f38347f = null;
        }
        this.f38329k = pVar;
        if (pVar != null) {
            if (!this.f38331m) {
                this.f38331m = true;
            }
            this.f38330l = true;
            this.f38326h.mo68752f(this.f38321c, 0);
        }
    }

    /* renamed from: k */
    public final <K> K mo68706k() {
        mo68699d("A backstack must be set up before getting keys from it.");
        C17532i iVar = this.f38326h;
        if (!iVar.f38345d.isEmpty()) {
            ArrayList arrayList = iVar.f38345d;
            return arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Cannot obtain elements from an uninitialized backstack.");
    }
}
