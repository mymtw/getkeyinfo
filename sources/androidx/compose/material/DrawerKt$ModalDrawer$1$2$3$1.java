package androidx.compose.material;

import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class DrawerKt$ModalDrawer$1$2$3$1 extends Lambda implements C19846a<Float> {
    public final /* synthetic */ C1206k0 $drawerState;
    public final /* synthetic */ float $maxValue;
    public final /* synthetic */ float $minValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DrawerKt$ModalDrawer$1$2$3$1(float f, float f2, C1206k0 k0Var) {
        super(0);
        this.$minValue = f;
        this.$maxValue = f2;
        this.$drawerState = k0Var;
    }

    public final Float invoke() {
        float f = this.$minValue;
        float f2 = this.$maxValue;
        float floatValue = ((Number) this.$drawerState.f2507a.f2282e.getValue()).floatValue();
        float f3 = DrawerKt.f2203a;
        return Float.valueOf(C19388s.m32831L((floatValue - f) / (f2 - f), 0.0f, 1.0f));
    }
}
