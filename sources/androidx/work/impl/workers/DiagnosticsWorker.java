package androidx.work.impl.workers;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.room.C3226d0;
import androidx.work.C3376c;
import androidx.work.C3380e;
import androidx.work.C3422l;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import p003a2.C0016c;
import p034c3.C4378g;
import p034c3.C4379h;
import p034c3.C4380i;
import p034c3.C4384k;
import p034c3.C4385l;
import p034c3.C4391o;
import p034c3.C4393p;
import p034c3.C4394q;
import p034c3.C4404s;
import p034c3.C4405t;
import p034c3.C4407u;
import p252u2.C8129j;

public class DiagnosticsWorker extends Worker {

    /* renamed from: h */
    public static final String f8021h = C3422l.m8214e("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: i */
    public static String m8210i(C4384k kVar, C4404s sVar, C4379h hVar, ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{"Job Id"}));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4391o oVar = (C4391o) it.next();
            C4378g a = ((C4380i) hVar).mo14312a(oVar.f9644a);
            Integer num = null;
            if (a != null) {
                num = Integer.valueOf(a.f9632b);
            }
            String str = oVar.f9644a;
            C4385l lVar = (C4385l) kVar;
            lVar.getClass();
            C3226d0 d = C3226d0.m7877d(1, "SELECT name FROM workname WHERE work_spec_id=?");
            if (str == null) {
                d.mo12015p0(1);
            } else {
                d.mo12011Y(1, str);
            }
            lVar.f9638a.mo11973b();
            Cursor l = lVar.f9638a.mo11983l(d);
            try {
                ArrayList arrayList2 = new ArrayList(l.getCount());
                while (l.moveToNext()) {
                    arrayList2.add(l.getString(0));
                }
                l.close();
                d.release();
                ArrayList a2 = ((C4405t) sVar).mo14341a(oVar.f9644a);
                sb.append(String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{oVar.f9644a, oVar.f9646c, num, oVar.f9645b.name(), TextUtils.join(",", arrayList2), TextUtils.join(",", a2)}));
            } catch (Throwable th) {
                l.close();
                d.release();
                throw th;
            }
        }
        return sb.toString();
    }

    /* renamed from: h */
    public final ListenableWorker.C3367a mo12834h() {
        C3226d0 d0Var;
        ArrayList arrayList;
        C4379h hVar;
        C4404s sVar;
        C4384k kVar;
        int i;
        WorkDatabase workDatabase = C8129j.m16345e(this.f7853b).f17763c;
        C4393p t = workDatabase.mo12857t();
        C4384k r = workDatabase.mo12855r();
        C4404s u = workDatabase.mo12858u();
        C4379h q = workDatabase.mo12854q();
        C4394q qVar = (C4394q) t;
        qVar.getClass();
        C3226d0 d = C3226d0.m7877d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC");
        d.mo12013h0(1, System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        qVar.f9664a.mo11973b();
        Cursor l = qVar.f9664a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "required_network_type");
            int a2 = C0016c.m97a(l, "requires_charging");
            int a3 = C0016c.m97a(l, "requires_device_idle");
            int a4 = C0016c.m97a(l, "requires_battery_not_low");
            int a5 = C0016c.m97a(l, "requires_storage_not_low");
            int a6 = C0016c.m97a(l, "trigger_content_update_delay");
            int a7 = C0016c.m97a(l, "trigger_max_content_delay");
            int a8 = C0016c.m97a(l, "content_uri_triggers");
            int a9 = C0016c.m97a(l, "id");
            int a10 = C0016c.m97a(l, "state");
            C4379h hVar2 = q;
            int a11 = C0016c.m97a(l, "worker_class_name");
            C4384k kVar2 = r;
            int a12 = C0016c.m97a(l, "input_merger_class_name");
            C4404s sVar2 = u;
            int a13 = C0016c.m97a(l, "input");
            C4394q qVar2 = qVar;
            int a14 = C0016c.m97a(l, "output");
            d0Var = d;
            try {
                int a15 = C0016c.m97a(l, "initial_delay");
                int a16 = C0016c.m97a(l, "interval_duration");
                int a17 = C0016c.m97a(l, "flex_duration");
                int a18 = C0016c.m97a(l, "run_attempt_count");
                int a19 = C0016c.m97a(l, "backoff_policy");
                int a20 = C0016c.m97a(l, "backoff_delay_duration");
                int a21 = C0016c.m97a(l, "period_start_time");
                int a22 = C0016c.m97a(l, "minimum_retention_duration");
                int a23 = C0016c.m97a(l, "schedule_requested_at");
                int a24 = C0016c.m97a(l, "run_in_foreground");
                int a25 = C0016c.m97a(l, "out_of_quota_policy");
                int i2 = a14;
                ArrayList arrayList2 = new ArrayList(l.getCount());
                while (true) {
                    arrayList = arrayList2;
                    if (!l.moveToNext()) {
                        break;
                    }
                    String string = l.getString(a9);
                    String string2 = l.getString(a11);
                    int i3 = a11;
                    C3376c cVar = new C3376c();
                    int i4 = a;
                    cVar.f7882a = C4407u.m10107c(l.getInt(a));
                    cVar.f7883b = l.getInt(a2) != 0;
                    cVar.f7884c = l.getInt(a3) != 0;
                    cVar.f7885d = l.getInt(a4) != 0;
                    cVar.f7886e = l.getInt(a5) != 0;
                    int i5 = a9;
                    cVar.f7887f = l.getLong(a6);
                    cVar.f7888g = l.getLong(a7);
                    cVar.f7889h = C4407u.m10105a(l.getBlob(a8));
                    C4391o oVar = new C4391o(string, string2);
                    oVar.f9645b = C4407u.m10109e(l.getInt(a10));
                    oVar.f9647d = l.getString(a12);
                    oVar.f9648e = C3380e.m8118a(l.getBlob(a13));
                    int i6 = i2;
                    oVar.f9649f = C3380e.m8118a(l.getBlob(i6));
                    int i7 = a10;
                    i2 = i6;
                    int i8 = a15;
                    oVar.f9650g = l.getLong(i8);
                    int i9 = a12;
                    int i10 = a16;
                    oVar.f9651h = l.getLong(i10);
                    int i11 = a13;
                    int i12 = a17;
                    oVar.f9652i = l.getLong(i12);
                    int i13 = a18;
                    oVar.f9654k = l.getInt(i13);
                    int i14 = a19;
                    int i15 = i10;
                    oVar.f9655l = C4407u.m10106b(l.getInt(i14));
                    a17 = i12;
                    int i16 = i13;
                    int i17 = a20;
                    oVar.f9656m = l.getLong(i17);
                    int i18 = i14;
                    int i19 = a21;
                    oVar.f9657n = l.getLong(i19);
                    int i20 = i17;
                    a21 = i19;
                    int i21 = a22;
                    oVar.f9658o = l.getLong(i21);
                    a22 = i21;
                    int i22 = a23;
                    oVar.f9659p = l.getLong(i22);
                    int i23 = a24;
                    oVar.f9660q = l.getInt(i23) != 0;
                    int i24 = a25;
                    int i25 = i22;
                    oVar.f9661r = C4407u.m10108d(l.getInt(i24));
                    oVar.f9653j = cVar;
                    ArrayList arrayList3 = arrayList;
                    arrayList3.add(oVar);
                    a25 = i24;
                    a10 = i7;
                    a12 = i9;
                    a23 = i25;
                    a = i4;
                    arrayList2 = arrayList3;
                    a24 = i23;
                    a15 = i8;
                    a11 = i3;
                    a9 = i5;
                    int i26 = i18;
                    a20 = i20;
                    a13 = i11;
                    a16 = i15;
                    a18 = i16;
                    a19 = i26;
                }
                ArrayList arrayList4 = arrayList;
                l.close();
                d0Var.release();
                ArrayList d2 = qVar2.mo14328d();
                ArrayList b = qVar2.mo14326b();
                if (!arrayList4.isEmpty()) {
                    C3422l c = C3422l.m8213c();
                    String str = f8021h;
                    i = 0;
                    c.mo12928d(str, "Recently completed work:\n\n", new Throwable[0]);
                    hVar = hVar2;
                    kVar = kVar2;
                    sVar = sVar2;
                    C3422l.m8213c().mo12928d(str, m8210i(kVar, sVar, hVar, arrayList4), new Throwable[0]);
                } else {
                    hVar = hVar2;
                    kVar = kVar2;
                    sVar = sVar2;
                    i = 0;
                }
                if (!d2.isEmpty()) {
                    C3422l c2 = C3422l.m8213c();
                    String str2 = f8021h;
                    c2.mo12928d(str2, "Running work:\n\n", new Throwable[i]);
                    C3422l.m8213c().mo12928d(str2, m8210i(kVar, sVar, hVar, d2), new Throwable[i]);
                }
                if (!b.isEmpty()) {
                    C3422l c3 = C3422l.m8213c();
                    String str3 = f8021h;
                    c3.mo12928d(str3, "Enqueued work:\n\n", new Throwable[i]);
                    C3422l.m8213c().mo12928d(str3, m8210i(kVar, sVar, hVar, b), new Throwable[i]);
                }
                return new ListenableWorker.C3367a.C3370c();
            } catch (Throwable th) {
                th = th;
                l.close();
                d0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            d0Var = d;
            l.close();
            d0Var.release();
            throw th;
        }
    }
}
