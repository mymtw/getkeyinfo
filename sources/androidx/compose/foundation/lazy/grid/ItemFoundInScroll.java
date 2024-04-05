package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.C0424f;
import androidx.compose.animation.core.C0426g;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.C19383o;

final class ItemFoundInScroll extends CancellationException {
    private final C0805g item;
    private final C0424f<Float, C0426g> previousAnimation;

    public ItemFoundInScroll(C0805g gVar, C0424f<Float, C0426g> fVar) {
        C19383o.m32797g(gVar, "item");
        C19383o.m32797g(fVar, "previousAnimation");
        this.item = gVar;
        this.previousAnimation = fVar;
    }

    public final C0805g getItem() {
        return this.item;
    }

    public final C0424f<Float, C0426g> getPreviousAnimation() {
        return this.previousAnimation;
    }
}
