package com.etsy.android.lib.eventhorizon;

import android.os.Bundle;
import android.view.View;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.uikit.BaseRecyclerViewListFragment;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;
import p495z9.C13942a;

public class EventHorizonFragment extends BaseRecyclerViewListFragment<JSONObject> {
    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.adapter = new EventHorizonAdapter((EventHorizonActivity) getActivity());
    }

    public void onLoadContent() {
        C13942a aVar = C13942a.f30655f;
        Iterator<JSONObject> descendingIterator = (aVar != null ? aVar.f30660d : new ArrayDeque<>()).descendingIterator();
        ArrayList arrayList = new ArrayList();
        while (descendingIterator.hasNext()) {
            arrayList.add(descendingIterator.next());
        }
        onLoadSuccess(arrayList, arrayList.size());
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        onRefresh();
    }
}
