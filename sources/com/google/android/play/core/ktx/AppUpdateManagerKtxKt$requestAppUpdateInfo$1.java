package com.google.android.play.core.ktx;

import androidx.compose.foundation.layout.C0761x;
import com.google.android.play.core.appupdate.C15560b;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import p744gq.C19060c;

@C19060c(mo70540c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt", mo70541f = "AppUpdateManagerKtx.kt", mo70542l = {199}, mo70543m = "requestAppUpdateInfo")
final class AppUpdateManagerKtxKt$requestAppUpdateInfo$1 extends ContinuationImpl {
    public Object L$0;
    public int label;
    public /* synthetic */ Object result;

    public AppUpdateManagerKtxKt$requestAppUpdateInfo$1(C19340c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        AppUpdateManagerKtxKt$requestAppUpdateInfo$1 appUpdateManagerKtxKt$requestAppUpdateInfo$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            appUpdateManagerKtxKt$requestAppUpdateInfo$1 = this;
        } else {
            appUpdateManagerKtxKt$requestAppUpdateInfo$1 = new AppUpdateManagerKtxKt$requestAppUpdateInfo$1(this);
        }
        Object obj2 = appUpdateManagerKtxKt$requestAppUpdateInfo$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = appUpdateManagerKtxKt$requestAppUpdateInfo$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            throw null;
        } else if (i2 == 1) {
            C15560b bVar = (C15560b) appUpdateManagerKtxKt$requestAppUpdateInfo$1.L$0;
            C0761x.m1684O0(obj2);
            C19383o.m32793c(obj2, "runTask(appUpdateInfo)");
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
