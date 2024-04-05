package androidx.compose.p015ui.platform;

import android.content.Context;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 */
final class AndroidCompositionLocals_androidKt$obtainImageVectorCache$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C1783x477bcb35 $callbacks;
    public final /* synthetic */ Context $context;

    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$obtainImageVectorCache$1$a */
    public static final class C1782a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ Context f3993a;

        /* renamed from: b */
        public final /* synthetic */ C1783x477bcb35 f3994b;

        public C1782a(Context context, C1783x477bcb35 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) {
            this.f3993a = context;
            this.f3994b = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
        }

        public final void dispose() {
            this.f3993a.getApplicationContext().unregisterComponentCallbacks(this.f3994b);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$obtainImageVectorCache$1(Context context, C1783x477bcb35 androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1) {
        super(1);
        this.$context = context;
        this.$callbacks = androidCompositionLocals_androidKt$obtainImageVectorCache$callbacks$1$1;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        this.$context.getApplicationContext().registerComponentCallbacks(this.$callbacks);
        return new C1782a(this.$context, this.$callbacks);
    }
}
