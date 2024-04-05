package p269vp;

import android.os.Handler;
import android.os.Looper;
import androidx.compose.p015ui.text.input.C1993m;
import java.util.concurrent.Callable;
import p145io.reactivex.internal.util.ExceptionHelper;
import p248tp.C8066r;
import p287xp.C8339g;

/* renamed from: vp.a */
public final class C8221a {

    /* renamed from: a */
    public static final C8066r f18049a;

    /* renamed from: vp.a$a */
    public static class C8222a implements Callable<C8066r> {
        public final Object call() throws Exception {
            return C8223b.f18050a;
        }
    }

    /* renamed from: vp.a$b */
    public static final class C8223b {

        /* renamed from: a */
        public static final C8224b f18050a = new C8224b(new Handler(Looper.getMainLooper()), false);
    }

    static {
        C8066r rVar;
        C8222a aVar = new C8222a();
        C8339g gVar = C1993m.f4502q;
        if (gVar == null) {
            try {
                rVar = C8223b.f18050a;
                if (rVar == null) {
                    throw new NullPointerException("Scheduler Callable returned null");
                }
            } catch (Throwable th) {
                throw ExceptionHelper.m32485d(th);
            }
        } else {
            try {
                rVar = (C8066r) gVar.apply(aVar);
                if (rVar == null) {
                    throw new NullPointerException("Scheduler Callable returned null");
                }
            } catch (Throwable th2) {
                throw ExceptionHelper.m32485d(th2);
            }
        }
        f18049a = rVar;
    }

    /* renamed from: a */
    public static C8066r m16513a() {
        C8066r rVar = f18049a;
        if (rVar != null) {
            C8339g gVar = C1993m.f4503r;
            if (gVar == null) {
                return rVar;
            }
            try {
                return (C8066r) gVar.apply(rVar);
            } catch (Throwable th) {
                throw ExceptionHelper.m32485d(th);
            }
        } else {
            throw new NullPointerException("scheduler == null");
        }
    }
}
