package com.etsy.android.p327ui.conversation.details;

import android.view.View;
import com.etsy.android.stylekit.views.CollageImageUpload;

/* renamed from: com.etsy.android.ui.conversation.details.b */
public final /* synthetic */ class C9476b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ CollageImageUpload f20998b;

    /* renamed from: c */
    public final /* synthetic */ ConversationAttachmentImageLayout f20999c;

    /* renamed from: d */
    public final /* synthetic */ int f21000d;

    public /* synthetic */ C9476b(CollageImageUpload collageImageUpload, ConversationAttachmentImageLayout conversationAttachmentImageLayout, int i) {
        this.f20998b = collageImageUpload;
        this.f20999c = conversationAttachmentImageLayout;
        this.f21000d = i;
    }

    public final void onClick(View view) {
        ConversationAttachmentImageLayout.m34933buildImageUploadView$lambda4$lambda3(this.f20998b, this.f20999c, this.f21000d, view);
    }
}
