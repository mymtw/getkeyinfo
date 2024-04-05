package com.etsy.android.p327ui.home.editorspicks;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.models.finds.FindsPage;
import com.etsy.android.p327ui.home.editorspicks.C9926c;
import com.etsy.android.p327ui.home.editorspicks.C9930e;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.home.editorspicks.EditorsPicksViewModel$loadPage$1", mo70541f = "EditorsPicksViewModel.kt", mo70542l = {175}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.home.editorspicks.EditorsPicksViewModel$loadPage$1 */
final class EditorsPicksViewModel$loadPage$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ C9940h this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditorsPicksViewModel$loadPage$1(C9940h hVar, C19340c<? super EditorsPicksViewModel$loadPage$1> cVar) {
        super(2, cVar);
        this.this$0 = hVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new EditorsPicksViewModel$loadPage$1(this.this$0, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((EditorsPicksViewModel$loadPage$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C9940h hVar = this.this$0;
            EditorPicksRepository editorPicksRepository = hVar.f21900b;
            String str = hVar.f21904f;
            if (str != null) {
                C9925b bVar = new C9925b(str, hVar.f21906h, hVar.f21905g);
                this.label = 1;
                obj = editorPicksRepository.mo33070a(bVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                C19383o.m32805o("slug");
                throw null;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C9926c cVar = (C9926c) obj;
        if (cVar instanceof C9926c.C9928b) {
            C9940h hVar2 = this.this$0;
            FindsPage findsPage = ((C9926c.C9928b) cVar).f21884a;
            hVar2.f21908j = findsPage;
            C9940h.m18145b(hVar2.f21902d, new C9930e.C9934d(findsPage));
            C9940h hVar3 = this.this$0;
            String str2 = hVar3.f21907i;
            if (str2 != null) {
                C9940h.m18145b(hVar3.f21902d, new C9930e.C9935e(str2));
                hVar3.f21907i = null;
            }
        } else if (cVar instanceof C9926c.C9927a) {
            C9940h.m18145b(this.this$0.f21902d, C9930e.C9933c.f21888a);
            LogCatKt.m17045a().error(((C9926c.C9927a) cVar).f21883a);
        }
        return C19394m.f43287a;
    }
}
