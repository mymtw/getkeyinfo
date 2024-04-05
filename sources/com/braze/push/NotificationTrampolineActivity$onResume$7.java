package com.braze.push;

import androidx.compose.foundation.layout.C0761x;
import com.braze.support.BrazeLogger;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "com.braze.push.NotificationTrampolineActivity$onResume$7", mo70541f = "NotificationTrampolineActivity.kt", mo70542l = {}, mo70543m = "invokeSuspend")
public final class NotificationTrampolineActivity$onResume$7 extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {
    public int label;
    public final /* synthetic */ NotificationTrampolineActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationTrampolineActivity$onResume$7(NotificationTrampolineActivity notificationTrampolineActivity, C19340c<? super NotificationTrampolineActivity$onResume$7> cVar) {
        super(1, cVar);
        this.this$0 = notificationTrampolineActivity;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new NotificationTrampolineActivity$onResume$7(this.this$0, cVar);
    }

    public final Object invoke(C19340c<? super C19394m> cVar) {
        return ((NotificationTrampolineActivity$onResume$7) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            BrazeLogger.m11282d(BrazeLogger.f11932a, this.this$0, BrazeLogger.Priority.V, (Throwable) null, C55201.INSTANCE, 6);
            this.this$0.finish();
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
