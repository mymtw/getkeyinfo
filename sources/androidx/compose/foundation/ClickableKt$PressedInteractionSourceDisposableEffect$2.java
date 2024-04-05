package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.runtime.C1302d;
import androidx.compose.runtime.C1338j0;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;

public final class ClickableKt$PressedInteractionSourceDisposableEffect$2 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1338j0<C0643m> $pressedInteraction;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$2(C0640j jVar, C1338j0<C0643m> j0Var, int i) {
        super(2);
        this.$interactionSource = jVar;
        this.$pressedInteraction = j0Var;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        ClickableKt.m1295a(this.$interactionSource, this.$pressedInteraction, dVar, this.$$changed | 1);
    }
}
