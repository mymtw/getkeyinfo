package p402n9;

import androidx.compose.foundation.layout.C0761x;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.session.PrivacySetting;
import com.etsy.android.p327ui.favorites.C9855j;
import com.etsy.android.p327ui.favorites.C9856k;
import com.etsy.android.search.C8971c;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p030bo.app.C3694g7;
import p145io.reactivex.internal.operators.completable.CompletableCreate;
import p145io.reactivex.internal.operators.observable.C19181r;
import p145io.reactivex.internal.operators.single.SingleDelayWithCompletable;
import p248tp.C8071s;
import p287xp.C8339g;
import p418pa.C13198d;
import retrofit2.HttpException;

/* renamed from: n9.n */
public final /* synthetic */ class C13094n implements C8339g {

    /* renamed from: b */
    public final /* synthetic */ int f28789b;

    /* renamed from: c */
    public final /* synthetic */ Object f28790c;

    public /* synthetic */ C13094n(Object obj, int i) {
        this.f28789b = i;
        this.f28790c = obj;
    }

    public final Object apply(Object obj) {
        switch (this.f28789b) {
            case 0:
                C13097q qVar = (C13097q) this.f28790c;
                Boolean bool = (Boolean) obj;
                C19383o.m32797g(qVar, "this$0");
                C19383o.m32797g(bool, ResponseConstants.ENABLED);
                return bool.booleanValue() ? qVar.f28794a : C19181r.f42862b;
            case 1:
                C13198d dVar = (C13198d) this.f28790c;
                PrivacySetting privacySetting = (PrivacySetting) obj;
                Map<String, Integer> map = C13198d.f29029f;
                C19383o.m32797g(dVar, "this$0");
                C19383o.m32797g(privacySetting, "privacySetting");
                Map m = dVar.f29034d.mo71420m();
                if (m != null) {
                    m.put(privacySetting.f19533a, privacySetting);
                    dVar.f29034d.onNext(m);
                }
                return C19394m.f43287a;
            case 2:
                C8971c cVar = (C8971c) this.f28790c;
                String str = (String) obj;
                C19383o.m32797g(cVar, "this$0");
                C19383o.m32797g(str, "result");
                return new SingleDelayWithCompletable(C8071s.m16251e(str), new CompletableCreate(new C3694g7(cVar, str)));
            default:
                C9855j jVar = (C9855j) this.f28790c;
                Throwable th = (Throwable) obj;
                C19383o.m32797g(jVar, "this$0");
                C19383o.m32797g(th, "it");
                String str2 = null;
                HttpException httpException = th instanceof HttpException ? (HttpException) th : null;
                if (httpException != null) {
                    str2 = C0761x.m1690R0(httpException, jVar.f21758b);
                }
                return new C9856k.C9857a(str2, httpException != null ? httpException.code() : 0, httpException);
        }
    }
}
