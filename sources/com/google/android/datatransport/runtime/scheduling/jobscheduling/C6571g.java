package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.HashMap;
import java.util.Map;
import p120gh.C6898a;

/* renamed from: com.google.android.datatransport.runtime.scheduling.jobscheduling.g */
public final /* synthetic */ class C6571g implements C6898a.C6899a {

    /* renamed from: b */
    public final /* synthetic */ C6573i f14514b;

    /* renamed from: c */
    public final /* synthetic */ Map f14515c;

    public /* synthetic */ C6571g(C6573i iVar, HashMap hashMap) {
        this.f14514b = iVar;
        this.f14515c = hashMap;
    }

    /* renamed from: e */
    public final Object mo12018e() {
        C6573i iVar = this.f14514b;
        Map map = this.f14515c;
        iVar.getClass();
        for (Map.Entry entry : map.entrySet()) {
            iVar.f14527i.mo18778d((long) ((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }
}
