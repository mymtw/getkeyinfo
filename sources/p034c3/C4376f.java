package p034c3;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import p112g2.C6838e;

/* renamed from: c3.f */
public final class C4376f implements C4375e {

    /* renamed from: a */
    public final RoomDatabase f9629a;

    /* renamed from: b */
    public final C4377a f9630b;

    /* renamed from: c3.f$a */
    public class C4377a extends C3242l<C4374d> {
        public C4377a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C4374d dVar = (C4374d) obj;
            String str = dVar.f9627a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            Long l = dVar.f9628b;
            if (l == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12013h0(2, l.longValue());
            }
        }
    }

    public C4376f(RoomDatabase roomDatabase) {
        this.f9629a = roomDatabase;
        this.f9630b = new C4377a(roomDatabase);
    }

    /* renamed from: a */
    public final Long mo14308a(String str) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT long_value FROM Preference where `key`=?");
        d.mo12011Y(1, str);
        this.f9629a.mo11973b();
        Long l = null;
        Cursor l2 = this.f9629a.mo11983l(d);
        try {
            if (l2.moveToFirst()) {
                if (!l2.isNull(0)) {
                    l = Long.valueOf(l2.getLong(0));
                }
            }
            return l;
        } finally {
            l2.close();
            d.release();
        }
    }

    /* renamed from: b */
    public final void mo14309b(C4374d dVar) {
        this.f9629a.mo11973b();
        this.f9629a.mo11974c();
        try {
            this.f9630b.mo12038e(dVar);
            this.f9629a.mo11984m();
        } finally {
            this.f9629a.mo11980i();
        }
    }
}
