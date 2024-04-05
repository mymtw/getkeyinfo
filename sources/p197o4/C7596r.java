package p197o4;

import androidx.activity.C0114h;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p077d1.C6620d;
import p080d5.C6652a;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.r */
public final class C7596r {

    /* renamed from: e */
    public static final C7599c f16869e = new C7599c();

    /* renamed from: f */
    public static final C7597a f16870f = new C7597a();

    /* renamed from: a */
    public final ArrayList f16871a = new ArrayList();

    /* renamed from: b */
    public final C7599c f16872b;

    /* renamed from: c */
    public final HashSet f16873c = new HashSet();

    /* renamed from: d */
    public final C6620d<List<Throwable>> f16874d;

    /* renamed from: o4.r$a */
    public static class C7597a implements C7588n<Object, Object> {
        /* renamed from: a */
        public final C7588n.C7589a<Object> mo20000a(Object obj, int i, int i2, C7114e eVar) {
            return null;
        }

        /* renamed from: b */
        public final boolean mo20001b(Object obj) {
            return false;
        }
    }

    /* renamed from: o4.r$b */
    public static class C7598b<Model, Data> {

        /* renamed from: a */
        public final Class<Model> f16875a;

        /* renamed from: b */
        public final Class<Data> f16876b;

        /* renamed from: c */
        public final C7590o<? extends Model, ? extends Data> f16877c;

        public C7598b(Class<Model> cls, Class<Data> cls2, C7590o<? extends Model, ? extends Data> oVar) {
            this.f16875a = cls;
            this.f16876b = cls2;
            this.f16877c = oVar;
        }
    }

    /* renamed from: o4.r$c */
    public static class C7599c {
    }

    public C7596r(C6652a.C6655c cVar) {
        C7599c cVar2 = f16869e;
        this.f16874d = cVar;
        this.f16872b = cVar2;
    }

    /* renamed from: a */
    public final synchronized ArrayList mo20028a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f16871a.iterator();
            while (it.hasNext()) {
                C7598b bVar = (C7598b) it.next();
                if (!this.f16873c.contains(bVar)) {
                    if (bVar.f16875a.isAssignableFrom(cls)) {
                        this.f16873c.add(bVar);
                        C7588n<? extends Model, ? extends Data> b = bVar.f16877c.mo20003b(this);
                        C0114h.m281L(b);
                        arrayList.add(b);
                        this.f16873c.remove(bVar);
                    }
                }
            }
        } catch (Throwable th) {
            this.f16873c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized <Model, Data> C7588n<Model, Data> mo20029b(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f16871a.iterator();
            boolean z = false;
            while (it.hasNext()) {
                C7598b bVar = (C7598b) it.next();
                if (this.f16873c.contains(bVar)) {
                    z = true;
                } else {
                    if (bVar.f16875a.isAssignableFrom(cls) && bVar.f16876b.isAssignableFrom(cls2)) {
                        this.f16873c.add(bVar);
                        arrayList.add(mo20030c(bVar));
                        this.f16873c.remove(bVar);
                    }
                }
            }
            if (arrayList.size() > 1) {
                C7599c cVar = this.f16872b;
                C6620d<List<Throwable>> dVar = this.f16874d;
                cVar.getClass();
                return new C7594q(arrayList, dVar);
            } else if (arrayList.size() == 1) {
                return (C7588n) arrayList.get(0);
            } else if (z) {
                return f16870f;
            } else {
                throw new Registry.NoModelLoaderAvailableException((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th) {
            this.f16873c.clear();
            throw th;
        }
    }

    /* renamed from: c */
    public final <Model, Data> C7588n<Model, Data> mo20030c(C7598b<?, ?> bVar) {
        C7588n<? extends Model, ? extends Data> b = bVar.f16877c.mo20003b(this);
        C0114h.m281L(b);
        return b;
    }

    /* renamed from: d */
    public final synchronized ArrayList mo20031d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f16871a.iterator();
        while (it.hasNext()) {
            C7598b bVar = (C7598b) it.next();
            if (!arrayList.contains(bVar.f16876b) && bVar.f16875a.isAssignableFrom(cls)) {
                arrayList.add(bVar.f16876b);
            }
        }
        return arrayList;
    }
}
