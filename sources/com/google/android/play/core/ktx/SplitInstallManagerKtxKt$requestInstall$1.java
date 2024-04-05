package com.google.android.play.core.ktx;

import androidx.compose.foundation.layout.C0761x;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.C19383o;
import p673sl.C18521a;
import p744gq.C19060c;

@C19060c(mo70540c = "com.google.android.play.core.ktx.SplitInstallManagerKtxKt", mo70541f = "SplitInstallManagerKtx.kt", mo70542l = {41}, mo70543m = "requestInstall")
final class SplitInstallManagerKtxKt$requestInstall$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public /* synthetic */ Object result;

    public SplitInstallManagerKtxKt$requestInstall$1(C19340c cVar) {
        super(cVar);
    }

    public final Object invokeSuspend(Object obj) {
        SplitInstallManagerKtxKt$requestInstall$1 splitInstallManagerKtxKt$requestInstall$1;
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
            splitInstallManagerKtxKt$requestInstall$1 = this;
        } else {
            splitInstallManagerKtxKt$requestInstall$1 = new SplitInstallManagerKtxKt$requestInstall$1(this);
        }
        Object obj2 = splitInstallManagerKtxKt$requestInstall$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = splitInstallManagerKtxKt$requestInstall$1.label;
        if (i2 == 0) {
            C0761x.m1684O0(obj2);
            new ArrayList();
            new ArrayList();
            throw null;
        } else if (i2 == 1) {
            List list = (List) splitInstallManagerKtxKt$requestInstall$1.L$2;
            List list2 = (List) splitInstallManagerKtxKt$requestInstall$1.L$1;
            C18521a aVar = (C18521a) splitInstallManagerKtxKt$requestInstall$1.L$0;
            C0761x.m1684O0(obj2);
            C19383o.m32793c(obj2, "runTask(startInstall(bui…est(modules, languages)))");
            return obj2;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
