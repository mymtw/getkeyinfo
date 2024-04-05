package androidx.compose.p015ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Set;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.tooling.animation.a */
public final class C2050a implements ComposeAnimation {

    /* renamed from: a */
    public final Set<C2051b> f4636a = C19382n.m32704D0(C2051b.m4485a("Enter"), C2051b.m4485a("Exit"));

    public C2050a(Transition transition) {
        C19383o.m32797g(transition, ResponseConstants.PARENT);
        ComposeAnimationType composeAnimationType = ComposeAnimationType.ANIMATED_VISIBILITY;
    }
}
