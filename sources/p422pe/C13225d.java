package p422pe;

import android.support.p013v4.media.C0072d;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.apiv3.SearchImpressionsLog;
import com.etsy.android.lib.models.apiv3.SearchImpressionsLogJsonAdapter;
import com.etsy.android.lib.requests.apiv3.GzippedRequestBody;
import com.squareup.moshi.C17414y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.collections.C19294b0;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import okhttp3.C19928a0;
import okhttp3.C20002r;
import okhttp3.C20016y;
import retrofit2.C20145v;

/* renamed from: pe.d */
public final class C13225d {

    /* renamed from: a */
    public final C8694h f29071a;

    /* renamed from: b */
    public final C13219a f29072b;

    /* renamed from: c */
    public final C13227f f29073c;

    /* renamed from: d */
    public final C17414y f29074d;

    /* renamed from: e */
    public final C8618c f29075e;

    public C13225d(C8694h hVar, C13219a aVar, C13227f fVar, C17414y yVar, C8618c cVar) {
        C19383o.m32797g(hVar, "logCat");
        C19383o.m32797g(aVar, "searchImpressionDao");
        C19383o.m32797g(fVar, "searchImpressionsEndpoint");
        C19383o.m32797g(yVar, "moshi");
        C19383o.m32797g(cVar, "configMap");
        this.f29071a = hVar;
        this.f29072b = aVar;
        this.f29073c = fVar;
        this.f29074d = yVar;
        this.f29075e = cVar;
    }

    /* renamed from: a */
    public final void mo45932a() {
        this.f29071a.mo21308c();
        int d = this.f29075e.mo21134d(C8592b.f18754Q0);
        ArrayList<C13224c> b = this.f29072b.mo45926b(d);
        while (!b.isEmpty()) {
            if (b.isEmpty()) {
                this.f29071a.mo21308c();
            } else {
                C8694h hVar = this.f29071a;
                b.size();
                hVar.mo21308c();
                ArrayList arrayList = new ArrayList(C19322o.m32624F0(b));
                for (C13224c cVar : b) {
                    arrayList.add(cVar.f29068a);
                }
                ArrayList arrayList2 = new ArrayList(C19322o.m32624F0(arrayList));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add("a.1-" + ((String) it.next()));
                }
                ArrayList arrayList3 = new ArrayList(C19322o.m32624F0(b));
                for (C13224c cVar2 : b) {
                    arrayList3.add(cVar2.f29069b);
                }
                ArrayList arrayList4 = new ArrayList(C19322o.m32624F0(b));
                for (C13224c cVar3 : b) {
                    arrayList4.add(cVar3.f29070c);
                }
                String json = new SearchImpressionsLogJsonAdapter(this.f29074d).toJson(new SearchImpressionsLog(arrayList2, arrayList3, arrayList4));
                C19383o.m32796f(json, "adapter.toJson(body)");
                HashMap r0 = C19294b0.m32561r0(new Pair("Content-Encoding", "gzip"));
                GzippedRequestBody.Companion companion = GzippedRequestBody.Companion;
                C20002r.f44260f.getClass();
                Pair pair = new Pair(companion.create(C20002r.C20003a.m34244b("application/json"), json), r0);
                try {
                    C20145v d2 = this.f29073c.mo45933a((C20016y) pair.getFirst(), (HashMap) pair.getSecond()).mo20656d();
                    if (d2.mo74384a()) {
                        C8694h hVar2 = this.f29071a;
                        b.size();
                        hVar2.mo21308c();
                    } else {
                        C8694h hVar3 = this.f29071a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("uploadBatch() - Failed to upload ");
                        sb.append(b.size());
                        sb.append(" search impressions: ");
                        sb.append(d2.f44614a.f44365f);
                        sb.append(" - ");
                        C19928a0 a0Var = d2.f44616c;
                        sb.append(a0Var != null ? a0Var.toString() : null);
                        hVar3.mo21306a(sb.toString());
                    }
                } catch (Throwable th) {
                    C8694h hVar4 = this.f29071a;
                    StringBuilder h = C0072d.m201h("uploadBatch() - Error uploading ");
                    h.append(b.size());
                    h.append(" search impressions");
                    hVar4.mo21307b(h.toString(), th);
                }
            }
            this.f29072b.mo45925a(b);
            b = this.f29072b.mo45926b(d);
        }
        this.f29071a.mo21308c();
    }
}
