package p365hg;

import android.support.p013v4.media.C0072d;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.facebook.LoggingBehavior;
import com.google.android.gms.common.api.Api;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.PriorityQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19446a;
import kotlin.text.C19457k;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import p365hg.C12845c0;
import p365hg.C12914w;
import p453tf.C13418j;

/* renamed from: hg.o */
public final class C12889o {

    /* renamed from: h */
    public static final AtomicLong f28426h = new AtomicLong();

    /* renamed from: a */
    public final File f28427a;

    /* renamed from: b */
    public boolean f28428b;

    /* renamed from: c */
    public final ReentrantLock f28429c;

    /* renamed from: d */
    public final Condition f28430d;

    /* renamed from: e */
    public final AtomicLong f28431e;

    /* renamed from: f */
    public final String f28432f;

    /* renamed from: g */
    public final C12895d f28433g;

    /* renamed from: hg.o$a */
    public static final class C12890a {

        /* renamed from: a */
        public static final /* synthetic */ int f28434a = 0;

        /* renamed from: hg.o$a$a */
        public static final class C12891a implements FilenameFilter {

            /* renamed from: a */
            public static final C12891a f28435a = new C12891a();

            public final boolean accept(File file, String str) {
                C19383o.m32796f(str, "filename");
                return !C19457k.m33025c1(str, "buffer", false);
            }
        }

        /* renamed from: hg.o$a$b */
        public static final class C12892b implements FilenameFilter {

            /* renamed from: a */
            public static final C12892b f28436a = new C12892b();

            public final boolean accept(File file, String str) {
                C19383o.m32796f(str, "filename");
                return C19457k.m33025c1(str, "buffer", false);
            }
        }
    }

    /* renamed from: hg.o$b */
    public static final class C12893b extends OutputStream {

        /* renamed from: b */
        public final OutputStream f28437b;

        /* renamed from: c */
        public final C12897f f28438c;

        public C12893b(FileOutputStream fileOutputStream, C12901q qVar) {
            this.f28437b = fileOutputStream;
            this.f28438c = qVar;
        }

        public final void close() throws IOException {
            try {
                this.f28437b.close();
            } finally {
                this.f28438c.onClose();
            }
        }

        public final void flush() throws IOException {
            this.f28437b.flush();
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            C19383o.m32797g(bArr, "buffer");
            this.f28437b.write(bArr, i, i2);
        }

        public final void write(byte[] bArr) throws IOException {
            C19383o.m32797g(bArr, "buffer");
            this.f28437b.write(bArr);
        }

        public final void write(int i) throws IOException {
            this.f28437b.write(i);
        }
    }

    /* renamed from: hg.o$d */
    public static final class C12895d {
    }

    /* renamed from: hg.o$e */
    public static final class C12896e implements Comparable<C12896e> {

        /* renamed from: b */
        public final long f28441b;

        /* renamed from: c */
        public final File f28442c;

        public C12896e(File file) {
            this.f28442c = file;
            this.f28441b = file.lastModified();
        }

        /* renamed from: a */
        public final int compareTo(C12896e eVar) {
            C19383o.m32797g(eVar, "another");
            long j = this.f28441b;
            long j2 = eVar.f28441b;
            if (j < j2) {
                return -1;
            }
            if (j > j2) {
                return 1;
            }
            return this.f28442c.compareTo(eVar.f28442c);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof C12896e) && compareTo((C12896e) obj) == 0;
        }

        public final int hashCode() {
            return ((this.f28442c.hashCode() + 1073) * 37) + ((int) (this.f28441b % ((long) Api.BaseClientBuilder.API_PRIORITY_OTHER)));
        }
    }

    /* renamed from: hg.o$f */
    public interface C12897f {
        void onClose();
    }

    /* renamed from: hg.o$g */
    public static final class C12898g {
        /* renamed from: a */
        public static JSONObject m20615a(BufferedInputStream bufferedInputStream) throws IOException {
            if (bufferedInputStream.read() != 0) {
                return null;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < 3; i3++) {
                int read = bufferedInputStream.read();
                if (read == -1) {
                    C12845c0.C12846a aVar = C12845c0.f28334f;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    AtomicLong atomicLong = C12889o.f28426h;
                    aVar.mo45626b(loggingBehavior, "o", "readHeader: stream.read returned -1 while reading header size");
                    return null;
                }
                i2 = (i2 << 8) + (read & 255);
            }
            byte[] bArr = new byte[i2];
            while (i < i2) {
                int read2 = bufferedInputStream.read(bArr, i, i2 - i);
                if (read2 < 1) {
                    C12845c0.C12846a aVar2 = C12845c0.f28334f;
                    LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                    AtomicLong atomicLong2 = C12889o.f28426h;
                    StringBuilder h = C0072d.m201h("readHeader: stream.read stopped at ");
                    h.append(Integer.valueOf(i));
                    h.append(" when expected ");
                    h.append(i2);
                    aVar2.mo45626b(loggingBehavior2, "o", h.toString());
                    return null;
                }
                i += read2;
            }
            try {
                Object nextValue = new JSONTokener(new String(bArr, C19446a.f43373b)).nextValue();
                if (nextValue instanceof JSONObject) {
                    return (JSONObject) nextValue;
                }
                C12845c0.C12846a aVar3 = C12845c0.f28334f;
                LoggingBehavior loggingBehavior3 = LoggingBehavior.CACHE;
                AtomicLong atomicLong3 = C12889o.f28426h;
                aVar3.mo45626b(loggingBehavior3, "o", "readHeader: expected JSONObject, got " + nextValue.getClass().getCanonicalName());
                return null;
            } catch (JSONException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public C12889o(String str, C12895d dVar) {
        File[] listFiles;
        C19383o.m32797g(str, "tag");
        this.f28432f = str;
        this.f28433g = dVar;
        String str2 = C13418j.f29381a;
        C12879l0.m20603g();
        C12835b0<File> b0Var = C13418j.f29390j;
        if (b0Var != null) {
            CountDownLatch countDownLatch = b0Var.f28331b;
            if (countDownLatch != null) {
                try {
                    countDownLatch.await();
                } catch (InterruptedException unused) {
                }
            }
            File file = new File((File) b0Var.f28330a, this.f28432f);
            this.f28427a = file;
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f28429c = reentrantLock;
            this.f28430d = reentrantLock.newCondition();
            this.f28431e = new AtomicLong(0);
            if ((file.mkdirs() || file.isDirectory()) && (listFiles = file.listFiles(C12890a.C12892b.f28436a)) != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
                return;
            }
            return;
        }
        C19383o.m32805o("cacheDir");
        throw null;
    }

    /* renamed from: a */
    public static final void m20611a(C12889o oVar) {
        PriorityQueue priorityQueue;
        long j;
        C12889o oVar2 = oVar;
        ReentrantLock reentrantLock = oVar2.f28429c;
        reentrantLock.lock();
        int i = 0;
        try {
            oVar2.f28428b = false;
            C19394m mVar = C19394m.f43287a;
            C12845c0.f28334f.mo45626b(LoggingBehavior.CACHE, "o", "trim started");
            PriorityQueue priorityQueue2 = new PriorityQueue();
            File file = oVar2.f28427a;
            int i2 = C12890a.f28434a;
            File[] listFiles = file.listFiles(C12890a.C12891a.f28435a);
            long j2 = 0;
            if (listFiles != null) {
                try {
                    int length = listFiles.length;
                    j = 0;
                    while (i < length) {
                        File file2 = listFiles[i];
                        C19383o.m32796f(file2, ResponseConstants.FILE);
                        C12896e eVar = new C12896e(file2);
                        priorityQueue2.add(eVar);
                        C12845c0.C12846a aVar = C12845c0.f28334f;
                        LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                        StringBuilder sb = new StringBuilder();
                        sb.append("  trim considering time=");
                        PriorityQueue priorityQueue3 = priorityQueue2;
                        sb.append(Long.valueOf(eVar.f28441b));
                        sb.append(" name=");
                        sb.append(eVar.f28442c.getName());
                        aVar.mo45626b(loggingBehavior, "o", sb.toString());
                        j2 += file2.length();
                        j++;
                        i++;
                        C12889o oVar3 = oVar;
                        priorityQueue2 = priorityQueue3;
                    }
                    priorityQueue = priorityQueue2;
                    oVar2 = oVar;
                } catch (Throwable th) {
                    th = th;
                    oVar2 = oVar;
                    ReentrantLock reentrantLock2 = oVar2.f28429c;
                    reentrantLock2.lock();
                    try {
                        oVar2.f28430d.signalAll();
                        C19394m mVar2 = C19394m.f43287a;
                        throw th;
                    } finally {
                        reentrantLock2.unlock();
                    }
                }
            } else {
                priorityQueue = priorityQueue2;
                oVar2 = oVar;
                j = 0;
            }
            while (true) {
                oVar2.f28433g.getClass();
                if (j2 <= ((long) 1048576)) {
                    oVar2.f28433g.getClass();
                    if (j <= ((long) RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE)) {
                        ReentrantLock reentrantLock3 = oVar2.f28429c;
                        reentrantLock3.lock();
                        try {
                            oVar2.f28430d.signalAll();
                            C19394m mVar3 = C19394m.f43287a;
                            return;
                        } finally {
                            reentrantLock3.unlock();
                        }
                    }
                }
                try {
                    File file3 = ((C12896e) priorityQueue.remove()).f28442c;
                    C12845c0.f28334f.mo45626b(LoggingBehavior.CACHE, "o", "  trim removing " + file3.getName());
                    j2 -= file3.length();
                    j += -1;
                    file3.delete();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    /* renamed from: b */
    public final BufferedInputStream mo45649b(String str, String str2) throws IOException {
        C19383o.m32797g(str, "key");
        File file = new File(this.f28427a, C12869i0.m20553I(str));
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file), 8192);
            try {
                JSONObject a = C12898g.m20615a(bufferedInputStream);
                if (a == null) {
                    bufferedInputStream.close();
                    return null;
                } else if (!C19383o.m32792b(a.optString("key"), str)) {
                    return null;
                } else {
                    String optString = a.optString("tag", (String) null);
                    if (str2 != null || !(!C19383o.m32792b(str2, optString))) {
                        long time = new Date().getTime();
                        C12845c0.C12846a aVar = C12845c0.f28334f;
                        LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                        aVar.mo45626b(loggingBehavior, "o", "Setting lastModified to " + Long.valueOf(time) + " for " + file.getName());
                        file.setLastModified(time);
                        return bufferedInputStream;
                    }
                    bufferedInputStream.close();
                    return null;
                }
            } finally {
                bufferedInputStream.close();
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final BufferedOutputStream mo45650c(String str, String str2) throws IOException {
        C19383o.m32797g(str, "key");
        File file = this.f28427a;
        StringBuilder h = C0072d.m201h("buffer");
        h.append(String.valueOf(f28426h.incrementAndGet()));
        File file2 = new File(file, h.toString());
        file2.delete();
        if (file2.createNewFile()) {
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new C12893b(new FileOutputStream(file2), new C12901q(this, System.currentTimeMillis(), file2, str)), 8192);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("key", str);
                    if (!C12869i0.m20546B(str2)) {
                        jSONObject.put("tag", str2);
                    }
                    String jSONObject2 = jSONObject.toString();
                    C19383o.m32796f(jSONObject2, "header.toString()");
                    byte[] bytes = jSONObject2.getBytes(C19446a.f43373b);
                    C19383o.m32796f(bytes, "(this as java.lang.String).getBytes(charset)");
                    bufferedOutputStream.write(0);
                    bufferedOutputStream.write((bytes.length >> 16) & 255);
                    bufferedOutputStream.write((bytes.length >> 8) & 255);
                    bufferedOutputStream.write((bytes.length >> 0) & 255);
                    bufferedOutputStream.write(bytes);
                    return bufferedOutputStream;
                } catch (JSONException e) {
                    C12845c0.C12846a aVar = C12845c0.f28334f;
                    LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                    aVar.mo45625a(loggingBehavior, 5, "o", "Error creating JSON header for cache file: " + e);
                    throw new IOException(e.getMessage());
                } catch (Throwable th) {
                    bufferedOutputStream.close();
                    throw th;
                }
            } catch (FileNotFoundException e2) {
                C12845c0.C12846a aVar2 = C12845c0.f28334f;
                LoggingBehavior loggingBehavior2 = LoggingBehavior.CACHE;
                aVar2.mo45625a(loggingBehavior2, 5, "o", "Error creating buffer output stream: " + e2);
                throw new IOException(e2.getMessage());
            }
        } else {
            StringBuilder h2 = C0072d.m201h("Could not create file at ");
            h2.append(file2.getAbsolutePath());
            throw new IOException(h2.toString());
        }
    }

    public final String toString() {
        StringBuilder h = C0072d.m201h("{FileLruCache: tag:");
        h.append(this.f28432f);
        h.append(" file:");
        h.append(this.f28427a.getName());
        h.append("}");
        return h.toString();
    }

    /* renamed from: hg.o$c */
    public static final class C12894c extends InputStream {

        /* renamed from: b */
        public final InputStream f28439b;

        /* renamed from: c */
        public final OutputStream f28440c;

        public C12894c(C12914w.C12915a aVar, BufferedOutputStream bufferedOutputStream) {
            this.f28439b = aVar;
            this.f28440c = bufferedOutputStream;
        }

        public final int available() throws IOException {
            return this.f28439b.available();
        }

        public final void close() throws IOException {
            try {
                this.f28439b.close();
            } finally {
                this.f28440c.close();
            }
        }

        public final void mark(int i) {
            throw new UnsupportedOperationException();
        }

        public final boolean markSupported() {
            return false;
        }

        public final int read(byte[] bArr) throws IOException {
            C19383o.m32797g(bArr, "buffer");
            int read = this.f28439b.read(bArr);
            if (read > 0) {
                this.f28440c.write(bArr, 0, read);
            }
            return read;
        }

        public final synchronized void reset() {
            throw new UnsupportedOperationException();
        }

        public final long skip(long j) throws IOException {
            int read;
            byte[] bArr = new byte[RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE];
            long j2 = 0;
            while (j2 < j && (read = read(bArr, 0, (int) Math.min(j - j2, (long) RecyclerView.C3084b0.FLAG_ADAPTER_FULLUPDATE))) >= 0) {
                j2 += (long) read;
            }
            return j2;
        }

        public final int read() throws IOException {
            int read = this.f28439b.read();
            if (read >= 0) {
                this.f28440c.write(read);
            }
            return read;
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            C19383o.m32797g(bArr, "buffer");
            int read = this.f28439b.read(bArr, i, i2);
            if (read > 0) {
                this.f28440c.write(bArr, i, read);
            }
            return read;
        }
    }
}
