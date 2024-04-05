package com.etsy.android.p327ui.view;

import android.animation.Animator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.etsy.android.R;
import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.lib.models.apiv3.FAQ;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.stylekit.views.CollageHeadingTextView;
import com.etsy.android.uikit.util.C11914o;
import com.etsy.android.uikit.util.HardwareAnimatorListener;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import p364hf.C12826b;

/* renamed from: com.etsy.android.ui.view.ListingFaqView */
public class ListingFaqView extends LinearLayout {
    private static final int ARROW_CLOSED_ORIENTATION = 0;
    private static final int ARROW_OPEN_ORIENTATION = 180;
    /* access modifiers changed from: private */
    public int mAnswerExpandedHeight = 0;
    private View mFaqDivider;
    /* access modifiers changed from: private */
    public View mFaqHeader;
    /* access modifiers changed from: private */
    public ImageView mFaqIcon;
    /* access modifiers changed from: private */
    public boolean mIsExpanded = false;
    /* access modifiers changed from: private */
    public TextView mTxtFaqAnswer;
    private TextView mTxtFaqQuestion;

    /* renamed from: com.etsy.android.ui.view.ListingFaqView$a */
    public class C11788a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C11788a() {
        }

        public final void onGlobalLayout() {
            C11914o.m19630b(ListingFaqView.this.getViewTreeObserver(), this);
            ListingFaqView listingFaqView = ListingFaqView.this;
            int unused = listingFaqView.mAnswerExpandedHeight = listingFaqView.mTxtFaqAnswer.getMeasuredHeight();
            ListingFaqView listingFaqView2 = ListingFaqView.this;
            listingFaqView2.setExpanded(listingFaqView2.mIsExpanded);
        }
    }

    /* renamed from: com.etsy.android.ui.view.ListingFaqView$b */
    public class C11789b extends TrackingOnClickListener {
        public C11789b() {
        }

        public final void onViewClick(View view) {
            ListingFaqView.this.mFaqHeader.setOnClickListener((View.OnClickListener) null);
            ListingFaqView.this.animateExpanded(false);
        }
    }

    /* renamed from: com.etsy.android.ui.view.ListingFaqView$c */
    public class C11790c extends TrackingOnClickListener {
        public C11790c() {
        }

        public final void onViewClick(View view) {
            ListingFaqView.this.mFaqHeader.setOnClickListener((View.OnClickListener) null);
            ListingFaqView.this.animateExpanded(true);
        }
    }

    /* renamed from: com.etsy.android.ui.view.ListingFaqView$d */
    public class C11791d extends HardwareAnimatorListener {

        /* renamed from: a */
        public final /* synthetic */ boolean f26261a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11791d(TextView textView, boolean z) {
            super(textView);
            this.f26261a = z;
        }

        public final void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            ListingFaqView.this.setExpanded(this.f26261a);
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ListingFaqView.this.mFaqIcon.setRotation(this.f26261a ? 180.0f : 0.0f);
            if (this.f26261a) {
                ListingFaqView.this.mTxtFaqAnswer.setHeight(0);
                ListingFaqView.this.mTxtFaqAnswer.setVisibility(0);
            }
        }
    }

    public ListingFaqView(Context context) {
        super(context);
        init(context, (AttributeSet) null, 0, 0);
    }

    /* access modifiers changed from: private */
    public void animateExpanded(boolean z) {
        int height = this.mTxtFaqAnswer.getHeight();
        Context context = getContext();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        if (C8914m.f19669c == 0.0f) {
            C8914m.m17348f(context);
        }
        if (height > displayMetrics.heightPixels) {
            C8694h.f19097a.mo21310e("Not animating since the View is larger than the window. In some cases this will cause a crash on texture size");
            setExpanded(false);
            return;
        }
        int measuredHeight = z ? 0 : this.mTxtFaqAnswer.getMeasuredHeight();
        int i = z ? this.mAnswerExpandedHeight : 0;
        C12826b bVar = new C12826b(this.mTxtFaqAnswer);
        bVar.f28308c.add(new C12826b.C12827a(9, PropertyValuesHolder.ofInt(ResponseConstants.HEIGHT, new int[]{measuredHeight, i})));
        bVar.f28311f = new C11791d(this.mTxtFaqAnswer, z);
        bVar.mo45610a();
    }

    private void init(Context context, AttributeSet attributeSet, int i, int i2) {
        View.inflate(context, R.layout.view_listing_faq, this);
        this.mFaqDivider = findViewById(R.id.faq_divider);
        this.mFaqHeader = findViewById(R.id.faq_header);
        this.mTxtFaqQuestion = (CollageHeadingTextView) findViewById(R.id.txt_faq_question);
        this.mTxtFaqAnswer = (TextView) findViewById(R.id.txt_faq_answer);
        this.mFaqIcon = (ImageView) findViewById(R.id.img_faq_open);
        C11914o.m19629a(getViewTreeObserver(), new C11788a());
    }

    /* access modifiers changed from: private */
    public void setExpanded(boolean z) {
        this.mIsExpanded = z;
        if (z) {
            this.mFaqHeader.setOnClickListener(new C11789b());
            this.mTxtFaqAnswer.setVisibility(0);
        } else {
            this.mFaqHeader.setOnClickListener(new C11790c());
            this.mTxtFaqAnswer.setVisibility(8);
        }
        this.mFaqIcon.setRotation(z ? 180.0f : 0.0f);
    }

    public void setFaq(FAQ faq, boolean z) {
        View view = this.mFaqDivider;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        this.mTxtFaqQuestion.setText(faq.getQuestion());
        this.mTxtFaqAnswer.setText(faq.getAnswer());
    }

    public ListingFaqView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet, 0, 0);
    }

    public void setFaq(String str, String str2, boolean z) {
        View view = this.mFaqDivider;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
        this.mTxtFaqQuestion.setText(str);
        this.mTxtFaqAnswer.setText(str2);
    }

    public ListingFaqView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet, i, 0);
    }

    public ListingFaqView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        init(context, attributeSet, i, i2);
    }
}
