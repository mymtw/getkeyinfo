package p277w8;

import androidx.work.C3437q;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.p072ad.impressions.AdImpressionLog;
import com.squareup.moshi.JsonAdapter;
import dagger.internal.C17553b;
import dagger.internal.C17555d;
import p040c9.C4591k;
import p286x8.C8328b;
import p296y8.C8401b;
import p346fa.C12703a;
import p456ua.C13461f;
import p456ua.C13462g;
import p740eq.C19011a;

/* renamed from: w8.f */
public final class C8268f implements C17555d<C8267e> {

    /* renamed from: a */
    public final C19011a<C8694h> f18118a;

    /* renamed from: b */
    public final C19011a<C8401b> f18119b;

    /* renamed from: c */
    public final C19011a<C8328b> f18120c;

    /* renamed from: d */
    public final C19011a<C8273k> f18121d;

    /* renamed from: e */
    public final C19011a<JsonAdapter<AdImpressionLog>> f18122e;

    /* renamed from: f */
    public final C19011a<C13461f> f18123f;

    /* renamed from: g */
    public final C19011a<C3437q> f18124g;

    /* renamed from: h */
    public final C19011a<C8618c> f18125h;

    /* renamed from: i */
    public final C19011a<C12703a> f18126i;

    public C8268f(C19011a aVar, C19011a aVar2, C19011a aVar3, C19011a aVar4, C19011a aVar5, C19011a aVar6, C4591k kVar, C17553b bVar) {
        C13462g gVar = C13462g.C13463a.f29482a;
        this.f18118a = aVar;
        this.f18119b = aVar2;
        this.f18120c = aVar3;
        this.f18121d = aVar4;
        this.f18122e = aVar5;
        this.f18123f = gVar;
        this.f18124g = aVar6;
        this.f18125h = kVar;
        this.f18126i = bVar;
    }

    public final Object get() {
        return new C8267e(this.f18118a.get(), this.f18119b.get(), this.f18120c.get(), this.f18121d.get(), this.f18122e.get(), this.f18123f.get(), this.f18124g.get(), this.f18125h.get(), this.f18126i.get());
    }
}
