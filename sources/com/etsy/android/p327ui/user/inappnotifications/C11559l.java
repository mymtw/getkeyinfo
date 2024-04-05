package com.etsy.android.p327ui.user.inappnotifications;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.apiv3.inappnotifications.InAppNotification;
import java.util.List;
import p400mf.C13074b;

/* renamed from: com.etsy.android.ui.user.inappnotifications.l */
public interface C11559l {
    void addNotificationsToAdapter(List<? extends InAppNotification> list);

    void addOnScrollStateListener(RecyclerView.C3108s sVar);

    void clearOnScrollListener();

    FragmentActivity getActivity();

    Lifecycle getLifecycle();

    RecyclerView getRecyclerView();

    void refreshComplete();

    void showEmptyView();

    void showListView();

    void updateViews(C13074b bVar);
}
