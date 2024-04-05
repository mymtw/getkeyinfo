package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.text.selection.SelectionManager$onClearSelectionRequested$1", mo70541f = "SelectionManager.kt", mo70542l = {630}, mo70543m = "invokeSuspend")
final class SelectionManager$onClearSelectionRequested$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19846a<C19394m> $block;
    private /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SelectionManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectionManager$onClearSelectionRequested$1(SelectionManager selectionManager, C19846a<C19394m> aVar, C19340c<? super SelectionManager$onClearSelectionRequested$1> cVar) {
        super(2, cVar);
        this.this$0 = selectionManager;
        this.$block = aVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        SelectionManager$onClearSelectionRequested$1 selectionManager$onClearSelectionRequested$1 = new SelectionManager$onClearSelectionRequested$1(this.this$0, this.$block, cVar);
        selectionManager$onClearSelectionRequested$1.L$0 = obj;
        return selectionManager$onClearSelectionRequested$1;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((SelectionManager$onClearSelectionRequested$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            SelectionManager selectionManager = this.this$0;
            final C19846a<C19394m> aVar = this.$block;
            C09891 r3 = new C19857l<C8343c, C19394m>() {
                public /* synthetic */ Object invoke(Object obj) {
                    m34725invokek4lQ0M(((C8343c) obj).f18299a);
                    return C19394m.f43287a;
                }

                /* renamed from: invoke-k-4lQ0M  reason: not valid java name */
                public final void m34725invokek4lQ0M(long j) {
                    aVar.invoke();
                }
            };
            this.label = 1;
            selectionManager.getClass();
            Object b = ForEachGestureKt.m1378b((C1652w) this.L$0, new SelectionManager$detectNonConsumingTap$2(r3, (C19340c<? super SelectionManager$detectNonConsumingTap$2>) null), this);
            if (b != coroutineSingletons) {
                b = C19394m.f43287a;
            }
            if (b == coroutineSingletons) {
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
