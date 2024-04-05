package p030bo.app;

import com.braze.p044ui.contentcards.ContentCardsFragment;
import p301z3.C8433c;
import p301z3.C8434d;

/* renamed from: bo.app.x6 */
public final /* synthetic */ class C4284x6 implements C8434d {

    /* renamed from: a */
    public final /* synthetic */ int f9444a;

    /* renamed from: b */
    public final /* synthetic */ Object f9445b;

    public /* synthetic */ C4284x6(Object obj, int i) {
        this.f9444a = i;
        this.f9445b = obj;
    }

    /* renamed from: a */
    public final void mo13107a(Object obj) {
        switch (this.f9444a) {
            case 0:
                C3700h0.m8703a((C3700h0) this.f9445b, (C4104q4) obj);
                return;
            case 1:
                C4089q0.m9382a((C4089q0) this.f9445b, (C3690g3) obj);
                return;
            default:
                ContentCardsFragment.m34831onResume$lambda0((ContentCardsFragment) this.f9445b, (C8433c) obj);
                return;
        }
    }
}
