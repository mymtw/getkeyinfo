package com.etsy.android.stylekit.views;

import android.view.View;

/* renamed from: com.etsy.android.stylekit.views.c */
public final /* synthetic */ class C9052c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f19923b;

    /* renamed from: c */
    public final /* synthetic */ Object f19924c;

    public /* synthetic */ C9052c(Object obj, int i) {
        this.f19923b = i;
        this.f19924c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        r4 = (r4 = (r4 = (android.widget.TextView) r4.findViewById(com.etsy.android.R.id.privacy_policy_link)).getUrls())[0];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.f19923b
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x0016;
                case 2: goto L_0x000e;
                case 3: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x005c
        L_0x0006:
            java.lang.Object r0 = r3.f19924c
            com.paypal.android.platform.authsdk.otplogin.ui.phone.OtpPhoneFragment r0 = (com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneFragment) r0
            com.paypal.android.platform.authsdk.otplogin.p533ui.phone.OtpPhoneFragment.m35135onViewCreated$lambda10(r0, r4)
            return
        L_0x000e:
            java.lang.Object r0 = r3.f19924c
            com.etsy.android.ui.user.review.r$g r0 = (com.etsy.android.p327ui.user.review.C11719r.C11726g) r0
            com.etsy.android.p327ui.user.review.CreateReviewActivity.m35083showErrorWithRetry$lambda50$lambda49(r0, r4)
            return
        L_0x0016:
            java.lang.Object r4 = r3.f19924c
            com.etsy.android.ui.favorites.createalist.NameAListPresenter r4 = (com.etsy.android.p327ui.favorites.createalist.NameAListPresenter) r4
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            com.etsy.android.ui.favorites.createalist.NameAListFragment r0 = r4.f21676a
            android.content.Intent r1 = new android.content.Intent
            com.etsy.android.ui.favorites.createalist.NameAListFragment r4 = r4.f21676a
            android.view.View r4 = r4.getView()
            if (r4 == 0) goto L_0x0046
            r2 = 2131429305(0x7f0b07b9, float:1.8480279E38)
            android.view.View r4 = r4.findViewById(r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0046
            android.text.style.URLSpan[] r4 = r4.getUrls()
            if (r4 == 0) goto L_0x0046
            r2 = 0
            r4 = r4[r2]
            if (r4 == 0) goto L_0x0046
            java.lang.String r4 = r4.getURL()
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2, r4)
            r0.startActivity(r1)
            return
        L_0x0054:
            java.lang.Object r0 = r3.f19924c
            com.etsy.android.stylekit.views.CollageCheckbox r0 = (com.etsy.android.stylekit.views.CollageCheckbox) r0
            com.etsy.android.stylekit.views.CollageCheckbox.m34882setOnCheckedListener$lambda1(r0, r4)
            return
        L_0x005c:
            java.lang.Object r0 = r3.f19924c
            com.paypal.platform.authsdk.stepup.ui.StepUpFragment r0 = (com.paypal.platform.authsdk.stepup.p538ui.StepUpFragment) r0
            com.paypal.platform.authsdk.stepup.p538ui.StepUpFragment.m35152onViewCreated$lambda5(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.stylekit.views.C9052c.onClick(android.view.View):void");
    }
}
