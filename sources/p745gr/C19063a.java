package p745gr;

import com.etsy.android.lib.models.ResponseConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Logger;
import kotlin.jvm.internal.C19383o;
import p756lr.C19890d0;
import p756lr.C19905q;
import p756lr.C19906r;
import p756lr.C19907s;
import p756lr.C19910u;

/* renamed from: gr.a */
public final class C19063a implements C19064b {
    /* renamed from: a */
    public final void mo70545a(File file) throws IOException {
        C19383o.m32797g(file, "directory");
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            int i = 0;
            while (i < length) {
                File file2 = listFiles[i];
                C19383o.m32796f(file2, ResponseConstants.FILE);
                if (file2.isDirectory()) {
                    mo70545a(file2);
                }
                if (file2.delete()) {
                    i++;
                } else {
                    throw new IOException("failed to delete " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }

    /* renamed from: b */
    public final boolean mo70546b(File file) {
        C19383o.m32797g(file, ResponseConstants.FILE);
        return file.exists();
    }

    /* renamed from: c */
    public final C19910u mo70547c(File file) throws FileNotFoundException {
        C19383o.m32797g(file, ResponseConstants.FILE);
        try {
            Logger logger = C19907s.f43901a;
            return new C19910u(new FileOutputStream(file, true), new C19890d0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = C19907s.f43901a;
            return new C19910u(new FileOutputStream(file, true), new C19890d0());
        }
    }

    /* renamed from: d */
    public final long mo70548d(File file) {
        C19383o.m32797g(file, ResponseConstants.FILE);
        return file.length();
    }

    /* renamed from: e */
    public final C19905q mo70549e(File file) throws FileNotFoundException {
        C19383o.m32797g(file, ResponseConstants.FILE);
        Logger logger = C19907s.f43901a;
        return C19906r.m34002f(new FileInputStream(file));
    }

    /* renamed from: f */
    public final C19910u mo70550f(File file) throws FileNotFoundException {
        C19383o.m32797g(file, ResponseConstants.FILE);
        try {
            Logger logger = C19907s.f43901a;
            return new C19910u(new FileOutputStream(file, false), new C19890d0());
        } catch (FileNotFoundException unused) {
            file.getParentFile().mkdirs();
            Logger logger2 = C19907s.f43901a;
            return new C19910u(new FileOutputStream(file, false), new C19890d0());
        }
    }

    /* renamed from: g */
    public final void mo70551g(File file, File file2) throws IOException {
        C19383o.m32797g(file, ResponseConstants.FROM);
        C19383o.m32797g(file2, ResponseConstants.f19136TO);
        mo70552h(file2);
        if (!file.renameTo(file2)) {
            throw new IOException("failed to rename " + file + " to " + file2);
        }
    }

    /* renamed from: h */
    public final void mo70552h(File file) throws IOException {
        C19383o.m32797g(file, ResponseConstants.FILE);
        if (!file.delete() && file.exists()) {
            throw new IOException("failed to delete " + file);
        }
    }

    public final String toString() {
        return "FileSystem.SYSTEM";
    }
}
