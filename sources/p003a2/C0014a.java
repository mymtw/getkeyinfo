package p003a2;

import androidx.appcompat.widget.C0326j;
import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: a2.a */
public final class C0014a {

    /* renamed from: e */
    public static final HashMap f25e = new HashMap();

    /* renamed from: a */
    public final File f26a;

    /* renamed from: b */
    public final Lock f27b;

    /* renamed from: c */
    public final boolean f28c;

    /* renamed from: d */
    public FileChannel f29d;

    public C0014a(String str, File file, boolean z) {
        Lock lock;
        File file2 = new File(file, C0326j.m864i(str, ".lck"));
        this.f26a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = f25e;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.f27b = lock;
        this.f28c = z;
    }

    /* renamed from: a */
    public final void mo33a() {
        FileChannel fileChannel = this.f29d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f27b.unlock();
    }
}
