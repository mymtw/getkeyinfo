package p402n9;

import androidx.compose.foundation.layout.C0761x;
import androidx.fragment.app.C2783s;
import com.etsy.android.lib.config.C8620d;
import com.etsy.android.lib.config.GetConfigException;
import com.etsy.android.lib.models.JsonNodeResult;
import com.etsy.android.lib.models.MoshiModelFactory;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.ShopCard;
import com.etsy.android.lib.util.C8912k;
import com.etsy.android.lib.util.CrashUtil;
import com.etsy.android.p327ui.home.landingpage.C10021c;
import com.etsy.android.p327ui.home.landingpage.C10023e;
import com.etsy.android.p327ui.user.C11766y;
import com.etsy.android.p327ui.user.C11769z;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.android.play.core.assetpacks.C15588c1;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C19928a0;
import p001a0.C0005b;
import p030bo.app.C3673f7;
import p145io.reactivex.internal.operators.completable.CompletableCreate;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19210k;
import p145io.reactivex.internal.operators.single.SingleCreate;
import p145io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import p287xp.C8339g;
import p409o9.C13128h;
import p425q9.C13264o;
import p425q9.C13265p;
import p456ua.C13461f;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: n9.g */
public final /* synthetic */ class C13087g implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f28771b;

    /* renamed from: c */
    public final /* synthetic */ Object f28772c;

    public /* synthetic */ C13087g(Object obj, int i) {
        this.f28771b = i;
        this.f28772c = obj;
    }

    public final Object apply(Object obj) {
        List<ShopCard> list;
        int i = 0;
        String str = null;
        switch (this.f28771b) {
            case 0:
                C13092l lVar = (C13092l) this.f28772c;
                Boolean bool = (Boolean) obj;
                C19383o.m32797g(lVar, "this$0");
                C19383o.m32797g(bool, ResponseConstants.ENABLED);
                if (bool.booleanValue()) {
                    SingleCreate singleCreate = new SingleCreate(new C3673f7(lVar, 2));
                    lVar.f28785f.getClass();
                    return singleCreate.mo20660i(C13461f.m21234a());
                }
                CompletableCreate completableCreate = new CompletableCreate(new C2783s(lVar, 1));
                lVar.f28785f.getClass();
                CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(completableCreate, C13461f.m21234a());
                C19210k kVar = C19210k.f42943b;
                if (kVar != null) {
                    return new SingleDelayWithCompletable(kVar, completableSubscribeOn);
                }
                throw new NullPointerException("next is null");
            case 1:
                C13128h hVar = (C13128h) this.f28772c;
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(hVar, "this$0");
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                String str2 = "An unknown error occurred while fetching Config";
                if (vVar.mo74384a()) {
                    C19928a0 a0Var = (C19928a0) vVar.f44615b;
                    JsonNodeResult jsonNodeResult = (JsonNodeResult) (a0Var != null ? MoshiModelFactory.createFromByteArray(a0Var.mo72841a(), JsonNodeResult.class) : null);
                    JsonNode data = jsonNodeResult != null ? jsonNodeResult.getData() : null;
                    return data != null ? new C8620d.C8622b(data) : new C8620d.C8621a(new GetConfigException(str2, (Throwable) null, 2, (DefaultConstructorMarker) null));
                }
                String T0 = C0761x.m1694T0(vVar, hVar.f28861b);
                if (T0 != null) {
                    str2 = T0;
                }
                GetConfigException getConfigException = new GetConfigException(str2, (Throwable) null, 2, (DefaultConstructorMarker) null);
                CrashUtil a = CrashUtil.m17307a();
                a.getClass();
                C15588c1.m25313X(new C8912k(0, a, getConfigException), 1);
                return new C8620d.C8621a(getConfigException);
            case 2:
                C13265p pVar = (C13265p) this.f28772c;
                pVar.getClass();
                SingleCreate singleCreate2 = new SingleCreate(new C13264o(pVar, (Boolean) obj));
                pVar.f29148n.getClass();
                return singleCreate2.mo20660i(C13461f.m21235b());
            case 3:
                C10021c cVar = (C10021c) this.f28772c;
                C20145v vVar2 = (C20145v) obj;
                C19383o.m32797g(cVar, "this$0");
                C19383o.m32797g(vVar2, ResponseConstants.RESPONSE);
                if (vVar2.mo74384a()) {
                    C19928a0 a0Var2 = (C19928a0) vVar2.f44615b;
                    if (a0Var2 == null || (list = MoshiModelFactory.createListFromByteArray(a0Var2.mo72841a(), ShopCard.class)) == null) {
                        list = EmptyList.INSTANCE;
                    }
                    if (!(!list.isEmpty())) {
                        return C10023e.C10024a.f22071a;
                    }
                    return new C10023e.C10026c(C0005b.m48l0(vVar2), list, C0005b.m46k0(vVar2));
                }
                return new C10023e.C10025b(C0761x.m1692S0(vVar2, cVar.f22070b), vVar2.f44614a.f44365f, (Throwable) null);
            default:
                C11769z zVar = (C11769z) this.f28772c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(zVar, "this$0");
                C19383o.m32797g(th, "error");
                HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
                if (httpException != null) {
                    str = C0761x.m1690R0(httpException, zVar.f26216c);
                }
                if (httpException != null) {
                    i = httpException.code();
                }
                return new C11766y.C11767a(str, i, httpException);
        }
    }
}
