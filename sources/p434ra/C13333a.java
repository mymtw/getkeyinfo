package p434ra;

import android.content.Context;
import android.os.Bundle;
import com.etsy.android.R;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.NotificationType;

/* renamed from: ra.a */
public final class C13333a extends C13339g {

    /* renamed from: f */
    public static C13333a f29259f;

    public C13333a() {
        super(NotificationType.BUYER_FAVORITE);
    }

    /* renamed from: j */
    public final String mo46022j(Context context, String str, Bundle bundle) {
        return context.getResources().getQuantityString(R.plurals.buyer_favorite_big_title, mo46032f(bundle), new Object[]{Integer.valueOf(mo46032f(bundle))});
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
        StringBuilder sb = new StringBuilder();
        if (bundle.containsKey("item_name")) {
            sb.append(context.getResources().getString(R.string.notification_action_favorited));
            sb.append(" ");
            sb.append(bundle.getString("item_name"));
        } else {
            sb.append(context.getResources().getString(R.string.notification_action_favorited_shop));
        }
        return sb.toString();
    }

    /* renamed from: o */
    public final String mo46026o() {
        return "item_name";
    }
}
