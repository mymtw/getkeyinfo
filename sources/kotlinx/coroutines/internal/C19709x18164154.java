package kotlinx.coroutines.internal;

import androidx.compose.foundation.layout.C0761x;
import java.lang.reflect.Constructor;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2 */
public final class C19709x18164154 extends Lambda implements C19857l<Throwable, Throwable> {
    public final /* synthetic */ Constructor $constructor$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19709x18164154(Constructor constructor) {
        super(1);
        this.$constructor$inlined = constructor;
    }

    public final Throwable invoke(Throwable th) {
        Object obj;
        try {
            Object newInstance = this.$constructor$inlined.newInstance(new Object[]{th});
            if (newInstance != null) {
                obj = Result.m35480constructorimpl((Throwable) newInstance);
                if (Result.m35485isFailureimpl(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        } catch (Throwable th2) {
            obj = Result.m35480constructorimpl(C0761x.m1673J(th2));
        }
    }
}
