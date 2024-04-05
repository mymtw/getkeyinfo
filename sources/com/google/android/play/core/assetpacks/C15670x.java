package com.google.android.play.core.assetpacks;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.C15032m3;
import com.google.android.play.core.internal.C15710v;
import com.google.android.play.core.internal.zzx;
import com.google.android.play.core.internal.zzz;

/* renamed from: com.google.android.play.core.assetpacks.x */
public final class C15670x extends zzx {

    /* renamed from: a */
    public final C15032m3 f35394a = new C15032m3("AssetPackExtractionService");

    /* renamed from: b */
    public final Context f35395b;

    /* renamed from: c */
    public final C15583b0 f35396c;

    /* renamed from: d */
    public final C15645q2 f35397d;

    /* renamed from: e */
    public final C15655t0 f35398e;

    /* renamed from: f */
    public final NotificationManager f35399f;

    public C15670x(Context context, C15583b0 b0Var, C15645q2 q2Var, C15655t0 t0Var) {
        this.f35395b = context;
        this.f35396c = b0Var;
        this.f35397d = q2Var;
        this.f35398e = t0Var;
        this.f35399f = (NotificationManager) context.getSystemService("notification");
    }

    public final void zzb(Bundle bundle, zzz zzz) throws RemoteException {
        this.f35394a.mo52242b("clearAssetPackStorage AIDL call", new Object[0]);
        if (!C15710v.m25542b(this.f35395b) || !C15710v.m25541a(this.f35395b)) {
            zzz.zzd(new Bundle());
            return;
        }
        C15583b0.m25256g(this.f35396c.mo55378d());
        zzz.zzc(new Bundle());
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void zzc(android.os.Bundle r11, com.google.android.play.core.internal.zzz r12) throws android.os.RemoteException {
        /*
            r10 = this;
            monitor-enter(r10)
            com.google.android.gms.measurement.internal.m3 r0 = r10.f35394a     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = "updateServiceState AIDL call"
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]     // Catch:{ all -> 0x0146 }
            r0.mo52242b(r1, r3)     // Catch:{ all -> 0x0146 }
            android.content.Context r0 = r10.f35395b     // Catch:{ all -> 0x0146 }
            boolean r0 = com.google.android.play.core.internal.C15710v.m25542b(r0)     // Catch:{ all -> 0x0146 }
            if (r0 == 0) goto L_0x013c
            android.content.Context r0 = r10.f35395b     // Catch:{ all -> 0x0146 }
            boolean r0 = com.google.android.play.core.internal.C15710v.m25541a(r0)     // Catch:{ all -> 0x0146 }
            if (r0 != 0) goto L_0x001d
            goto L_0x013c
        L_0x001d:
            java.lang.String r0 = "action_type"
            int r0 = r11.getInt(r0)     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.t0 r1 = r10.f35398e     // Catch:{ all -> 0x0146 }
            java.util.ArrayList r3 = r1.f35334c     // Catch:{ all -> 0x0146 }
            monitor-enter(r3)     // Catch:{ all -> 0x0146 }
            java.util.ArrayList r1 = r1.f35334c     // Catch:{ all -> 0x0139 }
            r1.add(r12)     // Catch:{ all -> 0x0139 }
            monitor-exit(r3)     // Catch:{ all -> 0x0139 }
            r1 = 1
            r3 = 2
            if (r0 != r1) goto L_0x00f0
            java.lang.String r12 = "notification_channel_name"
            java.lang.String r12 = r11.getString(r12)     // Catch:{ all -> 0x0146 }
            monitor-enter(r10)     // Catch:{ all -> 0x0146 }
            if (r12 != 0) goto L_0x003d
            java.lang.String r12 = "File downloads by Play"
        L_0x003d:
            android.app.NotificationChannel r0 = new android.app.NotificationChannel     // Catch:{ all -> 0x00ed }
            java.lang.String r4 = "playcore-assetpacks-service-notification-channel"
            r0.<init>(r4, r12, r3)     // Catch:{ all -> 0x00ed }
            android.app.NotificationManager r12 = r10.f35399f     // Catch:{ all -> 0x00ed }
            r12.createNotificationChannel(r0)     // Catch:{ all -> 0x00ed }
            monitor-exit(r10)     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.q2 r12 = r10.f35397d     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.y r0 = r12.f35297c     // Catch:{ all -> 0x0146 }
            monitor-enter(r0)     // Catch:{ all -> 0x0146 }
            ol.b r4 = r0.f40213e     // Catch:{ all -> 0x00ea }
            if (r4 == 0) goto L_0x0055
            r4 = r1
            goto L_0x0056
        L_0x0055:
            r4 = r2
        L_0x0056:
            monitor-exit(r0)     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.y r0 = r12.f35297c     // Catch:{ all -> 0x0146 }
            monitor-enter(r0)     // Catch:{ all -> 0x0146 }
            r0.f40214f = r1     // Catch:{ all -> 0x00e7 }
            r0.mo69853b()     // Catch:{ all -> 0x00e7 }
            monitor-exit(r0)     // Catch:{ all -> 0x0146 }
            if (r4 != 0) goto L_0x0072
            com.google.android.play.core.internal.z r0 = r12.f35299e     // Catch:{ all -> 0x0146 }
            java.lang.Object r0 = r0.zza()     // Catch:{ all -> 0x0146 }
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0     // Catch:{ all -> 0x0146 }
            kj.h r4 = new kj.h     // Catch:{ all -> 0x0146 }
            r4.<init>(r12, r3)     // Catch:{ all -> 0x0146 }
            r0.execute(r4)     // Catch:{ all -> 0x0146 }
        L_0x0072:
            com.google.android.play.core.assetpacks.t0 r12 = r10.f35398e     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "notification_title"
            java.lang.String r0 = r11.getString(r0)     // Catch:{ all -> 0x0146 }
            java.lang.String r3 = "notification_subtext"
            java.lang.String r3 = r11.getString(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r4 = "notification_timeout"
            r5 = 600000(0x927c0, double:2.964394E-318)
            long r4 = r11.getLong(r4, r5)     // Catch:{ all -> 0x0146 }
            java.lang.String r6 = "notification_on_click_intent"
            android.os.Parcelable r6 = r11.getParcelable(r6)     // Catch:{ all -> 0x0146 }
            android.app.Notification$Builder r7 = new android.app.Notification$Builder     // Catch:{ all -> 0x0146 }
            android.content.Context r8 = r10.f35395b     // Catch:{ all -> 0x0146 }
            java.lang.String r9 = "playcore-assetpacks-service-notification-channel"
            r7.<init>(r8, r9)     // Catch:{ all -> 0x0146 }
            android.app.Notification$Builder r4 = r7.setTimeoutAfter(r4)     // Catch:{ all -> 0x0146 }
            boolean r5 = r6 instanceof android.app.PendingIntent     // Catch:{ all -> 0x0146 }
            if (r5 == 0) goto L_0x00a5
            android.app.PendingIntent r6 = (android.app.PendingIntent) r6     // Catch:{ all -> 0x0146 }
            r4.setContentIntent(r6)     // Catch:{ all -> 0x0146 }
        L_0x00a5:
            r5 = 17301633(0x1080081, float:2.4979616E-38)
            android.app.Notification$Builder r5 = r4.setSmallIcon(r5)     // Catch:{ all -> 0x0146 }
            android.app.Notification$Builder r2 = r5.setOngoing(r2)     // Catch:{ all -> 0x0146 }
            if (r0 != 0) goto L_0x00b4
            java.lang.String r0 = "Downloading additional file"
        L_0x00b4:
            android.app.Notification$Builder r0 = r2.setContentTitle(r0)     // Catch:{ all -> 0x0146 }
            if (r3 != 0) goto L_0x00bc
            java.lang.String r3 = "Transferring"
        L_0x00bc:
            r0.setSubText(r3)     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "notification_color"
            int r11 = r11.getInt(r0)     // Catch:{ all -> 0x0146 }
            if (r11 == 0) goto L_0x00cf
            android.app.Notification$Builder r11 = r4.setColor(r11)     // Catch:{ all -> 0x0146 }
            r0 = -1
            r11.setVisibility(r0)     // Catch:{ all -> 0x0146 }
        L_0x00cf:
            android.app.Notification r11 = r4.build()     // Catch:{ all -> 0x0146 }
            r12.f35337f = r11     // Catch:{ all -> 0x0146 }
            android.content.Intent r11 = new android.content.Intent     // Catch:{ all -> 0x0146 }
            android.content.Context r12 = r10.f35395b     // Catch:{ all -> 0x0146 }
            java.lang.Class<com.google.android.play.core.assetpacks.ExtractionForegroundService> r0 = com.google.android.play.core.assetpacks.ExtractionForegroundService.class
            r11.<init>(r12, r0)     // Catch:{ all -> 0x0146 }
            android.content.Context r12 = r10.f35395b     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.t0 r0 = r10.f35398e     // Catch:{ all -> 0x0146 }
            r12.bindService(r11, r0, r1)     // Catch:{ all -> 0x0146 }
            monitor-exit(r10)
            goto L_0x0145
        L_0x00e7:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0146 }
            throw r11     // Catch:{ all -> 0x0146 }
        L_0x00ea:
            r11 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0146 }
            throw r11     // Catch:{ all -> 0x0146 }
        L_0x00ed:
            r11 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0146 }
            throw r11     // Catch:{ all -> 0x0146 }
        L_0x00f0:
            if (r0 != r3) goto L_0x0120
            com.google.android.play.core.assetpacks.q2 r11 = r10.f35397d     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.y r12 = r11.f35297c     // Catch:{ all -> 0x0146 }
            monitor-enter(r12)     // Catch:{ all -> 0x0146 }
            monitor-exit(r12)     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.y r11 = r11.f35297c     // Catch:{ all -> 0x0146 }
            monitor-enter(r11)     // Catch:{ all -> 0x0146 }
            r11.f40214f = r2     // Catch:{ all -> 0x011d }
            r11.mo69853b()     // Catch:{ all -> 0x011d }
            monitor-exit(r11)     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.t0 r11 = r10.f35398e     // Catch:{ all -> 0x0146 }
            com.google.android.gms.measurement.internal.m3 r12 = r11.f35333b     // Catch:{ all -> 0x0146 }
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch:{ all -> 0x0146 }
            java.lang.String r1 = "Stopping foreground installation service."
            r12.mo52242b(r1, r0)     // Catch:{ all -> 0x0146 }
            android.content.Context r12 = r11.f35335d     // Catch:{ all -> 0x0146 }
            r12.unbindService(r11)     // Catch:{ all -> 0x0146 }
            com.google.android.play.core.assetpacks.ExtractionForegroundService r12 = r11.f35336e     // Catch:{ all -> 0x0146 }
            if (r12 == 0) goto L_0x0118
            r12.zza()     // Catch:{ all -> 0x0146 }
        L_0x0118:
            r11.mo55486a()     // Catch:{ all -> 0x0146 }
            monitor-exit(r10)
            goto L_0x0145
        L_0x011d:
            r12 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0146 }
            throw r12     // Catch:{ all -> 0x0146 }
        L_0x0120:
            com.google.android.gms.measurement.internal.m3 r11 = r10.f35394a     // Catch:{ all -> 0x0146 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0146 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0146 }
            r1[r2] = r0     // Catch:{ all -> 0x0146 }
            java.lang.String r0 = "Unknown action type received: %d"
            r11.mo52243c(r0, r1)     // Catch:{ all -> 0x0146 }
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x0146 }
            r11.<init>()     // Catch:{ all -> 0x0146 }
            r12.zzd(r11)     // Catch:{ all -> 0x0146 }
            monitor-exit(r10)
            goto L_0x0145
        L_0x0139:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0139 }
            throw r11     // Catch:{ all -> 0x0146 }
        L_0x013c:
            android.os.Bundle r11 = new android.os.Bundle     // Catch:{ all -> 0x0146 }
            r11.<init>()     // Catch:{ all -> 0x0146 }
            r12.zzd(r11)     // Catch:{ all -> 0x0146 }
            monitor-exit(r10)
        L_0x0145:
            return
        L_0x0146:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C15670x.zzc(android.os.Bundle, com.google.android.play.core.internal.zzz):void");
    }
}
