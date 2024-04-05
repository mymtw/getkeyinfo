package com.google.android.datatransport.cct.internal;

import com.google.auto.value.AutoValue;
import java.util.List;
import p674sm.C18534a;
import p690um.C18622d;
import p690um.C18623e;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.h */
public abstract class C6511h {
    public static C6511h create(List<C6514j> list) {
        return new AutoValue_BatchedLogRequest(list);
    }

    public static C18534a createDataEncoder() {
        C18623e eVar = new C18623e();
        C6506c cVar = C6506c.f14412a;
        eVar.mo70131a(C6511h.class, cVar);
        eVar.mo70131a(AutoValue_BatchedLogRequest.class, cVar);
        C6509f fVar = C6509f.f14425a;
        eVar.mo70131a(C6514j.class, fVar);
        eVar.mo70131a(AutoValue_LogRequest.class, fVar);
        C6507d dVar = C6507d.f14414a;
        eVar.mo70131a(ClientInfo.class, dVar);
        eVar.mo70131a(AutoValue_ClientInfo.class, dVar);
        C6505b bVar = C6505b.f14399a;
        eVar.mo70131a(C6503a.class, bVar);
        eVar.mo70131a(AutoValue_AndroidClientInfo.class, bVar);
        C6508e eVar2 = C6508e.f14417a;
        eVar.mo70131a(C6512i.class, eVar2);
        eVar.mo70131a(AutoValue_LogEvent.class, eVar2);
        C6510g gVar = C6510g.f14433a;
        eVar.mo70131a(NetworkConnectionInfo.class, gVar);
        eVar.mo70131a(AutoValue_NetworkConnectionInfo.class, gVar);
        eVar.f41120d = true;
        return new C18622d(eVar);
    }

    public abstract List<C6514j> getLogRequests();
}
