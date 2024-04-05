package kotlin;

import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p753kq.C19846a;

/* renamed from: kotlin.d */
public class C19350d {

    /* renamed from: kotlin.d$a */
    public /* synthetic */ class C19351a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43198a;

        static {
            int[] iArr = new int[LazyThreadSafetyMode.values().length];
            iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
            iArr[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
            iArr[LazyThreadSafetyMode.NONE.ordinal()] = 3;
            f43198a = iArr;
        }
    }

    /* renamed from: a */
    public static final <T> C19285c<T> m32676a(LazyThreadSafetyMode lazyThreadSafetyMode, C19846a<? extends T> aVar) {
        C19383o.m32797g(lazyThreadSafetyMode, "mode");
        C19383o.m32797g(aVar, "initializer");
        int i = C19351a.f43198a[lazyThreadSafetyMode.ordinal()];
        if (i == 1) {
            return new SynchronizedLazyImpl(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
        }
        if (i == 2) {
            return new SafePublicationLazyImpl(aVar);
        }
        if (i == 3) {
            return new UnsafeLazyImpl(aVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: b */
    public static final <T> C19285c<T> m32677b(C19846a<? extends T> aVar) {
        C19383o.m32797g(aVar, "initializer");
        return new SynchronizedLazyImpl(aVar, (Object) null, 2, (DefaultConstructorMarker) null);
    }
}
