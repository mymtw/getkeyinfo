package androidx.compose.runtime;

import android.os.Looper;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 extends Lambda implements C19846a<C1321f0> {
    public static final ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 INSTANCE = new ActualAndroid_androidKt$DefaultMonotonicFrameClock$2();

    public ActualAndroid_androidKt$DefaultMonotonicFrameClock$2() {
        super(0);
    }

    public final C1321f0 invoke() {
        if (Looper.getMainLooper() != null) {
            return DefaultChoreographerFrameClock.f2759b;
        }
        return SdkStubsFallbackFrameClock.f2790b;
    }
}
