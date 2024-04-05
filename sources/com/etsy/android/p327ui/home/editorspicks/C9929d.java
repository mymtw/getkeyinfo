package com.etsy.android.p327ui.home.editorspicks;

import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.util.C8923u;
import com.etsy.android.p327ui.util.C11780h;
import com.etsy.android.uikit.nav.transactions.C11869a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import p277w8.C8267e;
import p350fe.C12724a;
import p350fe.C12741o;
import p357gf.C12796e;
import p415of.C13172b;
import p415of.C13173c;
import p415of.C13179h;
import p415of.C13182k;
import p425q9.C13265p;
import p456ua.C13461f;
import p487ya.C13895a;

/* renamed from: com.etsy.android.ui.home.editorspicks.d */
public final class C9929d extends C13173c {

    /* renamed from: i */
    public final ArrayList f21885i = new ArrayList();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9929d(Fragment fragment, C8703p pVar, C11780h hVar, C13461f fVar, C13265p pVar2, C8267e eVar, C12724a aVar, C12741o oVar, C12796e eVar2) {
        super(fragment, pVar, (C13182k) null, (C13895a) null, (C8923u) null, (C12796e) null);
        Fragment fragment2 = fragment;
        C19383o.m32797g(fragment2, "fragment");
        C19383o.m32797g(hVar, "favoriteRepository");
        C19383o.m32797g(fVar, "rxSchedulers");
        C19383o.m32797g(pVar2, "session");
        C19383o.m32797g(eVar, "adImpressionRepository");
        C19383o.m32797g(aVar, "deepLinkEligibility");
        C19383o.m32797g(oVar, "routeInspector");
        C19383o.m32797g(eVar2, "listingImagesFetcher");
        this.f28991c = new C9939g(new C13179h(fragment2, pVar, this, (C13182k) null), hVar, fVar, pVar2, eVar, eVar2, aVar, oVar);
    }

    /* renamed from: l */
    public final C13172b mo33108l(C13895a aVar, C8923u uVar, Fragment fragment, C12796e eVar) {
        C19383o.m32797g(fragment, "fragment");
        return null;
    }

    /* renamed from: n */
    public final void mo31809n(C11869a aVar) {
        ArrayList arrayList = null;
        if (aVar != null) {
            Object b = aVar.mo38345b("SAVE_SIBLING_COUNTS");
            List list = b instanceof List ? (List) b : null;
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Object next : list) {
                    if (!(next instanceof Integer)) {
                        next = null;
                    }
                    Integer num = (Integer) next;
                    if (num != null) {
                        arrayList2.add(num);
                    }
                }
                if (arrayList2.size() == list.size()) {
                    arrayList = arrayList2;
                }
            }
        }
        if (arrayList != null) {
            this.f21885i.clear();
            this.f21885i.addAll(arrayList);
        }
        super.mo31809n(aVar);
    }

    /* renamed from: o */
    public final void mo31810o(C11869a aVar) {
        super.mo31810o(aVar);
        if (aVar != null) {
            aVar.mo38349f("SAVE_SIBLING_COUNTS", this.f21885i);
        }
    }
}
