package com.cardinalcommerce.cardinalmobilesdk.p045a.p047c;

import android.os.Build;
import android.support.p013v4.media.C0072d;
import com.cardinalcommerce.shared.models.exceptions.InvalidInputException;
import com.cardinalcommerce.shared.p065cs.p067b.C6266a;
import com.cardinalcommerce.shared.p065cs.p068d.C6270a;
import org.json.JSONObject;
import p003a2.C0023f;
import p103f5.C6787b;
import p103f5.C6789d;
import p103f5.C6790e;
import p103f5.C6791f;
import p115g5.C6882b;
import p139i5.C6993a;
import p226r8.C7784a;

/* renamed from: com.cardinalcommerce.cardinalmobilesdk.a.c.b */
public class C6136b extends C6270a {

    /* renamed from: b */
    private static final C6993a f13256b = C6993a.m13555g();

    /* renamed from: a */
    private C6882b f13257a;

    public C6136b(C6882b bVar, C6791f fVar, int i) {
        if (bVar == null || fVar == null) {
            C6993a aVar = f13256b;
            aVar.getClass();
            aVar.mo19177d(String.valueOf(10204), "Internal Error.", (String) null);
            throw new InvalidInputException("API Call", new Throwable("Invalid Input Exception"));
        }
        this.f13257a = bVar;
        C6790e eVar = fVar.f14954a.f15830a;
        C6993a aVar2 = f13256b;
        StringBuilder h = C0072d.m201h("Creating device fingerprint JSON with referenceId : ");
        h.append(eVar.f14950b);
        aVar2.mo19175a("CardinalInit", h.toString(), (String) null);
        String k = C0023f.m110k(new StringBuilder(), eVar.f14953e, "/V2/Browser/SaveBrowserData");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ReferenceId", eVar.f14950b);
        jSONObject.put("OrgUnitId", eVar.f14949a);
        jSONObject.put("Origin", "CardinalMobileSdk_Android");
        jSONObject.put("DeviceChannel", "SDK");
        jSONObject.put("Fingerprint", Build.FINGERPRINT);
        jSONObject.put("UserAgent", Build.BRAND);
        jSONObject.put("ThreatMetrixEnabled", eVar.f14951c);
        jSONObject.put("ThreatMetrixEventType", eVar.f14952d);
        C7784a.m15038d().getClass();
        jSONObject.put("NativeData", C7784a.f17219c.mo17832h());
        super.mo17766a(k, jSONObject.toString(), i);
        aVar2.mo19175a("CardinalInit", "DF task initialized", (String) null);
    }

    /* renamed from: a */
    public void mo17212a(Exception exc, C6266a aVar) {
        C6993a aVar2 = f13256b;
        String localizedMessage = exc.getLocalizedMessage();
        aVar2.getClass();
        aVar2.mo19177d(String.valueOf(10218), localizedMessage, (String) null);
        ((C6787b) this.f13257a).mo18929g(new C6789d(10218));
    }

    /* renamed from: a */
    public void mo17214a(String str, int i) {
        C6789d dVar = new C6789d(i, str);
        f13256b.mo19179h(dVar, (String) null);
        ((C6787b) this.f13257a).mo18929g(dVar);
    }

    /* renamed from: a */
    public void mo17213a(String str) {
        f13256b.mo19175a("CardinalInit", "LASSO Save Successful", (String) null);
        C6787b bVar = (C6787b) this.f13257a;
        if (bVar.f14943f.f15827g) {
            bVar.mo18930h(bVar.f14942e);
        }
        bVar.f14945h = false;
    }
}
