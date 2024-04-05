package p003a2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import p124h2.C6920a;

/* renamed from: a2.d */
public final class C0017d {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m98a(C6920a aVar) {
        ArrayList arrayList = new ArrayList();
        Cursor a = aVar.mo19063a("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (a.moveToNext()) {
            try {
                arrayList.add(a.getString(0));
            } catch (Throwable th) {
                a.close();
                throw th;
            }
        }
        a.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                aVar.mo18966q("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
