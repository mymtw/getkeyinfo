package p277w8;

import android.support.p013v4.media.C0072d;
import androidx.work.C3376c;
import androidx.work.C3424m;
import androidx.work.C3437q;
import androidx.work.C3438r;
import androidx.work.ExistingWorkPolicy;
import androidx.work.NetworkType;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.requests.apiv3.GzippedRequestBody;
import com.etsy.android.p072ad.AdImpressionsUploadWorker;
import com.etsy.android.p072ad.impressions.AdImpressionLog;
import com.squareup.moshi.JsonAdapter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import p145io.reactivex.internal.operators.completable.C19089c;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p248tp.C8066r;
import p286x8.C8327a;
import p286x8.C8328b;
import p296y8.C8400a;
import p296y8.C8401b;
import p346fa.C12703a;
import p456ua.C13461f;
import retrofit2.C20145v;

/* renamed from: w8.e */
public final class C8267e {

    /* renamed from: a */
    public final C8694h f18108a;

    /* renamed from: b */
    public final C8401b f18109b;

    /* renamed from: c */
    public final C8328b f18110c;

    /* renamed from: d */
    public final C8273k f18111d;

    /* renamed from: e */
    public final JsonAdapter<AdImpressionLog> f18112e;

    /* renamed from: f */
    public final C13461f f18113f;

    /* renamed from: g */
    public final C3437q f18114g;

    /* renamed from: h */
    public final C8618c f18115h;

    /* renamed from: i */
    public final C12703a f18116i;

    /* renamed from: j */
    public final HashSet<String> f18117j = new HashSet<>();

    public C8267e(C8694h hVar, C8401b bVar, C8328b bVar2, C8273k kVar, JsonAdapter<AdImpressionLog> jsonAdapter, C13461f fVar, C3437q qVar, C8618c cVar, C12703a aVar) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(bVar, "adImpressionDao");
        C19383o.m32797g(bVar2, "adClickDao");
        C19383o.m32797g(kVar, "adImpressionEndpoint");
        C19383o.m32797g(jsonAdapter, "adImpressionLogJsonAdapter");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(qVar, "workManager");
        C19383o.m32797g(cVar, "etsyConfigMap");
        C19383o.m32797g(aVar, "grafana");
        this.f18108a = hVar;
        this.f18109b = bVar;
        this.f18110c = bVar2;
        this.f18111d = kVar;
        this.f18112e = jsonAdapter;
        this.f18113f = fVar;
        this.f18114g = qVar;
        this.f18115h = cVar;
        this.f18116i = aVar;
    }

    /* renamed from: a */
    public final void mo20867a() {
        C3437q qVar = this.f18114g;
        ExistingWorkPolicy existingWorkPolicy = ExistingWorkPolicy.KEEP;
        C3424m.C3425a aVar = new C3424m.C3425a(AdImpressionsUploadWorker.class);
        C3376c.C3377a aVar2 = new C3376c.C3377a();
        aVar2.f7890a = NetworkType.CONNECTED;
        C3438r a = ((C3424m.C3425a) aVar.mo12966e(new C3376c(aVar2))).mo12964a();
        C19383o.m32796f(a, "OneTimeWorkRequestBuilde…d()\n            ).build()");
        qVar.getClass();
        qVar.mo12963d(existingWorkPolicy, Collections.singletonList((C3424m) a));
    }

    /* renamed from: b */
    public final void mo20868b(String str, String str2) {
        C19383o.m32797g(str, "displayLocation");
        C19383o.m32797g(str2, "loggingKey");
        if (this.f18117j.add(str2)) {
            this.f18108a.mo21308c();
            C19089c b = this.f18109b.mo20982b(new C8400a(str, str2));
            this.f18113f.getClass();
            C8066r b2 = C13461f.m21235b();
            b.getClass();
            new CompletableSubscribeOn(b, b2).mo20608c(new C8266d(this, 0), new C8265c(this, 0));
        }
    }

    /* renamed from: c */
    public final void mo20869c() {
        ArrayList<C8327a> c = this.f18110c.mo20915c();
        while (!c.isEmpty()) {
            for (C8327a aVar : c) {
                this.f18111d.mo20873c(aVar.f18283b).mo20656d();
            }
            this.f18110c.mo20913a(c);
            c = this.f18110c.mo20915c();
        }
    }

    /* renamed from: d */
    public final void mo20870d() {
        ArrayList<C8400a> c = this.f18109b.mo20983c();
        while (!c.isEmpty()) {
            if (c.isEmpty()) {
                this.f18108a.mo21308c();
            } else {
                C8694h hVar = this.f18108a;
                c.size();
                hVar.mo21308c();
                C8273k kVar = this.f18111d;
                GzippedRequestBody.Companion companion = GzippedRequestBody.Companion;
                C20002r.f44260f.getClass();
                C20002r b = C20002r.C20003a.m34244b("application/json");
                JsonAdapter<AdImpressionLog> jsonAdapter = this.f18112e;
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(c));
                for (C8400a aVar : c) {
                    arrayList.add(aVar.f18415a);
                }
                ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(c));
                for (C8400a aVar2 : c) {
                    arrayList2.add(aVar2.f18416b);
                }
                String json = jsonAdapter.toJson(new AdImpressionLog(arrayList, arrayList2));
                C19383o.m32796f(json, "adImpressionLogJsonAdapt…      )\n                )");
                C20145v d = kVar.mo20871a(companion.create(b, json), C19294b0.m32561r0(new Pair("Content-Encoding", "gzip"))).mo20656d();
                if (d.mo74384a()) {
                    C8694h hVar2 = this.f18108a;
                    c.size();
                    hVar2.mo21308c();
                } else {
                    C8694h hVar3 = this.f18108a;
                    StringBuilder h = C0072d.m201h("uploadBatch() - Failed to upload ");
                    h.append(c.size());
                    h.append(" ad impressions: ");
                    h.append(d.f44614a.f44365f);
                    h.append(" - ");
                    C19928a0 a0Var = d.f44616c;
                    String str = null;
                    h.append(a0Var != null ? a0Var.mo72844g() : null);
                    hVar3.mo21306a(h.toString());
                    C19928a0 a0Var2 = d.f44616c;
                    if (a0Var2 != null) {
                        str = a0Var2.mo72844g();
                    }
                    throw new IOException(str);
                }
            }
            this.f18109b.mo20981a(c);
            c = this.f18109b.mo20983c();
        }
    }
}
