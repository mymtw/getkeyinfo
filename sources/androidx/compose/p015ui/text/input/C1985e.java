package androidx.compose.p015ui.text.input;

import androidx.compose.p015ui.text.C1913a;
import androidx.compose.p015ui.text.C1933b;
import androidx.compose.p015ui.text.C2022r;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;

/* renamed from: androidx.compose.ui.text.input.e */
public final class C1985e {

    /* renamed from: a */
    public TextFieldValue f4468a;

    /* renamed from: b */
    public C1986f f4469b;

    public C1985e() {
        C1913a aVar = C1933b.f4359a;
        TextFieldValue textFieldValue = new TextFieldValue(aVar, C2022r.f4595b, (C2022r) null);
        this.f4468a = textFieldValue;
        this.f4469b = new C1986f(aVar, textFieldValue.f4449b);
    }

    /* renamed from: a */
    public final TextFieldValue mo7657a(List<? extends C1984d> list) {
        C19383o.m32797g(list, "editCommands");
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            ((C1984d) list.get(i)).mo7647a(this.f4469b);
        }
        C2022r rVar = null;
        C1913a aVar = new C1913a(this.f4469b.toString(), (List) null, 6);
        C1986f fVar = this.f4469b;
        long l = C0005b.m47l(fVar.f4471b, fVar.f4472c);
        C1986f fVar2 = this.f4469b;
        int i2 = fVar2.f4473d;
        if (i2 != -1) {
            z = true;
        }
        if (z) {
            rVar = new C2022r(C0005b.m47l(i2, fVar2.f4474e));
        }
        TextFieldValue textFieldValue = new TextFieldValue(aVar, l, rVar);
        this.f4468a = textFieldValue;
        return textFieldValue;
    }
}
