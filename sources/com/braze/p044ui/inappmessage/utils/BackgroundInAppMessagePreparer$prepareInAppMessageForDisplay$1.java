package com.braze.p044ui.inappmessage.utils;

import androidx.compose.foundation.layout.C0761x;
import com.braze.models.inappmessage.C5483a;
import com.braze.support.BrazeLogger;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.internal.C19729m;
import p744gq.C19060c;
import p753kq.C19861p;
import p768rq.C20153b;

@C19060c(mo70540c = "com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1", mo70541f = "BackgroundInAppMessagePreparer.kt", mo70542l = {43}, mo70543m = "invokeSuspend")
/* renamed from: com.braze.ui.inappmessage.utils.BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 */
public final class BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C5483a $inAppMessageToPrepare;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(C5483a aVar, C19340c<? super BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1> cVar) {
        super(2, cVar);
        this.$inAppMessageToPrepare = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1 = new BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1(this.$inAppMessageToPrepare, cVar);
        backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1.L$0 = obj;
        return backgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((BackgroundInAppMessagePreparer$prepareInAppMessageForDisplay$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        Exception exc;
        C19525d0 d0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19525d0 d0Var2 = (C19525d0) this.L$0;
            try {
                BackgroundInAppMessagePreparer backgroundInAppMessagePreparer = BackgroundInAppMessagePreparer.f12084a;
                C5483a a = BackgroundInAppMessagePreparer.m11459a(this.$inAppMessageToPrepare);
                if (a == null) {
                    BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var2, BrazeLogger.Priority.W, (Throwable) null, C56781.INSTANCE, 6);
                } else {
                    this.L$0 = d0Var2;
                    this.label = 1;
                    C20153b bVar = C19760n0.f43719a;
                    Object i2 = C19697g.m33471i(this, C19729m.f43681a, new BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2(backgroundInAppMessagePreparer, a, (C19340c<? super BackgroundInAppMessagePreparer$displayPreparedInAppMessage$2>) null));
                    if (i2 != coroutineSingletons) {
                        i2 = C19394m.f43287a;
                    }
                    if (i2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            } catch (Exception e) {
                d0Var = d0Var2;
                exc = e;
                BrazeLogger.m11282d(BrazeLogger.f11932a, d0Var, BrazeLogger.Priority.E, exc, C56792.INSTANCE, 4);
                return C19394m.f43287a;
            }
        } else if (i == 1) {
            C19525d0 d0Var3 = (C19525d0) this.L$0;
            try {
                C0761x.m1684O0(obj);
            } catch (Exception e2) {
                exc = e2;
                d0Var = d0Var3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C19394m.f43287a;
    }
}
