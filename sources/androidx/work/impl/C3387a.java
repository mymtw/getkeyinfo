package androidx.work.impl;

import android.content.Context;
import android.content.SharedPreferences;
import p124h2.C6920a;
import p299z1.C8421b;

/* renamed from: androidx.work.impl.a */
public final class C3387a {

    /* renamed from: a */
    public static C3388a f7916a = new C3388a();

    /* renamed from: b */
    public static C3389b f7917b = new C3389b();

    /* renamed from: c */
    public static C3390c f7918c = new C3390c();

    /* renamed from: d */
    public static C3391d f7919d = new C3391d();

    /* renamed from: e */
    public static C3392e f7920e = new C3392e();

    /* renamed from: f */
    public static C3393f f7921f = new C3393f();

    /* renamed from: g */
    public static C3394g f7922g = new C3394g();

    /* renamed from: androidx.work.impl.a$a */
    public class C3388a extends C8421b {
        public C3388a() {
            super(1, 2);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo18966q("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.mo18966q("DROP TABLE IF EXISTS alarmInfo");
            aVar.mo18966q("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* renamed from: androidx.work.impl.a$b */
    public class C3389b extends C8421b {
        public C3389b() {
            super(3, 4);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            aVar.mo18966q("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
        }
    }

    /* renamed from: androidx.work.impl.a$c */
    public class C3390c extends C8421b {
        public C3390c() {
            super(4, 5);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            aVar.mo18966q("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            aVar.mo18966q("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* renamed from: androidx.work.impl.a$d */
    public class C3391d extends C8421b {
        public C3391d() {
            super(6, 7);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* renamed from: androidx.work.impl.a$e */
    public class C3392e extends C8421b {
        public C3392e() {
            super(7, 8);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            aVar.mo18966q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* renamed from: androidx.work.impl.a$f */
    public class C3393f extends C8421b {
        public C3393f() {
            super(8, 9);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            aVar.mo18966q("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$g */
    public class C3394g extends C8421b {
        public C3394g() {
            super(11, 12);
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            aVar.mo18966q("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* renamed from: androidx.work.impl.a$h */
    public static class C3395h extends C8421b {

        /* renamed from: c */
        public final Context f7923c;

        public C3395h(Context context, int i, int i2) {
            super(i, i2);
            this.f7923c = context;
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            if (this.f18439b >= 10) {
                aVar.mo18958E("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.f7923c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: androidx.work.impl.a$i */
    public static class C3396i extends C8421b {

        /* renamed from: c */
        public final Context f7924c;

        public C3396i(Context context) {
            super(9, 10);
            this.f7924c = context;
        }

        /* renamed from: a */
        public final void mo12859a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.f7924c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j = 0;
                long j2 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j = 1;
                }
                aVar.mo18964o();
                try {
                    aVar.mo18958E("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j2)});
                    aVar.mo18958E("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j)});
                    sharedPreferences.edit().clear().apply();
                    aVar.mo18957D();
                } finally {
                    aVar.mo18960K();
                }
            }
            SharedPreferences sharedPreferences2 = this.f7924c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i2 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                aVar.mo18964o();
                try {
                    aVar.mo18958E("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                    aVar.mo18958E("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                    sharedPreferences2.edit().clear().apply();
                    aVar.mo18957D();
                } finally {
                    aVar.mo18960K();
                }
            }
        }
    }
}
