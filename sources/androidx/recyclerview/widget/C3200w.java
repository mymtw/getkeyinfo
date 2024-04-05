package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C3130c;
import androidx.recyclerview.widget.C3139e;
import androidx.recyclerview.widget.C3167n;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C3084b0;
import com.appboy.p043ui.C4950e;
import java.util.List;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.w */
public abstract class C3200w<T, VH extends RecyclerView.C3084b0> extends RecyclerView.Adapter<VH> {

    /* renamed from: b */
    public final C3139e<T> f7450b;

    /* renamed from: androidx.recyclerview.widget.w$a */
    public class C3201a implements C3139e.C3140a<T> {
        public C3201a() {
        }

        /* renamed from: a */
        public final void mo11838a() {
            C3200w.this.getClass();
        }
    }

    public C3200w(C3167n.C3172e<T> eVar) {
        C3201a aVar = new C3201a();
        C3128b bVar = new C3128b(this);
        C3130c.C3131a aVar2 = new C3130c.C3131a(eVar);
        if (aVar2.f7198a == null) {
            synchronized (C3130c.C3131a.f7196b) {
                if (C3130c.C3131a.f7197c == null) {
                    C3130c.C3131a.f7197c = Executors.newFixedThreadPool(2);
                }
            }
            aVar2.f7198a = C3130c.C3131a.f7197c;
        }
        C3139e<T> eVar2 = new C3139e<>(bVar, new C3130c(aVar2.f7198a, eVar));
        this.f7450b = eVar2;
        eVar2.f7218d.add(aVar);
    }

    public final T getItem(int i) {
        return this.f7450b.f7220f.get(i);
    }

    public final int getItemCount() {
        return this.f7450b.f7220f.size();
    }

    /* renamed from: j */
    public final void mo11950j(List<T> list) {
        this.f7450b.mo11837b(list, (C4950e) null);
    }
}
