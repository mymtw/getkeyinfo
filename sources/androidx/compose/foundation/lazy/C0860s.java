package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.C0849j;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import com.etsy.android.config.flags.p073ui.C6392xb27478d3;
import com.etsy.android.config.flags.p073ui.C6393xb27478d4;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p628nj.C18263b;

/* renamed from: androidx.compose.foundation.lazy.s */
public final class C0860s implements C0859r {

    /* renamed from: a */
    public final C0849j<C0826i> f1845a;

    /* renamed from: b */
    public final C0849j f1846b;

    public C0860s() {
        C0849j<C0826i> jVar = new C0849j<>();
        this.f1845a = jVar;
        this.f1846b = jVar;
    }

    /* renamed from: a */
    public final void mo4398a(int i, C6392xb27478d3 configsListComposableKt$ConfigsList$1$invoke$$inlined$items$default$2, C6393xb27478d4 configsListComposableKt$ConfigsList$1$invoke$$inlined$items$default$3, ComposableLambdaImpl composableLambdaImpl) {
        this.f1845a.mo4389b(i, new C0826i(configsListComposableKt$ConfigsList$1$invoke$$inlined$items$default$2, configsListComposableKt$ConfigsList$1$invoke$$inlined$items$default$3, composableLambdaImpl));
    }

    /* renamed from: b */
    public final void mo4399b(Object obj, Object obj2, ComposableLambdaImpl composableLambdaImpl) {
        C19383o.m32797g(composableLambdaImpl, ResponseConstants.CONTENT);
        this.f1845a.mo4389b(1, new C0826i(obj != null ? new LazyListScopeImpl$item$1(obj) : null, new LazyListScopeImpl$item$2(obj2), C18263b.m30807B(new LazyListScopeImpl$item$3(composableLambdaImpl), -735119482, true)));
    }
}
