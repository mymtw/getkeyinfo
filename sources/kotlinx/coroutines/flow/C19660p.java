package kotlinx.coroutines.flow;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* renamed from: kotlinx.coroutines.flow.p */
public final class C19660p implements C19597d<Object> {

    /* renamed from: b */
    public final /* synthetic */ Object f43607b;

    public C19660p(SharingCommand sharingCommand) {
        this.f43607b = sharingCommand;
    }

    public final Object collect(C19600e<Object> eVar, C19340c<? super C19394m> cVar) {
        Object emit = eVar.emit(this.f43607b, cVar);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : C19394m.f43287a;
    }
}
