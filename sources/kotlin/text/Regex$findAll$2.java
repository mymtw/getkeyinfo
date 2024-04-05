package kotlin.text;

import com.paypal.android.platform.authsdk.splitlogin.tracking.SplitLoginAnalyticsManagerKt;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p753kq.C19857l;

public /* synthetic */ class Regex$findAll$2 extends FunctionReferenceImpl implements C19857l<C19451e, C19451e> {
    public static final Regex$findAll$2 INSTANCE = new Regex$findAll$2();

    public Regex$findAll$2() {
        super(1, C19451e.class, SplitLoginAnalyticsManagerKt.NEXT_BUTTON, "next()Lkotlin/text/MatchResult;", 0);
    }

    public final C19451e invoke(C19451e eVar) {
        C19383o.m32797g(eVar, "p0");
        return eVar.next();
    }
}
