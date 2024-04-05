package com.google.android.play.core.ktx;

import androidx.compose.foundation.layout.C0761x;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import p673sl.C18521a;
import p744gq.C19060c;

@C19060c(mo70540c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt", mo70541f = "SplitInstallManagerKtx.kt", mo70542l = {115}, mo70543m = "requestSessionState")
final class SplitInstallManagerKtxKt$requestSessionState$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public SplitInstallManagerKtxKt$requestSessionState$1(C19340c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        SplitInstallManagerKtxKt$requestSessionState$1 splitInstallManagerKtxKt$requestSessionState$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            splitInstallManagerKtxKt$requestSessionState$1 = this;
        } else {
            splitInstallManagerKtxKt$requestSessionState$1 = new SplitInstallManagerKtxKt$requestSessionState$1(this);
        }
        Object obj2 = splitInstallManagerKtxKt$requestSessionState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splitInstallManagerKtxKt$requestSessionState$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            throw null;
        } else if (i2 == 1) {
            C18521a aVar = (C18521a) splitInstallManagerKtxKt$requestSessionState$1.L$0;
            C0761x.m1684O0(obj2);
            C19383o.m32793c(obj2, "runTask(getSessionState(sessionId))");
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
