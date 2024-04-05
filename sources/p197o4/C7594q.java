package p197o4;

import android.support.p013v4.media.C0072d;
import androidx.activity.C0114h;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C5968d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p077d1.C6620d;
import p150j4.C7109b;
import p150j4.C7114e;
import p197o4.C7588n;

/* renamed from: o4.q */
public final class C7594q<Model, Data> implements C7588n<Model, Data> {

    /* renamed from: a */
    public final List<C7588n<Model, Data>> f16860a;

    /* renamed from: b */
    public final C6620d<List<Throwable>> f16861b;

    /* renamed from: o4.q$a */
    public static class C7595a<Data> implements C5968d<Data>, C5968d.C5969a<Data> {

        /* renamed from: b */
        public final List<C5968d<Data>> f16862b;

        /* renamed from: c */
        public final C6620d<List<Throwable>> f16863c;

        /* renamed from: d */
        public int f16864d;

        /* renamed from: e */
        public Priority f16865e;

        /* renamed from: f */
        public C5968d.C5969a<? super Data> f16866f;

        /* renamed from: g */
        public List<Throwable> f16867g;

        /* renamed from: h */
        public boolean f16868h;

        public C7595a(ArrayList arrayList, C6620d dVar) {
            this.f16863c = dVar;
            if (!arrayList.isEmpty()) {
                this.f16862b = arrayList;
                this.f16864d = 0;
                return;
            }
            throw new IllegalArgumentException("Must not be empty.");
        }

        /* renamed from: a */
        public final Class<Data> mo16848a() {
            return this.f16862b.get(0).mo16848a();
        }

        /* renamed from: b */
        public final void mo16851b() {
            List<Throwable> list = this.f16867g;
            if (list != null) {
                this.f16863c.mo18806a(list);
            }
            this.f16867g = null;
            for (C5968d<Data> b : this.f16862b) {
                b.mo16851b();
            }
        }

        /* renamed from: c */
        public final void mo16862c(Exception exc) {
            List<Throwable> list = this.f16867g;
            C0114h.m281L(list);
            list.add(exc);
            mo20027g();
        }

        public final void cancel() {
            this.f16868h = true;
            for (C5968d<Data> cancel : this.f16862b) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public final DataSource mo16854d() {
            return this.f16862b.get(0).mo16854d();
        }

        /* renamed from: e */
        public final void mo16855e(Priority priority, C5968d.C5969a<? super Data> aVar) {
            this.f16865e = priority;
            this.f16866f = aVar;
            this.f16867g = this.f16863c.mo18807b();
            this.f16862b.get(this.f16864d).mo16855e(priority, this);
            if (this.f16868h) {
                cancel();
            }
        }

        /* renamed from: f */
        public final void mo16863f(Data data) {
            if (data != null) {
                this.f16866f.mo16863f(data);
            } else {
                mo20027g();
            }
        }

        /* renamed from: g */
        public final void mo20027g() {
            if (!this.f16868h) {
                if (this.f16864d < this.f16862b.size() - 1) {
                    this.f16864d++;
                    mo16855e(this.f16865e, this.f16866f);
                    return;
                }
                C0114h.m281L(this.f16867g);
                this.f16866f.mo16862c(new GlideException("Fetch failed", (List<Throwable>) new ArrayList(this.f16867g)));
            }
        }
    }

    public C7594q(ArrayList arrayList, C6620d dVar) {
        this.f16860a = arrayList;
        this.f16861b = dVar;
    }

    /* renamed from: a */
    public final C7588n.C7589a<Data> mo20000a(Model model, int i, int i2, C7114e eVar) {
        C7588n.C7589a a;
        int size = this.f16860a.size();
        ArrayList arrayList = new ArrayList(size);
        C7109b bVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C7588n nVar = this.f16860a.get(i3);
            if (nVar.mo20001b(model) && (a = nVar.mo20000a(model, i, i2, eVar)) != null) {
                bVar = a.f16853a;
                arrayList.add(a.f16855c);
            }
        }
        if (arrayList.isEmpty() || bVar == null) {
            return null;
        }
        return new C7588n.C7589a<>(bVar, new C7595a(arrayList, this.f16861b));
    }

    /* renamed from: b */
    public final boolean mo20001b(Model model) {
        for (C7588n<Model, Data> b : this.f16860a) {
            if (b.mo20001b(model)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("MultiModelLoader{modelLoaders=");
        h.append(Arrays.toString(this.f16860a.toArray()));
        h.append('}');
        return h.toString();
    }
}
