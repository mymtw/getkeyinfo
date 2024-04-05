package com.etsy.android.p327ui.conversation.list;

import com.etsy.android.lib.models.datatypes.EtsyId;
import java.util.List;
import p354gc.C12760a;
import p354gc.C12763b;

/* renamed from: com.etsy.android.ui.conversation.list.a */
public interface C9569a {
    void addItemsToAdapter(List<? extends C12760a> list);

    void launchConversation(C12763b bVar);

    void navigateToUserWebView(EtsyId etsyId);

    void refreshConvos();

    void showEmptyView();

    void showErrorSnackbar(int i);

    void showErrorView();

    void showListView();

    void stopRefreshing();
}
