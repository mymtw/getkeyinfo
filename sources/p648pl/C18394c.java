package p648pl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import com.google.android.gms.measurement.internal.C15032m3;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: pl.c */
public final class C18394c {

    /* renamed from: e */
    public static final C15032m3 f40454e = new C15032m3("MissingSplitsManagerImpl");

    /* renamed from: a */
    public final Context f40455a;

    /* renamed from: b */
    public final Runtime f40456b;

    /* renamed from: c */
    public final C18393b f40457c;

    /* renamed from: d */
    public final AtomicReference f40458d;

    public C18394c(Context context, Runtime runtime, C18393b bVar, AtomicReference atomicReference) {
        this.f40455a = context;
        this.f40456b = runtime;
        this.f40457c = bVar;
        this.f40458d = atomicReference;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:19|20) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        f40454e.mo52246f("App '%s' is not found in PackageManager", r9.f40455a.getPackageName());
        r5 = java.util.Collections.emptySet();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0056 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo69931a() {
        /*
            r9 = this;
            java.util.concurrent.atomic.AtomicReference r0 = r9.f40458d
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicReference r1 = r9.f40458d     // Catch:{ all -> 0x0208 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0208 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0208 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x009a
            java.util.concurrent.atomic.AtomicReference r1 = r9.f40458d     // Catch:{ all -> 0x0208 }
            android.content.Context r4 = r9.f40455a     // Catch:{ all -> 0x0208 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ all -> 0x0208 }
            android.content.Context r5 = r9.f40455a     // Catch:{ NameNotFoundException -> 0x0081 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0081 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r5, r6)     // Catch:{ NameNotFoundException -> 0x0081 }
            if (r4 == 0) goto L_0x0092
            android.os.Bundle r4 = r4.metaData     // Catch:{ NameNotFoundException -> 0x0081 }
            if (r4 == 0) goto L_0x0092
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ NameNotFoundException -> 0x0081 }
            java.lang.String r6 = "com.android.vending.splits.required"
            java.lang.Object r4 = r4.get(r6)     // Catch:{ NameNotFoundException -> 0x0081 }
            boolean r4 = r5.equals(r4)     // Catch:{ NameNotFoundException -> 0x0081 }
            if (r4 == 0) goto L_0x0092
            android.content.Context r4 = r9.f40455a     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.Context r5 = r9.f40455a     // Catch:{ NameNotFoundException -> 0x0056 }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ NameNotFoundException -> 0x0056 }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r3)     // Catch:{ NameNotFoundException -> 0x0056 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ NameNotFoundException -> 0x0056 }
            r5.<init>()     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.lang.String[] r4 = r4.splitNames     // Catch:{ NameNotFoundException -> 0x0056 }
            if (r4 == 0) goto L_0x006b
            java.util.Collections.addAll(r5, r4)     // Catch:{ NameNotFoundException -> 0x0056 }
            goto L_0x006b
        L_0x0056:
            com.google.android.gms.measurement.internal.m3 r4 = f40454e     // Catch:{ all -> 0x0208 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0208 }
            android.content.Context r6 = r9.f40455a     // Catch:{ all -> 0x0208 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0208 }
            r5[r3] = r6     // Catch:{ all -> 0x0208 }
            java.lang.String r6 = "App '%s' is not found in PackageManager"
            r4.mo52246f(r6, r5)     // Catch:{ all -> 0x0208 }
            java.util.Set r5 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0208 }
        L_0x006b:
            boolean r4 = r5.isEmpty()     // Catch:{ all -> 0x0208 }
            if (r4 != 0) goto L_0x007f
            int r4 = r5.size()     // Catch:{ all -> 0x0208 }
            if (r4 != r2) goto L_0x0092
            java.lang.String r4 = ""
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x0208 }
            if (r4 == 0) goto L_0x0092
        L_0x007f:
            r4 = r2
            goto L_0x0093
        L_0x0081:
            com.google.android.gms.measurement.internal.m3 r4 = f40454e     // Catch:{ all -> 0x0208 }
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0208 }
            android.content.Context r6 = r9.f40455a     // Catch:{ all -> 0x0208 }
            java.lang.String r6 = r6.getPackageName()     // Catch:{ all -> 0x0208 }
            r5[r3] = r6     // Catch:{ all -> 0x0208 }
            java.lang.String r6 = "App '%s' is not found in the PackageManager"
            r4.mo52246f(r6, r5)     // Catch:{ all -> 0x0208 }
        L_0x0092:
            r4 = r3
        L_0x0093:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0208 }
            r1.set(r4)     // Catch:{ all -> 0x0208 }
        L_0x009a:
            java.util.concurrent.atomic.AtomicReference r1 = r9.f40458d     // Catch:{ all -> 0x0208 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x0208 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0208 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0208 }
            monitor-exit(r0)     // Catch:{ all -> 0x0208 }
            r0 = 2
            if (r1 == 0) goto L_0x01b0
            java.util.List r1 = r9.mo69932b()
            java.util.Iterator r1 = r1.iterator()
        L_0x00b2:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00f4
            java.lang.Object r4 = r1.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            android.app.ActivityManager$RecentTaskInfo r5 = r4.getTaskInfo()
            if (r5 == 0) goto L_0x00b2
            android.app.ActivityManager$RecentTaskInfo r5 = r4.getTaskInfo()
            android.content.Intent r5 = r5.baseIntent
            if (r5 == 0) goto L_0x00b2
            android.app.ActivityManager$RecentTaskInfo r5 = r4.getTaskInfo()
            android.content.Intent r5 = r5.baseIntent
            android.content.ComponentName r5 = r5.getComponent()
            if (r5 == 0) goto L_0x00b2
            android.app.ActivityManager$RecentTaskInfo r4 = r4.getTaskInfo()
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            java.lang.String r4 = r4.getClassName()
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            java.lang.String r5 = r5.getName()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x00b2
            goto L_0x01af
        L_0x00f4:
            java.util.List r1 = r9.mo69932b()
            java.util.Iterator r1 = r1.iterator()
        L_0x00fc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x0154
            java.lang.Object r4 = r1.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            android.app.ActivityManager$RecentTaskInfo r4 = r4.getTaskInfo()
            if (r4 == 0) goto L_0x00fc
            android.content.Intent r5 = r4.baseIntent
            if (r5 == 0) goto L_0x00fc
            android.content.ComponentName r5 = r5.getComponent()
            if (r5 == 0) goto L_0x00fc
            android.content.Intent r4 = r4.baseIntent
            android.content.ComponentName r4 = r4.getComponent()
            java.lang.String r5 = r4.getClassName()
            java.lang.Class r4 = java.lang.Class.forName(r5)     // Catch:{ ClassNotFoundException -> 0x013b }
        L_0x0126:
            if (r4 == 0) goto L_0x00fc
            java.lang.Class<android.app.Activity> r5 = android.app.Activity.class
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L_0x0131
            goto L_0x0152
        L_0x0131:
            java.lang.Class r5 = r4.getSuperclass()
            if (r5 == r4) goto L_0x0139
            r4 = r5
            goto L_0x0126
        L_0x0139:
            r4 = 0
            goto L_0x0126
        L_0x013b:
            com.google.android.gms.measurement.internal.m3 r6 = f40454e
            java.lang.Object[] r7 = new java.lang.Object[r2]
            r7[r3] = r5
            java.lang.String r5 = "ClassNotFoundException when scanning class hierarchy of '%s'"
            r6.mo52246f(r5, r7)
            android.content.Context r5 = r9.f40455a     // Catch:{ NameNotFoundException -> 0x00fc }
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00fc }
            android.content.pm.ActivityInfo r4 = r5.getActivityInfo(r4, r3)     // Catch:{ NameNotFoundException -> 0x00fc }
            if (r4 == 0) goto L_0x00fc
        L_0x0152:
            r1 = r2
            goto L_0x0155
        L_0x0154:
            r1 = r3
        L_0x0155:
            pl.b r4 = r9.f40457c
            r4.getClass()
            com.google.android.gms.measurement.internal.m3 r5 = p648pl.C18393b.f40451c
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String r7 = "Disabling all non-activity components"
            r5.mo52245e(r7, r6)
            java.util.List r5 = r4.mo69929a()
            r4.mo69930b(r0, r5)
            java.util.List r0 = r9.mo69932b()
            java.util.Iterator r0 = r0.iterator()
        L_0x0172:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0182
            java.lang.Object r4 = r0.next()
            android.app.ActivityManager$AppTask r4 = (android.app.ActivityManager.AppTask) r4
            r4.finishAndRemoveTask()
            goto L_0x0172
        L_0x0182:
            if (r1 == 0) goto L_0x01aa
            android.content.Context r0 = r9.f40455a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r4 = r9.f40455a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r5 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r1.<init>(r4, r5)
            r0.setComponentEnabledSetting(r1, r2, r2)
            android.content.Intent r0 = new android.content.Intent
            android.content.Context r1 = r9.f40455a
            java.lang.Class<com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity> r4 = com.google.android.play.core.missingsplits.PlayCoreMissingSplitsActivity.class
            r0.<init>(r1, r4)
            r1 = 884998144(0x34c00000, float:3.5762787E-7)
            android.content.Intent r0 = r0.addFlags(r1)
            android.content.Context r1 = r9.f40455a
            r1.startActivity(r0)
        L_0x01aa:
            java.lang.Runtime r0 = r9.f40456b
            r0.exit(r3)
        L_0x01af:
            return r2
        L_0x01b0:
            pl.b r1 = r9.f40457c
            java.util.List r4 = r1.mo69929a()
            java.util.Iterator r4 = r4.iterator()
        L_0x01ba:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01e2
            java.lang.Object r5 = r4.next()
            android.content.pm.ComponentInfo r5 = (android.content.pm.ComponentInfo) r5
            android.content.pm.PackageManager r6 = r1.f40453b
            android.content.ComponentName r7 = new android.content.ComponentName
            java.lang.String r8 = r5.packageName
            java.lang.String r5 = r5.name
            r7.<init>(r8, r5)
            int r5 = r6.getComponentEnabledSetting(r7)
            if (r5 == r0) goto L_0x01ba
            com.google.android.gms.measurement.internal.m3 r0 = p648pl.C18393b.f40451c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r2 = "Not all non-activity components are disabled"
            r0.mo52242b(r2, r1)
            r2 = r3
            goto L_0x01eb
        L_0x01e2:
            com.google.android.gms.measurement.internal.m3 r0 = p648pl.C18393b.f40451c
            java.lang.Object[] r1 = new java.lang.Object[r3]
            java.lang.String r4 = "All non-activity components are disabled"
            r0.mo52242b(r4, r1)
        L_0x01eb:
            if (r2 == 0) goto L_0x0207
            pl.b r0 = r9.f40457c
            r0.getClass()
            com.google.android.gms.measurement.internal.m3 r1 = p648pl.C18393b.f40451c
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r4 = "Resetting enabled state of all non-activity components"
            r1.mo52245e(r4, r2)
            java.util.List r1 = r0.mo69929a()
            r0.mo69930b(r3, r1)
            java.lang.Runtime r0 = r9.f40456b
            r0.exit(r3)
        L_0x0207:
            return r3
        L_0x0208:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0208 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p648pl.C18394c.mo69931a():boolean");
    }

    @TargetApi(21)
    /* renamed from: b */
    public final List mo69932b() {
        List<ActivityManager.AppTask> appTasks = ((ActivityManager) this.f40455a.getSystemService("activity")).getAppTasks();
        return appTasks != null ? appTasks : Collections.emptyList();
    }
}
