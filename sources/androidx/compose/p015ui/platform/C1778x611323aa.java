package androidx.compose.p015ui.platform;

import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2 */
public final class C1778x611323aa extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C1839i0 $saveableStateRegistry;

    /* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$2$a */
    public static final class C1779a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C1839i0 f3992a;

        public C1779a(C1839i0 i0Var) {
            this.f3992a = i0Var;
        }

        public final void dispose() {
            this.f3992a.f4097a.invoke();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1778x611323aa(C1839i0 i0Var) {
        super(1);
        this.$saveableStateRegistry = i0Var;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C1779a(this.$saveableStateRegistry);
    }
}
