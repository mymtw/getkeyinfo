package p605kk;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C15128x4;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: kk.j */
public final class C18126j {
    /* renamed from: a */
    public static <TResult> TResult m30613a(C18123g<TResult> gVar) throws ExecutionException, InterruptedException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(gVar, "Task must not be null");
        if (gVar.mo69667n()) {
            return m30619g(gVar);
        }
        C18128l lVar = new C18128l();
        C18141y yVar = C18125i.f39568b;
        gVar.mo69658e(yVar, lVar);
        gVar.mo69657d(yVar, lVar);
        gVar.mo69654a(yVar, lVar);
        lVar.f39570b.await();
        return m30619g(gVar);
    }

    /* renamed from: b */
    public static <TResult> TResult m30614b(C18123g<TResult> gVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        Preconditions.checkNotMainThread();
        Preconditions.checkNotNull(gVar, "Task must not be null");
        Preconditions.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (gVar.mo69667n()) {
            return m30619g(gVar);
        }
        C18128l lVar = new C18128l();
        C18141y yVar = C18125i.f39568b;
        gVar.mo69658e(yVar, lVar);
        gVar.mo69657d(yVar, lVar);
        gVar.mo69654a(yVar, lVar);
        if (lVar.f39570b.await(j, timeUnit)) {
            return m30619g(gVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    /* renamed from: c */
    public static C18117a0 m30615c(Executor executor, Callable callable) {
        Preconditions.checkNotNull(executor, "Executor must not be null");
        Preconditions.checkNotNull(callable, "Callback must not be null");
        C18117a0 a0Var = new C18117a0();
        executor.execute(new C15128x4((Object) a0Var, (Object) callable, 3));
        return a0Var;
    }

    /* renamed from: d */
    public static C18117a0 m30616d(Exception exc) {
        C18117a0 a0Var = new C18117a0();
        a0Var.mo69672s(exc);
        return a0Var;
    }

    /* renamed from: e */
    public static C18117a0 m30617e(Object obj) {
        C18117a0 a0Var = new C18117a0();
        a0Var.mo69673t(obj);
        return a0Var;
    }

    /* renamed from: f */
    public static C18123g<List<C18123g<?>>> m30618f(C18123g<?>... gVarArr) {
        C18117a0 a0Var;
        if (gVarArr.length == 0) {
            return m30617e(Collections.emptyList());
        }
        List<C18123g> asList = Arrays.asList(gVarArr);
        if (asList == null || asList.isEmpty()) {
            return m30617e(Collections.emptyList());
        }
        if (asList.isEmpty()) {
            a0Var = m30617e((Object) null);
        } else {
            for (C18123g gVar : asList) {
                if (gVar == null) {
                    throw new NullPointerException("null tasks are not accepted");
                }
            }
            a0Var = new C18117a0();
            C18129m mVar = new C18129m(asList.size(), a0Var);
            for (C18123g gVar2 : asList) {
                C18141y yVar = C18125i.f39568b;
                gVar2.mo69658e(yVar, mVar);
                gVar2.mo69657d(yVar, mVar);
                gVar2.mo69654a(yVar, mVar);
            }
        }
        return a0Var.mo69662i(C18125i.f39567a, new C18127k(asList));
    }

    /* renamed from: g */
    public static <TResult> TResult m30619g(C18123g<TResult> gVar) throws ExecutionException {
        if (gVar.mo69668o()) {
            return gVar.mo69664k();
        }
        if (gVar.mo69666m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(gVar.mo69663j());
    }
}
