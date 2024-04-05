package com.etsy.android.uikit.util;

import android.view.View;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.C8698l;
import com.etsy.android.lib.models.datatypes.EtsyId;

public abstract class TrackingOnClickListener extends C11911m implements View.OnClickListener {
    private boolean clickDebounceEnabled;
    private C11907k debouncer;

    public TrackingOnClickListener() {
        this.debouncer = OnClickDebouncerFactory.f26450f.mo38457a();
        this.clickDebounceEnabled = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r6) {
        /*
            r5 = this;
            boolean r0 = r5.clickDebounceEnabled
            if (r0 == 0) goto L_0x0030
            com.etsy.android.uikit.util.k r0 = r5.debouncer
            if (r0 == 0) goto L_0x0030
            boolean r1 = r0.f26465c
            if (r1 == 0) goto L_0x002c
            com.etsy.android.lib.util.e0 r1 = r0.f26464b
            r1.getClass()
            long r1 = java.lang.System.currentTimeMillis()
            long r3 = r0.f26467e
            long r3 = r1 - r3
            r0.f26467e = r1
            long r1 = r0.f26466d
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L_0x002c
            fa.a r0 = r0.f26463a
            if (r0 == 0) goto L_0x002a
            java.lang.String r1 = "on_click_debouncer.debounce"
            r0.mo45474a(r1)
        L_0x002a:
            r0 = 1
            goto L_0x002d
        L_0x002c:
            r0 = 0
        L_0x002d:
            if (r0 == 0) goto L_0x0030
            return
        L_0x0030:
            com.etsy.android.lib.logger.ViewClickAnalyticsLog$ViewAction r0 = com.etsy.android.lib.logger.ViewClickAnalyticsLog.ViewAction.clicked
            r5.trackAction(r6, r0)
            r5.onViewClick(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.uikit.util.TrackingOnClickListener.onClick(android.view.View):void");
    }

    public abstract void onViewClick(View view);

    public TrackingOnClickListener(AnalyticsProperty analyticsProperty, Object obj) {
        super(analyticsProperty, obj);
        this.debouncer = OnClickDebouncerFactory.f26450f.mo38457a();
        this.clickDebounceEnabled = true;
    }

    public TrackingOnClickListener(AnalyticsProperty analyticsProperty, EtsyId etsyId) {
        super(analyticsProperty, etsyId);
        this.debouncer = OnClickDebouncerFactory.f26450f.mo38457a();
        this.clickDebounceEnabled = true;
    }

    public TrackingOnClickListener(C8698l... lVarArr) {
        super(lVarArr);
        this.debouncer = OnClickDebouncerFactory.f26450f.mo38457a();
        this.clickDebounceEnabled = true;
    }

    public TrackingOnClickListener(boolean z, C8698l... lVarArr) {
        super(lVarArr);
        this.debouncer = OnClickDebouncerFactory.f26450f.mo38457a();
        this.clickDebounceEnabled = z;
    }
}
