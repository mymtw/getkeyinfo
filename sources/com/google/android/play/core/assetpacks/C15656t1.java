package com.google.android.play.core.assetpacks;

import com.google.android.gms.measurement.internal.C15032m3;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: com.google.android.play.core.assetpacks.t1 */
public final class C15656t1 {

    /* renamed from: b */
    public static final C15032m3 f35338b = new C15032m3("MergeSliceTaskHandler");

    /* renamed from: a */
    public final C15583b0 f35339a;

    public C15656t1(C15583b0 b0Var) {
        this.f35339a = b0Var;
    }

    /* renamed from: b */
    public static void m25465b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m25465b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new zzck("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new zzck("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else if (!file.renameTo(file2)) {
            throw new zzck("Unable to move file: ".concat(String.valueOf(file)));
        }
    }

    /* renamed from: a */
    public final void mo55489a(C15652s1 s1Var) {
        File l = this.f35339a.mo55384l((String) s1Var.f29575b, s1Var.f35329c, s1Var.f35330d, s1Var.f35331e);
        if (l.exists()) {
            C15583b0 b0Var = this.f35339a;
            int i = s1Var.f35329c;
            long j = s1Var.f35330d;
            b0Var.getClass();
            File file = new File(b0Var.mo55377c((String) s1Var.f29575b, i, j), "_packs");
            if (!file.exists()) {
                file.mkdirs();
            }
            m25465b(l, file);
            try {
                int h = this.f35339a.mo55380h((String) s1Var.f29575b, s1Var.f35329c, s1Var.f35330d);
                C15583b0 b0Var2 = this.f35339a;
                int i2 = s1Var.f35329c;
                long j2 = s1Var.f35330d;
                b0Var2.getClass();
                File file2 = new File(new File(b0Var2.mo55377c((String) s1Var.f29575b, i2, j2), "_packs"), "merge.tmp");
                Properties properties = new Properties();
                properties.put("numberOfMerges", String.valueOf(h + 1));
                file2.getParentFile().mkdirs();
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } catch (IOException e) {
                f35338b.mo52243c("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new zzck("Writing merge checkpoint failed.", e, s1Var.f29574a);
            }
        } else {
            throw new zzck(String.format("Cannot find verified files for slice %s.", new Object[]{s1Var.f35331e}), s1Var.f29574a);
        }
    }
}
