package p340ea;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3233g0;
import androidx.room.C3241k;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import p003a2.C0016c;
import p112g2.C6838e;

/* renamed from: ea.c */
public final class C12659c implements C12658b {

    /* renamed from: a */
    public final RoomDatabase f27923a;

    /* renamed from: b */
    public final C12660a f27924b;

    /* renamed from: c */
    public final C12661b f27925c;

    /* renamed from: d */
    public final C12662c f27926d;

    /* renamed from: ea.c$a */
    public class C12660a extends C3242l<C12663d> {
        public C12660a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `logs` (`id`,`logAsJson`) VALUES (nullif(?, 0),?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C12663d dVar = (C12663d) obj;
            eVar.mo12013h0(1, (long) dVar.f27927a);
            String str = dVar.f27928b;
            if (str == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str);
            }
        }
    }

    /* renamed from: ea.c$b */
    public class C12661b extends C3241k<C12663d> {
        public C12661b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM `logs` WHERE `id` = ?";
        }

        /* renamed from: d */
        public final void mo12035d(C6838e eVar, Object obj) {
            eVar.mo12013h0(1, (long) ((C12663d) obj).f27927a);
        }
    }

    /* renamed from: ea.c$c */
    public class C12662c extends C3233g0 {
        public C12662c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM logs";
        }
    }

    public C12659c(RoomDatabase roomDatabase) {
        this.f27923a = roomDatabase;
        this.f27924b = new C12660a(roomDatabase);
        this.f27925c = new C12661b(roomDatabase);
        this.f27926d = new C12662c(roomDatabase);
    }

    /* renamed from: a */
    public final int mo45437a(List<C12663d> list) {
        this.f27923a.mo11973b();
        this.f27923a.mo11974c();
        try {
            int e = this.f27925c.mo12036e(list) + 0;
            this.f27923a.mo11984m();
            return e;
        } finally {
            this.f27923a.mo11980i();
        }
    }

    /* renamed from: b */
    public final int mo45438b() {
        this.f27923a.mo11973b();
        C6838e a = this.f27926d.mo12028a();
        this.f27923a.mo11974c();
        try {
            int s = a.mo18972s();
            this.f27923a.mo11984m();
            return s;
        } finally {
            this.f27923a.mo11980i();
            this.f27926d.mo12030c(a);
        }
    }

    /* renamed from: c */
    public final ArrayList mo45439c(int i) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT * FROM logs ORDER BY id ASC LIMIT ? ");
        d.mo12013h0(1, (long) i);
        this.f27923a.mo11973b();
        Cursor l = this.f27923a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "id");
            int a2 = C0016c.m97a(l, "logAsJson");
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                arrayList.add(new C12663d(l.getInt(a), l.isNull(a2) ? null : l.getString(a2)));
            }
            return arrayList;
        } finally {
            l.close();
            d.release();
        }
    }

    public final long count() {
        C3226d0 d = C3226d0.m7877d(0, "SELECT COUNT(*) FROM logs");
        this.f27923a.mo11973b();
        Cursor l = this.f27923a.mo11983l(d);
        try {
            return l.moveToFirst() ? l.getLong(0) : 0;
        } finally {
            l.close();
            d.release();
        }
    }

    /* renamed from: d */
    public final void mo45441d(C12663d dVar) {
        this.f27923a.mo11973b();
        this.f27923a.mo11974c();
        try {
            this.f27924b.mo12038e(dVar);
            this.f27923a.mo11984m();
        } finally {
            this.f27923a.mo11980i();
        }
    }
}
