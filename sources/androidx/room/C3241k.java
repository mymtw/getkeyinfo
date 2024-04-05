package androidx.room;

import p112g2.C6838e;

/* renamed from: androidx.room.k */
public abstract class C3241k<T> extends C3233g0 {
    public C3241k(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* renamed from: d */
    public abstract void mo12035d(C6838e eVar, T t);

    /* renamed from: e */
    public final int mo12036e(Iterable<? extends T> iterable) {
        C6838e a = mo12028a();
        try {
            int i = 0;
            for (Object d : iterable) {
                mo12035d(a, d);
                i += a.mo18972s();
            }
            return i;
        } finally {
            mo12030c(a);
        }
    }
}
