package androidx.compose.animation;

import androidx.compose.p015ui.platform.C1859o0;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.animation.AnimatedVisibilityScope$animateEnterExit$$inlined$debugInspectorInfo$1 */
public final class C0380x599743f2 extends Lambda implements C19857l<C1859o0, C19394m> {
    public final /* synthetic */ C0473i $enter$inlined;
    public final /* synthetic */ C0475k $exit$inlined;
    public final /* synthetic */ String $label$inlined;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0380x599743f2(C0473i iVar, C0475k kVar, String str) {
        super(1);
        this.$enter$inlined = iVar;
        this.$exit$inlined = kVar;
        this.$label$inlined = str;
    }

    public final void invoke(C1859o0 o0Var) {
        C19383o.m32797g(o0Var, "$this$null");
        o0Var.f4114b.mo7222b(this.$enter$inlined, "enter");
        o0Var.f4114b.mo7222b(this.$exit$inlined, "exit");
        o0Var.f4114b.mo7222b(this.$label$inlined, ResponseConstants.LABEL);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1859o0) obj);
        return C19394m.f43287a;
    }
}
