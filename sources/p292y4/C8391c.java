package p292y4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p150j4.C7115f;

/* renamed from: y4.c */
public final class C8391c {

    /* renamed from: a */
    public final ArrayList f18395a = new ArrayList();

    /* renamed from: b */
    public final HashMap f18396b = new HashMap();

    /* renamed from: y4.c$a */
    public static class C8392a<T, R> {

        /* renamed from: a */
        public final Class<T> f18397a;

        /* renamed from: b */
        public final Class<R> f18398b;

        /* renamed from: c */
        public final C7115f<T, R> f18399c;

        public C8392a(Class<T> cls, Class<R> cls2, C7115f<T, R> fVar) {
            this.f18397a = cls;
            this.f18398b = cls2;
            this.f18399c = fVar;
        }
    }

    /* renamed from: a */
    public final synchronized List<C8392a<?, ?>> mo20971a(String str) {
        List<C8392a<?, ?>> list;
        if (!this.f18395a.contains(str)) {
            this.f18395a.add(str);
        }
        list = (List) this.f18396b.get(str);
        if (list == null) {
            list = new ArrayList<>();
            this.f18396b.put(str, list);
        }
        return list;
    }

    /* renamed from: b */
    public final synchronized ArrayList mo20972b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f18395a.iterator();
        while (it.hasNext()) {
            List<C8392a> list = (List) this.f18396b.get((String) it.next());
            if (list != null) {
                for (C8392a aVar : list) {
                    if ((aVar.f18397a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f18398b)) && !arrayList.contains(aVar.f18398b)) {
                        arrayList.add(aVar.f18398b);
                    }
                }
            }
        }
        return arrayList;
    }
}
