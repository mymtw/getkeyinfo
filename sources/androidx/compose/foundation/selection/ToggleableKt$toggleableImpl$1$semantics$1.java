package androidx.compose.foundation.selection;

import androidx.compose.p015ui.semantics.C1900g;
import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import androidx.compose.p015ui.state.ToggleableState;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19846a;
import p753kq.C19857l;

public final class ToggleableKt$toggleableImpl$1$semantics$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C19846a<C19394m> $onClick;
    public final /* synthetic */ C1900g $role;
    public final /* synthetic */ ToggleableState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToggleableKt$toggleableImpl$1$semantics$1(C1900g gVar, ToggleableState toggleableState, boolean z, C19846a<C19394m> aVar) {
        super(1);
        this.$role = gVar;
        this.$state = toggleableState;
        this.$enabled = z;
        this.$onClick = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        C1900g gVar = this.$role;
        if (gVar != null) {
            C1908o.m4202i(qVar, gVar.f4226a);
        }
        ToggleableState toggleableState = this.$state;
        C19410j<Object>[] jVarArr = C1908o.f4253a;
        C19383o.m32797g(toggleableState, "<set-?>");
        C1908o.f4267o.mo7356a(qVar, C1908o.f4253a[15], toggleableState);
        final C19846a<C19394m> aVar = this.$onClick;
        C1908o.m4198e(qVar, (String) null, new C19846a<Boolean>() {
            public final Boolean invoke() {
                aVar.invoke();
                return Boolean.TRUE;
            }
        });
        if (!this.$enabled) {
            C1908o.m4195b(qVar);
        }
    }
}
