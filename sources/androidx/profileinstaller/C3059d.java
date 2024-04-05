package androidx.profileinstaller;

import androidx.recyclerview.widget.RecyclerView;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p003a2.C0015b;

/* renamed from: androidx.profileinstaller.d */
public final class C3059d {
    /* renamed from: a */
    public static byte[] m7222a(byte[] bArr) throws IOException {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    /* renamed from: b */
    public static byte[] m7223b(InputStream inputStream, int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(C0015b.m88g("Not enough bytes to read: ", i));
            }
        }
        return bArr;
    }

    /* renamed from: c */
    public static byte[] m7224c(FileInputStream fileInputStream, int i, int i2) throws IOException {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[RecyclerView.C3084b0.FLAG_MOVED];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e) {
            throw new IllegalStateException(e.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }

    /* renamed from: d */
    public static long m7225d(InputStream inputStream, int i) throws IOException {
        byte[] b = m7223b(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (b[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    /* renamed from: e */
    public static int m7226e(InputStream inputStream) throws IOException {
        return (int) m7225d(inputStream, 2);
    }

    /* renamed from: f */
    public static void m7227f(ByteArrayOutputStream byteArrayOutputStream, long j, int i) throws IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: g */
    public static void m7228g(ByteArrayOutputStream byteArrayOutputStream, int i) throws IOException {
        m7227f(byteArrayOutputStream, (long) i, 2);
    }
}
