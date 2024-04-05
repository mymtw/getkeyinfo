package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;
import p753kq.C19857l;

final class BackdropScaffoldKt$rememberBackdropScaffoldState$3 extends Lambda implements C19846a<C1175d> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ C19857l<BackdropValue, Boolean> $confirmStateChange;
    public final /* synthetic */ BackdropValue $initialValue;
    public final /* synthetic */ C1254t1 $snackbarHostState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldKt$rememberBackdropScaffoldState$3(BackdropValue backdropValue, C0422e<Float> eVar, C19857l<? super BackdropValue, Boolean> lVar, C1254t1 t1Var) {
        super(0);
        this.$initialValue = backdropValue;
        this.$animationSpec = eVar;
        this.$confirmStateChange = lVar;
        this.$snackbarHostState = t1Var;
    }

    public final C1175d invoke() {
        return new C1175d(this.$initialValue, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
