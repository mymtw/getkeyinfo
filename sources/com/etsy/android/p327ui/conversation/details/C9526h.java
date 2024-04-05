package com.etsy.android.p327ui.conversation.details;

import android.content.Context;
import android.graphics.Bitmap;
import com.etsy.android.lib.models.apiv3.Alert;
import java.util.List;
import p354gc.C12774h;
import p354gc.C12778k;

/* renamed from: com.etsy.android.ui.conversation.details.h */
public interface C9526h {
    void addDraftToAdapter(C12778k kVar);

    void addImage();

    void addImageAttachment(Bitmap bitmap, int i);

    void addItemsToAdapter(List<? extends C12778k> list);

    void clearAdapter();

    void clearMessageInput();

    void enableSend(boolean z);

    Context getContext();

    void goBack();

    void hideLoadingDialog();

    void hidePersistentAlert();

    void notifyItemChanged(int i);

    void onMessageSent();

    void onStatusChanged();

    void openListingImageGalleryView(int i, List<C12774h> list);

    void openNonImageAttachmentView(String str);

    void refreshConversation();

    void reloadOptionsMenu();

    void removeImageAttachment(int i);

    void removeImageLoadingIndicator(int i);

    void setTitle(String str);

    void showError(int i);

    void showError(CharSequence charSequence);

    void showImageLoadingIndicator(int i);

    void showListView();

    void showLoadingDialog(int i);

    void showPersistentAlert(Alert alert);

    void stopRefreshing();

    void updateImageAttachmentButton(boolean z);
}
