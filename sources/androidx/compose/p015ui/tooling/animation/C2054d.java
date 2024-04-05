package androidx.compose.p015ui.tooling.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.tooling.ComposeAnimation;
import androidx.compose.animation.tooling.ComposeAnimationType;
import java.util.Set;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.tooling.animation.d */
public final class C2054d implements ComposeAnimation {

    /* renamed from: a */
    public final Set<Object> f4647a;

    public C2054d(Transition transition, Set set) {
        C19383o.m32797g(transition, "transition");
        ComposeAnimationType composeAnimationType = ComposeAnimationType.TRANSITION_ANIMATION;
        this.f4647a = set;
    }
}
