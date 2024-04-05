package androidx.compose.p015ui.platform;

import android.os.Looper;
import android.view.View;
import androidx.compose.p015ui.C1449e;
import androidx.compose.runtime.C1300c0;
import androidx.compose.runtime.C1321f0;
import androidx.compose.runtime.PausableMonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.LinkedHashMap;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.coroutines.C19341d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.internal.C19721f;

/* renamed from: androidx.compose.ui.platform.r1 */
public interface C1869r1 {

    /* renamed from: a */
    public static final C1870a f4131a = C1870a.f4132a;

    /* renamed from: androidx.compose.ui.platform.r1$a */
    public static final class C1870a {

        /* renamed from: a */
        public static final /* synthetic */ C1870a f4132a = new C1870a();

        /* renamed from: androidx.compose.ui.platform.r1$a$a */
        public static final class C1871a implements C1869r1 {

            /* renamed from: b */
            public static final C1871a f4133b = new C1871a();

            /* renamed from: a */
            public final Recomposer mo7277a(View view) {
                CoroutineContext coroutineContext;
                PausableMonotonicFrameClock pausableMonotonicFrameClock;
                CoroutineContext coroutineContext2;
                LinkedHashMap linkedHashMap = C1877t1.f4159a;
                EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                C19383o.m32797g(emptyCoroutineContext, "coroutineContext");
                if (emptyCoroutineContext.get(C19341d.C19342a.f43195b) == null || emptyCoroutineContext.get(C1321f0.C1322a.f2886b) == null) {
                    C19285c<CoroutineContext> cVar = AndroidUiDispatcher.f3999m;
                    if (Looper.myLooper() == Looper.getMainLooper()) {
                        coroutineContext2 = AndroidUiDispatcher.f3999m.getValue();
                    } else {
                        coroutineContext2 = (CoroutineContext) AndroidUiDispatcher.f4000n.get();
                        if (coroutineContext2 == null) {
                            throw new IllegalStateException("no AndroidUiDispatcher for this thread".toString());
                        }
                    }
                    coroutineContext = coroutineContext2.plus(emptyCoroutineContext);
                } else {
                    coroutineContext = emptyCoroutineContext;
                }
                C1321f0 f0Var = (C1321f0) coroutineContext.get(C1321f0.C1322a.f2886b);
                Lifecycle lifecycle = null;
                if (f0Var != null) {
                    PausableMonotonicFrameClock pausableMonotonicFrameClock2 = new PausableMonotonicFrameClock(f0Var);
                    C1300c0 c0Var = pausableMonotonicFrameClock2.f2770c;
                    synchronized (c0Var.f2816a) {
                        c0Var.f2819d = false;
                        C19394m mVar = C19394m.f43287a;
                    }
                    pausableMonotonicFrameClock = pausableMonotonicFrameClock2;
                } else {
                    pausableMonotonicFrameClock = null;
                }
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                T t = (C1449e) coroutineContext.get(C1449e.C1450a.f3144b);
                if (t == null) {
                    t = new C1868r0();
                    ref$ObjectRef.element = t;
                }
                if (pausableMonotonicFrameClock != null) {
                    emptyCoroutineContext = pausableMonotonicFrameClock;
                }
                CoroutineContext plus = coroutineContext.plus(emptyCoroutineContext).plus(t);
                Recomposer recomposer = new Recomposer(plus);
                C19721f a = C19697g.m33463a(plus);
                C2887s f0 = C15588c1.m25325f0(view);
                if (f0 != null) {
                    lifecycle = f0.getLifecycle();
                }
                Lifecycle lifecycle2 = lifecycle;
                if (lifecycle2 != null) {
                    view.addOnAttachStateChangeListener(new C1801xff837ba8(view, recomposer));
                    lifecycle2.mo10733a(new C1802xff837ba9(a, pausableMonotonicFrameClock, recomposer, ref$ObjectRef, view));
                    return recomposer;
                }
                throw new IllegalStateException(("ViewTreeLifecycleOwner not found from " + view).toString());
            }
        }
    }

    /* renamed from: a */
    Recomposer mo7277a(View view);
}
