package com.qualtrics.digital;

import com.google.gson.C16708i;
import com.google.gson.C16796j;
import com.google.gson.C16802p;
import com.google.gson.internal.bind.C16780a;
import java.util.ArrayList;
import p003a2.C0015b;
import p628nj.C18263b;

/* renamed from: com.qualtrics.digital.a */
public abstract class C17292a {
    /* renamed from: b */
    public static void m29048b(C16802p pVar, ArrayList arrayList, C16796j jVar, Class cls) {
        int i = 0;
        while (true) {
            if (pVar.f37123b.containsKey(C0015b.m88g("", i))) {
                C16708i a = jVar.mo59627a();
                C16802p pVar2 = (C16802p) pVar.f37123b.get(C0015b.m88g("", i));
                arrayList.add(C18263b.m30873v0(cls).cast(pVar2 == null ? null : a.mo59456c(new C16780a(pVar2), cls)));
                i++;
            } else {
                return;
            }
        }
    }
}
