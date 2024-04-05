package p279x;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.C19383o;

/* renamed from: x.a */
public final class C8277a implements C8278b {

    /* renamed from: a */
    public final View f18143a;

    /* renamed from: b */
    public final C8282f f18144b;

    /* renamed from: c */
    public final AutofillManager f18145c;

    public C8277a(View view, C8282f fVar) {
        C19383o.m32797g(view, "view");
        C19383o.m32797g(fVar, "autofillTree");
        this.f18143a = view;
        this.f18144b = fVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f18145c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }
}
