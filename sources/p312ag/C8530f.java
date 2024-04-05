package p312ag;

import android.util.Log;
import com.etsy.android.lib.models.ResponseConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Ref$ObjectRef;

/* renamed from: ag.f */
public final class C8530f implements InvocationHandler {

    /* renamed from: a */
    public final /* synthetic */ Object f18576a;

    /* renamed from: b */
    public final /* synthetic */ Ref$ObjectRef f18577b;

    /* renamed from: c */
    public final /* synthetic */ ReentrantLock f18578c;

    /* renamed from: d */
    public final /* synthetic */ Condition f18579d;

    public C8530f(Object obj, Ref$ObjectRef ref$ObjectRef, ReentrantLock reentrantLock, Condition condition) {
        this.f18576a = obj;
        this.f18577b = ref$ObjectRef;
        this.f18578c = reentrantLock;
        this.f18579d = condition;
    }

    public final Object invoke(Object obj, Method method, Object[] objArr) {
        C19383o.m32797g(method, ResponseConstants.METHOD);
        C19383o.m32797g(objArr, "objects");
        try {
            if (C19383o.m32792b(method.getName(), "onChecksumsReady") && objArr.length == 1) {
                List list = objArr[0];
                if (list instanceof List) {
                    if (list != null) {
                        for (Object next : list) {
                            if (next != null) {
                                Method method2 = next.getClass().getMethod("getSplitName", new Class[0]);
                                C19383o.m32796f(method2, "c.javaClass.getMethod(\"getSplitName\")");
                                Method method3 = next.getClass().getMethod("getType", new Class[0]);
                                C19383o.m32796f(method3, "c.javaClass.getMethod(\"getType\")");
                                if (method2.invoke(next, new Object[0]) == null && C19383o.m32792b(method3.invoke(next, new Object[0]), this.f18576a)) {
                                    Method method4 = next.getClass().getMethod("getValue", new Class[0]);
                                    C19383o.m32796f(method4, "c.javaClass.getMethod(\"getValue\")");
                                    Object invoke = method4.invoke(next, new Object[0]);
                                    if (invoke != null) {
                                        this.f18577b.element = new BigInteger(1, (byte[]) invoke).toString(16);
                                        this.f18578c.lock();
                                        this.f18579d.signalAll();
                                        this.f18578c.unlock();
                                        return null;
                                    }
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ByteArray");
                                }
                            }
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<*>");
                    }
                }
            }
        } catch (Throwable th) {
            String str = C8531g.f18580a;
            Log.d(C8531g.f18580a, "Can't fetch checksum.", th);
        }
        return null;
    }
}
