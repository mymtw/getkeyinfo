package com.etsy.android.p327ui.listing.p329ui.recommendations.handlers;

import com.etsy.android.lib.models.apiv3.sdl.ListSection;
import com.etsy.android.p327ui.listing.p329ui.C10419g;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p459ud.C13473a;
import p459ud.C13481d;
import p466vc.C13597g;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.listing.ui.recommendations.handlers.FetchRecommendationsSuccessHandler$handle$1 */
final class FetchRecommendationsSuccessHandler$handle$1 extends Lambda implements C19857l<C10419g, C19394m> {
    public final /* synthetic */ C13597g.C13739u0 $event;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchRecommendationsSuccessHandler$handle$1(C13597g.C13739u0 u0Var) {
        super(1);
        this.$event = u0Var;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((C10419g) obj);
        return C19394m.f43287a;
    }

    public final void invoke(C10419g gVar) {
        C19383o.m32797g(gVar, "$this$updateAsStateChange");
        List<ListSection> list = this.$event.f30262a.f29518a.getList();
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(list));
        for (ListSection dVar : list) {
            arrayList.add(new C13481d(dVar));
        }
        gVar.f22870k = new C13473a.C13478e(arrayList);
    }
}
