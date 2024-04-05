package androidx.lifecycle;

import androidx.compose.p015ui.text.input.C1993m;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;

/* renamed from: androidx.lifecycle.d */
public final class C2850d implements Closeable, C19525d0 {

    /* renamed from: b */
    public final CoroutineContext f6468b;

    public C2850d(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        this.f6468b = coroutineContext;
    }

    public final void close() {
        C1993m.m4372r(this.f6468b, (CancellationException) null);
    }

    public final CoroutineContext getCoroutineContext() {
        return this.f6468b;
    }
}
