package com.braze.p044ui.inappmessage.utils;

import androidx.compose.foundation.layout.C0761x;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.BrazeLogger;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p114g4.C6861b;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2", mo70541f = "BackgroundInAppMessagePreparer.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2 */
final class BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C5483a $inAppMessage;
    public int label;
    public final /* synthetic */ BackgroundInAppMessagePreparer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(BackgroundInAppMessagePreparer backgroundInAppMessagePreparer, C5483a aVar, C19340c<? super BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2> cVar) {
        super(2, cVar);
        this.this$0 = backgroundInAppMessagePreparer;
        this.$inAppMessage = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(this.this$0, this.$inAppMessage, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            BrazeLogger.m11282d(BrazeLogger.f11932a, this.this$0, (BrazeLogger.Priority) null, (Throwable) null, C56771.INSTANCE, 7);
            C6861b.m13319e().mo18983c(this.$inAppMessage, false);
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
