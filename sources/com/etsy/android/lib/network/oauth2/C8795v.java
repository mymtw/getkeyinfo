package com.etsy.android.lib.network.oauth2;

import android.util.Base64;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.ArrayList;
import kotlin.collections.C19322o;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.text.C19446a;
import p753kq.C19857l;
import p764pq.C20056h;
import p764pq.C20057i;

/* renamed from: com.etsy.android.lib.network.oauth2.v */
public final class C8795v {
    /* renamed from: a */
    public static C8794u m17187a() {
        SecureRandom secureRandom = new SecureRandom();
        C20057i D0 = C19388s.m32816D0(0, secureRandom.nextInt(86) + 43);
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(D0));
        C20056h l = D0.iterator();
        while (l.f44419d) {
            l.nextInt();
            arrayList.add(Character.valueOf("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789._~-".charAt(secureRandom.nextInt(66))));
        }
        String Z0 = C19327t.m32644Z0(arrayList, "", (String) null, (String) null, (C19857l) null, 62);
        byte[] bytes = Z0.getBytes(C19446a.f43374c);
        C19383o.m32796f(bytes, "this as java.lang.String).getBytes(charset)");
        MessageDigest instance = MessageDigest.getInstance("SHA-256");
        instance.update(bytes, 0, bytes.length);
        String encodeToString = Base64.encodeToString(instance.digest(), 9);
        C19383o.m32796f(encodeToString, "encodeToString(messageDi…AFE or Base64.NO_PADDING)");
        return new C8794u(Z0, encodeToString);
    }
}
