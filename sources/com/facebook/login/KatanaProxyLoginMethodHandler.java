package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;

public final class KatanaProxyLoginMethodHandler extends NativeAppLoginMethodHandler {
    public static final Parcelable.Creator<KatanaProxyLoginMethodHandler> CREATOR = new KatanaProxyLoginMethodHandler$Companion$CREATOR$1();
    public static final C12293a Companion = new C12293a();
    private final String nameForLogging = "katana_proxy_auth";

    /* renamed from: com.facebook.login.KatanaProxyLoginMethodHandler$a */
    public static final class C12293a {
    }

    public KatanaProxyLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    public int describeContents() {
        return 0;
    }

    public String getNameForLogging() {
        return this.nameForLogging;
    }

    public boolean shouldKeepTrackOfMultipleIntents() {
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0105  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int tryAuthorize(com.facebook.login.LoginClient.Request r36) {
        /*
            r35 = this;
            r1 = r35
            java.lang.String r0 = "request"
            r2 = r36
            kotlin.jvm.internal.C19383o.m32797g(r2, r0)
            com.facebook.login.LoginBehavior r0 = r36.getLoginBehavior()
            boolean r3 = p453tf.C13418j.f29396p
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = p365hg.C12850e.m20501a()
            if (r3 == 0) goto L_0x001f
            boolean r0 = r0.allowsCustomTabAuth()
            if (r0 == 0) goto L_0x001f
            r0 = 1
            goto L_0x0020
        L_0x001f:
            r0 = 0
        L_0x0020:
            java.lang.String r3 = com.facebook.login.LoginClient.getE2E()
            com.facebook.login.LoginClient r6 = r35.getLoginClient()
            r6.getActivity()
            java.lang.String r15 = r36.getApplicationId()
            java.lang.String r6 = "request.applicationId"
            kotlin.jvm.internal.C19383o.m32796f(r15, r6)
            java.util.Set r14 = r36.getPermissions()
            java.lang.String r6 = "request.permissions"
            kotlin.jvm.internal.C19383o.m32796f(r14, r6)
            java.lang.String r13 = "e2e"
            kotlin.jvm.internal.C19383o.m32796f(r3, r13)
            r36.isRerequest()
            boolean r22 = r36.hasPublishPermission()
            com.facebook.login.DefaultAudience r12 = r36.getDefaultAudience()
            java.lang.String r6 = "request.defaultAudience"
            kotlin.jvm.internal.C19383o.m32796f(r12, r6)
            java.lang.String r6 = r36.getAuthId()
            java.lang.String r7 = "request.authId"
            kotlin.jvm.internal.C19383o.m32796f(r6, r7)
            java.lang.String r11 = r1.getClientState(r6)
            java.lang.String r10 = r36.getAuthType()
            java.lang.String r6 = "request.authType"
            kotlin.jvm.internal.C19383o.m32796f(r10, r6)
            java.lang.String r23 = r36.getMessengerPageId()
            boolean r24 = r36.getResetMessengerState()
            boolean r25 = r36.isFamilyLogin()
            boolean r26 = r36.shouldSkipAccountDeduplication()
            java.lang.String r2 = r36.getNonce()
            java.lang.String r6 = p365hg.C12851e0.f28342a
            java.lang.Class<hg.e0> r9 = p365hg.C12851e0.class
            boolean r6 = p401mg.C13080a.m20762b(r9)
            r27 = 0
            if (r6 == 0) goto L_0x008c
            r32 = r13
            goto L_0x00f5
        L_0x008c:
            java.lang.String r6 = "clientState"
            kotlin.jvm.internal.C19383o.m32797g(r11, r6)     // Catch:{ all -> 0x00ee }
            java.util.ArrayList r6 = p365hg.C12851e0.f28343b     // Catch:{ all -> 0x00ee }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00ee }
            r8.<init>()     // Catch:{ all -> 0x00ee }
            java.util.Iterator r28 = r6.iterator()     // Catch:{ all -> 0x00ee }
        L_0x009c:
            boolean r6 = r28.hasNext()     // Catch:{ all -> 0x00ee }
            if (r6 == 0) goto L_0x00e9
            java.lang.Object r6 = r28.next()     // Catch:{ all -> 0x00ee }
            r7 = r6
            hg.e0$f r7 = (p365hg.C12851e0.C12857f) r7     // Catch:{ all -> 0x00ee }
            hg.e0 r6 = p365hg.C12851e0.f28346e     // Catch:{ all -> 0x00ee }
            com.facebook.login.LoginTargetApp r18 = com.facebook.login.LoginTargetApp.FACEBOOK     // Catch:{ all -> 0x00ee }
            r5 = r8
            r8 = r15
            r4 = r9
            r9 = r14
            r29 = r10
            r10 = r3
            r30 = r11
            r11 = r22
            r31 = r12
            r32 = r13
            r13 = r30
            r33 = r14
            r14 = r29
            r34 = r15
            r15 = r0
            r16 = r23
            r17 = r24
            r19 = r25
            r20 = r26
            r21 = r2
            android.content.Intent r6 = r6.mo45630c(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x00e7 }
            if (r6 == 0) goto L_0x00d8
            r5.add(r6)     // Catch:{ all -> 0x00e7 }
        L_0x00d8:
            r9 = r4
            r8 = r5
            r10 = r29
            r11 = r30
            r12 = r31
            r13 = r32
            r14 = r33
            r15 = r34
            goto L_0x009c
        L_0x00e7:
            r0 = move-exception
            goto L_0x00f2
        L_0x00e9:
            r5 = r8
            r27 = r5
            r2 = r13
            goto L_0x00f7
        L_0x00ee:
            r0 = move-exception
            r4 = r9
            r32 = r13
        L_0x00f2:
            p401mg.C13080a.m20761a(r4, r0)
        L_0x00f5:
            r2 = r32
        L_0x00f7:
            r1.addLoggingExtra(r2, r3)
            java.util.Iterator r0 = r27.iterator()
            r2 = 0
        L_0x00ff:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x011c
            java.lang.Object r3 = r0.next()
            android.content.Intent r3 = (android.content.Intent) r3
            int r4 = com.facebook.login.LoginClient.getLoginRequestCode()
            boolean r3 = r1.tryIntent(r3, r4)
            if (r3 == 0) goto L_0x0118
            r3 = 1
            int r2 = r2 + r3
            return r2
        L_0x0118:
            r3 = 1
            int r2 = r2 + 1
            goto L_0x00ff
        L_0x011c:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.KatanaProxyLoginMethodHandler.tryAuthorize(com.facebook.login.LoginClient$Request):int");
    }

    public KatanaProxyLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
