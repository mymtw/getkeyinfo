package androidx.compose.material;

import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p753kq.C19846a;
import p753kq.C19857l;

final class DrawerKt$Scrim$1$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ long $color;
    public final /* synthetic */ C19846a<Float> $fraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$Scrim$1$1(long j, C19846a<Float> aVar) {
        super(1);
        this.$color = j;
        this.$fraction = aVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        C19383o.m32797g(eVar, "$this$Canvas");
        C8412e.m16785N(eVar, this.$color, 0, 0, this.$fraction.invoke().floatValue(), 118);
    }
}
