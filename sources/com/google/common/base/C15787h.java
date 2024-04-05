package com.google.common.base;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.google.common.base.h */
public class C15787h {

    /* renamed from: a */
    public final String f35567a;

    public C15787h(String str) {
        str.getClass();
        this.f35567a = str;
    }

    /* renamed from: a */
    public final String mo55780a(Iterable<?> iterable) {
        Iterator<?> it = iterable.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                sb.append(mo55779b(it.next()));
                while (it.hasNext()) {
                    sb.append(this.f35567a);
                    sb.append(mo55779b(it.next()));
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: b */
    public CharSequence mo55779b(Object obj) {
        obj.getClass();
        return obj instanceof CharSequence ? (CharSequence) obj : obj.toString();
    }

    public C15787h(C15787h hVar) {
        this.f35567a = hVar.f35567a;
    }
}
