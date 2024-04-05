package p286x8;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3241k;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0016c;
import p112g2.C6838e;
import p145io.reactivex.internal.operators.completable.C19089c;

/* renamed from: x8.c */
public final class C8329c implements C8328b {

    /* renamed from: a */
    public final RoomDatabase f18284a;

    /* renamed from: b */
    public final C8330a f18285b;

    /* renamed from: c */
    public final C8331b f18286c;

    /* renamed from: x8.c$a */
    public class C8330a extends C3242l<C8327a> {
        public C8330a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `adClicks` (`id`,`loggingKey`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C8327a aVar = (C8327a) obj;
            eVar.mo12013h0(1, (long) aVar.f18282a);
            String str = aVar.f18283b;
            if (str == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str);
            }
        }
    }

    /* renamed from: x8.c$b */
    public class C8331b extends C3241k<C8327a> {
        public C8331b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM `adClicks` WHERE `id` = ?";
        }

        /* renamed from: d */
        public final void mo12035d(C6838e eVar, Object obj) {
            eVar.mo12013h0(1, (long) ((C8327a) obj).f18282a);
        }
    }

    public C8329c(RoomDatabase roomDatabase) {
        this.f18284a = roomDatabase;
        this.f18285b = new C8330a(roomDatabase);
        this.f18286c = new C8331b(roomDatabase);
    }

    /* renamed from: a */
    public final void mo20913a(List<C8327a> list) {
        this.f18284a.mo11973b();
        this.f18284a.mo11974c();
        try {
            this.f18286c.mo12036e(list);
            this.f18284a.mo11984m();
        } finally {
            this.f18284a.mo11980i();
        }
    }

    /* renamed from: b */
    public final C19089c mo20914b(C8327a aVar) {
        return new C19089c(new C8332d(this, aVar));
    }

    /* renamed from: c */
    public final ArrayList mo20915c() {
        C3226d0 d = C3226d0.m7877d(1, "SELECT * FROM adClicks LIMIT ?");
        d.mo12013h0(1, (long) 1000);
        this.f18284a.mo11973b();
        Cursor l = this.f18284a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "id");
            int a2 = C0016c.m97a(l, "loggingKey");
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                arrayList.add(new C8327a(l.getInt(a), l.isNull(a2) ? null : l.getString(a2)));
            }
            return arrayList;
        } finally {
            l.close();
            d.release();
        }
    }
}
