package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class CoreTextFieldKt$CoreTextField$scrollerPosition$1$1 extends Lambda implements C19846a<TextFieldScrollerPosition> {
    public final /* synthetic */ Orientation $orientation;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$scrollerPosition$1$1(Orientation orientation) {
        super(0);
        this.$orientation = orientation;
    }

    public final TextFieldScrollerPosition invoke() {
        return new TextFieldScrollerPosition(0.0f, this.$orientation);
    }
}
