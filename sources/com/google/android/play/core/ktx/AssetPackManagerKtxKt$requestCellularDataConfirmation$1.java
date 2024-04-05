package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.compose.foundation.layout.C0761x;
import com.google.android.play.core.assetpacks.C15582b;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import p744gq.C19060c;

@C19060c(mo70540c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", mo70541f = "AssetPackManagerKtx.kt", mo70542l = {97}, mo70543m = "requestCellularDataConfirmation")
final class AssetPackManagerKtxKt$requestCellularDataConfirmation$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;

    public AssetPackManagerKtxKt$requestCellularDataConfirmation$1(C19340c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        AssetPackManagerKtxKt$requestCellularDataConfirmation$1 assetPackManagerKtxKt$requestCellularDataConfirmation$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            assetPackManagerKtxKt$requestCellularDataConfirmation$1 = this;
        } else {
            assetPackManagerKtxKt$requestCellularDataConfirmation$1 = new AssetPackManagerKtxKt$requestCellularDataConfirmation$1(this);
        }
        Object obj2 = assetPackManagerKtxKt$requestCellularDataConfirmation$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = assetPackManagerKtxKt$requestCellularDataConfirmation$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            throw null;
        } else if (i2 == 1) {
            Activity activity = (Activity) assetPackManagerKtxKt$requestCellularDataConfirmation$1.L$1;
            C15582b bVar = (C15582b) assetPackManagerKtxKt$requestCellularDataConfirmation$1.L$0;
            C0761x.m1684O0(obj2);
            C19383o.m32793c(obj2, "runTask(showCellularDataConfirmation(activity))");
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
