package com.paypal.checkout.paymentbutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.p015ui.text.input.C1993m;
import androidx.room.C3252r;
import com.braze.p044ui.inappmessage.factories.C5651e;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.android.material.shape.C15401a;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.paypal.checkout.PayPalCheckout;
import com.paypal.checkout.approve.OnApprove;
import com.paypal.checkout.cancel.OnCancel;
import com.paypal.checkout.createorder.CreateOrder;
import com.paypal.checkout.error.OnError;
import com.paypal.checkout.fundingeligibility.FundingEligibilityData;
import com.paypal.checkout.fundingeligibility.FundingEligibilityItem;
import com.paypal.checkout.fundingeligibility.FundingEligibilityResponse;
import com.paypal.checkout.paymentbutton.PaymentButtonColor;
import com.paypal.checkout.paymentbutton.PaymentButtonEligibilityStatus;
import com.paypal.checkout.shipping.OnShippingChange;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.NetworkEventTypes;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.extensions.AnyExtensionsKt;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.C19707i1;
import kotlinx.coroutines.C19760n0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.internal.C19729m;
import p260v0.C8184a;
import p550dl.C17578d;
import p550dl.C17583i;
import p579hi.C17811c;
import p753kq.C19857l;
import p768rq.C20153b;

public abstract class PaymentButton<C extends PaymentButtonColor> extends LinearLayout {
    private static final long CLICK_DELAY = 1000;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EXCEPTION_CREATE_ORDER_NOT_SET = "PaymentButton was clicked but createOrder was not set. Please invoke PaymentButton#setup before the buyer has the opportunity to interact with the PaymentButton.";
    private static final String EXCEPTION_SET_ON_CLICK_LISTENER = "Invoking setOnClickListener on PaymentButton is not supported. The button's click listener is handled internally.";
    private static final long RETRY_TIMEOUT = 30000;
    public Map<Integer, View> _$_findViewCache;
    private CreateOrder createOrder;
    private final EventListener eligibilityEventListener;
    private C19699g1 eligibilityJob;
    private PaymentButtonEligibilityStatus eligibilityStatus;
    private boolean launchingPaysheet;
    private MaterialShapeDrawable materialShapeDrawable;
    private final EventListener networkEventListener;
    private final Runnable noEligibilityRunnable;
    private C19857l<? super PaymentButtonEligibilityStatus, C19394m> onEligibilityStatusChanged;
    private ImageView payPalWordmarkImage;
    private PaymentButtonEligibilityStatusChanged paymentButtonEligibilityStatusChanged;
    private String prefixText;
    private TextView prefixTextView;
    private int prefixTextVisibility;
    private ProgressBar progressBar;
    private PaymentButtonShape shape;
    private C15401a shapeAppearanceModel;
    private boolean shapeHasChanged;
    private PaymentButtonSize size;
    private String suffixText;
    private TextView suffixTextView;
    private int suffixTextVisibility;
    private final String tag;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[PaymentButtonShape.values().length];
            iArr[PaymentButtonShape.ROUNDED.ordinal()] = 1;
            iArr[PaymentButtonShape.PILL.ordinal()] = 2;
            iArr[PaymentButtonShape.RECTANGLE.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[PaymentButtonFundingType.values().length];
            iArr2[PaymentButtonFundingType.PAYPAL.ordinal()] = 1;
            iArr2[PaymentButtonFundingType.PAY_LATER.ordinal()] = 2;
            iArr2[PaymentButtonFundingType.PAYPAL_CREDIT.ordinal()] = 3;
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[PaymentButtonColorLuminance.values().length];
            iArr3[PaymentButtonColorLuminance.LIGHT.ordinal()] = 1;
            iArr3[PaymentButtonColorLuminance.DARK.ordinal()] = 2;
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void checkShouldRetrieveFundingEligibility(Success<?> success) {
        boolean z;
        if (success != null) {
            Object data = success.getData();
            if (data != null) {
                z = ((Boolean) data).booleanValue();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            }
        } else {
            z = false;
        }
        if (z) {
            retrieveFundingEligibility();
        } else {
            Events.Companion.getInstance().listen(NetworkEventTypes.NETWORK_AVAILABILITY, this.networkEventListener);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: eligibilityEventListener$lambda-0  reason: not valid java name */
    public static final void m35146eligibilityEventListener$lambda0(PaymentButton paymentButton, EventType eventType, ResultData resultData) {
        C19383o.m32797g(paymentButton, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (resultData != null && (resultData instanceof Success)) {
            Success success = (Success) resultData;
            if (success.getData() instanceof FundingEligibilityResponse) {
                Handler handler = paymentButton.getHandler();
                if (handler != null) {
                    handler.removeCallbacks(paymentButton.noEligibilityRunnable);
                }
                paymentButton.updateEligibilityStatus((FundingEligibilityResponse) success.getData());
            }
        }
    }

    private final PaymentButtonColorLuminance getColorLuminance() {
        return getColor().getLuminance();
    }

    private final void initAttributes(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C17165R.styleable.PaymentButton);
        C19383o.m32796f(obtainStyledAttributes, "context.obtainStyledAttr….styleable.PaymentButton)");
        updateSizeFrom(obtainStyledAttributes);
        updateShapeFrom(obtainStyledAttributes, attributeSet, i);
        C19394m mVar = C19394m.f43287a;
        obtainStyledAttributes.recycle();
    }

    private final void initClickListener() {
        super.setOnClickListener(new C5651e(this, 3));
    }

    /* access modifiers changed from: private */
    /* renamed from: initClickListener$lambda-7  reason: not valid java name */
    public static final void m35147initClickListener$lambda7(PaymentButton paymentButton, View view) {
        C19383o.m32797g(paymentButton, "this$0");
        PLog.click$default(PEnums.TransitionName.NXO_SPB_CONTAINER_ON_CLICK, PEnums.Outcome.CLICKED, PEnums.EventCode.E647, PEnums.StateName.STARTUP, view instanceof PayLaterButton ? "PayLater button onClick is triggered" : view instanceof PayPalCreditButton ? "PayPalCredit button onClick is triggered" : "PayPal button onClick is triggered", (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 480, (Object) null);
        if (!paymentButton.launchingPaysheet) {
            paymentButton.launchPaySheet();
            paymentButton.launchingPaysheet = true;
            new Handler(Looper.getMainLooper()).postDelayed(new C17811c(paymentButton, 2), 1000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initClickListener$lambda-7$lambda-6  reason: not valid java name */
    public static final void m35148initClickListener$lambda7$lambda6(PaymentButton paymentButton) {
        C19383o.m32797g(paymentButton, "this$0");
        paymentButton.launchingPaysheet = false;
    }

    private final void launchPaySheet() {
        if (this.createOrder != null) {
            DebugConfigManager.getInstance().setPaymentButtonFundingType(getFundingType$pyplcheckout_externalThreedsRelease());
            CreateOrder createOrder2 = this.createOrder;
            if (createOrder2 != null) {
                PayPalCheckout.startCheckout(createOrder2);
            } else {
                C19383o.m32805o("createOrder");
                throw null;
            }
        } else {
            throw new IllegalStateException(EXCEPTION_CREATE_ORDER_NOT_SET);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: networkEventListener$lambda-1  reason: not valid java name */
    public static final void m35149networkEventListener$lambda1(PaymentButton paymentButton, EventType eventType, ResultData resultData) {
        C19383o.m32797g(paymentButton, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        if (resultData != null && (resultData instanceof Success)) {
            Object data = ((Success) resultData).getData();
            if (data == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
            } else if (((Boolean) data).booleanValue()) {
                paymentButton.retrieveFundingEligibility();
            }
        }
    }

    private final void noEligibilityFound() {
        setEligibilityStatus(PaymentButtonEligibilityStatus.Error.INSTANCE);
    }

    /* access modifiers changed from: private */
    /* renamed from: noEligibilityRunnable$lambda-2  reason: not valid java name */
    public static final void m35150noEligibilityRunnable$lambda2(PaymentButton paymentButton) {
        C19383o.m32797g(paymentButton, "this$0");
        paymentButton.noEligibilityFound();
    }

    private final void renderButtonForEligibility() {
        PaymentButtonEligibilityStatus paymentButtonEligibilityStatus = this.eligibilityStatus;
        boolean z = true;
        if (C19383o.m32792b(paymentButtonEligibilityStatus, PaymentButtonEligibilityStatus.Eligible.INSTANCE)) {
            this.progressBar.setVisibility(8);
            this.payPalWordmarkImage.setVisibility(0);
            updateShapeDrawableFillColor(getColor());
            updateSuffixTextVisibility();
            updatePrefixTextVisibility();
            setEnabled(true);
            setVisibility(0);
        } else {
            if (!C19383o.m32792b(paymentButtonEligibilityStatus, PaymentButtonEligibilityStatus.Ineligible.INSTANCE)) {
                z = C19383o.m32792b(paymentButtonEligibilityStatus, PaymentButtonEligibilityStatus.Error.INSTANCE);
            }
            if (z) {
                setEnabled(false);
                setVisibility(8);
            } else if (C19383o.m32792b(paymentButtonEligibilityStatus, PaymentButtonEligibilityStatus.Loading.INSTANCE)) {
                setEnabled(false);
                this.payPalWordmarkImage.setVisibility(8);
                this.progressBar.setVisibility(0);
                MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
                materialShapeDrawable2.setFillColor(C8184a.m16459b(getContext(), C17165R.color.paypal_silver));
                setMaterialShapeDrawable(materialShapeDrawable2);
                setVisibility(0);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        AnyExtensionsKt.getExhaustive(C19394m.f43287a);
    }

    private final void retrieveFundingEligibility() {
        Events.Companion.getInstance().removeListener(NetworkEventTypes.NETWORK_AVAILABILITY, this.networkEventListener);
        C19707i1 l = C1993m.m4368l();
        C20153b bVar = C19760n0.f43719a;
        this.eligibilityJob = C19697g.m33468f(C19697g.m33463a(l.plus(C19729m.f43681a)), (CoroutineContext) null, (CoroutineStart) null, new PaymentButton$retrieveFundingEligibility$1((C19340c<? super PaymentButton$retrieveFundingEligibility$1>) null), 3);
    }

    private final void setEligibilityStatus(PaymentButtonEligibilityStatus paymentButtonEligibilityStatus) {
        this.eligibilityStatus = paymentButtonEligibilityStatus;
        String str = this.tag;
        C19383o.m32796f(str, "tag");
        PaymentButtonEligibilityStatus paymentButtonEligibilityStatus2 = this.eligibilityStatus;
        PLog.m28728dR(str, "eligibility status updated: " + paymentButtonEligibilityStatus2);
        renderButtonForEligibility();
        C19857l<? super PaymentButtonEligibilityStatus, C19394m> lVar = this.onEligibilityStatusChanged;
        if (lVar != null) {
            lVar.invoke(this.eligibilityStatus);
        }
        PaymentButtonEligibilityStatusChanged paymentButtonEligibilityStatusChanged2 = this.paymentButtonEligibilityStatusChanged;
        if (paymentButtonEligibilityStatusChanged2 != null) {
            paymentButtonEligibilityStatusChanged2.onPaymentButtonEligibilityStatusChanged(this.eligibilityStatus);
        }
    }

    private final void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable2) {
        this.materialShapeDrawable = materialShapeDrawable2;
        setBackground(materialShapeDrawable2);
    }

    private final void setShapeAppearanceModel(C15401a aVar) {
        this.shapeAppearanceModel = aVar;
        MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
        materialShapeDrawable2.setShapeAppearanceModel(aVar);
        setMaterialShapeDrawable(materialShapeDrawable2);
    }

    public static /* synthetic */ void setup$default(PaymentButton paymentButton, CreateOrder createOrder2, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel, OnError onError, int i, Object obj) {
        if (obj == null) {
            paymentButton.setup(createOrder2, (i & 2) != 0 ? null : onApprove, (i & 4) != 0 ? null : onShippingChange, (i & 8) != 0 ? null : onCancel, (i & 16) != 0 ? null : onError);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setup");
    }

    private final void updateButtonStroke() {
        MaterialShapeDrawable materialShapeDrawable2;
        if (getColor().getHasOutline()) {
            Context context = getContext();
            int i = C17165R.color.paypal_spb_on_white_stroke;
            Object obj = C8184a.f17966a;
            int a = C8184a.C8188d.m16468a(context, i);
            float dimension = getResources().getDimension(C17165R.dimen.paypal_payment_button_stroke_width);
            materialShapeDrawable2 = this.materialShapeDrawable;
            materialShapeDrawable2.setStroke(dimension, a);
        } else {
            Context context2 = getContext();
            Object obj2 = C8184a.f17966a;
            int a2 = C8184a.C8188d.m16468a(context2, 17170445);
            materialShapeDrawable2 = this.materialShapeDrawable;
            materialShapeDrawable2.setStroke(0.0f, a2);
        }
        setMaterialShapeDrawable(materialShapeDrawable2);
    }

    private final void updateButtonTextColor() {
        int i;
        int i2 = WhenMappings.$EnumSwitchMapping$2[getColorLuminance().ordinal()];
        if (i2 == 1) {
            Context context = getContext();
            int i3 = C17165R.color.paypal_spb_on_light_surface;
            Object obj = C8184a.f17966a;
            i = C8184a.C8188d.m16468a(context, i3);
        } else if (i2 == 2) {
            Context context2 = getContext();
            int i4 = C17165R.color.paypal_spb_on_dark_surface;
            Object obj2 = C8184a.f17966a;
            i = C8184a.C8188d.m16468a(context2, i4);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.prefixTextView.setTextColor(i);
        this.suffixTextView.setTextColor(i);
    }

    private final void updateButtonWordmark() {
        Drawable drawable;
        int i = WhenMappings.$EnumSwitchMapping$2[getColorLuminance().ordinal()];
        if (i == 1) {
            Context context = getContext();
            int wordmarkLightLuminanceResId = getWordmarkLightLuminanceResId();
            Object obj = C8184a.f17966a;
            drawable = C8184a.C8187c.m16466b(context, wordmarkLightLuminanceResId);
        } else if (i == 2) {
            Context context2 = getContext();
            int wordmarkDarkLuminanceResId = getWordmarkDarkLuminanceResId();
            Object obj2 = C8184a.f17966a;
            drawable = C8184a.C8187c.m16466b(context2, wordmarkDarkLuminanceResId);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.payPalWordmarkImage.setImageDrawable(drawable);
    }

    private final void updateEligibility() {
        FundingEligibilityResponse fundingEligibilityResponse = DebugConfigManager.getInstance().getFundingEligibilityResponse();
        if (fundingEligibilityResponse == null) {
            getHandler().postDelayed(this.noEligibilityRunnable, RETRY_TIMEOUT);
            Events.Companion.getInstance().listen(PayPalEventTypes.FUNDING_ELIGIBILITY_RESPONSE, this.eligibilityEventListener);
            return;
        }
        updateEligibilityStatus(fundingEligibilityResponse);
    }

    private final void updateEligibilityStatus(FundingEligibilityResponse fundingEligibilityResponse) {
        FundingEligibilityItem fundingEligibilityItem;
        FundingEligibilityData data = fundingEligibilityResponse.getData();
        if (data != null) {
            int i = WhenMappings.$EnumSwitchMapping$1[getFundingType$pyplcheckout_externalThreedsRelease().ordinal()];
            if (i == 1) {
                fundingEligibilityItem = data.getFundingEligibility().getPaypal();
            } else if (i == 2) {
                fundingEligibilityItem = data.getFundingEligibility().getPaylater();
            } else if (i == 3) {
                fundingEligibilityItem = data.getFundingEligibility().getCredit();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            setEligibilityStatus(fundingEligibilityItem.getEligible() ? PaymentButtonEligibilityStatus.Eligible.INSTANCE : PaymentButtonEligibilityStatus.Ineligible.INSTANCE);
        }
    }

    private final void updateFundingEligibility() {
        checkShouldRetrieveFundingEligibility(Events.Companion.getInstance().getLastSuccessDataForEvent(NetworkEventTypes.NETWORK_AVAILABILITY));
    }

    private final void updatePrefixTextVisibility() {
        if (this.eligibilityStatus instanceof PaymentButtonEligibilityStatus.Loading) {
            this.prefixTextView.setVisibility(8);
        } else {
            this.prefixTextView.setVisibility(this.prefixTextVisibility);
        }
    }

    private final void updateShapeFrom(TypedArray typedArray, AttributeSet attributeSet, int i) {
        int i2 = C17165R.styleable.PaymentButton_payment_button_shape;
        if (typedArray.hasValue(i2)) {
            setShape(PaymentButtonShape.Companion.invoke(typedArray.getInt(i2, PaymentButtonShape.ROUNDED.getValue())));
            return;
        }
        useThemeShapeAppearance(attributeSet, i);
    }

    private final void updateSizeFrom(TypedArray typedArray) {
        setSize(PaymentButtonSize.Companion.invoke(typedArray.getInt(C17165R.styleable.PaymentButton_payment_button_size, PaymentButtonSize.MEDIUM.getValue())));
    }

    private final void updateSuffixTextVisibility() {
        if (this.eligibilityStatus instanceof PaymentButtonEligibilityStatus.Loading) {
            this.suffixTextView.setVisibility(8);
        } else {
            this.suffixTextView.setVisibility(this.suffixTextVisibility);
        }
    }

    private final void useThemeShapeAppearance(AttributeSet attributeSet, int i) {
        setShapeAppearanceModel(C15401a.m24981b(getContext(), attributeSet, i, C17165R.C17171style.Widget_MaterialComponents_Button).mo54616a());
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

    public abstract C getColor();

    public final PaymentButtonEligibilityStatus getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    public abstract PaymentButtonFundingType getFundingType$pyplcheckout_externalThreedsRelease();

    public final C19857l<PaymentButtonEligibilityStatus, C19394m> getOnEligibilityStatusChanged() {
        return this.onEligibilityStatusChanged;
    }

    public final PaymentButtonEligibilityStatusChanged getPaymentButtonEligibilityStatusChanged() {
        return this.paymentButtonEligibilityStatusChanged;
    }

    public final String getPrefixText() {
        return this.prefixText;
    }

    public final int getPrefixTextVisibility() {
        return this.prefixTextVisibility;
    }

    public final PaymentButtonShape getShape() {
        return this.shape;
    }

    public final PaymentButtonSize getSize() {
        return this.size;
    }

    public final String getSuffixText() {
        return this.suffixText;
    }

    public final int getSuffixTextVisibility() {
        return this.suffixTextVisibility;
    }

    public abstract int getWordmarkDarkLuminanceResId();

    public abstract int getWordmarkLightLuminanceResId();

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateEligibility();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Events.Companion.getInstance().removeListener(PayPalEventTypes.FUNDING_ELIGIBILITY_RESPONSE, this.eligibilityEventListener);
        C19699g1 g1Var = this.eligibilityJob;
        if (g1Var != null) {
            g1Var.mo72134a((CancellationException) null);
        }
    }

    public void onDraw(Canvas canvas) {
        PaymentButtonShape paymentButtonShape = this.shape;
        PaymentButtonShape paymentButtonShape2 = PaymentButtonShape.PILL;
        if (paymentButtonShape == paymentButtonShape2 && this.shapeHasChanged) {
            setShape(paymentButtonShape2);
        }
        super.onDraw(canvas);
    }

    public abstract void setColor(C c);

    public void setOnClickListener(View.OnClickListener onClickListener) {
        throw new UnsupportedOperationException(EXCEPTION_SET_ON_CLICK_LISTENER);
    }

    public final void setOnEligibilityStatusChanged(C19857l<? super PaymentButtonEligibilityStatus, C19394m> lVar) {
        this.onEligibilityStatusChanged = lVar;
        if (lVar != null) {
            lVar.invoke(this.eligibilityStatus);
        }
    }

    public final void setPaymentButtonEligibilityStatusChanged(PaymentButtonEligibilityStatusChanged paymentButtonEligibilityStatusChanged2) {
        this.paymentButtonEligibilityStatusChanged = paymentButtonEligibilityStatusChanged2;
        if (paymentButtonEligibilityStatusChanged2 != null) {
            paymentButtonEligibilityStatusChanged2.onPaymentButtonEligibilityStatusChanged(this.eligibilityStatus);
        }
    }

    public final void setPrefixText(String str) {
        this.prefixText = str;
        this.prefixTextView.setText(str);
    }

    public final void setPrefixTextVisibility(int i) {
        this.prefixTextVisibility = i;
        updatePrefixTextVisibility();
    }

    public final void setShape(PaymentButtonShape paymentButtonShape) {
        float f;
        C19388s sVar;
        C19383o.m32797g(paymentButtonShape, "value");
        this.shapeHasChanged = this.shape != paymentButtonShape;
        this.shape = paymentButtonShape;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i = iArr[paymentButtonShape.ordinal()];
        if (i == 1) {
            f = getResources().getDimension(C17165R.dimen.paypal_payment_button_corner_radius_rounded);
        } else if (i == 2) {
            f = (float) getHeight();
        } else if (i == 3) {
            f = getResources().getDimension(C17165R.dimen.paypal_payment_button_corner_radius_square);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        int i2 = iArr[this.shape.ordinal()];
        if (i2 == 1 || i2 == 2) {
            sVar = new C17583i();
        } else if (i2 == 3) {
            sVar = new C17578d();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C15401a.C15402a aVar = new C15401a.C15402a();
        aVar.mo54617c(f);
        aVar.f34583a = sVar;
        float b = C15401a.C15402a.m24987b(sVar);
        if (b != -1.0f) {
            aVar.mo54620f(b);
        }
        aVar.f34584b = sVar;
        float b2 = C15401a.C15402a.m24987b(sVar);
        if (b2 != -1.0f) {
            aVar.mo54621g(b2);
        }
        aVar.f34585c = sVar;
        float b3 = C15401a.C15402a.m24987b(sVar);
        if (b3 != -1.0f) {
            aVar.mo54619e(b3);
        }
        aVar.f34586d = sVar;
        float b4 = C15401a.C15402a.m24987b(sVar);
        if (b4 != -1.0f) {
            aVar.mo54618d(b4);
        }
        setShapeAppearanceModel(new C15401a(aVar));
    }

    public final void setSize(PaymentButtonSize paymentButtonSize) {
        C19383o.m32797g(paymentButtonSize, "value");
        this.size = paymentButtonSize;
        setMinimumHeight((int) getResources().getDimension(this.size.getMinHeightResId()));
        int dimension = (int) getResources().getDimension(this.size.getVerticalPaddingResId());
        setPadding(getPaddingLeft(), dimension, getPaddingRight(), dimension);
        float dimension2 = getResources().getDimension(this.size.getLabelTextSizeResId());
        this.prefixTextView.setTextSize(0, dimension2);
        this.suffixTextView.setTextSize(0, dimension2);
    }

    public final void setSuffixText(String str) {
        this.suffixText = str;
        this.suffixTextView.setText(str);
    }

    public final void setSuffixTextVisibility(int i) {
        this.suffixTextVisibility = i;
        updateSuffixTextVisibility();
    }

    public void setVisibility(int i) {
        PaymentButtonEligibilityStatus paymentButtonEligibilityStatus = this.eligibilityStatus;
        if (!(paymentButtonEligibilityStatus instanceof PaymentButtonEligibilityStatus.Eligible ? true : C19383o.m32792b(paymentButtonEligibilityStatus, PaymentButtonEligibilityStatus.Loading.INSTANCE))) {
            i = 8;
        }
        super.setVisibility(i);
    }

    public final void setup(CreateOrder createOrder2) {
        C19383o.m32797g(createOrder2, "createOrder");
        setup$default(this, createOrder2, (OnApprove) null, (OnShippingChange) null, (OnCancel) null, (OnError) null, 30, (Object) null);
    }

    public final void setup(CreateOrder createOrder2, OnApprove onApprove) {
        C19383o.m32797g(createOrder2, "createOrder");
        setup$default(this, createOrder2, onApprove, (OnShippingChange) null, (OnCancel) null, (OnError) null, 28, (Object) null);
    }

    public final void setup(CreateOrder createOrder2, OnApprove onApprove, OnShippingChange onShippingChange) {
        C19383o.m32797g(createOrder2, "createOrder");
        setup$default(this, createOrder2, onApprove, onShippingChange, (OnCancel) null, (OnError) null, 24, (Object) null);
    }

    public final void setup(CreateOrder createOrder2, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel) {
        C19383o.m32797g(createOrder2, "createOrder");
        setup$default(this, createOrder2, onApprove, onShippingChange, onCancel, (OnError) null, 16, (Object) null);
    }

    public final void setup(CreateOrder createOrder2, OnApprove onApprove, OnShippingChange onShippingChange, OnCancel onCancel, OnError onError) {
        C19383o.m32797g(createOrder2, "createOrder");
        this.createOrder = createOrder2;
        PayPalCheckout.registerCallbacks(onApprove, onShippingChange, onCancel, onError);
    }

    public final void updateShapeDrawableFillColor(C c) {
        C19383o.m32797g(c, "updatedColor");
        if (C19383o.m32792b(this.eligibilityStatus, PaymentButtonEligibilityStatus.Eligible.INSTANCE)) {
            MaterialShapeDrawable materialShapeDrawable2 = this.materialShapeDrawable;
            Context context = getContext();
            C19383o.m32796f(context, ResponseConstants.CONTEXT);
            materialShapeDrawable2.setFillColor(c.retrieveColorResource(context));
            updateButtonStroke();
            setMaterialShapeDrawable(materialShapeDrawable2);
            updateButtonWordmark();
            updateButtonTextColor();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.tag = getClass().getSimpleName();
        this.eligibilityEventListener = new C17143a(this, 0);
        this.networkEventListener = new C17144b(this, 0);
        this.noEligibilityRunnable = new C3252r(this, 4);
        this.shapeAppearanceModel = new C15401a();
        this.materialShapeDrawable = new MaterialShapeDrawable();
        PaymentButtonEligibilityStatus.Loading loading = PaymentButtonEligibilityStatus.Loading.INSTANCE;
        this.eligibilityStatus = loading;
        this.prefixTextVisibility = 8;
        this.shape = PaymentButtonShape.ROUNDED;
        this.suffixTextVisibility = 8;
        this.size = PaymentButtonSize.MEDIUM;
        LayoutInflater.from(context).inflate(C17165R.C17169layout.paypal_payment_button_view, this, true);
        View findViewById = findViewById(C17165R.C17167id.prefixText);
        C19383o.m32796f(findViewById, "findViewById(R.id.prefixText)");
        this.prefixTextView = (TextView) findViewById;
        View findViewById2 = findViewById(C17165R.C17167id.suffixText);
        C19383o.m32796f(findViewById2, "findViewById(R.id.suffixText)");
        this.suffixTextView = (TextView) findViewById2;
        View findViewById3 = findViewById(C17165R.C17167id.payPalWordmarkImage);
        C19383o.m32796f(findViewById3, "findViewById(R.id.payPalWordmarkImage)");
        this.payPalWordmarkImage = (ImageView) findViewById3;
        View findViewById4 = findViewById(C17165R.C17167id.progressBar);
        C19383o.m32796f(findViewById4, "findViewById(R.id.progressBar)");
        this.progressBar = (ProgressBar) findViewById4;
        setOrientation(0);
        setGravity(17);
        setEligibilityStatus(loading);
        initAttributes(attributeSet, i);
        initClickListener();
        updateFundingEligibility();
    }
}
