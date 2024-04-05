package androidx.compose.foundation.text;

import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TextFieldScrollKt$textFieldScrollable$2$controller$1 extends Lambda implements C19857l<Float, Float> {
    public final /* synthetic */ TextFieldScrollerPosition $scrollerPosition;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextFieldScrollKt$textFieldScrollable$2$controller$1(TextFieldScrollerPosition textFieldScrollerPosition) {
        super(1);
        this.$scrollerPosition = textFieldScrollerPosition;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).floatValue());
    }

    public final Float invoke(float f) {
        float a = this.$scrollerPosition.mo4553a() + f;
        if (a > ((Number) this.$scrollerPosition.f1940b.getValue()).floatValue()) {
            f = ((Number) this.$scrollerPosition.f1940b.getValue()).floatValue() - this.$scrollerPosition.mo4553a();
        } else if (a < 0.0f) {
            f = -this.$scrollerPosition.mo4553a();
        }
        TextFieldScrollerPosition textFieldScrollerPosition = this.$scrollerPosition;
        textFieldScrollerPosition.f1939a.setValue(Float.valueOf(textFieldScrollerPosition.mo4553a() + f));
        return Float.valueOf(f);
    }
}
