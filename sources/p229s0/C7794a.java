package p229s0;

import java.util.ArrayList;
import java.util.HashSet;
import p077d1.C6621e;
import p193o.C7506i;

/* renamed from: s0.a */
public final class C7794a<T> {

    /* renamed from: a */
    public final C6621e f17231a = new C6621e(10);

    /* renamed from: b */
    public final C7506i<T, ArrayList<T>> f17232b = new C7506i<>();

    /* renamed from: c */
    public final ArrayList<T> f17233c = new ArrayList<>();

    /* renamed from: d */
    public final HashSet<T> f17234d = new HashSet<>();

    /* renamed from: a */
    public final void mo20340a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList orDefault = this.f17232b.getOrDefault(t, null);
                if (orDefault != null) {
                    int size = orDefault.size();
                    for (int i = 0; i < size; i++) {
                        mo20340a(orDefault.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
