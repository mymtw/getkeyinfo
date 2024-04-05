package com.paypal.pyplcheckout.utils;

import kotlin.C19285c;
import kotlin.C19350d;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import p753kq.C19846a;
import p753kq.C19857l;
import p753kq.C19861p;
import p753kq.C19862q;
import p753kq.C19863r;

public final class RunOnceDelegateKt {
    public static final C19285c<C19846a<C19394m>> runOnce(C19846a<C19394m> aVar) {
        C19383o.m32797g(aVar, "block");
        return C19350d.m32677b(new RunOnceDelegateKt$runOnce$1(aVar));
    }

    public static final <T> C19285c<C19857l<T, C19394m>> runOnce(C19857l<? super T, C19394m> lVar) {
        C19383o.m32797g(lVar, "block");
        return C19350d.m32677b(new RunOnceDelegateKt$runOnce$2(lVar));
    }

    public static final <T1, T2> C19285c<C19861p<T1, T2, C19394m>> runOnce(C19861p<? super T1, ? super T2, C19394m> pVar) {
        C19383o.m32797g(pVar, "block");
        return C19350d.m32677b(new RunOnceDelegateKt$runOnce$3(pVar));
    }

    public static final <T1, T2, T3> C19285c<C19862q<T1, T2, T3, C19394m>> runOnce(C19862q<? super T1, ? super T2, ? super T3, C19394m> qVar) {
        C19383o.m32797g(qVar, "block");
        return C19350d.m32677b(new RunOnceDelegateKt$runOnce$4(qVar));
    }

    public static final <T1, T2, T3, T4> C19285c<C19863r<T1, T2, T3, T4, C19394m>> runOnce(C19863r<? super T1, ? super T2, ? super T3, ? super T4, C19394m> rVar) {
        C19383o.m32797g(rVar, "block");
        return C19350d.m32677b(new RunOnceDelegateKt$runOnce$5(rVar));
    }
}
