package androidx.compose.p015ui.text.android;

import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import kotlin.Pair;
import kotlin.jvm.internal.C19383o;

/* renamed from: androidx.compose.ui.text.android.n */
public final class C1931n {

    /* renamed from: a */
    public static final Pair<Integer, Integer> f4358a = new Pair<>(0, 0);

    /* renamed from: a */
    public static final TextDirectionHeuristic m4230a(int i) {
        if (i == 0) {
            TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.LTR;
            C19383o.m32796f(textDirectionHeuristic, "LTR");
            return textDirectionHeuristic;
        } else if (i == 1) {
            TextDirectionHeuristic textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            C19383o.m32796f(textDirectionHeuristic2, "RTL");
            return textDirectionHeuristic2;
        } else if (i == 2) {
            TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            C19383o.m32796f(textDirectionHeuristic3, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic3;
        } else if (i == 3) {
            TextDirectionHeuristic textDirectionHeuristic4 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
            C19383o.m32796f(textDirectionHeuristic4, "FIRSTSTRONG_RTL");
            return textDirectionHeuristic4;
        } else if (i == 4) {
            TextDirectionHeuristic textDirectionHeuristic5 = TextDirectionHeuristics.ANYRTL_LTR;
            C19383o.m32796f(textDirectionHeuristic5, "ANYRTL_LTR");
            return textDirectionHeuristic5;
        } else if (i != 5) {
            TextDirectionHeuristic textDirectionHeuristic6 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
            C19383o.m32796f(textDirectionHeuristic6, "FIRSTSTRONG_LTR");
            return textDirectionHeuristic6;
        } else {
            TextDirectionHeuristic textDirectionHeuristic7 = TextDirectionHeuristics.LOCALE;
            C19383o.m32796f(textDirectionHeuristic7, "LOCALE");
            return textDirectionHeuristic7;
        }
    }
}
