package p409o9;

import p145io.reactivex.functions.Consumer;

/* renamed from: o9.j */
public final /* synthetic */ class C13130j implements Consumer {

    /* renamed from: b */
    public final /* synthetic */ int f28865b;

    /* renamed from: c */
    public final /* synthetic */ Object f28866c;

    /* renamed from: d */
    public final /* synthetic */ Object f28867d;

    public /* synthetic */ C13130j(int i, Object obj, Object obj2) {
        this.f28865b = i;
        this.f28866c = obj;
        this.f28867d = obj2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:8|9|10|11|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void accept(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.f28865b
            switch(r0) {
                case 0: goto L_0x0013;
                case 1: goto L_0x0007;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x00d0
        L_0x0007:
            java.lang.Object r0 = r9.f28866c
            com.etsy.android.lib.util.e r0 = (com.etsy.android.lib.util.C8886e) r0
            java.lang.Object r1 = r9.f28867d
            com.etsy.android.lib.util.e$c r10 = (com.etsy.android.lib.util.C8886e.C8889c) r10
            r0.mo30482i(r1, r10)
            return
        L_0x0013:
            java.lang.Object r0 = r9.f28866c
            com.etsy.android.lib.config.a r0 = (com.etsy.android.lib.config.C8591a) r0
            java.lang.Object r1 = r9.f28867d
            android.content.Context r1 = (android.content.Context) r1
            com.etsy.android.lib.config.d r10 = (com.etsy.android.lib.config.C8620d) r10
            r0.getClass()
            android.content.Context r1 = r1.getApplicationContext()
            boolean r2 = r10 instanceof com.etsy.android.lib.config.C8620d.C8622b
            if (r2 == 0) goto L_0x00c4
            com.etsy.android.lib.config.d$b r10 = (com.etsy.android.lib.config.C8620d.C8622b) r10
            com.fasterxml.jackson.databind.JsonNode r10 = r10.f18950a
            java.lang.String r2 = r0.f18701a
            monitor-enter(r0)
            java.lang.String r2 = r0.mo21108f(r2)     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = "configs"
            r4 = 0
            java.io.File r3 = r1.getDir(r3, r4)     // Catch:{ all -> 0x00c1 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00c1 }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x00c1 }
            q9.i r2 = p425q9.C13258i.f29122d     // Catch:{ IOException -> 0x0047 }
            com.fasterxml.jackson.databind.ObjectMapper r2 = r2.f29123a     // Catch:{ IOException -> 0x0047 }
            r2.writeValue((java.io.File) r4, (java.lang.Object) r10)     // Catch:{ IOException -> 0x0047 }
            goto L_0x004e
        L_0x0047:
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.C8694h.f19097a     // Catch:{ all -> 0x00c1 }
            java.lang.String r3 = "Error writing config to file"
            r2.mo21306a(r3)     // Catch:{ all -> 0x00c1 }
        L_0x004e:
            monitor-exit(r0)
            com.etsy.android.lib.logger.h r2 = com.etsy.android.lib.logger.C8694h.f19097a
            java.util.Objects.toString(r10)
            r2.mo21308c()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            com.etsy.android.lib.util.CrashUtil r4 = com.etsy.android.lib.util.CrashUtil.m17307a()
            com.etsy.android.lib.util.j$d r5 = new com.etsy.android.lib.util.j$d
            r5.<init>(r3)
            r4.mo30460e(r5)
            r0.mo21105b(r1)
            r0.mo21106d(r1, r10)
            long r3 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r10 = r0.f18708h
            android.content.SharedPreferences$Editor r10 = r10.edit()
            java.lang.String r5 = r0.f18709i
            android.content.SharedPreferences$Editor r10 = r10.putLong(r5, r3)
            r10.apply()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r5 = "saveConfigFetchedTime "
            r10.append(r5)
            r10.append(r3)
            java.lang.String r10 = r10.toString()
            r2.mo21310e(r10)
            boolean r10 = r0.f18707g
            r2 = 1
            r10 = r10 ^ r2
            r0.f18707g = r2
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "com.etsy.etsyconfig.updated"
            r2.<init>(r3)
            java.lang.String r3 = "is_first_config_update"
            r2.putExtra(r3, r10)
            u1.a r1 = p251u1.C8115a.m16322a(r1)
            r1.mo20709c(r2)
            com.etsy.android.lib.core.EtsyApplication r1 = com.etsy.android.lib.core.EtsyApplication.get()
            y9.b r1 = r1.getConfigUpdateStream()
            y9.c r2 = new y9.c
            r2.<init>(r0, r10)
            com.jakewharton.rxrelay2.b<y9.c> r10 = r1.f30552a
            r10.accept(r2)
            goto L_0x00cf
        L_0x00c1:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        L_0x00c4:
            boolean r0 = r10 instanceof com.etsy.android.lib.config.C8620d.C8621a
            if (r0 == 0) goto L_0x00cf
            com.etsy.android.lib.config.d$a r10 = (com.etsy.android.lib.config.C8620d.C8621a) r10
            java.lang.Throwable r10 = r10.f18949a
            com.etsy.android.lib.config.C8591a.m16994g(r10)
        L_0x00cf:
            return
        L_0x00d0:
            java.lang.Object r0 = r9.f28866c
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r1 = r9.f28867d
            com.etsy.android.ui.conversation.details.ccm.o r1 = (com.etsy.android.p327ui.conversation.details.ccm.C9510o) r1
            com.etsy.android.ui.conversation.details.models.Message r10 = (com.etsy.android.p327ui.conversation.details.models.Message) r10
            java.lang.String r2 = "$images"
            kotlin.jvm.internal.C19383o.m32797g(r0, r2)
            java.lang.String r2 = "this$0"
            kotlin.jvm.internal.C19383o.m32797g(r1, r2)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0102
            com.etsy.android.ui.conversation.details.c r2 = r1.f21087b
            java.lang.String r0 = "it"
            kotlin.jvm.internal.C19383o.m32796f(r10, r0)
            fc.b r3 = p354gc.C12764c.m20412c(r10)
            long r4 = r10.f21194a
            java.lang.String r6 = r10.f21198e
            long r0 = r10.f21196c
            r10 = 1000(0x3e8, float:1.401E-42)
            long r7 = (long) r10
            long r7 = r7 * r0
            r2.mo31974f(r3, r4, r6, r7)
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p409o9.C13130j.accept(java.lang.Object):void");
    }
}
