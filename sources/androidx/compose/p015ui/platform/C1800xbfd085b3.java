package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.Recomposer;
import com.etsy.android.R;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1", mo70541f = "WindowRecomposer.android.kt", mo70542l = {233}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.platform.WindowRecomposerPolicy$createAndInstallWindowRecomposer$unsetJob$1 */
final class C1800xbfd085b3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ Recomposer $newRecomposer;
    public final /* synthetic */ View $rootView;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1800xbfd085b3(Recomposer recomposer, View view, C19340c<? super C1800xbfd085b3> cVar) {
        super(2, cVar);
        this.$newRecomposer = recomposer;
        this.$rootView = view;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new C1800xbfd085b3(this.$newRecomposer, this.$rootView, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((C1800xbfd085b3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            Recomposer recomposer = this.$newRecomposer;
            this.label = 1;
            if (recomposer.mo5572B(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th) {
                if (C1877t1.m4118b(this.$rootView) == this.$newRecomposer) {
                    View view = this.$rootView;
                    C19383o.m32797g(view, "<this>");
                    view.setTag(R.id.androidx_compose_ui_view_composition_context, (Object) null);
                }
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (C1877t1.m4118b(this.$rootView) == this.$newRecomposer) {
            View view2 = this.$rootView;
            C19383o.m32797g(view2, "<this>");
            view2.setTag(R.id.androidx_compose_ui_view_composition_context, (Object) null);
        }
        return C19394m.f43287a;
    }
}
