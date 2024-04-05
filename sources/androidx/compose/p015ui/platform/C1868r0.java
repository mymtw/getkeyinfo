package androidx.compose.p015ui.platform;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.C1449e;
import androidx.compose.runtime.C1351n1;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import p753kq.C19861p;

/* renamed from: androidx.compose.ui.platform.r0 */
public final class C1868r0 implements C1449e {

    /* renamed from: b */
    public final ParcelableSnapshotMutableState f4130b = C0761x.m1751w0(Float.valueOf(1.0f), C1351n1.f2948a);

    public final <R> R fold(R r, C19861p<? super R, ? super CoroutineContext.C19335a, ? extends R> pVar) {
        C19383o.m32797g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    public final <E extends CoroutineContext.C19335a> E get(CoroutineContext.C19337b<E> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32671a(this, bVar);
    }

    public final CoroutineContext minusKey(CoroutineContext.C19337b<?> bVar) {
        C19383o.m32797g(bVar, "key");
        return CoroutineContext.C19335a.C19336a.m32672b(this, bVar);
    }

    public final CoroutineContext plus(CoroutineContext coroutineContext) {
        C19383o.m32797g(coroutineContext, ResponseConstants.CONTEXT);
        return CoroutineContext.DefaultImpls.m32670a(this, coroutineContext);
    }

    /* renamed from: r */
    public final float mo6178r() {
        return ((Number) this.f4130b.getValue()).floatValue();
    }
}
