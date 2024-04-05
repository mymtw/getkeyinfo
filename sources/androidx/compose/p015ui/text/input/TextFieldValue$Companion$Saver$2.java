package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.SaversKt;
import androidx.compose.runtime.saveable.C1374h;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19857l;

/* renamed from: androidx.compose.ui.text.input.TextFieldValue$Companion$Saver$2 */
public final class TextFieldValue$Companion$Saver$2 extends Lambda implements C19857l<Object, TextFieldValue> {
    public static final TextFieldValue$Companion$Saver$2 INSTANCE = new TextFieldValue$Companion$Saver$2();

    public TextFieldValue$Companion$Saver$2() {
        super(1);
    }

    public final TextFieldValue invoke(Object obj) {
        C19383o.m32797g(obj, "it");
        List list = (List) obj;
        Object obj2 = list.get(0);
        C1374h hVar = SaversKt.f4276a;
        Boolean bool = Boolean.FALSE;
        C1913a aVar = (!C19383o.m32792b(obj2, bool) && obj2 != null) ? (C1913a) hVar.f2979b.invoke(obj2) : null;
        C19383o.m32794d(aVar);
        Object obj3 = list.get(1);
        int i = C2022r.f4596c;
        C2022r rVar = (!C19383o.m32792b(obj3, bool) && obj3 != null) ? (C2022r) SaversKt.f4287l.f2979b.invoke(obj3) : null;
        C19383o.m32794d(rVar);
        return new TextFieldValue(aVar, rVar.f4597a, (C2022r) null);
    }
}
