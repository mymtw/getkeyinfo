package kotlinx.coroutines.flow.internal;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.C19543e0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19600e;
import p753kq.C19846a;
import p753kq.C19862q;

/* renamed from: kotlinx.coroutines.flow.internal.g */
public final class C19630g {
    /* renamed from: a */
    public static final Object m33418a(C19597d[] dVarArr, C19846a aVar, C19862q qVar, C19600e eVar, C19340c cVar) {
        CombineKt$combineInternal$2 combineKt$combineInternal$2 = new CombineKt$combineInternal$2(dVarArr, aVar, qVar, eVar, (C19340c<? super CombineKt$combineInternal$2>) null);
        C19632i iVar = new C19632i(cVar, cVar.getContext());
        Object o0 = C19543e0.m33325o0(iVar, iVar, combineKt$combineInternal$2);
        return o0 == CoroutineSingletons.COROUTINE_SUSPENDED ? o0 : C19394m.f43287a;
    }
}
