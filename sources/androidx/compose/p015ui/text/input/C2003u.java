package androidx.compose.p015ui.text.input;

import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.input.u */
public final class C2003u implements C1991k {

    /* renamed from: a */
    public final /* synthetic */ TextInputServiceAndroid f4525a;

    public C2003u(TextInputServiceAndroid textInputServiceAndroid) {
        this.f4525a = textInputServiceAndroid;
    }

    /* renamed from: a */
    public final void mo7675a(KeyEvent keyEvent) {
        C19383o.m32797g(keyEvent, "event");
        ((BaseInputConnection) this.f4525a.f4459i.getValue()).sendKeyEvent(keyEvent);
    }

    /* renamed from: b */
    public final void mo7676b(ArrayList arrayList) {
        this.f4525a.f4454d.invoke(arrayList);
    }

    /* renamed from: c */
    public final void mo7677c(int i) {
        this.f4525a.f4455e.invoke(new C1989i(i));
    }
}
