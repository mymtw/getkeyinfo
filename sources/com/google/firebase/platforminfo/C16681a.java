package com.google.firebase.platforminfo;

import com.fasterxml.jackson.core.JsonPointer;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.firebase.platforminfo.a */
public final class C16681a implements C16687f {

    /* renamed from: a */
    public final String f36885a;

    /* renamed from: b */
    public final C16682b f36886b;

    public C16681a(Set<C16683c> set, C16682b bVar) {
        this.f36885a = m27651b(set);
        this.f36886b = bVar;
    }

    /* renamed from: b */
    public static String m27651b(Set<C16683c> set) {
        StringBuilder sb = new StringBuilder();
        Iterator<C16683c> it = set.iterator();
        while (it.hasNext()) {
            C16683c next = it.next();
            sb.append(next.getLibraryName());
            sb.append(JsonPointer.SEPARATOR);
            sb.append(next.getVersion());
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo59430a() {
        Set unmodifiableSet;
        Set unmodifiableSet2;
        C16682b bVar = this.f36886b;
        synchronized (bVar.f36888a) {
            unmodifiableSet = Collections.unmodifiableSet(bVar.f36888a);
        }
        if (unmodifiableSet.isEmpty()) {
            return this.f36885a;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f36885a);
        sb.append(' ');
        C16682b bVar2 = this.f36886b;
        synchronized (bVar2.f36888a) {
            unmodifiableSet2 = Collections.unmodifiableSet(bVar2.f36888a);
        }
        sb.append(m27651b(unmodifiableSet2));
        return sb.toString();
    }
}
