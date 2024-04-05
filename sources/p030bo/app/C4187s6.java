package p030bo.app;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

/* renamed from: bo.app.s6 */
final class C4187s6 {

    /* renamed from: a */
    public static final Charset f9298a = Charset.forName("US-ASCII");

    /* renamed from: b */
    public static final Charset f9299b = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m9611a(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                if (file2.isDirectory()) {
                    m9611a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* renamed from: a */
    public static void m9610a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
