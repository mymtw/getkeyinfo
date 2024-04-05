package com.etsy.android.onboarding;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.CoroutineDispatcher;
import p360hb.C12804a;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.onboarding.OnboardingCategoryQuizFragment$onViewCreated$1", mo70541f = "OnboardingCategoryQuizFragment.kt", mo70542l = {53}, mo70543m = "invokeSuspend")
public final class OnboardingCategoryQuizFragment$onViewCreated$1 extends SuspendLambda implements C19861p<C12804a, C19340c<? super C19394m>, Object> {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ OnboardingCategoryQuizFragment this$0;

    @C19060c(mo70540c = "com.etsy.android.onboarding.OnboardingCategoryQuizFragment$onViewCreated$1$1", mo70541f = "OnboardingCategoryQuizFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.etsy.android.onboarding.OnboardingCategoryQuizFragment$onViewCreated$1$1 */
    public static final class C89311 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            return new C89311(onboardingCategoryQuizFragment, aVar, cVar);
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C89311) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                onboardingCategoryQuizFragment.handleViewState(aVar);
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OnboardingCategoryQuizFragment$onViewCreated$1(OnboardingCategoryQuizFragment onboardingCategoryQuizFragment, C19340c<? super OnboardingCategoryQuizFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.this$0 = onboardingCategoryQuizFragment;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        OnboardingCategoryQuizFragment$onViewCreated$1 onboardingCategoryQuizFragment$onViewCreated$1 = new OnboardingCategoryQuizFragment$onViewCreated$1(this.this$0, cVar);
        onboardingCategoryQuizFragment$onViewCreated$1.L$0 = obj;
        return onboardingCategoryQuizFragment$onViewCreated$1;
    }

    public final Object invoke(C12804a aVar, C19340c<? super C19394m> cVar) {
        return ((OnboardingCategoryQuizFragment$onViewCreated$1) create(aVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            final C12804a aVar = (C12804a) this.L$0;
            CoroutineDispatcher mainDispatcher = this.this$0.getMainDispatcher();
            final OnboardingCategoryQuizFragment onboardingCategoryQuizFragment = this.this$0;
            C89311 r3 = new C89311((C19340c<? super C89311>) null);
            this.label = 1;
            if (C19697g.m33471i(this, mainDispatcher, r3) == coroutineSingletons) {
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
