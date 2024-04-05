package p402n9;

import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ShopFollowResponse;
import com.etsy.android.lib.models.apiv3.Alert;
import com.etsy.android.lib.models.apiv3.CountryToRegionMap;
import com.etsy.android.lib.network.oauth2.OAuth2AccessTokenPayload;
import com.etsy.android.lib.session.PrivacySetting;
import com.etsy.android.p327ui.user.addresses.C11463z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19382n;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C19928a0;
import p287xp.C8339g;
import p486y9.C13887c;
import retrofit2.C20145v;

/* renamed from: n9.f */
public final /* synthetic */ class C13086f implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f28770b;

    public /* synthetic */ C13086f(int i) {
        this.f28770b = i;
    }

    public final Object apply(Object obj) {
        Object obj2 = null;
        switch (this.f28770b) {
            case 0:
                Map map = (Map) obj;
                C19383o.m32797g(map, "it");
                PrivacySetting privacySetting = (PrivacySetting) map.get("gdpr_tp");
                return Boolean.valueOf(privacySetting != null ? privacySetting.f19535c : false);
            case 1:
                OAuth2AccessTokenPayload oAuth2AccessTokenPayload = (OAuth2AccessTokenPayload) obj;
                C19383o.m32797g(oAuth2AccessTokenPayload, "it");
                return C19382n.m32708F0(oAuth2AccessTokenPayload);
            case 2:
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(vVar, "it");
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                if (a0Var != null) {
                    obj2 = MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), CountryToRegionMap.class);
                }
                return (CountryToRegionMap) obj2;
            case 3:
                List list = (List) obj;
                C19383o.m32797g(list, "it");
                return new C11463z.C11465b(list);
            case 4:
                C19383o.m32797g((C20145v) obj, "it");
                return new ShopFollowResponse((Boolean) null, (Alert) null, 3, (DefaultConstructorMarker) null);
            default:
                C13887c cVar = (C13887c) obj;
                C19383o.m32797g(cVar, "configWrap");
                return cVar.f30553a.f18706f;
        }
    }
}
