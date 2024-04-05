package androidx.multidex;

import android.support.p013v4.media.C0072d;
import android.support.p013v4.media.session.PlaybackStateCompat;
import com.etsy.android.lib.config.bucketing.UnsignedInteger;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* renamed from: androidx.multidex.c */
public final class C2943c {

    /* renamed from: androidx.multidex.c$a */
    public static class C2944a {

        /* renamed from: a */
        public long f6657a;

        /* renamed from: b */
        public long f6658b;
    }

    /* renamed from: a */
    public static C2944a m6879a(RandomAccessFile randomAccessFile) throws IOException, ZipException {
        long length = randomAccessFile.length() - 22;
        long j = 0;
        if (length >= 0) {
            long j2 = length - PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH;
            if (j2 >= 0) {
                j = j2;
            }
            int reverseBytes = Integer.reverseBytes(101010256);
            do {
                randomAccessFile.seek(length);
                if (randomAccessFile.readInt() == reverseBytes) {
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    randomAccessFile.skipBytes(2);
                    C2944a aVar = new C2944a();
                    aVar.f6658b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & UnsignedInteger.INT_MASK;
                    aVar.f6657a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & UnsignedInteger.INT_MASK;
                    return aVar;
                }
                length--;
            } while (length >= j);
            throw new ZipException("End Of Central Directory signature not found");
        }
        StringBuilder h = C0072d.m201h("File too short to be a zip file: ");
        h.append(randomAccessFile.length());
        throw new ZipException(h.toString());
    }
}
