package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0426g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C19383o;

final class ItemFoundInScroll extends CancellationException {
    private final C0827j item;
    private final C0424f<Float, C0426g> previousAnimation;

    public ItemFoundInScroll(C0827j jVar, C0424f<Float, C0426g> fVar) {
        C19383o.m32797g(jVar, "item");
        C19383o.m32797g(fVar, "previousAnimation");
        this.item = jVar;
        this.previousAnimation = fVar;
    }

    public final C0827j getItem() {
        return this.item;
    }

    public final C0424f<Float, C0426g> getPreviousAnimation() {
        return this.previousAnimation;
    }
}
