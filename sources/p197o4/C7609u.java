package p197o4;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import p025b5.C3479d;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.u */
public final class C7609u<Model> implements C7588n<Model, Model> {

    /* renamed from: a */
    public static final C7609u<?> f16885a = new C7609u<>();

    /* renamed from: o4.u$a */
    public static class C7610a<Model> implements C7590o<Model, Model> {

        /* renamed from: a */
        public static final C7610a<?> f16886a = new C7610a<>();

        /* renamed from: b */
        public final C7588n<Model, Model> mo20003b(C7596r rVar) {
            return C7609u.f16885a;
        }
    }

    /* renamed from: o4.u$b */
    public static class C7611b<Model> implements C5968d<Model> {

        /* renamed from: b */
        public final Model f16887b;

        public C7611b(Model model) {
            this.f16887b = model;
        }

        /* renamed from: a */
        public final Class<Model> mo16848a() {
            return this.f16887b.getClass();
        }

        /* renamed from: b */
        public final void mo16851b() {
        }

        public final void cancel() {
        }

        /* renamed from: d */
        public final DataSource mo16854d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final void mo16855e(Priority priority, C5968d.C5969a<? super Model> aVar) {
            aVar.mo16863f(this.f16887b);
        }
    }

    /* renamed from: a */
    public final C7588n.C7589a<Model> mo20000a(Model model, int i, int i2, C7114e eVar) {
        return new C7588n.C7589a<>(new C3479d(model), new C7611b(model));
    }

    /* renamed from: b */
    public final boolean mo20001b(Model model) {
        return true;
    }
}
