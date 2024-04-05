package androidx.compose.material;

import androidx.compose.animation.core.C0422e;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class BackdropScaffoldState$Companion$Saver$2 extends Lambda implements C19857l<BackdropValue, C1175d> {
    public final /* synthetic */ C0422e<Float> $animationSpec;
    public final /* synthetic */ C19857l<BackdropValue, Boolean> $confirmStateChange;
    public final /* synthetic */ C1254t1 $snackbarHostState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackdropScaffoldState$Companion$Saver$2(C0422e<Float> eVar, C19857l<? super BackdropValue, Boolean> lVar, C1254t1 t1Var) {
        super(1);
        this.$animationSpec = eVar;
        this.$confirmStateChange = lVar;
        this.$snackbarHostState = t1Var;
    }

    public final C1175d invoke(BackdropValue backdropValue) {
        C19383o.m32797g(backdropValue, "it");
        return new C1175d(backdropValue, this.$animationSpec, this.$confirmStateChange, this.$snackbarHostState);
    }
}
