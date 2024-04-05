package androidx.datastore.preferences.core;

import androidx.compose.foundation.layout.C0761x;
import androidx.datastore.preferences.core.C2493b;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19294b0;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", mo70541f = "Preferences.kt", mo70542l = {329}, mo70543m = "invokeSuspend")
public final class PreferencesKt$edit$2 extends SuspendLambda implements C19861p<C2493b, C19340c<? super C2493b>, Object> {
    public final /* synthetic */ C19861p<MutablePreferences, C19340c<? super C19394m>, Object> $transform;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PreferencesKt$edit$2(C19861p<? super MutablePreferences, ? super C19340c<? super C19394m>, ? extends Object> pVar, C19340c<? super PreferencesKt$edit$2> cVar) {
        super(2, cVar);
        this.$transform = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, cVar);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    public final Object invoke(C2493b bVar, C19340c<? super C2493b> cVar) {
        return ((PreferencesKt$edit$2) create(bVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            MutablePreferences mutablePreferences = new MutablePreferences((Map<C2493b.C2494a<?>, Object>) C19294b0.m32558A0(((C2493b) this.L$0).mo9350a()), false);
            C19861p<MutablePreferences, C19340c<? super C19394m>, Object> pVar = this.$transform;
            this.L$0 = mutablePreferences;
            this.label = 1;
            return pVar.invoke(mutablePreferences, this) == coroutineSingletons ? coroutineSingletons : mutablePreferences;
        } else if (i == 1) {
            MutablePreferences mutablePreferences2 = (MutablePreferences) this.L$0;
            C0761x.m1684O0(obj);
            return mutablePreferences2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
