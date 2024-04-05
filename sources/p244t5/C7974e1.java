package p244t5;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.android.gms.common.api.Api;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: t5.e1 */
public final class C7974e1 {

    /* renamed from: a */
    public static final long f17455a = Runtime.getRuntime().maxMemory();

    /* renamed from: a */
    public static int m15996a(int i) {
        int i2 = 1;
        if (i > 127) {
            int i3 = 1;
            while (true) {
                i >>>= 8;
                if (i == 0) {
                    break;
                }
                i3++;
            }
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: b */
    public static int m15997b(InputStream inputStream) {
        if (inputStream instanceof C7968c1) {
            return ((C7968c1) inputStream).mo20531a();
        }
        if (inputStream instanceof C7996l1) {
            return ((C7996l1) inputStream).f17484b;
        }
        if (inputStream instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream) inputStream).available();
        }
        if (inputStream instanceof FileInputStream) {
            try {
                FileChannel channel = ((FileInputStream) inputStream).getChannel();
                long size = channel != null ? channel.size() : 2147483647L;
                if (size < ParserMinimalBase.MAX_INT_L) {
                    return (int) size;
                }
            } catch (IOException unused) {
            }
        }
        long j = f17455a;
        return j > ParserMinimalBase.MAX_INT_L ? Api.BaseClientBuilder.API_PRIORITY_OTHER : (int) j;
    }

    /* renamed from: c */
    public static int m15998c(int i) {
        if (i < 31) {
            return 1;
        }
        if (i < 128) {
            return 2;
        }
        byte[] bArr = new byte[5];
        int i2 = 4;
        do {
            i >>= 7;
            i2--;
            bArr[i2] = (byte) ((i & 127) | 128);
        } while (i > 127);
        return 1 + (5 - i2);
    }
}
