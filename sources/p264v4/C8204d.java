package p264v4;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: v4.d */
public final class C8204d {

    /* renamed from: a */
    public final ArrayList f18000a = new ArrayList();

    /* renamed from: v4.d$a */
    public static final class C8205a<Z, R> {

        /* renamed from: a */
        public final Class<Z> f18001a;

        /* renamed from: b */
        public final Class<R> f18002b;

        /* renamed from: c */
        public final C8203c<Z, R> f18003c;

        public C8205a(Class<Z> cls, Class<R> cls2, C8203c<Z, R> cVar) {
            this.f18001a = cls;
            this.f18002b = cls2;
            this.f18003c = cVar;
        }
    }

    /* renamed from: a */
    public final synchronized ArrayList mo20830a(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        Iterator it = this.f18000a.iterator();
        while (it.hasNext()) {
            C8205a aVar = (C8205a) it.next();
            if ((aVar.f18001a.isAssignableFrom(cls) && cls2.isAssignableFrom(aVar.f18002b)) && !arrayList.contains(aVar.f18002b)) {
                arrayList.add(aVar.f18002b);
            }
        }
        return arrayList;
    }
}
