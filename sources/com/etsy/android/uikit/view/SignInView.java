package com.etsy.android.uikit.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.SignedOutMessageCard;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.Map;
import kotlin.C19394m;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p260v0.C8184a;
import p504ai.C13983i;

public final class SignInView extends LinearLayout {
    public static final int $stable = 8;
    public Map<Integer, View> _$_findViewCache;
    private final ImageView imageView;
    private final Button linkButton;
    private final TextView textSubtitle;
    private final TextView textTitle;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SignInView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SignInView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignInView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C13983i.m21496o(context, ResponseConstants.CONTEXT);
        View.inflate(context, R.layout.sign_in_card_view, this);
        View findViewById = findViewById(R.id.signin_txt_title);
        C19383o.m32796f(findViewById, "findViewById(R.id.signin_txt_title)");
        this.textTitle = (TextView) findViewById;
        View findViewById2 = findViewById(R.id.signin_txt_subtitle);
        C19383o.m32796f(findViewById2, "findViewById(R.id.signin_txt_subtitle)");
        this.textSubtitle = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.signin_image);
        C19383o.m32796f(findViewById3, "findViewById(R.id.signin_image)");
        this.imageView = (ImageView) findViewById3;
        View findViewById4 = findViewById(R.id.signin_btn_link);
        C19383o.m32796f(findViewById4, "findViewById(R.id.signin_btn_link)");
        this.linkButton = (Button) findViewById4;
    }

    private final void bindImage(Context context, String str) {
        C19394m mVar;
        int identifier = context.getResources().getIdentifier(str, "drawable", context.getPackageName());
        if (identifier != 0) {
            Object obj = C8184a.f17966a;
            if (C8184a.C8187c.m16466b(context, identifier) != null) {
                ViewExtensions.m12869m(this.imageView);
                this.imageView.setImageResource(identifier);
                mVar = C19394m.f43287a;
            } else {
                mVar = null;
            }
            if (mVar == null) {
                ViewExtensions.m12860d(this.imageView);
            }
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

    public final void bind(SignedOutMessageCard signedOutMessageCard) {
        C19383o.m32797g(signedOutMessageCard, ResponseConstants.CARD);
        String imageName = signedOutMessageCard.getImageName();
        if (imageName != null) {
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            bindImage(context, imageName);
        }
        this.textTitle.setText(signedOutMessageCard.getTitle());
        this.textSubtitle.setText(signedOutMessageCard.getSubtitle());
        this.linkButton.setText(signedOutMessageCard.getLinkTitle());
    }

    public final ImageView getImageView() {
        return this.imageView;
    }

    public final Button getLinkButton() {
        return this.linkButton;
    }

    public final TextView getTextSubtitle() {
        return this.textSubtitle;
    }

    public final TextView getTextTitle() {
        return this.textTitle;
    }

    public final void recycle() {
        this.imageView.setImageDrawable((Drawable) null);
    }

    public final void setButtonClickListener(TrackingOnClickListener trackingOnClickListener) {
        this.linkButton.setOnClickListener(trackingOnClickListener);
        this.linkButton.setVisibility(trackingOnClickListener == null ? 8 : 0);
    }

    public final void setButtonText(int i) {
        setButtonText(getResources().getString(i));
    }

    public final void setImage(int i) {
        Context context = getContext();
        Object obj = C8184a.f17966a;
        if (C8184a.C8187c.m16466b(context, i) != null) {
            this.imageView.setVisibility(0);
            this.imageView.setImageResource(i);
            return;
        }
        this.imageView.setVisibility(8);
    }

    public final void setSubtitle(int i) {
        setSubtitle(getResources().getString(i));
    }

    public final void setTitle(int i) {
        setTitle(getResources().getString(i));
    }

    public final void setButtonText(String str) {
        this.linkButton.setText(str);
    }

    public final void setSubtitle(String str) {
        if (str == null || str.length() == 0) {
            this.textSubtitle.setVisibility(8);
            return;
        }
        this.textSubtitle.setVisibility(0);
        this.textSubtitle.setText(str);
    }

    public final void setTitle(String str) {
        if (str == null || str.length() == 0) {
            this.textTitle.setVisibility(8);
            return;
        }
        this.textTitle.setVisibility(0);
        this.textTitle.setText(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignInView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
