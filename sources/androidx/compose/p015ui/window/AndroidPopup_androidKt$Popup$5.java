package androidx.compose.p015ui.window;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5", mo70541f = "AndroidPopup.android.kt", mo70542l = {299}, mo70543m = "invokeSuspend")
/* renamed from: androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5 */
public final class AndroidPopup_androidKt$Popup$5 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ PopupLayout $popupLayout;
    private /* synthetic */ Object L$0;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidPopup_androidKt$Popup$5(PopupLayout popupLayout, C19340c<? super AndroidPopup_androidKt$Popup$5> cVar) {
        super(2, cVar);
        this.$popupLayout = popupLayout;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        AndroidPopup_androidKt$Popup$5 androidPopup_androidKt$Popup$5 = new AndroidPopup_androidKt$Popup$5(this.$popupLayout, cVar);
        androidPopup_androidKt$Popup$5.L$0 = obj;
        return androidPopup_androidKt$Popup$5;
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((AndroidPopup_androidKt$Popup$5) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.d0 r1 = (kotlinx.coroutines.C19525d0) r1
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            r5 = r4
            goto L_0x0036
        L_0x0012:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x001a:
            androidx.compose.foundation.layout.C0761x.m1684O0(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.d0 r5 = (kotlinx.coroutines.C19525d0) r5
            r1 = r5
            r5 = r4
        L_0x0023:
            boolean r3 = kotlinx.coroutines.C19697g.m33467e(r1)
            if (r3 == 0) goto L_0x003c
            androidx.compose.ui.window.AndroidPopup_androidKt$Popup$5$1 r3 = androidx.compose.p015ui.window.AndroidPopup_androidKt$Popup$5.C20811.INSTANCE
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r3 = androidx.compose.p015ui.platform.InfiniteAnimationPolicyKt.m3944a(r3, r5)
            if (r3 != r0) goto L_0x0036
            return r0
        L_0x0036:
            androidx.compose.ui.window.PopupLayout r3 = r5.$popupLayout
            r3.pollForLocationOnScreenChange()
            goto L_0x0023
        L_0x003c:
            kotlin.m r5 = kotlin.C19394m.f43287a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p015ui.window.AndroidPopup_androidKt$Popup$5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
