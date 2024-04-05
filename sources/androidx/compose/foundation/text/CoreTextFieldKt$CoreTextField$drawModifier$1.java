package androidx.compose.foundation.text;

import androidx.activity.C0114h;
import androidx.compose.p015ui.graphics.C1516e;
import androidx.compose.p015ui.graphics.C1537o;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p297z.C8412e;
import p753kq.C19857l;

public final class CoreTextFieldKt$CoreTextField$drawModifier$1 extends Lambda implements C19857l<C8412e, C19394m> {
    public final /* synthetic */ C1994n $offsetMapping;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$drawModifier$1(TextFieldState textFieldState, TextFieldValue textFieldValue, C1994n nVar) {
        super(1);
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$offsetMapping = nVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C8412e) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C8412e eVar) {
        int b;
        int b2;
        C19383o.m32797g(eVar, "$this$drawBehind");
        C0965r c = this.$state.mo4562c();
        if (c != null) {
            TextFieldValue textFieldValue = this.$value;
            C1994n nVar = this.$offsetMapping;
            TextFieldState textFieldState = this.$state;
            C1537o a = eVar.mo6900C0().mo20991a();
            C2021q qVar = c.f2042a;
            C1516e eVar2 = textFieldState.f1960q;
            C19383o.m32797g(a, "canvas");
            C19383o.m32797g(textFieldValue, "value");
            C19383o.m32797g(nVar, "offsetMapping");
            C19383o.m32797g(qVar, "textLayoutResult");
            C19383o.m32797g(eVar2, "selectionPaint");
            if (!C2022r.m4463b(textFieldValue.f4449b) && (b = nVar.mo7684b(C2022r.m4466e(textFieldValue.f4449b))) != (b2 = nVar.mo7684b(C2022r.m4465d(textFieldValue.f4449b)))) {
                a.mo6267u(qVar.f4590b.mo7467a(b, b2), eVar2);
            }
            C0114h.m318s0(a, qVar);
        }
    }
}
