package p418pa;

import android.support.p013v4.media.C0072d;
import androidx.compose.animation.C0391c;
import androidx.compose.animation.C0472h;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.network.oauth2.C8766p;
import com.etsy.android.lib.session.C8857c;
import com.etsy.android.lib.session.PrivacySetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.subjects.C19254a;
import p456ua.C13461f;

/* renamed from: pa.d */
public final class C13198d {

    /* renamed from: f */
    public static final Map<String, Integer> f29029f = C19294b0.m32562s0(new Pair("findable_by_email", Integer.valueOf(R.string.privacy_findability_email_title)), new Pair("findable_by_facebook", Integer.valueOf(R.string.privacy_findability_facebook_title)), new Pair("gdpr_tp", Integer.valueOf(R.string.privacy_thirdparty_title)), new Pair("gdpr_p", Integer.valueOf(R.string.privacy_personalization_title)));

    /* renamed from: g */
    public static final Map<String, Integer> f29030g = C19294b0.m32562s0(new Pair("findable_by_email", Integer.valueOf(R.string.privacy_findability_email_desc)), new Pair("findable_by_facebook", Integer.valueOf(R.string.privacy_findability_facebook_desc)), new Pair("gdpr_tp", Integer.valueOf(R.string.privacy_thirdparty_desc)), new Pair("gdpr_p", Integer.valueOf(R.string.privacy_personalization_desc)));

    /* renamed from: a */
    public final C13195a f29031a;

    /* renamed from: b */
    public final C8857c f29032b;

    /* renamed from: c */
    public final C13461f f29033c;

    /* renamed from: d */
    public final C19254a<Map<String, PrivacySetting>> f29034d = new C19254a<>();

    /* renamed from: e */
    public final C19254a<C13199a> f29035e = new C19254a<>();

    /* renamed from: pa.d$a */
    public static abstract class C13199a {

        /* renamed from: pa.d$a$a */
        public static final class C13200a extends C13199a {

            /* renamed from: a */
            public static final C13200a f29036a = new C13200a();
        }

        /* renamed from: pa.d$a$b */
        public static final class C13201b extends C13199a {

            /* renamed from: a */
            public static final C13201b f29037a = new C13201b();
        }

        /* renamed from: pa.d$a$c */
        public static final class C13202c extends C13199a {

            /* renamed from: a */
            public static final C13202c f29038a = new C13202c();
        }
    }

    public C13198d(C13195a aVar, C8857c cVar, C13461f fVar) {
        C19383o.m32797g(aVar, "privacyEndpoint");
        C19383o.m32797g(cVar, "sessionEndpoint");
        C19383o.m32797g(fVar, "rxSchedulers");
        this.f29031a = aVar;
        this.f29032b = cVar;
        this.f29033c = fVar;
    }

    /* renamed from: a */
    public final void mo45907a(C7091a aVar) {
        C19383o.m32797g(aVar, "disposable");
        this.f29035e.onNext(C13199a.C13201b.f29037a);
        aVar.mo19403b(C0391c.m1056b(this.f29033c, C0072d.m199f(this.f29033c, this.f29032b.mo30408a())).mo20658g(new C13197c(this, 0), new C8766p(this, 1)));
    }

    /* renamed from: b */
    public final PrivacySetting mo45908b(String str) {
        if (this.f29034d.mo71420m() == null) {
            return null;
        }
        Map<String, PrivacySetting> m = this.f29034d.mo71420m();
        C19383o.m32794d(m);
        return (PrivacySetting) m.get(str);
    }

    /* renamed from: c */
    public final C19172m mo45909c() {
        C19254a<Map<String, PrivacySetting>> aVar = this.f29034d;
        return C0472h.m1241b(aVar, aVar);
    }

    /* renamed from: d */
    public final void mo45910d(List<PrivacySetting> list) {
        C19383o.m32797g(list, ResponseConstants.LIST);
        C19254a<Map<String, PrivacySetting>> aVar = this.f29034d;
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (PrivacySetting privacySetting : list) {
            arrayList.add(new Pair(privacySetting.f19533a, privacySetting));
        }
        aVar.onNext(C19294b0.m32558A0(C19294b0.m32567x0(arrayList)));
    }
}
