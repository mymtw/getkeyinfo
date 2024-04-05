package androidx.datastore.preferences;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.core.C2493b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", mo70541f = "SharedPreferencesMigration.kt", mo70542l = {}, mo70543m = "invokeSuspend")
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements C19861p<C2493b, C19340c<? super Boolean>, Object> {
    public final /* synthetic */ Set<String> $keysToMigrate;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set<String> set, C19340c<? super SharedPreferencesMigrationKt$getShouldRunMigration$1> cVar) {
        super(2, cVar);
        this.$keysToMigrate = set;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.$keysToMigrate, cVar);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.L$0 = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    public final Object invoke(C2493b bVar, C19340c<? super Boolean> cVar) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create(bVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            C0761x.m1684O0(obj);
            Set<C2493b.C2494a<?>> keySet = ((C2493b) this.L$0).mo9350a().keySet();
            ArrayList arrayList = new ArrayList(C19322o.m32624F0(keySet));
            for (C2493b.C2494a aVar : keySet) {
                arrayList.add(aVar.f5764a);
            }
            Set<String> set = this.$keysToMigrate;
            boolean z = false;
            if (set == C2503f.f5768a) {
                z = true;
            } else if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it = set.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (Boolean.valueOf(!arrayList.contains((String) it.next())).booleanValue()) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = true;
            }
            return Boolean.valueOf(z);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
