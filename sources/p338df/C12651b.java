package p338df;

import android.content.DialogInterface;
import com.etsy.android.lib.logger.C8703p;
import kotlin.jvm.internal.C19383o;
import p001a0.C0005b;

/* renamed from: df.b */
public final /* synthetic */ class C12651b implements DialogInterface.OnCancelListener {

    /* renamed from: b */
    public final /* synthetic */ C8703p f27898b;

    /* renamed from: c */
    public final /* synthetic */ C12654e f27899c;

    public /* synthetic */ C12651b(C8703p pVar, C12654e eVar) {
        this.f27898b = pVar;
        this.f27899c = eVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C8703p pVar = this.f27898b;
        C12654e eVar = this.f27899c;
        C19383o.m32797g(pVar, "$analyticsTracker");
        C19383o.m32797g(eVar, "$listingUiModel");
        pVar.mo21333d("listing_card_action_cancel", C0005b.m37e0(eVar));
    }
}
