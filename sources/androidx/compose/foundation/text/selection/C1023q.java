package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.C0958l;
import androidx.compose.foundation.text.C0965r;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.TextFieldState;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.p015ui.platform.C1822c1;
import androidx.compose.p015ui.platform.TextToolbarStatus;
import androidx.compose.p015ui.text.C2021q;
import androidx.compose.p015ui.text.C2022r;
import androidx.compose.p015ui.text.input.C1994n;
import kotlin.jvm.internal.C19383o;
import p288y.C8343c;

/* renamed from: androidx.compose.foundation.text.selection.q */
public final class C1023q implements C0958l {

    /* renamed from: a */
    public final /* synthetic */ TextFieldSelectionManager f2151a;

    /* renamed from: b */
    public final /* synthetic */ boolean f2152b;

    public C1023q(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        this.f2151a = textFieldSelectionManager;
        this.f2152b = z;
    }

    /* renamed from: a */
    public final void mo4510a() {
        TextFieldSelectionManager.m2037b(this.f2151a, this.f2152b ? Handle.SelectionStart : Handle.SelectionEnd);
        TextFieldSelectionManager textFieldSelectionManager = this.f2151a;
        textFieldSelectionManager.f2097o.setValue(new C8343c(C1014i.m2103a(textFieldSelectionManager.mo4650i(this.f2152b))));
    }

    /* renamed from: b */
    public final void mo4511b(long j) {
        TextFieldSelectionManager textFieldSelectionManager = this.f2151a;
        textFieldSelectionManager.f2093k = C1014i.m2103a(textFieldSelectionManager.mo4650i(this.f2152b));
        TextFieldSelectionManager textFieldSelectionManager2 = this.f2151a;
        textFieldSelectionManager2.f2097o.setValue(new C8343c(textFieldSelectionManager2.f2093k));
        TextFieldSelectionManager textFieldSelectionManager3 = this.f2151a;
        textFieldSelectionManager3.f2095m = C8343c.f18295b;
        textFieldSelectionManager3.f2096n.setValue(this.f2152b ? Handle.SelectionStart : Handle.SelectionEnd);
        TextFieldState textFieldState = this.f2151a.f2086d;
        if (textFieldState != null) {
            textFieldState.f1952i = false;
        }
    }

    /* renamed from: c */
    public final void mo4512c() {
        TextFieldSelectionManager.m2037b(this.f2151a, (Handle) null);
        TextFieldSelectionManager.m2036a(this.f2151a, (C8343c) null);
    }

    /* renamed from: d */
    public final void mo4513d(long j) {
        C0965r c;
        C2021q qVar;
        int i;
        int i2;
        TextFieldSelectionManager textFieldSelectionManager = this.f2151a;
        textFieldSelectionManager.f2095m = C8343c.m16645f(textFieldSelectionManager.f2095m, j);
        TextFieldState textFieldState = this.f2151a.f2086d;
        if (!(textFieldState == null || (c = textFieldState.mo4562c()) == null || (qVar = c.f2042a) == null)) {
            TextFieldSelectionManager textFieldSelectionManager2 = this.f2151a;
            boolean z = this.f2152b;
            textFieldSelectionManager2.f2097o.setValue(new C8343c(C8343c.m16645f(textFieldSelectionManager2.f2093k, textFieldSelectionManager2.f2095m)));
            if (z) {
                C8343c cVar = (C8343c) textFieldSelectionManager2.f2097o.getValue();
                C19383o.m32794d(cVar);
                i = qVar.mo7751l(cVar.f18299a);
            } else {
                C1994n nVar = textFieldSelectionManager2.f2084b;
                long j2 = textFieldSelectionManager2.mo4651j().f4449b;
                int i3 = C2022r.f4596c;
                i = nVar.mo7684b((int) (j2 >> 32));
            }
            int i4 = i;
            if (z) {
                i2 = textFieldSelectionManager2.f2084b.mo7684b(C2022r.m4464c(textFieldSelectionManager2.mo4651j().f4449b));
            } else {
                C8343c cVar2 = (C8343c) textFieldSelectionManager2.f2097o.getValue();
                C19383o.m32794d(cVar2);
                i2 = qVar.mo7751l(cVar2.f18299a);
            }
            TextFieldSelectionManager.m2038c(textFieldSelectionManager2, textFieldSelectionManager2.mo4651j(), i4, i2, z, SelectionAdjustment.Companion.f2054b);
        }
        TextFieldState textFieldState2 = this.f2151a.f2086d;
        if (textFieldState2 != null) {
            textFieldState2.f1952i = false;
        }
    }

    public final void onCancel() {
    }

    public final void onStop() {
        TextToolbarStatus textToolbarStatus = null;
        TextFieldSelectionManager.m2037b(this.f2151a, (Handle) null);
        TextFieldSelectionManager.m2036a(this.f2151a, (C8343c) null);
        TextFieldSelectionManager textFieldSelectionManager = this.f2151a;
        TextFieldState textFieldState = textFieldSelectionManager.f2086d;
        if (textFieldState != null) {
            textFieldState.f1952i = true;
        }
        C1822c1 c1Var = textFieldSelectionManager.f2089g;
        if (c1Var != null) {
            textToolbarStatus = c1Var.getStatus();
        }
        if (textToolbarStatus == TextToolbarStatus.Hidden) {
            this.f2151a.mo4655n();
        }
    }
}
