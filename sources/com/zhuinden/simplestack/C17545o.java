package com.zhuinden.simplestack;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.zhuinden.simplestack.o */
public final class C17545o {

    /* renamed from: a */
    public List<Object> f38378a;

    /* renamed from: b */
    public List<Object> f38379b;

    /* renamed from: c */
    public int f38380c;

    public C17545o(List list, List list2, int i) {
        this.f38378a = list;
        this.f38379b = list2;
        this.f38380c = i;
    }

    /* renamed from: a */
    public static C17527e m29420a(List list) {
        LinkedList linkedList = new LinkedList();
        for (Object add : list) {
            linkedList.add(add);
        }
        return C17527e.m29386a(linkedList).mo68743a();
    }
}
