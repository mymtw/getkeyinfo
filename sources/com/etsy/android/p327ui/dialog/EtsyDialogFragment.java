package com.etsy.android.p327ui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Message;
import android.support.p013v4.media.C0070b;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C2740a;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.etsy.android.R;
import com.etsy.android.lib.util.C8914m;
import com.etsy.android.uikit.p331ui.dialog.IDialogFragment$WindowMode;
import com.etsy.android.uikit.p331ui.dialog.RetainedNestingDialogFragment;
import com.etsy.android.uikit.util.TrackingOnClickListener;
import com.etsy.android.uikit.view.MaxHeightFrameLayout;
import com.etsy.android.uikit.view.TouchObservableDialog;
import com.google.android.material.card.MaterialCardView;
import p357gf.C12794c;

/* renamed from: com.etsy.android.ui.dialog.EtsyDialogFragment */
public class EtsyDialogFragment extends RetainedNestingDialogFragment {
    private static final int NOT_PENDING_TOUCH_INTERCEPT_PADDING = -1;
    public static final String OPT_X_BUTTON = "x";
    private static final float WINDOW_HEIGHT_RATIO_LARGE_LANDSCAPE = 0.9f;
    private static final float WINDOW_HEIGHT_RATIO_LARGE_PORTRAIT = 0.9f;
    private static final float WINDOW_HEIGHT_RATIO_MEDIUM = 0.56f;
    private static final float WINDOW_HEIGHT_RATIO_MEDIUM_LANDSCAPE = 0.83f;
    private static final float WINDOW_HEIGHT_RATIO_SMALL = 0.45f;
    private static final float WINDOW_WIDTH_RATIO_LARGE_LANDSCAPE = 0.66f;
    private static final float WINDOW_WIDTH_RATIO_LARGE_PORTRAIT = 0.9f;
    private Button mBtnOk;
    private Button mBtnSecondary;
    private MaterialCardView mCardView;
    private View mDialogCard;
    private DialogInterface.OnDismissListener mDismissListener;
    private C8914m mDisplayUtil;
    private View mDivider;
    private Fragment mFragment;
    private int mGravity = 17;
    private View mHeader;
    private boolean mIsReCreation;
    private boolean mIsSpannableTitle = false;
    private int mMaxHeight;
    private int mMaxWidth;
    /* access modifiers changed from: private */
    public View.OnClickListener mOkClickListener;
    private String mOkText;
    private int mPendingTouchInterceptPadding;
    /* access modifiers changed from: private */
    public View.OnClickListener mSecondaryClickListener;
    private String mSecondaryText;
    /* access modifiers changed from: private */
    public boolean mSecondaryWillDismiss;
    private Spannable mSubTitle = new SpannableString("");
    private String mTitle = "";
    /* access modifiers changed from: private */
    public Rect mTouchInterceptRect;
    private TextView mTxtSubTitle;
    private TextView mTxtTitle;
    private TextView mTxtTitleSans;
    /* access modifiers changed from: private */
    public MaxHeightFrameLayout mView;
    /* access modifiers changed from: private */
    public boolean mWillDismiss;
    private int mWindowAnimation;
    private IDialogFragment$WindowMode mWindowMode = IDialogFragment$WindowMode.STANDARD;
    private View mXButton;
    private int mYMargin;

    /* renamed from: com.etsy.android.ui.dialog.EtsyDialogFragment$a */
    public class C9721a extends TrackingOnClickListener {
        public C9721a() {
        }

        public final void onViewClick(View view) {
            if (EtsyDialogFragment.this.mOkClickListener != null) {
                EtsyDialogFragment.this.mOkClickListener.onClick(view);
            }
            if (EtsyDialogFragment.this.mWillDismiss) {
                EtsyDialogFragment.this.dismiss();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.dialog.EtsyDialogFragment$b */
    public class C9722b extends TrackingOnClickListener {
        public C9722b() {
        }

        public final void onViewClick(View view) {
            if (EtsyDialogFragment.this.mSecondaryClickListener != null) {
                EtsyDialogFragment.this.mSecondaryClickListener.onClick(view);
            }
            if (EtsyDialogFragment.this.mSecondaryWillDismiss) {
                EtsyDialogFragment.this.dismiss();
            }
        }
    }

    /* renamed from: com.etsy.android.ui.dialog.EtsyDialogFragment$c */
    public class C9723c implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ int f21517b;

        public C9723c(int i) {
            this.f21517b = i;
        }

        public final void run() {
            Rect rect = new Rect();
            EtsyDialogFragment.this.mView.getHitRect(rect);
            int i = rect.top;
            int i2 = this.f21517b;
            rect.top = i - i2;
            rect.left -= i2;
            rect.right += i2;
            rect.bottom += i2;
            Rect unused = EtsyDialogFragment.this.mTouchInterceptRect = rect;
            if (EtsyDialogFragment.this.getDialog() != null) {
                ((TouchObservableDialog) EtsyDialogFragment.this.getDialog()).setTouchInterceptRect(EtsyDialogFragment.this.mTouchInterceptRect);
            }
        }
    }

    /* renamed from: com.etsy.android.ui.dialog.EtsyDialogFragment$d */
    public static /* synthetic */ class C9724d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21519a;

        static {
            int[] iArr = new int[IDialogFragment$WindowMode.values().length];
            f21519a = iArr;
            try {
                iArr[IDialogFragment$WindowMode.LARGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static EtsyDialogFragment newInstance(Fragment fragment) {
        EtsyDialogFragment etsyDialogFragment = new EtsyDialogFragment();
        etsyDialogFragment.setFragment(fragment);
        return etsyDialogFragment;
    }

    private void updateOkButton() {
        View view;
        if (this.mXButton != null && this.mBtnOk != null) {
            if (TextUtils.isEmpty(this.mOkText)) {
                this.mBtnOk.setVisibility(8);
                this.mXButton.setVisibility(8);
                return;
            }
            if (OPT_X_BUTTON.equalsIgnoreCase(this.mOkText)) {
                this.mXButton.setVisibility(0);
                this.mBtnOk.setVisibility(8);
                view = this.mXButton;
            } else {
                this.mBtnOk.setText(this.mOkText);
                this.mBtnOk.setVisibility(0);
                this.mXButton.setVisibility(8);
                view = this.mBtnOk;
            }
            view.setOnClickListener(new C9721a());
        }
    }

    private void updateSecondaryButton() {
        Button button = this.mBtnSecondary;
        if (button != null) {
            button.setText(this.mSecondaryText);
            this.mBtnSecondary.setVisibility(0);
            this.mBtnSecondary.setOnClickListener(new C9722b());
        }
    }

    private void updateTitle() {
        if (!TextUtils.isEmpty(this.mTitle)) {
            TextView textView = this.mTxtTitle;
            if (textView != null) {
                if (this.mIsSpannableTitle) {
                    textView.setText(Html.fromHtml(this.mTitle), TextView.BufferType.SPANNABLE);
                } else {
                    textView.setText(this.mTitle);
                }
            }
            TextView textView2 = this.mTxtTitleSans;
            if (textView2 != null) {
                if (this.mIsSpannableTitle) {
                    textView2.setText(Html.fromHtml(this.mTitle), TextView.BufferType.SPANNABLE);
                } else {
                    textView2.setText(this.mTitle);
                }
            }
        }
        if (this.mTxtSubTitle == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.mSubTitle.toString())) {
            this.mTxtSubTitle.setText(this.mSubTitle);
            this.mTxtSubTitle.setVisibility(0);
            return;
        }
        this.mTxtSubTitle.setVisibility(8);
    }

    public void dismiss() {
        dismiss(true);
    }

    public void dismissAllowingStateLoss() {
        dismissAllowingStateLoss(true);
    }

    public void enableTouchInterceptPadding(int i) {
        if (getDialog() == null) {
            this.mPendingTouchInterceptPadding = i;
        } else {
            this.mView.post(new C9723c(i));
        }
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight(IDialogFragment$WindowMode iDialogFragment$WindowMode) {
        if (C9724d.f21519a[iDialogFragment$WindowMode.ordinal()] != 1) {
            return 0;
        }
        return (int) (((float) this.mDisplayUtil.f19670a.heightPixels) * 0.9f);
    }

    public int getMinWidth(IDialogFragment$WindowMode iDialogFragment$WindowMode) {
        boolean z = false;
        if (C9724d.f21519a[iDialogFragment$WindowMode.ordinal()] != 1) {
            return 0;
        }
        DisplayMetrics displayMetrics = this.mDisplayUtil.f19670a;
        int i = displayMetrics.heightPixels;
        int i2 = displayMetrics.widthPixels;
        if (i < i2) {
            z = true;
        }
        return (int) (((float) i2) * (z ? WINDOW_WIDTH_RATIO_LARGE_LANDSCAPE : 0.9f));
    }

    public int getWindowAnimation() {
        return this.mWindowAnimation;
    }

    public void hideHeader() {
        this.mHeader.setVisibility(8);
        this.mDivider.setVisibility(8);
    }

    public void hideHeaderAndClearBackground() {
        hideHeader();
        this.mDialogCard.setBackgroundColor(getResources().getColor(R.color.transparent));
    }

    public void layoutWindow() {
        if (getDialog() != null) {
            Window window = getDialog().getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = this.mGravity;
            C8914m mVar = this.mDisplayUtil;
            mVar.f19671b.getDefaultDisplay().getMetrics(mVar.f19670a);
            if (this.mWindowMode != IDialogFragment$WindowMode.STANDARD) {
                attributes.width = Math.min(this.mMaxWidth, this.mDisplayUtil.f19670a.widthPixels);
            }
            IDialogFragment$WindowMode iDialogFragment$WindowMode = this.mWindowMode;
            IDialogFragment$WindowMode iDialogFragment$WindowMode2 = IDialogFragment$WindowMode.WRAP_ALL;
            if (iDialogFragment$WindowMode == iDialogFragment$WindowMode2) {
                attributes.width = -2;
            }
            if (iDialogFragment$WindowMode == IDialogFragment$WindowMode.SMALL || iDialogFragment$WindowMode == IDialogFragment$WindowMode.MEDIUM) {
                float f = WINDOW_HEIGHT_RATIO_SMALL;
                if (iDialogFragment$WindowMode == IDialogFragment$WindowMode.MEDIUM) {
                    DisplayMetrics displayMetrics = this.mDisplayUtil.f19670a;
                    f = displayMetrics.heightPixels < displayMetrics.widthPixels ? WINDOW_HEIGHT_RATIO_MEDIUM_LANDSCAPE : WINDOW_HEIGHT_RATIO_MEDIUM;
                }
                this.mMaxHeight = (int) (((float) this.mDisplayUtil.f19670a.heightPixels) * f);
            } else {
                IDialogFragment$WindowMode iDialogFragment$WindowMode3 = IDialogFragment$WindowMode.LARGE;
                if (iDialogFragment$WindowMode == iDialogFragment$WindowMode3) {
                    this.mMaxHeight = getMinHeight(iDialogFragment$WindowMode3);
                    int minWidth = getMinWidth(iDialogFragment$WindowMode3);
                    this.mMaxWidth = minWidth;
                    attributes.width = minWidth;
                    attributes.height = -2;
                } else if (iDialogFragment$WindowMode == IDialogFragment$WindowMode.WRAP || iDialogFragment$WindowMode == iDialogFragment$WindowMode2) {
                    attributes.height = -2;
                }
            }
            int i = this.mMaxHeight;
            if (i > 0) {
                this.mView.setMaxHeight(i);
            }
            int i2 = this.mYMargin;
            if (i2 > 0) {
                attributes.y = i2;
            }
            int i3 = this.mWindowAnimation;
            if (i3 != 0) {
                window.setWindowAnimations(i3);
            }
            window.setAttributes(attributes);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Fragment fragment = this.mFragment;
        if (fragment != null) {
            fragment.onActivityResult(i, i2, intent);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        layoutWindow();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean z = false;
        setCancelable(false);
        this.mIsReCreation = bundle != null;
        boolean z2 = getArguments() != null ? getArguments().getBoolean("USE_DIM", false) : false;
        if (getArguments() != null) {
            z = getArguments().getBoolean("new_sign_in_flow", false);
        }
        this.mPendingTouchInterceptPadding = -1;
        this.mMaxWidth = getResources().getDimensionPixelSize(R.dimen.dialog_max_width);
        if (z) {
            setStyle(1, 2132017688);
        } else {
            setStyle(1, z2 ? R.style.EtsyLibDialogStyle : 2132017689);
        }
        this.mDisplayUtil = new C8914m(getActivity());
    }

    public Dialog onCreateDialog(Bundle bundle) {
        setCancelable(false);
        int i = this.mPendingTouchInterceptPadding;
        if (i != -1) {
            enableTouchInterceptPadding(i);
            this.mPendingTouchInterceptPadding = -1;
        }
        return new TouchObservableDialog(getActivity(), this, getTheme(), R.id.inner_fragment_container);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MaxHeightFrameLayout maxHeightFrameLayout = (MaxHeightFrameLayout) layoutInflater.inflate(R.layout.fragment_dialog, viewGroup, false);
        this.mView = maxHeightFrameLayout;
        this.mTxtTitle = (TextView) maxHeightFrameLayout.findViewById(R.id.txt_title);
        this.mTxtTitleSans = (TextView) this.mView.findViewById(R.id.txt_title_sans);
        this.mTxtSubTitle = (TextView) this.mView.findViewById(R.id.txt_subtitle);
        this.mHeader = this.mView.findViewById(R.id.dialog_header);
        this.mDialogCard = this.mView.findViewById(R.id.dialog_card);
        this.mBtnOk = (Button) this.mView.findViewById(R.id.btn_ok);
        this.mXButton = this.mView.findViewById(R.id.btn_x);
        this.mBtnSecondary = (Button) this.mView.findViewById(R.id.btn_secondary);
        this.mDivider = this.mView.findViewById(R.id.divider);
        this.mCardView = (MaterialCardView) this.mView.findViewById(R.id.materialCardView);
        return this.mView;
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage((Message) null);
        }
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        if (this.mIsReCreation) {
            dismissAllowingStateLoss();
        } else {
            layoutWindow();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (bundle == null) {
            FragmentManager childFragmentManager = getChildFragmentManager();
            C2740a c = C0070b.m182c(childFragmentManager, childFragmentManager);
            c.mo10531h(R.id.inner_fragment_container, this.mFragment, (String) null);
            c.mo10483d();
        }
        updateTitle();
        updateOkButton();
    }

    public void removeParentMargins() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mCardView.getLayoutParams();
        marginLayoutParams.setMargins(0, 0, 0, 0);
        marginLayoutParams.setMarginEnd(0);
        marginLayoutParams.setMarginStart(0);
        this.mCardView.setRadius(0.0f);
        this.mCardView.setElevation(0.0f);
        this.mCardView.requestLayout();
    }

    public void setDialogGravity(int i) {
        this.mGravity = i;
    }

    public void setDividerShown(boolean z) {
        this.mDivider.setVisibility(z ? 0 : 4);
    }

    public void setFragment(Fragment fragment) {
        this.mFragment = fragment;
    }

    public void setIsSpannableTitle(boolean z) {
        this.mIsSpannableTitle = z;
    }

    public void setMaxHeight(int i) {
        this.mMaxHeight = i;
    }

    public void setMaxWidth(int i) {
        this.mMaxWidth = i;
    }

    public void setOkButton(String str, View.OnClickListener onClickListener, boolean z) {
        this.mOkText = str;
        this.mOkClickListener = onClickListener;
        this.mWillDismiss = z;
        updateOkButton();
    }

    public void setOkButtonEnabled(boolean z) {
        Button button = this.mBtnOk;
        if (button != null) {
            button.setEnabled(z);
        }
    }

    public void setOkButtonVisibility(int i) {
        Button button = this.mBtnOk;
        if (button != null) {
            button.setVisibility(i);
        }
    }

    public void setOkClickListener(View.OnClickListener onClickListener, boolean z) {
        this.mOkClickListener = onClickListener;
        this.mWillDismiss = z;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.mDismissListener = onDismissListener;
    }

    public void setSecondaryButton(int i, View.OnClickListener onClickListener, boolean z) {
        this.mSecondaryText = getString(i);
        this.mSecondaryClickListener = onClickListener;
        this.mSecondaryWillDismiss = z;
        updateSecondaryButton();
    }

    public void setSecondaryButtonVisibility(int i) {
        Button button = this.mBtnSecondary;
        if (button != null) {
            button.setVisibility(i);
        }
    }

    public void setStatusBarColor(int i) {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(67108864);
            window.setStatusBarColor(i);
        }
    }

    public void setSubTitle(String str) {
        this.mSubTitle = new SpannableString(str);
        updateTitle();
    }

    public void setTitle(String str) {
        this.mTitle = str;
        updateTitle();
    }

    public void setWindowAnimation(int i) {
        this.mWindowAnimation = i;
    }

    public void setWindowBackgroundDim(float f) {
        Window window = getDialog().getWindow();
        window.addFlags(2);
        window.setDimAmount(f);
    }

    public void setWindowMode(IDialogFragment$WindowMode iDialogFragment$WindowMode) {
        if (this.mWindowMode != iDialogFragment$WindowMode) {
            this.mWindowMode = iDialogFragment$WindowMode;
            layoutWindow();
        }
    }

    public void setWindowYMargin(int i) {
        this.mYMargin = i;
    }

    public void showHeader() {
        this.mHeader.setVisibility(0);
        this.mDivider.setVisibility(0);
    }

    public void dismiss(boolean z) {
        DialogInterface.OnDismissListener onDismissListener;
        super.dismiss();
        if (z && (onDismissListener = this.mDismissListener) != null) {
            onDismissListener.onDismiss(getDialog());
        }
        Fragment fragment = this.mFragment;
        if (fragment instanceof C12794c) {
            ((C12794c) fragment).handleBackPressed();
        }
    }

    public void dismissAllowingStateLoss(boolean z) {
        DialogInterface.OnDismissListener onDismissListener;
        super.dismissAllowingStateLoss();
        if (z && (onDismissListener = this.mDismissListener) != null) {
            onDismissListener.onDismiss(getDialog());
        }
        Fragment fragment = this.mFragment;
        if (fragment instanceof C12794c) {
            ((C12794c) fragment).handleBackPressed();
        }
    }

    public void setSubTitle(Spannable spannable) {
        this.mSubTitle = spannable;
        updateTitle();
    }
}
