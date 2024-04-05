package kotlinx.coroutines;

import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19699g1;
import p514bk.C14088a;

/* renamed from: kotlinx.coroutines.a */
public abstract class C19464a<T> extends C19749k1 implements C19340c<T>, C19525d0 {

    /* renamed from: c */
    public final CoroutineContext f43394c;

    public C19464a(CoroutineContext coroutineContext, boolean z) {
        super(z);
        mo72523k0((C19699g1) coroutineContext.get(C19699g1.C19701b.f43635b));
        this.f43394c = coroutineContext.plus(this);
    }

    /* renamed from: B0 */
    public void mo72093B0(Object obj) {
        mo72252H(obj);
    }

    /* renamed from: C0 */
    public void mo72094C0(Throwable th, boolean z) {
    }

    /* renamed from: D0 */
    public void mo72095D0(T t) {
    }

    /* renamed from: P */
    public final String mo72096P() {
        return C19383o.m32802l(" was cancelled", getClass().getSimpleName());
    }

    public final CoroutineContext getContext() {
        return this.f43394c;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.f43394c;
    }

    public boolean isActive() {
        return super.isActive();
    }

    /* renamed from: j0 */
    public final void mo72098j0(CompletionHandlerException completionHandlerException) {
        C14088a.m21785m(completionHandlerException, this.f43394c);
    }

    /* renamed from: p0 */
    public String mo72099p0() {
        return super.mo72099p0();
    }

    public final void resumeWith(Object obj) {
        Throwable r0 = Result.m35483exceptionOrNullimpl(obj);
        if (r0 != null) {
            obj = new C19830v(r0, false);
        }
        Object o0 = mo72525o0(obj);
        if (o0 != C14088a.f31033n) {
            mo72093B0(o0);
        }
    }

    /* renamed from: s0 */
    public final void mo72100s0(Object obj) {
        if (obj instanceof C19830v) {
            C19830v vVar = (C19830v) obj;
            mo72094C0(vVar.f43842a, vVar.mo72675a());
            return;
        }
        mo72095D0(obj);
    }
}
