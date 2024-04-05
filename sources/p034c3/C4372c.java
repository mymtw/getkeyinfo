package p034c3;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import p112g2.C6838e;

/* renamed from: c3.c */
public final class C4372c implements C4371b {

    /* renamed from: a */
    public final RoomDatabase f9625a;

    /* renamed from: b */
    public final C4373a f9626b;

    /* renamed from: c3.c$a */
    public class C4373a extends C3242l<C4370a> {
        public C4373a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C4370a aVar = (C4370a) obj;
            String str = aVar.f9623a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            String str2 = aVar.f9624b;
            if (str2 == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str2);
            }
        }
    }

    public C4372c(RoomDatabase roomDatabase) {
        this.f9625a = roomDatabase;
        this.f9626b = new C4373a(roomDatabase);
    }

    /* renamed from: a */
    public final ArrayList mo14304a(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        this.f9625a.mo11973b();
        Cursor l = this.f9625a.mo11983l(d);
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

    /* renamed from: b */
    public final boolean mo14305b(String str) {
        boolean z = true;
        C3226d0 d = C3226d0.m7877d(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            d.mo12015p0(1);
        } else {
            d.mo12011Y(1, str);
        }
        this.f9625a.mo11973b();
        boolean z2 = false;
        Cursor l = this.f9625a.mo11983l(d);
        try {
            if (l.moveToFirst()) {
                if (l.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            l.close();
            d.release();
        }
    }
}
