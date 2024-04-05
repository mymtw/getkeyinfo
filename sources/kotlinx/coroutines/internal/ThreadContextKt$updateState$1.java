package kotlinx.coroutines.internal;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19841y1;
import p753kq.C19861p;

public final class ThreadContextKt$updateState$1 extends Lambda implements C19861p<C19742z, CoroutineContext.C19335a, C19742z> {
    public static final ThreadContextKt$updateState$1 INSTANCE = new ThreadContextKt$updateState$1();

    public ThreadContextKt$updateState$1() {
        super(2);
    }

    public final C19742z invoke(C19742z zVar, CoroutineContext.C19335a aVar) {
        if (aVar instanceof C19841y1) {
            C19841y1<Object> y1Var = (C19841y1) aVar;
            Object x0 = y1Var.mo72122x0(zVar.f43694a);
            Object[] objArr = zVar.f43695b;
            int i = zVar.f43697d;
            objArr[i] = x0;
            C19841y1<Object>[] y1VarArr = zVar.f43696c;
            zVar.f43697d = i + 1;
            y1VarArr[i] = y1Var;
        }
        return zVar;
    }
}
