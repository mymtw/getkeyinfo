package p197o4;

import java.util.HashMap;
import java.util.List;
import p080d5.C6652a;

/* renamed from: o4.p */
public final class C7591p {

    /* renamed from: a */
    public final C7596r f16856a;

    /* renamed from: b */
    public final C7592a f16857b = new C7592a();

    /* renamed from: o4.p$a */
    public static class C7592a {

        /* renamed from: a */
        public final HashMap f16858a = new HashMap();

        /* renamed from: o4.p$a$a */
        public static class C7593a<Model> {

            /* renamed from: a */
            public final List<C7588n<Model, ?>> f16859a;

            public C7593a(List<C7588n<Model, ?>> list) {
                this.f16859a = list;
            }
        }

        /* renamed from: a */
        public final <Model> void mo20025a(Class<Model> cls, List<C7588n<Model, ?>> list) {
            if (((C7593a) this.f16858a.put(cls, new C7593a(list))) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C7591p(C6652a.C6655c cVar) {
        C7596r rVar = new C7596r(cVar);
        this.f16856a = rVar;
    }
}
