package p434ra;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.NotificationType;
import java.util.Collections;
import p350fe.C12724a;
import p350fe.C12726c;
import p350fe.C12739m;
import p350fe.C12740n;

/* renamed from: ra.c */
public final class C13335c extends C13339g {

    /* renamed from: f */
    public static C13335c f29261f;

    public C13335c() {
        super(NotificationType.BUYER_REVIEW_AVAILABLE);
    }

    /* renamed from: e */
    public final Uri mo46028e(C12739m mVar, DeepLinkEntity deepLinkEntity, String str, Bundle bundle, C12726c cVar, C12724a aVar) {
        String string = bundle.getString(ResponseConstants.TRANSACTION_ID);
        return (deepLinkEntity == null || string == null) ? super.mo46028e(mVar, deepLinkEntity, str, bundle, cVar, aVar) : C12739m.m20402a(Collections.singletonList(new C12740n(deepLinkEntity, string)));
    }

    /* renamed from: j */
    public final String mo46022j(Context context, String str, Bundle bundle) {
        return context.getResources().getQuantityString(R.plurals.buyer_reviews_available_big_title, mo46032f(bundle), new Object[]{Integer.valueOf(mo46032f(bundle))});
    }

    /* renamed from: l */
    public final void mo46023l() {
    }

    /* renamed from: m */
    public final String mo46024m() {
        return ResponseConstants.SHOP_NAME;
    }

    /* renamed from: o */
    public final String mo46026o() {
        return "item_name";
    }
}
