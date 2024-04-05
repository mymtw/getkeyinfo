package androidx.compose.foundation.gestures;

import androidx.compose.p015ui.input.pointer.C1644p;
import androidx.compose.p015ui.input.pointer.C1652w;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p288y.C8343c;
import p744gq.C19060c;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", mo70541f = "DragGestureDetector.kt", mo70542l = {276, 280, 284}, mo70543m = "invokeSuspend")
public final class DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19861p<C1644p, C8343c, C19394m> $onDrag;
    public final /* synthetic */ C19846a<C19394m> $onDragCancel;
    public final /* synthetic */ C19846a<C19394m> $onDragEnd;
    public final /* synthetic */ C19857l<C8343c, C19394m> $onDragStart;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(C19857l<? super C8343c, C19394m> lVar, C19846a<C19394m> aVar, C19846a<C19394m> aVar2, C19861p<? super C1644p, ? super C8343c, C19394m> pVar, C19340c<? super DragGestureDetectorKt$detectDragGesturesAfterLongPress$5> cVar) {
        super(2, cVar);
        this.$onDragStart = lVar;
        this.$onDragCancel = aVar;
        this.$onDragEnd = aVar2;
        this.$onDrag = pVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        DragGestureDetectorKt$detectDragGesturesAfterLongPress$5 dragGestureDetectorKt$detectDragGesturesAfterLongPress$5 = new DragGestureDetectorKt$detectDragGesturesAfterLongPress$5(this.$onDragStart, this.$onDragCancel, this.$onDragEnd, this.$onDrag, cVar);
        dragGestureDetectorKt$detectDragGesturesAfterLongPress$5.L$0 = obj;
        return dragGestureDetectorKt$detectDragGesturesAfterLongPress$5;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((DragGestureDetectorKt$detectDragGesturesAfterLongPress$5) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[Catch:{ CancellationException -> 0x0014 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r11.label
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r5) goto L_0x0026
            if (r1 == r4) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)     // Catch:{ CancellationException -> 0x0014 }
            goto L_0x007e
        L_0x0014:
            r12 = move-exception
            goto L_0x0081
        L_0x0016:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001e:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.w r1 = (androidx.compose.p015ui.input.pointer.C1652w) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)     // Catch:{ CancellationException -> 0x0014 }
            goto L_0x0055
        L_0x0026:
            java.lang.Object r1 = r11.L$0
            androidx.compose.ui.input.pointer.w r1 = (androidx.compose.p015ui.input.pointer.C1652w) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            goto L_0x0048
        L_0x002e:
            androidx.compose.foundation.layout.C0761x.m1684O0(r12)
            java.lang.Object r12 = r11.L$0
            androidx.compose.ui.input.pointer.w r12 = (androidx.compose.p015ui.input.pointer.C1652w) r12
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1 r1 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1
            r1.<init>(r2)
            r11.L$0 = r12
            r11.label = r5
            java.lang.Object r1 = r12.mo6563s0(r1, r11)
            if (r1 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r10 = r1
            r1 = r12
            r12 = r10
        L_0x0048:
            androidx.compose.ui.input.pointer.p r12 = (androidx.compose.p015ui.input.pointer.C1644p) r12
            r11.L$0 = r1     // Catch:{ CancellationException -> 0x0014 }
            r11.label = r4     // Catch:{ CancellationException -> 0x0014 }
            java.lang.Object r12 = androidx.compose.foundation.gestures.DragGestureDetectorKt.m1358a(r1, r12, r11)     // Catch:{ CancellationException -> 0x0014 }
            if (r12 != r0) goto L_0x0055
            return r0
        L_0x0055:
            r5 = r12
            androidx.compose.ui.input.pointer.p r5 = (androidx.compose.p015ui.input.pointer.C1644p) r5     // Catch:{ CancellationException -> 0x0014 }
            if (r5 == 0) goto L_0x007e
            kq.l<y.c, kotlin.m> r12 = r11.$onDragStart     // Catch:{ CancellationException -> 0x0014 }
            long r6 = r5.f3658c     // Catch:{ CancellationException -> 0x0014 }
            y.c r4 = new y.c     // Catch:{ CancellationException -> 0x0014 }
            r4.<init>(r6)     // Catch:{ CancellationException -> 0x0014 }
            r12.invoke(r4)     // Catch:{ CancellationException -> 0x0014 }
            androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1 r12 = new androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1     // Catch:{ CancellationException -> 0x0014 }
            kq.a<kotlin.m> r6 = r11.$onDragEnd     // Catch:{ CancellationException -> 0x0014 }
            kq.a<kotlin.m> r7 = r11.$onDragCancel     // Catch:{ CancellationException -> 0x0014 }
            kq.p<androidx.compose.ui.input.pointer.p, y.c, kotlin.m> r8 = r11.$onDrag     // Catch:{ CancellationException -> 0x0014 }
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ CancellationException -> 0x0014 }
            r11.L$0 = r2     // Catch:{ CancellationException -> 0x0014 }
            r11.label = r3     // Catch:{ CancellationException -> 0x0014 }
            java.lang.Object r12 = r1.mo6563s0(r12, r11)     // Catch:{ CancellationException -> 0x0014 }
            if (r12 != r0) goto L_0x007e
            return r0
        L_0x007e:
            kotlin.m r12 = kotlin.C19394m.f43287a
            return r12
        L_0x0081:
            kq.a<kotlin.m> r0 = r11.$onDragCancel
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
