package p080d5;

import android.util.Log;
import p077d1.C6620d;
import p077d1.C6622f;
import p080d5.C6660d;

/* renamed from: d5.a */
public final class C6652a {

    /* renamed from: a */
    public static final C6653a f14683a = new C6653a();

    /* renamed from: d5.a$a */
    public class C6653a implements C6657e<Object> {
        /* renamed from: a */
        public final void mo18830a(Object obj) {
        }
    }

    /* renamed from: d5.a$b */
    public interface C6654b<T> {
        T create();
    }

    /* renamed from: d5.a$c */
    public static final class C6655c<T> implements C6620d<T> {

        /* renamed from: b */
        public final C6654b<T> f14684b;

        /* renamed from: c */
        public final C6657e<T> f14685c;

        /* renamed from: d */
        public final C6620d<T> f14686d;

        public C6655c(C6622f fVar, C6654b bVar, C6657e eVar) {
            this.f14686d = fVar;
            this.f14684b = bVar;
            this.f14685c = eVar;
        }

        /* renamed from: a */
        public final boolean mo18806a(T t) {
            if (t instanceof C6656d) {
                ((C6656d) t).mo16872c().f14687a = true;
            }
            this.f14685c.mo18830a(t);
            return this.f14686d.mo18806a(t);
        }

        /* renamed from: b */
        public final T mo18807b() {
            T b = this.f14686d.mo18807b();
            if (b == null) {
                b = this.f14684b.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    b.getClass().toString();
                }
            }
            if (b instanceof C6656d) {
                ((C6656d) b).mo16872c().f14687a = false;
            }
            return b;
        }
    }

    /* renamed from: d5.a$d */
    public interface C6656d {
        /* renamed from: c */
        C6660d.C6661a mo16872c();
    }

    /* renamed from: d5.a$e */
    public interface C6657e<T> {
        /* renamed from: a */
        void mo18830a(T t);
    }

    /* renamed from: a */
    public static C6655c m13024a(int i, C6654b bVar) {
        return new C6655c(new C6622f(i), bVar, f14683a);
    }
}
