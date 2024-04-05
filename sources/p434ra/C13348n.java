package p434ra;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.appboy.Constants;
import com.etsy.android.R;
import com.etsy.android.lib.deeplinks.DeepLinkEntity;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.push.notifications.InboxItemsList;
import com.etsy.android.lib.util.C8885d0;
import com.etsy.android.lib.util.NotificationType;
import com.etsy.android.p327ui.nav.NotificationActivity;
import java.util.Arrays;
import kotlin.jvm.internal.C19383o;
import p250u0.C8100m;
import p350fe.C12739m;
import p350fe.C12740n;

/* renamed from: ra.n */
public final class C13348n extends C13339g {

    /* renamed from: f */
    public static C13348n f29274f;

    public C13348n() {
        super(NotificationType.SHIPPING);
        this.f29267e = new InboxItemsList();
    }

    /* renamed from: a */
    public final void mo46029a(C8100m mVar, Context context, Bundle bundle, String str, C12739m mVar2) {
        if (mo46032f(bundle) != 1) {
            NotificationType notificationType = this.f29264a;
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C19383o.m32797g(notificationManager, "notificationManager");
            notificationManager.cancel(notificationType.getId());
        } else if (C8885d0.m17324h(bundle.getString(ResponseConstants.RECEIPT_SHIPPING_ID))) {
            Intent intent = new Intent(context, NotificationActivity.class);
            intent.setAction("com.etsy.android.action.NOTIFICATION");
            intent.putExtra(Constants.APPBOY_PUSH_TITLE_KEY, this.f29264a.getType());
            intent.putExtra("n", this.f29265b);
            intent.setData(C12739m.m20402a(Arrays.asList(new C12740n[]{new C12740n(DeepLinkEntity.RECEIPT, str), new C12740n(DeepLinkEntity.TRACK_ORDER, str)})));
            mVar.mo20688a(R.drawable.ic_action_place, context.getString(R.string.track_package), PendingIntent.getActivity(context, this.f29264a.getId(), intent, 1140850688));
        }
    }

    /* renamed from: j */
    public final String mo46022j(Context context, String str, Bundle bundle) {
        boolean z = bundle.getBoolean("is_delivered", false);
        boolean parseBoolean = Boolean.parseBoolean(bundle.getString("is_delivered", "false"));
        if (z || parseBoolean) {
            return context.getResources().getQuantityString(R.plurals.shipping_delivery_notification_big_title, mo46032f(bundle), new Object[]{Integer.valueOf(mo46032f(bundle))});
        }
        return context.getResources().getQuantityString(R.plurals.shipping_notification_big_title, mo46032f(bundle), new Object[]{Integer.valueOf(mo46032f(bundle))});
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
