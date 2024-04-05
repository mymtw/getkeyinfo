package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.foundation.layout.C0761x;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p744gq.C19060c;
import p753kq.C19857l;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1", mo70541f = "PointerInteropFilter.android.kt", mo70542l = {343}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1 */
final class PointerInteropFilter_androidKt$motionEventSpy$1 extends SuspendLambda implements C19861p<C1652w, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ C19857l<MotionEvent, C19394m> $watcher;
    private /* synthetic */ Object L$0;
    public int label;

    @C19060c(mo70540c = "androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1", mo70541f = "PointerInteropFilter.android.kt", mo70542l = {345}, mo70543m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1$1 */
    public static final class C16211 extends RestrictedSuspendLambda implements C19861p<C1631c, C19340c<? super C19394m>, Object> {
        private /* synthetic */ Object L$0;
        public int label;

        public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
            C16211 r0 = new C16211(lVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(C1631c cVar, C19340c<? super C19394m> cVar2) {
            return ((C16211) create(cVar, cVar2)).invokeSuspend(C19394m.f43287a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0032  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x003f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r6.label
                r2 = 1
                if (r1 == 0) goto L_0x001c
                if (r1 != r2) goto L_0x0014
                java.lang.Object r1 = r6.L$0
                androidx.compose.ui.input.pointer.c r1 = (androidx.compose.p015ui.input.pointer.C1631c) r1
                androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                r3 = r1
                r1 = r0
                r0 = r6
                goto L_0x0037
            L_0x0014:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x001c:
                androidx.compose.foundation.layout.C0761x.m1684O0(r7)
                java.lang.Object r7 = r6.L$0
                androidx.compose.ui.input.pointer.c r7 = (androidx.compose.p015ui.input.pointer.C1631c) r7
                r1 = r7
                r7 = r6
            L_0x0025:
                androidx.compose.ui.input.pointer.PointerEventPass r3 = androidx.compose.p015ui.input.pointer.PointerEventPass.Initial
                r7.L$0 = r1
                r7.label = r2
                java.lang.Object r3 = r1.mo6568f0(r3, r7)
                if (r3 != r0) goto L_0x0032
                return r0
            L_0x0032:
                r5 = r0
                r0 = r7
                r7 = r3
                r3 = r1
                r1 = r5
            L_0x0037:
                androidx.compose.ui.input.pointer.l r7 = (androidx.compose.p015ui.input.pointer.C1640l) r7
                android.view.MotionEvent r7 = r7.mo6609a()
                if (r7 == 0) goto L_0x0044
                kq.l<android.view.MotionEvent, kotlin.m> r4 = r3
                r4.invoke(r7)
            L_0x0044:
                r7 = r0
                r0 = r1
                r1 = r3
                goto L_0x0025
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.input.pointer.PointerInteropFilter_androidKt$motionEventSpy$1.C16211.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$motionEventSpy$1(C19857l<? super MotionEvent, C19394m> lVar, C19340c<? super PointerInteropFilter_androidKt$motionEventSpy$1> cVar) {
        super(2, cVar);
        this.$watcher = lVar;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        PointerInteropFilter_androidKt$motionEventSpy$1 pointerInteropFilter_androidKt$motionEventSpy$1 = new PointerInteropFilter_androidKt$motionEventSpy$1(this.$watcher, cVar);
        pointerInteropFilter_androidKt$motionEventSpy$1.L$0 = obj;
        return pointerInteropFilter_androidKt$motionEventSpy$1;
    }

    public final Object invoke(C1652w wVar, C19340c<? super C19394m> cVar) {
        return ((PointerInteropFilter_androidKt$motionEventSpy$1) create(wVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C0761x.m1684O0(obj);
            C1652w wVar = (C1652w) this.L$0;
            wVar.mo6559G();
            final C19857l<MotionEvent, C19394m> lVar = this.$watcher;
            C16211 r1 = new C16211((C19340c<? super C16211>) null);
            this.label = 1;
            if (wVar.mo6563s0(r1, this) == coroutineSingletons) {
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
