package com.etsy.android.lib.eventhorizon;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.p013v4.media.C0072d;
import android.view.MenuItem;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.eventhorizon.EventHorizonAdapter;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.uikit.AppBarHelper;
import com.etsy.android.uikit.BaseActivity;
import org.json.JSONObject;
import p495z9.C13942a;

@SuppressLint({"Registered"})
public class EventHorizonActivity extends BaseActivity implements EventHorizonAdapter.C8659a {
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.event_horizon_activity);
        AppBarHelper appBarHelper = getAppBarHelper();
        C13942a aVar = C13942a.f30655f;
        appBarHelper.setTitle((CharSequence) aVar != null ? aVar.f30658b : "");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        C2740a aVar2 = new C2740a(supportFragmentManager);
        aVar2.mo10485g(R.id.container_event_horizon, new EventHorizonFragment(), "event_horizon", 1);
        aVar2.mo10483d();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onSelectEvent(JSONObject jSONObject) {
        C8694h hVar = C8694h.f19097a;
        StringBuilder h = C0072d.m201h("onSelectEvent ");
        h.append(jSONObject.toString());
        hVar.mo21312f(h.toString());
        EventHorizonDetailsFragment newInstance = EventHorizonDetailsFragment.newInstance(jSONObject);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        boolean z = supportFragmentManager.mo10353C("event_horizon_detail") != null;
        boolean c = C8914m.m17345c(this);
        int i = c ? R.id.container_event_horizon_detail : R.id.container_event_horizon;
        C2740a aVar = new C2740a(supportFragmentManager);
        if (z || !c) {
            aVar.mo10531h(i, newInstance, "event_horizon_detail");
        } else {
            aVar.mo10485g(i, newInstance, "event_horizon_detail", 1);
        }
        if (!c) {
            aVar.mo10529c((String) null);
        }
        aVar.mo10483d();
    }
}
