package com.paypal.pyplcheckout.extensions;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19614i1;
import kotlinx.coroutines.flow.C19655n0;
import kotlinx.coroutines.flow.C19656n1;
import kotlinx.coroutines.flow.C19670s0;
import kotlinx.coroutines.flow.C19682v1;
import kotlinx.coroutines.flow.C19689x1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;
import p753kq.C19863r;
import p753kq.C19864s;

public final class FlowExtensionsKt {
    public static final <T> Object emitOnce(C19656n1<T> n1Var, T t, C19340c<? super C19394m> cVar) {
        if (C19383o.m32792b(t, n1Var.getValue())) {
            return C19394m.f43287a;
        }
        Object emit = n1Var.emit(t, cVar);
        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : C19394m.f43287a;
    }

    public static final <T, R> C19689x1<R> mapState(C19689x1<? extends T> x1Var, C19525d0 d0Var, C19857l<? super T, ? extends R> lVar) {
        C19383o.m32797g(x1Var, "<this>");
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(lVar, "transform");
        return C19670s0.m33430a(C19655n0.m33426a(x1Var, new FlowExtensionsKt$mapState$1(lVar, (C19340c<? super FlowExtensionsKt$mapState$1>) null)), d0Var, new StartedWhileSubscribed(0, Long.MAX_VALUE), lVar.invoke(x1Var.getValue()));
    }

    public static final <T1, T2, R> C19689x1<R> merge(C19689x1<? extends T1> x1Var, C19525d0 d0Var, C19689x1<? extends T2> x1Var2, C19861p<? super T1, ? super T2, ? extends R> pVar) {
        C19383o.m32797g(x1Var, "<this>");
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(x1Var2, "other");
        C19383o.m32797g(pVar, "transform");
        return C19670s0.m33430a(new C19614i1(x1Var, x1Var2, new FlowExtensionsKt$merge$1(pVar, (C19340c<? super FlowExtensionsKt$merge$1>) null)), d0Var, C19682v1.C19683a.f43630a, pVar.invoke(x1Var.getValue(), x1Var2.getValue()));
    }

    public static final <T1, T2, T3, R> C19689x1<R> merge(C19689x1<? extends T1> x1Var, C19525d0 d0Var, C19689x1<? extends T2> x1Var2, C19689x1<? extends T3> x1Var3, C19862q<? super T1, ? super T2, ? super T3, ? extends R> qVar) {
        C19383o.m32797g(x1Var, "<this>");
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(x1Var2, "state1");
        C19383o.m32797g(x1Var3, "state2");
        C19383o.m32797g(qVar, "transform");
        return C19670s0.m33430a(new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1(new C19597d[]{x1Var, x1Var2, x1Var3}, new FlowExtensionsKt$merge$2(qVar, (C19340c<? super FlowExtensionsKt$merge$2>) null)), d0Var, C19682v1.C19683a.f43630a, qVar.invoke(x1Var.getValue(), x1Var2.getValue(), x1Var3.getValue()));
    }

    public static final <T1, T2, T3, T4, R> C19689x1<R> merge(C19689x1<? extends T1> x1Var, C19525d0 d0Var, C19689x1<? extends T2> x1Var2, C19689x1<? extends T3> x1Var3, C19689x1<? extends T4> x1Var4, C19863r<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> rVar) {
        C19383o.m32797g(x1Var, "<this>");
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(x1Var2, "state1");
        C19383o.m32797g(x1Var3, "state2");
        C19383o.m32797g(x1Var4, "state3");
        C19383o.m32797g(rVar, "transform");
        return C19670s0.m33430a(new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2(new C19597d[]{x1Var, x1Var2, x1Var3, x1Var4}, new FlowExtensionsKt$merge$3(rVar, (C19340c<? super FlowExtensionsKt$merge$3>) null)), d0Var, C19682v1.C19683a.f43630a, rVar.invoke(x1Var.getValue(), x1Var2.getValue(), x1Var3.getValue(), x1Var4.getValue()));
    }

    public static final <T1, T2, T3, T4, T5, R> C19689x1<R> merge(C19689x1<? extends T1> x1Var, C19525d0 d0Var, C19689x1<? extends T2> x1Var2, C19689x1<? extends T3> x1Var3, C19689x1<? extends T4> x1Var4, C19689x1<? extends T5> x1Var5, C19864s<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> sVar) {
        C19383o.m32797g(x1Var, "<this>");
        C19383o.m32797g(d0Var, "scope");
        C19383o.m32797g(x1Var2, "state1");
        C19383o.m32797g(x1Var3, "state2");
        C19383o.m32797g(x1Var4, "state3");
        C19383o.m32797g(x1Var5, "state4");
        C19383o.m32797g(sVar, "transform");
        return C19670s0.m33430a(new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3(new C19597d[]{x1Var, x1Var2, x1Var3, x1Var4, x1Var5}, new FlowExtensionsKt$merge$4(sVar, (C19340c<? super FlowExtensionsKt$merge$4>) null)), d0Var, C19682v1.C19683a.f43630a, sVar.invoke(x1Var.getValue(), x1Var2.getValue(), x1Var3.getValue(), x1Var4.getValue(), x1Var5.getValue()));
    }
}
