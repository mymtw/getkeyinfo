package androidx.compose.runtime;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.snapshots.C1382c;
import androidx.compose.runtime.snapshots.C1384e;
import androidx.compose.runtime.snapshots.SnapshotKt;
import java.util.ArrayList;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.flow.StateFlowImpl;
import p228s.C7793e;
import p259v.C8182b;
import p744gq.C19060c;
import p753kq.C19861p;
import p753kq.C19862q;

@C19060c(mo70540c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", mo70541f = "Recomposer.kt", mo70542l = {744}, mo70543m = "invokeSuspend")
final class Recomposer$recompositionRunner$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19862q<C19525d0, C1321f0, C19340c<? super C19394m>, Object> $block;
    public final /* synthetic */ C1321f0 $parentFrameClock;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    @C19060c(mo70540c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$2", mo70541f = "Recomposer.kt", mo70542l = {745}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$2 */
    public static final class C12852 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C12852 r0 = new C12852(qVar, f0Var, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
            return ((C12852) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                C0761x.m1684O0(obj);
                C19862q<C19525d0, C1321f0, C19340c<? super C19394m>, Object> qVar = qVar;
                C1321f0 f0Var = f0Var;
                this.label = 1;
                if (qVar.invoke((C19525d0) this.L$0, f0Var, this) == coroutineSingletons) {
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Recomposer$recompositionRunner$2(Recomposer recomposer, C19862q<? super C19525d0, ? super C1321f0, ? super C19340c<? super C19394m>, ? extends Object> qVar, C1321f0 f0Var, C19340c<? super Recomposer$recompositionRunner$2> cVar) {
        super(2, cVar);
        this.this$0 = recomposer;
        this.$block = qVar;
        this.$parentFrameClock = f0Var;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        Recomposer$recompositionRunner$2 recomposer$recompositionRunner$2 = new Recomposer$recompositionRunner$2(this.this$0, this.$block, this.$parentFrameClock, cVar);
        recomposer$recompositionRunner$2.L$0 = obj;
        return recomposer$recompositionRunner$2;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((Recomposer$recompositionRunner$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        C19699g1 g1Var;
        C1382c cVar;
        StateFlowImpl stateFlowImpl;
        C7793e eVar;
        C8182b remove;
        StateFlowImpl stateFlowImpl2;
        C7793e eVar2;
        C8182b remove2;
        StateFlowImpl stateFlowImpl3;
        C7793e eVar3;
        C8182b R;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            g1Var = C1993m.m4345F(((C19525d0) this.L$0).getCoroutineContext());
            Recomposer recomposer = this.this$0;
            synchronized (recomposer.f2775d) {
                Throwable th = recomposer.f2777f;
                if (th != null) {
                    throw th;
                } else if (((Recomposer.State) recomposer.f2788q.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down".toString());
                } else if (recomposer.f2776e == null) {
                    recomposer.f2776e = g1Var;
                    recomposer.mo5576z();
                } else {
                    throw new IllegalStateException("Recomposer already running".toString());
                }
            }
            Recomposer$recompositionRunner$2$unregisterApplyObserver$1 recomposer$recompositionRunner$2$unregisterApplyObserver$1 = new Recomposer$recompositionRunner$2$unregisterApplyObserver$1(this.this$0);
            SnapshotKt.m2907f(SnapshotKt.f2987a);
            synchronized (SnapshotKt.f2989c) {
                SnapshotKt.f2993g.add(recomposer$recompositionRunner$2$unregisterApplyObserver$1);
            }
            C1384e eVar4 = new C1384e(recomposer$recompositionRunner$2$unregisterApplyObserver$1);
            StateFlowImpl stateFlowImpl4 = Recomposer.f2771s;
            Recomposer.C1284b bVar = this.this$0.f2789r;
            do {
                stateFlowImpl3 = Recomposer.f2771s;
                eVar3 = (C7793e) stateFlowImpl3.getValue();
                R = eVar3.mo20338R(bVar);
                if (eVar3 == R || stateFlowImpl3.mo72337i(eVar3, R)) {
                    break;
                }
                stateFlowImpl3 = Recomposer.f2771s;
                eVar3 = (C7793e) stateFlowImpl3.getValue();
                R = eVar3.mo20338R(bVar);
                break;
                break;
            } while (stateFlowImpl3.mo72337i(eVar3, R));
            try {
                break;
                Recomposer recomposer2 = this.this$0;
                synchronized (recomposer2.f2775d) {
                    ArrayList arrayList = recomposer2.f2778g;
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((C1349n) arrayList.get(i2)).invalidateAll();
                    }
                    C19394m mVar = C19394m.f43287a;
                }
                final C19862q<C19525d0, C1321f0, C19340c<? super C19394m>, Object> qVar = this.$block;
                final C1321f0 f0Var = this.$parentFrameClock;
                C12852 r10 = new C12852((C19340c<? super C12852>) null);
                this.L$0 = g1Var;
                this.L$1 = eVar4;
                this.label = 1;
                if (C19697g.m33466d(r10, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                cVar = eVar4;
            } catch (Throwable th2) {
                th = th2;
                cVar = eVar4;
                cVar.dispose();
                Recomposer recomposer3 = this.this$0;
                synchronized (recomposer3.f2775d) {
                    if (recomposer3.f2776e == g1Var) {
                        recomposer3.f2776e = null;
                    }
                    recomposer3.mo5576z();
                }
                StateFlowImpl stateFlowImpl5 = Recomposer.f2771s;
                Recomposer.C1284b bVar2 = this.this$0.f2789r;
                do {
                    stateFlowImpl = Recomposer.f2771s;
                    eVar = (C7793e) stateFlowImpl.getValue();
                    remove = eVar.remove(bVar2);
                    if (eVar == remove || stateFlowImpl.mo72337i(eVar, remove)) {
                        throw th;
                    }
                    stateFlowImpl = Recomposer.f2771s;
                    eVar = (C7793e) stateFlowImpl.getValue();
                    remove = eVar.remove(bVar2);
                    break;
                } while (stateFlowImpl.mo72337i(eVar, remove));
                throw th;
            }
        } else if (i == 1) {
            cVar = (C1382c) this.L$1;
            g1Var = (C19699g1) this.L$0;
            try {
                C0761x.m1684O0(obj);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar.dispose();
        Recomposer recomposer4 = this.this$0;
        synchronized (recomposer4.f2775d) {
            if (recomposer4.f2776e == g1Var) {
                recomposer4.f2776e = null;
            }
            recomposer4.mo5576z();
        }
        StateFlowImpl stateFlowImpl6 = Recomposer.f2771s;
        Recomposer.C1284b bVar3 = this.this$0.f2789r;
        do {
            stateFlowImpl2 = Recomposer.f2771s;
            eVar2 = (C7793e) stateFlowImpl2.getValue();
            remove2 = eVar2.remove(bVar3);
            if (eVar2 == remove2 || stateFlowImpl2.mo72337i(eVar2, remove2)) {
            }
            stateFlowImpl2 = Recomposer.f2771s;
            eVar2 = (C7793e) stateFlowImpl2.getValue();
            remove2 = eVar2.remove(bVar3);
            break;
        } while (stateFlowImpl2.mo72337i(eVar2, remove2));
        return C19394m.f43287a;
    }
}
