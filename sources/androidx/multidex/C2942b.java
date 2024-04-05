package androidx.multidex;

import java.io.File;
import java.io.FileFilter;

/* renamed from: androidx.multidex.b */
public final class C2942b implements FileFilter {
    public final boolean accept(File file) {
        return !file.getName().equals("MultiDex.lock");
    }
}
