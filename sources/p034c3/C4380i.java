package p034c3;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3233g0;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import p003a2.C0016c;
import p112g2.C6838e;

/* renamed from: c3.i */
public final class C4380i implements C4379h {

    /* renamed from: a */
    public final RoomDatabase f9633a;

    /* renamed from: b */
    public final C4381a f9634b;

    /* renamed from: c */
    public final C4382b f9635c;

    /* renamed from: c3.i$a */
    public class C4381a extends C3242l<C4378g> {
        public C4381a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C4378g gVar = (C4378g) obj;
            String str = gVar.f9631a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            eVar.mo12013h0(2, (long) gVar.f9632b);
        }
    }

    /* renamed from: c3.i$b */
    public class C4382b extends C3233g0 {
        public C4382b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C4380i(RoomDatabase roomDatabase) {
        this.f9633a = roomDatabase;
        this.f9634b = new C4381a(roomDatabase);
        this.f9635c = new C4382b(roomDatabase);
    }

    /* renamed from: a */
    public final C4378g mo14312a(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        this.f9633a.mo11973b();
        C4378g gVar = null;
        Cursor l = this.f9633a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "work_spec_id");
            int a2 = C0016c.m97a(l, "system_id");
            if (l.moveToFirst()) {
                gVar = new C4378g(l.getString(a), l.getInt(a2));
            }
            return gVar;
        } finally {
            l.close();
            d.release();
        }
    }

    /* renamed from: b */
    public final void mo14313b(C4378g gVar) {
        this.f9633a.mo11973b();
        this.f9633a.mo11974c();
        try {
            this.f9634b.mo12038e(gVar);
            this.f9633a.mo11984m();
        } finally {
            this.f9633a.mo11980i();
        }
    }

    /* renamed from: c */
    public final void mo14314c(String str) {
        this.f9633a.mo11973b();
        C6838e a = this.f9635c.mo12028a();
        if (str == null) {
            a.mo12015p0(1);
        } else {
            a.mo12011Y(1, str);
        }
        this.f9633a.mo11974c();
        try {
            a.mo18972s();
            this.f9633a.mo11984m();
        } finally {
            this.f9633a.mo11980i();
            this.f9635c.mo12030c(a);
        }
    }
}
