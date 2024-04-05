package p040c9;

import com.etsy.android.lib.network.C8731g;
import com.etsy.android.p327ui.search.p330v2.impressions.SearchImpressionsDatabase;
import com.etsy.android.p327ui.search.p330v2.impressions.SearchImpressionsUploadWorker;
import dagger.android.C17550a;
import kotlin.jvm.internal.C19383o;
import kotlin.reflect.C19421p;
import p173m.C7279a;
import p340ea.C12677p;
import p422pe.C13219a;
import p422pe.C13225d;
import p422pe.C13227f;
import p568fn.C17782b;

/* renamed from: c9.ja */
public final class C4588ja implements C17550a {

    /* renamed from: b */
    public final C4579j1 f10360b;

    public C4588ja(C4579j1 j1Var) {
        this.f10360b = j1Var;
    }

    /* renamed from: h */
    public final void mo1133h(Object obj) {
        SearchImpressionsUploadWorker searchImpressionsUploadWorker = (SearchImpressionsUploadWorker) obj;
        searchImpressionsUploadWorker.f24451h = new C12677p(this.f10360b.f10131L0.get());
        C4579j1 j1Var = this.f10360b;
        C7279a aVar = j1Var.f10332x;
        SearchImpressionsDatabase searchImpressionsDatabase = j1Var.f10159Q3.get();
        aVar.getClass();
        C19383o.m32797g(searchImpressionsDatabase, "db");
        C13219a o = searchImpressionsDatabase.mo36600o();
        C17782b.m29841G(o);
        C4579j1 j1Var2 = this.f10360b;
        C19421p pVar = j1Var2.f10337y;
        C8731g gVar = (C8731g) j1Var2.f10091D0.get();
        pVar.getClass();
        C19383o.m32797g(gVar, "configuredRetrofit");
        Object b = gVar.f19177a.mo74387b(C13227f.class);
        C19383o.m32796f(b, "configuredRetrofit.v3mos…ionsEndpoint::class.java)");
        searchImpressionsUploadWorker.f24452i = new C13225d(this.f10360b.f10212b0.get(), o, (C13227f) b, this.f10360b.f10146O0.get(), this.f10360b.mo14404m());
    }
}
