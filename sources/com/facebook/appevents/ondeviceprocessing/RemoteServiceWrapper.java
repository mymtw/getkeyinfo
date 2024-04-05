package com.facebook.appevents.ondeviceprocessing;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C19383o;
import p365hg.C12866h;
import p401mg.C13080a;

public final class RemoteServiceWrapper {

    /* renamed from: a */
    public static final String f27325a = RemoteServiceWrapper.class.getSimpleName();

    /* renamed from: b */
    public static Boolean f27326b;

    /* renamed from: c */
    public static final RemoteServiceWrapper f27327c = new RemoteServiceWrapper();

    public enum EventType {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        
        private final String eventType;

        private EventType(String str) {
            this.eventType = str;
        }

        public String toString() {
            return this.eventType;
        }
    }

    public static final class RemoteServiceConnection implements ServiceConnection {
        private IBinder binder;
        private final CountDownLatch latch = new CountDownLatch(1);

        public final IBinder getBinder() throws InterruptedException {
            this.latch.await(5, TimeUnit.SECONDS);
            return this.binder;
        }

        public void onNullBinding(ComponentName componentName) {
            C19383o.m32797g(componentName, "name");
            this.latch.countDown();
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C19383o.m32797g(componentName, "name");
            C19383o.m32797g(iBinder, "serviceBinder");
            this.binder = iBinder;
            this.latch.countDown();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C19383o.m32797g(componentName, "name");
        }
    }

    public enum ServiceResult {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR
    }

    /* renamed from: a */
    public final Intent mo39356a(Context context) {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C12866h.m20543a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) == null || !C12866h.m20543a(context, "com.facebook.wakizashi")) {
                    return null;
                }
                return intent2;
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:21:0x0062=Splitter:B:21:0x0062, B:15:0x004f=Splitter:B:15:0x004f} */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult mo39357b(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.EventType r8, java.lang.String r9, java.util.List<com.facebook.appevents.AppEvent> r10) {
        /*
            r7 = this;
            java.lang.String r0 = "Unbound from the remote service"
            boolean r1 = p401mg.C13080a.m20762b(r7)
            r2 = 0
            if (r1 == 0) goto L_0x000a
            return r2
        L_0x000a:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r1 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_NOT_AVAILABLE     // Catch:{ all -> 0x0080 }
            int r3 = p312ag.C8527d.f18569a     // Catch:{ all -> 0x0080 }
            android.content.Context r3 = p453tf.C13418j.m21106b()     // Catch:{ all -> 0x0080 }
            android.content.Intent r4 = r7.mo39356a(r3)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x007f
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$RemoteServiceConnection r5 = new com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$RemoteServiceConnection     // Catch:{ all -> 0x0080 }
            r5.<init>()     // Catch:{ all -> 0x0080 }
            r6 = 1
            boolean r4 = r3.bindService(r4, r5, r6)     // Catch:{ all -> 0x0080 }
            if (r4 == 0) goto L_0x007d
            android.os.IBinder r4 = r5.getBinder()     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            if (r4 == 0) goto L_0x004f
            com.facebook.ppml.receiver.IReceiverService r1 = com.facebook.ppml.receiver.IReceiverService.Stub.asInterface(r4)     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            android.os.Bundle r8 = p325cg.C8589d.m16986a(r8, r9, r10)     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            if (r8 == 0) goto L_0x004d
            r1.sendEvents(r8)     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            java.lang.String r9 = f27325a     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            r10.<init>()     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            java.lang.String r1 = "Successfully sent events to the remote service: "
            r10.append(r1)     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            r10.append(r8)     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            java.lang.String r8 = r10.toString()     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
            p365hg.C12869i0.m20551G(r9, r8)     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
        L_0x004d:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r1 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.OPERATION_SUCCESS     // Catch:{ InterruptedException -> 0x0067, RemoteException -> 0x005a }
        L_0x004f:
            r3.unbindService(r5)     // Catch:{ all -> 0x0080 }
            java.lang.String r8 = f27325a     // Catch:{ all -> 0x0080 }
            p365hg.C12869i0.m20551G(r8, r0)     // Catch:{ all -> 0x0080 }
            goto L_0x007f
        L_0x0058:
            r8 = move-exception
            goto L_0x0074
        L_0x005a:
            r8 = move-exception
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r9 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR     // Catch:{ all -> 0x0058 }
            java.lang.String r10 = f27325a     // Catch:{ all -> 0x0058 }
            p365hg.C12869i0.m20550F(r10, r8)     // Catch:{ all -> 0x0058 }
        L_0x0062:
            r3.unbindService(r5)     // Catch:{ all -> 0x0080 }
            r1 = r9
            goto L_0x0070
        L_0x0067:
            r8 = move-exception
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r9 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR     // Catch:{ all -> 0x0058 }
            java.lang.String r10 = f27325a     // Catch:{ all -> 0x0058 }
            p365hg.C12869i0.m20550F(r10, r8)     // Catch:{ all -> 0x0058 }
            goto L_0x0062
        L_0x0070:
            p365hg.C12869i0.m20551G(r10, r0)     // Catch:{ all -> 0x0080 }
            goto L_0x007f
        L_0x0074:
            r3.unbindService(r5)     // Catch:{ all -> 0x0080 }
            java.lang.String r9 = f27325a     // Catch:{ all -> 0x0080 }
            p365hg.C12869i0.m20551G(r9, r0)     // Catch:{ all -> 0x0080 }
            throw r8     // Catch:{ all -> 0x0080 }
        L_0x007d:
            com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult r1 = com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.ServiceResult.SERVICE_ERROR     // Catch:{ all -> 0x0080 }
        L_0x007f:
            return r1
        L_0x0080:
            r8 = move-exception
            p401mg.C13080a.m20761a(r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper.mo39357b(com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$EventType, java.lang.String, java.util.List):com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper$ServiceResult");
    }
}
