package kotlinx.coroutines.debug.internal;

import androidx.compose.foundation.layout.C0761x;
import java.text.SimpleDateFormat;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19389t;
import p744gq.C19059b;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.debug.internal.c */
public final class C19536c {

    /* renamed from: a */
    public static final C19536c f43481a = new C19536c();

    /* renamed from: b */
    public static final ConcurrentWeakMap<C19537a<?>, Boolean> f43482b = new ConcurrentWeakMap<>(false);

    /* renamed from: c */
    public static final C19857l<Boolean, C19394m> f43483c;

    /* renamed from: d */
    public static final ConcurrentWeakMap<C19059b, C19535b> f43484d = new ConcurrentWeakMap<>(true);
    private static volatile int installations;

    /* renamed from: kotlinx.coroutines.debug.internal.c$a */
    public static final class C19537a<T> implements C19340c<T>, C19059b {
        public final C19059b getCallerFrame() {
            return null;
        }

        public final CoroutineContext getContext() {
            throw null;
        }

        public final StackTraceElement getStackTraceElement() {
            return null;
        }

        public final void resumeWith(Object obj) {
            C19536c.f43481a.getClass();
            C19536c.f43482b.remove(this);
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    static {
        Object obj;
        new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        new ReentrantReadWriteLock();
        try {
            Object newInstance = Class.forName("kotlinx.coroutines.debug.internal.ByteBuddyDynamicAttach").getConstructors()[0].newInstance(new Object[0]);
            if (newInstance != null) {
                C19389t.m32910d(1, newInstance);
                obj = Result.m35480constructorimpl((C19857l) newInstance);
                if (Result.m35485isFailureimpl(obj)) {
                    obj = null;
                }
                f43483c = (C19857l) obj;
                AtomicLongFieldUpdater.newUpdater(C19538d.class, "sequenceNumber");
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Function1<kotlin.Boolean, kotlin.Unit>");
        } catch (Throwable th) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th));
        }
    }
}
