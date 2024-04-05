package p082d7;

import androidx.activity.C0114h;
import com.etsy.android.lib.conversation.MessageDraft;
import java.math.BigInteger;
import p081d6.C6665d;
import p161k6.C7205h;
import p179m5.C7336h;
import p244t5.C7959a;

/* renamed from: d7.a */
public final class C6669a {
    static {
        C7959a aVar = C6665d.f14699p0;
        C7959a aVar2 = C7205h.f15999a;
        C7959a aVar3 = C6665d.f14699p0;
        C7959a aVar4 = C6665d.f14699p0;
    }

    /* renamed from: a */
    public static String m13043a(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        C7336h hVar = new C7336h(256);
        hVar.mo19525b(byteArray, byteArray.length);
        byte[] bArr = new byte[20];
        hVar.mo19522a(20, bArr);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != 20; i++) {
            if (i > 0) {
                stringBuffer.append(MessageDraft.IMAGE_DELIMITER);
            }
            char[] cArr = C0114h.f188y;
            stringBuffer.append(cArr[(bArr[i] >>> 4) & 15]);
            stringBuffer.append(cArr[bArr[i] & 15]);
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m13044b(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        C7336h hVar = new C7336h(256);
        hVar.mo19525b(byteArray, byteArray.length);
        byte[] bArr = new byte[4];
        hVar.mo19522a(4, bArr);
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != 4; i++) {
            if (i > 0) {
                stringBuffer.append(MessageDraft.IMAGE_DELIMITER);
            }
            char[] cArr = C0114h.f188y;
            stringBuffer.append(cArr[(bArr[i] >>> 4) & 15]);
            stringBuffer.append(cArr[bArr[i] & 15]);
        }
        return stringBuffer.toString();
    }
}
