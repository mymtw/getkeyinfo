package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C19433i;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.core.view.ViewGroupKt$descendants$1", mo70541f = "ViewGroup.kt", mo70542l = {97, 99}, mo70543m = "invokeSuspend")
final class ViewGroupKt$descendants$1 extends RestrictedSuspendLambda implements C19861p<C19433i<? super View>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ ViewGroup $this_descendants;
    public int I$0;
    public int I$1;
    private /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewGroupKt$descendants$1(ViewGroup viewGroup, C19340c<? super ViewGroupKt$descendants$1> cVar) {
        super(2, cVar);
        this.$this_descendants = viewGroup;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ViewGroupKt$descendants$1 viewGroupKt$descendants$1 = new ViewGroupKt$descendants$1(this.$this_descendants, cVar);
        viewGroupKt$descendants$1.L$0 = obj;
        return viewGroupKt$descendants$1;
    }

    public final Object invoke(C19433i<? super View> iVar, C19340c<? super C19394m> cVar) {
        return ((ViewGroupKt$descendants$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b7, code lost:
        if (r4 < r5) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x003b
            if (r1 == r3) goto L_0x0026
            if (r1 != r2) goto L_0x001e
            int r1 = r12.I$1
            int r4 = r12.I$0
            java.lang.Object r5 = r12.L$1
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r6 = r12.L$0
            kotlin.sequences.i r6 = (kotlin.sequences.C19433i) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r13 = r12
            goto L_0x00ac
        L_0x001e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0026:
            int r1 = r12.I$1
            int r4 = r12.I$0
            java.lang.Object r5 = r12.L$2
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r6 = r12.L$1
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r7 = r12.L$0
            kotlin.sequences.i r7 = (kotlin.sequences.C19433i) r7
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            r13 = r12
            goto L_0x0071
        L_0x003b:
            androidx.compose.foundation.layout.C0761x.m1684O0(r13)
            java.lang.Object r13 = r12.L$0
            kotlin.sequences.i r13 = (kotlin.sequences.C19433i) r13
            android.view.ViewGroup r1 = r12.$this_descendants
            r4 = 0
            int r5 = r1.getChildCount()
            if (r5 <= 0) goto L_0x00b9
            r6 = r12
        L_0x004c:
            int r7 = r4 + 1
            android.view.View r4 = r1.getChildAt(r4)
            java.lang.String r8 = "getChildAt(index)"
            kotlin.jvm.internal.C19383o.m32796f(r4, r8)
            r6.L$0 = r13
            r6.L$1 = r1
            r6.L$2 = r4
            r6.I$0 = r7
            r6.I$1 = r5
            r6.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = r13.mo72006a(r4, r6)
            if (r8 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r10 = r7
            r7 = r13
            r13 = r6
            r6 = r1
            r1 = r5
            r5 = r4
            r4 = r10
        L_0x0071:
            boolean r8 = r5 instanceof android.view.ViewGroup
            if (r8 == 0) goto L_0x00b3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r5, r8)
            androidx.core.view.ViewGroupKt$descendants$1 r8 = new androidx.core.view.ViewGroupKt$descendants$1
            r9 = 0
            r8.<init>(r5, r9)
            r13.L$0 = r7
            r13.L$1 = r6
            r13.L$2 = r9
            r13.I$0 = r4
            r13.I$1 = r1
            r13.label = r2
            r7.getClass()
            kotlin.sequences.h r5 = new kotlin.sequences.h
            r5.<init>()
            kotlin.coroutines.c r8 = kotlin.jvm.internal.C19388s.m32843R(r8, r5, r5)
            r5.f43358e = r8
            java.lang.Object r5 = r7.mo72007b(r5, r13)
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r5 != r8) goto L_0x00a5
            goto L_0x00a7
        L_0x00a5:
            kotlin.m r5 = kotlin.C19394m.f43287a
        L_0x00a7:
            if (r5 != r0) goto L_0x00aa
            return r0
        L_0x00aa:
            r5 = r6
            r6 = r7
        L_0x00ac:
            r10 = r6
            r6 = r13
            r13 = r10
            r11 = r5
            r5 = r1
            r1 = r11
            goto L_0x00b7
        L_0x00b3:
            r5 = r1
            r1 = r6
            r6 = r13
            r13 = r7
        L_0x00b7:
            if (r4 < r5) goto L_0x004c
        L_0x00b9:
            kotlin.m r13 = kotlin.C19394m.f43287a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewGroupKt$descendants$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
