package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import com.google.android.gms.common.api.Api;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19503g;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import p568fn.C17782b;
import p753kq.C19857l;
import p753kq.C19861p;

public final class SimpleActor<T> {

    /* renamed from: a */
    public final C19525d0 f5722a;

    /* renamed from: b */
    public final C19861p<T, C19340c<? super C19394m>, Object> f5723b;

    /* renamed from: c */
    public final AbstractChannel f5724c = C17782b.m29872l(Api.BaseClientBuilder.API_PRIORITY_OTHER, (BufferOverflow) null, 6);

    /* renamed from: d */
    public final AtomicInteger f5725d = new AtomicInteger(0);

    public SimpleActor(C19525d0 d0Var, final C19857l<? super Throwable, C19394m> lVar, final C19861p<? super T, ? super Throwable, C19394m> pVar, C19861p<? super T, ? super C19340c<? super C19394m>, ? extends Object> pVar2) {
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(pVar, "onUndeliveredElement");
        this.f5722a = d0Var;
        this.f5723b = pVar2;
        C19699g1 g1Var = (C19699g1) d0Var.getCoroutineContext().get(C19699g1.C19701b.f43635b);
        if (g1Var != null) {
            g1Var.mo72401k(new C19857l<Throwable, C19394m>() {
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Throwable) obj);
                    return C19394m.f43287a;
                }

                public final void invoke(Throwable th) {
                    C19394m mVar;
                    lVar.invoke(th);
                    this.f5724c.mo72187C(th);
                    do {
                        Object b = C19503g.m33188b(this.f5724c.mo72144w());
                        if (b == null) {
                            mVar = null;
                            continue;
                        } else {
                            pVar.invoke(b, th);
                            mVar = C19394m.f43287a;
                            continue;
                        }
                    } while (mVar != null);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo9300a(SingleProcessDataStore.C2467a aVar) {
        Object l = this.f5724c.mo72199l(aVar);
        if (l instanceof C19503g.C19504a) {
            Throwable a = C19503g.m33187a(l);
            if (a == null) {
                a = new ClosedSendChannelException("Channel was closed normally");
            }
            throw a;
        } else if (!(!(l instanceof C19503g.C19505b))) {
            throw new IllegalStateException("Check failed.".toString());
        } else if (this.f5725d.getAndIncrement() == 0) {
            C19697g.m33468f(this.f5722a, (CoroutineContext) null, (CoroutineStart) null, new SimpleActor$offer$2(this, (C19340c<? super SimpleActor$offer$2>) null), 3);
        }
    }
}
