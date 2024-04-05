package androidx.work.impl;

import android.content.Context;
import androidx.room.C3222c0;
import androidx.room.C3237i;
import androidx.room.C3244n;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p003a2.C0017d;
import p003a2.C0018e;
import p034c3.C4371b;
import p034c3.C4372c;
import p034c3.C4375e;
import p034c3.C4376f;
import p034c3.C4379h;
import p034c3.C4380i;
import p034c3.C4384k;
import p034c3.C4385l;
import p034c3.C4387m;
import p034c3.C4388n;
import p034c3.C4393p;
import p034c3.C4394q;
import p034c3.C4404s;
import p034c3.C4405t;
import p112g2.C6832b;
import p124h2.C6920a;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: v */
    public static final /* synthetic */ int f7907v = 0;

    /* renamed from: o */
    public volatile C4394q f7908o;

    /* renamed from: p */
    public volatile C4372c f7909p;

    /* renamed from: q */
    public volatile C4405t f7910q;

    /* renamed from: r */
    public volatile C4380i f7911r;

    /* renamed from: s */
    public volatile C4385l f7912s;

    /* renamed from: t */
    public volatile C4388n f7913t;

    /* renamed from: u */
    public volatile C4376f f7914u;

    /* renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C3386a extends C3222c0.C3223a {
        public C3386a() {
            super(12);
        }

        /* renamed from: a */
        public final void mo12004a(C6920a aVar) {
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo18966q("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.mo18966q("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.mo18966q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.mo18966q("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo18966q("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo18966q("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.mo18966q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.mo18966q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        /* renamed from: b */
        public final void mo12005b(C6920a aVar) {
            aVar.mo18966q("DROP TABLE IF EXISTS `Dependency`");
            aVar.mo18966q("DROP TABLE IF EXISTS `WorkSpec`");
            aVar.mo18966q("DROP TABLE IF EXISTS `WorkTag`");
            aVar.mo18966q("DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar.mo18966q("DROP TABLE IF EXISTS `WorkName`");
            aVar.mo18966q("DROP TABLE IF EXISTS `WorkProgress`");
            aVar.mo18966q("DROP TABLE IF EXISTS `Preference`");
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f7907v;
            List<RoomDatabase.C3214b> list = workDatabase_Impl.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f7466g.get(i2).getClass();
                }
            }
        }

        /* renamed from: c */
        public final void mo12006c() {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f7907v;
            List<RoomDatabase.C3214b> list = workDatabase_Impl.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f7466g.get(i2).getClass();
                }
            }
        }

        /* renamed from: d */
        public final void mo12007d(C6920a aVar) {
            WorkDatabase_Impl workDatabase_Impl = WorkDatabase_Impl.this;
            int i = WorkDatabase_Impl.f7907v;
            workDatabase_Impl.f7460a = aVar;
            aVar.mo18966q("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.mo11981j(aVar);
            List<RoomDatabase.C3214b> list = WorkDatabase_Impl.this.f7466g;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f7466g.get(i2).mo11988a(aVar);
                }
            }
        }

        /* renamed from: e */
        public final void mo12008e() {
        }

        /* renamed from: f */
        public final void mo12009f(C6920a aVar) {
            C0017d.m98a(aVar);
        }

        /* renamed from: g */
        public final C3222c0.C3224b mo12010g(C6920a aVar) {
            C6920a aVar2 = aVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new C0018e.C0019a(1, "work_spec_id", "TEXT", (String) null, true, 1));
            hashMap.put("prerequisite_id", new C0018e.C0019a(2, "prerequisite_id", "TEXT", (String) null, true, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new C0018e.C0020b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new C0018e.C0020b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new C0018e.C0022d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), (ArrayList) null));
            hashSet2.add(new C0018e.C0022d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"}), (ArrayList) null));
            C0018e eVar = new C0018e("Dependency", hashMap, hashSet, hashSet2);
            C0018e a = C0018e.m99a(aVar2, "Dependency");
            if (!eVar.equals(a)) {
                return new C3222c0.C3224b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + eVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(25);
            hashMap2.put("id", new C0018e.C0019a(1, "id", "TEXT", (String) null, true, 1));
            hashMap2.put("state", new C0018e.C0019a(0, "state", "INTEGER", (String) null, true, 1));
            hashMap2.put("worker_class_name", new C0018e.C0019a(0, "worker_class_name", "TEXT", (String) null, true, 1));
            hashMap2.put("input_merger_class_name", new C0018e.C0019a(0, "input_merger_class_name", "TEXT", (String) null, false, 1));
            hashMap2.put("input", new C0018e.C0019a(0, "input", "BLOB", (String) null, true, 1));
            hashMap2.put("output", new C0018e.C0019a(0, "output", "BLOB", (String) null, true, 1));
            hashMap2.put("initial_delay", new C0018e.C0019a(0, "initial_delay", "INTEGER", (String) null, true, 1));
            hashMap2.put("interval_duration", new C0018e.C0019a(0, "interval_duration", "INTEGER", (String) null, true, 1));
            hashMap2.put("flex_duration", new C0018e.C0019a(0, "flex_duration", "INTEGER", (String) null, true, 1));
            hashMap2.put("run_attempt_count", new C0018e.C0019a(0, "run_attempt_count", "INTEGER", (String) null, true, 1));
            hashMap2.put("backoff_policy", new C0018e.C0019a(0, "backoff_policy", "INTEGER", (String) null, true, 1));
            hashMap2.put("backoff_delay_duration", new C0018e.C0019a(0, "backoff_delay_duration", "INTEGER", (String) null, true, 1));
            hashMap2.put("period_start_time", new C0018e.C0019a(0, "period_start_time", "INTEGER", (String) null, true, 1));
            hashMap2.put("minimum_retention_duration", new C0018e.C0019a(0, "minimum_retention_duration", "INTEGER", (String) null, true, 1));
            hashMap2.put("schedule_requested_at", new C0018e.C0019a(0, "schedule_requested_at", "INTEGER", (String) null, true, 1));
            hashMap2.put("run_in_foreground", new C0018e.C0019a(0, "run_in_foreground", "INTEGER", (String) null, true, 1));
            hashMap2.put("out_of_quota_policy", new C0018e.C0019a(0, "out_of_quota_policy", "INTEGER", (String) null, true, 1));
            hashMap2.put("required_network_type", new C0018e.C0019a(0, "required_network_type", "INTEGER", (String) null, false, 1));
            hashMap2.put("requires_charging", new C0018e.C0019a(0, "requires_charging", "INTEGER", (String) null, true, 1));
            hashMap2.put("requires_device_idle", new C0018e.C0019a(0, "requires_device_idle", "INTEGER", (String) null, true, 1));
            hashMap2.put("requires_battery_not_low", new C0018e.C0019a(0, "requires_battery_not_low", "INTEGER", (String) null, true, 1));
            hashMap2.put("requires_storage_not_low", new C0018e.C0019a(0, "requires_storage_not_low", "INTEGER", (String) null, true, 1));
            hashMap2.put("trigger_content_update_delay", new C0018e.C0019a(0, "trigger_content_update_delay", "INTEGER", (String) null, true, 1));
            hashMap2.put("trigger_max_content_delay", new C0018e.C0019a(0, "trigger_max_content_delay", "INTEGER", (String) null, true, 1));
            hashMap2.put("content_uri_triggers", new C0018e.C0019a(0, "content_uri_triggers", "BLOB", (String) null, false, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new C0018e.C0022d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"}), (ArrayList) null));
            hashSet4.add(new C0018e.C0022d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"}), (ArrayList) null));
            C0018e eVar2 = new C0018e("WorkSpec", hashMap2, hashSet3, hashSet4);
            C0018e a2 = C0018e.m99a(aVar2, "WorkSpec");
            if (!eVar2.equals(a2)) {
                return new C3222c0.C3224b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + eVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new C0018e.C0019a(1, "tag", "TEXT", (String) null, true, 1));
            hashMap3.put("work_spec_id", new C0018e.C0019a(2, "work_spec_id", "TEXT", (String) null, true, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new C0018e.C0020b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new C0018e.C0022d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), (ArrayList) null));
            C0018e eVar3 = new C0018e("WorkTag", hashMap3, hashSet5, hashSet6);
            C0018e a3 = C0018e.m99a(aVar2, "WorkTag");
            if (!eVar3.equals(a3)) {
                return new C3222c0.C3224b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + eVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new C0018e.C0019a(1, "work_spec_id", "TEXT", (String) null, true, 1));
            hashMap4.put("system_id", new C0018e.C0019a(0, "system_id", "INTEGER", (String) null, true, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new C0018e.C0020b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C0018e eVar4 = new C0018e("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            C0018e a4 = C0018e.m99a(aVar2, "SystemIdInfo");
            if (!eVar4.equals(a4)) {
                return new C3222c0.C3224b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + eVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put("name", new C0018e.C0019a(1, "name", "TEXT", (String) null, true, 1));
            hashMap5.put("work_spec_id", new C0018e.C0019a(2, "work_spec_id", "TEXT", (String) null, true, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new C0018e.C0020b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new C0018e.C0022d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"}), (ArrayList) null));
            C0018e eVar5 = new C0018e("WorkName", hashMap5, hashSet8, hashSet9);
            C0018e a5 = C0018e.m99a(aVar2, "WorkName");
            if (!eVar5.equals(a5)) {
                return new C3222c0.C3224b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + eVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new C0018e.C0019a(1, "work_spec_id", "TEXT", (String) null, true, 1));
            hashMap6.put("progress", new C0018e.C0019a(0, "progress", "BLOB", (String) null, true, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new C0018e.C0020b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            C0018e eVar6 = new C0018e("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            C0018e a6 = C0018e.m99a(aVar2, "WorkProgress");
            if (!eVar6.equals(a6)) {
                return new C3222c0.C3224b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + eVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new C0018e.C0019a(1, "key", "TEXT", (String) null, true, 1));
            hashMap7.put("long_value", new C0018e.C0019a(0, "long_value", "INTEGER", (String) null, false, 1));
            C0018e eVar7 = new C0018e("Preference", hashMap7, new HashSet(0), new HashSet(0));
            C0018e a7 = C0018e.m99a(aVar2, "Preference");
            if (eVar7.equals(a7)) {
                return new C3222c0.C3224b(true, (String) null);
            }
            return new C3222c0.C3224b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + eVar7 + "\n Found:\n" + a7);
        }
    }

    /* renamed from: d */
    public final C3244n mo11975d() {
        return new C3244n(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    /* renamed from: e */
    public final C6832b mo11976e(C3237i iVar) {
        C3222c0 c0Var = new C3222c0(iVar, new C3386a(), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6");
        Context context = iVar.f7521b;
        String str = iVar.f7522c;
        if (context != null) {
            return iVar.f7520a.mo18970a(new C6832b.C6834b(context, str, c0Var, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }

    /* renamed from: o */
    public final C4371b mo12852o() {
        C4372c cVar;
        if (this.f7909p != null) {
            return this.f7909p;
        }
        synchronized (this) {
            if (this.f7909p == null) {
                this.f7909p = new C4372c(this);
            }
            cVar = this.f7909p;
        }
        return cVar;
    }

    /* renamed from: p */
    public final C4375e mo12853p() {
        C4376f fVar;
        if (this.f7914u != null) {
            return this.f7914u;
        }
        synchronized (this) {
            if (this.f7914u == null) {
                this.f7914u = new C4376f(this);
            }
            fVar = this.f7914u;
        }
        return fVar;
    }

    /* renamed from: q */
    public final C4379h mo12854q() {
        C4380i iVar;
        if (this.f7911r != null) {
            return this.f7911r;
        }
        synchronized (this) {
            if (this.f7911r == null) {
                this.f7911r = new C4380i(this);
            }
            iVar = this.f7911r;
        }
        return iVar;
    }

    /* renamed from: r */
    public final C4384k mo12855r() {
        C4385l lVar;
        if (this.f7912s != null) {
            return this.f7912s;
        }
        synchronized (this) {
            if (this.f7912s == null) {
                this.f7912s = new C4385l(this);
            }
            lVar = this.f7912s;
        }
        return lVar;
    }

    /* renamed from: s */
    public final C4387m mo12856s() {
        C4388n nVar;
        if (this.f7913t != null) {
            return this.f7913t;
        }
        synchronized (this) {
            if (this.f7913t == null) {
                this.f7913t = new C4388n(this);
            }
            nVar = this.f7913t;
        }
        return nVar;
    }

    /* renamed from: t */
    public final C4393p mo12857t() {
        C4394q qVar;
        if (this.f7908o != null) {
            return this.f7908o;
        }
        synchronized (this) {
            if (this.f7908o == null) {
                this.f7908o = new C4394q(this);
            }
            qVar = this.f7908o;
        }
        return qVar;
    }

    /* renamed from: u */
    public final C4404s mo12858u() {
        C4405t tVar;
        if (this.f7910q != null) {
            return this.f7910q;
        }
        synchronized (this) {
            if (this.f7910q == null) {
                this.f7910q = new C4405t(this);
            }
            tVar = this.f7910q;
        }
        return tVar;
    }
}
