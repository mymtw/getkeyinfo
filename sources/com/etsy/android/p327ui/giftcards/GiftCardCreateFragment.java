package com.etsy.android.p327ui.giftcards;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.R;
import com.etsy.android.extensions.ViewExtensions;
import com.etsy.android.lib.config.C8618c;
import com.etsy.android.lib.currency.C8630b;
import com.etsy.android.lib.currency.C8637h;
import com.etsy.android.lib.logger.AnalyticsProperty;
import com.etsy.android.lib.logger.LogCatKt;
import com.etsy.android.lib.logger.perf.C8709f;
import com.etsy.android.lib.models.GiftCardAmountValues;
import com.etsy.android.lib.models.GiftCardAmounts;
import com.etsy.android.lib.models.GiftCardDesign;
import com.etsy.android.lib.models.GiftCardDesigns;
import com.etsy.android.lib.util.C8901g0;
import com.etsy.android.p327ui.C10673m;
import com.etsy.android.p327ui.C9731e0;
import com.etsy.android.p327ui.cart.C9315k;
import com.etsy.android.p327ui.cart.C9323l;
import com.etsy.android.p327ui.cart.CartBadgeCountRepo;
import com.etsy.android.stylekit.views.C9056g;
import com.etsy.android.stylekit.views.CollageTextInput;
import com.etsy.android.uikit.nav.transactions.C11869a;
import com.etsy.android.uikit.nav.transactions.TransactionViewModel;
import com.etsy.android.uikit.p331ui.core.TrackingBaseFragment;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.collections.C19318k;
import kotlin.jvm.internal.C19383o;
import kotlin.text.C19459m;
import kotlinx.coroutines.C19543e0;
import p145io.reactivex.disposables.C7091a;
import p145io.reactivex.disposables.Disposable;
import p145io.reactivex.internal.operators.completable.CompletableObserveOn;
import p145io.reactivex.internal.operators.completable.CompletableSubscribeOn;
import p145io.reactivex.internal.operators.single.C19208j;
import p145io.reactivex.internal.operators.single.SingleSubscribeOn;
import p145io.reactivex.rxkotlin.SubscribersKt;
import p248tp.C8048a;
import p248tp.C8066r;
import p248tp.C8071s;
import p260v0.C8184a;
import p321cc.C8567a;
import p321cc.C8568b;
import p356ge.C12788a;
import p402n9.C13089i;
import p409o9.C13138q;
import p425q9.C13263n;
import p425q9.C13265p;
import p440s9.C13366a;
import p448ta.C13387c;
import p456ua.C13461f;
import p486y9.C13888d;

/* renamed from: com.etsy.android.ui.giftcards.GiftCardCreateFragment */
public final class GiftCardCreateFragment extends TrackingBaseFragment implements TextWatcher, RadioGroup.OnCheckedChangeListener, C9731e0.C9733b, C13366a {
    public static final int $stable = 8;
    public static final C9908a Companion = new C9908a();
    public static final String KEY_API_KEY = "api_key_sa";
    public static final String SAVE_AMOUNTS = "save_amounts";
    public static final String SAVE_DESIGNS = "save_designs";
    private static final String[] supportedCurrencies = {"AUD", "CAD", "EUR", "GBP", "USD"};
    public Map<Integer, View> _$_findViewCache = new LinkedHashMap();
    private Disposable amountDisposable;
    private Button btnAddToCard;
    public CartBadgeCountRepo cartBadgeCountRepo;
    public C9323l cartRefreshEventManager;
    private final C7091a compositeDisposable = new C7091a();
    public C8618c configMap;
    public C13888d currentLocale;
    private Disposable designDisposable;
    private View errorView;
    public C8630b etsyMoneyFactory;
    private ViewGroup formLayout;
    private List<Integer> giftCardAmounts;
    private GiftCardDesignSelecterView giftCardDesignSelector;
    private List<GiftCardDesign> giftCardDesigns;
    public C9917g giftCardRepository;
    public C13138q installInfo;
    private ViewGroup layoutEmail;
    private View loadingView;
    private RadioGroup radioGroupCardValue;
    private RadioGroup radioGroupDeliveryOption;
    private Button retryButton;
    private GiftCardCreateFragment$retryClickListener$1 retryClickListener = new GiftCardCreateFragment$retryClickListener$1(this);
    public C13461f schedulers;
    public C13265p session;
    private TransactionViewModel<C11869a> transactionViewModel;
    private CollageTextInput txtInputEmail;
    private CollageTextInput txtInputEmailConfirm;
    private CollageTextInput txtInputMessage;
    private CollageTextInput txtInputRecipientName;
    private CollageTextInput txtInputSenderName;
    public C8637h userCurrency;

    /* renamed from: com.etsy.android.ui.giftcards.GiftCardCreateFragment$a */
    public static final class C9908a {
    }

    /* JADX WARNING: type inference failed for: r11v2, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void addGiftCardAmountButtons(java.util.List<java.lang.Integer> r11) {
        /*
            r10 = this;
            android.widget.RadioGroup r0 = r10.radioGroupCardValue
            java.lang.String r1 = "radioGroupCardValue"
            r2 = 0
            if (r0 == 0) goto L_0x0087
            int r3 = r11.size()
            float r3 = (float) r3
            r0.setWeightSum(r3)
            android.view.LayoutInflater r0 = r10.getLayoutInflater()
            java.lang.String r3 = "layoutInflater"
            kotlin.jvm.internal.C19383o.m32796f(r0, r3)
            int r3 = r11.size()
            r4 = 0
            r5 = r4
        L_0x001e:
            if (r5 >= r3) goto L_0x006c
            r6 = 2131624791(0x7f0e0357, float:1.8876772E38)
            android.widget.RadioGroup r7 = r10.radioGroupCardValue
            if (r7 == 0) goto L_0x0068
            android.view.View r6 = r0.inflate(r6, r7, r4)
            java.lang.String r7 = "null cannot be cast to non-null type android.widget.RadioButton"
            kotlin.jvm.internal.C19383o.m32795e(r6, r7)
            android.widget.RadioButton r6 = (android.widget.RadioButton) r6
            java.lang.Object r7 = r11.get(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            r6.setId(r7)
            com.etsy.android.lib.currency.b r8 = r10.getEtsyMoneyFactory()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r9 = r10.getDeceitfulCurrencyCode()
            com.etsy.android.lib.currency.EtsyMoney r7 = r8.mo21248a(r7, r9)
            com.etsy.android.lib.currency.EtsyMoney r7 = r7.setMaximumFractionDigits(r4)
            java.lang.String r7 = r7.format()
            r6.setText(r7)
            android.widget.RadioGroup r7 = r10.radioGroupCardValue
            if (r7 == 0) goto L_0x0064
            r7.addView(r6)
            int r5 = r5 + 1
            goto L_0x001e
        L_0x0064:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x0068:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x006c:
            android.widget.RadioGroup r11 = r10.radioGroupCardValue
            if (r11 == 0) goto L_0x0083
            android.view.View r11 = r11.getChildAt(r4)
            boolean r0 = r11 instanceof android.widget.RadioButton
            if (r0 == 0) goto L_0x007b
            r2 = r11
            android.widget.RadioButton r2 = (android.widget.RadioButton) r2
        L_0x007b:
            if (r2 != 0) goto L_0x007e
            goto L_0x0082
        L_0x007e:
            r11 = 1
            r2.setChecked(r11)
        L_0x0082:
            return
        L_0x0083:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        L_0x0087:
            kotlin.jvm.internal.C19383o.m32805o(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.giftcards.GiftCardCreateFragment.addGiftCardAmountButtons(java.util.List):void");
    }

    private final String getDeceitfulCurrencyCode() {
        String[] strArr = supportedCurrencies;
        String a = getUserCurrency().mo21246a();
        C19383o.m32797g(strArr, "<this>");
        return C19318k.m32615g1(strArr, a) >= 0 ? getUserCurrency().mo21246a() : "USD";
    }

    private final String getDeceitfulLocaleHeader() {
        return getDeceitfulCurrencyCode() + '|' + getCurrentLocale().mo46717a() + '|' + getCurrentLocale().mo46719c().getCountry();
    }

    private final void handleError(String str) {
        LogCatKt.m17045a().mo21306a(str);
        showError();
    }

    /* access modifiers changed from: private */
    public final void onAddToCart() {
        String str;
        if (validateFormData()) {
            RadioGroup radioGroup = this.radioGroupCardValue;
            if (radioGroup != null) {
                int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();
                if (checkedRadioButtonId == 0) {
                    LogCatKt.m17045a().mo21306a("No Gift Card Value was retrieved");
                    return;
                }
                View view = this.loadingView;
                if (view != null) {
                    ViewExtensions.m12869m(view);
                    RadioGroup radioGroup2 = this.radioGroupDeliveryOption;
                    if (radioGroup2 != null) {
                        if (radioGroup2.getCheckedRadioButtonId() == R.id.option_emailed) {
                            CollageTextInput collageTextInput = this.txtInputEmail;
                            if (collageTextInput != null) {
                                str = C19459m.m33035H1(collageTextInput.getText()).toString();
                            } else {
                                C19383o.m32805o("txtInputEmail");
                                throw null;
                            }
                        } else {
                            str = "";
                        }
                        String str2 = str;
                        GiftCardDesignSelecterView giftCardDesignSelecterView = this.giftCardDesignSelector;
                        if (giftCardDesignSelecterView != null) {
                            int selectedGiftCardId = giftCardDesignSelecterView.getSelectedGiftCardId();
                            RadioGroup radioGroup3 = this.radioGroupDeliveryOption;
                            if (radioGroup3 != null) {
                                boolean z = radioGroup3.getCheckedRadioButtonId() == R.id.option_emailed;
                                CollageTextInput collageTextInput2 = this.txtInputRecipientName;
                                if (collageTextInput2 != null) {
                                    String text = collageTextInput2.getText();
                                    CollageTextInput collageTextInput3 = this.txtInputSenderName;
                                    if (collageTextInput3 != null) {
                                        String text2 = collageTextInput3.getText();
                                        CollageTextInput collageTextInput4 = this.txtInputMessage;
                                        if (collageTextInput4 != null) {
                                            String text3 = collageTextInput4.getText();
                                            String str3 = getInstallInfo().f28895a;
                                            C19383o.m32796f(str3, "installInfo.guestId");
                                            boolean e = getSession().mo45960e();
                                            String deceitfulCurrencyCode = getDeceitfulCurrencyCode();
                                            C19383o.m32797g(str2, "recipientEmail");
                                            C19383o.m32797g(text, "recipientName");
                                            C19383o.m32797g(text2, "senderName");
                                            C19383o.m32797g(text3, "message");
                                            C19383o.m32797g(deceitfulCurrencyCode, AppsFlyerProperties.CURRENCY_CODE);
                                            C9917g giftCardRepository2 = getGiftCardRepository();
                                            giftCardRepository2.getClass();
                                            GiftCardRequest giftCardRequest = new GiftCardRequest(checkedRadioButtonId, text, text2, z, Integer.valueOf(selectedGiftCardId), str2, text3, deceitfulCurrencyCode);
                                            C8048a d = e ? giftCardRepository2.f21870a.mo33068d(giftCardRequest) : giftCardRepository2.f21870a.mo33066b(str3, giftCardRequest);
                                            getSchedulers().getClass();
                                            C8066r b = C13461f.m21235b();
                                            d.getClass();
                                            CompletableSubscribeOn completableSubscribeOn = new CompletableSubscribeOn(d, b);
                                            getSchedulers().getClass();
                                            Disposable d2 = SubscribersKt.m32499d(new CompletableObserveOn(completableSubscribeOn, C13461f.m21236c()), new GiftCardCreateFragment$onAddToCart$2(this), new GiftCardCreateFragment$onAddToCart$1(this));
                                            C7091a aVar = this.compositeDisposable;
                                            C19383o.m32798h(aVar, "compositeDisposable");
                                            aVar.mo19403b(d2);
                                            return;
                                        }
                                        C19383o.m32805o("txtInputMessage");
                                        throw null;
                                    }
                                    C19383o.m32805o("txtInputSenderName");
                                    throw null;
                                }
                                C19383o.m32805o("txtInputRecipientName");
                                throw null;
                            }
                            C19383o.m32805o("radioGroupDeliveryOption");
                            throw null;
                        }
                        C19383o.m32805o("giftCardDesignSelector");
                        throw null;
                    }
                    C19383o.m32805o("radioGroupDeliveryOption");
                    throw null;
                }
                C19383o.m32805o("loadingView");
                throw null;
            }
            C19383o.m32805o("radioGroupCardValue");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onCreateView$lambda-1  reason: not valid java name */
    public static final void m34983onCreateView$lambda1(GiftCardCreateFragment giftCardCreateFragment, RadioGroup radioGroup, int i) {
        C19383o.m32797g(giftCardCreateFragment, "this$0");
        int i2 = 0;
        boolean z = i == R.id.option_emailed;
        ViewGroup viewGroup = giftCardCreateFragment.layoutEmail;
        if (viewGroup != null) {
            if (!z) {
                i2 = 8;
            }
            viewGroup.setVisibility(i2);
            ViewGroup viewGroup2 = giftCardCreateFragment.layoutEmail;
            if (viewGroup2 != null) {
                viewGroup2.animate().alpha(z ? 1.0f : 0.0f);
                Button button = giftCardCreateFragment.btnAddToCard;
                if (button != null) {
                    button.setEnabled(giftCardCreateFragment.validateFormData());
                } else {
                    C19383o.m32805o("btnAddToCard");
                    throw null;
                }
            } else {
                C19383o.m32805o("layoutEmail");
                throw null;
            }
        } else {
            C19383o.m32805o("layoutEmail");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void onGiftCardCreateError(Throwable th) {
        String string = getString(R.string.gift_card_create_submit_error);
        C19383o.m32796f(string, "getString(R.string.gift_card_create_submit_error)");
        getAnalyticsContext().mo21333d("gift_card_create_error", (Map<? extends AnalyticsProperty, Object>) null);
        LogCatKt.m17045a().error(th);
        View view = this.loadingView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            Context requireContext = requireContext();
            C19383o.m32796f(requireContext, "requireContext()");
            C9056g gVar = new C9056g(requireContext);
            gVar.f286a.f264f = string;
            gVar.setPositiveButton(R.string.ok, new C9911b(0)).create().show();
            return;
        }
        C19383o.m32805o("loadingView");
        throw null;
    }

    /* access modifiers changed from: private */
    /* renamed from: onGiftCardCreateError$lambda-6  reason: not valid java name */
    public static final void m34984onGiftCardCreateError$lambda6(DialogInterface dialogInterface, int i) {
        C19383o.m32797g(dialogInterface, "<anonymous parameter 0>");
    }

    /* access modifiers changed from: private */
    public final void onGiftCardCreated() {
        getAnalyticsContext().mo21333d("gift_card_created", (Map<? extends AnalyticsProperty, Object>) null);
        C8901g0.m17338d(getContext(), getString(R.string.gift_card_create_success));
        C12788a.m20426e(getActivity());
        getCartBadgeCountRepo().mo31437b();
        getCartRefreshEventManager().f20595a.onNext(C9315k.C9319d.f20591a);
    }

    private final void requestGiftCardAmounts() {
        String deceitfulLocaleHeader = getDeceitfulLocaleHeader();
        C9917g giftCardRepository2 = getGiftCardRepository();
        giftCardRepository2.getClass();
        C8071s<GiftCardAmountValues> c = giftCardRepository2.f21870a.mo33067c(deceitfulLocaleHeader);
        C8567a aVar = new C8567a(1);
        c.getClass();
        C19208j jVar = new C19208j(c, aVar);
        getSchedulers().getClass();
        SingleSubscribeOn i = jVar.mo20660i(C13461f.m21235b());
        getSchedulers().getClass();
        this.amountDisposable = i.mo20657f(C13461f.m21236c()).mo20658g(new C13387c(this, 3), new C10673m(this, 4));
    }

    /* access modifiers changed from: private */
    /* renamed from: requestGiftCardAmounts$lambda-4  reason: not valid java name */
    public static final void m34985requestGiftCardAmounts$lambda4(GiftCardCreateFragment giftCardCreateFragment, GiftCardAmounts giftCardAmounts2) {
        C19383o.m32797g(giftCardCreateFragment, "this$0");
        List<GiftCardAmountValues> component1 = giftCardAmounts2.component1();
        if (!component1.isEmpty()) {
            giftCardCreateFragment.giftCardAmounts = component1.get(0).getValues();
            giftCardCreateFragment.updateFormDisplay();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: requestGiftCardAmounts$lambda-5  reason: not valid java name */
    public static final void m34986requestGiftCardAmounts$lambda5(GiftCardCreateFragment giftCardCreateFragment, Throwable th) {
        C19383o.m32797g(giftCardCreateFragment, "this$0");
        C19383o.m32797g(th, "throwable");
        giftCardCreateFragment.handleError(th.getMessage());
    }

    private final void requestGiftCardDesigns() {
        C8071s<List<GiftCardDesign>> a = getGiftCardRepository().f21870a.mo33065a();
        C8568b bVar = new C8568b(2);
        a.getClass();
        C19208j jVar = new C19208j(a, bVar);
        getSchedulers().getClass();
        SingleSubscribeOn i = jVar.mo20660i(C13461f.m21235b());
        getSchedulers().getClass();
        this.designDisposable = i.mo20657f(C13461f.m21236c()).mo20658g(new C13263n(this, 3), new C13089i(this, 5));
    }

    /* access modifiers changed from: private */
    /* renamed from: requestGiftCardDesigns$lambda-2  reason: not valid java name */
    public static final void m34987requestGiftCardDesigns$lambda2(GiftCardCreateFragment giftCardCreateFragment, GiftCardDesigns giftCardDesigns2) {
        C19383o.m32797g(giftCardCreateFragment, "this$0");
        C19383o.m32797g(giftCardDesigns2, "giftCardDesigns");
        giftCardCreateFragment.giftCardDesigns = giftCardDesigns2.getResults();
        giftCardCreateFragment.updateFormDisplay();
    }

    /* access modifiers changed from: private */
    /* renamed from: requestGiftCardDesigns$lambda-3  reason: not valid java name */
    public static final void m34988requestGiftCardDesigns$lambda3(GiftCardCreateFragment giftCardCreateFragment, Throwable th) {
        C19383o.m32797g(giftCardCreateFragment, "this$0");
        C19383o.m32797g(th, "throwable");
        giftCardCreateFragment.handleError(th.getMessage());
    }

    private final void showError() {
        View view = this.loadingView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            ViewGroup viewGroup = this.formLayout;
            if (viewGroup != null) {
                ViewExtensions.m12860d(viewGroup);
                View view2 = this.errorView;
                if (view2 != null) {
                    ViewExtensions.m12869m(view2);
                } else {
                    C19383o.m32805o("errorView");
                    throw null;
                }
            } else {
                C19383o.m32805o("formLayout");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingView");
            throw null;
        }
    }

    /* access modifiers changed from: private */
    public final void startLoading() {
        this.giftCardDesigns = null;
        this.giftCardAmounts = null;
        ViewGroup viewGroup = this.formLayout;
        if (viewGroup != null) {
            ViewExtensions.m12860d(viewGroup);
            View view = this.errorView;
            if (view != null) {
                ViewExtensions.m12860d(view);
                View view2 = this.loadingView;
                if (view2 != null) {
                    ViewExtensions.m12869m(view2);
                    requestGiftCardDesigns();
                    requestGiftCardAmounts();
                    return;
                }
                C19383o.m32805o("loadingView");
                throw null;
            }
            C19383o.m32805o("errorView");
            throw null;
        }
        C19383o.m32805o("formLayout");
        throw null;
    }

    private final void stopLoading() {
        View view = this.loadingView;
        if (view != null) {
            ViewExtensions.m12860d(view);
            View view2 = this.errorView;
            if (view2 != null) {
                ViewExtensions.m12860d(view2);
                ViewGroup viewGroup = this.formLayout;
                if (viewGroup != null) {
                    ViewExtensions.m12869m(viewGroup);
                } else {
                    C19383o.m32805o("formLayout");
                    throw null;
                }
            } else {
                C19383o.m32805o("errorView");
                throw null;
            }
        } else {
            C19383o.m32805o("loadingView");
            throw null;
        }
    }

    private final void updateFormDisplay() {
        List<GiftCardDesign> list = this.giftCardDesigns;
        if (list != null && this.giftCardAmounts != null) {
            GiftCardDesignSelecterView giftCardDesignSelecterView = this.giftCardDesignSelector;
            if (giftCardDesignSelecterView != null) {
                giftCardDesignSelecterView.setGiftCardDesigns(list);
                List<Integer> list2 = this.giftCardAmounts;
                C19383o.m32794d(list2);
                addGiftCardAmountButtons(list2);
                stopLoading();
                return;
            }
            C19383o.m32805o("giftCardDesignSelector");
            throw null;
        }
    }

    private final void validateEmails() {
        Pattern pattern = Patterns.EMAIL_ADDRESS;
        CollageTextInput collageTextInput = this.txtInputEmail;
        if (collageTextInput != null) {
            if (!pattern.matcher(collageTextInput.getText()).matches()) {
                CollageTextInput collageTextInput2 = this.txtInputEmail;
                if (collageTextInput2 != null) {
                    collageTextInput2.setErrorText(getString(R.string.error_email_invalid));
                } else {
                    C19383o.m32805o("txtInputEmail");
                    throw null;
                }
            } else {
                CollageTextInput collageTextInput3 = this.txtInputEmail;
                if (collageTextInput3 != null) {
                    collageTextInput3.setErrorText((String) null);
                    CollageTextInput collageTextInput4 = this.txtInputEmailConfirm;
                    if (collageTextInput4 != null) {
                        collageTextInput4.setErrorText((String) null);
                    } else {
                        C19383o.m32805o("txtInputEmailConfirm");
                        throw null;
                    }
                } else {
                    C19383o.m32805o("txtInputEmail");
                    throw null;
                }
            }
            CollageTextInput collageTextInput5 = this.txtInputEmail;
            if (collageTextInput5 != null) {
                String text = collageTextInput5.getText();
                CollageTextInput collageTextInput6 = this.txtInputEmailConfirm;
                if (collageTextInput6 == null) {
                    C19383o.m32805o("txtInputEmailConfirm");
                    throw null;
                } else if (!C19383o.m32792b(text, collageTextInput6.getText())) {
                    CollageTextInput collageTextInput7 = this.txtInputEmailConfirm;
                    if (collageTextInput7 != null) {
                        collageTextInput7.setErrorText(getString(R.string.error_email_match));
                    } else {
                        C19383o.m32805o("txtInputEmailConfirm");
                        throw null;
                    }
                } else {
                    CollageTextInput collageTextInput8 = this.txtInputEmail;
                    if (collageTextInput8 != null) {
                        collageTextInput8.setErrorText((String) null);
                        CollageTextInput collageTextInput9 = this.txtInputEmailConfirm;
                        if (collageTextInput9 != null) {
                            collageTextInput9.setErrorText((String) null);
                        } else {
                            C19383o.m32805o("txtInputEmailConfirm");
                            throw null;
                        }
                    } else {
                        C19383o.m32805o("txtInputEmail");
                        throw null;
                    }
                }
            } else {
                C19383o.m32805o("txtInputEmail");
                throw null;
            }
        } else {
            C19383o.m32805o("txtInputEmail");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x009f, code lost:
        if (r3.equals(r4) != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean validateFormData() {
        /*
            r9 = this;
            com.etsy.android.stylekit.views.CollageTextInput r0 = r9.txtInputSenderName
            r1 = 0
            if (r0 == 0) goto L_0x00c1
            java.lang.String r0 = r0.getText()
            java.lang.CharSequence r0 = kotlin.text.C19459m.m33035H1(r0)
            java.lang.String r0 = r0.toString()
            com.etsy.android.stylekit.views.CollageTextInput r2 = r9.txtInputRecipientName
            if (r2 == 0) goto L_0x00bb
            java.lang.String r2 = r2.getText()
            java.lang.CharSequence r2 = kotlin.text.C19459m.m33035H1(r2)
            java.lang.String r2 = r2.toString()
            com.etsy.android.stylekit.views.CollageTextInput r3 = r9.txtInputEmail
            if (r3 == 0) goto L_0x00b5
            java.lang.String r3 = r3.getText()
            com.etsy.android.stylekit.views.CollageTextInput r4 = r9.txtInputEmailConfirm
            if (r4 == 0) goto L_0x00af
            java.lang.String r4 = r4.getText()
            android.widget.RadioGroup r5 = r9.radioGroupCardValue
            java.lang.String r6 = "radioGroupCardValue"
            if (r5 == 0) goto L_0x00ab
            int r5 = r5.getCheckedRadioButtonId()
            int r0 = r0.length()
            r7 = 1
            r8 = 0
            if (r0 <= 0) goto L_0x0045
            r0 = r7
            goto L_0x0046
        L_0x0045:
            r0 = r8
        L_0x0046:
            if (r0 == 0) goto L_0x006b
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0050
            r0 = r7
            goto L_0x0051
        L_0x0050:
            r0 = r8
        L_0x0051:
            if (r0 == 0) goto L_0x006b
            r0 = -1
            if (r5 == r0) goto L_0x006b
            android.widget.RadioGroup r0 = r9.radioGroupCardValue
            if (r0 == 0) goto L_0x0067
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L_0x0062
            r0 = r7
            goto L_0x0063
        L_0x0062:
            r0 = r8
        L_0x0063:
            if (r0 == 0) goto L_0x006b
            r0 = r7
            goto L_0x006c
        L_0x0067:
            kotlin.jvm.internal.C19383o.m32805o(r6)
            throw r1
        L_0x006b:
            r0 = r8
        L_0x006c:
            android.widget.RadioGroup r2 = r9.radioGroupDeliveryOption
            if (r2 == 0) goto L_0x00a5
            int r1 = r2.getCheckedRadioButtonId()
            r2 = 2131429167(0x7f0b072f, float:1.848E38)
            if (r1 != r2) goto L_0x00a4
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x0081
            r1 = r7
            goto L_0x0082
        L_0x0081:
            r1 = r8
        L_0x0082:
            if (r1 == 0) goto L_0x00a2
            int r1 = r4.length()
            if (r1 <= 0) goto L_0x008c
            r1 = r7
            goto L_0x008d
        L_0x008c:
            r1 = r8
        L_0x008d:
            if (r1 == 0) goto L_0x00a2
            java.util.regex.Pattern r1 = android.util.Patterns.EMAIL_ADDRESS
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r1 = r1.matches()
            if (r1 == 0) goto L_0x00a2
            boolean r1 = r3.equals(r4)
            if (r1 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r7 = r8
        L_0x00a3:
            r0 = r0 & r7
        L_0x00a4:
            return r0
        L_0x00a5:
            java.lang.String r0 = "radioGroupDeliveryOption"
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r1
        L_0x00ab:
            kotlin.jvm.internal.C19383o.m32805o(r6)
            throw r1
        L_0x00af:
            java.lang.String r0 = "txtInputEmailConfirm"
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r1
        L_0x00b5:
            java.lang.String r0 = "txtInputEmail"
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r1
        L_0x00bb:
            java.lang.String r0 = "txtInputRecipientName"
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r1
        L_0x00c1:
            java.lang.String r0 = "txtInputSenderName"
            kotlin.jvm.internal.C19383o.m32805o(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.giftcards.GiftCardCreateFragment.validateFormData():boolean");
    }

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        View findViewById;
        Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public void afterTextChanged(Editable editable) {
        boolean z;
        Button button = this.btnAddToCard;
        if (button != null) {
            button.setEnabled(validateFormData());
            CollageTextInput collageTextInput = this.txtInputEmail;
            if (collageTextInput != null) {
                if (C19383o.m32792b(editable, collageTextInput.getEditable())) {
                    z = true;
                } else {
                    CollageTextInput collageTextInput2 = this.txtInputEmailConfirm;
                    if (collageTextInput2 != null) {
                        z = C19383o.m32792b(editable, collageTextInput2.getEditable());
                    } else {
                        C19383o.m32805o("txtInputEmailConfirm");
                        throw null;
                    }
                }
                if (z) {
                    validateEmails();
                    return;
                }
                return;
            }
            C19383o.m32805o("txtInputEmail");
            throw null;
        }
        C19383o.m32805o("btnAddToCard");
        throw null;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final CartBadgeCountRepo getCartBadgeCountRepo() {
        CartBadgeCountRepo cartBadgeCountRepo2 = this.cartBadgeCountRepo;
        if (cartBadgeCountRepo2 != null) {
            return cartBadgeCountRepo2;
        }
        C19383o.m32805o("cartBadgeCountRepo");
        throw null;
    }

    public final C9323l getCartRefreshEventManager() {
        C9323l lVar = this.cartRefreshEventManager;
        if (lVar != null) {
            return lVar;
        }
        C19383o.m32805o("cartRefreshEventManager");
        throw null;
    }

    public final C8618c getConfigMap() {
        C8618c cVar = this.configMap;
        if (cVar != null) {
            return cVar;
        }
        C19383o.m32805o("configMap");
        throw null;
    }

    public final C13888d getCurrentLocale() {
        C13888d dVar = this.currentLocale;
        if (dVar != null) {
            return dVar;
        }
        C19383o.m32805o("currentLocale");
        throw null;
    }

    public final C8630b getEtsyMoneyFactory() {
        C8630b bVar = this.etsyMoneyFactory;
        if (bVar != null) {
            return bVar;
        }
        C19383o.m32805o("etsyMoneyFactory");
        throw null;
    }

    public int getFragmentTitle() {
        return R.string.create_gift_card;
    }

    public final C9917g getGiftCardRepository() {
        C9917g gVar = this.giftCardRepository;
        if (gVar != null) {
            return gVar;
        }
        C19383o.m32805o("giftCardRepository");
        throw null;
    }

    public final C13138q getInstallInfo() {
        C13138q qVar = this.installInfo;
        if (qVar != null) {
            return qVar;
        }
        C19383o.m32805o("installInfo");
        throw null;
    }

    public /* bridge */ /* synthetic */ C8709f getPerformanceTracker() {
        return null;
    }

    public final C13461f getSchedulers() {
        C13461f fVar = this.schedulers;
        if (fVar != null) {
            return fVar;
        }
        C19383o.m32805o("schedulers");
        throw null;
    }

    public final C13265p getSession() {
        C13265p pVar = this.session;
        if (pVar != null) {
            return pVar;
        }
        C19383o.m32805o("session");
        throw null;
    }

    public String getTrackingName() {
        return "create_gift_card";
    }

    public final C8637h getUserCurrency() {
        C8637h hVar = this.userCurrency;
        if (hVar != null) {
            return hVar;
        }
        C19383o.m32805o("userCurrency");
        throw null;
    }

    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        Button button = this.btnAddToCard;
        if (button != null) {
            button.setEnabled(validateFormData());
        } else {
            C19383o.m32805o("btnAddToCard");
            throw null;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C19383o.m32797g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.fragment_gift_card_create, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.form_layout);
        C19383o.m32796f(findViewById, "view.findViewById(R.id.form_layout)");
        this.formLayout = (ViewGroup) findViewById;
        View findViewById2 = inflate.findViewById(R.id.loading_view);
        C19383o.m32796f(findViewById2, "view.findViewById(R.id.loading_view)");
        this.loadingView = findViewById2;
        Context context = getContext();
        if (context != null) {
            View view = this.loadingView;
            if (view != null) {
                Object obj = C8184a.f17966a;
                view.setBackgroundColor(C8184a.C8188d.m16468a(context, R.color.drawer_scrim));
            } else {
                C19383o.m32805o("loadingView");
                throw null;
            }
        }
        View findViewById3 = inflate.findViewById(R.id.error_view);
        C19383o.m32796f(findViewById3, "view.findViewById(R.id.error_view)");
        this.errorView = findViewById3;
        View findViewById4 = inflate.findViewById(R.id.btn_retry_internet);
        C19383o.m32796f(findViewById4, "view.findViewById(R.id.btn_retry_internet)");
        Button button = (Button) findViewById4;
        this.retryButton = button;
        button.setOnClickListener(this.retryClickListener);
        View findViewById5 = inflate.findViewById(R.id.textInputSenderName);
        C19383o.m32796f(findViewById5, "view.findViewById(R.id.textInputSenderName)");
        CollageTextInput collageTextInput = (CollageTextInput) findViewById5;
        this.txtInputSenderName = collageTextInput;
        collageTextInput.setTextChangeListener(this);
        View findViewById6 = inflate.findViewById(R.id.textInputRecipientName);
        C19383o.m32796f(findViewById6, "view.findViewById(R.id.textInputRecipientName)");
        CollageTextInput collageTextInput2 = (CollageTextInput) findViewById6;
        this.txtInputRecipientName = collageTextInput2;
        collageTextInput2.setTextChangeListener(this);
        View findViewById7 = inflate.findViewById(R.id.textInputMessage);
        C19383o.m32796f(findViewById7, "view.findViewById(R.id.textInputMessage)");
        this.txtInputMessage = (CollageTextInput) findViewById7;
        View findViewById8 = inflate.findViewById(R.id.textInputEmail);
        C19383o.m32796f(findViewById8, "view.findViewById(R.id.textInputEmail)");
        CollageTextInput collageTextInput3 = (CollageTextInput) findViewById8;
        this.txtInputEmail = collageTextInput3;
        collageTextInput3.setTextChangeListener(this);
        View findViewById9 = inflate.findViewById(R.id.textInputEmailConfirm);
        C19383o.m32796f(findViewById9, "view.findViewById(R.id.textInputEmailConfirm)");
        CollageTextInput collageTextInput4 = (CollageTextInput) findViewById9;
        this.txtInputEmailConfirm = collageTextInput4;
        collageTextInput4.setTextChangeListener(this);
        View findViewById10 = inflate.findViewById(R.id.layout_email);
        C19383o.m32796f(findViewById10, "view.findViewById(R.id.layout_email)");
        this.layoutEmail = (ViewGroup) findViewById10;
        View findViewById11 = inflate.findViewById(R.id.view_gift_card_design_selector);
        C19383o.m32796f(findViewById11, "view.findViewById(R.id.v…ift_card_design_selector)");
        this.giftCardDesignSelector = (GiftCardDesignSelecterView) findViewById11;
        View findViewById12 = inflate.findViewById(R.id.delivery_option);
        C19383o.m32796f(findViewById12, "view.findViewById(R.id.delivery_option)");
        RadioGroup radioGroup = (RadioGroup) findViewById12;
        this.radioGroupDeliveryOption = radioGroup;
        radioGroup.setOnCheckedChangeListener(new C9910a(this));
        View findViewById13 = inflate.findViewById(R.id.card_value);
        C19383o.m32796f(findViewById13, "view.findViewById(R.id.card_value)");
        RadioGroup radioGroup2 = (RadioGroup) findViewById13;
        this.radioGroupCardValue = radioGroup2;
        radioGroup2.setOnCheckedChangeListener(this);
        View findViewById14 = inflate.findViewById(R.id.button_add_to_cart);
        C19383o.m32796f(findViewById14, "view.findViewById(R.id.button_add_to_cart)");
        Button button2 = (Button) findViewById14;
        this.btnAddToCard = button2;
        button2.setOnClickListener(new GiftCardCreateFragment$onCreateView$3(this));
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        Disposable disposable = this.designDisposable;
        if (disposable != null) {
            C19383o.m32794d(disposable);
            disposable.dispose();
        }
        Disposable disposable2 = this.amountDisposable;
        if (disposable2 != null) {
            C19383o.m32794d(disposable2);
            disposable2.dispose();
        }
        this.compositeDisposable.mo19405d();
    }

    public void onSaveInstanceState(Bundle bundle) {
        C19383o.m32797g(bundle, "bundle");
        super.onSaveInstanceState(bundle);
        if (C19543e0.m33306Y(this.giftCardDesigns) && C19543e0.m33306Y(this.giftCardAmounts)) {
            TransactionViewModel<C11869a> transactionViewModel2 = this.transactionViewModel;
            if (transactionViewModel2 != null) {
                C11869a aVar = (C11869a) transactionViewModel2.f26405b;
                aVar.mo38349f(SAVE_DESIGNS, this.giftCardDesigns);
                aVar.mo38349f(SAVE_AMOUNTS, this.giftCardAmounts);
                return;
            }
            C19383o.m32805o("transactionViewModel");
            throw null;
        }
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.util.List<java.lang.Integer>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.String r4 = "view"
            kotlin.jvm.internal.C19383o.m32797g(r3, r4)
            com.etsy.android.uikit.nav.transactions.a r3 = new com.etsy.android.uikit.nav.transactions.a
            r3.<init>()
            com.etsy.android.uikit.nav.transactions.TransactionViewModel r3 = p628nj.C18263b.m30829X(r2, r3)
            r2.transactionViewModel = r3
            S r3 = r3.f26405b
            com.etsy.android.uikit.nav.transactions.a r3 = (com.etsy.android.uikit.nav.transactions.C11869a) r3
            java.lang.String r4 = "save_designs"
            java.lang.Object r4 = r3.mo38345b(r4)
            boolean r0 = r4 instanceof java.util.List
            r1 = 0
            if (r0 == 0) goto L_0x0022
            java.util.List r4 = (java.util.List) r4
            goto L_0x0023
        L_0x0022:
            r4 = r1
        L_0x0023:
            r2.giftCardDesigns = r4
            java.lang.String r4 = "save_amounts"
            java.lang.Object r3 = r3.mo38345b(r4)
            boolean r4 = r3 instanceof java.util.List
            if (r4 == 0) goto L_0x0032
            r1 = r3
            java.util.List r1 = (java.util.List) r1
        L_0x0032:
            r2.giftCardAmounts = r1
            java.util.List<com.etsy.android.lib.models.GiftCardDesign> r3 = r2.giftCardDesigns
            boolean r3 = kotlinx.coroutines.C19543e0.m33306Y(r3)
            if (r3 == 0) goto L_0x0048
            java.util.List<java.lang.Integer> r3 = r2.giftCardAmounts
            boolean r3 = kotlinx.coroutines.C19543e0.m33306Y(r3)
            if (r3 == 0) goto L_0x0048
            r2.updateFormDisplay()
            goto L_0x004b
        L_0x0048:
            r2.startLoading()
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.etsy.android.p327ui.giftcards.GiftCardCreateFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setCartBadgeCountRepo(CartBadgeCountRepo cartBadgeCountRepo2) {
        C19383o.m32797g(cartBadgeCountRepo2, "<set-?>");
        this.cartBadgeCountRepo = cartBadgeCountRepo2;
    }

    public final void setCartRefreshEventManager(C9323l lVar) {
        C19383o.m32797g(lVar, "<set-?>");
        this.cartRefreshEventManager = lVar;
    }

    public final void setConfigMap(C8618c cVar) {
        C19383o.m32797g(cVar, "<set-?>");
        this.configMap = cVar;
    }

    public final void setCurrentLocale(C13888d dVar) {
        C19383o.m32797g(dVar, "<set-?>");
        this.currentLocale = dVar;
    }

    public final void setEtsyMoneyFactory(C8630b bVar) {
        C19383o.m32797g(bVar, "<set-?>");
        this.etsyMoneyFactory = bVar;
    }

    public final void setGiftCardRepository(C9917g gVar) {
        C19383o.m32797g(gVar, "<set-?>");
        this.giftCardRepository = gVar;
    }

    public final void setInstallInfo(C13138q qVar) {
        C19383o.m32797g(qVar, "<set-?>");
        this.installInfo = qVar;
    }

    public final void setSchedulers(C13461f fVar) {
        C19383o.m32797g(fVar, "<set-?>");
        this.schedulers = fVar;
    }

    public final void setSession(C13265p pVar) {
        C19383o.m32797g(pVar, "<set-?>");
        this.session = pVar;
    }

    public final void setUserCurrency(C8637h hVar) {
        C19383o.m32797g(hVar, "<set-?>");
        this.userCurrency = hVar;
    }
}
