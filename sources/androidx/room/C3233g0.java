package androidx.room;

import java.util.concurrent.atomic.AtomicBoolean;
import p112g2.C6838e;

/* renamed from: androidx.room.g0 */
public abstract class C3233g0 {

    /* renamed from: a */
    public final AtomicBoolean f7513a = new AtomicBoolean(false);

    /* renamed from: b */
    public final RoomDatabase f7514b;

    /* renamed from: c */
    public volatile C6838e f7515c;

    public C3233g0(RoomDatabase roomDatabase) {
        this.f7514b = roomDatabase;
    }

    /* renamed from: a */
    public final C6838e mo12028a() {
        this.f7514b.mo11972a();
        if (this.f7513a.compareAndSet(false, true)) {
            if (this.f7515c == null) {
                String b = mo12029b();
                RoomDatabase roomDatabase = this.f7514b;
                roomDatabase.mo11972a();
                roomDatabase.mo11973b();
                this.f7515c = roomDatabase.f7463d.mo12025j0().mo18961Z(b);
            }
            return this.f7515c;
        }
        String b2 = mo12029b();
        RoomDatabase roomDatabase2 = this.f7514b;
        roomDatabase2.mo11972a();
        roomDatabase2.mo11973b();
        return roomDatabase2.f7463d.mo12025j0().mo18961Z(b2);
    }

    /* renamed from: b */
    public abstract String mo12029b();

    /* renamed from: c */
    public final void mo12030c(C6838e eVar) {
        if (eVar == this.f7515c) {
            this.f7513a.set(false);
        }
    }
}
