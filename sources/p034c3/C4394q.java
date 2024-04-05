package p034c3;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3233g0;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import androidx.work.C3376c;
import androidx.work.C3380e;
import androidx.work.WorkInfo$State;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import p003a2.C0016c;
import p034c3.C4391o;
import p112g2.C6838e;

/* renamed from: c3.q */
public final class C4394q implements C4393p {

    /* renamed from: a */
    public final RoomDatabase f9664a;

    /* renamed from: b */
    public final C4395a f9665b;

    /* renamed from: c */
    public final C4396b f9666c;

    /* renamed from: d */
    public final C4397c f9667d;

    /* renamed from: e */
    public final C4398d f9668e;

    /* renamed from: f */
    public final C4399e f9669f;

    /* renamed from: g */
    public final C4400f f9670g;

    /* renamed from: h */
    public final C4401g f9671h;

    /* renamed from: i */
    public final C4402h f9672i;

    /* renamed from: c3.q$a */
    public class C4395a extends C3242l<C4391o> {
        public C4395a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: byte[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.ObjectOutputStream} */
        /* JADX WARNING: type inference failed for: r3v2 */
        /* JADX WARNING: type inference failed for: r3v8 */
        /* JADX WARNING: type inference failed for: r3v21 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:74:0x01c2 A[SYNTHETIC, Splitter:B:74:0x01c2] */
        /* JADX WARNING: Removed duplicated region for block: B:84:0x01d9  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01df  */
        /* JADX WARNING: Removed duplicated region for block: B:88:0x01e9 A[SYNTHETIC, Splitter:B:88:0x01e9] */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo12037d(p112g2.C6838e r19, java.lang.Object r20) {
            /*
                r18 = this;
                r1 = r19
                r0 = r20
                c3.o r0 = (p034c3.C4391o) r0
                java.lang.String r2 = r0.f9644a
                r3 = 1
                if (r2 != 0) goto L_0x000f
                r1.mo12015p0(r3)
                goto L_0x0012
            L_0x000f:
                r1.mo12011Y(r3, r2)
            L_0x0012:
                androidx.work.WorkInfo$State r2 = r0.f9645b
                int r2 = p034c3.C4407u.m10110f(r2)
                long r4 = (long) r2
                r2 = 2
                r1.mo12013h0(r2, r4)
                java.lang.String r4 = r0.f9646c
                r5 = 3
                if (r4 != 0) goto L_0x0026
                r1.mo12015p0(r5)
                goto L_0x0029
            L_0x0026:
                r1.mo12011Y(r5, r4)
            L_0x0029:
                java.lang.String r4 = r0.f9647d
                r6 = 4
                if (r4 != 0) goto L_0x0032
                r1.mo12015p0(r6)
                goto L_0x0035
            L_0x0032:
                r1.mo12011Y(r6, r4)
            L_0x0035:
                androidx.work.e r4 = r0.f9648e
                byte[] r4 = androidx.work.C3380e.m8119b(r4)
                r7 = 5
                if (r4 != 0) goto L_0x0042
                r1.mo12015p0(r7)
                goto L_0x0045
            L_0x0042:
                r1.mo12014i0(r7, r4)
            L_0x0045:
                androidx.work.e r4 = r0.f9649f
                byte[] r4 = androidx.work.C3380e.m8119b(r4)
                r8 = 6
                if (r4 != 0) goto L_0x0052
                r1.mo12015p0(r8)
                goto L_0x0055
            L_0x0052:
                r1.mo12014i0(r8, r4)
            L_0x0055:
                r4 = 7
                long r8 = r0.f9650g
                r1.mo12013h0(r4, r8)
                r4 = 8
                long r8 = r0.f9651h
                r1.mo12013h0(r4, r8)
                r4 = 9
                long r8 = r0.f9652i
                r1.mo12013h0(r4, r8)
                r4 = 10
                int r8 = r0.f9654k
                long r8 = (long) r8
                r1.mo12013h0(r4, r8)
                androidx.work.BackoffPolicy r4 = r0.f9655l
                int[] r8 = p034c3.C4407u.C4408a.f9678b
                int r9 = r4.ordinal()
                r8 = r8[r9]
                java.lang.String r9 = " to int"
                java.lang.String r10 = "Could not convert "
                if (r8 == r3) goto L_0x009d
                if (r8 != r2) goto L_0x0085
                r4 = r3
                goto L_0x009e
            L_0x0085:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r4)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x009d:
                r4 = 0
            L_0x009e:
                r8 = 11
                long r12 = (long) r4
                r1.mo12013h0(r8, r12)
                r4 = 12
                long r12 = r0.f9656m
                r1.mo12013h0(r4, r12)
                r4 = 13
                long r12 = r0.f9657n
                r1.mo12013h0(r4, r12)
                r4 = 14
                long r12 = r0.f9658o
                r1.mo12013h0(r4, r12)
                r4 = 15
                long r12 = r0.f9659p
                r1.mo12013h0(r4, r12)
                boolean r4 = r0.f9660q
                r8 = 16
                long r12 = (long) r4
                r1.mo12013h0(r8, r12)
                androidx.work.OutOfQuotaPolicy r4 = r0.f9661r
                int[] r8 = p034c3.C4407u.C4408a.f9680d
                int r12 = r4.ordinal()
                r8 = r8[r12]
                if (r8 == r3) goto L_0x00f0
                if (r8 != r2) goto L_0x00d8
                r4 = r3
                goto L_0x00f1
            L_0x00d8:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r4)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x00f0:
                r4 = 0
            L_0x00f1:
                r8 = 17
                long r12 = (long) r4
                r1.mo12013h0(r8, r12)
                androidx.work.c r0 = r0.f9653j
                r4 = 22
                r8 = 21
                r12 = 20
                r13 = 19
                r14 = 18
                if (r0 == 0) goto L_0x01fc
                androidx.work.NetworkType r15 = r0.f7882a
                int[] r16 = p034c3.C4407u.C4408a.f9679c
                int r17 = r15.ordinal()
                r11 = r16[r17]
                if (r11 == r3) goto L_0x0143
                if (r11 == r2) goto L_0x0144
                if (r11 == r5) goto L_0x0141
                if (r11 == r6) goto L_0x013f
                if (r11 == r7) goto L_0x013d
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 30
                if (r2 < r3) goto L_0x0125
                androidx.work.NetworkType r2 = androidx.work.NetworkType.TEMPORARILY_UNMETERED
                if (r15 != r2) goto L_0x0125
                r3 = r7
                goto L_0x0144
            L_0x0125:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r15)
                r1.append(r9)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x013d:
                r3 = r6
                goto L_0x0144
            L_0x013f:
                r3 = r5
                goto L_0x0144
            L_0x0141:
                r3 = r2
                goto L_0x0144
            L_0x0143:
                r3 = 0
            L_0x0144:
                long r2 = (long) r3
                r1.mo12013h0(r14, r2)
                boolean r2 = r0.f7883b
                long r2 = (long) r2
                r1.mo12013h0(r13, r2)
                boolean r2 = r0.f7884c
                long r2 = (long) r2
                r1.mo12013h0(r12, r2)
                boolean r2 = r0.f7885d
                long r2 = (long) r2
                r1.mo12013h0(r8, r2)
                boolean r2 = r0.f7886e
                long r2 = (long) r2
                r1.mo12013h0(r4, r2)
                long r2 = r0.f7887f
                r4 = 23
                r1.mo12013h0(r4, r2)
                long r2 = r0.f7888g
                r4 = 24
                r1.mo12013h0(r4, r2)
                androidx.work.d r0 = r0.f7889h
                java.util.HashSet r2 = r0.f7894a
                int r2 = r2.size()
                r3 = 0
                if (r2 != 0) goto L_0x017a
                goto L_0x01d7
            L_0x017a:
                java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
                r2.<init>()
                java.io.ObjectOutputStream r4 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x01bc }
                r4.<init>(r2)     // Catch:{ IOException -> 0x01bc }
                java.util.HashSet r3 = r0.f7894a     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                int r3 = r3.size()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                r4.writeInt(r3)     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                java.util.HashSet r0 = r0.f7894a     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
            L_0x0193:
                boolean r3 = r0.hasNext()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                if (r3 == 0) goto L_0x01ae
                java.lang.Object r3 = r0.next()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                androidx.work.d$a r3 = (androidx.work.C3378d.C3379a) r3     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                android.net.Uri r5 = r3.f7895a     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                r4.writeUTF(r5)     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                boolean r3 = r3.f7896b     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                r4.writeBoolean(r3)     // Catch:{ IOException -> 0x01b4, all -> 0x01b2 }
                goto L_0x0193
            L_0x01ae:
                r4.close()     // Catch:{ IOException -> 0x01c6 }
                goto L_0x01ca
            L_0x01b2:
                r0 = move-exception
                goto L_0x01b6
            L_0x01b4:
                r0 = move-exception
                goto L_0x01b8
            L_0x01b6:
                r1 = r0
                goto L_0x01e7
            L_0x01b8:
                r3 = r4
                goto L_0x01bd
            L_0x01ba:
                r0 = move-exception
                goto L_0x01e5
            L_0x01bc:
                r0 = move-exception
            L_0x01bd:
                r0.printStackTrace()     // Catch:{ all -> 0x01ba }
                if (r3 == 0) goto L_0x01ca
                r3.close()     // Catch:{ IOException -> 0x01c6 }
                goto L_0x01ca
            L_0x01c6:
                r0 = move-exception
                r0.printStackTrace()
            L_0x01ca:
                r2.close()     // Catch:{ IOException -> 0x01ce }
                goto L_0x01d3
            L_0x01ce:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01d3:
                byte[] r3 = r2.toByteArray()
            L_0x01d7:
                if (r3 != 0) goto L_0x01df
                r2 = 25
                r1.mo12015p0(r2)
                goto L_0x021a
            L_0x01df:
                r2 = 25
                r1.mo12014i0(r2, r3)
                goto L_0x021a
            L_0x01e5:
                r1 = r0
                r4 = r3
            L_0x01e7:
                if (r4 == 0) goto L_0x01f2
                r4.close()     // Catch:{ IOException -> 0x01ed }
                goto L_0x01f2
            L_0x01ed:
                r0 = move-exception
                r3 = r0
                r3.printStackTrace()
            L_0x01f2:
                r2.close()     // Catch:{ IOException -> 0x01f6 }
                goto L_0x01fb
            L_0x01f6:
                r0 = move-exception
                r2 = r0
                r2.printStackTrace()
            L_0x01fb:
                throw r1
            L_0x01fc:
                r1.mo12015p0(r14)
                r1.mo12015p0(r13)
                r1.mo12015p0(r12)
                r1.mo12015p0(r8)
                r1.mo12015p0(r4)
                r0 = 23
                r1.mo12015p0(r0)
                r0 = 24
                r1.mo12015p0(r0)
                r2 = 25
                r1.mo12015p0(r2)
            L_0x021a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p034c3.C4394q.C4395a.mo12037d(g2.e, java.lang.Object):void");
        }
    }

    /* renamed from: c3.q$b */
    public class C4396b extends C3233g0 {
        public C4396b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* renamed from: c3.q$c */
    public class C4397c extends C3233g0 {
        public C4397c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* renamed from: c3.q$d */
    public class C4398d extends C3233g0 {
        public C4398d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    /* renamed from: c3.q$e */
    public class C4399e extends C3233g0 {
        public C4399e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    /* renamed from: c3.q$f */
    public class C4400f extends C3233g0 {
        public C4400f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* renamed from: c3.q$g */
    public class C4401g extends C3233g0 {
        public C4401g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* renamed from: c3.q$h */
    public class C4402h extends C3233g0 {
        public C4402h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public C4394q(RoomDatabase roomDatabase) {
        this.f9664a = roomDatabase;
        this.f9665b = new C4395a(roomDatabase);
        this.f9666c = new C4396b(roomDatabase);
        this.f9667d = new C4397c(roomDatabase);
        this.f9668e = new C4398d(roomDatabase);
        this.f9669f = new C4399e(roomDatabase);
        this.f9670g = new C4400f(roomDatabase);
        this.f9671h = new C4401g(roomDatabase);
        this.f9672i = new C4402h(roomDatabase);
        new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final void mo14325a(String str) {
        this.f9664a.mo11973b();
        C6838e a = this.f9666c.mo12028a();
        if (str == null) {
            a.mo12015p0(1);
        } else {
            a.mo12011Y(1, str);
        }
        this.f9664a.mo11974c();
        try {
            a.mo18972s();
            this.f9664a.mo11984m();
        } finally {
            this.f9664a.mo11980i();
            this.f9666c.mo12030c(a);
        }
    }

    /* renamed from: b */
    public final ArrayList mo14326b() {
        C3226d0 d0Var;
        C3226d0 d = C3226d0.m7877d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?");
        d.mo12013h0(1, (long) 200);
        this.f9664a.mo11973b();
        Cursor l = this.f9664a.mo11983l(d);
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
            int a11 = C0016c.m97a(l, "worker_class_name");
            int a12 = C0016c.m97a(l, "input_merger_class_name");
            int a13 = C0016c.m97a(l, "input");
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
                int i = a14;
                ArrayList arrayList = new ArrayList(l.getCount());
                while (l.moveToNext()) {
                    String string = l.getString(a9);
                    int i2 = a9;
                    String string2 = l.getString(a11);
                    int i3 = a11;
                    C3376c cVar = new C3376c();
                    int i4 = a;
                    cVar.f7882a = C4407u.m10107c(l.getInt(a));
                    cVar.f7883b = l.getInt(a2) != 0;
                    cVar.f7884c = l.getInt(a3) != 0;
                    cVar.f7885d = l.getInt(a4) != 0;
                    cVar.f7886e = l.getInt(a5) != 0;
                    int i5 = a2;
                    cVar.f7887f = l.getLong(a6);
                    cVar.f7888g = l.getLong(a7);
                    cVar.f7889h = C4407u.m10105a(l.getBlob(a8));
                    C4391o oVar = new C4391o(string, string2);
                    oVar.f9645b = C4407u.m10109e(l.getInt(a10));
                    oVar.f9647d = l.getString(a12);
                    oVar.f9648e = C3380e.m8118a(l.getBlob(a13));
                    int i6 = i;
                    oVar.f9649f = C3380e.m8118a(l.getBlob(i6));
                    int i7 = a13;
                    i = i6;
                    int i8 = a15;
                    oVar.f9650g = l.getLong(i8);
                    a15 = i8;
                    int i9 = a16;
                    oVar.f9651h = l.getLong(i9);
                    a16 = i9;
                    int i10 = a17;
                    oVar.f9652i = l.getLong(i10);
                    int i11 = a18;
                    oVar.f9654k = l.getInt(i11);
                    int i12 = a19;
                    a18 = i11;
                    oVar.f9655l = C4407u.m10106b(l.getInt(i12));
                    a17 = i10;
                    int i13 = a3;
                    int i14 = a20;
                    oVar.f9656m = l.getLong(i14);
                    a20 = i14;
                    int i15 = a21;
                    oVar.f9657n = l.getLong(i15);
                    a21 = i15;
                    int i16 = a22;
                    oVar.f9658o = l.getLong(i16);
                    a22 = i16;
                    int i17 = i12;
                    int i18 = a23;
                    oVar.f9659p = l.getLong(i18);
                    int i19 = a24;
                    oVar.f9660q = l.getInt(i19) != 0;
                    int i20 = a25;
                    a24 = i19;
                    oVar.f9661r = C4407u.m10108d(l.getInt(i20));
                    oVar.f9653j = cVar;
                    arrayList.add(oVar);
                    a25 = i20;
                    a23 = i18;
                    a13 = i7;
                    a9 = i2;
                    a11 = i3;
                    a = i4;
                    a2 = i5;
                    int i21 = i13;
                    a19 = i17;
                    a3 = i21;
                }
                l.close();
                d0Var.release();
                return arrayList;
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

    /* renamed from: c */
    public final ArrayList mo14327c(int i) {
        C3226d0 d0Var;
        C3226d0 d = C3226d0.m7877d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))");
        d.mo12013h0(1, (long) i);
        this.f9664a.mo11973b();
        Cursor l = this.f9664a.mo11983l(d);
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
            int a11 = C0016c.m97a(l, "worker_class_name");
            int a12 = C0016c.m97a(l, "input_merger_class_name");
            int a13 = C0016c.m97a(l, "input");
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
                ArrayList arrayList = new ArrayList(l.getCount());
                while (l.moveToNext()) {
                    String string = l.getString(a9);
                    int i3 = a9;
                    String string2 = l.getString(a11);
                    int i4 = a11;
                    C3376c cVar = new C3376c();
                    int i5 = a;
                    cVar.f7882a = C4407u.m10107c(l.getInt(a));
                    cVar.f7883b = l.getInt(a2) != 0;
                    cVar.f7884c = l.getInt(a3) != 0;
                    cVar.f7885d = l.getInt(a4) != 0;
                    cVar.f7886e = l.getInt(a5) != 0;
                    int i6 = a2;
                    cVar.f7887f = l.getLong(a6);
                    cVar.f7888g = l.getLong(a7);
                    cVar.f7889h = C4407u.m10105a(l.getBlob(a8));
                    C4391o oVar = new C4391o(string, string2);
                    oVar.f9645b = C4407u.m10109e(l.getInt(a10));
                    oVar.f9647d = l.getString(a12);
                    oVar.f9648e = C3380e.m8118a(l.getBlob(a13));
                    int i7 = i2;
                    oVar.f9649f = C3380e.m8118a(l.getBlob(i7));
                    int i8 = a15;
                    int i9 = a13;
                    i2 = i7;
                    oVar.f9650g = l.getLong(i8);
                    int i10 = i8;
                    int i11 = a16;
                    oVar.f9651h = l.getLong(i11);
                    a16 = i11;
                    int i12 = a17;
                    oVar.f9652i = l.getLong(i12);
                    int i13 = a18;
                    oVar.f9654k = l.getInt(i13);
                    int i14 = a19;
                    a18 = i13;
                    oVar.f9655l = C4407u.m10106b(l.getInt(i14));
                    a17 = i12;
                    int i15 = a3;
                    int i16 = a20;
                    oVar.f9656m = l.getLong(i16);
                    a20 = i16;
                    int i17 = a21;
                    oVar.f9657n = l.getLong(i17);
                    a21 = i17;
                    int i18 = a22;
                    oVar.f9658o = l.getLong(i18);
                    a22 = i18;
                    int i19 = i14;
                    int i20 = a23;
                    oVar.f9659p = l.getLong(i20);
                    int i21 = a24;
                    oVar.f9660q = l.getInt(i21) != 0;
                    int i22 = a25;
                    a24 = i21;
                    oVar.f9661r = C4407u.m10108d(l.getInt(i22));
                    oVar.f9653j = cVar;
                    arrayList.add(oVar);
                    a13 = i9;
                    a25 = i22;
                    a23 = i20;
                    a15 = i10;
                    a9 = i3;
                    a11 = i4;
                    a = i5;
                    a2 = i6;
                    int i23 = i15;
                    a19 = i19;
                    a3 = i23;
                }
                l.close();
                d0Var.release();
                return arrayList;
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

    /* renamed from: d */
    public final ArrayList mo14328d() {
        C3226d0 d0Var;
        C3226d0 d = C3226d0.m7877d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1");
        this.f9664a.mo11973b();
        Cursor l = this.f9664a.mo11983l(d);
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
            int a11 = C0016c.m97a(l, "worker_class_name");
            int a12 = C0016c.m97a(l, "input_merger_class_name");
            int a13 = C0016c.m97a(l, "input");
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
                int i = a14;
                ArrayList arrayList = new ArrayList(l.getCount());
                while (l.moveToNext()) {
                    String string = l.getString(a9);
                    int i2 = a9;
                    String string2 = l.getString(a11);
                    int i3 = a11;
                    C3376c cVar = new C3376c();
                    int i4 = a;
                    cVar.f7882a = C4407u.m10107c(l.getInt(a));
                    cVar.f7883b = l.getInt(a2) != 0;
                    cVar.f7884c = l.getInt(a3) != 0;
                    cVar.f7885d = l.getInt(a4) != 0;
                    cVar.f7886e = l.getInt(a5) != 0;
                    int i5 = a2;
                    cVar.f7887f = l.getLong(a6);
                    cVar.f7888g = l.getLong(a7);
                    cVar.f7889h = C4407u.m10105a(l.getBlob(a8));
                    C4391o oVar = new C4391o(string, string2);
                    oVar.f9645b = C4407u.m10109e(l.getInt(a10));
                    oVar.f9647d = l.getString(a12);
                    oVar.f9648e = C3380e.m8118a(l.getBlob(a13));
                    int i6 = i;
                    oVar.f9649f = C3380e.m8118a(l.getBlob(i6));
                    int i7 = a13;
                    i = i6;
                    int i8 = a15;
                    oVar.f9650g = l.getLong(i8);
                    a15 = i8;
                    int i9 = a16;
                    oVar.f9651h = l.getLong(i9);
                    a16 = i9;
                    int i10 = a17;
                    oVar.f9652i = l.getLong(i10);
                    int i11 = a18;
                    oVar.f9654k = l.getInt(i11);
                    int i12 = a19;
                    a18 = i11;
                    oVar.f9655l = C4407u.m10106b(l.getInt(i12));
                    a17 = i10;
                    int i13 = a3;
                    int i14 = a20;
                    oVar.f9656m = l.getLong(i14);
                    a20 = i14;
                    int i15 = a21;
                    oVar.f9657n = l.getLong(i15);
                    a21 = i15;
                    int i16 = a22;
                    oVar.f9658o = l.getLong(i16);
                    a22 = i16;
                    int i17 = i12;
                    int i18 = a23;
                    oVar.f9659p = l.getLong(i18);
                    int i19 = a24;
                    oVar.f9660q = l.getInt(i19) != 0;
                    int i20 = a25;
                    a24 = i19;
                    oVar.f9661r = C4407u.m10108d(l.getInt(i20));
                    oVar.f9653j = cVar;
                    arrayList.add(oVar);
                    a25 = i20;
                    a23 = i18;
                    a13 = i7;
                    a9 = i2;
                    a11 = i3;
                    a = i4;
                    a2 = i5;
                    int i21 = i13;
                    a19 = i17;
                    a3 = i21;
                }
                l.close();
                d0Var.release();
                return arrayList;
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

    /* renamed from: e */
    public final ArrayList mo14329e() {
        C3226d0 d0Var;
        C3226d0 d = C3226d0.m7877d(0, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
        this.f9664a.mo11973b();
        Cursor l = this.f9664a.mo11983l(d);
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
            int a11 = C0016c.m97a(l, "worker_class_name");
            int a12 = C0016c.m97a(l, "input_merger_class_name");
            int a13 = C0016c.m97a(l, "input");
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
                int i = a14;
                ArrayList arrayList = new ArrayList(l.getCount());
                while (l.moveToNext()) {
                    String string = l.getString(a9);
                    int i2 = a9;
                    String string2 = l.getString(a11);
                    int i3 = a11;
                    C3376c cVar = new C3376c();
                    int i4 = a;
                    cVar.f7882a = C4407u.m10107c(l.getInt(a));
                    cVar.f7883b = l.getInt(a2) != 0;
                    cVar.f7884c = l.getInt(a3) != 0;
                    cVar.f7885d = l.getInt(a4) != 0;
                    cVar.f7886e = l.getInt(a5) != 0;
                    int i5 = a2;
                    cVar.f7887f = l.getLong(a6);
                    cVar.f7888g = l.getLong(a7);
                    cVar.f7889h = C4407u.m10105a(l.getBlob(a8));
                    C4391o oVar = new C4391o(string, string2);
                    oVar.f9645b = C4407u.m10109e(l.getInt(a10));
                    oVar.f9647d = l.getString(a12);
                    oVar.f9648e = C3380e.m8118a(l.getBlob(a13));
                    int i6 = i;
                    oVar.f9649f = C3380e.m8118a(l.getBlob(i6));
                    int i7 = a13;
                    i = i6;
                    int i8 = a15;
                    oVar.f9650g = l.getLong(i8);
                    a15 = i8;
                    int i9 = a16;
                    oVar.f9651h = l.getLong(i9);
                    a16 = i9;
                    int i10 = a17;
                    oVar.f9652i = l.getLong(i10);
                    int i11 = a18;
                    oVar.f9654k = l.getInt(i11);
                    int i12 = a19;
                    a18 = i11;
                    oVar.f9655l = C4407u.m10106b(l.getInt(i12));
                    a17 = i10;
                    int i13 = a3;
                    int i14 = a20;
                    oVar.f9656m = l.getLong(i14);
                    a20 = i14;
                    int i15 = a21;
                    oVar.f9657n = l.getLong(i15);
                    a21 = i15;
                    int i16 = a22;
                    oVar.f9658o = l.getLong(i16);
                    a22 = i16;
                    int i17 = i12;
                    int i18 = a23;
                    oVar.f9659p = l.getLong(i18);
                    int i19 = a24;
                    oVar.f9660q = l.getInt(i19) != 0;
                    int i20 = a25;
                    a24 = i19;
                    oVar.f9661r = C4407u.m10108d(l.getInt(i20));
                    oVar.f9653j = cVar;
                    arrayList.add(oVar);
                    a25 = i20;
                    a23 = i18;
                    a13 = i7;
                    a9 = i2;
                    a11 = i3;
                    a = i4;
                    a2 = i5;
                    int i21 = i13;
                    a19 = i17;
                    a3 = i21;
                }
                l.close();
                d0Var.release();
                return arrayList;
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

    /* renamed from: f */
    public final WorkInfo$State mo14330f(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT state FROM workspec WHERE id=?");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        this.f9664a.mo11973b();
        WorkInfo$State workInfo$State = null;
        Cursor l = this.f9664a.mo11983l(d);
        try {
            if (l.moveToFirst()) {
                workInfo$State = C4407u.m10109e(l.getInt(0));
            }
            return workInfo$State;
        } finally {
            l.close();
            d.release();
        }
    }

    /* renamed from: g */
    public final ArrayList mo14331g(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        this.f9664a.mo11973b();
        Cursor l = this.f9664a.mo11983l(d);
        try {
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                arrayList.add(l.getString(0));
            }
            return arrayList;
        } finally {
            l.close();
            d.release();
        }
    }

    /* renamed from: h */
    public final ArrayList mo14332h(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        this.f9664a.mo11973b();
        Cursor l = this.f9664a.mo11983l(d);
        try {
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                arrayList.add(l.getString(0));
            }
            return arrayList;
        } finally {
            l.close();
            d.release();
        }
    }

    /* renamed from: i */
    public final C4391o mo14333i(String str) {
        C3226d0 d0Var;
        C4391o oVar;
        String str2 = str;
        C3226d0 d = C3226d0.m7877d(1, "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?");
        if (str2 == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str2);
        }
        this.f9664a.mo11973b();
        Cursor l = this.f9664a.mo11983l(d);
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
            int a11 = C0016c.m97a(l, "worker_class_name");
            int a12 = C0016c.m97a(l, "input_merger_class_name");
            int a13 = C0016c.m97a(l, "input");
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
                if (l.moveToFirst()) {
                    String string = l.getString(a9);
                    String string2 = l.getString(a11);
                    int i = a25;
                    C3376c cVar = new C3376c();
                    cVar.f7882a = C4407u.m10107c(l.getInt(a));
                    cVar.f7883b = l.getInt(a2) != 0;
                    cVar.f7884c = l.getInt(a3) != 0;
                    cVar.f7885d = l.getInt(a4) != 0;
                    cVar.f7886e = l.getInt(a5) != 0;
                    cVar.f7887f = l.getLong(a6);
                    cVar.f7888g = l.getLong(a7);
                    cVar.f7889h = C4407u.m10105a(l.getBlob(a8));
                    oVar = new C4391o(string, string2);
                    oVar.f9645b = C4407u.m10109e(l.getInt(a10));
                    oVar.f9647d = l.getString(a12);
                    oVar.f9648e = C3380e.m8118a(l.getBlob(a13));
                    oVar.f9649f = C3380e.m8118a(l.getBlob(a14));
                    oVar.f9650g = l.getLong(a15);
                    oVar.f9651h = l.getLong(a16);
                    oVar.f9652i = l.getLong(a17);
                    oVar.f9654k = l.getInt(a18);
                    oVar.f9655l = C4407u.m10106b(l.getInt(a19));
                    oVar.f9656m = l.getLong(a20);
                    oVar.f9657n = l.getLong(a21);
                    oVar.f9658o = l.getLong(a22);
                    oVar.f9659p = l.getLong(a23);
                    oVar.f9660q = l.getInt(a24) != 0;
                    oVar.f9661r = C4407u.m10108d(l.getInt(i));
                    oVar.f9653j = cVar;
                } else {
                    oVar = null;
                }
                l.close();
                d0Var.release();
                return oVar;
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

    /* renamed from: j */
    public final ArrayList mo14334j(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        this.f9664a.mo11973b();
        Cursor l = this.f9664a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "id");
            int a2 = C0016c.m97a(l, "state");
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                C4391o.C4392a aVar = new C4391o.C4392a();
                aVar.f9662a = l.getString(a);
                aVar.f9663b = C4407u.m10109e(l.getInt(a2));
                arrayList.add(aVar);
            }
            return arrayList;
        } finally {
            l.close();
            d.release();
        }
    }

    /* renamed from: k */
    public final int mo14335k(String str) {
        this.f9664a.mo11973b();
        C6838e a = this.f9669f.mo12028a();
        if (str == null) {
            a.mo12015p0(1);
        } else {
            a.mo12011Y(1, str);
        }
        this.f9664a.mo11974c();
        try {
            int s = a.mo18972s();
            this.f9664a.mo11984m();
            return s;
        } finally {
            this.f9664a.mo11980i();
            this.f9669f.mo12030c(a);
        }
    }

    /* renamed from: l */
    public final int mo14336l(long j, String str) {
        this.f9664a.mo11973b();
        C6838e a = this.f9671h.mo12028a();
        a.mo12013h0(1, j);
        if (str == null) {
            a.mo12015p0(2);
        } else {
            a.mo12011Y(2, str);
        }
        this.f9664a.mo11974c();
        try {
            int s = a.mo18972s();
            this.f9664a.mo11984m();
            return s;
        } finally {
            this.f9664a.mo11980i();
            this.f9671h.mo12030c(a);
        }
    }

    /* renamed from: m */
    public final int mo14337m(String str) {
        this.f9664a.mo11973b();
        C6838e a = this.f9670g.mo12028a();
        if (str == null) {
            a.mo12015p0(1);
        } else {
            a.mo12011Y(1, str);
        }
        this.f9664a.mo11974c();
        try {
            int s = a.mo18972s();
            this.f9664a.mo11984m();
            return s;
        } finally {
            this.f9664a.mo11980i();
            this.f9670g.mo12030c(a);
        }
    }

    /* renamed from: n */
    public final void mo14338n(String str, C3380e eVar) {
        this.f9664a.mo11973b();
        C6838e a = this.f9667d.mo12028a();
        byte[] b = C3380e.m8119b(eVar);
        if (b == null) {
            a.mo12015p0(1);
        } else {
            a.mo12014i0(1, b);
        }
        if (str == null) {
            a.mo12015p0(2);
        } else {
            a.mo12011Y(2, str);
        }
        this.f9664a.mo11974c();
        try {
            a.mo18972s();
            this.f9664a.mo11984m();
        } finally {
            this.f9664a.mo11980i();
            this.f9667d.mo12030c(a);
        }
    }

    /* renamed from: o */
    public final void mo14339o(long j, String str) {
        this.f9664a.mo11973b();
        C6838e a = this.f9668e.mo12028a();
        a.mo12013h0(1, j);
        if (str == null) {
            a.mo12015p0(2);
        } else {
            a.mo12011Y(2, str);
        }
        this.f9664a.mo11974c();
        try {
            a.mo18972s();
            this.f9664a.mo11984m();
        } finally {
            this.f9664a.mo11980i();
            this.f9668e.mo12030c(a);
        }
    }

    /* renamed from: p */
    public final int mo14340p(WorkInfo$State workInfo$State, String... strArr) {
        this.f9664a.mo11973b();
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE workspec SET state=");
        sb.append("?");
        sb.append(" WHERE id IN (");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("?");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        RoomDatabase roomDatabase = this.f9664a;
        roomDatabase.mo11972a();
        roomDatabase.mo11973b();
        C6838e Z = roomDatabase.f7463d.mo12025j0().mo18961Z(sb2);
        Z.mo12013h0(1, (long) C4407u.m10110f(workInfo$State));
        int i2 = 2;
        for (String str : strArr) {
            if (str == null) {
                Z.mo12015p0(i2);
            } else {
                Z.mo12011Y(i2, str);
            }
            i2++;
        }
        this.f9664a.mo11974c();
        try {
            int s = Z.mo18972s();
            this.f9664a.mo11984m();
            return s;
        } finally {
            this.f9664a.mo11980i();
        }
    }
}
