package androidx.compose.foundation.gestures;

import androidx.compose.foundation.layout.C0761x;
import androidx.compose.p015ui.input.pointer.C1631c;
import androidx.compose.p015ui.input.pointer.C1644p;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", mo70541f = "DragGestureDetector.kt", mo70542l = {277}, mo70543m = "invokeSuspend")
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C1644p>, Object> {
    private /* synthetic */ Object L$0;
    public int label;

    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1(C19340c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1> cVar) {
        super(2, cVar);
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1(cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1;
    }

    public final Object invoke(C1631c cVar, C19340c<? super C1644p> cVar2) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            this.label = 1;
            obj = TapGestureDetectorKt.m1410b((C1631c) this.L$0, false, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            C0761x.m1684O0(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
