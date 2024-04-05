package com.etsy.android.config.flags.events;

import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;
import p409o9.C13132l;

/* renamed from: com.etsy.android.config.flags.events.i */
public final /* synthetic */ class C6362i implements Comparator {
    public final int compare(Object obj, Object obj2) {
        String str = ((C13132l) ((Pair) obj).getFirst()).f28870a;
        String str2 = ((C13132l) ((Pair) obj2).getFirst()).f28870a;
        C19383o.m32797g(str, "<this>");
        C19383o.m32797g(str2, "other");
        return str.compareToIgnoreCase(str2);
    }
}
