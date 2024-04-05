package com.etsy.android.p327ui.conversation.details;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.p013v4.media.C0069a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.stylekit.views.CollageImageUpload;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.C19394m;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p173m.C7279a;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.conversation.details.ConversationAttachmentImageLayout */
public final class ConversationAttachmentImageLayout extends LinearLayout {
    public static final int $stable = 8;
    public static final C9459a Companion = new C9459a();
    private static final int NUM_IMAGES = 3;
    public Map<Integer, View> _$_findViewCache;
    private final ViewGroup.LayoutParams imageLayoutParams;
    private int imageSize;
    private final int imageSpacing;
    private final List<CollageImageUpload> imageUploadViews;
    private C19857l<? super Integer, C19394m> removeListener;

    /* renamed from: com.etsy.android.ui.conversation.details.ConversationAttachmentImageLayout$a */
    public static final class C9459a {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationAttachmentImageLayout(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ConversationAttachmentImageLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConversationAttachmentImageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 3; i2++) {
            CollageImageUpload buildImageUploadView = buildImageUploadView(i2);
            arrayList.add(i2, buildImageUploadView);
            addView(buildImageUploadView);
        }
        this.imageUploadViews = C19327t.m32660p1(arrayList);
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.clg_space_8);
        this.imageSpacing = dimensionPixelOffset;
        int i3 = this.imageSize;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i3, i3);
        this.imageLayoutParams = layoutParams;
        LinearLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams.setMarginEnd(dimensionPixelOffset);
    }

    private final CollageImageUpload buildImageUploadView(int i) {
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        CollageImageUpload collageImageUpload = new CollageImageUpload(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        collageImageUpload.setVisibility(8);
        collageImageUpload.setRemoveButtonOnClick(new C9476b(collageImageUpload, this, i));
        return collageImageUpload;
    }

    /* access modifiers changed from: private */
    /* renamed from: buildImageUploadView$lambda-4$lambda-3  reason: not valid java name */
    public static final void m34933buildImageUploadView$lambda4$lambda3(CollageImageUpload collageImageUpload, ConversationAttachmentImageLayout conversationAttachmentImageLayout, int i, View view) {
        C19383o.m32797g(collageImageUpload, "$this_apply");
        C19383o.m32797g(conversationAttachmentImageLayout, "this$0");
        collageImageUpload.setVisibility(8);
        C19857l<? super Integer, C19394m> lVar = conversationAttachmentImageLayout.removeListener;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i));
        }
    }

    private final void checkPositionInRange(int i) {
        boolean z = false;
        if (i >= 0 && i < 3) {
            z = true;
        }
        if (!z) {
            throw new IllegalArgumentException(C0069a.m175f("Provided position ", i, " is less than zero or greater than 2"));
        }
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void addImage(Bitmap bitmap, int i) {
        C19383o.m32797g(bitmap, "bitmap");
        checkPositionInRange(i);
        CollageImageUpload collageImageUpload = this.imageUploadViews.get(i);
        collageImageUpload.setVisibility(0);
        collageImageUpload.setImageBitmap(bitmap);
        collageImageUpload.setLoading(false);
    }

    public final void addLoading(int i) {
        checkPositionInRange(i);
        CollageImageUpload collageImageUpload = this.imageUploadViews.get(i);
        collageImageUpload.setVisibility(0);
        collageImageUpload.setLoading(true);
    }

    public final C19857l<Integer, C19394m> getRemoveListener() {
        return this.removeListener;
    }

    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        if (size != 0) {
            this.imageSize = C7279a.m13954l(((float) (size - (this.imageSpacing * 2))) / 3.0f);
        }
        ViewGroup.LayoutParams layoutParams = this.imageLayoutParams;
        int i3 = this.imageSize;
        layoutParams.width = i3;
        layoutParams.height = i3;
        for (CollageImageUpload layoutParams2 : this.imageUploadViews) {
            layoutParams2.setLayoutParams(this.imageLayoutParams);
        }
        super.onMeasure(i, i2);
    }

    public final void removeImage(int i) {
        checkPositionInRange(i);
        CollageImageUpload collageImageUpload = this.imageUploadViews.get(i);
        collageImageUpload.setImageBitmap((Bitmap) null);
        collageImageUpload.setLoading(false);
        ViewExtensions.m12860d(collageImageUpload);
    }

    public final void removeLoading(int i) {
        checkPositionInRange(i);
        ViewExtensions.m12860d(this.imageUploadViews.get(i));
    }

    public final void setRemoveListener(C19857l<? super Integer, C19394m> lVar) {
        this.removeListener = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ConversationAttachmentImageLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
