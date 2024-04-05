package p077d1;

import android.support.p013v4.media.C0072d;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: d1.a */
public final class C6617a {

    /* renamed from: a */
    public final File f14603a;

    /* renamed from: b */
    public final File f14604b;

    /* renamed from: c */
    public final File f14605c;

    public C6617a(File file) {
        this.f14603a = file;
        this.f14604b = new File(file.getPath() + ".new");
        this.f14605c = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public static void m12985a(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (!file.renameTo(file2)) {
            Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
        }
    }

    /* renamed from: b */
    public final FileOutputStream mo18802b() throws IOException {
        if (this.f14605c.exists()) {
            m12985a(this.f14605c, this.f14603a);
        }
        try {
            return new FileOutputStream(this.f14604b);
        } catch (FileNotFoundException unused) {
            if (this.f14604b.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.f14604b);
                } catch (FileNotFoundException e) {
                    StringBuilder h = C0072d.m201h("Failed to create new file ");
                    h.append(this.f14604b);
                    throw new IOException(h.toString(), e);
                }
            } else {
                StringBuilder h2 = C0072d.m201h("Failed to create directory for ");
                h2.append(this.f14604b);
                throw new IOException(h2.toString());
            }
        }
    }
}
