package com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa;

import androidx.activity.C0114h;
import com.etsy.android.lib.conversation.MessageDraft;
import java.math.BigInteger;
import java.security.interfaces.DSAParams;
import p026b6.C3481b;
import p152j6.C7153k;
import p179m5.C7336h;
import p223r5.C7753d0;
import p244t5.C7959a;
import p267v7.C8212a;

/* renamed from: com.cardinalcommerce.dependencies.internal.bouncycastle.jcajce.provider.asymmetric.dsa.a */
public final class C6163a {
    static {
        C7959a aVar = C7153k.f15911x0;
        C7959a aVar2 = C3481b.f8104a;
        C7959a aVar3 = C7153k.f15911x0;
    }

    /* renamed from: a */
    public static String m12299a(BigInteger bigInteger, DSAParams dSAParams) {
        byte[] j = C8212a.m16503j(bigInteger.toByteArray(), dSAParams.getP().toByteArray(), dSAParams.getQ().toByteArray(), dSAParams.getG().toByteArray());
        C7336h hVar = new C7336h(256);
        hVar.mo19525b(j, j.length);
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
    public static C7753d0 m12300b(DSAParams dSAParams) {
        if (dSAParams != null) {
            return new C7753d0(dSAParams.getP(), dSAParams.getQ(), dSAParams.getG());
        }
        return null;
    }
}
