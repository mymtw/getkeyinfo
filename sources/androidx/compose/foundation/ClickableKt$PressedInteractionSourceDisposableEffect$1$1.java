package androidx.compose.foundation;

import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.foundation.interaction.C0642l;
import androidx.compose.foundation.interaction.C0643m;
import androidx.compose.runtime.C1338j0;
import androidx.compose.runtime.C1358r;
import androidx.compose.runtime.C1360s;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class ClickableKt$PressedInteractionSourceDisposableEffect$1$1 extends Lambda implements C19857l<C1360s, C1358r> {
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ C1338j0<C0643m> $pressedInteraction;

    /* renamed from: androidx.compose.foundation.ClickableKt$PressedInteractionSourceDisposableEffect$1$1$a */
    public static final class C0497a implements C1358r {

        /* renamed from: a */
        public final /* synthetic */ C1338j0 f1258a;

        /* renamed from: b */
        public final /* synthetic */ C0640j f1259b;

        public C0497a(C1338j0 j0Var, C0640j jVar) {
            this.f1258a = j0Var;
            this.f1259b = jVar;
        }

        public final void dispose() {
            C0643m mVar = (C0643m) this.f1258a.getValue();
            if (mVar != null) {
                this.f1259b.mo3871b(new C0642l(mVar));
                this.f1258a.setValue(null);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClickableKt$PressedInteractionSourceDisposableEffect$1$1(C1338j0<C0643m> j0Var, C0640j jVar) {
        super(1);
        this.$pressedInteraction = j0Var;
        this.$interactionSource = jVar;
    }

    public final C1358r invoke(C1360s sVar) {
        C19383o.m32797g(sVar, "$this$DisposableEffect");
        return new C0497a(this.$pressedInteraction, this.$interactionSource);
    }
}
