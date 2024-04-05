package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import android.view.View;
import androidx.compose.foundation.layout.C0761x;
import com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginViewState;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19597d;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$onViewCreated$3", mo70541f = "SplitLoginFragment.kt", mo70542l = {122}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$onViewCreated$3 */
public final class SplitLoginFragment$onViewCreated$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ View $view;
    public int label;
    public final /* synthetic */ SplitLoginFragment this$0;

    @C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$onViewCreated$3$1", mo70541f = "SplitLoginFragment.kt", mo70542l = {}, mo70543m = "invokeSuspend")
    /* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginFragment$onViewCreated$3$1 */
    public static final class C171091 extends SuspendLambda implements C19861p<SplitLoginViewState, C19340c<? super C19394m>, Object> {
        public /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C171091 r0 = new C171091(splitLoginFragment, view, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(SplitLoginViewState splitLoginViewState, C19340c<? super C19394m> cVar) {
            return ((C171091) create(splitLoginViewState, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                C0761x.m1684O0(obj);
                SplitLoginViewState splitLoginViewState = (SplitLoginViewState) this.L$0;
                if (C19383o.m32792b(splitLoginViewState, SplitLoginViewState.EmailEntryState.INSTANCE)) {
                    splitLoginFragment.setEmailEntryState(view);
                } else if (C19383o.m32792b(splitLoginViewState, SplitLoginViewState.LoadingState.INSTANCE)) {
                    Boolean unused = splitLoginFragment.setLoadingState(view);
                } else if (C19383o.m32792b(splitLoginViewState, SplitLoginViewState.EmailErrorState.INSTANCE)) {
                    splitLoginFragment.setEmailErrorState(view);
                } else if (C19383o.m32792b(splitLoginViewState, SplitLoginViewState.EmailAPIErrorState.INSTANCE)) {
                    splitLoginFragment.launchGenericErrorFragment();
                }
                return C19394m.f43287a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginFragment$onViewCreated$3(SplitLoginFragment splitLoginFragment, View view, C19340c<? super SplitLoginFragment$onViewCreated$3> cVar) {
        super(2, cVar);
        this.this$0 = splitLoginFragment;
        this.$view = view;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginFragment$onViewCreated$3(this.this$0, this.$view, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginFragment$onViewCreated$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19597d<SplitLoginViewState> viewStateFlow = this.this$0.getViewModel().getViewStateFlow();
            final SplitLoginFragment splitLoginFragment = this.this$0;
            final View view = this.$view;
            C171091 r1 = new C171091((C19340c<? super C171091>) null);
            this.label = 1;
            if (C0761x.m1667G(viewStateFlow, r1, this) == coroutineSingletons) {
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
