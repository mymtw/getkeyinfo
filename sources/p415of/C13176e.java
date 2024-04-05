package p415of;

import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.stylekit.views.CollageCheckbox;
import com.google.android.play.core.assetpacks.C15588c1;
import kotlin.jvm.internal.C19383o;

/* renamed from: of.e */
public final class C13176e implements CollageCheckbox.C9027c {

    /* renamed from: a */
    public final /* synthetic */ C13178g f28999a;

    public C13176e(C13178g gVar) {
        this.f28999a = gVar;
    }

    /* renamed from: a */
    public final void mo30790a(boolean z, CollageCheckbox collageCheckbox) {
        C19383o.m32797g(collageCheckbox, "selectedButton");
        C13178g.m20857b(this.f28999a, "");
        if (z) {
            ViewExtensions.m12869m(this.f28999a.f29009i);
            C13178g gVar = this.f28999a;
            gVar.f29008h.setContentDescription(gVar.mo45898c(z));
            C13178g gVar2 = this.f28999a;
            gVar2.f29008h.setHelperText(gVar2.f29001a.getContext().getString(R.string.gift_options_gift_message_reminder));
            C13178g gVar3 = this.f28999a;
            gVar3.f29006f.mo21333d("add_gift_message_checked", C13178g.m20856a(gVar3));
            return;
        }
        ViewExtensions.m12860d(this.f28999a.f29009i);
        this.f28999a.f29008h.setHelperText((String) null);
        this.f28999a.f29009i.setText((String) null);
        C15588c1.m25340p0(this.f28999a.f29009i);
    }
}
