package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.internal.C19630g;
import p753kq.C19862q;

/* renamed from: kotlinx.coroutines.flow.i1 */
public final class C19614i1 implements C19597d<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19597d f43566b;

    /* renamed from: c */
    public final /* synthetic */ C19597d f43567c;

    /* renamed from: d */
    public final /* synthetic */ C19862q f43568d;

    public C19614i1(C19597d dVar, C19597d dVar2, C19862q qVar) {
        this.f43566b = dVar;
        this.f43567c = dVar2;
        this.f43568d = qVar;
    }

    public final Object collect(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        Object a = C19630g.m33418a(new C19597d[]{this.f43566b, this.f43567c}, FlowKt__ZipKt$nullArrayFactory$1.INSTANCE, new FlowKt__ZipKt$combine$1$1(this.f43568d, (C19340c<? super FlowKt__ZipKt$combine$1$1>) null), eVar, cVar);
        return a == CoroutineSingletons.COROUTINE_SUSPENDED ? a : C19394m.f43287a;
    }
}
