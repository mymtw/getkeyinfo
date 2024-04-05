package p417p9;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: p9.b */
public class C13194b {
    /* renamed from: a */
    public static ArrayList m20863a(Set set) {
        if (set == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new File((String) it.next()));
        }
        return arrayList;
    }
}
