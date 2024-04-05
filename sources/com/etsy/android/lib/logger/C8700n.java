package com.etsy.android.lib.logger;

/* renamed from: com.etsy.android.lib.logger.n */
public final class C8700n extends AnalyticsLog {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8700n(com.etsy.android.lib.logger.C8693g r5, boolean r6, boolean r7) {
        /*
            r4 = this;
            com.etsy.android.lib.logger.AnalyticsLog$LogType r0 = com.etsy.android.lib.logger.AnalyticsLog.LogType.VIEW
            com.etsy.android.lib.logger.p r0 = r5.getAnalyticsContext()
            java.lang.String r0 = r0.f19060b
            if (r6 != 0) goto L_0x0012
            if (r7 != 0) goto L_0x0012
            java.lang.String r1 = "_init"
            java.lang.String r0 = androidx.appcompat.widget.C0326j.m864i(r0, r1)
        L_0x0012:
            r5.getAnalyticsContext()
            r1 = 1
            com.etsy.android.lib.logger.p r2 = r5.getAnalyticsContext()
            java.util.HashMap<com.etsy.android.lib.logger.AnalyticsProperty, java.lang.Object> r2 = r2.f19115m
            q9.p r3 = p628nj.C18263b.f40057V
            r4.<init>(r0, r1, r2, r3)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r0 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.IS_SURFACED
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r4.mo21281a(r0, r6)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r6 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.IS_RESUME
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r4.mo21281a(r6, r7)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r6 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.PAGE_GUID
            com.etsy.android.lib.logger.p r7 = r5.getAnalyticsContext()
            java.lang.String r7 = r7.f19059a
            r4.mo21281a(r6, r7)
            r5.getAnalyticsContext()
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.DEVICE_SYSTEM_NAME
            int r7 = android.os.Build.VERSION.SDK_INT
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.mo21281a(r6, r7)
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.DEVICE_SYSTEM_VERSION
            java.lang.String r7 = android.os.Build.VERSION.RELEASE
            r4.mo21281a(r6, r7)
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.HARDWARE_PLATFORM_STRING
            java.lang.String r7 = android.os.Build.MODEL
            r4.mo21281a(r6, r7)
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.HARDWARE_PLATFORM
            java.lang.String r7 = android.os.Build.HARDWARE
            r4.mo21281a(r6, r7)
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.HARDWARE_MANUFACTURER
            java.lang.String r7 = android.os.Build.MANUFACTURER
            r4.mo21281a(r6, r7)
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.HARDWARE_MODEL
            java.lang.String r7 = android.os.Build.ID
            r4.mo21281a(r6, r7)
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.DEVICE_RESOLUTION
            float r7 = com.etsy.android.lib.util.C8914m.f19669c
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r4.mo21281a(r6, r7)
            java.util.Locale r6 = java.util.Locale.getDefault()
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r7 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.ACCEPT_LANGUAGES
            java.lang.String r0 = r6.getLanguage()
            r4.mo21281a(r7, r0)
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r7 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.TIME_ZONE
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()
            java.lang.String r0 = r0.getID()
            r4.mo21281a(r7, r0)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r7 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.REGION
            java.lang.String r6 = r6.getCountry()
            r4.mo21281a(r7, r6)
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r6 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.USER_ID
            q9.p r7 = r4.f19039e
            com.etsy.android.lib.models.datatypes.EtsyId r7 = r7.mo45959d()
            long r0 = r7.getIdAsLong()
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            r4.mo21281a(r6, r7)
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.IS_ADMIN
            java.util.List<java.lang.String> r7 = com.etsy.android.lib.config.C8591a.f18700r
            com.etsy.android.lib.config.a r7 = p628nj.C18263b.f40056T
            com.etsy.android.lib.config.e r7 = r7.f18706f
            boolean r7 = r7.f18942b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.mo21281a(r6, r7)
            q9.p r6 = r4.f19039e
            pa.d r6 = r6.f29152r
            java.lang.String r7 = "gdpr_tp"
            com.etsy.android.lib.session.PrivacySetting r6 = r6.mo45908b(r7)
            q9.p r7 = r4.f19039e
            pa.d r7 = r7.f29152r
            java.lang.String r0 = "gdpr_p"
            com.etsy.android.lib.session.PrivacySetting r7 = r7.mo45908b(r0)
            if (r6 == 0) goto L_0x00e2
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r0 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.GDPR_THIRD_PARTY_CONSENT
            int r6 = r6.f19534b
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r4.mo21281a(r0, r6)
        L_0x00e2:
            if (r7 == 0) goto L_0x00ef
            com.etsy.android.lib.logger.DefaultAnalyticsProperty r6 = com.etsy.android.lib.logger.DefaultAnalyticsProperty.GDPR_PERSONALIZATION_CONSENT
            int r7 = r7.f19534b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r4.mo21281a(r6, r7)
        L_0x00ef:
            android.content.Context r6 = r5.getAndroidContext()
            if (r6 == 0) goto L_0x00fc
            android.content.Context r6 = r5.getAndroidContext()
            r4.mo21282b(r6)
        L_0x00fc:
            com.etsy.android.lib.logger.p r6 = r5.getAnalyticsContext()
            java.lang.String r6 = r6.f19107e
            if (r6 == 0) goto L_0x010f
            com.etsy.android.lib.logger.PlatformAnalyticsProperty r6 = com.etsy.android.lib.logger.PlatformAnalyticsProperty.PARENT_PAGE_GUID
            com.etsy.android.lib.logger.p r5 = r5.getAnalyticsContext()
            java.lang.String r5 = r5.f19107e
            r4.mo21281a(r6, r5)
        L_0x010f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.lib.logger.C8700n.<init>(com.etsy.android.lib.logger.g, boolean, boolean):void");
    }
}
