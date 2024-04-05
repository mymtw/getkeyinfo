package com.paypal.android.platform.authsdk.splitlogin.p534ui;

import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2", mo70541f = "SplitLoginViewModel.kt", mo70542l = {84, 87}, mo70543m = "invokeSuspend")
/* renamed from: com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2 */
public final class SplitLoginViewModel$onNextClicked$2 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ String $emailEntered;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ SplitLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplitLoginViewModel$onNextClicked$2(SplitLoginViewModel splitLoginViewModel, String str, C19340c<? super SplitLoginViewModel$onNextClicked$2> cVar) {
        super(2, cVar);
        this.this$0 = splitLoginViewModel;
        this.$emailEntered = str;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SplitLoginViewModel$onNextClicked$2(this.this$0, this.$emailEntered, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SplitLoginViewModel$onNextClicked$2) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r13.label
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r5) goto L_0x001b
            if (r1 != r3) goto L_0x0013
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x007e
        L_0x0013:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L_0x001b:
            java.lang.Object r1 = r13.L$1
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r6 = r13.L$0
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r6 = (com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginViewModel) r6
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            goto L_0x0054
        L_0x0027:
            androidx.compose.foundation.layout.C0761x.m1684O0(r14)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r14 = r13.this$0
            androidx.databinding.ObservableBoolean r14 = r14.isEmailInErrorState()
            r14.set(r4)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r14 = r13.this$0
            java.lang.String r1 = r13.$emailEntered
            boolean unused = r14.isValidEmail(r1)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r6 = r13.this$0
            java.lang.String r1 = r13.$emailEntered
            kotlinx.coroutines.channels.d r14 = r6.analyticsEventsChannel
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$Initiated r7 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginEvent$Initiated
            r7.<init>()
            r13.L$0 = r6
            r13.L$1 = r1
            r13.label = r5
            java.lang.Object r14 = r14.mo72188E(r7, r13)
            if (r14 != r0) goto L_0x0054
            return r0
        L_0x0054:
            com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl r14 = r6.repository
            if (r14 != 0) goto L_0x005c
            r14 = r2
            goto L_0x0060
        L_0x005c:
            com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginRequest r14 = r14.getData()
        L_0x0060:
            if (r14 != 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            r14.setPublicCredential(r1)
        L_0x0066:
            if (r14 != 0) goto L_0x0069
            goto L_0x006f
        L_0x0069:
            com.paypal.android.platform.authsdk.splitlogin.data.SplitLoginRepositoryImpl r1 = r6.repository
            if (r1 != 0) goto L_0x0071
        L_0x006f:
            r14 = r2
            goto L_0x0080
        L_0x0071:
            r13.L$0 = r2
            r13.L$1 = r2
            r13.label = r3
            java.lang.Object r14 = r1.verifyCredential(r14, r13)
            if (r14 != r0) goto L_0x007e
            return r0
        L_0x007e:
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus r14 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus) r14
        L_0x0080:
            if (r14 != 0) goto L_0x0096
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Companion r14 = com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Companion
            com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network r0 = new com.paypal.android.platform.authsdk.authcommon.model.AuthenticationError$Network
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 14
            r12 = 0
            java.lang.String r7 = "repository not found"
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Failure r14 = r14.withException(r0)
        L_0x0096:
            boolean r0 = r14 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Failure
            r1 = 3
            if (r0 == 0) goto L_0x00ad
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r0 = r13.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$1 r3 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$1
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r4 = r13.this$0
            r3.<init>(r4, r14, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
            goto L_0x0139
        L_0x00ad:
            boolean r0 = r14 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Pending
            if (r0 == 0) goto L_0x00c3
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r14 = r13.this$0
            kotlinx.coroutines.d0 r14 = kotlin.jvm.internal.C19388s.m32866i0(r14)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$2 r0 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$2
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r3 = r13.this$0
            r0.<init>(r3, r2)
            kotlinx.coroutines.C19697g.m33468f(r14, r2, r2, r0, r1)
            goto L_0x0139
        L_0x00c3:
            boolean r0 = r14 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success
            if (r0 == 0) goto L_0x0125
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r0 = r13.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$3 r3 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$3
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r6 = r13.this$0
            r3.<init>(r6, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
            com.paypal.android.platform.authsdk.authcommon.model.ResultStatus$Success r14 = (com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Success) r14
            java.lang.Object r14 = r14.getData()
            com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginData r14 = (com.paypal.android.platform.authsdk.splitlogin.domain.SplitLoginData) r14
            java.util.ArrayList r0 = r14.getAuthOptions()
            if (r0 != 0) goto L_0x00e6
            goto L_0x00ee
        L_0x00e6:
            int r0 = r0.size()
            if (r0 != r5) goto L_0x00ee
            r0 = r5
            goto L_0x00ef
        L_0x00ee:
            r0 = r4
        L_0x00ef:
            if (r0 == 0) goto L_0x0114
            java.util.ArrayList r0 = r14.getAuthOptions()
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r3 = "password"
            boolean r0 = kotlin.text.C19457k.m33019W0(r0, r3, r5)
            if (r0 == 0) goto L_0x0114
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r14 = r13.this$0
            kotlinx.coroutines.d0 r14 = kotlin.jvm.internal.C19388s.m32866i0(r14)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$4 r0 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$4
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r3 = r13.this$0
            r0.<init>(r3, r2)
            kotlinx.coroutines.C19697g.m33468f(r14, r2, r2, r0, r1)
            goto L_0x0139
        L_0x0114:
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r0 = r13.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$5 r3 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$5
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r4 = r13.this$0
            r3.<init>(r14, r4, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
            goto L_0x0139
        L_0x0125:
            boolean r0 = r14 instanceof com.paypal.android.platform.authsdk.authcommon.model.ResultStatus.Unhandled
            if (r0 == 0) goto L_0x0139
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r0 = r13.this$0
            kotlinx.coroutines.d0 r0 = kotlin.jvm.internal.C19388s.m32866i0(r0)
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$6 r3 = new com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel$onNextClicked$2$6
            com.paypal.android.platform.authsdk.splitlogin.ui.SplitLoginViewModel r4 = r13.this$0
            r3.<init>(r4, r14, r2)
            kotlinx.coroutines.C19697g.m33468f(r0, r2, r2, r3, r1)
        L_0x0139:
            kotlin.m r14 = kotlin.C19394m.f43287a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paypal.android.platform.authsdk.splitlogin.p534ui.SplitLoginViewModel$onNextClicked$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
