package androidx.compose.material;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.material.SnackbarHostKt;
import androidx.compose.p015ui.platform.C1835h;
import com.paypal.pyplcheckout.services.api.interceptor.NetworkRetryInterceptor;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C19383o;
import kotlinx.coroutines.C19525d0;
import p628nj.C18263b;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1", mo70541f = "SnackbarHost.kt", mo70542l = {164}, mo70543m = "invokeSuspend")
public final class SnackbarHostKt$SnackbarHost$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C1835h $accessibilityManager;
    public final /* synthetic */ C1251s1 $currentSnackbarData;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostKt$SnackbarHost$1(C1251s1 s1Var, C1835h hVar, C19340c<? super SnackbarHostKt$SnackbarHost$1> cVar) {
        super(2, cVar);
        this.$currentSnackbarData = s1Var;
        this.$accessibilityManager = hVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SnackbarHostKt$SnackbarHost$1(this.$currentSnackbarData, this.$accessibilityManager, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SnackbarHostKt$SnackbarHost$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        long j;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C1251s1 s1Var = this.$currentSnackbarData;
            if (s1Var != null) {
                SnackbarDuration duration = s1Var.getDuration();
                boolean z = this.$currentSnackbarData.mo5346a() != null;
                C1835h hVar = this.$accessibilityManager;
                C19383o.m32797g(duration, "<this>");
                int i2 = SnackbarHostKt.C1132a.f2266a[duration.ordinal()];
                if (i2 == 1) {
                    j = Long.MAX_VALUE;
                } else if (i2 == 2) {
                    j = NetworkRetryInterceptor.DEFAULT_MAX_RETRIES_DURATION;
                } else if (i2 == 3) {
                    j = 4000;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                if (hVar != null) {
                    j = hVar.mo7224a(j, z);
                }
                this.label = 1;
                if (C18263b.m30814I(j, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return C19394m.f43287a;
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.$currentSnackbarData.dismiss();
        return C19394m.f43287a;
    }
}
