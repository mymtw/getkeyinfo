package p425q9;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.compose.animation.C0472h;
import com.etsy.android.BoeUserInfoFetcher;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.currency.C8629a;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.lib.network.Connectivity;
import com.etsy.android.lib.session.C8855a;
import com.etsy.android.lib.session.C8857c;
import com.etsy.android.lib.session.SessionRepository;
import com.etsy.android.lib.user.C8864c;
import com.etsy.android.lib.util.SharedPreferencesUtility;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import p145io.reactivex.internal.operators.observable.C19172m;
import p145io.reactivex.subjects.PublishSubject;
import p346fa.C12703a;
import p379k9.C12988b;
import p418pa.C13198d;
import p456ua.C13461f;
import p463v9.C13537b;
import p628nj.C18263b;
import p740eq.C19011a;

/* renamed from: q9.p */
public final class C13265p implements C13272v {

    /* renamed from: a */
    public C8864c f29135a;

    /* renamed from: b */
    public C8629a f29136b;

    /* renamed from: c */
    public C13252d f29137c;

    /* renamed from: d */
    public Context f29138d;

    /* renamed from: e */
    public C13271u f29139e;

    /* renamed from: f */
    public EtsyId f29140f = new EtsyId();

    /* renamed from: g */
    public C19011a<C13537b> f29141g;

    /* renamed from: h */
    public C13537b f29142h;

    /* renamed from: i */
    public final List<C13266a> f29143i = Collections.synchronizedList(new ArrayList());

    /* renamed from: j */
    public C12988b f29144j;

    /* renamed from: k */
    public C8694h f29145k;

    /* renamed from: l */
    public C12703a f29146l;

    /* renamed from: m */
    public Connectivity f29147m;

    /* renamed from: n */
    public C13461f f29148n;

    /* renamed from: o */
    public PublishSubject f29149o;

    /* renamed from: p */
    public C8857c f29150p;

    /* renamed from: q */
    public PublishSubject f29151q;

    /* renamed from: r */
    public C13198d f29152r;

    /* renamed from: s */
    public C8855a f29153s;

    /* renamed from: t */
    public SessionRepository f29154t;

    /* renamed from: q9.p$a */
    public interface C13266a {
        /* renamed from: a */
        void mo18530a(Context context, boolean z);
    }

    public C13265p(Context context, C13271u uVar, C8864c cVar, C8694h hVar, C12703a aVar, C8629a aVar2, C13252d dVar, Connectivity connectivity, C13461f fVar, C19011a<C13537b> aVar3, C8857c cVar2, C13198d dVar2, C8855a aVar4, SessionRepository sessionRepository) {
        this.f29138d = context;
        this.f29139e = uVar;
        this.f29146l = aVar;
        this.f29145k = hVar;
        this.f29137c = dVar;
        this.f29135a = cVar;
        this.f29136b = aVar2;
        this.f29147m = connectivity;
        this.f29148n = fVar;
        this.f29141g = aVar3;
        this.f29142h = aVar3.get();
        this.f29149o = new PublishSubject();
        this.f29151q = new PublishSubject();
        this.f29150p = cVar2;
        this.f29152r = dVar2;
        this.f29153s = aVar4;
        this.f29154t = sessionRepository;
        C18263b.f40057V = this;
    }

    /* renamed from: a */
    public final void mo45956a() {
        this.f29142h = this.f29141g.get();
        ((NotificationManager) this.f29138d.getSystemService("notification")).cancelAll();
        this.f29138d.getSharedPreferences("convo_prefs", 0).edit().clear().apply();
        SharedPreferences.Editor edit = this.f29138d.getSharedPreferences("EtsyUserPrefs", 0).edit();
        edit.remove("etsyUserAvatar");
        edit.remove("etsyUserId");
        edit.remove("etsyUserIdString");
        edit.remove("etsyShopId");
        edit.remove("etsyShopIdString");
        edit.remove("etsyUserCountryId");
        edit.remove("etsyShopName");
        edit.remove("etsyUserLocation");
        edit.remove("etsyUserName");
        edit.remove("etsyUserLogin");
        edit.remove("etsyUserEmail");
        edit.remove("etsyUserFirstName");
        edit.remove("etsyUserAwaitingFeedback");
        edit.remove("etsyUserHasUsDefaultShipping");
        edit.remove(ResponseConstants.CUSTOM_SHOPS_STATE);
        edit.remove("update_services");
        edit.apply();
        this.f29152r.f29034d.onNext(new LinkedHashMap());
        mo45961f(false);
        C13271u uVar = this.f29139e;
        if (uVar != null) {
            uVar.mo38938c();
        }
        C13271u uVar2 = this.f29139e;
        if (uVar2 != null) {
            uVar2.mo38937b(this.f29138d);
        }
        this.f29140f.setId("");
        this.f29136b.clear();
        this.f29137c.mo45944a();
        List<String> list = C8591a.f18700r;
        C18263b.f40056T.mo21107e(this.f29138d);
        this.f29154t.mo30398a();
    }

    /* renamed from: b */
    public final C19172m mo45957b() {
        PublishSubject publishSubject = this.f29149o;
        return C0472h.m1242c(publishSubject, publishSubject);
    }

    /* renamed from: c */
    public final EtsyId mo45958c() {
        return this.f29140f.hasId() ? this.f29140f : SharedPreferencesUtility.m17314a(this.f29138d);
    }

    /* renamed from: d */
    public final EtsyId mo45959d() {
        if (mo45960e() && !this.f29140f.hasId()) {
            ((BoeUserInfoFetcher) this.f29144j).mo18058a();
            EtsyId a = SharedPreferencesUtility.m17314a(this.f29138d);
            if (a.hasId()) {
                this.f29140f = a;
            }
        } else if (!mo45960e()) {
            this.f29140f.setId("");
        }
        return this.f29140f;
    }

    /* renamed from: e */
    public final boolean mo45960e() {
        return this.f29137c.f29107a != null;
    }

    /* renamed from: f */
    public final void mo45961f(boolean z) {
        for (C13266a a : this.f29143i) {
            a.mo18530a(this.f29138d, z);
        }
        this.f29149o.onNext(Boolean.valueOf(z));
    }
}
