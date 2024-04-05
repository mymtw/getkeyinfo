package kotlinx.coroutines.reactive;

import java.util.ServiceLoader;
import kotlin.sequences.C19435k;
import kotlin.sequences.SequencesKt___SequencesKt;

/* renamed from: kotlinx.coroutines.reactive.e */
public final class C19779e {

    /* renamed from: a */
    public static final C19776b[] f43739a;

    static {
        Class<C19776b> cls = C19776b.class;
        Object[] array = SequencesKt___SequencesKt.m32988s1(C19435k.m33000j1(ServiceLoader.load(cls, cls.getClassLoader()).iterator())).toArray(new C19776b[0]);
        if (array != null) {
            f43739a = (C19776b[]) array;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }
}
