package com.braze.p044ui.inappmessage.listeners;

import android.app.Activity;
import androidx.compose.foundation.layout.C0761x;
import com.braze.support.BrazeFileUtils;
import com.braze.support.WebContentUtils;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p114g4.C6861b;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1", mo70541f = "DefaultInAppMessageViewLifecycleListener.kt", mo70542l = {}, mo70543m = "invokeSuspend")
/* renamed from: com.braze.ui.inappmessage.listeners.DefaultInAppMessageViewLifecycleListener$startClearHtmlInAppMessageAssetsThread$1 */
final class C5666x480878f2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public int label;

    public C5666x480878f2(C19340c<? super C5666x480878f2> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new C5666x480878f2(cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((C5666x480878f2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            Activity activity = C6861b.m13319e().f15220b;
            if (activity != null) {
                BrazeFileUtils.m11237a(WebContentUtils.m11363a(activity));
            }
            return C19394m.f43287a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
