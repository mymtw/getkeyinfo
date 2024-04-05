package androidx.compose.material;

import androidx.compose.foundation.interaction.C0632b;
import androidx.compose.foundation.interaction.C0633c;
import androidx.compose.foundation.interaction.C0635e;
import androidx.compose.foundation.interaction.C0636f;
import androidx.compose.foundation.interaction.C0638h;
import androidx.compose.foundation.interaction.C0639i;
import androidx.compose.foundation.interaction.C0642l;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.foundation.interaction.C0644n;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.flow.C19600e;
import kotlinx.coroutines.flow.C19671s1;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1", mo70541f = "FloatingActionButton.kt", mo70542l = {273}, mo70543m = "invokeSuspend")
final class DefaultFloatingActionButtonElevation$elevation$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ SnapshotStateList<C0638h> $interactions;
    public int label;

    /* renamed from: androidx.compose.material.DefaultFloatingActionButtonElevation$elevation$1$a */
    public static final class C1069a implements C19600e<C0638h> {

        /* renamed from: b */
        public final /* synthetic */ SnapshotStateList<C0638h> f2201b;

        public C1069a(SnapshotStateList<C0638h> snapshotStateList) {
            this.f2201b = snapshotStateList;
        }

        public final Object emit(Object obj, C19340c cVar) {
            C0638h hVar = (C0638h) obj;
            if (hVar instanceof C0635e) {
                this.f2201b.add(hVar);
            } else if (hVar instanceof C0636f) {
                this.f2201b.remove((Object) ((C0636f) hVar).f1378a);
            } else if (hVar instanceof C0632b) {
                this.f2201b.add(hVar);
            } else if (hVar instanceof C0633c) {
                this.f2201b.remove((Object) ((C0633c) hVar).f1377a);
            } else if (hVar instanceof C0643m) {
                this.f2201b.add(hVar);
            } else if (hVar instanceof C0644n) {
                this.f2201b.remove((Object) ((C0644n) hVar).f1382a);
            } else if (hVar instanceof C0642l) {
                this.f2201b.remove((Object) ((C0642l) hVar).f1380a);
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFloatingActionButtonElevation$elevation$1(C0639i iVar, SnapshotStateList<C0638h> snapshotStateList, C19340c<? super DefaultFloatingActionButtonElevation$elevation$1> cVar) {
        super(2, cVar);
        this.$interactionSource = iVar;
        this.$interactions = snapshotStateList;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new DefaultFloatingActionButtonElevation$elevation$1(this.$interactionSource, this.$interactions, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((DefaultFloatingActionButtonElevation$elevation$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19671s1 c = this.$interactionSource.mo3869c();
            C1069a aVar = new C1069a(this.$interactions);
            this.label = 1;
            c.getClass();
            if (C19671s1.m33431k(c, aVar, this) == coroutineSingletons) {
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
