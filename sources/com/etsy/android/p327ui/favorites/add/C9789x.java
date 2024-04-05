package com.etsy.android.p327ui.favorites.add;

import android.view.View;

/* renamed from: com.etsy.android.ui.favorites.add.x */
public final /* synthetic */ class C9789x implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ int f21643b;

    /* renamed from: c */
    public final /* synthetic */ Object f21644c;

    public /* synthetic */ C9789x(Object obj, int i) {
        this.f21643b = i;
        this.f21644c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        r4 = (r4 = (r4 = (android.widget.TextView) r4.findViewById(com.etsy.android.R.id.privacy_policy_link)).getUrls())[0];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r4) {
        /*
            r3 = this;
            int r0 = r3.f21643b
            switch(r0) {
                case 0: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0044
        L_0x0006:
            java.lang.Object r4 = r3.f21644c
            com.etsy.android.ui.favorites.add.NameAListPresenter r4 = (com.etsy.android.p327ui.favorites.add.NameAListPresenter) r4
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r4, r0)
            com.etsy.android.ui.favorites.add.NameAListFragment r0 = r4.f21568a
            android.content.Intent r1 = new android.content.Intent
            com.etsy.android.ui.favorites.add.NameAListFragment r4 = r4.f21568a
            android.view.View r4 = r4.getView()
            if (r4 == 0) goto L_0x0036
            r2 = 2131429305(0x7f0b07b9, float:1.8480279E38)
            android.view.View r4 = r4.findViewById(r2)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0036
            android.text.style.URLSpan[] r4 = r4.getUrls()
            if (r4 == 0) goto L_0x0036
            r2 = 0
            r4 = r4[r2]
            if (r4 == 0) goto L_0x0036
            java.lang.String r4 = r4.getURL()
            goto L_0x0037
        L_0x0036:
            r4 = 0
        L_0x0037:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r2 = "android.intent.action.VIEW"
            r1.<init>(r2, r4)
            r0.startActivity(r1)
            return
        L_0x0044:
            java.lang.Object r0 = r3.f21644c
            kq.l r0 = (p753kq.C19857l) r0
            r0.invoke(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.favorites.add.C9789x.onClick(android.view.View):void");
    }
}
