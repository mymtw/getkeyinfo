package com.etsy.android.util;

import androidx.compose.p015ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1333i1;
import androidx.compose.runtime.C1338j0;
import androidx.lifecycle.C2869k;
import androidx.lifecycle.C2887s;
import androidx.lifecycle.Lifecycle;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import kotlinx.coroutines.flow.C19655n0;
import kotlinx.coroutines.flow.C19662p1;
import kotlinx.coroutines.flow.C19670s0;
import kotlinx.coroutines.flow.C19682v1;
import kotlinx.coroutines.flow.C19689x1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p753kq.C19857l;

/* renamed from: com.etsy.android.util.v */
public final class C12065v {
    /* renamed from: a */
    public static final C1338j0 m19873a(C19689x1 x1Var, C1302d dVar) {
        C19383o.m32797g(x1Var, "<this>");
        dVar.mo5465u(2142853753);
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        Object value = x1Var.getValue();
        dVar.mo5465u(980962046);
        dVar.mo5465u(-915708185);
        C2887s sVar = (C2887s) dVar.mo5410J(AndroidCompositionLocals_androidKt.f3989d);
        dVar.mo5465u(511388516);
        boolean I = dVar.mo5408I(x1Var) | dVar.mo5408I(sVar);
        Object v = dVar.mo5467v();
        if (I || v == C1302d.C1303a.f2828a) {
            Lifecycle lifecycle = sVar.getLifecycle();
            C19383o.m32796f(lifecycle, "lifecycleOwner.lifecycle");
            v = C2869k.m6799a(x1Var, lifecycle, Lifecycle.State.STARTED);
            dVar.mo5454o(v);
        }
        dVar.mo5406H();
        dVar.mo5406H();
        C1338j0 a = C1333i1.m2795a((C19597d) v, value, emptyCoroutineContext, dVar, 520);
        dVar.mo5406H();
        dVar.mo5406H();
        return a;
    }

    /* renamed from: b */
    public static final C19662p1 m19874b(StateFlowImpl stateFlowImpl, C19525d0 d0Var, C19857l lVar) {
        C19383o.m32797g(lVar, "transform");
        return C19670s0.m33430a(C19655n0.m33426a(stateFlowImpl, new LifecycleExtensionsKt$mapState$1(lVar, (C19340c<? super LifecycleExtensionsKt$mapState$1>) null)), d0Var, C19682v1.C19683a.f43630a, lVar.invoke(stateFlowImpl.getValue()));
    }
}
