package com.etsy.android.config.flags.events;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19671s1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.config.flags.events.ConfigFlagsEventDispatcher$dispatch$1", mo70541f = "ConfigFlagsEventDispatcher.kt", mo70542l = {17}, mo70543m = "invokeSuspend")
public final class ConfigFlagsEventDispatcher$dispatch$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C6350c $event;
    public int label;
    public final /* synthetic */ ConfigFlagsEventDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfigFlagsEventDispatcher$dispatch$1(ConfigFlagsEventDispatcher configFlagsEventDispatcher, C6350c cVar, C19340c<? super ConfigFlagsEventDispatcher$dispatch$1> cVar2) {
        super(2, cVar2);
        this.this$0 = configFlagsEventDispatcher;
        this.$event = cVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new ConfigFlagsEventDispatcher$dispatch$1(this.this$0, this.$event, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((ConfigFlagsEventDispatcher$dispatch$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19671s1 s1Var = this.this$0.f14145b;
            C6350c cVar = this.$event;
            this.label = 1;
            if (s1Var.emit(cVar, this) == coroutineSingletons) {
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
