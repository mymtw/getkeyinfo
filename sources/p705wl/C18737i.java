package p705wl;

import androidx.appcompat.widget.C0326j;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: wl.i */
public final class C18737i {

    /* renamed from: a */
    public static final CopyOnWriteArrayList<C18736h> f41508a = new CopyOnWriteArrayList<>();

    /* renamed from: a */
    public static C18736h m31599a(String str) throws GeneralSecurityException {
        Iterator<C18736h> it = f41508a.iterator();
        while (it.hasNext()) {
            C18736h next = it.next();
            if (next.mo46857a(str)) {
                return next;
            }
        }
        throw new GeneralSecurityException(C0326j.m864i("No KMS client does support: ", str));
    }
}
