package androidx.compose.p015ui.viewinterop;

import androidx.compose.p015ui.node.C1754s;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import androidx.compose.runtime.saveable.C1369e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3 */
final class AndroidView_androidKt$AndroidView$3 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ String $stateKey;
    public final /* synthetic */ C1369e $stateRegistry;
    public final /* synthetic */ C1754s<ViewFactoryHolder<Object>> $viewFactoryHolderRef;

    /* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$AndroidView$3$a */
    public static final class C2072a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C1369e.C1370a f4700a;

        public C2072a(C1369e.C1370a aVar) {
            this.f4700a = aVar;
        }

        public final void dispose() {
            this.f4700a.mo5927a();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidView_androidKt$AndroidView$3(C1369e eVar, String str, C1754s<ViewFactoryHolder<Object>> sVar) {
        super(1);
        this.$stateRegistry = eVar;
        this.$stateKey = str;
        this.$viewFactoryHolderRef = sVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C2072a(this.$stateRegistry.mo5924b(this.$stateKey, new AndroidView_androidKt$AndroidView$3$valueProvider$1(this.$viewFactoryHolderRef)));
    }
}
