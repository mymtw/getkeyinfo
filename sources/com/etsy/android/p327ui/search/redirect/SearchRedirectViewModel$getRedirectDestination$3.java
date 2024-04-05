package com.etsy.android.p327ui.search.redirect;

import com.etsy.android.p327ui.navigation.specs.SearchRedirectSpec;
import com.etsy.android.p327ui.navigation.specs.SearchSpec;
import kotlin.C19394m;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C19525d0;
import p744gq.C19060c;
import p753kq.C19861p;

@C19060c(mo70540c = "com.etsy.android.ui.search.redirect.SearchRedirectViewModel$getRedirectDestination$3", mo70541f = "SearchRedirectViewModel.kt", mo70542l = {90}, mo70543m = "invokeSuspend")
/* renamed from: com.etsy.android.ui.search.redirect.SearchRedirectViewModel$getRedirectDestination$3 */
final class SearchRedirectViewModel$getRedirectDestination$3 extends SuspendLambda implements C19861p<C19525d0, C19340c<? super C19394m>, Object> {
    public final /* synthetic */ SearchRedirectSpec $redirectSpec;
    public final /* synthetic */ String $referrer;
    public final /* synthetic */ SearchSpec $searchSpec;
    public int label;
    public final /* synthetic */ C10933e this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRedirectViewModel$getRedirectDestination$3(SearchRedirectSpec searchRedirectSpec, C10933e eVar, String str, SearchSpec searchSpec, C19340c<? super SearchRedirectViewModel$getRedirectDestination$3> cVar) {
        super(2, cVar);
        this.$redirectSpec = searchRedirectSpec;
        this.this$0 = eVar;
        this.$referrer = str;
        this.$searchSpec = searchSpec;
    }

    public final C19340c<C19394m> create(Object obj, C19340c<?> cVar) {
        return new SearchRedirectViewModel$getRedirectDestination$3(this.$redirectSpec, this.this$0, this.$referrer, this.$searchSpec, cVar);
    }

    public final Object invoke(C19525d0 d0Var, C19340c<? super C19394m> cVar) {
        return ((SearchRedirectViewModel$getRedirectDestination$3) create(d0Var, cVar)).invokeSuspend(C19394m.f43287a);
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.SearchContainerDestinationKey] */
    /* JADX WARNING: type inference failed for: r3v6, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.SearchResultsListingsKey] */
    /* JADX WARNING: type inference failed for: r8v2, types: [com.etsy.android.ui.navigation.keys.fragmentkeys.SearchTaxonomyCategoryKey] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x0019
            if (r2 != r3) goto L_0x0011
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            r2 = r18
            goto L_0x0047
        L_0x0011:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0019:
            androidx.compose.foundation.layout.C0761x.m1684O0(r18)
            java.lang.Object[] r2 = new java.lang.Object[r3]
            r4 = 0
            com.etsy.android.ui.navigation.specs.SearchRedirectSpec r5 = r0.$redirectSpec
            java.lang.String r5 = r5.getCategoryTaxonomyPath()
            r2[r4] = r5
            java.lang.String r4 = "/etsyapps/v3/bespoke/member/category-landing-redirect/%s"
            java.lang.String r5 = "format(format, *args)"
            java.lang.String r2 = androidx.compose.animation.C0388a.m1049e(r2, r3, r4, r5)
            com.etsy.android.ui.search.redirect.e r4 = r0.this$0
            com.etsy.android.ui.search.redirect.SearchRedirectRepository r4 = r4.f24265b
            com.etsy.android.ui.search.redirect.a r5 = new com.etsy.android.ui.search.redirect.a
            com.etsy.android.ui.navigation.specs.SearchRedirectSpec r6 = r0.$redirectSpec
            java.util.HashMap r6 = r6.getCategoryRedirectQueryParams()
            r5.<init>(r2, r6)
            r0.label = r3
            java.lang.Object r2 = r4.mo36246b(r5, r0)
            if (r2 != r1) goto L_0x0047
            return r1
        L_0x0047:
            com.etsy.android.ui.search.redirect.c r2 = (com.etsy.android.p327ui.search.redirect.C10927c) r2
            boolean r1 = r2 instanceof com.etsy.android.p327ui.search.redirect.C10927c.C10929b
            if (r1 == 0) goto L_0x0096
            com.etsy.android.ui.search.redirect.c$b r2 = (com.etsy.android.p327ui.search.redirect.C10927c.C10929b) r2
            com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPage r1 = r2.f24261a
            java.lang.String r7 = r2.f24262b
            com.etsy.android.ui.search.redirect.e r2 = r0.this$0
            java.lang.String r9 = r0.$referrer
            com.etsy.android.ui.navigation.specs.SearchSpec r5 = r0.$searchSpec
            r2.getClass()
            com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelable r14 = com.etsy.android.lib.models.apiv3.SearchCategoryRedirectPageParcelableKt.toSearchCategoryRedirectPageParcelable(r1)
            boolean r1 = r1.isCategoryLandingPage()
            if (r1 == 0) goto L_0x0078
            com.etsy.android.ui.navigation.keys.fragmentkeys.SearchTaxonomyCategoryKey r1 = new com.etsy.android.ui.navigation.keys.fragmentkeys.SearchTaxonomyCategoryKey
            java.lang.String r10 = r5.getAnchorListingId()
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 28
            r16 = 0
            r8 = r1
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0085
        L_0x0078:
            com.etsy.android.ui.navigation.keys.fragmentkeys.SearchResultsListingsKey r1 = new com.etsy.android.ui.navigation.keys.fragmentkeys.SearchResultsListingsKey
            r8 = 0
            r2 = 16
            r10 = 0
            r3 = r1
            r4 = r9
            r6 = r14
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
        L_0x0085:
            com.etsy.android.ui.search.redirect.e r2 = r0.this$0
            com.etsy.android.ui.search.container.SearchNavigationViewModel r2 = r2.f24266c
            if (r2 == 0) goto L_0x00ad
            io.reactivex.subjects.PublishSubject<qe.b> r2 = r2.f23672b
            qe.b$h r3 = new qe.b$h
            r3.<init>(r1)
            r2.onNext(r3)
            goto L_0x00ad
        L_0x0096:
            boolean r1 = r2 instanceof com.etsy.android.p327ui.search.redirect.C10927c.C10928a
            if (r1 == 0) goto L_0x00ad
            com.etsy.android.ui.search.redirect.e r1 = r0.this$0
            kotlinx.coroutines.flow.StateFlowImpl r1 = r1.f24267d
        L_0x009e:
            java.lang.Object r2 = r1.getValue()
            r3 = r2
            com.etsy.android.ui.search.redirect.d r3 = (com.etsy.android.p327ui.search.redirect.C10930d) r3
            com.etsy.android.ui.search.redirect.d$a r3 = com.etsy.android.p327ui.search.redirect.C10930d.C10931a.f24263a
            boolean r2 = r1.mo72337i(r2, r3)
            if (r2 == 0) goto L_0x009e
        L_0x00ad:
            kotlin.m r1 = kotlin.C19394m.f43287a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.search.redirect.SearchRedirectViewModel$getRedirectDestination$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
