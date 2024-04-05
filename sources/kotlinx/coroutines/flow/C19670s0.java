package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19761n1;
import kotlinx.coroutines.C19835w1;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.C19499d;
import kotlinx.coroutines.flow.C19682v1;
import kotlinx.coroutines.flow.internal.C19626c;

/* renamed from: kotlinx.coroutines.flow.s0 */
public final /* synthetic */ class C19670s0 {
    /* renamed from: a */
    public static final C19662p1 m33430a(C19597d dVar, C19525d0 d0Var, C19682v1 v1Var, Object obj) {
        C19679u1 u1Var;
        C19626c cVar;
        C19597d h;
        C19499d.f43445e1.getClass();
        C19499d.C19500a aVar = C19499d.C19500a.f43446a;
        if (!(dVar instanceof C19626c) || (h = cVar.mo72341h()) == null) {
            BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
            u1Var = new C19679u1(EmptyCoroutineContext.INSTANCE, dVar);
        } else {
            int i = (cVar = (C19626c) dVar).f43592c;
            if (i == -3 || i == -2 || i == 0) {
                BufferOverflow bufferOverflow2 = cVar.f43593d;
                BufferOverflow bufferOverflow3 = BufferOverflow.SUSPEND;
            }
            u1Var = new C19679u1(cVar.f43591b, h);
        }
        StateFlowImpl g = C19388s.m32862g(obj);
        CoroutineContext coroutineContext = u1Var.f43628b;
        C19597d<T> dVar2 = u1Var.f43627a;
        CoroutineStart coroutineStart = C19383o.m32792b(v1Var, C19682v1.C19683a.f43630a) ? CoroutineStart.DEFAULT : CoroutineStart.UNDISPATCHED;
        FlowKt__ShareKt$launchSharing$1 flowKt__ShareKt$launchSharing$1 = new FlowKt__ShareKt$launchSharing$1(v1Var, dVar2, g, obj, (C19340c<? super FlowKt__ShareKt$launchSharing$1>) null);
        CoroutineContext c = CoroutineContextKt.m33062c(d0Var, coroutineContext);
        C19835w1 n1Var = coroutineStart.isLazy() ? new C19761n1(c, flowKt__ShareKt$launchSharing$1) : new C19835w1(c, true);
        coroutineStart.invoke(flowKt__ShareKt$launchSharing$1, n1Var, n1Var);
        return new C19662p1(g, n1Var);
    }
}
