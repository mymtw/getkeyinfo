package com.etsy.android.lib.eventhorizon;

import android.support.p013v4.media.C0072d;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.uikit.adapter.C11829a;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class EventHorizonAdapter extends C11829a<JSONObject> implements View.OnClickListener {
    private C8659a mEventHorizonNav;

    /* renamed from: com.etsy.android.lib.eventhorizon.EventHorizonAdapter$a */
    public interface C8659a {
        void onSelectEvent(JSONObject jSONObject);
    }

    /* renamed from: com.etsy.android.lib.eventhorizon.EventHorizonAdapter$b */
    public static class C8660b extends RecyclerView.C3084b0 {

        /* renamed from: b */
        public TextView f19030b;

        /* renamed from: c */
        public TextView f19031c;

        /* renamed from: d */
        public TextView f19032d;

        /* renamed from: e */
        public JSONObject f19033e;

        public C8660b(View view) {
            super(view);
            this.f19030b = (TextView) view.findViewById(R.id.event_horizon_summary_timestamp);
            this.f19031c = (TextView) view.findViewById(R.id.event_horizon_summary_eventlogger);
            this.f19032d = (TextView) view.findViewById(R.id.event_horizon_summary_eventname);
        }
    }

    public EventHorizonAdapter(EventHorizonActivity eventHorizonActivity) {
        super(eventHorizonActivity);
        this.mEventHorizonNav = eventHorizonActivity;
    }

    public int getListItemViewType(int i) {
        return this.mItems.size();
    }

    public void onBindListItemViewHolder(RecyclerView.C3084b0 b0Var, int i) {
        JSONObject jSONObject = (JSONObject) getItem(i);
        C8660b bVar = (C8660b) b0Var;
        bVar.f19033e = jSONObject;
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("Value");
            String string = jSONObject2.getString(ResponseConstants.EVENT_NAME);
            String string2 = jSONObject2.getString("event_logger");
            bVar.f19030b.setText(DateFormatUtils.format(jSONObject2.getLong(ResponseConstants.TIMESTAMP), "HH:mm:ss"));
            bVar.f19031c.setText(string2);
            bVar.f19032d.setText(string);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        bVar.itemView.setTag(bVar);
        bVar.itemView.setOnClickListener(this);
    }

    public void onClick(View view) {
        JSONObject jSONObject = ((C8660b) view.getTag()).f19033e;
        C8694h hVar = C8694h.f19097a;
        StringBuilder h = C0072d.m201h("onClick event ");
        h.append(jSONObject.toString());
        hVar.mo21312f(h.toString());
        this.mEventHorizonNav.onSelectEvent(jSONObject);
    }

    public RecyclerView.C3084b0 onCreateListItemViewHolder(ViewGroup viewGroup, int i) {
        return new C8660b(this.mInflater.inflate(R.layout.fragment_event_horizon, viewGroup, false));
    }
}
