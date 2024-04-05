package androidx.compose.p015ui.platform;

import android.content.res.Configuration;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$configurationChangeObserver$1 */
public final class AndroidComposeView$configurationChangeObserver$1 extends Lambda implements C19857l<Configuration, C19394m> {
    public static final AndroidComposeView$configurationChangeObserver$1 INSTANCE = new AndroidComposeView$configurationChangeObserver$1();

    public AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return C19394m.f43287a;
    }

    public final void invoke(Configuration configuration) {
        C19383o.m32797g(configuration, "it");
    }
}
