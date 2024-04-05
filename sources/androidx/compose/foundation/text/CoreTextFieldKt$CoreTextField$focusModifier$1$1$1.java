package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.foundation.relocation.C0882d;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.TextFieldValue;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p174m0.C7290i;
import p288y.C8345d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", mo70541f = "CoreTextField.kt", mo70542l = {298}, mo70543m = "invokeSuspend")
public final class CoreTextFieldKt$CoreTextField$focusModifier$1$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0882d $bringIntoViewRequester;
    public final /* synthetic */ C0965r $layoutResult;
    public final /* synthetic */ C1994n $offsetMapping;
    public final /* synthetic */ TextFieldState $state;
    public final /* synthetic */ TextFieldValue $value;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(C0882d dVar, TextFieldValue textFieldValue, TextFieldState textFieldState, C0965r rVar, C1994n nVar, C19340c<? super CoreTextFieldKt$CoreTextField$focusModifier$1$1$1> cVar) {
        super(2, cVar);
        this.$bringIntoViewRequester = dVar;
        this.$value = textFieldValue;
        this.$state = textFieldState;
        this.$layoutResult = rVar;
        this.$offsetMapping = nVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new CoreTextFieldKt$CoreTextField$focusModifier$1$1$1(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((CoreTextFieldKt$CoreTextField$focusModifier$1$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C0882d dVar = this.$bringIntoViewRequester;
            TextFieldValue textFieldValue = this.$value;
            C0957k kVar = this.$state.f1944a;
            C2021q qVar = this.$layoutResult.f2042a;
            C1994n nVar = this.$offsetMapping;
            this.label = 1;
            int b = nVar.mo7684b(C2022r.m4465d(textFieldValue.f4449b));
            Object a = dVar.mo4403a(b < qVar.f4589a.f4556a.length() ? qVar.mo7739b(b) : b != 0 ? qVar.mo7739b(b - 1) : new C8345d(0.0f, 0.0f, 1.0f, (float) C7290i.m13995b(C0960n.m1999a(kVar.f2014b, kVar.f2018f, kVar.f2019g, C0960n.f2024a, 1))), this);
            if (a != coroutineSingletons) {
                a = C19394m.f43287a;
            }
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
