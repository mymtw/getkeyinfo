package p292y4;

import java.util.ArrayList;
import p150j4.C7116g;

/* renamed from: y4.d */
public final class C8393d {

    /* renamed from: a */
    public final ArrayList f18400a = new ArrayList();

    /* renamed from: y4.d$a */
    public static final class C8394a<T> {

        /* renamed from: a */
        public final Class<T> f18401a;

        /* renamed from: b */
        public final C7116g<T> f18402b;

        public C8394a(Class<T> cls, C7116g<T> gVar) {
            this.f18401a = cls;
            this.f18402b = gVar;
        }
    }

    /* renamed from: a */
    public final synchronized <Z> C7116g<Z> mo20973a(Class<Z> cls) {
        int size = this.f18400a.size();
        for (int i = 0; i < size; i++) {
            C8394a aVar = (C8394a) this.f18400a.get(i);
            if (aVar.f18401a.isAssignableFrom(cls)) {
                return aVar.f18402b;
            }
        }
        return null;
    }
}
