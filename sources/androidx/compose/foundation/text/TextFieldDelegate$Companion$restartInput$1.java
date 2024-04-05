package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.input.C1984d;
import androidx.compose.p015ui.text.input.C1985e;
import androidx.compose.p015ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

final class TextFieldDelegate$Companion$restartInput$1 extends Lambda implements C19857l<List<? extends C1984d>, C19394m> {
    public final /* synthetic */ C1985e $editProcessor;
    public final /* synthetic */ C19857l<TextFieldValue, C19394m> $onValueChange;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldDelegate$Companion$restartInput$1(C1985e eVar, C19857l<? super TextFieldValue, C19394m> lVar) {
        super(1);
        this.$editProcessor = eVar;
        this.$onValueChange = lVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends C1984d>) (List) obj);
        return C19394m.f43287a;
    }

    public final void invoke(List<? extends C1984d> list) {
        C19383o.m32797g(list, "it");
        this.$onValueChange.invoke(this.$editProcessor.mo7657a(list));
    }
}
