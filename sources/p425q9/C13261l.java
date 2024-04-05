package p425q9;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.session.SessionSettings;
import com.etsy.android.p327ui.conversation.details.C9531k;
import com.etsy.android.p327ui.conversation.list.legacy.C9593a;
import com.etsy.android.p327ui.favorites.FavoritesTabFragment;
import com.etsy.android.p327ui.navigation.bottom.BottomNavStateRepo;
import com.etsy.android.p327ui.navigation.bottom.C10680b;
import com.etsy.android.push.C8938a;
import com.etsy.android.shophome.C9005m;
import com.etsy.android.shophome.C9006n;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.internal.operators.observable.C19181r;
import p248tp.C8061n;
import p287xp.C8339g;
import p314ba.C8543b;
import p314ba.C8545d;
import p456ua.C13461f;
import retrofit2.C20145v;
import retrofit2.HttpException;

/* renamed from: q9.l */
public final /* synthetic */ class C13261l implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f29128b;

    /* renamed from: c */
    public final /* synthetic */ Object f29129c;

    public /* synthetic */ C13261l(Object obj, int i) {
        this.f29128b = i;
        this.f29129c = obj;
    }

    public final Object apply(Object obj) {
        String str = null;
        int i = 0;
        switch (this.f29128b) {
            case 0:
                C13265p pVar = (C13265p) this.f29129c;
                pVar.getClass();
                if (!((Boolean) obj).booleanValue()) {
                    return C19181r.f42862b;
                }
                C8061n<SessionSettings> k = pVar.f29150p.mo30408a().mo20661k();
                pVar.f29148n.getClass();
                return k.mo20639i(C13461f.m21235b());
            case 1:
                C8543b bVar = (C8543b) this.f29129c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(bVar, "this$0");
                C19383o.m32797g(th, "it");
                HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
                if (httpException != null) {
                    str = C0761x.m1690R0(httpException, bVar.f18612b);
                }
                if (httpException != null) {
                    i = httpException.code();
                }
                return new C8545d.C8546a(str, i, httpException);
            case 2:
                C8938a aVar = (C8938a) this.f29129c;
                C19383o.m32797g(aVar, "this$0");
                C19383o.m32797g((C9531k) obj, "it");
                return aVar.f19718e.mo32230a(new C9593a(0, 20)).mo20661k();
            case 3:
                C9005m mVar = (C9005m) this.f29129c;
                C20145v vVar = (C20145v) obj;
                C19383o.m32797g(mVar, "this$0");
                C19383o.m32797g(vVar, ResponseConstants.RESPONSE);
                return vVar.mo74384a() ? C9006n.C9008b.f19878a : new C9006n.C9007a(C0761x.m1692S0(vVar, mVar.f19874b), vVar.f44614a.f44365f, (Throwable) null);
            case 4:
                return FavoritesTabFragment.m34972mapResultWithSearch$lambda4((FavoritesTabFragment) this.f29129c, (List) obj);
            default:
                Integer num = (Integer) obj;
                C19383o.m32797g((BottomNavStateRepo) this.f29129c, "this$0");
                C19383o.m32797g(num, "it");
                return new C10680b(R.id.menu_bottom_nav_updates, BottomNavStateRepo.m18605b(0, num.intValue()), "menu_bottom_nav_updates");
        }
    }
}
