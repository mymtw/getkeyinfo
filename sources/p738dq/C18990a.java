package p738dq;

import java.util.concurrent.Callable;
import p145io.reactivex.internal.schedulers.C19217a;
import p145io.reactivex.internal.schedulers.C19222c;
import p145io.reactivex.internal.schedulers.C19226d;
import p145io.reactivex.internal.schedulers.C19230g;
import p145io.reactivex.internal.schedulers.C19232h;
import p248tp.C8066r;
import p736cq.C18981a;

/* renamed from: dq.a */
public final class C18990a {

    /* renamed from: a */
    public static final C8066r f42332a = C18981a.m32122a(new C18992b());

    /* renamed from: b */
    public static final C8066r f42333b = C18981a.m32122a(new C18993c());

    /* renamed from: dq.a$a */
    public static final class C18991a {

        /* renamed from: a */
        public static final C19217a f42334a = new C19217a();
    }

    /* renamed from: dq.a$b */
    public static final class C18992b implements Callable<C8066r> {
        public final Object call() throws Exception {
            return C18991a.f42334a;
        }
    }

    /* renamed from: dq.a$c */
    public static final class C18993c implements Callable<C8066r> {
        public final Object call() throws Exception {
            return C18994d.f42335a;
        }
    }

    /* renamed from: dq.a$d */
    public static final class C18994d {

        /* renamed from: a */
        public static final C19222c f42335a = new C19222c();
    }

    /* renamed from: dq.a$e */
    public static final class C18995e {

        /* renamed from: a */
        public static final C19226d f42336a = new C19226d();
    }

    /* renamed from: dq.a$f */
    public static final class C18996f implements Callable<C8066r> {
        public final Object call() throws Exception {
            return C18995e.f42336a;
        }
    }

    /* renamed from: dq.a$g */
    public static final class C18997g {

        /* renamed from: a */
        public static final C19230g f42337a = new C19230g();
    }

    /* renamed from: dq.a$h */
    public static final class C18998h implements Callable<C8066r> {
        public final Object call() throws Exception {
            return C18997g.f42337a;
        }
    }

    static {
        C18981a.m32122a(new C18998h());
        int i = C19232h.f43017d;
        C18981a.m32122a(new C18996f());
    }
}
