package p034c3;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import p112g2.C6838e;

/* renamed from: c3.t */
public final class C4405t implements C4404s {

    /* renamed from: a */
    public final RoomDatabase f9675a;

    /* renamed from: b */
    public final C4406a f9676b;

    /* renamed from: c3.t$a */
    public class C4406a extends C3242l<C4403r> {
        public C4406a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C4403r rVar = (C4403r) obj;
            String str = rVar.f9673a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            String str2 = rVar.f9674b;
            if (str2 == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str2);
            }
        }
    }

    public C4405t(RoomDatabase roomDatabase) {
        this.f9675a = roomDatabase;
        this.f9676b = new C4406a(roomDatabase);
    }

    /* renamed from: a */
    public final ArrayList mo14341a(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        this.f9675a.mo11973b();
        Cursor l = this.f9675a.mo11983l(d);
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
}
