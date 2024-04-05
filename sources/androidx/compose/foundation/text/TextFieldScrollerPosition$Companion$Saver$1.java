package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.saveable.C1375i;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p568fn.C17782b;
import p753kq.C19861p;

public final class TextFieldScrollerPosition$Companion$Saver$1 extends Lambda implements C19861p<C1375i, TextFieldScrollerPosition, List<? extends Object>> {
    public static final TextFieldScrollerPosition$Companion$Saver$1 INSTANCE = new TextFieldScrollerPosition$Companion$Saver$1();

    public TextFieldScrollerPosition$Companion$Saver$1() {
        super(2);
    }

    public final List<Object> invoke(C1375i iVar, TextFieldScrollerPosition textFieldScrollerPosition) {
        C19383o.m32797g(iVar, "$this$listSaver");
        C19383o.m32797g(textFieldScrollerPosition, "it");
        Object[] objArr = new Object[2];
        boolean z = false;
        objArr[0] = Float.valueOf(textFieldScrollerPosition.mo4553a());
        if (((Orientation) textFieldScrollerPosition.f1943e.getValue()) == Orientation.Vertical) {
            z = true;
        }
        objArr[1] = Boolean.valueOf(z);
        return C17782b.m29865e0(objArr);
    }
}
