package p296y8;

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

/* renamed from: y8.c */
public final class C8402c implements C8401b {

    /* renamed from: a */
    public final RoomDatabase f18417a;

    /* renamed from: b */
    public final C8403a f18418b;

    /* renamed from: c */
    public final C8404b f18419c;

    /* renamed from: y8.c$a */
    public class C8403a extends C3242l<C8400a> {
        public C8403a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `adImpressions` (`displayLocation`,`loggingKey`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C8400a aVar = (C8400a) obj;
            String str = aVar.f18415a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            String str2 = aVar.f18416b;
            if (str2 == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str2);
            }
        }
    }

    /* renamed from: y8.c$b */
    public class C8404b extends C3241k<C8400a> {
        public C8404b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM `adImpressions` WHERE `displayLocation` = ? AND `loggingKey` = ?";
        }

        /* renamed from: d */
        public final void mo12035d(C6838e eVar, Object obj) {
            C8400a aVar = (C8400a) obj;
            String str = aVar.f18415a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            String str2 = aVar.f18416b;
            if (str2 == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str2);
            }
        }
    }

    public C8402c(RoomDatabase roomDatabase) {
        this.f18417a = roomDatabase;
        this.f18418b = new C8403a(roomDatabase);
        this.f18419c = new C8404b(roomDatabase);
    }

    /* renamed from: a */
    public final void mo20981a(List<C8400a> list) {
        this.f18417a.mo11973b();
        this.f18417a.mo11974c();
        try {
            this.f18419c.mo12036e(list);
            this.f18417a.mo11984m();
        } finally {
            this.f18417a.mo11980i();
        }
    }

    /* renamed from: b */
    public final C19089c mo20982b(C8400a aVar) {
        return new C19089c(new C8405d(this, aVar));
    }

    /* renamed from: c */
    public final ArrayList mo20983c() {
        C3226d0 d = C3226d0.m7877d(1, "SELECT * FROM adImpressions LIMIT ?");
        d.mo12013h0(1, (long) 1000);
        this.f18417a.mo11973b();
        Cursor l = this.f18417a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "displayLocation");
            int a2 = C0016c.m97a(l, "loggingKey");
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                String str = null;
                String string = l.isNull(a) ? null : l.getString(a);
                if (!l.isNull(a2)) {
                    str = l.getString(a2);
                }
                arrayList.add(new C8400a(string, str));
            }
            return arrayList;
        } finally {
            l.close();
            d.release();
        }
    }
}
