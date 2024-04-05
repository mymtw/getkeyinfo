package kotlinx.coroutines.internal;

import androidx.compose.foundation.layout.C0761x;
import java.lang.reflect.Constructor;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3 */
public final class C19710x18164155 extends Lambda implements C19857l<Throwable, Throwable> {
    public final /* synthetic */ Constructor $constructor$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19710x18164155(Constructor constructor) {
        super(1);
        this.$constructor$inlined = constructor;
    }

    public final Throwable invoke(Throwable th) {
        Object obj;
        try {
            Object newInstance = this.$constructor$inlined.newInstance(new Object[]{th.getMessage()});
            if (newInstance != null) {
                Throwable th2 = (Throwable) newInstance;
                th2.initCause(th);
                obj = Result.m35480constructorimpl(th2);
                if (Result.m35485isFailureimpl(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        } catch (Throwable th3) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th3));
        }
    }
}
