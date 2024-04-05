package androidx.datastore.core;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;

@C19060c(mo70540c = "androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2$1$1", mo70541f = "DataMigrationInitializer.kt", mo70542l = {45}, mo70543m = "invokeSuspend")
public final class DataMigrationInitializer$Companion$runMigrations$2$1$1 extends SuspendLambda implements C19857l<C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C2475c<Object> $migration;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$runMigrations$2$1$1(C2475c<Object> cVar, C19340c<? super DataMigrationInitializer$Companion$runMigrations$2$1$1> cVar2) {
        super(1, cVar2);
        this.$migration = cVar;
    }

    public final C19340c<C19394m> create(C19340c<?> cVar) {
        return new DataMigrationInitializer$Companion$runMigrations$2$1$1(this.$migration, cVar);
    }

    public final Object invoke(C19340c<? super C19394m> cVar) {
        return ((DataMigrationInitializer$Companion$runMigrations$2$1$1) create(cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C2475c<Object> cVar = this.$migration;
            this.label = 1;
            if (cVar.cleanUp() == coroutineSingletons) {
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
