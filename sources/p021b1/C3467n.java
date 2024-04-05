package p021b1;

import android.os.Handler;
import java.util.concurrent.Callable;
import p077d1.C6618b;

/* renamed from: b1.n */
public final class C3467n<T> implements Runnable {

    /* renamed from: b */
    public Callable<T> f8087b;

    /* renamed from: c */
    public C6618b<T> f8088c;

    /* renamed from: d */
    public Handler f8089d;

    /* renamed from: b1.n$a */
    public class C3468a implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ C6618b f8090b;

        /* renamed from: c */
        public final /* synthetic */ Object f8091c;

        public C3468a(C6618b bVar, Object obj) {
            this.f8090b = bVar;
            this.f8091c = obj;
        }

        public final void run() {
            this.f8090b.accept(this.f8091c);
        }
    }

    public C3467n(Handler handler, C3459h hVar, C3460i iVar) {
        this.f8087b = hVar;
        this.f8088c = iVar;
        this.f8089d = handler;
    }

    public final void run() {
        T t;
        try {
            t = this.f8087b.call();
        } catch (Exception unused) {
            t = null;
        }
        this.f8089d.post(new C3468a(this.f8088c, t));
    }
}
