package com.facebook.login;

import android.support.p013v4.media.C0069a;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C19324q;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.random.Random;
import kotlin.text.C19459m;
import kotlin.text.Regex;
import org.apache.commons.lang3.ClassUtils;
import p628nj.C18263b;
import p753kq.C19857l;
import p764pq.C20051c;
import p764pq.C20057i;

/* renamed from: com.facebook.login.b */
public final class C12308b {

    /* renamed from: a */
    public final Set<String> f27428a;

    /* renamed from: b */
    public final String f27429b;

    public C12308b(List list) {
        ArrayList arrayList;
        boolean z;
        HashSet hashSet;
        String e = C0069a.m174e("UUID.randomUUID().toString()");
        C20057i iVar = new C20057i(43, 128);
        Random.Default defaultR = Random.Default;
        C19383o.m32797g(defaultR, "random");
        try {
            int i0 = C18263b.m30847i0(defaultR, iVar);
            C20051c cVar = new C20051c('a', 'z');
            C20051c cVar2 = new C20051c('A', 'Z');
            if (cVar instanceof Collection) {
                arrayList = C19327t.m32650f1(cVar2, (Collection) cVar);
            } else {
                arrayList = new ArrayList();
                C19324q.m32628J0(cVar, arrayList);
                C19324q.m32628J0(cVar2, arrayList);
            }
            ArrayList g1 = C19327t.m32651g1(C19327t.m32651g1(C19327t.m32651g1(C19327t.m32651g1(C19327t.m32650f1(new C20051c('0', '9'), arrayList), '-'), Character.valueOf(ClassUtils.PACKAGE_SEPARATOR_CHAR)), '_'), '~');
            ArrayList arrayList2 = new ArrayList(i0);
            boolean z2 = false;
            for (int i = 0; i < i0; i++) {
                arrayList2.add(Character.valueOf(((Character) C19327t.m32652h1(g1, Random.Default)).charValue()));
            }
            String Z0 = C19327t.m32644Z0(arrayList2, "", (String) null, (String) null, (C19857l) null, 62);
            if (e.length() == 0) {
                z = false;
            } else {
                z = !(C19459m.m33042k1(e, ' ', 0, false, 6) >= 0);
            }
            if (z) {
                if (((Z0.length() == 0) || Z0.length() < 43 || Z0.length() > 128) ? false : new Regex("^[-._~A-Za-z0-9]+$").matches(Z0)) {
                    z2 = true;
                }
            }
            if (z2) {
                if (list == null) {
                    hashSet = new HashSet();
                }
                hashSet.add(Scopes.OPEN_ID);
                Set<String> unmodifiableSet = Collections.unmodifiableSet(hashSet);
                C19383o.m32796f(unmodifiableSet, "Collections.unmodifiableSet(permissions)");
                this.f27428a = unmodifiableSet;
                this.f27429b = e;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        } catch (IllegalArgumentException e2) {
            throw new NoSuchElementException(e2.getMessage());
        }
    }
}
