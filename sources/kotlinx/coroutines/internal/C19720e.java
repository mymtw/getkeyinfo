package kotlinx.coroutines.internal;

import com.google.android.play.core.assetpacks.C15588c1;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.internal.C19720e;

/* renamed from: kotlinx.coroutines.internal.e */
public abstract class C19720e<N extends C19720e<N>> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43659a;

    /* renamed from: b */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43660b;
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ Object _prev;

    static {
        Class<Object> cls = Object.class;
        Class<C19720e> cls2 = C19720e.class;
        f43659a = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f43660b = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
    }

    public C19720e(N n) {
        this._prev = n;
    }

    /* renamed from: a */
    public static final Object m33541a(C19734r rVar) {
        return rVar._next;
    }

    /* renamed from: b */
    public abstract boolean mo72448b();

    /* renamed from: c */
    public final boolean mo72449c() {
        Object obj = this._next;
        return (obj == C15588c1.f35093s ? null : (C19720e) obj) == null;
    }

    /* renamed from: d */
    public final void mo72450d() {
        while (true) {
            C19720e eVar = (C19720e) this._prev;
            while (eVar != null && eVar.mo72448b()) {
                eVar = (C19720e) eVar._prev;
            }
            Object obj = this._next;
            C19720e eVar2 = obj == C15588c1.f35093s ? null : (C19720e) obj;
            C19383o.m32794d(eVar2);
            while (eVar2.mo72448b()) {
                Object obj2 = eVar2._next;
                eVar2 = obj2 == C15588c1.f35093s ? null : (C19720e) obj2;
                C19383o.m32794d(eVar2);
            }
            eVar2._prev = eVar;
            if (eVar != null) {
                eVar._next = eVar2;
            }
            if (!eVar2.mo72448b() && (eVar == null || !eVar.mo72448b())) {
                return;
            }
        }
    }
}
