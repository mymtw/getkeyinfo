package p513bj;

import android.os.Looper;
import androidx.profileinstaller.C3062g;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p513bj.C14055g;
import p513bj.C14083w;

/* renamed from: bj.k */
public final class C14060k<T> {

    /* renamed from: a */
    public final C14046a f30940a;

    /* renamed from: b */
    public final C14057h f30941b;

    /* renamed from: c */
    public final C14062b<T> f30942c;

    /* renamed from: d */
    public final CopyOnWriteArraySet<C14063c<T>> f30943d;

    /* renamed from: e */
    public final ArrayDeque<Runnable> f30944e;

    /* renamed from: f */
    public final ArrayDeque<Runnable> f30945f;

    /* renamed from: g */
    public boolean f30946g;

    /* renamed from: bj.k$a */
    public interface C14061a<T> {
        void invoke(T t);
    }

    /* renamed from: bj.k$b */
    public interface C14062b<T> {
        /* renamed from: b */
        void mo36b(T t, C14055g gVar);
    }

    /* renamed from: bj.k$c */
    public static final class C14063c<T> {

        /* renamed from: a */
        public final T f30947a;

        /* renamed from: b */
        public C14055g.C14056a f30948b = new C14055g.C14056a();

        /* renamed from: c */
        public boolean f30949c;

        /* renamed from: d */
        public boolean f30950d;

        public C14063c(T t) {
            this.f30947a = t;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C14063c.class != obj.getClass()) {
                return false;
            }
            return this.f30947a.equals(((C14063c) obj).f30947a);
        }

        public final int hashCode() {
            return this.f30947a.hashCode();
        }
    }

    public C14060k(Looper looper, C14082v vVar, C14062b bVar) {
        this(new CopyOnWriteArraySet(), looper, vVar, bVar);
    }

    /* renamed from: a */
    public final void mo46882a() {
        if (!this.f30945f.isEmpty()) {
            if (!((C14083w) this.f30941b).f31011a.hasMessages(0)) {
                C14083w wVar = (C14083w) this.f30941b;
                wVar.getClass();
                C14083w.C14084a b = C14083w.m21762b();
                b.f31012a = wVar.f31011a.obtainMessage(0);
                b.mo46951a();
            }
            boolean z = !this.f30944e.isEmpty();
            this.f30944e.addAll(this.f30945f);
            this.f30945f.clear();
            if (!z) {
                while (!this.f30944e.isEmpty()) {
                    this.f30944e.peekFirst().run();
                    this.f30944e.removeFirst();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo46883b(int i, C14061a<T> aVar) {
        this.f30945f.add(new C3062g(i, new CopyOnWriteArraySet(this.f30943d), aVar, 1));
    }

    /* renamed from: c */
    public final void mo46884c() {
        Iterator<C14063c<T>> it = this.f30943d.iterator();
        while (it.hasNext()) {
            C14063c next = it.next();
            C14062b<T> bVar = this.f30942c;
            next.f30950d = true;
            if (next.f30949c) {
                bVar.mo36b(next.f30947a, next.f30948b.mo46879b());
            }
        }
        this.f30943d.clear();
        this.f30946g = true;
    }

    public C14060k(CopyOnWriteArraySet<C14063c<T>> copyOnWriteArraySet, Looper looper, C14046a aVar, C14062b<T> bVar) {
        this.f30940a = aVar;
        this.f30943d = copyOnWriteArraySet;
        this.f30942c = bVar;
        this.f30944e = new ArrayDeque<>();
        this.f30945f = new ArrayDeque<>();
        this.f30941b = aVar.mo46866b(looper, new C14059j(this));
    }
}
