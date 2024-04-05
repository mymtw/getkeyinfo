package p103f5;

import android.app.Activity;
import com.cardinalcommerce.cardinalmobilesdk.models.CardinalActionCode;
import com.cardinalcommerce.cardinalmobilesdk.models.ValidateResponse;
import com.cardinalcommerce.shared.p065cs.p069e.C6272b;
import kotlin.jvm.internal.C19382n;
import p139i5.C6993a;
import p151j5.C7118a;
import p160k5.C7197b;

/* renamed from: f5.c */
public final class C6788c extends C19382n {

    /* renamed from: r */
    public static final C6993a f14946r = C6993a.m13555g();

    /* renamed from: Q0 */
    public static void m13180Q0(C6272b bVar, Activity activity, C7118a aVar, C7197b bVar2, String str) {
        C6789d dVar;
        if (bVar.mo17792w().equalsIgnoreCase("Y") || bVar.mo17792w().equalsIgnoreCase("N")) {
            dVar = new C6789d(10607);
        } else if (bVar.mo17776g().equalsIgnoreCase("N")) {
            C19382n.m32775v(activity, bVar, aVar.f15826f);
            return;
        } else {
            dVar = new C6789d(10608);
        }
        m13181R0(bVar2, dVar, activity, aVar, str);
    }

    /* renamed from: R0 */
    public static void m13181R0(C7197b bVar, C6789d dVar, Activity activity, C7118a aVar, String str) {
        C6993a aVar2 = f14946r;
        aVar2.mo19179h(dVar, str);
        if (bVar != null) {
            ValidateResponse validateResponse = new ValidateResponse(false, CardinalActionCode.ERROR, dVar);
            aVar2.mo19180i(aVar.f15824d.toString());
            bVar.onValidated(activity.getApplicationContext(), validateResponse, "");
        }
    }
}
