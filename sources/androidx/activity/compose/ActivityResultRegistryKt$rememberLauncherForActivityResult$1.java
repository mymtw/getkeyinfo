package androidx.activity.compose;

import androidx.activity.result.C0118a;
import androidx.activity.result.C0123f;
import androidx.compose.runtime.C1342k1;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p019b.C3443a;
import p753kq.C19857l;

final class ActivityResultRegistryKt$rememberLauncherForActivityResult$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C0123f $activityResultRegistry;
    public final /* synthetic */ C3443a<Object, Object> $contract;
    public final /* synthetic */ C1342k1<C19857l<Object, C19394m>> $currentOnResult;
    public final /* synthetic */ String $key;
    public final /* synthetic */ C0107a<Object> $realLauncher;

    /* renamed from: androidx.activity.compose.ActivityResultRegistryKt$rememberLauncherForActivityResult$1$a */
    public static final class C0104a<O> implements C0118a {

        /* renamed from: b */
        public final /* synthetic */ C1342k1<C19857l<O, C19394m>> f151b;

        public C0104a(C1342k1<? extends C19857l<? super O, C19394m>> k1Var) {
            this.f151b = k1Var;
        }

        /* renamed from: a */
        public final void mo413a(O o) {
            this.f151b.getValue().invoke(o);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityResultRegistryKt$rememberLauncherForActivityResult$1(C0107a<Object> aVar, C0123f fVar, String str, C3443a<Object, Object> aVar2, C1342k1<? extends C19857l<Object, C19394m>> k1Var) {
        super(1);
        this.$activityResultRegistry = fVar;
        this.$key = str;
        this.$contract = aVar2;
        this.$currentOnResult = k1Var;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        this.$activityResultRegistry.mo1161d(this.$key, this.$contract, new C0104a(this.$currentOnResult));
        throw null;
    }
}
