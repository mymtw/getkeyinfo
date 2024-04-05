package com.google.android.play.core.assetpacks;

import android.content.Context;
import com.google.android.gms.measurement.internal.C15032m3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.assetpacks.b0 */
public final class C15583b0 {

    /* renamed from: c */
    public static final C15032m3 f35066c = new C15032m3("AssetPackStorage");

    /* renamed from: a */
    public final Context f35067a;

    /* renamed from: b */
    public final C15589c2 f35068b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14);
        timeUnit.toMillis(28);
    }

    public C15583b0(Context context, C15589c2 c2Var) {
        this.f35067a = context;
        this.f35068b = c2Var;
    }

    /* renamed from: b */
    public static long m25254b(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f35066c.mo52246f("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f35066c.mo52244d(e, "Corrupt asset pack directories.", new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: f */
    public static void m25255f(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long b = m25254b(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(b)) && !file2.getName().equals("stale.tmp")) {
                    m25256g(file2);
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m25256g(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File g : listFiles) {
                z &= m25256g(g);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo55376a(String str, int i, long j) {
        File file = new File(mo55378d(), str);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(i)) && !file2.getName().equals("stale.tmp")) {
                    m25256g(file2);
                } else if (file2.getName().equals(String.valueOf(i))) {
                    for (File file3 : file2.listFiles()) {
                        if (!file3.getName().equals(String.valueOf(j))) {
                            m25256g(file3);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final File mo55377c(String str, int i, long j) {
        return new File(new File(new File(new File(mo55378d(), "_tmp"), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: d */
    public final File mo55378d() {
        return new File(this.f35067a.getFilesDir(), "assetpacks");
    }

    /* renamed from: e */
    public final ArrayList mo55379e() {
        ArrayList arrayList = new ArrayList();
        try {
            if (mo55378d().exists()) {
                if (mo55378d().listFiles() != null) {
                    for (File file : mo55378d().listFiles()) {
                        if (!file.getCanonicalPath().equals(new File(mo55378d(), "_tmp").getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f35066c.mo52243c("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: h */
    public final int mo55380h(String str, int i, long j) throws IOException {
        File file = new File(new File(mo55377c(str, i, j), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new zzck("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new zzck("Merge checkpoint file corrupt.");
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: i */
    public final long mo55381i(String str) {
        return m25254b(new File(new File(mo55378d(), str), String.valueOf((int) m25254b(new File(mo55378d(), str), true))), true);
    }

    /* renamed from: j */
    public final File mo55382j(String str, int i, long j) {
        return new File(new File(new File(mo55378d(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: k */
    public final File mo55383k(String str, int i, long j, String str2) {
        return new File(new File(new File(mo55377c(str, i, j), "_slices"), "_unverified"), str2);
    }

    /* renamed from: l */
    public final File mo55384l(String str, int i, long j, String str2) {
        return new File(new File(new File(mo55377c(str, i, j), "_slices"), "_verified"), str2);
    }

    /* renamed from: m */
    public final String mo55385m(String str) throws IOException {
        int length;
        File file = new File(mo55378d(), str);
        if (!file.exists()) {
            f35066c.mo52242b("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f35068b.mo55388a()));
        if (!file2.exists()) {
            f35066c.mo52242b("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f35068b.mo55388a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f35066c.mo52242b("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f35068b.mo55388a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f35066c.mo52243c("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f35068b.mo55388a()));
            return null;
        }
    }

    /* renamed from: n */
    public final HashMap mo55386n() {
        HashMap hashMap = new HashMap();
        Iterator it = mo55379e().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int b = (int) m25254b(new File(mo55378d(), name), true);
            long b2 = m25254b(new File(new File(mo55378d(), name), String.valueOf(b)), true);
            if (mo55382j(name, b, b2).exists()) {
                hashMap.put(name, Long.valueOf(b2));
            }
        }
        return hashMap;
    }

    /* renamed from: o */
    public final HashMap mo55387o() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        try {
            Iterator it = mo55379e().iterator();
            while (it.hasNext()) {
                File file = (File) it.next();
                String m = mo55385m(file.getName());
                C15599f0 f0Var = null;
                if (m != null) {
                    File file2 = new File(m, "assets");
                    if (!file2.isDirectory()) {
                        f35066c.mo52243c("Failed to find assets directory: %s", file2);
                    } else {
                        f0Var = new C15599f0(0, m, file2.getCanonicalPath());
                    }
                }
                if (f0Var != null) {
                    hashMap2.put(file.getName(), f0Var);
                }
            }
        } catch (IOException e) {
            f35066c.mo52243c("Could not process directory while scanning installed packs: %s", e);
        }
        for (String str : hashMap2.keySet()) {
            hashMap.put(str, Long.valueOf(mo55381i(str)));
        }
        return hashMap;
    }
}
