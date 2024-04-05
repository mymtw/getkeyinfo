package androidx.compose.material;

import androidx.compose.runtime.C1416u0;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.collections.C19324q;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

public final class SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1 extends Lambda implements C19846a<C19394m> {
    public final /* synthetic */ C1251s1 $key;
    public final /* synthetic */ C1257u0<C1251s1> $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$FadeInFadeOutWithScale$1$1$opacity$1(C1251s1 s1Var, C1257u0<C1251s1> u0Var) {
        super(0);
        this.$key = s1Var;
        this.$state = u0Var;
    }

    public final void invoke() {
        if (!C19383o.m32792b(this.$key, this.$state.f2627a)) {
            ArrayList arrayList = this.$state.f2628b;
            final C1251s1 s1Var = this.$key;
            C19324q.m32631M0(new C19857l<C1253t0<C1251s1>, Boolean>() {
                public final Boolean invoke(C1253t0<C1251s1> t0Var) {
                    C19383o.m32797g(t0Var, "it");
                    return Boolean.valueOf(C19383o.m32792b(t0Var.f2614a, s1Var));
                }
            }, arrayList);
            C1416u0 u0Var = this.$state.f2629c;
            if (u0Var != null) {
                u0Var.invalidate();
            }
        }
    }
}
