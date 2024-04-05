package p505aj;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p602kh.C18086u0;

/* renamed from: aj.c */
public interface C13992c {

    /* renamed from: aj.c$a */
    public interface C13993a {

        /* renamed from: aj.c$a$a */
        public static final class C13994a {

            /* renamed from: a */
            public final CopyOnWriteArrayList<C13995a> f30757a = new CopyOnWriteArrayList<>();

            /* renamed from: aj.c$a$a$a */
            public static final class C13995a {

                /* renamed from: a */
                public final Handler f30758a;

                /* renamed from: b */
                public final C13993a f30759b;

                /* renamed from: c */
                public boolean f30760c;

                public C13995a(Handler handler, C13993a aVar) {
                    this.f30758a = handler;
                    this.f30759b = aVar;
                }
            }

            /* renamed from: a */
            public final void mo46805a(C13993a aVar) {
                Iterator<C13995a> it = this.f30757a.iterator();
                while (it.hasNext()) {
                    C13995a next = it.next();
                    if (next.f30759b == aVar) {
                        next.f30760c = true;
                        this.f30757a.remove(next);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    C14005l mo46801b();

    /* renamed from: c */
    long mo46802c();

    /* renamed from: d */
    void mo46803d(Handler handler, C13993a aVar);

    /* renamed from: h */
    void mo46804h(C18086u0 u0Var);
}
