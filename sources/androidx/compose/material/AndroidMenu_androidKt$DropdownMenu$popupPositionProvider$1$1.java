package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1540p0;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p174m0.C7289h;
import p753kq.C19861p;

final class AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1 extends Lambda implements C19861p<C7289h, C7289h, C19394m> {
    public final /* synthetic */ C1338j0<C1540p0> $transformOriginState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidMenu_androidKt$DropdownMenu$popupPositionProvider$1$1(C1338j0<C1540p0> j0Var) {
        super(2);
        this.$transformOriginState = j0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C7289h) obj, (C7289h) obj2);
        return C19394m.f43287a;
    }

    public final void invoke(C7289h hVar, C7289h hVar2) {
        C19383o.m32797g(hVar, "parentBounds");
        C19383o.m32797g(hVar2, "menuBounds");
        this.$transformOriginState.setValue(new C1540p0(MenuKt.m2193c(hVar, hVar2)));
    }
}
