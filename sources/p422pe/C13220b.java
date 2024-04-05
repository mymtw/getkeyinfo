package p422pe;

import android.database.Cursor;
import androidx.room.C3226d0;
import androidx.room.C3234h;
import androidx.room.C3241k;
import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.C19340c;
import p003a2.C0016c;
import p112g2.C6838e;

/* renamed from: pe.b */
public final class C13220b implements C13219a {

    /* renamed from: a */
    public final RoomDatabase f29063a;

    /* renamed from: b */
    public final C13221a f29064b;

    /* renamed from: c */
    public final C13222b f29065c;

    /* renamed from: pe.b$a */
    public class C13221a extends C3242l<C13224c> {
        public C13221a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR REPLACE INTO `searchImpressions` (`displayLocation`,`loggingKey`,`data`) VALUES (?,?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C13224c cVar = (C13224c) obj;
            String str = cVar.f29068a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            String str2 = cVar.f29069b;
            if (str2 == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str2);
            }
            String str3 = cVar.f29070c;
            if (str3 == null) {
                eVar.mo12015p0(3);
            } else {
                eVar.mo12011Y(3, str3);
            }
        }
    }

    /* renamed from: pe.b$b */
    public class C13222b extends C3241k<C13224c> {
        public C13222b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM `searchImpressions` WHERE `displayLocation` = ? AND `loggingKey` = ? AND `data` = ?";
        }

        /* renamed from: d */
        public final void mo12035d(C6838e eVar, Object obj) {
            C13224c cVar = (C13224c) obj;
            String str = cVar.f29068a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            String str2 = cVar.f29069b;
            if (str2 == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str2);
            }
            String str3 = cVar.f29070c;
            if (str3 == null) {
                eVar.mo12015p0(3);
            } else {
                eVar.mo12011Y(3, str3);
            }
        }
    }

    /* renamed from: pe.b$c */
    public class C13223c implements Callable<Long> {

        /* renamed from: b */
        public final /* synthetic */ C13224c f29066b;

        public C13223c(C13224c cVar) {
            this.f29066b = cVar;
        }

        public final Object call() throws Exception {
            C13221a aVar;
            C6838e a;
            C13220b.this.f29063a.mo11974c();
            try {
                aVar = C13220b.this.f29064b;
                C13224c cVar = this.f29066b;
                a = aVar.mo12028a();
                aVar.mo12037d(a, cVar);
                long W = a.mo18971W();
                aVar.mo12030c(a);
                C13220b.this.f29063a.mo11984m();
                Long valueOf = Long.valueOf(W);
                C13220b.this.f29063a.mo11980i();
                return valueOf;
            } catch (Throwable th) {
                C13220b.this.f29063a.mo11980i();
                throw th;
            }
        }
    }

    public C13220b(RoomDatabase roomDatabase) {
        this.f29063a = roomDatabase;
        this.f29064b = new C13221a(roomDatabase);
        this.f29065c = new C13222b(roomDatabase);
        new AtomicBoolean(false);
    }

    /* renamed from: a */
    public final int mo45925a(List<C13224c> list) {
        this.f29063a.mo11973b();
        this.f29063a.mo11974c();
        try {
            int e = this.f29065c.mo12036e(list) + 0;
            this.f29063a.mo11984m();
            return e;
        } finally {
            this.f29063a.mo11980i();
        }
    }

    /* renamed from: b */
    public final ArrayList mo45926b(int i) {
        C3226d0 d = C3226d0.m7877d(1, "SELECT * FROM searchImpressions LIMIT ?");
        d.mo12013h0(1, (long) i);
        this.f29063a.mo11973b();
        Cursor l = this.f29063a.mo11983l(d);
        try {
            int a = C0016c.m97a(l, "displayLocation");
            int a2 = C0016c.m97a(l, "loggingKey");
            int a3 = C0016c.m97a(l, "data");
            ArrayList arrayList = new ArrayList(l.getCount());
            while (l.moveToNext()) {
                String str = null;
                String string = l.isNull(a) ? null : l.getString(a);
                String string2 = l.isNull(a2) ? null : l.getString(a2);
                if (!l.isNull(a3)) {
                    str = l.getString(a3);
                }
                arrayList.add(new C13224c(string, string2, str));
            }
            return arrayList;
        } finally {
            l.close();
            d.release();
        }
    }

    /* renamed from: c */
    public final Object mo45927c(C13224c cVar, C19340c<? super Long> cVar2) {
        return C3234h.m7896b(this.f29063a, new C13223c(cVar), cVar2);
    }
}
