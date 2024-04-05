package androidx.datastore.preferences.core;

import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", mo70541f = "PreferenceDataStoreFactory.kt", mo70542l = {85}, mo70543m = "invokeSuspend")
public final class PreferenceDataStore$updateData$2 extends SuspendLambda implements C19861p<C2493b, C19340c<? super C2493b>, Object> {
    public final /* synthetic */ C19861p<C2493b, C19340c<? super C2493b>, Object> $transform;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferenceDataStore$updateData$2(C19861p<? super C2493b, ? super C19340c<? super C2493b>, ? extends Object> pVar, C19340c<? super PreferenceDataStore$updateData$2> cVar) {
        super(2, cVar);
        this.$transform = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.$transform, cVar);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    public final Object invoke(C2493b bVar, C19340c<? super C2493b> cVar) {
        return ((PreferenceDataStore$updateData$2) create(bVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19861p<C2493b, C19340c<? super C2493b>, Object> pVar = this.$transform;
            this.label = 1;
            obj = pVar.invoke((C2493b) this.L$0, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C2493b bVar = (C2493b) obj;
        ((MutablePreferences) bVar).f5762b.set(true);
        return bVar;
    }
}
