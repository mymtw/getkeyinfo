package androidx.compose.foundation.text;

import androidx.compose.foundation.C1030w;
import androidx.compose.foundation.gestures.C0608f;
import androidx.compose.foundation.gestures.C0615m;
import androidx.compose.foundation.gestures.C0616n;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.interaction.C0640j;
import androidx.compose.p015ui.C1436d;
import androidx.compose.p015ui.platform.CompositionLocalsKt;
import androidx.compose.p015ui.unit.LayoutDirection;
import androidx.compose.runtime.C1302d;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19862q;

final class TextFieldScrollKt$textFieldScrollable$2 extends Lambda implements C19862q<C1436d, C1302d, Integer, C1436d> {
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ C0640j $interactionSource;
    public final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2(TextFieldScrollerPosition textFieldScrollerPosition, boolean z, C0640j jVar) {
        super(3);
        this.$scrollerPosition = textFieldScrollerPosition;
        this.$enabled = z;
        this.$interactionSource = jVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((C1436d) obj, (C1302d) obj2, ((Number) obj3).intValue());
    }

    public final C1436d invoke(C1436d dVar, C1302d dVar2, int i) {
        boolean z;
        C19383o.m32797g(dVar, "$this$composed");
        dVar2.mo5465u(805428266);
        boolean z2 = ((Orientation) this.$scrollerPosition.f1943e.getValue()) == Orientation.Vertical || !(dVar2.mo5410J(CompositionLocalsKt.f4025k) == LayoutDirection.Rtl);
        C0615m a = C0616n.m1431a(new TextFieldScrollKt$textFieldScrollable$2$controller$1(this.$scrollerPosition), dVar2);
        C1436d.C1437a aVar = C1436d.C1437a.f3125b;
        Orientation orientation = (Orientation) this.$scrollerPosition.f1943e.getValue();
        if (this.$enabled) {
            if (!(((Number) this.$scrollerPosition.f1940b.getValue()).floatValue() == 0.0f)) {
                z = true;
                C0640j jVar = this.$interactionSource;
                ScrollableKt.C0580a aVar2 = ScrollableKt.f1340a;
                C19383o.m32797g(a, "state");
                C19383o.m32797g(orientation, "orientation");
                C1436d b = ScrollableKt.m1398b(aVar, a, orientation, (C1030w) null, z, z2, (C0608f) null, jVar);
                dVar2.mo5406H();
                return b;
            }
        }
        z = false;
        C0640j jVar2 = this.$interactionSource;
        ScrollableKt.C0580a aVar22 = ScrollableKt.f1340a;
        C19383o.m32797g(a, "state");
        C19383o.m32797g(orientation, "orientation");
        C1436d b2 = ScrollableKt.m1398b(aVar, a, orientation, (C1030w) null, z, z2, (C0608f) null, jVar2);
        dVar2.mo5406H();
        return b2;
    }
}
