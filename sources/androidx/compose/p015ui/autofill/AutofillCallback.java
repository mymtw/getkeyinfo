package androidx.compose.p015ui.autofill;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.C19383o;
import p279x.C8277a;

/* renamed from: androidx.compose.ui.autofill.AutofillCallback */
public final class AutofillCallback extends AutofillManager.AutofillCallback {
    public static final AutofillCallback INSTANCE = new AutofillCallback();

    private AutofillCallback() {
    }

    public void onAutofillEvent(View view, int i, int i2) {
        C19383o.m32797g(view, "view");
        super.onAutofillEvent(view, i, i2);
        Log.d("Autofill Status", i2 != 1 ? i2 != 2 ? i2 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }

    public final void register(C8277a aVar) {
        C19383o.m32797g(aVar, "autofill");
        aVar.f18145c.registerCallback(this);
    }

    public final void unregister(C8277a aVar) {
        C19383o.m32797g(aVar, "autofill");
        aVar.f18145c.unregisterCallback(this);
    }
}
