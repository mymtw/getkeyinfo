package com.etsy.android.p327ui.favorites;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.animation.C0388a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.C2399d;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p075d.C6614a;
import p504ai.C13983i;
import p753kq.C19857l;

/* renamed from: com.etsy.android.ui.favorites.CollectionTitleView */
public final class CollectionTitleView extends ConstraintLayout implements C9895t {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private ImageView collectionMenuImageView;
    private TextView collectionTitleTextView;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollectionTitleView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CollectionTitleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionTitleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        LayoutInflater.from(context).inflate(R.layout.collection_title, this, true);
        View findViewById = findViewById(R.id.collection_name);
        C19383o.m32796f(findViewById, "findViewById(R.id.collection_name)");
        this.collectionTitleTextView = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.collection_menu);
        C19383o.m32796f(findViewById2, "findViewById(R.id.collection_menu)");
        this.collectionMenuImageView = (ImageView) findViewById2;
        setLayoutParams(new ConstraintLayout.LayoutParams(-1, -2));
    }

    private final String getContentDescription(String str, boolean z) {
        if (str == null) {
            str = getContext().getString(R.string.collection_default_name);
            C19383o.m32796f(str, "context.getString(R.stri….collection_default_name)");
        }
        if (z) {
            return C0388a.m1049e(new Object[]{getContext().getString(R.string.collection_privacy_level_public_header)}, 1, str, "format(format, *args)");
        }
        return C0388a.m1049e(new Object[]{getContext().getString(R.string.collection_privacy_level_private_header)}, 1, str, "format(format, *args)");
    }

    private final Drawable getPrivacyIcon(Boolean bool) {
        return C19383o.m32792b(bool, Boolean.TRUE) ? C6614a.m12981a(getContext(), R.drawable.ic_public_collection) : C6614a.m12981a(getContext(), R.drawable.ic_private_collection);
    }

    /* access modifiers changed from: private */
    /* renamed from: setInformation$lambda-2  reason: not valid java name */
    public static final void m34969setInformation$lambda2(CollectionTitleView collectionTitleView) {
        C19383o.m32797g(collectionTitleView, "this$0");
        if (collectionTitleView.collectionTitleTextView.getLineCount() > 1) {
            TextView textView = collectionTitleView.collectionTitleTextView;
            textView.setMaxLines(1);
            textView.setPadding(0, 0, (int) textView.getContext().getResources().getDimension(R.dimen.padding_xlarge), 0);
        } else {
            collectionTitleView.collectionTitleTextView.setLayoutParams(new ConstraintLayout.LayoutParams(-2, -2));
            ViewGroup.LayoutParams layoutParams = collectionTitleView.collectionTitleTextView.getLayoutParams();
            C19383o.m32795e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
            layoutParams2.topToTop = R.id.collection_title;
            layoutParams2.bottomToBottom = R.id.collection_title;
            collectionTitleView.collectionTitleTextView.requestLayout();
        }
        ViewExtensions.m12869m(collectionTitleView.collectionTitleTextView);
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

    public void onCollectionUpdated(String str, Boolean bool) {
        setInformation(str, bool);
    }

    public final void setInformation(String str, Boolean bool) {
        TextView textView = this.collectionTitleTextView;
        textView.setText(str != null ? str : textView.getContext().getString(R.string.collection_app_bar_title));
        textView.setContentDescription(getContentDescription(str, bool != null ? bool.booleanValue() : true));
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, getPrivacyIcon(bool), (Drawable) null);
        textView.post(new C2399d(this, 2));
    }

    public final void setOnMenuClickListener(C19857l<? super View, C19394m> lVar) {
        C19383o.m32797g(lVar, "onClickListener");
        ImageView imageView = this.collectionMenuImageView;
        ViewExtensions.m12866j(imageView, lVar);
        ViewExtensions.m12869m(imageView);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CollectionTitleView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
