package kotlin.coroutines.jvm.internal;

import android.support.p013v4.media.C0072d;
import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.core.JsonPointer;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.C19394m;
import kotlin.Result;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.C19383o;
import p744gq.C19059b;
import p744gq.C19060c;
import p744gq.C19061d;

public abstract class BaseContinuationImpl implements C19340c<Object>, C19059b, Serializable {
    private final C19340c<Object> completion;

    public BaseContinuationImpl(C19340c<Object> cVar) {
        this.completion = cVar;
    }

    public C19340c<C19394m> create(C19340c<?> cVar) {
        C19383o.m32797g(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public C19059b getCallerFrame() {
        C19340c<Object> cVar = this.completion;
        if (cVar instanceof C19059b) {
            return (C19059b) cVar;
        }
        return null;
    }

    public final C19340c<Object> getCompletion() {
        return this.completion;
    }

    public abstract /* synthetic */ CoroutineContext getContext();

    public StackTraceElement getStackTraceElement() {
        int i;
        String str;
        C19060c cVar = (C19060c) getClass().getAnnotation(C19060c.class);
        String str2 = null;
        if (cVar == null) {
            return null;
        }
        int v = cVar.mo70544v();
        if (v <= 1) {
            int i2 = -1;
            try {
                Field declaredField = getClass().getDeclaredField(ResponseConstants.LABEL);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                i = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                i2 = cVar.mo70542l()[i];
            }
            C19061d.C19062a aVar = C19061d.f42557b;
            if (aVar == null) {
                try {
                    C19061d.C19062a aVar2 = new C19061d.C19062a(Class.class.getDeclaredMethod("getModule", new Class[0]), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
                    C19061d.f42557b = aVar2;
                    aVar = aVar2;
                } catch (Exception unused2) {
                    aVar = C19061d.f42556a;
                    C19061d.f42557b = aVar;
                }
            }
            if (aVar != C19061d.f42556a) {
                Method method = aVar.f42558a;
                Object invoke = method != null ? method.invoke(getClass(), new Object[0]) : null;
                if (invoke != null) {
                    Method method2 = aVar.f42559b;
                    Object invoke2 = method2 != null ? method2.invoke(invoke, new Object[0]) : null;
                    if (invoke2 != null) {
                        Method method3 = aVar.f42560c;
                        Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                        if (invoke3 instanceof String) {
                            str2 = (String) invoke3;
                        }
                    }
                }
            }
            if (str2 == null) {
                str = cVar.mo70540c();
            } else {
                str = str2 + JsonPointer.SEPARATOR + cVar.mo70540c();
            }
            return new StackTraceElement(str, cVar.mo70543m(), cVar.mo70541f(), i2);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + 1 + ", got " + v + ". Please update the Kotlin standard library.").toString());
    }

    public abstract Object invokeSuspend(Object obj);

    public void releaseIntercepted() {
    }

    public final void resumeWith(Object obj) {
        C19340c cVar = this;
        while (true) {
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            C19340c cVar2 = baseContinuationImpl.completion;
            C19383o.m32794d(cVar2);
            try {
                Object invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (invokeSuspend != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj = Result.m35480constructorimpl(invokeSuspend);
                    baseContinuationImpl.releaseIntercepted();
                    if (cVar2 instanceof BaseContinuationImpl) {
                        cVar = cVar2;
                    } else {
                        cVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                obj = Result.m35480constructorimpl(C0761x.m1673J(th));
            }
        }
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        h.append(stackTraceElement);
        return h.toString();
    }

    public C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        C19383o.m32797g(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
