package androidx.room;

import java.util.ArrayList;
import java.util.Iterator;
import p112g2.C6838e;

/* renamed from: androidx.room.l */
public abstract class C3242l<T> extends C3233g0 {
    public C3242l(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* renamed from: d */
    public abstract void mo12037d(C6838e eVar, T t);

    /* renamed from: e */
    public final void mo12038e(T t) {
        C6838e a = mo12028a();
        try {
            mo12037d(a, t);
            a.mo18971W();
        } finally {
            mo12030c(a);
        }
    }

    /* renamed from: f */
    public final void mo12039f(ArrayList arrayList) {
        C6838e a = mo12028a();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                mo12037d(a, it.next());
                a.mo18971W();
            }
        } finally {
            mo12030c(a);
        }
    }
}
