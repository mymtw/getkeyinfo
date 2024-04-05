package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.work.C3373b;
import androidx.work.C3422l;
import java.util.concurrent.TimeUnit;
import p002a1.C0006a;
import p079d3.C6636i;
import p252u2.C8129j;

public final class ForceStopRunnable implements Runnable {

    /* renamed from: e */
    public static final String f7983e = C3422l.m8214e("ForceStopRunnable");

    /* renamed from: f */
    public static final long f7984f = TimeUnit.DAYS.toMillis(3650);

    /* renamed from: b */
    public final Context f7985b;

    /* renamed from: c */
    public final C8129j f7986c;

    /* renamed from: d */
    public int f7987d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String TAG = C3422l.m8214e("ForceStopRunnable$Rcvr");

        public void onReceive(Context context, Intent intent) {
            if (intent != null && "ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                int i = ((C3422l.C3423a) C3422l.m8213c()).f8028b;
                ForceStopRunnable.m8175c(context);
            }
        }
    }

    public ForceStopRunnable(Context context, C8129j jVar) {
        this.f7985b = context.getApplicationContext();
        this.f7986c = jVar;
    }

    @SuppressLint({"ClassVerificationFailure"})
    /* renamed from: c */
    public static void m8175c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = C0006a.m80a() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + f7984f;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x020c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12894a() {
        /*
            r15 = this;
            android.content.Context r0 = r15.f7985b
            u2.j r1 = r15.f7986c
            java.lang.String r2 = p282x2.C8314b.f18250f
            java.lang.String r2 = "jobscheduler"
            java.lang.Object r2 = r0.getSystemService(r2)
            android.app.job.JobScheduler r2 = (android.app.job.JobScheduler) r2
            java.util.ArrayList r0 = p282x2.C8314b.m16606e(r0, r2)
            androidx.work.impl.WorkDatabase r3 = r1.f17763c
            c3.h r3 = r3.mo12854q()
            c3.i r3 = (p034c3.C4380i) r3
            r3.getClass()
            r4 = 0
            java.lang.String r5 = "SELECT DISTINCT work_spec_id FROM SystemIdInfo"
            androidx.room.d0 r5 = androidx.room.C3226d0.m7877d(r4, r5)
            androidx.room.RoomDatabase r6 = r3.f9633a
            r6.mo11973b()
            androidx.room.RoomDatabase r3 = r3.f9633a
            android.database.Cursor r3 = r3.mo11983l(r5)
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x023f }
            int r7 = r3.getCount()     // Catch:{ all -> 0x023f }
            r6.<init>(r7)     // Catch:{ all -> 0x023f }
        L_0x0038:
            boolean r7 = r3.moveToNext()     // Catch:{ all -> 0x023f }
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r3.getString(r4)     // Catch:{ all -> 0x023f }
            r6.add(r7)     // Catch:{ all -> 0x023f }
            goto L_0x0038
        L_0x0046:
            r3.close()
            r5.release()
            if (r0 == 0) goto L_0x0053
            int r3 = r0.size()
            goto L_0x0054
        L_0x0053:
            r3 = r4
        L_0x0054:
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r3)
            r3 = 0
            if (r0 == 0) goto L_0x0098
            boolean r7 = r0.isEmpty()
            if (r7 != 0) goto L_0x0098
            java.util.Iterator r0 = r0.iterator()
        L_0x0066:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0098
            java.lang.Object r7 = r0.next()
            android.app.job.JobInfo r7 = (android.app.job.JobInfo) r7
            java.lang.String r8 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r9 = r7.getExtras()
            if (r9 == 0) goto L_0x0085
            boolean r10 = r9.containsKey(r8)     // Catch:{ NullPointerException -> 0x0085 }
            if (r10 == 0) goto L_0x0085
            java.lang.String r8 = r9.getString(r8)     // Catch:{ NullPointerException -> 0x0085 }
            goto L_0x0086
        L_0x0085:
            r8 = r3
        L_0x0086:
            boolean r9 = android.text.TextUtils.isEmpty(r8)
            if (r9 != 0) goto L_0x0090
            r5.add(r8)
            goto L_0x0066
        L_0x0090:
            int r7 = r7.getId()
            p282x2.C8314b.m16605b(r2, r7)
            goto L_0x0066
        L_0x0098:
            java.util.Iterator r0 = r6.iterator()
        L_0x009c:
            boolean r2 = r0.hasNext()
            r7 = 1
            if (r2 == 0) goto L_0x00be
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L_0x009c
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r2 = p282x2.C8314b.f18250f
            java.lang.Throwable[] r5 = new java.lang.Throwable[r4]
            java.lang.String r8 = "Reconciling jobs"
            r0.mo12926a(r2, r8, r5)
            r0 = r7
            goto L_0x00bf
        L_0x00be:
            r0 = r4
        L_0x00bf:
            r8 = -1
            if (r0 == 0) goto L_0x00ef
            androidx.work.impl.WorkDatabase r1 = r1.f17763c
            r1.mo11974c()
            c3.p r2 = r1.mo12857t()     // Catch:{ all -> 0x00ea }
            java.util.Iterator r5 = r6.iterator()     // Catch:{ all -> 0x00ea }
        L_0x00d0:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x00ea }
            if (r6 == 0) goto L_0x00e3
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x00ea }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ all -> 0x00ea }
            r10 = r2
            c3.q r10 = (p034c3.C4394q) r10     // Catch:{ all -> 0x00ea }
            r10.mo14336l(r8, r6)     // Catch:{ all -> 0x00ea }
            goto L_0x00d0
        L_0x00e3:
            r1.mo11984m()     // Catch:{ all -> 0x00ea }
            r1.mo11980i()
            goto L_0x00ef
        L_0x00ea:
            r0 = move-exception
            r1.mo11980i()
            throw r0
        L_0x00ef:
            u2.j r1 = r15.f7986c
            androidx.work.impl.WorkDatabase r1 = r1.f17763c
            c3.p r2 = r1.mo12857t()
            c3.m r5 = r1.mo12856s()
            r1.mo11974c()
            c3.q r2 = (p034c3.C4394q) r2     // Catch:{ all -> 0x023a }
            java.util.ArrayList r6 = r2.mo14328d()     // Catch:{ all -> 0x023a }
            boolean r10 = r6.isEmpty()     // Catch:{ all -> 0x023a }
            r10 = r10 ^ r7
            if (r10 == 0) goto L_0x012c
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x023a }
        L_0x010f:
            boolean r11 = r6.hasNext()     // Catch:{ all -> 0x023a }
            if (r11 == 0) goto L_0x012c
            java.lang.Object r11 = r6.next()     // Catch:{ all -> 0x023a }
            c3.o r11 = (p034c3.C4391o) r11     // Catch:{ all -> 0x023a }
            androidx.work.WorkInfo$State r12 = androidx.work.WorkInfo$State.ENQUEUED     // Catch:{ all -> 0x023a }
            java.lang.String[] r13 = new java.lang.String[r7]     // Catch:{ all -> 0x023a }
            java.lang.String r14 = r11.f9644a     // Catch:{ all -> 0x023a }
            r13[r4] = r14     // Catch:{ all -> 0x023a }
            r2.mo14340p(r12, r13)     // Catch:{ all -> 0x023a }
            java.lang.String r11 = r11.f9644a     // Catch:{ all -> 0x023a }
            r2.mo14336l(r8, r11)     // Catch:{ all -> 0x023a }
            goto L_0x010f
        L_0x012c:
            c3.n r5 = (p034c3.C4388n) r5     // Catch:{ all -> 0x023a }
            r5.mo14316b()     // Catch:{ all -> 0x023a }
            r1.mo11984m()     // Catch:{ all -> 0x023a }
            r1.mo11980i()
            if (r10 != 0) goto L_0x013e
            if (r0 == 0) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r0 = r4
            goto L_0x013f
        L_0x013e:
            r0 = r7
        L_0x013f:
            u2.j r1 = r15.f7986c
            d3.h r1 = r1.f17767g
            androidx.work.impl.WorkDatabase r1 = r1.f14639a
            c3.e r1 = r1.mo12853p()
            c3.f r1 = (p034c3.C4376f) r1
            java.lang.String r2 = "reschedule_needed"
            java.lang.Long r1 = r1.mo14308a(r2)
            if (r1 == 0) goto L_0x015f
            long r5 = r1.longValue()
            r8 = 1
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x015f
            r1 = r7
            goto L_0x0160
        L_0x015f:
            r1 = r4
        L_0x0160:
            if (r1 == 0) goto L_0x018f
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f7983e
            java.lang.Throwable[] r3 = new java.lang.Throwable[r4]
            java.lang.String r4 = "Rescheduling Workers."
            r0.mo12926a(r1, r4, r3)
            u2.j r0 = r15.f7986c
            r0.mo20727h()
            u2.j r0 = r15.f7986c
            d3.h r0 = r0.f17767g
            r0.getClass()
            c3.d r1 = new c3.d
            r3 = 0
            r1.<init>(r2, r3)
            androidx.work.impl.WorkDatabase r0 = r0.f14639a
            c3.e r0 = r0.mo12853p()
            c3.f r0 = (p034c3.C4376f) r0
            r0.mo14309b(r1)
            goto L_0x0239
        L_0x018f:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r2 = p002a1.C0006a.m80a()     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            if (r2 == 0) goto L_0x0199
            r1 = 570425344(0x22000000, float:1.7347235E-18)
        L_0x0199:
            android.content.Context r2 = r15.f7985b     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            android.content.Intent r5 = new android.content.Intent     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            r5.<init>()     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            android.content.ComponentName r6 = new android.content.ComponentName     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            java.lang.Class<androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver> r8 = androidx.work.impl.utils.ForceStopRunnable.BroadcastReceiver.class
            r6.<init>(r2, r8)     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            r5.setComponent(r6)     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            java.lang.String r6 = "ACTION_FORCE_STOP_RESCHEDULE"
            r5.setAction(r6)     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            r6 = -1
            android.app.PendingIntent r1 = android.app.PendingIntent.getBroadcast(r2, r6, r5, r1)     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            r5 = 30
            if (r2 < r5) goto L_0x01ee
            if (r1 == 0) goto L_0x01bf
            r1.cancel()     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
        L_0x01bf:
            android.content.Context r1 = r15.f7985b     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            java.lang.String r2 = "activity"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            java.util.List r1 = r1.getHistoricalProcessExitReasons(r3, r4, r4)     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            if (r1 == 0) goto L_0x01f6
            boolean r2 = r1.isEmpty()     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            if (r2 != 0) goto L_0x01f6
            r2 = r4
        L_0x01d6:
            int r3 = r1.size()     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            if (r2 >= r3) goto L_0x01f6
            java.lang.Object r3 = r1.get(r2)     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            android.app.ApplicationExitInfo r3 = (android.app.ApplicationExitInfo) r3     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            int r3 = r3.getReason()     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            r5 = 10
            if (r3 != r5) goto L_0x01eb
            goto L_0x020a
        L_0x01eb:
            int r2 = r2 + 1
            goto L_0x01d6
        L_0x01ee:
            if (r1 != 0) goto L_0x01f6
            android.content.Context r1 = r15.f7985b     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            m8175c(r1)     // Catch:{ SecurityException -> 0x01fa, IllegalArgumentException -> 0x01f8 }
            goto L_0x020a
        L_0x01f6:
            r7 = r4
            goto L_0x020a
        L_0x01f8:
            r1 = move-exception
            goto L_0x01fb
        L_0x01fa:
            r1 = move-exception
        L_0x01fb:
            androidx.work.l r2 = androidx.work.C3422l.m8213c()
            java.lang.String r3 = f7983e
            java.lang.Throwable[] r5 = new java.lang.Throwable[r7]
            r5[r4] = r1
            java.lang.String r1 = "Ignoring exception"
            r2.mo12929f(r3, r1, r5)
        L_0x020a:
            if (r7 == 0) goto L_0x021f
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f7983e
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            java.lang.String r3 = "Application was force-stopped, rescheduling."
            r0.mo12926a(r1, r3, r2)
            u2.j r0 = r15.f7986c
            r0.mo20727h()
            goto L_0x0239
        L_0x021f:
            if (r0 == 0) goto L_0x0239
            androidx.work.l r0 = androidx.work.C3422l.m8213c()
            java.lang.String r1 = f7983e
            java.lang.Throwable[] r2 = new java.lang.Throwable[r4]
            java.lang.String r3 = "Found unfinished work, scheduling it."
            r0.mo12926a(r1, r3, r2)
            u2.j r0 = r15.f7986c
            androidx.work.b r1 = r0.f17762b
            androidx.work.impl.WorkDatabase r2 = r0.f17763c
            java.util.List<u2.d> r0 = r0.f17765e
            p252u2.C8124e.m16338a(r1, r2, r0)
        L_0x0239:
            return
        L_0x023a:
            r0 = move-exception
            r1.mo11980i()
            throw r0
        L_0x023f:
            r0 = move-exception
            r3.close()
            r5.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.mo12894a():void");
    }

    /* renamed from: b */
    public final boolean mo12895b() {
        C3373b bVar = this.f7986c.f17762b;
        bVar.getClass();
        if (TextUtils.isEmpty((CharSequence) null)) {
            C3422l.m8213c().mo12926a(f7983e, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean a = C6636i.m13018a(this.f7985b, bVar);
        C3422l.m8213c().mo12926a(f7983e, String.format("Is default app process = %s", new Object[]{Boolean.valueOf(a)}), new Throwable[0]);
        return a;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000c */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x000c A[LOOP:0: B:5:0x000c->B:26:0x000c, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            boolean r0 = r11.mo12895b()     // Catch:{ all -> 0x007f }
            if (r0 != 0) goto L_0x000c
            u2.j r0 = r11.f7986c
            r0.mo20726g()
            return
        L_0x000c:
            android.content.Context r0 = r11.f7985b     // Catch:{ all -> 0x007f }
            p252u2.C8128i.m16344a(r0)     // Catch:{ all -> 0x007f }
            androidx.work.l r0 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x007f }
            java.lang.String r1 = f7983e     // Catch:{ all -> 0x007f }
            java.lang.String r2 = "Performing cleanup operations."
            r3 = 0
            java.lang.Throwable[] r4 = new java.lang.Throwable[r3]     // Catch:{ all -> 0x007f }
            r0.mo12926a(r1, r2, r4)     // Catch:{ all -> 0x007f }
            r11.mo12894a()     // Catch:{ SQLiteCantOpenDatabaseException -> 0x0032, SQLiteDatabaseCorruptException -> 0x0030, SQLiteDatabaseLockedException -> 0x002e, SQLiteTableLockedException -> 0x002c, SQLiteConstraintException -> 0x002a, SQLiteAccessPermException -> 0x0028 }
            u2.j r0 = r11.f7986c
            r0.mo20726g()
            return
        L_0x0028:
            r0 = move-exception
            goto L_0x0033
        L_0x002a:
            r0 = move-exception
            goto L_0x0033
        L_0x002c:
            r0 = move-exception
            goto L_0x0033
        L_0x002e:
            r0 = move-exception
            goto L_0x0033
        L_0x0030:
            r0 = move-exception
            goto L_0x0033
        L_0x0032:
            r0 = move-exception
        L_0x0033:
            int r1 = r11.f7987d     // Catch:{ all -> 0x007f }
            r2 = 1
            int r1 = r1 + r2
            r11.f7987d = r1     // Catch:{ all -> 0x007f }
            r4 = 3
            if (r1 >= r4) goto L_0x0063
            long r4 = (long) r1     // Catch:{ all -> 0x007f }
            r6 = 300(0x12c, double:1.48E-321)
            long r4 = r4 * r6
            androidx.work.l r1 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x007f }
            java.lang.String r8 = f7983e     // Catch:{ all -> 0x007f }
            java.lang.String r9 = "Retrying after %s"
            java.lang.Object[] r10 = new java.lang.Object[r2]     // Catch:{ all -> 0x007f }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x007f }
            r10[r3] = r4     // Catch:{ all -> 0x007f }
            java.lang.String r4 = java.lang.String.format(r9, r10)     // Catch:{ all -> 0x007f }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x007f }
            r2[r3] = r0     // Catch:{ all -> 0x007f }
            r1.mo12926a(r8, r4, r2)     // Catch:{ all -> 0x007f }
            int r0 = r11.f7987d     // Catch:{ all -> 0x007f }
            long r0 = (long) r0
            long r0 = r0 * r6
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x000c }
            goto L_0x000c
        L_0x0063:
            java.lang.String r1 = "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store."
            androidx.work.l r4 = androidx.work.C3422l.m8213c()     // Catch:{ all -> 0x007f }
            java.lang.String r5 = f7983e     // Catch:{ all -> 0x007f }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x007f }
            r2[r3] = r0     // Catch:{ all -> 0x007f }
            r4.mo12927b(r5, r1, r2)     // Catch:{ all -> 0x007f }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ all -> 0x007f }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x007f }
            u2.j r0 = r11.f7986c     // Catch:{ all -> 0x007f }
            androidx.work.b r0 = r0.f17762b     // Catch:{ all -> 0x007f }
            r0.getClass()     // Catch:{ all -> 0x007f }
            throw r2     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            u2.j r1 = r11.f7986c
            r1.mo20726g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
