package p314ba;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.CollectionsUpdateResponse;
import com.etsy.android.lib.useraction.UserActionBus;
import com.etsy.android.p327ui.favorites.add.C9758c0;
import com.etsy.android.p327ui.favorites.add.C9760d0;
import com.etsy.android.p327ui.user.profile.C11623a;
import com.etsy.android.p327ui.util.CollectionUtil$ListingCollectionAction;
import java.util.List;
import java.util.Map;
import kotlin.collections.C19294b0;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.observable.C19178p;
import p287xp.C8339g;
import p314ba.C8545d;
import p500ze.C13961b;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: ba.a */
public final /* synthetic */ class C8542a implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f18609b;

    /* renamed from: c */
    public final /* synthetic */ Object f18610c;

    public /* synthetic */ C8542a(Object obj, int i) {
        this.f18609b = i;
        this.f18610c = obj;
    }

    public final Object apply(Object obj) {
        String str = null;
        switch (this.f18609b) {
            case 0:
                C8543b bVar = (C8543b) this.f18610c;
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(bVar, "this$0");
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                return vVar.mo74384a() ? C8545d.C8547b.f18616a : new C8545d.C8546a(C0761x.m1692S0(vVar, bVar.f18612b), vVar.f44614a.f44365f, (Throwable) null);
            case 1:
                return UserActionBus.m17266a((UserActionBus) this.f18610c, (List) obj);
            case 2:
                C9758c0 c0Var = (C9758c0) this.f18610c;
                CollectionsUpdateResponse collectionsUpdateResponse = (CollectionsUpdateResponse) obj;
                C19383o.m32797g(c0Var, "$spec");
                C19383o.m32797g(collectionsUpdateResponse, "result");
                List failedCollectionKeys = collectionsUpdateResponse.getFailedCollectionKeys();
                if (failedCollectionKeys == null) {
                    failedCollectionKeys = EmptyList.INSTANCE;
                }
                Map<String, CollectionUtil$ListingCollectionAction> map = c0Var.f21593c;
                if (map == null) {
                    map = C19294b0.m32559p0();
                }
                if (!(!failedCollectionKeys.isEmpty()) || failedCollectionKeys.size() != map.size()) {
                    return new C19178p(new C9760d0.C9762b(collectionsUpdateResponse));
                }
                C9760d0.C9761a aVar = C9760d0.C9761a.f21596a;
                if (aVar != null) {
                    return new C19178p(aVar);
                }
                throw new NullPointerException("item is null");
            default:
                C13961b bVar2 = (C13961b) this.f18610c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(bVar2, "this$0");
                C19383o.m32797g(th, "throwable");
                HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
                if (httpException != null) {
                    str = C0761x.m1690R0(httpException, bVar2.f30704b);
                }
                return new C11623a.C11624a(str, httpException != null ? httpException.code() : 0, httpException);
        }
    }
}
