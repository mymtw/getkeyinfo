package com.bugsnag.android;

import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;

/* renamed from: com.bugsnag.android.u2 */
public final class C5920u2 extends C5756i {

    /* renamed from: b */
    public C5915t2 f12663b;

    public C5920u2(C5915t2 t2Var) {
        this.f12663b = t2Var;
    }

    /* renamed from: a */
    public final void mo16691a() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            C5780k2.C5799s sVar = new C5780k2.C5799s(this.f12663b);
            for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(sVar);
            }
        }
    }
}
