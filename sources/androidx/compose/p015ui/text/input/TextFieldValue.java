package androidx.compose.p015ui.text.input;

import android.support.p013v4.media.C0071c;
import android.support.p013v4.media.C0072d;
import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.runtime.saveable.SaverKt;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;

/* renamed from: androidx.compose.ui.text.input.TextFieldValue */
public final class TextFieldValue {

    /* renamed from: a */
    public final C1913a f4448a;

    /* renamed from: b */
    public final long f4449b;

    /* renamed from: c */
    public final C2022r f4450c;

    static {
        SaverKt.m2861a(TextFieldValue$Companion$Saver$1.INSTANCE, TextFieldValue$Companion$Saver$2.INSTANCE);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TextFieldValue(String str, long j, int i) {
        this(new C1913a((i & 1) != 0 ? "" : str, (List) null, 6), (i & 2) != 0 ? C2022r.f4595b : j, (C2022r) null);
    }

    /* renamed from: a */
    public static TextFieldValue m4312a(TextFieldValue textFieldValue, C1913a aVar, long j, int i) {
        if ((i & 1) != 0) {
            aVar = textFieldValue.f4448a;
        }
        if ((i & 2) != 0) {
            j = textFieldValue.f4449b;
        }
        C2022r rVar = (i & 4) != 0 ? textFieldValue.f4450c : null;
        textFieldValue.getClass();
        C19383o.m32797g(aVar, "annotatedString");
        return new TextFieldValue(aVar, j, rVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextFieldValue)) {
            return false;
        }
        TextFieldValue textFieldValue = (TextFieldValue) obj;
        return C2022r.m4462a(this.f4449b, textFieldValue.f4449b) && C19383o.m32792b(this.f4450c, textFieldValue.f4450c) && C19383o.m32792b(this.f4448a, textFieldValue.f4448a);
    }

    public final int hashCode() {
        long j = this.f4449b;
        int i = C2022r.f4596c;
        int b = C0071c.m190b(j, this.f4448a.hashCode() * 31, 31);
        C2022r rVar = this.f4450c;
        return b + (rVar != null ? Long.hashCode(rVar.f4597a) : 0);
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("TextFieldValue(text='");
        h.append(this.f4448a);
        h.append("', selection=");
        h.append(C2022r.m4468g(this.f4449b));
        h.append(", composition=");
        h.append(this.f4450c);
        h.append(')');
        return h.toString();
    }

    public TextFieldValue(C1913a aVar, long j, C2022r rVar) {
        C2022r rVar2;
        this.f4448a = aVar;
        this.f4449b = C0005b.m26T(aVar.f4296b.length(), j);
        if (rVar != null) {
            rVar2 = new C2022r(C0005b.m26T(aVar.f4296b.length(), rVar.f4597a));
        } else {
            rVar2 = null;
        }
        this.f4450c = rVar2;
    }
}
