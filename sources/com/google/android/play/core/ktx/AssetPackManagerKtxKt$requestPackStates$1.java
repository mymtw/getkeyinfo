package com.google.android.play.core.ktx;

import androidx.compose.foundation.layout.C0761x;
import com.google.android.play.core.assetpacks.C15582b;
import java.util.List;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import p689ul.C18606d;
import p744gq.C19060c;

@C19060c(mo70540c = "com.google.android.play.core.ktx.AssetPackManagerKtxKt", mo70541f = "AssetPackManagerKtx.kt", mo70542l = {79}, mo70543m = "requestPackStates")
final class AssetPackManagerKtxKt$requestPackStates$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public AssetPackManagerKtxKt$requestPackStates$1(C19340c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        AssetPackManagerKtxKt$requestPackStates$1 assetPackManagerKtxKt$requestPackStates$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            assetPackManagerKtxKt$requestPackStates$1 = this;
        } else {
            assetPackManagerKtxKt$requestPackStates$1 = new AssetPackManagerKtxKt$requestPackStates$1(this);
        }
        Object obj2 = assetPackManagerKtxKt$requestPackStates$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = assetPackManagerKtxKt$requestPackStates$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            throw null;
        } else if (i2 == 1) {
            C18606d dVar = (C18606d) assetPackManagerKtxKt$requestPackStates$1.L$2;
            List list = (List) assetPackManagerKtxKt$requestPackStates$1.L$1;
            C15582b bVar = (C15582b) assetPackManagerKtxKt$requestPackStates$1.L$0;
            C0761x.m1684O0(obj2);
            C19383o.m32793c(obj2, "runTask(task)");
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
