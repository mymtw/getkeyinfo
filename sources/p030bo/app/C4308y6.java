package p030bo.app;

import com.braze.p044ui.contentcards.ContentCardsFragment;
import p301z3.C8434d;
import p301z3.C8437g;

/* renamed from: bo.app.y6 */
public final /* synthetic */ class C4308y6 implements C8434d {

    /* renamed from: a */
    public final /* synthetic */ int f9505a;

    /* renamed from: b */
    public final /* synthetic */ Object f9506b;

    public /* synthetic */ C4308y6(Object obj, int i) {
        this.f9505a = i;
        this.f9506b = obj;
    }

    /* renamed from: a */
    public final void mo13107a(Object obj) {
        switch (this.f9505a) {
            case 0:
                C3700h0.m8704a((C3700h0) this.f9506b, (C4139r4) obj);
                return;
            case 1:
                C4286y0.m9833a((C4286y0) this.f9506b, (C3967m6) obj);
                return;
            default:
                ContentCardsFragment.m34832onResume$lambda2((ContentCardsFragment) this.f9506b, (C8437g) obj);
                return;
        }
    }
}
