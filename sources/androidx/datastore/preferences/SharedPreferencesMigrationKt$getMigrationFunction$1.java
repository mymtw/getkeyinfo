package androidx.datastore.preferences;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.migrations.C2487b;
import androidx.datastore.preferences.core.C2493b;
import java.util.ArrayList;
import java.util.Set;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", mo70541f = "SharedPreferencesMigration.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends SuspendLambda implements C19862q<C2487b, C2493b, C19340c<? super C2493b>, Object> {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public SharedPreferencesMigrationKt$getMigrationFunction$1(C19340c<? super SharedPreferencesMigrationKt$getMigrationFunction$1> cVar) {
        super(3, cVar);
    }

    public final Object invoke(C2487b bVar, C2493b bVar2, C19340c<? super C2493b> cVar) {
        SharedPreferencesMigrationKt$getMigrationFunction$1 sharedPreferencesMigrationKt$getMigrationFunction$1 = new SharedPreferencesMigrationKt$getMigrationFunction$1(cVar);
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$0 = bVar;
        sharedPreferencesMigrationKt$getMigrationFunction$1.L$1 = bVar2;
        return sharedPreferencesMigrationKt$getMigrationFunction$1.invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            C2487b bVar = (C2487b) this.L$0;
            Set<C2493b.C2494a<?>> keySet = ((C2493b) this.L$1).mo9350a().keySet();
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(keySet));
            for (C2493b.C2494a aVar : keySet) {
                arrayList.add(aVar.f5764a);
            }
            bVar.getClass();
            throw null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
