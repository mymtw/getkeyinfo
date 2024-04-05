package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0958l;
import androidx.compose.foundation.text.C0965r;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;
import p020b0.C3449a;
import p288y.C8343c;

/* renamed from: androidx.compose.foundation.text.selection.p */
public final class C1022p implements C0958l {

    /* renamed from: a */
    public final /* synthetic */ TextFieldSelectionManager f2150a;

    public C1022p(TextFieldSelectionManager textFieldSelectionManager) {
        this.f2150a = textFieldSelectionManager;
    }

    /* renamed from: a */
    public final void mo4510a() {
        TextFieldSelectionManager.m2037b(this.f2150a, Handle.Cursor);
        TextFieldSelectionManager textFieldSelectionManager = this.f2150a;
        textFieldSelectionManager.f2097o.setValue(new C8343c(C1014i.m2103a(textFieldSelectionManager.mo4650i(true))));
    }

    /* renamed from: b */
    public final void mo4511b(long j) {
        TextFieldSelectionManager textFieldSelectionManager = this.f2150a;
        textFieldSelectionManager.f2093k = C1014i.m2103a(textFieldSelectionManager.mo4650i(true));
        TextFieldSelectionManager textFieldSelectionManager2 = this.f2150a;
        textFieldSelectionManager2.f2097o.setValue(new C8343c(textFieldSelectionManager2.f2093k));
        TextFieldSelectionManager textFieldSelectionManager3 = this.f2150a;
        textFieldSelectionManager3.f2095m = C8343c.f18295b;
        textFieldSelectionManager3.f2096n.setValue(Handle.Cursor);
    }

    /* renamed from: c */
    public final void mo4512c() {
        TextFieldSelectionManager.m2037b(this.f2150a, (Handle) null);
        TextFieldSelectionManager.m2036a(this.f2150a, (C8343c) null);
    }

    /* renamed from: d */
    public final void mo4513d(long j) {
        C0965r c;
        C2021q qVar;
        TextFieldSelectionManager textFieldSelectionManager = this.f2150a;
        textFieldSelectionManager.f2095m = C8343c.m16645f(textFieldSelectionManager.f2095m, j);
        TextFieldState textFieldState = this.f2150a.f2086d;
        if (textFieldState != null && (c = textFieldState.mo4562c()) != null && (qVar = c.f2042a) != null) {
            TextFieldSelectionManager textFieldSelectionManager2 = this.f2150a;
            textFieldSelectionManager2.f2097o.setValue(new C8343c(C8343c.m16645f(textFieldSelectionManager2.f2093k, textFieldSelectionManager2.f2095m)));
            C8343c cVar = (C8343c) textFieldSelectionManager2.f2097o.getValue();
            C19383o.m32794d(cVar);
            int l = qVar.mo7751l(cVar.f18299a);
            long l2 = C0005b.m47l(l, l);
            if (!C2022r.m4462a(l2, textFieldSelectionManager2.mo4651j().f4449b)) {
                C3449a aVar = textFieldSelectionManager2.f2090h;
                if (aVar != null) {
                    aVar.mo12970a();
                }
                textFieldSelectionManager2.f2085c.invoke(TextFieldSelectionManager.m2039e(textFieldSelectionManager2.mo4651j().f4448a, l2));
            }
        }
    }

    public final void onCancel() {
    }

    public final void onStop() {
        TextFieldSelectionManager.m2037b(this.f2150a, (Handle) null);
        TextFieldSelectionManager.m2036a(this.f2150a, (C8343c) null);
    }
}
