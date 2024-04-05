package com.bugsnag.android;

import com.bugsnag.android.C5780k2;
import com.bugsnag.android.internal.C5771f;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.HashMap;
import kotlin.C19394m;
import p753kq.C19861p;

/* renamed from: com.bugsnag.android.r */
public final class C5827r implements C19861p<String, String, C19394m> {

    /* renamed from: b */
    public final /* synthetic */ C5917u f12461b;

    public C5827r(C5917u uVar) {
        this.f12461b = uVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj2;
        HashMap hashMap = new HashMap();
        hashMap.put(ResponseConstants.FROM, (String) obj);
        hashMap.put(ResponseConstants.f19136TO, str);
        this.f12461b.mo16682a(BreadcrumbType.STATE, "Orientation changed", hashMap);
        C5921v vVar = this.f12461b.f12639r;
        if (vVar.getObservers$bugsnag_android_core_release().isEmpty()) {
            return null;
        }
        C5780k2.C5798r rVar = new C5780k2.C5798r(str);
        for (C5771f onStateChange : vVar.getObservers$bugsnag_android_core_release()) {
            onStateChange.onStateChange(rVar);
        }
        return null;
    }
}
