package kotlinx.coroutines.flow;

import kotlin.coroutines.C19340c;
import kotlinx.coroutines.C19525d0;
import kotlinx.coroutines.channels.C19512n;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.flow.internal.C19633j;
import p753kq.C19857l;

/* renamed from: kotlinx.coroutines.flow.w */
public final /* synthetic */ class C19684w {
    /* renamed from: a */
    public static final C19597d m33456a(C19671s1 s1Var, long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i >= 0) {
            return i == 0 ? s1Var : m33457b(s1Var, new FlowKt__DelayKt$debounce$2(j));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative".toString());
    }

    /* renamed from: b */
    public static final C19633j m33457b(C19597d dVar, C19857l lVar) {
        return new C19633j(new FlowKt__DelayKt$debounceInternal$1(lVar, dVar, (C19340c<? super FlowKt__DelayKt$debounceInternal$1>) null));
    }

    /* renamed from: c */
    public static final C19512n m33458c(C19525d0 d0Var, long j, long j2) {
        if (j >= 0) {
            if (j2 >= 0) {
                return ProduceKt.m33139b(d0Var, 0, new FlowKt__DelayKt$fixedPeriodTicker$3(j2, j, (C19340c<? super FlowKt__DelayKt$fixedPeriodTicker$3>) null), 1);
            }
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
    }
}
