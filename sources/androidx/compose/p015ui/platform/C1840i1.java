package androidx.compose.p015ui.platform;

import android.content.Context;
import androidx.compose.p015ui.text.font.C1950f;
import androidx.lifecycle.Lifecycle;
import com.etsy.android.lib.models.ResponseConstants;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;

/* renamed from: androidx.compose.ui.platform.i1 */
public final class C1840i1 implements C1950f.C1951a {
    public /* synthetic */ C1840i1(Context context) {
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* renamed from: a */
    public static final C19846a m4041a(AbstractComposeView abstractComposeView, Lifecycle lifecycle) {
        if (lifecycle.mo10734b().compareTo(Lifecycle.State.DESTROYED) > 0) {
            C1837h1 h1Var = new C1837h1(abstractComposeView);
            lifecycle.mo10733a(h1Var);
            return new ViewCompositionStrategy_androidKt$installForLifecycle$2(lifecycle, h1Var);
        }
        throw new IllegalStateException(("Cannot configure " + abstractComposeView + " to disposeComposition at Lifecycle ON_DESTROY: " + lifecycle + "is already destroyed").toString());
    }
}
