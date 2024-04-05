package p553do;

import java.util.concurrent.Callable;
import p287xp.C8340h;

/* renamed from: do.a */
public final class C17700a {

    /* renamed from: a */
    public static final C17701a f38506a = new C17701a(Boolean.TRUE);

    /* renamed from: do.a$a */
    public static final class C17701a implements Callable<Boolean>, C8340h<Object> {

        /* renamed from: b */
        public final Boolean f38507b;

        public C17701a(Boolean bool) {
            this.f38507b = bool;
        }

        public final Object call() throws Exception {
            return this.f38507b;
        }

        public final boolean test(Object obj) {
            return this.f38507b.booleanValue();
        }
    }
}
