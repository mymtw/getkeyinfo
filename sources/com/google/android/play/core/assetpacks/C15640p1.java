package com.google.android.play.core.assetpacks;

import android.util.Base64;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import p772tq.C20203a;

/* renamed from: com.google.android.play.core.assetpacks.p1 */
public final class C15640p1 {

    /* renamed from: a */
    public static final C20203a f35282a = new C20203a();

    /* renamed from: a */
    public static String m25455a(List list) throws NoSuchAlgorithmException, IOException {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable unused) {
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
        throw th;
    }
}
