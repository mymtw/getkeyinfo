package p034c3;

import androidx.room.C3242l;
import androidx.room.RoomDatabase;
import p112g2.C6838e;

/* renamed from: c3.l */
public final class C4385l implements C4384k {

    /* renamed from: a */
    public final RoomDatabase f9638a;

    /* renamed from: b */
    public final C4386a f9639b;

    /* renamed from: c3.l$a */
    public class C4386a extends C3242l<C4383j> {
        public C4386a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo12037d(C6838e eVar, Object obj) {
            C4383j jVar = (C4383j) obj;
            String str = jVar.f9636a;
            if (str == null) {
                eVar.mo12015p0(1);
            } else {
                eVar.mo12011Y(1, str);
            }
            String str2 = jVar.f9637b;
            if (str2 == null) {
                eVar.mo12015p0(2);
            } else {
                eVar.mo12011Y(2, str2);
            }
        }
    }

    public C4385l(RoomDatabase roomDatabase) {
        this.f9638a = roomDatabase;
        this.f9639b = new C4386a(roomDatabase);
    }
}
