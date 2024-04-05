package p495z9;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Html;
import com.etsy.android.R;
import com.etsy.android.lib.eventhorizon.EventHorizonActivity;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.util.NotificationType;
import java.util.ArrayDeque;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p250u0.C8099l;
import p250u0.C8100m;
import p409o9.C13138q;

/* renamed from: z9.a */
public final class C13942a {

    /* renamed from: f */
    public static C13942a f30655f;

    /* renamed from: g */
    public static final int f30656g = NotificationType.EVENT_HORIZON.getId();

    /* renamed from: a */
    public final boolean f30657a;

    /* renamed from: b */
    public final String f30658b;

    /* renamed from: c */
    public Context f30659c;

    /* renamed from: d */
    public ArrayDeque<JSONObject> f30660d = new ArrayDeque<>();

    /* renamed from: e */
    public SharedPreferences f30661e;

    public C13942a(Context context, boolean z) {
        this.f30659c = context;
        this.f30657a = z;
        C13138q.m20808a();
        this.f30658b = "EtsyInc " + context.getString(R.string.event_horizon);
        this.f30661e = context.getSharedPreferences(context.getString(R.string.config_preferences_file_name), 0);
    }

    /* renamed from: a */
    public static void m21473a(JSONObject jSONObject) {
        C13942a aVar = f30655f;
        if (aVar != null && aVar.f30657a && aVar.f30661e.getBoolean(aVar.f30659c.getString(R.string.config_prefs_event_horizon), false)) {
            C8694h.f19097a.mo21310e("addBeacon");
            C13942a aVar2 = f30655f;
            aVar2.f30660d.add(jSONObject);
            while (aVar2.f30660d.size() > 100) {
                aVar2.f30660d.remove();
            }
            C13942a aVar3 = f30655f;
            C8100m mVar = new C8100m(aVar3.f30659c, (String) null);
            C13138q.m20808a();
            mVar.f17655C.icon = R.drawable.ic_stat_ic_notification;
            C13942a aVar4 = f30655f;
            mVar.mo20691e(aVar4 != null ? aVar4.f30658b : "");
            C8099l lVar = new C8099l();
            StringBuilder sb = new StringBuilder();
            if (aVar3.f30660d.size() > 0) {
                try {
                    JSONObject jSONObject2 = aVar3.f30660d.peekLast().getJSONObject("Value");
                    String string = jSONObject2.getString(ResponseConstants.EVENT_NAME);
                    String format = DateFormatUtils.format(jSONObject2.getLong(ResponseConstants.TIMESTAMP), "HH:mm:ss SSS");
                    sb.append(String.format("<br/><b>%s:</b> %s", new Object[]{"Event Name", string}));
                    sb.append(String.format("<br/><b>%s:</b> %s", new Object[]{"Timestamp", format}));
                } catch (JSONException e) {
                    C8694h.f19097a.mo21309d("getBigText fail", e);
                }
            }
            lVar.mo20687h(Html.fromHtml(sb.toString()));
            mVar.mo20696j(lVar);
            mVar.f17663g = PendingIntent.getActivity(aVar3.f30659c, 0, new Intent(aVar3.f30659c, EventHorizonActivity.class), 67108864);
            ((NotificationManager) aVar3.f30659c.getSystemService("notification")).notify(f30656g, mVar.mo20689b());
        }
    }
}
