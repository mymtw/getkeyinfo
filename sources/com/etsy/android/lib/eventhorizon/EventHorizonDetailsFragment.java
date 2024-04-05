package com.etsy.android.lib.eventhorizon;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.EtsyWebFragment;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class EventHorizonDetailsFragment extends Fragment {
    private JSONObject mEvent;

    public static EventHorizonDetailsFragment newInstance(JSONObject jSONObject) {
        EventHorizonDetailsFragment eventHorizonDetailsFragment = new EventHorizonDetailsFragment();
        eventHorizonDetailsFragment.mEvent = jSONObject;
        return eventHorizonDetailsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_event_horizon_detail, viewGroup, false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        try {
            JSONObject jSONObject = this.mEvent.getJSONObject("Value");
            ((TextView) getView().findViewById(R.id.event_horizon_detail_eventname)).setText(jSONObject.optString(ResponseConstants.EVENT_NAME));
            long optLong = jSONObject.optLong(ResponseConstants.TIMESTAMP);
            String format = DateFormatUtils.format(optLong, "yyyy-MM-dd HH:mm:ss SSS z");
            String formatUTC = DateFormatUtils.formatUTC(optLong, "yyyy-MM-dd HH:mm:ss SSS z");
            ((TextView) getView().findViewById(R.id.event_horizon_detail_timestamp)).setText(optLong + "  (" + format + ")  (" + formatUTC + ")");
            ((TextView) getView().findViewById(R.id.event_horizon_detail_browserid)).setText(jSONObject.optString("browser_id"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_userid)).setText(jSONObject.optString("user_id"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_guid)).setText(jSONObject.getString("guid"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_pageguid)).setText(jSONObject.getString("page_guid"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_eventsource)).setText(jSONObject.getString("event_source"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_eventlogger)).setText(jSONObject.getString("event_logger"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_ip)).setText(jSONObject.getString("ip"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_useragent)).setText(jSONObject.getString("user_agent"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_loc)).setText(jSONObject.getString("loc"));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_ref)).setText(jSONObject.getString(EtsyWebFragment.PARAM_REF));
            ((TextView) getView().findViewById(R.id.event_horizon_detail_raw)).setText(jSONObject.toString(2));
        } catch (JSONException e) {
            C8694h.f19097a.mo21309d("failed setting text", e);
        }
    }
}
