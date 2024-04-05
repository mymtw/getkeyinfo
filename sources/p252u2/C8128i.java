package p252u2;

import android.content.Context;
import androidx.work.C3422l;
import java.io.File;
import java.util.HashMap;

/* renamed from: u2.i */
public final class C8128i {

    /* renamed from: a */
    public static final String f17756a = C3422l.m8214e("WrkDbPathHelper");

    /* renamed from: b */
    public static final String[] f17757b = {"-journal", "-shm", "-wal"};

    /* renamed from: a */
    public static void m16344a(Context context) {
        String str;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            C3422l.m8213c().mo12926a(f17756a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
            HashMap hashMap = new HashMap();
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
            hashMap.put(databasePath, file);
            for (String str2 : f17757b) {
                hashMap.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        C3422l.m8213c().mo12929f(f17756a, String.format("Over-writing contents of %s", new Object[]{file3}), new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        str = String.format("Migrated %s to %s", new Object[]{file2, file3});
                    } else {
                        str = String.format("Renaming %s to %s failed", new Object[]{file2, file3});
                    }
                    C3422l.m8213c().mo12926a(f17756a, str, new Throwable[0]);
                }
            }
        }
    }
}
