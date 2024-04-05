package androidx.compose.material;

import androidx.compose.foundation.interaction.C0628a;
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

@C19060c(mo70540c = "androidx.compose.material.SwitchKt$SwitchImpl$1$1", mo70541f = "Switch.kt", mo70542l = {185}, mo70543m = "invokeSuspend")
public final class SwitchKt$SwitchImpl$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0639i $interactionSource;
    public final /* synthetic */ SnapshotStateList<C0638h> $interactions;
    public int label;

    /* renamed from: androidx.compose.material.SwitchKt$SwitchImpl$1$1$a */
    public static final class C1152a implements C19600e<C0638h> {

        /* renamed from: b */
        public final /* synthetic */ SnapshotStateList<C0638h> f2312b;

        public C1152a(SnapshotStateList<C0638h> snapshotStateList) {
            this.f2312b = snapshotStateList;
        }

        public final Object emit(Object obj, C19340c cVar) {
            C0638h hVar = (C0638h) obj;
            if (hVar instanceof C0643m) {
                this.f2312b.add(hVar);
            } else if (hVar instanceof C0644n) {
                this.f2312b.remove((Object) ((C0644n) hVar).f1382a);
            } else if (hVar instanceof C0642l) {
                this.f2312b.remove((Object) ((C0642l) hVar).f1380a);
            } else if (hVar instanceof C0628a.C0630b) {
                this.f2312b.add(hVar);
            } else if (hVar instanceof C0628a.C0631c) {
                this.f2312b.remove((Object) ((C0628a.C0631c) hVar).f1376a);
            } else if (hVar instanceof C0628a.C0629a) {
                this.f2312b.remove((Object) ((C0628a.C0629a) hVar).f1375a);
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SwitchKt$SwitchImpl$1$1(C0639i iVar, SnapshotStateList<C0638h> snapshotStateList, C19340c<? super SwitchKt$SwitchImpl$1$1> cVar) {
        super(2, cVar);
        this.$interactionSource = iVar;
        this.$interactions = snapshotStateList;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SwitchKt$SwitchImpl$1$1(this.$interactionSource, this.$interactions, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SwitchKt$SwitchImpl$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19671s1 c = this.$interactionSource.mo3869c();
            C1152a aVar = new C1152a(this.$interactions);
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
