package com.paypal.pyplcheckout.home.view.customviews;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.support.p013v4.media.C0070b;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.C2236a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C2868j0;
import androidx.lifecycle.C2887s;
import com.etsy.android.feedback.C6466k;
import com.etsy.android.feedback.C6467l;
import com.etsy.android.feedback.C6468m;
import com.etsy.android.feedback.C6469n;
import com.etsy.android.lib.models.ResponseConstants;
import com.etsy.android.p327ui.C9904g;
import com.etsy.android.p327ui.core.listinggallery.buyitnow.C9663d;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addcard.AddCardViewModel;
import com.paypal.pyplcheckout.addshipping.C17193a;
import com.paypal.pyplcheckout.billingagreements.view.customview.C17198a;
import com.paypal.pyplcheckout.billingagreements.viewmodel.C17203a;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.EventListener;
import com.paypal.pyplcheckout.events.EventType;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.events.model.AddCardViewStateUpdateEvent;
import com.paypal.pyplcheckout.events.model.ContingencyEventsModel;
import com.paypal.pyplcheckout.events.model.ContingencyProcessingStatus;
import com.paypal.pyplcheckout.events.model.ContingencyType;
import com.paypal.pyplcheckout.extensions.AnyExtensionsKt;
import com.paypal.pyplcheckout.extensions.ViewExtensionsKt;
import com.paypal.pyplcheckout.fundingOptions.usecase.C17225b;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.home.viewmodel.MainPaysheetViewModel;
import com.paypal.pyplcheckout.model.GenericViewData;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import com.paypal.pyplcheckout.navigation.interfaces.ContentView;
import com.paypal.pyplcheckout.navigation.interfaces.ICustomViewsViewModel;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$1;
import com.paypal.pyplcheckout.p543di.SdkComponentKt$activityViewModels$4;
import com.paypal.pyplcheckout.utils.CardValidationUtilKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C19285c;
import kotlin.C19394m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19386q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C19457k;
import p186n2.C7418m;
import p186n2.C7426q;
import p260v0.C8184a;
import p499zd.C13955c;
import p753kq.C19846a;
import p753kq.C19863r;

public final class AddCardView extends ConstraintLayout implements ContentView, ICustomViewsViewModel, View.OnClickListener {
    private static final String CARD_NUMBER = "card_number";
    private static final String CSC = "csc";
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String EXP_DATE = "exp_date";
    public static final String TAG = "AddCardView";
    private static final String ZIP_CODE = "zip_code";
    public Map<Integer, View> _$_findViewCache;
    private final C19285c addCardViewModel$delegate;
    private ImageView cardErrorImageView;
    private TextView cardErrorTextView;
    private View cardNumberDivider;
    private TextInputEditText cardNumberEditText;
    private TextInputLayout cardNumberTIL;
    private TextWatcher cardNumberTextWatcher;
    private final EventListener carouselAddCardListener;
    private final EventListener carouselCreditOfferListener;
    private final EventListener carouselFundingInstrumentListener;
    private final EventListener carouselPayInFourListener;
    private ConstraintLayout constraintLayout;
    /* access modifiers changed from: private */
    public TextInputEditText cscEditText;
    private TextInputLayout cscTIL;
    /* access modifiers changed from: private */
    public TextInputEditText expEditText;
    private TextInputLayout expTIL;
    private final Fragment fragment;
    /* access modifiers changed from: private */
    public boolean hasAdvancedPastCardNumber;
    private final C19285c mainPaysheetViewModel$delegate;
    private final EventListener nativeAddCardClickListener;
    private View zipCodeDivider;
    /* access modifiers changed from: private */
    public TextInputEditText zipCodeEditText;
    private TextInputLayout zipCodeTIL;
    private ImageView zipErrorImageView;
    private TextView zipErrorTextView;

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

        static {
            int[] iArr = new int[ContingencyType.values().length];
            iArr[ContingencyType.THREE_DS_V1_CONTINGENCY.ordinal()] = 1;
            iArr[ContingencyType.THREE_DS_V2_CONTINGENCY.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ContingencyProcessingStatus.values().length];
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_1_STARTED.ordinal()] = 1;
            iArr2[ContingencyProcessingStatus.THREE_DS_SUBMIT_CLICKED.ordinal()] = 2;
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_1_FAILED.ordinal()] = 3;
            iArr2[ContingencyProcessingStatus.THREE_DS_JWT_2_FAILED.ordinal()] = 4;
            iArr2[ContingencyProcessingStatus.THREE_DS_LOOK_UP_FAILED.ordinal()] = 5;
            iArr2[ContingencyProcessingStatus.THREE_DS_AUTHENTICATE_FAILED.ordinal()] = 6;
            iArr2[ContingencyProcessingStatus.THREE_DS_UNKNOWN_FAILURE.ordinal()] = 7;
            iArr2[ContingencyProcessingStatus.THREE_DS_CANCEL_CLICKED.ordinal()] = 8;
            iArr2[ContingencyProcessingStatus.THREE_DS_RESOLVE_FAILED.ordinal()] = 9;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    static {
        Class<AddCardView> cls = AddCardView.class;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddCardView(Context context) {
        this(context, (AttributeSet) null, 0, (Fragment) null, 14, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, (Fragment) null, 12, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AddCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, (Fragment) null, 8, (DefaultConstructorMarker) null);
        C19383o.m32797g(context, ResponseConstants.CONTEXT);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AddCardView(Context context, AttributeSet attributeSet, int i, Fragment fragment2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : fragment2);
    }

    private final void addCard() {
        if (!validateFields() || !fieldsAreNotEmpty()) {
            PLog pLog = PLog.INSTANCE;
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E622, "invalid fields when attempting to add card", "user attempted to add card with invalid fields", (Throwable) null, PEnums.TransitionName.NATIVE_ADD_CARD_INTERACTION, PEnums.StateName.NATIVE_ADD_CARD, "validation error when adding card", (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1808, (Object) null);
            AddCardViewModel addCardViewModel = getAddCardViewModel();
            String string = getContext().getResources().getString(C17165R.string.paypal_checkout_add_card_validation_generic_error);
            C19383o.m32796f(string, "context.resources.getStr…validation_generic_error)");
            addCardViewModel.showAddCardError(new AddCardViewModel.AddCardAlertUiModel.Error.Validation((String) null, string, C17165R.color.add_card_red, C17165R.color.add_card_red_bg, 1, (DefaultConstructorMarker) null));
            return;
        }
        hideKeyboard();
        Activity activity = ViewExtensionsKt.getActivity(this);
        AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
        if (appCompatActivity != null) {
            AddCardViewModel addCardViewModel2 = getAddCardViewModel();
            String value = getAddCardViewModel().getCardNumber().getValue();
            if (value == null) {
                value = String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.editText_card_number)).getText());
            }
            addCardViewModel2.addCard(value, String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.editText_exp_date)).getText()), String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.editText_csc)).getText()), String.valueOf(((TextInputEditText) _$_findCachedViewById(C17165R.C17167id.editText_zip_code)).getText()), appCompatActivity);
        }
    }

    private final void cardNumberDividerFocus(boolean z, boolean z2) {
        if (z && !z2) {
            View view = this.cardNumberDivider;
            if (view != null) {
                showFocusedState(view);
            } else {
                C19383o.m32805o("cardNumberDivider");
                throw null;
            }
        } else if (!z && !z2) {
            View view2 = this.cardNumberDivider;
            if (view2 != null) {
                showUnFocusedState(view2);
            } else {
                C19383o.m32805o("cardNumberDivider");
                throw null;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: carouselAddCardListener$lambda-3  reason: not valid java name */
    public static final void m35269carouselAddCardListener$lambda3(AddCardView addCardView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        AddCardViewStateUpdateEvent addCardViewStateUpdateEvent = null;
        Success success = resultData instanceof Success ? (Success) resultData : null;
        Object data = success == null ? null : success.getData();
        if (data instanceof AddCardViewStateUpdateEvent) {
            addCardViewStateUpdateEvent = (AddCardViewStateUpdateEvent) data;
        }
        if (addCardViewStateUpdateEvent != null) {
            CardUiModel.AddCardUiModel addCard = addCardViewStateUpdateEvent.getAddCard();
            if (addCard instanceof CardUiModel.AddCardUiModel.Native) {
                addCardView.setVisibility(0);
            } else if (addCard instanceof CardUiModel.AddCardUiModel.Web) {
                addCardView.setVisibility(8);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            AnyExtensionsKt.getExhaustive(C19394m.f43287a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: carouselCreditOfferListener$lambda-0  reason: not valid java name */
    public static final void m35270carouselCreditOfferListener$lambda0(AddCardView addCardView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        addCardView.setVisibility(8);
        addCardView.clearFields();
    }

    /* access modifiers changed from: private */
    /* renamed from: carouselFundingInstrumentListener$lambda-2  reason: not valid java name */
    public static final void m35271carouselFundingInstrumentListener$lambda2(AddCardView addCardView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        addCardView.setVisibility(8);
        addCardView.clearFields();
    }

    /* access modifiers changed from: private */
    /* renamed from: carouselPayInFourListener$lambda-1  reason: not valid java name */
    public static final void m35272carouselPayInFourListener$lambda1(AddCardView addCardView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        addCardView.setVisibility(8);
        addCardView.clearFields();
    }

    /* access modifiers changed from: private */
    public final void clearFields() {
        hideKeyboard();
        TextInputEditText textInputEditText = this.cardNumberEditText;
        if (textInputEditText != null) {
            textInputEditText.setText("");
            TextInputEditText textInputEditText2 = this.zipCodeEditText;
            if (textInputEditText2 != null) {
                textInputEditText2.setText("");
                TextInputEditText textInputEditText3 = this.cscEditText;
                if (textInputEditText3 != null) {
                    textInputEditText3.setText("");
                    TextInputEditText textInputEditText4 = this.expEditText;
                    if (textInputEditText4 != null) {
                        textInputEditText4.setText("");
                        TextInputEditText textInputEditText5 = this.cardNumberEditText;
                        if (textInputEditText5 != null) {
                            textInputEditText5.clearFocus();
                            TextInputEditText textInputEditText6 = this.zipCodeEditText;
                            if (textInputEditText6 != null) {
                                textInputEditText6.clearFocus();
                                TextInputEditText textInputEditText7 = this.cscEditText;
                                if (textInputEditText7 != null) {
                                    textInputEditText7.clearFocus();
                                    TextInputEditText textInputEditText8 = this.expEditText;
                                    if (textInputEditText8 != null) {
                                        textInputEditText8.clearFocus();
                                        View view = this.cardNumberDivider;
                                        if (view != null) {
                                            showUnFocusedState(view);
                                            View view2 = this.zipCodeDivider;
                                            if (view2 != null) {
                                                showUnFocusedState(view2);
                                                TextInputLayout textInputLayout = this.cardNumberTIL;
                                                if (textInputLayout != null) {
                                                    showDefaultHintState(textInputLayout);
                                                    TextInputLayout textInputLayout2 = this.expTIL;
                                                    if (textInputLayout2 != null) {
                                                        showDefaultHintState(textInputLayout2);
                                                        TextInputLayout textInputLayout3 = this.cscTIL;
                                                        if (textInputLayout3 != null) {
                                                            showDefaultHintState(textInputLayout3);
                                                            TextInputLayout textInputLayout4 = this.zipCodeTIL;
                                                            if (textInputLayout4 != null) {
                                                                showDefaultHintState(textInputLayout4);
                                                                hideCardNumberError();
                                                                hideZipCodeError();
                                                                return;
                                                            }
                                                            C19383o.m32805o("zipCodeTIL");
                                                            throw null;
                                                        }
                                                        C19383o.m32805o("cscTIL");
                                                        throw null;
                                                    }
                                                    C19383o.m32805o("expTIL");
                                                    throw null;
                                                }
                                                C19383o.m32805o("cardNumberTIL");
                                                throw null;
                                            }
                                            C19383o.m32805o("zipCodeDivider");
                                            throw null;
                                        }
                                        C19383o.m32805o("cardNumberDivider");
                                        throw null;
                                    }
                                    C19383o.m32805o("expEditText");
                                    throw null;
                                }
                                C19383o.m32805o("cscEditText");
                                throw null;
                            }
                            C19383o.m32805o("zipCodeEditText");
                            throw null;
                        }
                        C19383o.m32805o("cardNumberEditText");
                        throw null;
                    }
                    C19383o.m32805o("expEditText");
                    throw null;
                }
                C19383o.m32805o("cscEditText");
                throw null;
            }
            C19383o.m32805o("zipCodeEditText");
            throw null;
        }
        C19383o.m32805o("cardNumberEditText");
        throw null;
    }

    private final boolean fieldsAreNotEmpty() {
        if (String.valueOf(getAddCardViewModel().getCardNumber().getValue()).length() > 0) {
            TextInputEditText textInputEditText = this.expEditText;
            if (textInputEditText != null) {
                if (String.valueOf(textInputEditText.getText()).length() > 0) {
                    TextInputEditText textInputEditText2 = this.cscEditText;
                    if (textInputEditText2 != null) {
                        if (String.valueOf(textInputEditText2.getText()).length() > 0) {
                            TextInputEditText textInputEditText3 = this.zipCodeEditText;
                            if (textInputEditText3 != null) {
                                if (String.valueOf(textInputEditText3.getText()).length() > 0) {
                                    return true;
                                }
                            } else {
                                C19383o.m32805o("zipCodeEditText");
                                throw null;
                            }
                        }
                    } else {
                        C19383o.m32805o("cscEditText");
                        throw null;
                    }
                }
            } else {
                C19383o.m32805o("expEditText");
                throw null;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    public final AddCardViewModel getAddCardViewModel() {
        return (AddCardViewModel) this.addCardViewModel$delegate.getValue();
    }

    private final MainPaysheetViewModel getMainPaysheetViewModel() {
        return (MainPaysheetViewModel) this.mainPaysheetViewModel$delegate.getValue();
    }

    private final void handleContingencyEvent(ContingencyEventsModel contingencyEventsModel) {
        ContingencyType contingencyType = contingencyEventsModel.getContingencyType();
        ContingencyProcessingStatus contingencyProcessingStatus = contingencyEventsModel.getContingencyProcessingStatus();
        int i = WhenMappings.$EnumSwitchMapping$0[contingencyType.ordinal()];
        if (i == 1 || i == 2) {
            switch (WhenMappings.$EnumSwitchMapping$1[contingencyProcessingStatus.ordinal()]) {
                case 1:
                case 2:
                    setVisibility(8);
                    return;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    return;
                default:
                    String str = TAG;
                    PLog.i$default(str, "ContingencyProcessingStatus of type " + contingencyProcessingStatus + " not handled", 0, 4, (Object) null);
                    return;
            }
        } else {
            String str2 = TAG;
            PLog.i$default(str2, "ContingencyType of type " + contingencyType + " not handled", 0, 4, (Object) null);
        }
    }

    private final void hideCardNumberError() {
        C2236a aVar = new C2236a();
        ConstraintLayout constraintLayout2 = this.constraintLayout;
        if (constraintLayout2 != null) {
            aVar.mo8487e(constraintLayout2);
            TextView textView = this.cardErrorTextView;
            if (textView != null) {
                textView.setText(getResources().getString(C17165R.string.paypal_checkout_card_number_error));
                aVar.mo8493n(0.0f, C17165R.C17167id.textView_card_error);
                aVar.mo8493n(0.0f, C17165R.C17167id.imageView_card_error);
                aVar.mo8489g(C17165R.C17167id.til_zip_code, 3, C17165R.C17167id.divider_card_info, 4, getResources().getDimensionPixelSize(C17165R.dimen.margin_8x));
                ConstraintLayout constraintLayout3 = this.constraintLayout;
                if (constraintLayout3 != null) {
                    C7426q.m14342a(constraintLayout3, (C7418m) null);
                    ConstraintLayout constraintLayout4 = this.constraintLayout;
                    if (constraintLayout4 != null) {
                        aVar.mo8484b(constraintLayout4);
                    } else {
                        C19383o.m32805o("constraintLayout");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("constraintLayout");
                    throw null;
                }
            } else {
                C19383o.m32805o("cardErrorTextView");
                throw null;
            }
        } else {
            C19383o.m32805o("constraintLayout");
            throw null;
        }
    }

    private final void hideKeyboard() {
        Object systemService = getContext().getSystemService("input_method");
        if (systemService != null) {
            ((InputMethodManager) systemService).hideSoftInputFromWindow(getWindowToken(), 0);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
    }

    private final void hideZipCodeError() {
        View view = this.zipCodeDivider;
        if (view != null) {
            showUnFocusedState(view);
            TextInputLayout textInputLayout = this.zipCodeTIL;
            if (textInputLayout != null) {
                showDefaultHintState(textInputLayout);
                C2236a aVar = new C2236a();
                ConstraintLayout constraintLayout2 = this.constraintLayout;
                if (constraintLayout2 != null) {
                    aVar.mo8487e(constraintLayout2);
                    int i = C17165R.C17167id.textView_zip_error;
                    aVar.mo8490j(i).f5377b.f5454b = 8;
                    int i2 = C17165R.C17167id.imageView_zip_error;
                    aVar.mo8490j(i2).f5377b.f5454b = 8;
                    aVar.mo8493n(0.0f, i);
                    aVar.mo8493n(0.0f, i2);
                    ConstraintLayout constraintLayout3 = this.constraintLayout;
                    if (constraintLayout3 != null) {
                        C7426q.m14342a(constraintLayout3, (C7418m) null);
                        ConstraintLayout constraintLayout4 = this.constraintLayout;
                        if (constraintLayout4 != null) {
                            aVar.mo8484b(constraintLayout4);
                        } else {
                            C19383o.m32805o("constraintLayout");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("constraintLayout");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("constraintLayout");
                    throw null;
                }
            } else {
                C19383o.m32805o("zipCodeTIL");
                throw null;
            }
        } else {
            C19383o.m32805o("zipCodeDivider");
            throw null;
        }
    }

    private final void initCardNumberFocusListener() {
        C2236a aVar = new C2236a();
        TextInputEditText textInputEditText = this.cardNumberEditText;
        if (textInputEditText != null) {
            textInputEditText.setOnFocusChangeListener(new C17235a(this, aVar));
        } else {
            C19383o.m32805o("cardNumberEditText");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initCardNumberFocusListener$lambda-13  reason: not valid java name */
    public static final void m35273initCardNumberFocusListener$lambda13(AddCardView addCardView, C2236a aVar, View view, boolean z) {
        CharSequence charSequence;
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32797g(aVar, "$cardNumberFocusConstraints");
        if (z) {
            addCardView.logInteraction("card_number : card number field is in focus", "cardNumber");
            addCardView.cardNumberDividerFocus(z, addCardView.isCardErrorVisible());
            String value = addCardView.getAddCardViewModel().getCardNumber().getValue();
            if (value != null) {
                TextInputEditText textInputEditText = addCardView.cardNumberEditText;
                if (textInputEditText != null) {
                    textInputEditText.setText(value);
                    TextInputEditText textInputEditText2 = addCardView.cardNumberEditText;
                    if (textInputEditText2 != null) {
                        textInputEditText2.setSelection(value.length());
                    } else {
                        C19383o.m32805o("cardNumberEditText");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("cardNumberEditText");
                    throw null;
                }
            }
            ConstraintLayout constraintLayout2 = addCardView.constraintLayout;
            if (constraintLayout2 != null) {
                aVar.mo8487e(constraintLayout2);
                int i = C17165R.C17167id.til_csc;
                aVar.mo8486d(i, 7);
                aVar.mo8490j(C17165R.C17167id.til_card_number).f5379d.f5408Z = 0.6f;
                int i2 = C17165R.C17167id.til_exp_date;
                int i3 = C17165R.C17167id.constraint_layout_card_info_container;
                aVar.mo8489g(i2, 7, i3, 7, 0);
                aVar.mo8488f(i, 6, i3, 7);
                ConstraintLayout constraintLayout3 = addCardView.constraintLayout;
                if (constraintLayout3 != null) {
                    C7426q.m14342a(constraintLayout3, (C7418m) null);
                    ConstraintLayout constraintLayout4 = addCardView.constraintLayout;
                    if (constraintLayout4 != null) {
                        aVar.mo8484b(constraintLayout4);
                    } else {
                        C19383o.m32805o("constraintLayout");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("constraintLayout");
                    throw null;
                }
            } else {
                C19383o.m32805o("constraintLayout");
                throw null;
            }
        } else {
            TextInputEditText textInputEditText3 = addCardView.cardNumberEditText;
            if (textInputEditText3 != null) {
                if (String.valueOf(textInputEditText3.getText()).length() > 0) {
                    addCardView.validateFields();
                } else {
                    View view2 = addCardView.cardNumberDivider;
                    if (view2 != null) {
                        addCardView.showUnFocusedState(view2);
                    } else {
                        C19383o.m32805o("cardNumberDivider");
                        throw null;
                    }
                }
                String value2 = addCardView.getAddCardViewModel().getCardNumber().getValue();
                if (value2 != null && value2.length() > 4) {
                    TextInputEditText textInputEditText4 = addCardView.cardNumberEditText;
                    if (textInputEditText4 != null) {
                        TextWatcher textWatcher = addCardView.cardNumberTextWatcher;
                        if (textWatcher != null) {
                            textInputEditText4.removeTextChangedListener(textWatcher);
                            TextInputEditText textInputEditText5 = addCardView.cardNumberEditText;
                            if (textInputEditText5 != null) {
                                int length = value2.length() - 4;
                                if (length >= 0) {
                                    if (length == 0) {
                                        charSequence = value2.subSequence(0, value2.length());
                                    } else {
                                        StringBuilder sb = new StringBuilder(value2.length() - (length + 0));
                                        sb.append(value2, 0, 0);
                                        sb.append(value2, length, value2.length());
                                        charSequence = sb;
                                    }
                                    textInputEditText5.setText(charSequence.toString());
                                    TextInputEditText textInputEditText6 = addCardView.cardNumberEditText;
                                    if (textInputEditText6 != null) {
                                        TextWatcher textWatcher2 = addCardView.cardNumberTextWatcher;
                                        if (textWatcher2 != null) {
                                            textInputEditText6.addTextChangedListener(textWatcher2);
                                        } else {
                                            C19383o.m32805o("cardNumberTextWatcher");
                                            throw null;
                                        }
                                    } else {
                                        C19383o.m32805o("cardNumberEditText");
                                        throw null;
                                    }
                                } else {
                                    throw new IndexOutOfBoundsException(C0070b.m183e("End index (", length, ") is less than start index (", 0, ")."));
                                }
                            } else {
                                C19383o.m32805o("cardNumberEditText");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("cardNumberTextWatcher");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("cardNumberEditText");
                        throw null;
                    }
                }
            } else {
                C19383o.m32805o("cardNumberEditText");
                throw null;
            }
        }
    }

    private final void initCscFocusListener() {
        C2236a aVar = new C2236a();
        TextInputEditText textInputEditText = this.cscEditText;
        if (textInputEditText != null) {
            textInputEditText.setOnFocusChangeListener(new C17241e(this, aVar));
        } else {
            C19383o.m32805o("cscEditText");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initCscFocusListener$lambda-15  reason: not valid java name */
    public static final void m35274initCscFocusListener$lambda15(AddCardView addCardView, C2236a aVar, View view, boolean z) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32797g(aVar, "$cscFocusAnimation");
        if (z) {
            addCardView.logInteraction("csc : csc field is in focus", "cardCvv");
            addCardView.zipCodeDividerFocus(!z, addCardView.isZipCodeErrorVisible());
            addCardView.cardNumberDividerFocus(z, addCardView.isCardErrorVisible());
            ConstraintLayout constraintLayout2 = addCardView.constraintLayout;
            if (constraintLayout2 != null) {
                aVar.mo8487e(constraintLayout2);
                int i = C17165R.C17167id.til_csc;
                aVar.mo8486d(i, 6);
                aVar.mo8486d(i, 7);
                int i2 = C17165R.C17167id.til_exp_date;
                aVar.mo8486d(i2, 6);
                aVar.mo8486d(i2, 7);
                aVar.mo8490j(C17165R.C17167id.til_card_number).f5379d.f5408Z = 0.35f;
                aVar.mo8489g(i2, 7, i, 6, addCardView.getResources().getDimensionPixelSize(C17165R.dimen.margin_32x));
                aVar.mo8488f(i, 7, C17165R.C17167id.constraint_layout_card_info_container, 7);
                ConstraintLayout constraintLayout3 = addCardView.constraintLayout;
                if (constraintLayout3 != null) {
                    C7426q.m14342a(constraintLayout3, (C7418m) null);
                    ConstraintLayout constraintLayout4 = addCardView.constraintLayout;
                    if (constraintLayout4 != null) {
                        aVar.mo8484b(constraintLayout4);
                    } else {
                        C19383o.m32805o("constraintLayout");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("constraintLayout");
                    throw null;
                }
            } else {
                C19383o.m32805o("constraintLayout");
                throw null;
            }
        } else {
            TextInputEditText textInputEditText = addCardView.cscEditText;
            if (textInputEditText != null) {
                if (String.valueOf(textInputEditText.getText()).length() > 0) {
                    addCardView.validateFields();
                    return;
                }
                View view2 = addCardView.cardNumberDivider;
                if (view2 != null) {
                    addCardView.showUnFocusedState(view2);
                } else {
                    C19383o.m32805o("cardNumberDivider");
                    throw null;
                }
            } else {
                C19383o.m32805o("cscEditText");
                throw null;
            }
        }
    }

    private final void initCustomSelectionActionMode() {
        AddCardView$initCustomSelectionActionMode$actionModeCallback$1 addCardView$initCustomSelectionActionMode$actionModeCallback$1 = new AddCardView$initCustomSelectionActionMode$actionModeCallback$1();
        TextInputEditText textInputEditText = this.cardNumberEditText;
        if (textInputEditText != null) {
            textInputEditText.setCustomSelectionActionModeCallback(addCardView$initCustomSelectionActionMode$actionModeCallback$1);
            TextInputEditText textInputEditText2 = this.cscEditText;
            if (textInputEditText2 != null) {
                textInputEditText2.setCustomSelectionActionModeCallback(addCardView$initCustomSelectionActionMode$actionModeCallback$1);
            } else {
                C19383o.m32805o("cscEditText");
                throw null;
            }
        } else {
            C19383o.m32805o("cardNumberEditText");
            throw null;
        }
    }

    private final void initEvents() {
        Events.Companion companion = Events.Companion;
        companion.getInstance().listen(PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED, this.carouselCreditOfferListener);
        companion.getInstance().listen(PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED, this.carouselFundingInstrumentListener);
        companion.getInstance().listen(PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED, this.carouselPayInFourListener);
        companion.getInstance().listen(PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED, this.carouselAddCardListener);
        companion.getInstance().listen(PayPalEventTypes.NATIVE_ADD_CARD_BUTTON_CLICKED, this.nativeAddCardClickListener);
    }

    private final void initExpirationDateFocusListener() {
        C2236a aVar = new C2236a();
        TextInputEditText textInputEditText = this.expEditText;
        if (textInputEditText != null) {
            textInputEditText.setOnFocusChangeListener(new C17239c(this, aVar));
        } else {
            C19383o.m32805o("expEditText");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initExpirationDateFocusListener$lambda-14  reason: not valid java name */
    public static final void m35275initExpirationDateFocusListener$lambda14(AddCardView addCardView, C2236a aVar, View view, boolean z) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32797g(aVar, "$expFocusAnimation");
        if (z) {
            addCardView.logInteraction("exp_date : expiration date field is in focus", "cardExpiry");
            addCardView.cardNumberDividerFocus(z, addCardView.isCardErrorVisible());
            ConstraintLayout constraintLayout2 = addCardView.constraintLayout;
            if (constraintLayout2 != null) {
                aVar.mo8487e(constraintLayout2);
                int i = C17165R.C17167id.til_csc;
                aVar.mo8486d(i, 6);
                aVar.mo8486d(i, 7);
                int i2 = C17165R.C17167id.til_exp_date;
                aVar.mo8486d(i2, 6);
                aVar.mo8486d(i2, 7);
                aVar.mo8490j(C17165R.C17167id.til_card_number).f5379d.f5408Z = 0.35f;
                aVar.mo8489g(i2, 7, i, 6, addCardView.getResources().getDimensionPixelSize(C17165R.dimen.margin_16x));
                aVar.mo8488f(i, 7, C17165R.C17167id.constraint_layout_card_info_container, 7);
                ConstraintLayout constraintLayout3 = addCardView.constraintLayout;
                if (constraintLayout3 != null) {
                    C7426q.m14342a(constraintLayout3, (C7418m) null);
                    ConstraintLayout constraintLayout4 = addCardView.constraintLayout;
                    if (constraintLayout4 != null) {
                        aVar.mo8484b(constraintLayout4);
                    } else {
                        C19383o.m32805o("constraintLayout");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("constraintLayout");
                    throw null;
                }
            } else {
                C19383o.m32805o("constraintLayout");
                throw null;
            }
        } else {
            TextInputEditText textInputEditText = addCardView.expEditText;
            if (textInputEditText != null) {
                if (String.valueOf(textInputEditText.getText()).length() > 0) {
                    addCardView.validateFields();
                    return;
                }
                View view2 = addCardView.cardNumberDivider;
                if (view2 != null) {
                    addCardView.showUnFocusedState(view2);
                } else {
                    C19383o.m32805o("cardNumberDivider");
                    throw null;
                }
            } else {
                C19383o.m32805o("expEditText");
                throw null;
            }
        }
    }

    private final void initFocusListeners() {
        initCardNumberFocusListener();
        initExpirationDateFocusListener();
        initCscFocusListener();
        initZipCodeFocusListener();
    }

    private final void initTextWatchers() {
        AddCardView$initTextWatchers$1 addCardView$initTextWatchers$1 = new AddCardView$initTextWatchers$1(this);
        this.cardNumberTextWatcher = addCardView$initTextWatchers$1;
        TextInputEditText textInputEditText = this.cardNumberEditText;
        if (textInputEditText != null) {
            textInputEditText.addTextChangedListener(addCardView$initTextWatchers$1);
            TextInputEditText textInputEditText2 = this.expEditText;
            if (textInputEditText2 != null) {
                onTextChanged(textInputEditText2, new AddCardView$initTextWatchers$2(this));
                TextInputEditText textInputEditText3 = this.cscEditText;
                if (textInputEditText3 != null) {
                    onTextChanged(textInputEditText3, new AddCardView$initTextWatchers$3(this));
                } else {
                    C19383o.m32805o("cscEditText");
                    throw null;
                }
            } else {
                C19383o.m32805o("expEditText");
                throw null;
            }
        } else {
            C19383o.m32805o("cardNumberEditText");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-10  reason: not valid java name */
    public static final void m35276initViewModelObservers$lambda10(AddCardView addCardView, PaymentProcessors paymentProcessors) {
        String obj;
        C19383o.m32797g(addCardView, "this$0");
        TextInputEditText textInputEditText = addCardView.cardNumberEditText;
        if (textInputEditText != null) {
            Editable text = textInputEditText.getText();
            boolean z = false;
            if (!(text == null || (obj = text.toString()) == null || obj.length() != paymentProcessors.getAutoAdvanceLength())) {
                z = true;
            }
            if (z && !addCardView.hasAdvancedPastCardNumber) {
                TextInputEditText textInputEditText2 = addCardView.expEditText;
                if (textInputEditText2 != null) {
                    textInputEditText2.requestFocus();
                    addCardView.hasAdvancedPastCardNumber = true;
                } else {
                    C19383o.m32805o("expEditText");
                    throw null;
                }
            }
            TextInputEditText textInputEditText3 = addCardView.cardNumberEditText;
            if (textInputEditText3 != null) {
                addCardView.maxLength(textInputEditText3, paymentProcessors.getMaxLength());
            } else {
                C19383o.m32805o("cardNumberEditText");
                throw null;
            }
        } else {
            C19383o.m32805o("cardNumberEditText");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-5  reason: not valid java name */
    public static final void m35277initViewModelObservers$lambda5(AddCardView addCardView, Boolean bool) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32796f(bool, "fetchingUserDataCompletedFlag");
        if (bool.booleanValue()) {
            addCardView.getMainPaysheetViewModel().getContingencyEventsModel().getValue();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-6  reason: not valid java name */
    public static final void m35278initViewModelObservers$lambda6(AddCardView addCardView, Boolean bool) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32796f(bool, "logoutCompletedFlag");
        if (bool.booleanValue()) {
            addCardView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-7  reason: not valid java name */
    public static final void m35279initViewModelObservers$lambda7(AddCardView addCardView, Boolean bool) {
        C19383o.m32797g(addCardView, "this$0");
        addCardView.setFocusForAccessibilityAnnouncement();
    }

    /* access modifiers changed from: private */
    /* renamed from: initViewModelObservers$lambda-9  reason: not valid java name */
    public static final void m35280initViewModelObservers$lambda9(AddCardView addCardView, ContingencyEventsModel contingencyEventsModel) {
        C19383o.m32797g(addCardView, "this$0");
        if (contingencyEventsModel != null) {
            addCardView.handleContingencyEvent(contingencyEventsModel);
        }
    }

    private final void initViews() {
        View findViewById = findViewById(C17165R.C17167id.constraint_layout_card_info_container);
        C19383o.m32796f(findViewById, "findViewById(R.id.constr…yout_card_info_container)");
        this.constraintLayout = (ConstraintLayout) findViewById;
        View findViewById2 = findViewById(C17165R.C17167id.til_card_number);
        C19383o.m32796f(findViewById2, "findViewById(R.id.til_card_number)");
        this.cardNumberTIL = (TextInputLayout) findViewById2;
        View findViewById3 = findViewById(C17165R.C17167id.til_exp_date);
        C19383o.m32796f(findViewById3, "findViewById(R.id.til_exp_date)");
        this.expTIL = (TextInputLayout) findViewById3;
        View findViewById4 = findViewById(C17165R.C17167id.til_csc);
        C19383o.m32796f(findViewById4, "findViewById(R.id.til_csc)");
        this.cscTIL = (TextInputLayout) findViewById4;
        View findViewById5 = findViewById(C17165R.C17167id.til_zip_code);
        C19383o.m32796f(findViewById5, "findViewById(R.id.til_zip_code)");
        this.zipCodeTIL = (TextInputLayout) findViewById5;
        View findViewById6 = findViewById(C17165R.C17167id.editText_card_number);
        C19383o.m32796f(findViewById6, "findViewById(R.id.editText_card_number)");
        this.cardNumberEditText = (TextInputEditText) findViewById6;
        View findViewById7 = findViewById(C17165R.C17167id.editText_exp_date);
        C19383o.m32796f(findViewById7, "findViewById(R.id.editText_exp_date)");
        this.expEditText = (TextInputEditText) findViewById7;
        View findViewById8 = findViewById(C17165R.C17167id.editText_csc);
        C19383o.m32796f(findViewById8, "findViewById(R.id.editText_csc)");
        this.cscEditText = (TextInputEditText) findViewById8;
        View findViewById9 = findViewById(C17165R.C17167id.editText_zip_code);
        C19383o.m32796f(findViewById9, "findViewById(R.id.editText_zip_code)");
        this.zipCodeEditText = (TextInputEditText) findViewById9;
        View findViewById10 = findViewById(C17165R.C17167id.divider_card_info);
        C19383o.m32796f(findViewById10, "findViewById(R.id.divider_card_info)");
        this.cardNumberDivider = findViewById10;
        View findViewById11 = findViewById(C17165R.C17167id.divider_zip_code);
        C19383o.m32796f(findViewById11, "findViewById(R.id.divider_zip_code)");
        this.zipCodeDivider = findViewById11;
        View findViewById12 = findViewById(C17165R.C17167id.imageView_card_error);
        C19383o.m32796f(findViewById12, "findViewById(R.id.imageView_card_error)");
        this.cardErrorImageView = (ImageView) findViewById12;
        View findViewById13 = findViewById(C17165R.C17167id.textView_card_error);
        C19383o.m32796f(findViewById13, "findViewById(R.id.textView_card_error)");
        this.cardErrorTextView = (TextView) findViewById13;
        View findViewById14 = findViewById(C17165R.C17167id.imageView_zip_error);
        C19383o.m32796f(findViewById14, "findViewById(R.id.imageView_zip_error)");
        this.zipErrorImageView = (ImageView) findViewById14;
        View findViewById15 = findViewById(C17165R.C17167id.textView_zip_error);
        C19383o.m32796f(findViewById15, "findViewById(R.id.textView_zip_error)");
        this.zipErrorTextView = (TextView) findViewById15;
        TextInputEditText textInputEditText = this.expEditText;
        if (textInputEditText != null) {
            TextInputEditText textInputEditText2 = this.cardNumberEditText;
            if (textInputEditText2 != null) {
                onDeleteAndEmptyRequestFocus(textInputEditText, textInputEditText2);
                TextInputEditText textInputEditText3 = this.cscEditText;
                if (textInputEditText3 != null) {
                    TextInputEditText textInputEditText4 = this.expEditText;
                    if (textInputEditText4 != null) {
                        onDeleteAndEmptyRequestFocus(textInputEditText3, textInputEditText4);
                        TextInputEditText textInputEditText5 = this.zipCodeEditText;
                        if (textInputEditText5 != null) {
                            TextInputEditText textInputEditText6 = this.cscEditText;
                            if (textInputEditText6 != null) {
                                onDeleteAndEmptyRequestFocus(textInputEditText5, textInputEditText6);
                                TextInputEditText textInputEditText7 = this.zipCodeEditText;
                                if (textInputEditText7 != null) {
                                    textInputEditText7.setOnEditorActionListener(new C13955c(this, 2));
                                } else {
                                    C19383o.m32805o("zipCodeEditText");
                                    throw null;
                                }
                            } else {
                                C19383o.m32805o("cscEditText");
                                throw null;
                            }
                        } else {
                            C19383o.m32805o("zipCodeEditText");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("expEditText");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("cscEditText");
                    throw null;
                }
            } else {
                C19383o.m32805o("cardNumberEditText");
                throw null;
            }
        } else {
            C19383o.m32805o("expEditText");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initViews$lambda-12  reason: not valid java name */
    public static final boolean m35281initViews$lambda12(AddCardView addCardView, TextView textView, int i, KeyEvent keyEvent) {
        C19383o.m32797g(addCardView, "this$0");
        if ((keyEvent == null || keyEvent.getKeyCode() != 66) && i != 6) {
            return false;
        }
        addCardView.addCard();
        return true;
    }

    private final void initZipCodeFocusListener() {
        TextInputEditText textInputEditText = this.zipCodeEditText;
        if (textInputEditText != null) {
            textInputEditText.setOnFocusChangeListener(new C17238b(this));
        } else {
            C19383o.m32805o("zipCodeEditText");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: initZipCodeFocusListener$lambda-16  reason: not valid java name */
    public static final void m35282initZipCodeFocusListener$lambda16(AddCardView addCardView, View view, boolean z) {
        C19383o.m32797g(addCardView, "this$0");
        boolean z2 = true;
        if (z) {
            addCardView.logInteraction("zip_code : zip code field is in focus", "billingPostalCode");
            addCardView.zipCodeDividerFocus(z, addCardView.isZipCodeErrorVisible());
            addCardView.cardNumberDividerFocus(true ^ z, addCardView.isCardErrorVisible());
            return;
        }
        TextInputEditText textInputEditText = addCardView.zipCodeEditText;
        if (textInputEditText != null) {
            if (String.valueOf(textInputEditText.getText()).length() != 0) {
                z2 = false;
            }
            if (z2) {
                View view2 = addCardView.zipCodeDivider;
                if (view2 != null) {
                    addCardView.showUnFocusedState(view2);
                } else {
                    C19383o.m32805o("zipCodeDivider");
                    throw null;
                }
            }
        } else {
            C19383o.m32805o("zipCodeEditText");
            throw null;
        }
    }

    private final boolean isCardErrorVisible() {
        TextView textView = this.cardErrorTextView;
        if (textView != null) {
            if (textView.getAlpha() == 1.0f) {
                ImageView imageView = this.cardErrorImageView;
                if (imageView != null) {
                    if (imageView.getAlpha() == 1.0f) {
                        return true;
                    }
                } else {
                    C19383o.m32805o("cardErrorImageView");
                    throw null;
                }
            }
            return false;
        }
        C19383o.m32805o("cardErrorTextView");
        throw null;
    }

    private final boolean isZipCodeErrorVisible() {
        TextView textView = this.zipErrorTextView;
        if (textView != null) {
            if (textView.getAlpha() == 1.0f) {
                ImageView imageView = this.zipErrorImageView;
                if (imageView != null) {
                    if (imageView.getAlpha() == 1.0f) {
                        return true;
                    }
                } else {
                    C19383o.m32805o("zipErrorImageView");
                    throw null;
                }
            }
            return false;
        }
        C19383o.m32805o("zipErrorTextView");
        throw null;
    }

    private final void logInteraction(String str, String str2) {
        PLog.impression$default(PEnums.TransitionName.NATIVE_ADD_CARD_INTERACTION, PEnums.Outcome.INTERACTED, PEnums.EventCode.E635, PEnums.StateName.NATIVE_ADD_CARD, str, (String) null, (String) null, str2, (InstrumentationEvent.InstrumentationEventBuilder) null, 352, (Object) null);
    }

    private final void logValidationError(String str, String str2) {
        PLog pLog = PLog.INSTANCE;
        PLog.error$default(PEnums.ErrorType.INFO, PEnums.EventCode.E622, str, (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_ADD_CARD_INTERACTION, PEnums.StateName.NATIVE_ADD_CARD, str2, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1816, (Object) null);
    }

    private final void maxLength(EditText editText, int i) {
        editText.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i)});
    }

    /* access modifiers changed from: private */
    /* renamed from: nativeAddCardClickListener$lambda-4  reason: not valid java name */
    public static final void m35283nativeAddCardClickListener$lambda4(AddCardView addCardView, EventType eventType, ResultData resultData) {
        C19383o.m32797g(addCardView, "this$0");
        C19383o.m32797g(eventType, "$noName_0");
        addCardView.addCard();
    }

    /* access modifiers changed from: private */
    /* renamed from: onAttachedToWindow$lambda-11  reason: not valid java name */
    public static final void m35284onAttachedToWindow$lambda11(AddCardView addCardView, AddCardViewModel.AddCardLoadingState addCardLoadingState) {
        C19383o.m32797g(addCardView, "this$0");
        if (addCardLoadingState instanceof AddCardViewModel.AddCardLoadingState.Empty) {
            addCardView.clearFields();
            addCardView.setFieldsEnabled(true);
        } else if (addCardLoadingState instanceof AddCardViewModel.AddCardLoadingState.Loading) {
            Events.Companion.getInstance().fire(PayPalEventTypes.CTA_LOADING_SPINNER, new Success(Boolean.TRUE));
            TextInputEditText textInputEditText = addCardView.cardNumberEditText;
            if (textInputEditText != null) {
                AddCardViewModel.AddCardLoadingState.Loading loading = (AddCardViewModel.AddCardLoadingState.Loading) addCardLoadingState;
                textInputEditText.setText(loading.getCardNumber());
                TextInputEditText textInputEditText2 = addCardView.zipCodeEditText;
                if (textInputEditText2 != null) {
                    textInputEditText2.setText(loading.getZipCode());
                    TextInputEditText textInputEditText3 = addCardView.cscEditText;
                    if (textInputEditText3 != null) {
                        textInputEditText3.setText(loading.getCsc());
                        TextInputEditText textInputEditText4 = addCardView.expEditText;
                        if (textInputEditText4 != null) {
                            textInputEditText4.setText(loading.getExpiry());
                            addCardView.setFieldsEnabled(false);
                            return;
                        }
                        C19383o.m32805o("expEditText");
                        throw null;
                    }
                    C19383o.m32805o("cscEditText");
                    throw null;
                }
                C19383o.m32805o("zipCodeEditText");
                throw null;
            }
            C19383o.m32805o("cardNumberEditText");
            throw null;
        } else if (addCardLoadingState instanceof AddCardViewModel.AddCardLoadingState.Idle) {
            Events.Companion.getInstance().fire(PayPalEventTypes.CTA_LOADING_SPINNER, new Success(Boolean.FALSE));
            TextInputEditText textInputEditText5 = addCardView.cardNumberEditText;
            if (textInputEditText5 != null) {
                AddCardViewModel.AddCardLoadingState.Idle idle = (AddCardViewModel.AddCardLoadingState.Idle) addCardLoadingState;
                textInputEditText5.setText(idle.getCardNumber());
                TextInputEditText textInputEditText6 = addCardView.zipCodeEditText;
                if (textInputEditText6 != null) {
                    textInputEditText6.setText(idle.getZipCode());
                    TextInputEditText textInputEditText7 = addCardView.cscEditText;
                    if (textInputEditText7 != null) {
                        textInputEditText7.setText(idle.getCsc());
                        TextInputEditText textInputEditText8 = addCardView.expEditText;
                        if (textInputEditText8 != null) {
                            textInputEditText8.setText(idle.getExpiry());
                            addCardView.setFieldsEnabled(true);
                            return;
                        }
                        C19383o.m32805o("expEditText");
                        throw null;
                    }
                    C19383o.m32805o("cscEditText");
                    throw null;
                }
                C19383o.m32805o("zipCodeEditText");
                throw null;
            }
            C19383o.m32805o("cardNumberEditText");
            throw null;
        }
    }

    private final void onDeleteAndEmptyRequestFocus(EditText editText, View view) {
        editText.setOnKeyListener(new C17242f(editText, view));
    }

    /* access modifiers changed from: private */
    /* renamed from: onDeleteAndEmptyRequestFocus$lambda-17  reason: not valid java name */
    public static final boolean m35285onDeleteAndEmptyRequestFocus$lambda17(EditText editText, View view, View view2, int i, KeyEvent keyEvent) {
        C19383o.m32797g(editText, "$this_onDeleteAndEmptyRequestFocus");
        C19383o.m32797g(view, "$view");
        if (keyEvent != null && keyEvent.getKeyCode() == 67 && keyEvent.getAction() == 0) {
            Editable text = editText.getText();
            if (text == null || C19457k.m33020X0(text)) {
                view.requestFocus();
                return true;
            }
        }
        return false;
    }

    private final void onTextChanged(EditText editText, C19863r<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, C19394m> rVar) {
        editText.addTextChangedListener(new AddCardView$onTextChanged$1(rVar));
    }

    private final void setFieldsEnabled(boolean z) {
        TextInputEditText textInputEditText = this.cardNumberEditText;
        if (textInputEditText != null) {
            textInputEditText.setEnabled(z);
            TextInputEditText textInputEditText2 = this.zipCodeEditText;
            if (textInputEditText2 != null) {
                textInputEditText2.setEnabled(z);
                TextInputEditText textInputEditText3 = this.cscEditText;
                if (textInputEditText3 != null) {
                    textInputEditText3.setEnabled(z);
                    TextInputEditText textInputEditText4 = this.expEditText;
                    if (textInputEditText4 != null) {
                        textInputEditText4.setEnabled(z);
                    } else {
                        C19383o.m32805o("expEditText");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("cscEditText");
                    throw null;
                }
            } else {
                C19383o.m32805o("zipCodeEditText");
                throw null;
            }
        } else {
            C19383o.m32805o("cardNumberEditText");
            throw null;
        }
    }

    private final void setFocusForAccessibilityAnnouncement() {
    }

    private final void showCardError(String str, TextInputLayout textInputLayout) {
        View view = this.cardNumberDivider;
        if (view != null) {
            showErrorState(view);
            C2236a aVar = new C2236a();
            ConstraintLayout constraintLayout2 = this.constraintLayout;
            if (constraintLayout2 != null) {
                aVar.mo8487e(constraintLayout2);
                TextView textView = this.cardErrorTextView;
                if (textView != null) {
                    textView.setText(str);
                    int i = C17165R.C17167id.textView_card_error;
                    aVar.mo8493n(1.0f, i);
                    aVar.mo8493n(1.0f, C17165R.C17167id.imageView_card_error);
                    aVar.mo8489g(C17165R.C17167id.til_zip_code, 3, i, 4, getResources().getDimensionPixelSize(C17165R.dimen.margin_12x));
                    showErrorHintState(textInputLayout);
                    ConstraintLayout constraintLayout3 = this.constraintLayout;
                    if (constraintLayout3 != null) {
                        C7426q.m14342a(constraintLayout3, (C7418m) null);
                        ConstraintLayout constraintLayout4 = this.constraintLayout;
                        if (constraintLayout4 != null) {
                            aVar.mo8484b(constraintLayout4);
                        } else {
                            C19383o.m32805o("constraintLayout");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("constraintLayout");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("cardErrorTextView");
                    throw null;
                }
            } else {
                C19383o.m32805o("constraintLayout");
                throw null;
            }
        } else {
            C19383o.m32805o("cardNumberDivider");
            throw null;
        }
    }

    private final void showDefaultHintState(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        int i = C17165R.color.add_card_gray;
        Object obj = C8184a.f17966a;
        textInputLayout.setDefaultHintTextColor(ColorStateList.valueOf(C8184a.C8188d.m16468a(context, i)));
        textInputLayout.setHintTextColor(ColorStateList.valueOf(C8184a.C8188d.m16468a(textInputLayout.getContext(), C17165R.color.add_card_blue)));
    }

    private final void showErrorHintState(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        int i = C17165R.color.add_card_red_hint;
        Object obj = C8184a.f17966a;
        textInputLayout.setDefaultHintTextColor(ColorStateList.valueOf(C8184a.C8188d.m16468a(context, i)));
        textInputLayout.setHintTextColor(ColorStateList.valueOf(C8184a.C8188d.m16468a(textInputLayout.getContext(), i)));
    }

    private final void showErrorState(View view) {
        Context context = view.getContext();
        int i = C17165R.color.add_card_red_hint;
        Object obj = C8184a.f17966a;
        view.setBackgroundColor(C8184a.C8188d.m16468a(context, i));
    }

    private final void showFocusedState(View view) {
        Context context = view.getContext();
        int i = C17165R.color.add_card_blue;
        Object obj = C8184a.f17966a;
        view.setBackgroundColor(C8184a.C8188d.m16468a(context, i));
    }

    private final void showUnFocusedState(View view) {
        Context context = view.getContext();
        int i = C17165R.color.add_card_gray;
        Object obj = C8184a.f17966a;
        view.setBackgroundColor(C8184a.C8188d.m16468a(context, i));
    }

    private final void showZipCodeError() {
        View view = this.zipCodeDivider;
        if (view != null) {
            showErrorState(view);
            TextInputLayout textInputLayout = this.zipCodeTIL;
            if (textInputLayout != null) {
                showErrorHintState(textInputLayout);
                C2236a aVar = new C2236a();
                ConstraintLayout constraintLayout2 = this.constraintLayout;
                if (constraintLayout2 != null) {
                    aVar.mo8487e(constraintLayout2);
                    int i = C17165R.C17167id.textView_zip_error;
                    aVar.mo8490j(i).f5377b.f5454b = 0;
                    int i2 = C17165R.C17167id.imageView_zip_error;
                    aVar.mo8490j(i2).f5377b.f5454b = 0;
                    aVar.mo8493n(1.0f, i);
                    aVar.mo8493n(1.0f, i2);
                    ConstraintLayout constraintLayout3 = this.constraintLayout;
                    if (constraintLayout3 != null) {
                        C7426q.m14342a(constraintLayout3, (C7418m) null);
                        ConstraintLayout constraintLayout4 = this.constraintLayout;
                        if (constraintLayout4 != null) {
                            aVar.mo8484b(constraintLayout4);
                        } else {
                            C19383o.m32805o("constraintLayout");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("constraintLayout");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("constraintLayout");
                    throw null;
                }
            } else {
                C19383o.m32805o("zipCodeTIL");
                throw null;
            }
        } else {
            C19383o.m32805o("zipCodeDivider");
            throw null;
        }
    }

    private final boolean validateCardNumberField() {
        String valueOf = String.valueOf(getAddCardViewModel().getCardNumber().getValue());
        if (!(valueOf.length() > 0) || CardValidationUtilKt.luhnAlgo(valueOf)) {
            TextInputLayout textInputLayout = this.cardNumberTIL;
            if (textInputLayout != null) {
                showDefaultHintState(textInputLayout);
                return true;
            }
            C19383o.m32805o("cardNumberTIL");
            throw null;
        }
        logValidationError(CARD_NUMBER, "card_number : field validation error");
        String string = getResources().getString(C17165R.string.paypal_checkout_card_number_error);
        C19383o.m32796f(string, "resources.getString(R.st…eckout_card_number_error)");
        TextInputLayout textInputLayout2 = this.cardNumberTIL;
        if (textInputLayout2 != null) {
            showCardError(string, textInputLayout2);
            return false;
        }
        C19383o.m32805o("cardNumberTIL");
        throw null;
    }

    private final boolean validateCscField() {
        TextInputEditText textInputEditText = this.cscEditText;
        if (textInputEditText != null) {
            String valueOf = String.valueOf(textInputEditText.getText());
            PaymentProcessors value = getAddCardViewModel().getPaymentProcessor().getValue();
            if (value == null) {
                value = PaymentProcessors.NOTFOUND;
            }
            C19383o.m32796f(value, "addCardViewModel.payment…aymentProcessors.NOTFOUND");
            if (!(valueOf.length() > 0) || CardValidationUtilKt.cscValidator(value, valueOf)) {
                TextInputLayout textInputLayout = this.cscTIL;
                if (textInputLayout != null) {
                    showDefaultHintState(textInputLayout);
                    return true;
                }
                C19383o.m32805o("cscTIL");
                throw null;
            }
            logValidationError(CSC, "csc : field validation error");
            String string = getResources().getString(C17165R.string.paypal_checkout_csc_error);
            C19383o.m32796f(string, "resources.getString(R.st…aypal_checkout_csc_error)");
            TextInputLayout textInputLayout2 = this.cscTIL;
            if (textInputLayout2 != null) {
                showCardError(string, textInputLayout2);
                return false;
            }
            C19383o.m32805o("cscTIL");
            throw null;
        }
        C19383o.m32805o("cscEditText");
        throw null;
    }

    private final boolean validateExpField() {
        TextInputEditText textInputEditText = this.expEditText;
        if (textInputEditText != null) {
            String valueOf = String.valueOf(textInputEditText.getText());
            if (!(valueOf.length() > 0) || CardValidationUtilKt.expDateValidator(valueOf)) {
                TextInputLayout textInputLayout = this.expTIL;
                if (textInputLayout != null) {
                    showDefaultHintState(textInputLayout);
                    return true;
                }
                C19383o.m32805o("expTIL");
                throw null;
            }
            logValidationError(EXP_DATE, "exp_date : field validation error");
            String string = getResources().getString(C17165R.string.paypal_checkout_exp_error);
            C19383o.m32796f(string, "resources.getString(R.st…aypal_checkout_exp_error)");
            TextInputLayout textInputLayout2 = this.expTIL;
            if (textInputLayout2 != null) {
                showCardError(string, textInputLayout2);
                return false;
            }
            C19383o.m32805o("expTIL");
            throw null;
        }
        C19383o.m32805o("expEditText");
        throw null;
    }

    private final boolean validateFields() {
        boolean z = validateCardNumberField() && validateExpField() && validateCscField();
        if (z) {
            hideCardNumberError();
        }
        return z;
    }

    private final void zipCodeDividerFocus(boolean z, boolean z2) {
        if (z && !z2) {
            View view = this.zipCodeDivider;
            if (view != null) {
                showFocusedState(view);
            } else {
                C19383o.m32805o("zipCodeDivider");
                throw null;
            }
        } else if (!z && !z2) {
            View view2 = this.zipCodeDivider;
            if (view2 != null) {
                showUnFocusedState(view2);
            } else {
                C19383o.m32805o("zipCodeDivider");
                throw null;
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

    public ComponentActivity getComponentActivity(Context context) {
        return ICustomViewsViewModel.DefaultImpls.getComponentActivity(this, context);
    }

    public float getContentViewMinHeight() {
        return 0.0f;
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    public boolean getIsAnchoredToBottomSheet() {
        return false;
    }

    public C2887s getLifecycleOwner(View view) {
        return ICustomViewsViewModel.DefaultImpls.getLifecycleOwner(this, view);
    }

    public View getView(GenericViewData<?> genericViewData) {
        return this;
    }

    public String getViewId() {
        return TAG;
    }

    public void initViewModelObservers() {
        C9663d dVar = new C9663d(this, 4);
        C6466k kVar = new C6466k(this, 4);
        C6467l lVar = new C6467l(this, 3);
        C6468m mVar = new C6468m(this, 4);
        C6469n nVar = new C6469n(this, 7);
        Context context = getContext();
        C19383o.m32796f(context, ResponseConstants.CONTEXT);
        ComponentActivity componentActivity = getComponentActivity(context);
        getMainPaysheetViewModel().getFetchingUserDataCompletedFlag().observe(componentActivity, dVar);
        getMainPaysheetViewModel().getLogoutCompletedFlag().observe(componentActivity, kVar);
        getMainPaysheetViewModel().getPaymentSourceCardViewClickedFlag().observe(componentActivity, lVar);
        getMainPaysheetViewModel().getContingencyEventsModel().observe(componentActivity, mVar);
        getAddCardViewModel().getPaymentProcessor().observe(componentActivity, nVar);
    }

    public EventType listenToEvent() {
        return null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        initEvents();
        getAddCardViewModel().getAddCardLoadingState().observe(getLifecycleOwner(this), new C9904g(this, 5));
    }

    public void onClick(View view) {
        C19383o.m32797g(view, "view");
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeListeners();
    }

    public void removeListeners() {
        Events.Companion companion = Events.Companion;
        companion.getInstance().removeListener(PayPalEventTypes.CAROUSEL_CREDIT_OFFER_POSITION_TRIGGERED, this.carouselCreditOfferListener);
        companion.getInstance().removeListener(PayPalEventTypes.CAROUSEL_PAY_IN_FOUR_POSITION_TRIGGERED, this.carouselPayInFourListener);
        companion.getInstance().removeListener(PayPalEventTypes.CAROUSEL_FUNDING_INSTRUMENT_POSITION_TRIGGERED, this.carouselFundingInstrumentListener);
        companion.getInstance().removeListener(PayPalEventTypes.CAROUSEL_ADD_CARD_POSITION_TRIGGERED, this.carouselAddCardListener);
        companion.getInstance().removeListener(PayPalEventTypes.NATIVE_ADD_CARD_BUTTON_CLICKED, this.nativeAddCardClickListener);
    }

    public void setContentViewVisibility(int i) {
        setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddCardView(Context context, AttributeSet attributeSet, int i, Fragment fragment2) {
        super(context, attributeSet, i);
        Context context2 = context;
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        this._$_findViewCache = new LinkedHashMap();
        this.fragment = fragment2;
        this.carouselCreditOfferListener = new C17193a(this, 2);
        this.carouselPayInFourListener = new C17225b(this, 1);
        this.carouselFundingInstrumentListener = new C17203a(this, 2);
        this.carouselAddCardListener = new C17198a(this, 2);
        this.nativeAddCardClickListener = new C17240d(this, 0);
        SdkComponent.Companion companion = SdkComponent.Companion;
        SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$1 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
        boolean z = context2 instanceof ComponentActivity;
        if (z) {
            ComponentActivity componentActivity = (ComponentActivity) context2;
            this.mainPaysheetViewModel$delegate = new C2868j0(C19386q.m32807a(MainPaysheetViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$1);
            SdkComponentKt$activityViewModels$1 sdkComponentKt$activityViewModels$12 = new SdkComponentKt$activityViewModels$1(companion.getInstance());
            if (z) {
                this.addCardViewModel$delegate = new C2868j0(C19386q.m32807a(AddCardViewModel.class), new SdkComponentKt$activityViewModels$4(componentActivity), sdkComponentKt$activityViewModels$12);
                View.inflate(context2, C17165R.C17169layout.paypal_add_card_view, this);
                setVisibility(8);
                initViews();
                initFocusListeners();
                initViewModelObservers();
                initTextWatchers();
                initCustomSelectionActionMode();
                getAddCardViewModel().setNativeAddCardListener(new C19846a<C19394m>(this) {
                    public final /* synthetic */ AddCardView this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void invoke() {
                        this.this$0.clearFields();
                    }
                });
                return;
            }
            PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
            throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
        }
        PLog.error$default(PEnums.ErrorType.FATAL, PEnums.EventCode.E407, "Context is not an instance of ComponentActivity", (String) null, (Throwable) null, PEnums.TransitionName.CONTEXT_INSTANCE, (PEnums.StateName) null, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 2008, (Object) null);
        throw new IllegalStateException("Context is not an instance of ComponentActivity".toString());
    }
}
