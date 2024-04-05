package p197o4;

import androidx.activity.C0114h;
import com.bumptech.glide.load.data.C5968d;
import java.util.Collections;
import java.util.List;
import p150j4.C7109b;
import p150j4.C7114e;

/* renamed from: o4.n */
public interface C7588n<Model, Data> {

    /* renamed from: o4.n$a */
    public static class C7589a<Data> {

        /* renamed from: a */
        public final C7109b f16853a;

        /* renamed from: b */
        public final List<C7109b> f16854b;

        /* renamed from: c */
        public final C5968d<Data> f16855c;

        public C7589a() {
            throw null;
        }

        public C7589a(C7109b bVar, C5968d<Data> dVar) {
            List<C7109b> emptyList = Collections.emptyList();
            C0114h.m281L(bVar);
            this.f16853a = bVar;
            C0114h.m281L(emptyList);
            this.f16854b = emptyList;
            C0114h.m281L(dVar);
            this.f16855c = dVar;
        }
    }

    /* renamed from: a */
    C7589a<Data> mo20000a(Model model, int i, int i2, C7114e eVar);

    /* renamed from: b */
    boolean mo20001b(Model model);
}
