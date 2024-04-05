package p034c3;

import androidx.room.C3233g0;
import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;
import p112g2.C6838e;

/* renamed from: c3.n */
public final class C4388n implements C4387m {

    /* renamed from: a */
    public final RoomDatabase f9640a;

    /* renamed from: b */
    public final C4389a f9641b;

    /* renamed from: c */
    public final C4390b f9642c;

    /* renamed from: c3.n$a */
    public class C4389a extends C3233g0 {
        public C4389a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: c3.n$b */
    public class C4390b extends C3233g0 {
        public C4390b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo12029b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C4388n(RoomDatabase roomDatabase) {
        this.f9640a = roomDatabase;
        new AtomicBoolean(false);
        this.f9641b = new C4389a(roomDatabase);
        this.f9642c = new C4390b(roomDatabase);
    }

    /* renamed from: a */
    public final void mo14315a(String str) {
        this.f9640a.mo11973b();
        C6838e a = this.f9641b.mo12028a();
        if (str == null) {
            a.mo12015p0(1);
        } else {
            a.mo12011Y(1, str);
        }
        this.f9640a.mo11974c();
        try {
            a.mo18972s();
            this.f9640a.mo11984m();
        } finally {
            this.f9640a.mo11980i();
            this.f9641b.mo12030c(a);
        }
    }

    /* renamed from: b */
    public final void mo14316b() {
        this.f9640a.mo11973b();
        C6838e a = this.f9642c.mo12028a();
        this.f9640a.mo11974c();
        try {
            a.mo18972s();
            this.f9640a.mo11984m();
        } finally {
            this.f9640a.mo11980i();
            this.f9642c.mo12030c(a);
        }
    }
}
