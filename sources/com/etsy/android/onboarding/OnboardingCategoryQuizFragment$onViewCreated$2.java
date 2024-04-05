package com.etsy.android.onboarding;

import androidx.compose.foundation.layout.C0761x;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import p347fb.C12709e;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.onboarding.OnboardingCategoryQuizFragment$onViewCreated$2", mo70541f = "OnboardingCategoryQuizFragment.kt", mo70542l = {59}, mo70543m = "invokeSuspend")
public final class OnboardingCategoryQuizFragment$onViewCreated$2 extends SuspendLambda implements C19861p<List<? extends C12709e>, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ OnboardingCategoryQuizFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingCategoryQuizFragment$onViewCreated$2(OnboardingCategoryQuizFragment onboardingCategoryQuizFragment, C19340c<? super OnboardingCategoryQuizFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.this$0 = onboardingCategoryQuizFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        OnboardingCategoryQuizFragment$onViewCreated$2 onboardingCategoryQuizFragment$onViewCreated$2 = new OnboardingCategoryQuizFragment$onViewCreated$2(this.this$0, cVar);
        onboardingCategoryQuizFragment$onViewCreated$2.L$0 = obj;
        return onboardingCategoryQuizFragment$onViewCreated$2;
    }

    public final Object invoke(List<? extends C12709e> list, C19340c<? super C19394m> cVar) {
        return ((OnboardingCategoryQuizFragment$onViewCreated$2) create(list, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C12709e eVar = (C12709e) C19327t.m32640V0((List) this.L$0);
            if (eVar != null) {
                OnboardingCategoryQuizFragment onboardingCategoryQuizFragment = this.this$0;
                CoroutineDispatcher mainDispatcher = onboardingCategoryQuizFragment.getMainDispatcher();
                OnboardingCategoryQuizFragment$onViewCreated$2$1$1 onboardingCategoryQuizFragment$onViewCreated$2$1$1 = new OnboardingCategoryQuizFragment$onViewCreated$2$1$1(onboardingCategoryQuizFragment, eVar, (C19340c<? super OnboardingCategoryQuizFragment$onViewCreated$2$1$1>) null);
                this.label = 1;
                if (C19697g.m33471i(this, mainDispatcher, onboardingCategoryQuizFragment$onViewCreated$2$1$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
