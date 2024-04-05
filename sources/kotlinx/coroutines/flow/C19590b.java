package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19513o;
import kotlinx.coroutines.channels.C19515q;
import kotlinx.coroutines.flow.internal.C19626c;
import kotlinx.coroutines.flow.internal.C19639o;

/* renamed from: kotlinx.coroutines.flow.b */
public final class C19590b<T> extends C19626c<T> {

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f43560g = AtomicIntegerFieldUpdater.newUpdater(C19590b.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* renamed from: e */
    public final C19515q<T> f43561e;

    /* renamed from: f */
    public final boolean f43562f;

    public /* synthetic */ C19590b(C19515q qVar, boolean z) {
        this(qVar, z, EmptyCoroutineContext.INSTANCE, -3, BufferOverflow.SUSPEND);
    }

    /* renamed from: c */
    public final String mo72340c() {
        return C19383o.m32802l(this.f43561e, "channel=");
    }

    public final Object collect(C19600e<? super T> eVar, C19340c<? super C19394m> cVar) {
        if (this.f43592c == -3) {
            mo72343j();
            Object a = FlowKt__ChannelsKt.m33370a(eVar, this.f43561e, this.f43562f, cVar);
            return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
        }
        Object collect = super.collect(eVar, cVar);
        return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : C19394m.f43287a;
    }

    /* renamed from: f */
    public final Object mo72260f(C19513o<? super T> oVar, C19340c<? super C19394m> cVar) {
        Object a = FlowKt__ChannelsKt.m33370a(new C19639o(oVar), this.f43561e, this.f43562f, cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }

    /* renamed from: g */
    public final C19626c<T> mo72261g(CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        return new C19590b(this.f43561e, this.f43562f, coroutineContext, i, bufferOverflow);
    }

    /* renamed from: h */
    public final C19597d<T> mo72341h() {
        return new C19590b(this.f43561e, this.f43562f);
    }

    /* renamed from: i */
    public final C19515q<T> mo72342i(C19525d0 d0Var) {
        mo72343j();
        return this.f43592c == -3 ? this.f43561e : super.mo72342i(d0Var);
    }

    /* renamed from: j */
    public final void mo72343j() {
        if (this.f43562f) {
            boolean z = true;
            if (f43560g.getAndSet(this, 1) != 0) {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }

    public C19590b(C19515q<? extends T> qVar, boolean z, CoroutineContext coroutineContext, int i, BufferOverflow bufferOverflow) {
        super(coroutineContext, i, bufferOverflow);
        this.f43561e = qVar;
        this.f43562f = z;
        this.consumed = 0;
    }
}
