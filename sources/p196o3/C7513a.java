package p196o3;

import com.airbnb.lottie.C4828c;
import com.airbnb.lottie.parser.moshi.C4863a;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.etsy.android.p327ui.dialog.EtsyDialogFragment;
import java.io.IOException;
import java.util.ArrayList;
import p125h3.C6936h;
import p158k3.C7179b;
import p158k3.C7185h;
import p158k3.C7189l;
import p206p3.C7659e;
import p214q3.C7718a;
import p226r8.C7784a;

/* renamed from: o3.a */
public final class C7513a {

    /* renamed from: a */
    public static JsonReader.C4854a f16763a = JsonReader.C4854a.m10470a("k", EtsyDialogFragment.OPT_X_BUTTON, "y");

    /* renamed from: a */
    public static C7784a m14500a(C4863a aVar, C4828c cVar) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (aVar.mo14635k() == JsonReader.Token.BEGIN_ARRAY) {
            aVar.mo14625a();
            while (aVar.mo14629f()) {
                arrayList.add(new C6936h(cVar, C7538q.m14519a(aVar, cVar, C7659e.m14702c(), C7543v.f16807a, aVar.mo14635k() == JsonReader.Token.BEGIN_OBJECT)));
            }
            aVar.mo14627d();
            C7539r.m14521b(arrayList);
        } else {
            arrayList.add(new C7718a(C7536p.m14516b(aVar, C7659e.m14702c())));
        }
        return new C7784a((Object) arrayList);
    }

    /* renamed from: b */
    public static C7189l m14501b(C4863a aVar, C4828c cVar) throws IOException {
        aVar.mo14626b();
        C7784a aVar2 = null;
        C7179b bVar = null;
        boolean z = false;
        C7179b bVar2 = null;
        while (aVar.mo14635k() != JsonReader.Token.END_OBJECT) {
            int r = aVar.mo14637r(f16763a);
            if (r != 0) {
                if (r != 1) {
                    if (r != 2) {
                        aVar.mo14638t();
                        aVar.mo14639u();
                    } else if (aVar.mo14635k() == JsonReader.Token.STRING) {
                        aVar.mo14639u();
                    } else {
                        bVar = C7519d.m14505a(aVar, cVar, true);
                    }
                } else if (aVar.mo14635k() == JsonReader.Token.STRING) {
                    aVar.mo14639u();
                } else {
                    bVar2 = C7519d.m14505a(aVar, cVar, true);
                }
                z = true;
            } else {
                aVar2 = m14500a(aVar, cVar);
            }
        }
        aVar.mo14628e();
        if (z) {
            cVar.mo14581a("Lottie doesn't support expressions.");
        }
        return aVar2 != null ? aVar2 : new C7185h(bVar2, bVar);
    }
}
