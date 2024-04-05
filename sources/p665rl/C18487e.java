package p665rl;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: rl.e */
public final class C18487e {

    /* renamed from: a */
    public final long f40720a;

    /* renamed from: b */
    public final Context f40721b;

    /* renamed from: c */
    public File f40722c;

    public C18487e(Context context) throws PackageManager.NameNotFoundException {
        this.f40721b = context;
        this.f40720a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: c */
    public static void m31193c(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File c : listFiles) {
                m31193c(c);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: d */
    public static File m31194d(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: e */
    public static void m31195e(File file) throws IOException {
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                throw new IOException(valueOf.length() != 0 ? "Unable to create directory: ".concat(valueOf) : new String("Unable to create directory: "));
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: a */
    public final HashSet mo69999a() throws IOException {
        File file = new File(mo70002g(), "verified-splits");
        m31195e(file);
        HashSet hashSet = new HashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && (!file2.canWrite())) {
                    String name = file2.getName();
                    hashSet.add(new C18485c(file2, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo70000b() throws IOException {
        File f = mo70001f();
        String[] list = f.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f40720a))) {
                    File file = new File(f, str);
                    String obj = file.toString();
                    long j = this.f40720a;
                    StringBuilder sb = new StringBuilder(obj.length() + 118);
                    sb.append("FileStorage: removing directory for different version code (directory = ");
                    sb.append(obj);
                    sb.append(", current version code = ");
                    sb.append(j);
                    sb.append(")");
                    Log.d("SplitCompat", sb.toString());
                    m31193c(file);
                }
            }
        }
    }

    /* renamed from: f */
    public final File mo70001f() throws IOException {
        if (this.f40722c == null) {
            Context context = this.f40721b;
            if (context != null) {
                this.f40722c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f40722c, "splitcompat");
        m31195e(file);
        return file;
    }

    /* renamed from: g */
    public final File mo70002g() throws IOException {
        File file = new File(mo70001f(), Long.toString(this.f40720a));
        m31195e(file);
        return file;
    }
}
