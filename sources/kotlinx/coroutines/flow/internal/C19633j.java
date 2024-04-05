package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p753kq.C19862q;

/* renamed from: kotlinx.coroutines.flow.internal.j */
public final class C19633j implements C19597d<Object> {

    /* renamed from: b */
    public final /* synthetic */ C19862q f43597b;

    public C19633j(C19862q qVar) {
        this.f43597b = qVar;
    }

    public final Object collect(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.f43597b, eVar, (C19340c<? super FlowCoroutineKt$scopedFlow$1$1>) null);
        C19632i iVar = new C19632i(cVar, cVar.getContext());
        Object o0 = C19543e0.m33325o0(iVar, iVar, flowCoroutineKt$scopedFlow$1$1);
        return o0 == CoroutineSingletons.COROUTINE_SUSPENDED ? o0 : C19394m.f43287a;
    }
}
