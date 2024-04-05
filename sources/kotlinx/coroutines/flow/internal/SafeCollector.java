package kotlinx.coroutines.flow.internal;

import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.input.C1993m;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19453g;
import kotlinx.coroutines.flow.C19600e;
import p744gq.C19059b;

public final class SafeCollector<T> extends ContinuationImpl implements C19600e<T> {
    public final CoroutineContext collectContext;
    public final int collectContextSize;
    public final C19600e<T> collector;
    private C19340c<? super C19394m> completion;
    private CoroutineContext lastEmissionContext;

    public SafeCollector(C19600e<? super T> eVar, CoroutineContext coroutineContext) {
        super(C19636l.f43598b, EmptyCoroutineContext.INSTANCE);
        this.collector = eVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.fold(0, SafeCollector$collectContextSize$1.INSTANCE)).intValue();
    }

    /* renamed from: b */
    public final Object mo72364b(C19340c<? super C19394m> cVar, T t) {
        CoroutineContext context = cVar.getContext();
        C1993m.m4379y(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            if (coroutineContext instanceof C19631h) {
                StringBuilder h = C0072d.m201h("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception ");
                h.append(((C19631h) coroutineContext).f43595b);
                h.append(", but then emission attempt of value '");
                h.append(t);
                h.append("' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
                throw new IllegalStateException(C19453g.m33013Q0(h.toString()).toString());
            } else if (((Number) context.fold(0, new SafeCollector_commonKt$checkContext$result$1(this))).intValue() == this.collectContextSize) {
                this.lastEmissionContext = context;
            } else {
                StringBuilder h2 = C0072d.m201h("Flow invariant is violated:\n\t\tFlow was collected in ");
                h2.append(this.collectContext);
                h2.append(",\n\t\tbut emission happened in ");
                h2.append(context);
                h2.append(".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead");
                throw new IllegalStateException(h2.toString().toString());
            }
        }
        this.completion = cVar;
        Object invoke = SafeCollectorKt.f43583a.invoke(this.collector, t, this);
        if (!C19383o.m32792b(invoke, CoroutineSingletons.COROUTINE_SUSPENDED)) {
            this.completion = null;
        }
        return invoke;
    }

    public Object emit(T t, C19340c<? super C19394m> cVar) {
        try {
            Object b = mo72364b(cVar, t);
            return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : C19394m.f43287a;
        } catch (Throwable th) {
            this.lastEmissionContext = new C19631h(th, cVar.getContext());
            throw th;
        }
    }

    public C19059b getCallerFrame() {
        C19340c<? super C19394m> cVar = this.completion;
        if (cVar instanceof C19059b) {
            return (C19059b) cVar;
        }
        return null;
    }

    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.INSTANCE : coroutineContext;
    }

    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public Object invokeSuspend(Object obj) {
        Throwable r0 = Result.m35483exceptionOrNullimpl(obj);
        if (r0 != null) {
            this.lastEmissionContext = new C19631h(r0, getContext());
        }
        C19340c<? super C19394m> cVar = this.completion;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
