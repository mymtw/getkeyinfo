package com.etsy.android.uikit.view.shop.policies;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.uikit.util.EtsyLinkify;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import java.util.ArrayList;
import java.util.Iterator;

public abstract class StructuredShopPoliciesView extends RelativeLayout {
    public static final String BULLET_POINT_AND_SPACE = "&#8226; ";
    private final ArrayList<View.OnClickListener> clickListeners = new ArrayList<>();
    private Space expandedBottomSpace;
    /* access modifiers changed from: private */
    public C11958c expandedListener;
    private final ArrayList<TextView> linkifiedTextViews = new ArrayList<>();
    private Button mBtnExpand;
    private View mExpansionSection;
    private boolean mIsContentCollapsible = false;
    private boolean mIsExpanded = true;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C11955a();

        /* renamed from: b */
        public boolean f26556b;

        /* renamed from: c */
        public boolean f26557c;

        /* renamed from: com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView$SavedState$a */
        public class C11955a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f26556b ? 1 : 0);
            parcel.writeInt(this.f26557c ? 1 : 0);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            boolean z = false;
            this.f26556b = parcel.readInt() == 1;
            this.f26557c = parcel.readInt() == 1 ? true : z;
        }
    }

    /* renamed from: com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView$a */
    public class C11956a extends TrackingOnClickListener {
        public C11956a() {
        }

        public final void onViewClick(View view) {
            StructuredShopPoliciesView.this.setExpanded(true);
            if (StructuredShopPoliciesView.this.expandedListener != null) {
                StructuredShopPoliciesView.this.expandedListener.onExpanded();
            }
        }
    }

    /* renamed from: com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView$b */
    public interface C11957b {
        /* renamed from: b */
        void mo12056b();
    }

    /* renamed from: com.etsy.android.uikit.view.shop.policies.StructuredShopPoliciesView$c */
    public interface C11958c {
        void onExpanded();
    }

    public StructuredShopPoliciesView(Context context) {
        super(context);
        init(context, (AttributeSet) null, 0, 0);
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        View.inflate(context, R.layout.view_structured_shop_policies, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.content);
        init(context, linearLayout);
        setClipToPadding(false);
        setClipChildren(false);
        this.mExpansionSection = linearLayout.findViewById(R.id.expansion_section);
        this.mBtnExpand = (Button) linearLayout.findViewById(R.id.btn_expand);
        this.expandedBottomSpace = (Space) linearLayout.findViewById(R.id.expanded_bottom_space);
    }

    public abstract void init(Context context, LinearLayout linearLayout);

    public void linkifyContactShopUrlSpan(TextView textView, C11957b bVar) {
        if (bVar == null) {
            URLSpan[] urls = textView.getUrls();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(textView.getText());
            for (URLSpan removeSpan : urls) {
                spannableStringBuilder.removeSpan(removeSpan);
            }
            textView.setText(spannableStringBuilder);
            return;
        }
        this.linkifiedTextViews.add(textView);
        EtsyLinkify.m19609c(textView, false, new C11961a(bVar));
    }

    public void onDestroyView() {
        Iterator<TextView> it = this.linkifiedTextViews.iterator();
        while (it.hasNext()) {
            EtsyLinkify.m19614h(it.next());
        }
        this.linkifiedTextViews.clear();
        this.clickListeners.clear();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setContentCollapsible(savedState.f26556b);
        setExpanded(savedState.f26557c);
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f26556b = this.mIsContentCollapsible;
        savedState.f26557c = this.mIsExpanded;
        return savedState;
    }

    public void setContentCollapsible(boolean z) {
        this.mIsContentCollapsible = z;
    }

    public boolean setExpanded(boolean z) {
        Button button;
        int i = 0;
        if ((!z && !this.mIsContentCollapsible) || (button = this.mBtnExpand) == null || this.mExpansionSection == null || this.expandedBottomSpace == null) {
            return false;
        }
        button.setVisibility(z ? 8 : 0);
        this.expandedBottomSpace.setVisibility(z ? 0 : 8);
        this.mBtnExpand.setOnClickListener(z ? null : new C11956a());
        View view = this.mExpansionSection;
        if (!z) {
            i = 8;
        }
        view.setVisibility(i);
        this.mIsExpanded = z;
        return true;
    }

    public void setExpandedListener(C11958c cVar) {
        this.expandedListener = cVar;
    }

    public StructuredShopPoliciesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    public StructuredShopPoliciesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    public StructuredShopPoliciesView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }
}
