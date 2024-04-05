package androidx.compose.material;

import androidx.compose.p015ui.graphics.C1545s;
import androidx.compose.runtime.C1302d;
import kotlin.C19394m;
import kotlin.jvm.internal.Lambda;
import p753kq.C19861p;
import p753kq.C19862q;
import p753kq.C19865t;

public final class TextFieldTransitionScope$Transition$1 extends Lambda implements C19861p<C1302d, Integer, C19394m> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ C19865t<Float, C1545s, C1545s, Float, C1302d, Integer, C19394m> $content;
    public final /* synthetic */ C19862q<InputPhase, C1302d, Integer, C1545s> $contentColor;
    public final /* synthetic */ long $focusedTextStyleColor;
    public final /* synthetic */ InputPhase $inputState;
    public final /* synthetic */ boolean $showLabel;
    public final /* synthetic */ TextFieldTransitionScope $tmp0_rcvr;
    public final /* synthetic */ long $unfocusedTextStyleColor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldTransitionScope$Transition$1(TextFieldTransitionScope textFieldTransitionScope, InputPhase inputPhase, long j, long j2, C19862q<? super InputPhase, ? super C1302d, ? super Integer, C1545s> qVar, boolean z, C19865t<? super Float, ? super C1545s, ? super C1545s, ? super Float, ? super C1302d, ? super Integer, C19394m> tVar, int i) {
        super(2);
        this.$tmp0_rcvr = textFieldTransitionScope;
        this.$inputState = inputPhase;
        this.$focusedTextStyleColor = j;
        this.$unfocusedTextStyleColor = j2;
        this.$contentColor = qVar;
        this.$showLabel = z;
        this.$content = tVar;
        this.$$changed = i;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((C1302d) obj, ((Number) obj2).intValue());
        return C19394m.f43287a;
    }

    public final void invoke(C1302d dVar, int i) {
        this.$tmp0_rcvr.mo5200a(this.$inputState, this.$focusedTextStyleColor, this.$unfocusedTextStyleColor, this.$contentColor, this.$showLabel, this.$content, dVar, this.$$changed | 1);
    }
}
