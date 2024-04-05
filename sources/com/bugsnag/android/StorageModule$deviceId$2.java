package com.bugsnag.android;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class StorageModule$deviceId$2 extends Lambda implements C19846a<String> {
    public final /* synthetic */ StorageModule this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StorageModule$deviceId$2(StorageModule storageModule) {
        super(0);
        this.this$0 = storageModule;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        kotlin.reflect.C19421p.m32917E(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String invoke() {
        /*
            r5 = this;
            com.bugsnag.android.StorageModule r0 = r5.this$0
            kotlin.c r0 = r0.f12130c
            java.lang.Object r0 = r0.getValue()
            com.bugsnag.android.DeviceIdStore r0 = (com.bugsnag.android.DeviceIdStore) r0
            r0.getClass()
            com.bugsnag.android.DeviceIdStore$loadDeviceId$1 r1 = new com.bugsnag.android.DeviceIdStore$loadDeviceId$1
            r1.<init>(r0)
            r2 = 0
            com.bugsnag.android.m0 r3 = r0.mo16436a()     // Catch:{ all -> 0x004b }
            if (r3 == 0) goto L_0x001c
            java.lang.String r4 = r3.f12420b     // Catch:{ all -> 0x004b }
            goto L_0x001d
        L_0x001c:
            r4 = r2
        L_0x001d:
            if (r4 == 0) goto L_0x0022
            java.lang.String r2 = r3.f12420b     // Catch:{ all -> 0x004b }
            goto L_0x0053
        L_0x0022:
            java.io.File r3 = r0.f12111b     // Catch:{ IOException -> 0x0042 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0042 }
            r4.<init>(r3)     // Catch:{ IOException -> 0x0042 }
            java.nio.channels.FileChannel r3 = r4.getChannel()     // Catch:{ IOException -> 0x0042 }
            java.lang.String r4 = "channel"
            kotlin.jvm.internal.C19383o.m32793c(r3, r4)     // Catch:{ all -> 0x003b }
            java.lang.String r1 = r0.mo16437b(r3, r1)     // Catch:{ all -> 0x003b }
            kotlin.reflect.C19421p.m32917E(r3, r2)     // Catch:{ IOException -> 0x0042 }
            r2 = r1
            goto L_0x0053
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r4 = move-exception
            kotlin.reflect.C19421p.m32917E(r3, r1)     // Catch:{ IOException -> 0x0042 }
            throw r4     // Catch:{ IOException -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            com.bugsnag.android.o1 r3 = r0.f12113d     // Catch:{ all -> 0x004b }
            java.lang.String r4 = "Failed to persist device ID"
            r3.mo16602b(r4, r1)     // Catch:{ all -> 0x004b }
            goto L_0x0053
        L_0x004b:
            r1 = move-exception
            com.bugsnag.android.o1 r0 = r0.f12113d
            java.lang.String r3 = "Failed to load device ID"
            r0.mo16602b(r3, r1)
        L_0x0053:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.StorageModule$deviceId$2.invoke():java.lang.String");
    }
}
