package p271w2;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.C3422l;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.C3398a;
import p034c3.C4374d;
import p034c3.C4376f;
import p034c3.C4378g;
import p034c3.C4380i;
import p079d3.C6633f;
import p252u2.C8129j;

/* renamed from: w2.a */
public final class C8228a {

    /* renamed from: a */
    public static final String f18060a = C3422l.m8214e("Alarms");

    /* renamed from: a */
    public static void m16517a(Context context, int i, String str) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, C3398a.m8156a(context, str), 603979776);
        if (service != null && alarmManager != null) {
            C3422l.m8213c().mo12926a(f18060a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", new Object[]{str, Integer.valueOf(i)}), new Throwable[0]);
            alarmManager.cancel(service);
        }
    }

    /* renamed from: b */
    public static void m16518b(Context context, C8129j jVar, String str, long j) {
        int intValue;
        WorkDatabase workDatabase = jVar.f17763c;
        C4380i iVar = (C4380i) workDatabase.mo12854q();
        C4378g a = iVar.mo14312a(str);
        if (a != null) {
            m16517a(context, a.f9632b, str);
            int i = a.f9632b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, C3398a.m8156a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        synchronized (C6633f.class) {
            workDatabase.mo11974c();
            try {
                Long a2 = ((C4376f) workDatabase.mo12853p()).mo14308a("next_alarm_manager_id");
                intValue = a2 != null ? a2.intValue() : 0;
                ((C4376f) workDatabase.mo12853p()).mo14309b(new C4374d("next_alarm_manager_id", (long) (intValue == Integer.MAX_VALUE ? 0 : intValue + 1)));
                workDatabase.mo11984m();
            } finally {
                workDatabase.mo11980i();
            }
        }
        iVar.mo14313b(new C4378g(str, intValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, intValue, C3398a.m8156a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
