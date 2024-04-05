package com.bugsnag.android;

import com.bugsnag.android.internal.C5763c;
import java.io.File;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: com.bugsnag.android.d2 */
public final class C5733d2 extends C5726c1 {

    /* renamed from: h */
    public static final C5734a f12208h = new C5734a();

    /* renamed from: com.bugsnag.android.d2$a */
    public class C5734a implements Comparator<File> {
        public final int compare(Object obj, Object obj2) {
            File file = (File) obj;
            File file2 = (File) obj2;
            if (file == null && file2 == null) {
                return 0;
            }
            if (file == null) {
                return 1;
            }
            if (file2 == null) {
                return -1;
            }
            return file.getName().compareTo(file2.getName());
        }
    }

    public C5733d2(C5763c cVar, C5816o1 o1Var) {
        super(new File(cVar.f12334x.getValue(), "bugsnag-sessions"), cVar.f12332v, f12208h, o1Var, (C5744f1) null);
    }

    /* renamed from: e */
    public final String mo16493e(Object obj) {
        return UUID.randomUUID().toString() + System.currentTimeMillis() + "_v2.json";
    }
}
