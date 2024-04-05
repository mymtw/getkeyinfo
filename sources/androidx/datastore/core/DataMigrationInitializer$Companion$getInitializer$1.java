package androidx.datastore.core;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.core.C2476d;
import java.util.List;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", mo70541f = "DataMigrationInitializer.kt", mo70542l = {33}, mo70543m = "invokeSuspend")
final class DataMigrationInitializer$Companion$getInitializer$1 extends SuspendLambda implements C19861p<C2481h<Object>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ List<C2475c<Object>> $migrations;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DataMigrationInitializer$Companion$getInitializer$1(List<? extends C2475c<Object>> list, C19340c<? super DataMigrationInitializer$Companion$getInitializer$1> cVar) {
        super(2, cVar);
        this.$migrations = list;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.$migrations, cVar);
        dataMigrationInitializer$Companion$getInitializer$1.L$0 = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    public final Object invoke(C2481h<Object> hVar, C19340c<? super C19394m> cVar) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(hVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C2476d.C2477a aVar = C2476d.f5751a;
            List<C2475c<Object>> list = this.$migrations;
            this.label = 1;
            if (C2476d.C2477a.m5441a(aVar, list, (C2481h) this.L$0, this) == coroutineSingletons) {
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
