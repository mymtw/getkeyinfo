package androidx.compose.p015ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1411t;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 */
public final class C1777x68d8e1f6 extends Lambda implements C19857l<Configuration, C19394m> {
    public final /* synthetic */ C1338j0<Configuration> $configuration$delegate;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1777x68d8e1f6(C1338j0<Configuration> j0Var) {
        super(1);
        this.$configuration$delegate = j0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Configuration configuration) {
        C19383o.m32797g(configuration, "it");
        C1338j0<Configuration> j0Var = this.$configuration$delegate;
        C1411t tVar = AndroidCompositionLocals_androidKt.f3986a;
        j0Var.setValue(configuration);
    }
}
