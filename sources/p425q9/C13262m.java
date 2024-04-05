package p425q9;

import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.Shop;
import com.etsy.android.lib.network.oauth2.signin.CodeAndState;
import com.etsy.android.lib.session.PrivacySetting;
import com.etsy.android.p327ui.shop.C11311z0;
import com.etsy.android.p327ui.user.addresses.C11463z;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import p145io.reactivex.internal.operators.single.C19210k;
import p248tp.C8071s;
import p287xp.C8339g;
import retrofit2.C20145v;

/* renamed from: q9.m */
public final /* synthetic */ class C13262m implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f29130b;

    public /* synthetic */ C13262m(int i) {
        this.f29130b = i;
    }

    public final Object apply(Object obj) {
        switch (this.f29130b) {
            case 0:
                PrivacySetting privacySetting = (PrivacySetting) ((Map) obj).get("gdpr_tp");
                return privacySetting == null ? C19210k.f42943b : C8071s.m16251e(Boolean.valueOf(privacySetting.f19535c));
            case 1:
                CodeAndState codeAndState = (CodeAndState) obj;
                C19383o.m32797g(codeAndState, "result");
                return codeAndState.f19297a;
            case 2:
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                C19928a0 a0Var = (C19928a0) vVar.f44615b;
                Object createFromByteArray = a0Var != null ? MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), Shop.class) : null;
                C19383o.m32794d(createFromByteArray);
                return new C11311z0.C11313b((Shop) createFromByteArray);
            default:
                List list = (List) obj;
                C19383o.m32797g(list, "it");
                return new C11463z.C11464a(list);
        }
    }
}
