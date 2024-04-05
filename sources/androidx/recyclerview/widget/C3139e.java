package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import com.appboy.p043ui.C4950e;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.e */
public final class C3139e<T> {

    /* renamed from: h */
    public static final C3141b f7214h = new C3141b();

    /* renamed from: a */
    public final C3202x f7215a;

    /* renamed from: b */
    public final C3130c<T> f7216b;

    /* renamed from: c */
    public C3141b f7217c;

    /* renamed from: d */
    public final CopyOnWriteArrayList f7218d = new CopyOnWriteArrayList();

    /* renamed from: e */
    public List<T> f7219e;

    /* renamed from: f */
    public List<T> f7220f = Collections.emptyList();

    /* renamed from: g */
    public int f7221g;

    /* renamed from: androidx.recyclerview.widget.e$a */
    public interface C3140a<T> {
        /* renamed from: a */
        void mo11838a();
    }

    /* renamed from: androidx.recyclerview.widget.e$b */
    public static class C3141b implements Executor {

        /* renamed from: b */
        public final Handler f7222b = new Handler(Looper.getMainLooper());

        public final void execute(Runnable runnable) {
            this.f7222b.post(runnable);
        }
    }

    public C3139e(C3128b bVar, C3130c cVar) {
        this.f7215a = bVar;
        this.f7216b = cVar;
        this.f7217c = f7214h;
    }

    /* renamed from: a */
    public final void mo11836a(List<T> list, Runnable runnable) {
        Iterator it = this.f7218d.iterator();
        while (it.hasNext()) {
            ((C3140a) it.next()).mo11838a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: b */
    public final void mo11837b(List list, C4950e eVar) {
        int i = this.f7221g + 1;
        this.f7221g = i;
        List<T> list2 = this.f7219e;
        if (list != list2) {
            List<T> list3 = this.f7220f;
            if (list == null) {
                int size = list2.size();
                this.f7219e = null;
                this.f7220f = Collections.emptyList();
                this.f7215a.mo11817b(0, size);
                mo11836a(list3, eVar);
            } else if (list2 == null) {
                this.f7219e = list;
                this.f7220f = Collections.unmodifiableList(list);
                this.f7215a.mo11816a(0, list.size());
                mo11836a(list3, eVar);
            } else {
                this.f7216b.f7194a.execute(new C3134d(this, list2, list, i, eVar));
            }
        } else if (eVar != null) {
            eVar.run();
        }
    }
}
