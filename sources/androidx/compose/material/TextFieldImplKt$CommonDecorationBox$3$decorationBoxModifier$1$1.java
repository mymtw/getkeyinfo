package androidx.compose.material;

import androidx.compose.p015ui.semantics.C1908o;
import androidx.compose.p015ui.semantics.C1910q;
import androidx.compose.p015ui.semantics.SemanticsProperties;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.C19410j;
import p753kq.C19857l;

public final class TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1 extends Lambda implements C19857l<C1910q, C19394m> {
    public final /* synthetic */ String $defaultErrorMessage;
    public final /* synthetic */ boolean $isError;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decorationBoxModifier$1$1(boolean z, String str) {
        super(1);
        this.$isError = z;
        this.$defaultErrorMessage = str;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1910q) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1910q qVar) {
        C19383o.m32797g(qVar, "$this$semantics");
        if (this.$isError) {
            String str = this.$defaultErrorMessage;
            C19410j<Object>[] jVarArr = C1908o.f4253a;
            C19383o.m32797g(str, "description");
            qVar.mo7342a(SemanticsProperties.f4215z, str);
        }
    }
}
