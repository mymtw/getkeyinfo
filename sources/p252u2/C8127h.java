package p252u2;

import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import p124h2.C6920a;

/* renamed from: u2.h */
public final class C8127h extends RoomDatabase.C3214b {
    /* renamed from: a */
    public final void mo11988a(C6920a aVar) {
        aVar.mo18964o();
        try {
            int i = WorkDatabase.f7906n;
            aVar.mo18966q("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f7905m) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.mo18957D();
        } finally {
            aVar.mo18960K();
        }
    }
}
