package androidx.compose.material;

import androidx.compose.foundation.interaction.C0628a;
import androidx.compose.foundation.interaction.C0638h;
import androidx.compose.foundation.interaction.C0640j;
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

@C19060c(mo70540c = "androidx.compose.material.SliderKt$SliderThumb$1$1$1", mo70541f = "Slider.kt", mo70542l = {682}, mo70543m = "invokeSuspend")
public final class SliderKt$SliderThumb$1$1$1 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ SnapshotStateList<C0638h> $interactions;
    public int label;

    /* renamed from: androidx.compose.material.SliderKt$SliderThumb$1$1$1$a */
    public static final class C1119a implements C19600e<C0638h> {

        /* renamed from: b */
        public final /* synthetic */ SnapshotStateList<C0638h> f2265b;

        public C1119a(SnapshotStateList<C0638h> snapshotStateList) {
            this.f2265b = snapshotStateList;
        }

        public final Object emit(Object obj, C19340c cVar) {
            C0638h hVar = (C0638h) obj;
            if (hVar instanceof C0643m) {
                this.f2265b.add(hVar);
            } else if (hVar instanceof C0644n) {
                this.f2265b.remove((Object) ((C0644n) hVar).f1382a);
            } else if (hVar instanceof C0642l) {
                this.f2265b.remove((Object) ((C0642l) hVar).f1380a);
            } else if (hVar instanceof C0628a.C0630b) {
                this.f2265b.add(hVar);
            } else if (hVar instanceof C0628a.C0631c) {
                this.f2265b.remove((Object) ((C0628a.C0631c) hVar).f1376a);
            } else if (hVar instanceof C0628a.C0629a) {
                this.f2265b.remove((Object) ((C0628a.C0629a) hVar).f1375a);
            }
            return C19394m.f43287a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SliderKt$SliderThumb$1$1$1(C0640j jVar, SnapshotStateList<C0638h> snapshotStateList, C19340c<? super SliderKt$SliderThumb$1$1$1> cVar) {
        super(2, cVar);
        this.$interactionSource = jVar;
        this.$interactions = snapshotStateList;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SliderKt$SliderThumb$1$1$1(this.$interactionSource, this.$interactions, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SliderKt$SliderThumb$1$1$1) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C19671s1 c = this.$interactionSource.mo3869c();
            C1119a aVar = new C1119a(this.$interactions);
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
