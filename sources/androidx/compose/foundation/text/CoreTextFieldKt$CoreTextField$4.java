package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.input.C1985e;
import androidx.compose.p015ui.text.input.C1989i;
import androidx.compose.p015ui.text.input.C1990j;
import androidx.compose.p015ui.text.input.C2002t;
import androidx.compose.p015ui.text.input.C2004v;
import androidx.compose.p015ui.text.input.TextFieldValue;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class CoreTextFieldKt$CoreTextField$4 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C1990j $imeOptions;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ C2002t $textInputService;
    public final /* synthetic */ TextFieldValue $value;

    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$4$a */
    public static final class C0900a implements C1358r {
        public final void dispose() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$4(C2002t tVar, TextFieldState textFieldState, TextFieldValue textFieldValue, C1990j jVar) {
        super(1);
        this.$textInputService = tVar;
        this.$state = textFieldState;
        this.$value = textFieldValue;
        this.$imeOptions = jVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        if (this.$textInputService != null && this.$state.mo4561b()) {
            TextFieldState textFieldState = this.$state;
            C2002t tVar = this.$textInputService;
            TextFieldValue textFieldValue = this.$value;
            C1985e eVar = textFieldState.f1946c;
            C1990j jVar = this.$imeOptions;
            C19857l<TextFieldValue, C19394m> lVar = textFieldState.f1958o;
            C19857l<C1989i, C19394m> lVar2 = textFieldState.f1959p;
            C19383o.m32797g(tVar, "textInputService");
            C19383o.m32797g(textFieldValue, "value");
            C19383o.m32797g(eVar, "editProcessor");
            C19383o.m32797g(jVar, "imeOptions");
            C19383o.m32797g(lVar, "onValueChange");
            C19383o.m32797g(lVar2, "onImeActionPerformed");
            tVar.f4523a.mo7638b(textFieldValue, jVar, new TextFieldDelegate$Companion$restartInput$1(eVar, lVar), lVar2);
            C2004v vVar = new C2004v(tVar, tVar.f4523a);
            tVar.f4524b.set(vVar);
            textFieldState.f1947d = vVar;
        }
        return new C0900a();
    }
}
