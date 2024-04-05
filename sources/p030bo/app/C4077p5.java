package p030bo.app;

import kotlin.NoWhenBranchMatchedException;
import p005a4.C0035b;

/* renamed from: bo.app.p5 */
public enum C4077p5 implements C0035b<String> {
    SUBSCRIBED,
    UNSUBSCRIBED;

    /* renamed from: bo.app.p5$a */
    public /* synthetic */ class C4078a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9085a = null;

        static {
            int[] iArr = new int[C4077p5.values().length];
            iArr[C4077p5.SUBSCRIBED.ordinal()] = 1;
            iArr[C4077p5.UNSUBSCRIBED.ordinal()] = 2;
            f9085a = iArr;
        }
    }

    /* renamed from: v */
    public String forJsonPut() {
        int i = C4078a.f9085a[ordinal()];
        if (i == 1) {
            return "subscribed";
        }
        if (i == 2) {
            return "unsubscribed";
        }
        throw new NoWhenBranchMatchedException();
    }
}
