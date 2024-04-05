package androidx.core.view;

import android.view.View;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.sequences.C19433i;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.core.view.ViewKt$allViews$1", mo70541f = "View.kt", mo70542l = {406, 408}, mo70543m = "invokeSuspend")
final class ViewKt$allViews$1 extends RestrictedSuspendLambda implements C19861p<C19433i<? super View>, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, C19340c<? super ViewKt$allViews$1> cVar) {
        super(2, cVar);
        this.$this_allViews = view;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, cVar);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    public final Object invoke(C19433i<? super View> iVar, C19340c<? super C19394m> cVar) {
        return ((ViewKt$allViews$1) create(iVar, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlin.sequences.i} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0020
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0066
        L_0x0010:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L_0x0018:
            java.lang.Object r1 = r5.L$0
            kotlin.sequences.i r1 = (kotlin.sequences.C19433i) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            goto L_0x0035
        L_0x0020:
            androidx.compose.foundation.layout.C0761x.m1684O0(r6)
            java.lang.Object r6 = r5.L$0
            r1 = r6
            kotlin.sequences.i r1 = (kotlin.sequences.C19433i) r1
            android.view.View r6 = r5.$this_allViews
            r5.L$0 = r1
            r5.label = r3
            kotlin.coroutines.intrinsics.CoroutineSingletons r6 = r1.mo72006a(r6, r5)
            if (r6 != r0) goto L_0x0035
            return r0
        L_0x0035:
            android.view.View r6 = r5.$this_allViews
            boolean r3 = r6 instanceof android.view.ViewGroup
            if (r3 == 0) goto L_0x0066
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.C19383o.m32797g(r6, r3)
            androidx.core.view.ViewGroupKt$descendants$1 r3 = new androidx.core.view.ViewGroupKt$descendants$1
            r4 = 0
            r3.<init>(r6, r4)
            r5.L$0 = r4
            r5.label = r2
            r1.getClass()
            kotlin.sequences.h r6 = new kotlin.sequences.h
            r6.<init>()
            kotlin.coroutines.c r2 = kotlin.jvm.internal.C19388s.m32843R(r3, r6, r6)
            r6.f43358e = r2
            java.lang.Object r6 = r1.mo72007b(r6, r5)
            if (r6 != r0) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            kotlin.m r6 = kotlin.C19394m.f43287a
        L_0x0063:
            if (r6 != r0) goto L_0x0066
            return r0
        L_0x0066:
            kotlin.m r6 = kotlin.C19394m.f43287a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.view.ViewKt$allViews$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
