package androidx.datastore.migrations;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.migrations.SharedPreferencesMigration$2", mo70541f = "SharedPreferencesMigration.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class SharedPreferencesMigration$2 extends SuspendLambda implements C19861p<Object, C19340c<? super Boolean>, Object> {
    public int label;

    public SharedPreferencesMigration$2(C19340c<? super SharedPreferencesMigration$2> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SharedPreferencesMigration$2(cVar);
    }

    public final Object invoke(Object obj, C19340c<? super Boolean> cVar) {
        return ((SharedPreferencesMigration$2) create(obj, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            return Boolean.TRUE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
