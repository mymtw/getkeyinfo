package com.bugsnag.android;

import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;

/* renamed from: com.bugsnag.android.a0 */
public final class C5717a0 extends C5756i {

    /* renamed from: b */
    public String f12145b;

    /* renamed from: c */
    public String f12146c;

    /* renamed from: a */
    public final void mo16478a() {
        if (!getObservers$bugsnag_android_core_release().isEmpty()) {
            C5780k2.C5793m mVar = new C5780k2.C5793m(mo16479b());
            for (C5771f onStateChange : getObservers$bugsnag_android_core_release()) {
                onStateChange.onStateChange(mVar);
            }
        }
    }

    /* renamed from: b */
    public final String mo16479b() {
        String str = this.f12146c;
        if (!(str != "__BUGSNAG_MANUAL_CONTEXT__")) {
            str = null;
        }
        return str != null ? str : this.f12145b;
    }
}
