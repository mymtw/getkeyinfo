package com.bugsnag.android;

import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;

/* renamed from: com.bugsnag.android.q1 */
public final class C5825q1 extends C5756i {

    /* renamed from: b */
    public boolean f12459b;

    /* renamed from: c */
    public Integer f12460c;

    /* renamed from: a */
    public final void mo16612a() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            C5780k2.C5797q qVar = new C5780k2.C5797q(mo16613b(), this.f12459b);
            for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(qVar);
            }
        }
    }

    /* renamed from: b */
    public final String mo16613b() {
        Integer num = this.f12460c;
        if (num == null) {
            return "None";
        }
        if (num.intValue() == 80) {
            return "Complete";
        }
        if (num.intValue() == 60) {
            return "Moderate";
        }
        if (num.intValue() == 40) {
            return "Background";
        }
        if (num.intValue() == 20) {
            return "UI hidden";
        }
        if (num.intValue() == 15) {
            return "Running critical";
        }
        if (num.intValue() == 10) {
            return "Running low";
        }
        if (num.intValue() == 5) {
            return "Running moderate";
        }
        return "Unknown (" + num + ')';
    }
}
