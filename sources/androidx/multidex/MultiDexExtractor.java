package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.p013v4.media.C0069a;
import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.PlaybackStateCompat;
import android.util.Log;
import androidx.appcompat.widget.C0326j;
import androidx.multidex.C2943c;
import com.etsy.android.lib.models.ResponseConstants;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public final class MultiDexExtractor implements Closeable {

    /* renamed from: b */
    public final File f6649b;

    /* renamed from: c */
    public final long f6650c;

    /* renamed from: d */
    public final File f6651d;

    /* renamed from: e */
    public final RandomAccessFile f6652e;

    /* renamed from: f */
    public final FileChannel f6653f;

    /* renamed from: g */
    public final FileLock f6654g;

    public static class ExtractedDex extends File {
        public long crc = -1;

        public ExtractedDex(File file, String str) {
            super(file, str);
        }
    }

    public MultiDexExtractor(File file, File file2) throws IOException {
        StringBuilder h = C0072d.m201h("MultiDexExtractor(");
        h.append(file.getPath());
        h.append(", ");
        h.append(file2.getPath());
        h.append(")");
        Log.i("MultiDex", h.toString());
        this.f6649b = file;
        this.f6651d = file2;
        this.f6650c = m6869d(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f6652e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f6653f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f6654g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e) {
                e = e;
                m6867a(this.f6653f);
                throw e;
            } catch (RuntimeException e2) {
                e = e2;
                m6867a(this.f6653f);
                throw e;
            } catch (Error e3) {
                e = e3;
                m6867a(this.f6653f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            m6867a(this.f6652e);
            throw e4;
        }
    }

    /* renamed from: a */
    public static void m6867a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e) {
            Log.w("MultiDex", "Failed to close resource", e);
        }
    }

    /* renamed from: b */
    public static void m6868b(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        ZipOutputStream zipOutputStream;
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(C0326j.m864i("tmp-", str), ".zip", file.getParentFile());
        StringBuilder h = C0072d.m201h("Extracting ");
        h.append(createTempFile.getPath());
        Log.i("MultiDex", h.toString());
        try {
            zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[PrimitiveArrayBuilder.SMALL_CHUNK_SIZE];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    m6867a(inputStream);
                    createTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } catch (Throwable th) {
            m6867a(inputStream);
            createTempFile.delete();
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: d */
    public static long m6869d(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            C2943c.C2944a a = C2943c.m6879a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j = a.f6658b;
            randomAccessFile.seek(a.f6657a);
            int min = (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j);
            byte[] bArr = new byte[PrimitiveArrayBuilder.SMALL_CHUNK_SIZE];
            int read = randomAccessFile.read(bArr, 0, min);
            while (true) {
                if (read == -1) {
                    break;
                }
                crc32.update(bArr, 0, read);
                j -= (long) read;
                if (j == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(PlaybackStateCompat.ACTION_PREPARE, j));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* renamed from: h */
    public static void m6870h(Context context, long j, long j2, ArrayList arrayList) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(ResponseConstants.TIMESTAMP, j);
        edit.putLong("crc", j2);
        edit.putInt("dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i = 2;
        while (it.hasNext()) {
            ExtractedDex extractedDex = (ExtractedDex) it.next();
            edit.putLong("" + "dex.crc." + i, extractedDex.crc);
            edit.putLong("" + "dex.time." + i, extractedDex.lastModified());
            i++;
        }
        edit.commit();
    }

    public final void close() throws IOException {
        this.f6654g.release();
        this.f6653f.close();
        this.f6652e.close();
    }

    /* renamed from: e */
    public final ArrayList mo10933e(Context context, boolean z) throws IOException {
        ArrayList arrayList;
        ArrayList arrayList2;
        StringBuilder h = C0072d.m201h("MultiDexExtractor.load(");
        h.append(this.f6649b.getPath());
        h.append(", ");
        h.append(z);
        h.append(", ");
        h.append("");
        h.append(")");
        Log.i("MultiDex", h.toString());
        if (this.f6654g.isValid()) {
            if (!z) {
                File file = this.f6649b;
                long j = this.f6650c;
                SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
                long j2 = sharedPreferences.getLong(ResponseConstants.TIMESTAMP, -1);
                long lastModified = file.lastModified();
                if (lastModified == -1) {
                    lastModified--;
                }
                if (!((j2 == lastModified && sharedPreferences.getLong("crc", -1) == j) ? false : true)) {
                    try {
                        arrayList = mo10934f(context);
                    } catch (IOException e) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e);
                        arrayList2 = mo10935g();
                        long lastModified2 = this.f6649b.lastModified();
                        if (lastModified2 == -1) {
                            lastModified2--;
                        }
                        m6870h(context, lastModified2, this.f6650c, arrayList2);
                    }
                    StringBuilder h2 = C0072d.m201h("load found ");
                    h2.append(arrayList.size());
                    h2.append(" secondary dex files");
                    Log.i("MultiDex", h2.toString());
                    return arrayList;
                }
            }
            if (z) {
                Log.i("MultiDex", "Forced extraction must be performed.");
            } else {
                Log.i("MultiDex", "Detected that extraction must be performed.");
            }
            arrayList2 = mo10935g();
            long lastModified3 = this.f6649b.lastModified();
            if (lastModified3 == -1) {
                lastModified3--;
            }
            m6870h(context, lastModified3, this.f6650c, arrayList2);
            arrayList = arrayList2;
            StringBuilder h22 = C0072d.m201h("load found ");
            h22.append(arrayList.size());
            h22.append(" secondary dex files");
            Log.i("MultiDex", h22.toString());
            return arrayList;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }

    /* renamed from: f */
    public final ArrayList mo10934f(Context context) throws IOException {
        MultiDexExtractor multiDexExtractor = this;
        Log.i("MultiDex", "loading existing secondary dex files");
        String str = multiDexExtractor.f6649b.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i = sharedPreferences.getInt("dex.number", 1);
        ArrayList arrayList = new ArrayList(i - 1);
        int i2 = 2;
        while (i2 <= i) {
            ExtractedDex extractedDex = new ExtractedDex(multiDexExtractor.f6651d, C0069a.m175f(str, i2, ".zip"));
            if (extractedDex.isFile()) {
                extractedDex.crc = m6869d(extractedDex);
                long j = sharedPreferences.getLong("" + "dex.crc." + i2, -1);
                long j2 = sharedPreferences.getLong("" + "dex.time." + i2, -1);
                long lastModified = extractedDex.lastModified();
                if (j2 == lastModified) {
                    String str2 = str;
                    if (j == extractedDex.crc) {
                        arrayList.add(extractedDex);
                        i2++;
                        multiDexExtractor = this;
                        str = str2;
                    }
                }
                throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + "" + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + extractedDex.crc);
            }
            StringBuilder h = C0072d.m201h("Missing extracted secondary dex file '");
            h.append(extractedDex.getPath());
            h.append("'");
            throw new IOException(h.toString());
        }
        return arrayList;
    }

    /* renamed from: g */
    public final ArrayList mo10935g() throws IOException {
        ExtractedDex extractedDex;
        boolean z;
        String str = this.f6649b.getName() + ".classes";
        File[] listFiles = this.f6651d.listFiles(new C2942b());
        if (listFiles == null) {
            StringBuilder h = C0072d.m201h("Failed to list secondary dex dir content (");
            h.append(this.f6651d.getPath());
            h.append(").");
            Log.w("MultiDex", h.toString());
        } else {
            for (File file : listFiles) {
                StringBuilder h2 = C0072d.m201h("Trying to delete old file ");
                h2.append(file.getPath());
                h2.append(" of size ");
                h2.append(file.length());
                Log.i("MultiDex", h2.toString());
                if (!file.delete()) {
                    StringBuilder h3 = C0072d.m201h("Failed to delete old file ");
                    h3.append(file.getPath());
                    Log.w("MultiDex", h3.toString());
                } else {
                    StringBuilder h4 = C0072d.m201h("Deleted old file ");
                    h4.append(file.getPath());
                    Log.i("MultiDex", h4.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f6649b);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                extractedDex = new ExtractedDex(this.f6651d, str + i + ".zip");
                arrayList.add(extractedDex);
                Log.i("MultiDex", "Extraction is needed for file " + extractedDex);
                int i2 = 0;
                z = false;
                while (i2 < 3 && !z) {
                    i2++;
                    m6868b(zipFile, entry, extractedDex, str);
                    extractedDex.crc = m6869d(extractedDex);
                    z = true;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(extractedDex.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(extractedDex.length());
                    sb.append(" - crc: ");
                    sb.append(extractedDex.crc);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                }
                if (z) {
                    i++;
                    entry = zipFile.getEntry("classes" + i + ".dex");
                } else {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            try {
                zipFile.close();
            } catch (IOException e) {
                Log.w("MultiDex", "Failed to close resource", e);
            }
            return arrayList;
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e2);
            z = false;
        } catch (Throwable th) {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
            throw th;
        }
    }
}
