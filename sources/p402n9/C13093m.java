package p402n9;

import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.TranslatedPrivacyPolicy;
import com.etsy.android.lib.session.PrivacySetting;
import com.etsy.android.p327ui.search.p330v2.filters.searchfiltersv2.C11012q;
import com.etsy.android.p327ui.shop.C11194r;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p287xp.C8339g;
import p342ed.C12683b;
import p486y9.C13887c;
import retrofit2.C20145v;

/* renamed from: n9.m */
public final /* synthetic */ class C13093m implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f28788b;

    public /* synthetic */ C13093m(int i) {
        this.f28788b = i;
    }

    public final Object apply(Object obj) {
        switch (this.f28788b) {
            case 0:
                Map map = (Map) obj;
                C19383o.m32797g(map, "it");
                PrivacySetting privacySetting = (PrivacySetting) map.get("gdpr_tp");
                return Boolean.valueOf(privacySetting != null ? privacySetting.f19535c : false);
            case 1:
                C19383o.m32797g((Throwable) obj, "throwable");
                return new C12683b.C12687b.C12688a();
            case 2:
                Throwable th = (Throwable) obj;
                C19383o.m32797g(th, "it");
                return new C11012q.C11013a(th);
            case 3:
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                TranslatedPrivacyPolicy translatedPrivacyPolicy = (TranslatedPrivacyPolicy) (a0Var != null ? MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), TranslatedPrivacyPolicy.class) : null);
                return translatedPrivacyPolicy != null ? new C11194r.C11196b(translatedPrivacyPolicy) : C11194r.C11195a.f24760a;
            default:
                C13887c cVar = (C13887c) obj;
                C19383o.m32797g(cVar, "configWrap");
                return cVar.f30553a.f18706f;
        }
    }
}
