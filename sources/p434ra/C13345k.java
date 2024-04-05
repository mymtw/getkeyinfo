package p434ra;

import android.content.Context;
import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.NotificationType;

/* renamed from: ra.k */
public final class C13345k extends C13339g {

    /* renamed from: f */
    public static C13345k f29272f;

    public C13345k() {
        super(NotificationType.SOLD_ORDER);
    }

    /* renamed from: p */
    public static synchronized C13345k m20998p() {
        C13345k kVar;
        synchronized (C13345k.class) {
            if (f29272f == null) {
                C13345k kVar2 = new C13345k();
                f29272f = kVar2;
                kVar2.mo46034h();
            }
            kVar = f29272f;
        }
        return kVar;
    }

    /* renamed from: j */
    public final String mo46022j(Context context, String str, Bundle bundle) {
        return context.getResources().getQuantityString(R.plurals.sold_order_big_title, mo46032f(bundle), new Object[]{Integer.valueOf(mo46032f(bundle))});
    }

    /* renamed from: l */
    public final void mo46023l() {
    }

    /* renamed from: m */
    public final String mo46024m() {
        return ResponseConstants.USERNAME;
    }

    /* renamed from: n */
    public final CharSequence mo46025n(Context context, Bundle bundle) {
        int i;
        int i2;
        StringBuilder sb = new StringBuilder();
        try {
            i = Integer.parseInt(bundle.getString(ResponseConstants.QUANTITY));
        } catch (NumberFormatException unused) {
            i = 0;
        }
        try {
            i2 = Integer.parseInt(bundle.getString("num_items"));
        } catch (NumberFormatException unused2) {
            i2 = 0;
        }
        String string = bundle.getString("item_name");
        if ((i2 > 1 && i > 0) || !C8885d0.m17324h(string)) {
            sb.append(context.getResources().getQuantityString(R.plurals.sold_order_subject_item_different_plural, i, new Object[]{Integer.valueOf(i)}));
        } else if (i > 1) {
            sb.append(context.getResources().getString(R.string.sold_order_subject_item_multiple, new Object[]{Integer.valueOf(i), string}));
        } else {
            sb.append(context.getResources().getString(R.string.sold_order_subject_item_one, new Object[]{string}));
        }
        return sb.toString();
    }

    /* renamed from: o */
    public final String mo46026o() {
        return "item_name";
    }
}
