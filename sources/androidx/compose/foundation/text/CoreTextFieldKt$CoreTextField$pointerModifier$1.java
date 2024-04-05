package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.focus.C1478l;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.input.C1985e;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.C2004v;
import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p001a0.C0005b;
import p288y.C8343c;
import p753kq.C19857l;

public final class CoreTextFieldKt$CoreTextField$pointerModifier$1 extends Lambda implements C19857l<C8343c, C19394m> {
    public final /* synthetic */ C1478l $focusRequester;
    public final /* synthetic */ TextFieldSelectionManager $manager;
    public final /* synthetic */ C1994n $offsetMapping;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ TextFieldState $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$pointerModifier$1(TextFieldState textFieldState, C1478l lVar, boolean z, TextFieldSelectionManager textFieldSelectionManager, C1994n nVar) {
        super(1);
        this.$state = textFieldState;
        this.$focusRequester = lVar;
        this.$readOnly = z;
        this.$manager = textFieldSelectionManager;
        this.$offsetMapping = nVar;
    }

    public /* synthetic */ Object invoke(Object obj) {
        m34704invokek4lQ0M(((C8343c) obj).f18299a);
        return C19394m.f43287a;
    }

    /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
    public final void m34704invokek4lQ0M(long j) {
        C2004v vVar;
        TextFieldState textFieldState = this.$state;
        C1478l lVar = this.$focusRequester;
        boolean z = true;
        boolean z2 = !this.$readOnly;
        if (!textFieldState.mo4561b()) {
            lVar.mo6218a();
        } else if (z2 && (vVar = textFieldState.f1947d) != null && C19383o.m32792b(vVar.f4526a.f4524b.get(), vVar)) {
            vVar.f4527b.mo7641e();
        }
        if (!this.$state.mo4561b()) {
            return;
        }
        if (this.$state.mo4560a() != HandleState.Selection) {
            C0965r c = this.$state.mo4562c();
            if (c != null) {
                TextFieldState textFieldState2 = this.$state;
                C1994n nVar = this.$offsetMapping;
                C1985e eVar = textFieldState2.f1946c;
                C19857l<TextFieldValue, C19394m> lVar2 = textFieldState2.f1958o;
                C19383o.m32797g(eVar, "editProcessor");
                C19383o.m32797g(nVar, "offsetMapping");
                C19383o.m32797g(lVar2, "onValueChange");
                int a = nVar.mo7683a(c.mo4579b(j, true));
                lVar2.invoke(TextFieldValue.m4312a(eVar.f4468a, (C1913a) null, C0005b.m47l(a, a), 5));
                if (textFieldState2.f1944a.f2013a.length() <= 0) {
                    z = false;
                }
                if (z) {
                    HandleState handleState = HandleState.Cursor;
                    C19383o.m32797g(handleState, "<set-?>");
                    textFieldState2.f1951h.setValue(handleState);
                    return;
                }
                return;
            }
            return;
        }
        this.$manager.mo4648g(new C8343c(j));
    }
}
