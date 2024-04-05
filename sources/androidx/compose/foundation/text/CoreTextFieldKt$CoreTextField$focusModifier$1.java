package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C0882d;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.focus.C1481o;
import androidx.compose.p015ui.text.input.C1985e;
import androidx.compose.p015ui.text.input.C1989i;
import androidx.compose.p015ui.text.input.C1990j;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.C2002t;
import androidx.compose.p015ui.text.input.C2004v;
import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineStart;
import p288y.C8343c;
import p753kq.C19857l;

public final class CoreTextFieldKt$CoreTextField$focusModifier$1 extends Lambda implements C19857l<C1481o, C19394m> {
    public final /* synthetic */ C0882d $bringIntoViewRequester;
    public final /* synthetic */ C19525d0 $coroutineScope;
    public final /* synthetic */ C1990j $imeOptions;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ C1994n $offsetMapping;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ C2002t $textInputService;
    public final /* synthetic */ TextFieldValue $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1(TextFieldState textFieldState, C2002t tVar, TextFieldValue textFieldValue, C1990j jVar, TextFieldSelectionManager textFieldSelectionManager, C19525d0 d0Var, C0882d dVar, C1994n nVar) {
        super(1);
        this.$state = textFieldState;
        this.$textInputService = tVar;
        this.$value = textFieldValue;
        this.$imeOptions = jVar;
        this.$manager = textFieldSelectionManager;
        this.$coroutineScope = d0Var;
        this.$bringIntoViewRequester = dVar;
        this.$offsetMapping = nVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C1481o) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C1481o oVar) {
        C0965r c;
        C19383o.m32797g(oVar, "it");
        if (this.$state.mo4561b() != oVar.isFocused()) {
            this.$state.f1948e.setValue(Boolean.valueOf(oVar.isFocused()));
            C2002t tVar = this.$textInputService;
            if (tVar != null) {
                TextFieldState textFieldState = this.$state;
                TextFieldValue textFieldValue = this.$value;
                C1990j jVar = this.$imeOptions;
                if (textFieldState.mo4561b()) {
                    C1985e eVar = textFieldState.f1946c;
                    C19857l<TextFieldValue, C19394m> lVar = textFieldState.f1958o;
                    C19857l<C1989i, C19394m> lVar2 = textFieldState.f1959p;
                    C19383o.m32797g(textFieldValue, "value");
                    C19383o.m32797g(eVar, "editProcessor");
                    C19383o.m32797g(jVar, "imeOptions");
                    C19383o.m32797g(lVar, "onValueChange");
                    C19383o.m32797g(lVar2, "onImeActionPerformed");
                    tVar.f4523a.mo7638b(textFieldValue, jVar, new TextFieldDelegate$Companion$restartInput$1(eVar, lVar), lVar2);
                    C2004v vVar = new C2004v(tVar, tVar.f4523a);
                    tVar.f4524b.set(vVar);
                    textFieldState.f1947d = vVar;
                } else {
                    CoreTextFieldKt.m1961e(textFieldState);
                }
                if (oVar.isFocused() && (c = this.$state.mo4562c()) != null) {
                    C19697g.m33468f(this.$coroutineScope, (CoroutineContext) null, (CoroutineStart) null, new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, c, this.$offsetMapping, (C19340c<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1>) null), 3);
                }
            }
            if (!oVar.isFocused()) {
                this.$manager.mo4648g((C8343c) null);
            }
        }
    }
}
