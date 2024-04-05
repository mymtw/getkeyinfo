package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

public final class TextFieldScrollerPosition$Companion$Saver$2 extends Lambda implements C19857l<List<? extends Object>, TextFieldScrollerPosition> {
    public static final TextFieldScrollerPosition$Companion$Saver$2 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$2();

    public TextFieldScrollerPosition$Companion$Saver$2() {
        super(1);
    }

    public final TextFieldScrollerPosition invoke(List<? extends Object> list) {
        C19383o.m32797g(list, "restored");
        return new TextFieldScrollerPosition(((Float) list.get(0)).floatValue(), ((Boolean) list.get(1)).booleanValue() ? Orientation.Vertical : Orientation.Horizontal);
    }
}
