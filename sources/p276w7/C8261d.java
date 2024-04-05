package p276w7;

import android.content.Intent;
import com.google.firebase.messaging.EnhancedIntentService;
import java.io.IOException;
import java.io.OutputStream;
import p605kk.C18119c;
import p605kk.C18123g;

/* renamed from: w7.d */
public final class C8261d implements C18119c {

    /* renamed from: b */
    public Object f18097b;

    /* renamed from: c */
    public Cloneable f18098c;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Cloneable, byte[]] */
    public C8261d() {
        this.f18097b = new byte[]{48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
        this.f18098c = new byte[128];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = (byte[]) this.f18098c;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = (byte[]) this.f18097b;
            if (i < bArr2.length) {
                ((byte[]) this.f18098c)[bArr2[i]] = (byte) i;
                i++;
            } else {
                byte[] bArr3 = (byte[]) this.f18098c;
                bArr3[65] = bArr3[97];
                bArr3[66] = bArr3[98];
                bArr3[67] = bArr3[99];
                bArr3[68] = bArr3[100];
                bArr3[69] = bArr3[101];
                bArr3[70] = bArr3[102];
                return;
            }
        }
    }

    public /* synthetic */ C8261d(EnhancedIntentService enhancedIntentService, Intent intent) {
        this.f18097b = enhancedIntentService;
        this.f18098c = intent;
    }

    /* renamed from: b */
    public static boolean m16547b(char c) {
        return c == 10 || c == 13 || c == 9 || c == ' ';
    }

    /* renamed from: a */
    public final int mo20866a(String str, OutputStream outputStream) {
        int length = str.length();
        while (length > 0) {
            int i = length - 1;
            if (!m16547b(str.charAt(i))) {
                break;
            }
            length = i;
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            while (i2 < length && m16547b(str.charAt(i2))) {
                i2++;
            }
            int i4 = i2 + 1;
            byte b = ((byte[]) this.f18098c)[str.charAt(i2)];
            while (i4 < length && m16547b(str.charAt(i4))) {
                i4++;
            }
            int i5 = i4 + 1;
            byte b2 = ((byte[]) this.f18098c)[str.charAt(i4)];
            if ((b | b2) >= 0) {
                outputStream.write((b << 4) | b2);
                i3++;
                i2 = i5;
            } else {
                throw new IOException("invalid characters encountered in Hex string");
            }
        }
        return i3;
    }

    public final void onComplete(C18123g gVar) {
        ((EnhancedIntentService) this.f18097b).mo59146x83fa35aa((Intent) this.f18098c, gVar);
    }
}
