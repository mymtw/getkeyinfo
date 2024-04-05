package p442sc;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.etsy.android.lib.logger.C8703p;
import com.etsy.android.lib.models.datatypes.EtsyId;
import com.etsy.android.p327ui.navigation.keys.fragmentkeys.ListingKey;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p356ge.C12790b;
import p415of.C13171a;

/* renamed from: sc.a */
public final class C13371a extends C13171a<EtsyId> {

    /* renamed from: d */
    public boolean f29298d;

    public C13371a(Fragment fragment, C8703p pVar) {
        super(fragment, pVar);
    }

    /* renamed from: d */
    public final void mo31328c(EtsyId etsyId) {
        C19383o.m32797g(etsyId, "data");
        C12790b.m20430b(mo45889a(), new ListingKey(C12790b.m20432d(mo45889a()), etsyId, false, false, (Bundle) null, 28, (DefaultConstructorMarker) null));
    }
}
