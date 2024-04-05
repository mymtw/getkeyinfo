package com.facebook;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.C0126g;
import androidx.fragment.app.Fragment;
import com.etsy.android.R;
import p260v0.C8184a;
import p365hg.C12903s;
import p401mg.C13080a;
import p453tf.C13418j;
import p453tf.C13442y;
import p461uf.C13511h;

public abstract class FacebookButtonBase extends Button {
    private String analyticsButtonCreatedEventName;
    private String analyticsButtonTappedEventName;
    private View.OnClickListener externalOnClickListener;
    private View.OnClickListener internalOnClickListener;
    private boolean overrideCompoundPadding;
    private int overrideCompoundPaddingLeft;
    private int overrideCompoundPaddingRight;
    private C12903s parentFragment;

    /* renamed from: com.facebook.FacebookButtonBase$a */
    public class C12183a implements View.OnClickListener {
        public C12183a() {
        }

        public final void onClick(View view) {
            if (!C13080a.m20762b(this)) {
                try {
                    FacebookButtonBase facebookButtonBase = FacebookButtonBase.this;
                    facebookButtonBase.logButtonTapped(facebookButtonBase.getContext());
                    if (FacebookButtonBase.access$000(FacebookButtonBase.this) != null) {
                        FacebookButtonBase.access$000(FacebookButtonBase.this).onClick(view);
                    } else if (FacebookButtonBase.access$100(FacebookButtonBase.this) != null) {
                        FacebookButtonBase.access$100(FacebookButtonBase.this).onClick(view);
                    }
                } catch (Throwable th) {
                    C13080a.m20761a(this, th);
                }
            }
        }
    }

    public FacebookButtonBase(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        i2 = i2 == 0 ? getDefaultStyleResource() : i2;
        configureButton(context, attributeSet, i, i2 == 0 ? R.style.com_facebook_button : i2);
        this.analyticsButtonCreatedEventName = str;
        this.analyticsButtonTappedEventName = str2;
        setClickable(true);
        setFocusable(true);
    }

    public static /* synthetic */ View.OnClickListener access$000(FacebookButtonBase facebookButtonBase) {
        if (C13080a.m20762b(FacebookButtonBase.class)) {
            return null;
        }
        try {
            return facebookButtonBase.internalOnClickListener;
        } catch (Throwable th) {
            C13080a.m20761a(FacebookButtonBase.class, th);
            return null;
        }
    }

    public static /* synthetic */ View.OnClickListener access$100(FacebookButtonBase facebookButtonBase) {
        if (C13080a.m20762b(FacebookButtonBase.class)) {
            return null;
        }
        try {
            return facebookButtonBase.externalOnClickListener;
        } catch (Throwable th) {
            C13080a.m20761a(FacebookButtonBase.class, th);
            return null;
        }
    }

    private void parseBackgroundAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        if (!C13080a.m20762b(this)) {
            try {
                if (!isInEditMode()) {
                    obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
                    if (obtainStyledAttributes.hasValue(0)) {
                        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                        if (resourceId != 0) {
                            setBackgroundResource(resourceId);
                        } else {
                            setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                        }
                    } else {
                        Object obj = C8184a.f17966a;
                        setBackgroundColor(C8184a.C8188d.m16468a(context, R.color.com_facebook_blue));
                    }
                    obtainStyledAttributes.recycle();
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    @SuppressLint({"ResourceType"})
    private void parseCompoundDrawableAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        if (!C13080a.m20762b(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
                setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
                setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(4, 0));
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private void parseContentAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        if (!C13080a.m20762b(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
                setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private void parseTextAttributes(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes;
        TypedArray obtainStyledAttributes2;
        TypedArray obtainStyledAttributes3;
        if (!C13080a.m20762b(this)) {
            try {
                obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
                setTextColor(obtainStyledAttributes.getColorStateList(0));
                obtainStyledAttributes.recycle();
                obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
                setGravity(obtainStyledAttributes2.getInt(0, 17));
                obtainStyledAttributes2.recycle();
                obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                setTextSize(0, (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0));
                setTypeface(Typeface.create(getTypeface(), 1));
                setText(obtainStyledAttributes3.getString(2));
                obtainStyledAttributes3.recycle();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    private void setupOnClickListener() {
        if (!C13080a.m20762b(this)) {
            try {
                super.setOnClickListener(new C12183a());
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void callExternalOnClickListener(View view) {
        if (!C13080a.m20762b(this)) {
            try {
                View.OnClickListener onClickListener = this.externalOnClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void configureButton(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!C13080a.m20762b(this)) {
            try {
                parseBackgroundAttributes(context, attributeSet, i, i2);
                parseCompoundDrawableAttributes(context, attributeSet, i, i2);
                parseContentAttributes(context, attributeSet, i, i2);
                parseTextAttributes(context, attributeSet, i, i2);
                setupOnClickListener();
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public Activity getActivity() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            Context context = getContext();
            while (!(context instanceof Activity) && (context instanceof ContextWrapper)) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (context instanceof Activity) {
                return (Activity) context;
            }
            throw new FacebookException("Unable to get Activity.");
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public String getAnalyticsButtonCreatedEventName() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            return this.analyticsButtonCreatedEventName;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public String getAnalyticsButtonTappedEventName() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            return this.analyticsButtonTappedEventName;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public C0126g getAndroidxActivityResultRegistryOwner() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            Activity activity = getActivity();
            if (activity instanceof C0126g) {
                return (C0126g) activity;
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public int getCompoundPaddingLeft() {
        if (C13080a.m20762b(this)) {
            return 0;
        }
        try {
            return this.overrideCompoundPadding ? this.overrideCompoundPaddingLeft : super.getCompoundPaddingLeft();
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return 0;
        }
    }

    public int getCompoundPaddingRight() {
        if (C13080a.m20762b(this)) {
            return 0;
        }
        try {
            return this.overrideCompoundPadding ? this.overrideCompoundPaddingRight : super.getCompoundPaddingRight();
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return 0;
        }
    }

    public abstract int getDefaultRequestCode();

    public int getDefaultStyleResource() {
        C13080a.m20762b(this);
        return 0;
    }

    public Fragment getFragment() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C12903s sVar = this.parentFragment;
            if (sVar != null) {
                return sVar.f28451a;
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public android.app.Fragment getNativeFragment() {
        if (C13080a.m20762b(this)) {
            return null;
        }
        try {
            C12903s sVar = this.parentFragment;
            if (sVar != null) {
                return sVar.f28452b;
            }
            return null;
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return null;
        }
    }

    public int getRequestCode() {
        if (C13080a.m20762b(this)) {
            return 0;
        }
        try {
            return getDefaultRequestCode();
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return 0;
        }
    }

    public void logButtonCreated(Context context) {
        if (!C13080a.m20762b(this)) {
            try {
                C13511h hVar = new C13511h(context, (String) null);
                String str = this.analyticsButtonCreatedEventName;
                String str2 = C13418j.f29381a;
                if (C13442y.m21140c()) {
                    hVar.mo46170f(str, (Bundle) null);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void logButtonTapped(Context context) {
        if (!C13080a.m20762b(this)) {
            try {
                C13511h hVar = new C13511h(context, (String) null);
                String str = this.analyticsButtonTappedEventName;
                String str2 = C13418j.f29381a;
                if (C13442y.m21140c()) {
                    hVar.mo46170f(str, (Bundle) null);
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public int measureTextWidth(String str) {
        if (C13080a.m20762b(this)) {
            return 0;
        }
        try {
            return (int) Math.ceil((double) getPaint().measureText(str));
        } catch (Throwable th) {
            C13080a.m20761a(this, th);
            return 0;
        }
    }

    public void onAttachedToWindow() {
        if (!C13080a.m20762b(this)) {
            try {
                super.onAttachedToWindow();
                if (!isInEditMode()) {
                    logButtonCreated(getContext());
                }
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void onDraw(Canvas canvas) {
        if (!C13080a.m20762b(this)) {
            try {
                if ((getGravity() & 1) != 0) {
                    int compoundPaddingLeft = getCompoundPaddingLeft();
                    int compoundPaddingRight = getCompoundPaddingRight();
                    int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - measureTextWidth(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
                    this.overrideCompoundPaddingLeft = compoundPaddingLeft - min;
                    this.overrideCompoundPaddingRight = compoundPaddingRight + min;
                    this.overrideCompoundPadding = true;
                }
                super.onDraw(canvas);
                this.overrideCompoundPadding = false;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void setFragment(Fragment fragment) {
        if (!C13080a.m20762b(this)) {
            try {
                this.parentFragment = new C12903s(fragment);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        if (!C13080a.m20762b(this)) {
            try {
                this.internalOnClickListener = onClickListener;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        if (!C13080a.m20762b(this)) {
            try {
                this.externalOnClickListener = onClickListener;
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }

    public void setFragment(android.app.Fragment fragment) {
        if (!C13080a.m20762b(this)) {
            try {
                this.parentFragment = new C12903s(fragment);
            } catch (Throwable th) {
                C13080a.m20761a(this, th);
            }
        }
    }
}
