package androidx.compose.foundation.text;

import androidx.compose.foundation.text.KeyMappingKt;
import androidx.compose.foundation.text.selection.C1025s;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p015ui.text.input.C1984d;
import androidx.compose.p015ui.text.input.C1985e;
import androidx.compose.p015ui.text.input.C1987g;
import androidx.compose.p015ui.text.input.C1994n;
import androidx.compose.p015ui.text.input.TextFieldValue;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p753kq.C19857l;

/* renamed from: androidx.compose.foundation.text.o */
public final class C0961o {

    /* renamed from: a */
    public final TextFieldState f2025a;

    /* renamed from: b */
    public final TextFieldSelectionManager f2026b;

    /* renamed from: c */
    public final TextFieldValue f2027c;

    /* renamed from: d */
    public final boolean f2028d;

    /* renamed from: e */
    public final boolean f2029e;

    /* renamed from: f */
    public final C1025s f2030f;

    /* renamed from: g */
    public final C1994n f2031g;

    /* renamed from: h */
    public final C0966s f2032h;

    /* renamed from: i */
    public final C0948b f2033i;

    /* renamed from: j */
    public final C19857l<TextFieldValue, C19394m> f2034j;

    public C0961o() {
        throw null;
    }

    public C0961o(TextFieldState textFieldState, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, C1025s sVar, C1994n nVar, C0966s sVar2, C19857l lVar) {
        KeyMappingKt.C0912a aVar = C0950d.f1975a;
        C19383o.m32797g(textFieldState, "state");
        C19383o.m32797g(textFieldSelectionManager, "selectionManager");
        C19383o.m32797g(textFieldValue, "value");
        C19383o.m32797g(sVar, "preparedSelectionState");
        C19383o.m32797g(nVar, "offsetMapping");
        C19383o.m32797g(aVar, "keyMapping");
        C19383o.m32797g(lVar, "onValueChange");
        this.f2025a = textFieldState;
        this.f2026b = textFieldSelectionManager;
        this.f2027c = textFieldValue;
        this.f2028d = z;
        this.f2029e = z2;
        this.f2030f = sVar;
        this.f2031g = nVar;
        this.f2032h = sVar2;
        this.f2033i = aVar;
        this.f2034j = lVar;
    }

    /* renamed from: a */
    public final void mo4577a(List<? extends C1984d> list) {
        C1985e eVar = this.f2025a.f1946c;
        ArrayList q1 = C19327t.m32661q1(list);
        q1.add(0, new C1987g());
        this.f2034j.invoke(eVar.mo7657a(q1));
    }
}
