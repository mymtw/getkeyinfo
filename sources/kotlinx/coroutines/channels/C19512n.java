package kotlinx.coroutines.channels;

import kotlin.C19394m;
import kotlin.coroutines.CoroutineContext;
import p514bk.C14088a;

/* renamed from: kotlinx.coroutines.channels.n */
public final class C19512n<E> extends C19501e<E> implements C19513o<E> {
    public C19512n(CoroutineContext coroutineContext, AbstractChannel abstractChannel) {
        super(coroutineContext, abstractChannel);
    }

    /* renamed from: C0 */
    public final void mo72094C0(Throwable th, boolean z) {
        if (!this.f43448d.mo72187C(th) && !z) {
            C14088a.m21785m(th, this.f43394c);
        }
    }

    /* renamed from: D0 */
    public final void mo72095D0(Object obj) {
        C19394m mVar = (C19394m) obj;
        this.f43448d.mo72187C((Throwable) null);
    }

    public final boolean isActive() {
        return super.isActive();
    }

    /* renamed from: t */
    public final C19519u mo72217t() {
        return this;
    }
}
