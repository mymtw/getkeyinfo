package androidx.compose.animation;

import androidx.compose.p015ui.C1436d;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class AnimatedVisibilityScope$animateEnterExit$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ C0473i $enter;
    public final /* synthetic */ C0475k $exit;
    public final /* synthetic */ String $label;
    public final /* synthetic */ C0468d this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedVisibilityScope$animateEnterExit$2(C0468d dVar, C0473i iVar, C0475k kVar, String str) {
        super(3);
        this.this$0 = dVar;
        this.$enter = iVar;
        this.$exit = kVar;
        this.$label = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(1840112047);
        C1436d i0 = dVar.mo6148i0(EnterExitTransitionKt.m1032a(this.this$0.mo3542a(), this.$enter, this.$exit, this.$label, dVar2, 0));
        dVar2.mo5406H();
        return i0;
    }
}
