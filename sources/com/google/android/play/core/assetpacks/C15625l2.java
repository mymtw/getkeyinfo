package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.apache.commons.cli.HelpFormatter;

/* renamed from: com.google.android.play.core.assetpacks.l2 */
public final class C15625l2 {

    /* renamed from: a */
    public static final Pattern f35236a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* renamed from: a */
    public static ArrayList m25435a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] listFiles = file2.listFiles(C15621k2.f35225a);
        if (listFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[r2];
            for (File file3 : listFiles) {
                int parseInt = Integer.parseInt(file3.getName().split(HelpFormatter.DEFAULT_OPT_PREFIX)[0]);
                if (parseInt > listFiles.length || fileArr2[parseInt] != null) {
                    throw new zzck("Metadata folder ordering corrupt.");
                }
                fileArr2[parseInt] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    C15615j0 a = new C15623l0(fileInputStream).mo55445a();
                    if (a.f35199a != null) {
                        File file5 = new File(file, a.f35199a);
                        if (file5.exists()) {
                            arrayList.add(file5);
                            fileInputStream.close();
                        } else {
                            throw new zzck(String.format("Missing asset file %s during slice reconstruction.", new Object[]{file5.getCanonicalPath()}));
                        }
                    } else {
                        throw new zzck("Metadata files corrupt. Could not read local file header.");
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
        throw th;
    }
}
