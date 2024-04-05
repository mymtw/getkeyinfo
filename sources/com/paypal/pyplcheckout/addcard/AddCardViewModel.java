package com.paypal.pyplcheckout.addcard;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.support.p013v4.media.C0073e;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.animation.C0388a;
import androidx.compose.animation.C0391c;
import androidx.lifecycle.C2866i0;
import androidx.lifecycle.C2895z;
import androidx.lifecycle.LiveData;
import com.etsy.android.lib.models.ResponseConstants;
import com.google.gson.C16708i;
import com.paypal.checkout.error.ErrorReason;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.addcard.usecase.AddCardContingencyException;
import com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase;
import com.paypal.pyplcheckout.addcard.usecase.GetAddCardEnabledUseCase;
import com.paypal.pyplcheckout.common.instrumentation.InstrumentationEvent;
import com.paypal.pyplcheckout.common.instrumentation.PEnums;
import com.paypal.pyplcheckout.common.instrumentation.PLog;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.events.PayPalEventTypes;
import com.paypal.pyplcheckout.events.ResultData;
import com.paypal.pyplcheckout.events.Success;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.model.PaymentProcessors;
import com.paypal.pyplcheckout.p539ab.featureflag.Feature;
import com.paypal.pyplcheckout.p539ab.featureflag.FeatureFlagManager;
import com.paypal.pyplcheckout.pojo.AddCardAnalytics;
import com.paypal.pyplcheckout.pojo.CardIssuerType;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.pojo.SupportedFundingSources;
import com.paypal.pyplcheckout.pojo.User;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase;
import com.paypal.pyplcheckout.utils.AppBuildConfig;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.C19394m;
import kotlin.collections.C19322o;
import kotlin.coroutines.C19340c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.C19388s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C19697g;
import kotlinx.coroutines.C19699g1;
import kotlinx.coroutines.CoroutineStart;
import p003a2.C0023f;
import p753kq.C19846a;

@SuppressLint({"StaticFieldLeak"})
public final class AddCardViewModel extends C2866i0 {
    private final C2895z<AddCardAlertUiModel> _addCardAlertUiModel;
    private final C2895z<AddCardLoadingState> _addCardLoadingState;
    private final C2895z<String> _cardNumber = new C2895z<>("");
    private final C2895z<PaymentProcessors> _paymentProcessor = new C2895z<>(PaymentProcessors.NOTFOUND);
    private final GetAddCardEnabledUseCase addCardEnabledUseCase;
    private final LiveData<AddCardLoadingState> addCardLoadingState;
    /* access modifiers changed from: private */
    public final AddCardUseCase addCardUseCase;
    /* access modifiers changed from: private */
    public final Context context;
    private final DebugConfigManager debugConfigManager;
    /* access modifiers changed from: private */
    public final Events events;
    private final C16708i gson;
    private C19846a<C19394m> nativeAddCardListener;
    private final PYPLCheckoutUtils pyplCheckoutUtils;
    private final Repository repository;
    /* access modifiers changed from: private */
    public final StartAddCardThreeDsUseCase startAddCardThreeDs;

    public static abstract class AddCardAlertUiModel {

        public static abstract class Error extends AddCardAlertUiModel {

            public static final class Generic extends Error {
                private final int backgroundColor;
                private final String description;
                private final String header;
                private final int textColor;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Generic(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i3 & 1) != 0 ? "" : str, str2, i, i2);
                }

                public static /* synthetic */ Generic copy$default(Generic generic, String str, String str2, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = generic.getHeader();
                    }
                    if ((i3 & 2) != 0) {
                        str2 = generic.getDescription();
                    }
                    if ((i3 & 4) != 0) {
                        i = generic.getTextColor();
                    }
                    if ((i3 & 8) != 0) {
                        i2 = generic.getBackgroundColor();
                    }
                    return generic.copy(str, str2, i, i2);
                }

                public final String component1() {
                    return getHeader();
                }

                public final String component2() {
                    return getDescription();
                }

                public final int component3() {
                    return getTextColor();
                }

                public final int component4() {
                    return getBackgroundColor();
                }

                public final Generic copy(String str, String str2, int i, int i2) {
                    C19383o.m32797g(str, ResponseConstants.HEADER);
                    C19383o.m32797g(str2, "description");
                    return new Generic(str, str2, i, i2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Generic)) {
                        return false;
                    }
                    Generic generic = (Generic) obj;
                    return C19383o.m32792b(getHeader(), generic.getHeader()) && C19383o.m32792b(getDescription(), generic.getDescription()) && getTextColor() == generic.getTextColor() && getBackgroundColor() == generic.getBackgroundColor();
                }

                public int getBackgroundColor() {
                    return this.backgroundColor;
                }

                public String getDescription() {
                    return this.description;
                }

                public String getHeader() {
                    return this.header;
                }

                public int getTextColor() {
                    return this.textColor;
                }

                public int hashCode() {
                    int hashCode = getDescription().hashCode();
                    int hashCode2 = Integer.hashCode(getTextColor());
                    return Integer.hashCode(getBackgroundColor()) + ((hashCode2 + ((hashCode + (getHeader().hashCode() * 31)) * 31)) * 31);
                }

                public String toString() {
                    String header2 = getHeader();
                    String description2 = getDescription();
                    int textColor2 = getTextColor();
                    int backgroundColor2 = getBackgroundColor();
                    StringBuilder f = C0388a.m1050f("Generic(header=", header2, ", description=", description2, ", textColor=");
                    f.append(textColor2);
                    f.append(", backgroundColor=");
                    f.append(backgroundColor2);
                    f.append(")");
                    return f.toString();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Generic(String str, String str2, int i, int i2) {
                    super((DefaultConstructorMarker) null);
                    C19383o.m32797g(str, ResponseConstants.HEADER);
                    C19383o.m32797g(str2, "description");
                    this.header = str;
                    this.description = str2;
                    this.textColor = i;
                    this.backgroundColor = i2;
                }
            }

            public static final class Three_Ds_Replan extends Error {
                private final int backgroundColor;
                private final String description;
                private final String header;
                private final int textColor;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Three_Ds_Replan(String str, String str2, int i, int i2) {
                    super((DefaultConstructorMarker) null);
                    C19383o.m32797g(str, ResponseConstants.HEADER);
                    C19383o.m32797g(str2, "description");
                    this.header = str;
                    this.description = str2;
                    this.textColor = i;
                    this.backgroundColor = i2;
                }

                public static /* synthetic */ Three_Ds_Replan copy$default(Three_Ds_Replan three_Ds_Replan, String str, String str2, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = three_Ds_Replan.getHeader();
                    }
                    if ((i3 & 2) != 0) {
                        str2 = three_Ds_Replan.getDescription();
                    }
                    if ((i3 & 4) != 0) {
                        i = three_Ds_Replan.getTextColor();
                    }
                    if ((i3 & 8) != 0) {
                        i2 = three_Ds_Replan.getBackgroundColor();
                    }
                    return three_Ds_Replan.copy(str, str2, i, i2);
                }

                public final String component1() {
                    return getHeader();
                }

                public final String component2() {
                    return getDescription();
                }

                public final int component3() {
                    return getTextColor();
                }

                public final int component4() {
                    return getBackgroundColor();
                }

                public final Three_Ds_Replan copy(String str, String str2, int i, int i2) {
                    C19383o.m32797g(str, ResponseConstants.HEADER);
                    C19383o.m32797g(str2, "description");
                    return new Three_Ds_Replan(str, str2, i, i2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Three_Ds_Replan)) {
                        return false;
                    }
                    Three_Ds_Replan three_Ds_Replan = (Three_Ds_Replan) obj;
                    return C19383o.m32792b(getHeader(), three_Ds_Replan.getHeader()) && C19383o.m32792b(getDescription(), three_Ds_Replan.getDescription()) && getTextColor() == three_Ds_Replan.getTextColor() && getBackgroundColor() == three_Ds_Replan.getBackgroundColor();
                }

                public int getBackgroundColor() {
                    return this.backgroundColor;
                }

                public String getDescription() {
                    return this.description;
                }

                public String getHeader() {
                    return this.header;
                }

                public int getTextColor() {
                    return this.textColor;
                }

                public int hashCode() {
                    int hashCode = getDescription().hashCode();
                    int hashCode2 = Integer.hashCode(getTextColor());
                    return Integer.hashCode(getBackgroundColor()) + ((hashCode2 + ((hashCode + (getHeader().hashCode() * 31)) * 31)) * 31);
                }

                public String toString() {
                    String header2 = getHeader();
                    String description2 = getDescription();
                    int textColor2 = getTextColor();
                    int backgroundColor2 = getBackgroundColor();
                    StringBuilder f = C0388a.m1050f("Three_Ds_Replan(header=", header2, ", description=", description2, ", textColor=");
                    f.append(textColor2);
                    f.append(", backgroundColor=");
                    f.append(backgroundColor2);
                    f.append(")");
                    return f.toString();
                }
            }

            public static final class Validation extends Error {
                private final int backgroundColor;
                private final String description;
                private final String header;
                private final int textColor;

                /* JADX INFO: this call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Validation(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i3 & 1) != 0 ? "" : str, str2, i, i2);
                }

                public static /* synthetic */ Validation copy$default(Validation validation, String str, String str2, int i, int i2, int i3, Object obj) {
                    if ((i3 & 1) != 0) {
                        str = validation.getHeader();
                    }
                    if ((i3 & 2) != 0) {
                        str2 = validation.getDescription();
                    }
                    if ((i3 & 4) != 0) {
                        i = validation.getTextColor();
                    }
                    if ((i3 & 8) != 0) {
                        i2 = validation.getBackgroundColor();
                    }
                    return validation.copy(str, str2, i, i2);
                }

                public final String component1() {
                    return getHeader();
                }

                public final String component2() {
                    return getDescription();
                }

                public final int component3() {
                    return getTextColor();
                }

                public final int component4() {
                    return getBackgroundColor();
                }

                public final Validation copy(String str, String str2, int i, int i2) {
                    C19383o.m32797g(str, ResponseConstants.HEADER);
                    C19383o.m32797g(str2, "description");
                    return new Validation(str, str2, i, i2);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Validation)) {
                        return false;
                    }
                    Validation validation = (Validation) obj;
                    return C19383o.m32792b(getHeader(), validation.getHeader()) && C19383o.m32792b(getDescription(), validation.getDescription()) && getTextColor() == validation.getTextColor() && getBackgroundColor() == validation.getBackgroundColor();
                }

                public int getBackgroundColor() {
                    return this.backgroundColor;
                }

                public String getDescription() {
                    return this.description;
                }

                public String getHeader() {
                    return this.header;
                }

                public int getTextColor() {
                    return this.textColor;
                }

                public int hashCode() {
                    int hashCode = getDescription().hashCode();
                    int hashCode2 = Integer.hashCode(getTextColor());
                    return Integer.hashCode(getBackgroundColor()) + ((hashCode2 + ((hashCode + (getHeader().hashCode() * 31)) * 31)) * 31);
                }

                public String toString() {
                    String header2 = getHeader();
                    String description2 = getDescription();
                    int textColor2 = getTextColor();
                    int backgroundColor2 = getBackgroundColor();
                    StringBuilder f = C0388a.m1050f("Validation(header=", header2, ", description=", description2, ", textColor=");
                    f.append(textColor2);
                    f.append(", backgroundColor=");
                    f.append(backgroundColor2);
                    f.append(")");
                    return f.toString();
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Validation(String str, String str2, int i, int i2) {
                    super((DefaultConstructorMarker) null);
                    C19383o.m32797g(str, ResponseConstants.HEADER);
                    C19383o.m32797g(str2, "description");
                    this.header = str;
                    this.description = str2;
                    this.textColor = i;
                    this.backgroundColor = i2;
                }
            }

            private Error() {
                super((DefaultConstructorMarker) null);
            }

            public /* synthetic */ Error(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static final class Success extends AddCardAlertUiModel {
            private final int backgroundColor;
            private final String description;
            private final String header;
            private final int textColor;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Success(String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
                this((i3 & 1) != 0 ? "" : str, str2, i, i2);
            }

            public static /* synthetic */ Success copy$default(Success success, String str, String str2, int i, int i2, int i3, Object obj) {
                if ((i3 & 1) != 0) {
                    str = success.getHeader();
                }
                if ((i3 & 2) != 0) {
                    str2 = success.getDescription();
                }
                if ((i3 & 4) != 0) {
                    i = success.getTextColor();
                }
                if ((i3 & 8) != 0) {
                    i2 = success.getBackgroundColor();
                }
                return success.copy(str, str2, i, i2);
            }

            public final String component1() {
                return getHeader();
            }

            public final String component2() {
                return getDescription();
            }

            public final int component3() {
                return getTextColor();
            }

            public final int component4() {
                return getBackgroundColor();
            }

            public final Success copy(String str, String str2, int i, int i2) {
                C19383o.m32797g(str, ResponseConstants.HEADER);
                C19383o.m32797g(str2, "description");
                return new Success(str, str2, i, i2);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return C19383o.m32792b(getHeader(), success.getHeader()) && C19383o.m32792b(getDescription(), success.getDescription()) && getTextColor() == success.getTextColor() && getBackgroundColor() == success.getBackgroundColor();
            }

            public int getBackgroundColor() {
                return this.backgroundColor;
            }

            public String getDescription() {
                return this.description;
            }

            public String getHeader() {
                return this.header;
            }

            public int getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                int hashCode = getDescription().hashCode();
                int hashCode2 = Integer.hashCode(getTextColor());
                return Integer.hashCode(getBackgroundColor()) + ((hashCode2 + ((hashCode + (getHeader().hashCode() * 31)) * 31)) * 31);
            }

            public String toString() {
                String header2 = getHeader();
                String description2 = getDescription();
                int textColor2 = getTextColor();
                int backgroundColor2 = getBackgroundColor();
                StringBuilder f = C0388a.m1050f("Success(header=", header2, ", description=", description2, ", textColor=");
                f.append(textColor2);
                f.append(", backgroundColor=");
                f.append(backgroundColor2);
                f.append(")");
                return f.toString();
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Success(String str, String str2, int i, int i2) {
                super((DefaultConstructorMarker) null);
                C19383o.m32797g(str, ResponseConstants.HEADER);
                C19383o.m32797g(str2, "description");
                this.header = str;
                this.description = str2;
                this.textColor = i;
                this.backgroundColor = i2;
            }
        }

        private AddCardAlertUiModel() {
        }

        public /* synthetic */ AddCardAlertUiModel(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public abstract int getBackgroundColor();

        public abstract String getDescription();

        public abstract String getHeader();

        public abstract int getTextColor();
    }

    public static abstract class AddCardLoadingState {

        public static final class Empty extends AddCardLoadingState {
            public static final Empty INSTANCE = new Empty();

            private Empty() {
                super((DefaultConstructorMarker) null);
            }
        }

        public static final class Idle extends AddCardLoadingState {
            private final String cardNumber;
            private final String csc;
            private final String expiry;
            private final String zipCode;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Idle(String str, String str2, String str3, String str4) {
                super((DefaultConstructorMarker) null);
                C0391c.m1060g(str, "cardNumber", str2, "expiry", str3, "csc", str4, "zipCode");
                this.cardNumber = str;
                this.expiry = str2;
                this.csc = str3;
                this.zipCode = str4;
            }

            public static /* synthetic */ Idle copy$default(Idle idle, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = idle.cardNumber;
                }
                if ((i & 2) != 0) {
                    str2 = idle.expiry;
                }
                if ((i & 4) != 0) {
                    str3 = idle.csc;
                }
                if ((i & 8) != 0) {
                    str4 = idle.zipCode;
                }
                return idle.copy(str, str2, str3, str4);
            }

            public final String component1() {
                return this.cardNumber;
            }

            public final String component2() {
                return this.expiry;
            }

            public final String component3() {
                return this.csc;
            }

            public final String component4() {
                return this.zipCode;
            }

            public final Idle copy(String str, String str2, String str3, String str4) {
                C19383o.m32797g(str, "cardNumber");
                C19383o.m32797g(str2, "expiry");
                C19383o.m32797g(str3, "csc");
                C19383o.m32797g(str4, "zipCode");
                return new Idle(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Idle)) {
                    return false;
                }
                Idle idle = (Idle) obj;
                return C19383o.m32792b(this.cardNumber, idle.cardNumber) && C19383o.m32792b(this.expiry, idle.expiry) && C19383o.m32792b(this.csc, idle.csc) && C19383o.m32792b(this.zipCode, idle.zipCode);
            }

            public final String getCardNumber() {
                return this.cardNumber;
            }

            public final String getCsc() {
                return this.csc;
            }

            public final String getExpiry() {
                return this.expiry;
            }

            public final String getZipCode() {
                return this.zipCode;
            }

            public int hashCode() {
                return this.zipCode.hashCode() + C0023f.m105e(this.csc, C0023f.m105e(this.expiry, this.cardNumber.hashCode() * 31, 31), 31);
            }

            public String toString() {
                String str = this.cardNumber;
                String str2 = this.expiry;
                return C0073e.m210j(C0388a.m1050f("Idle(cardNumber=", str, ", expiry=", str2, ", csc="), this.csc, ", zipCode=", this.zipCode, ")");
            }
        }

        public static final class Loading extends AddCardLoadingState {
            private final String cardNumber;
            private final String csc;
            private final String expiry;
            private final String zipCode;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Loading(String str, String str2, String str3, String str4) {
                super((DefaultConstructorMarker) null);
                C0391c.m1060g(str, "cardNumber", str2, "expiry", str3, "csc", str4, "zipCode");
                this.cardNumber = str;
                this.expiry = str2;
                this.csc = str3;
                this.zipCode = str4;
            }

            public static /* synthetic */ Loading copy$default(Loading loading, String str, String str2, String str3, String str4, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = loading.cardNumber;
                }
                if ((i & 2) != 0) {
                    str2 = loading.expiry;
                }
                if ((i & 4) != 0) {
                    str3 = loading.csc;
                }
                if ((i & 8) != 0) {
                    str4 = loading.zipCode;
                }
                return loading.copy(str, str2, str3, str4);
            }

            public final String component1() {
                return this.cardNumber;
            }

            public final String component2() {
                return this.expiry;
            }

            public final String component3() {
                return this.csc;
            }

            public final String component4() {
                return this.zipCode;
            }

            public final Loading copy(String str, String str2, String str3, String str4) {
                C19383o.m32797g(str, "cardNumber");
                C19383o.m32797g(str2, "expiry");
                C19383o.m32797g(str3, "csc");
                C19383o.m32797g(str4, "zipCode");
                return new Loading(str, str2, str3, str4);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Loading)) {
                    return false;
                }
                Loading loading = (Loading) obj;
                return C19383o.m32792b(this.cardNumber, loading.cardNumber) && C19383o.m32792b(this.expiry, loading.expiry) && C19383o.m32792b(this.csc, loading.csc) && C19383o.m32792b(this.zipCode, loading.zipCode);
            }

            public final String getCardNumber() {
                return this.cardNumber;
            }

            public final String getCsc() {
                return this.csc;
            }

            public final String getExpiry() {
                return this.expiry;
            }

            public final String getZipCode() {
                return this.zipCode;
            }

            public int hashCode() {
                return this.zipCode.hashCode() + C0023f.m105e(this.csc, C0023f.m105e(this.expiry, this.cardNumber.hashCode() * 31, 31), 31);
            }

            public String toString() {
                String str = this.cardNumber;
                String str2 = this.expiry;
                return C0073e.m210j(C0388a.m1050f("Loading(cardNumber=", str, ", expiry=", str2, ", csc="), this.csc, ", zipCode=", this.zipCode, ")");
            }
        }

        private AddCardLoadingState() {
        }

        public /* synthetic */ AddCardLoadingState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AddCardViewModel(Repository repository2, Context context2, Events events2, C16708i iVar, GetAddCardEnabledUseCase getAddCardEnabledUseCase, StartAddCardThreeDsUseCase startAddCardThreeDsUseCase, AddCardUseCase addCardUseCase2, PYPLCheckoutUtils pYPLCheckoutUtils, DebugConfigManager debugConfigManager2) {
        C19383o.m32797g(repository2, "repository");
        C19383o.m32797g(context2, ResponseConstants.CONTEXT);
        C19383o.m32797g(events2, "events");
        C19383o.m32797g(iVar, "gson");
        C19383o.m32797g(getAddCardEnabledUseCase, "addCardEnabledUseCase");
        C19383o.m32797g(startAddCardThreeDsUseCase, "startAddCardThreeDs");
        C19383o.m32797g(addCardUseCase2, "addCardUseCase");
        C19383o.m32797g(pYPLCheckoutUtils, "pyplCheckoutUtils");
        C19383o.m32797g(debugConfigManager2, "debugConfigManager");
        this.repository = repository2;
        this.context = context2;
        this.events = events2;
        this.gson = iVar;
        this.addCardEnabledUseCase = getAddCardEnabledUseCase;
        this.startAddCardThreeDs = startAddCardThreeDsUseCase;
        this.addCardUseCase = addCardUseCase2;
        this.pyplCheckoutUtils = pYPLCheckoutUtils;
        this.debugConfigManager = debugConfigManager2;
        C2895z<AddCardLoadingState> zVar = new C2895z<>();
        this._addCardLoadingState = zVar;
        this.addCardLoadingState = zVar;
        this._addCardAlertUiModel = new C2895z<>();
    }

    /* access modifiers changed from: private */
    public final void clearLoadingState() {
        AddCardLoadingState value = this._addCardLoadingState.getValue();
        if (value instanceof AddCardLoadingState.Loading) {
            AddCardLoadingState.Loading loading = (AddCardLoadingState.Loading) value;
            this._addCardLoadingState.postValue(new AddCardLoadingState.Idle(loading.getCardNumber(), loading.getExpiry(), loading.getCsc(), loading.getZipCode()));
        }
    }

    /* access modifiers changed from: private */
    public final void fallbackToWeb(String str, ErrorReason errorReason) {
        PYPLCheckoutUtils.fallBack$default(this.pyplCheckoutUtils, "AddCardViewModel", PEnums.FallbackReason.INELIGIBLE_TRAFFIC, PEnums.FallbackCategory.USER_ACTION_NOT_SUPPORTED_NATIVE, str, (PEnums.TransitionName) null, errorReason, (Exception) null, 80, (Object) null);
    }

    public static /* synthetic */ void fallbackToWeb$default(AddCardViewModel addCardViewModel, String str, ErrorReason errorReason, int i, Object obj) {
        if ((i & 2) != 0) {
            errorReason = ErrorReason.FEATURE_NOT_SUPPORTED_ERROR;
        }
        addCardViewModel.fallbackToWeb(str, errorReason);
    }

    private final String getLastFourDigits(String str) {
        if (str == null) {
            return null;
        }
        int i = 4;
        int length = str.length();
        if (4 > length) {
            i = length;
        }
        String substring = str.substring(length - i);
        C19383o.m32796f(substring, "this as java.lang.String).substring(startIndex)");
        return substring;
    }

    /* access modifiers changed from: private */
    public final void handleAddCardErrors(Throwable th, Activity activity) {
        if (!(th instanceof AddCardContingencyException)) {
            clearLoadingState();
            this.events.fire(PayPalEventTypes.CTA_LOADING_SPINNER, new Success(Boolean.FALSE));
            showAddCardGenericError();
        } else if (isNativeThreeDsEnabled()) {
            launch3DS(activity, ((AddCardContingencyException) th).getFundingInstrumentId());
        } else {
            this._addCardLoadingState.postValue(AddCardLoadingState.Empty.INSTANCE);
            fallbackToWeb("3DS add card - native 3DS not supported", ErrorReason.FEATURE_NOT_SUPPORTED_ERROR);
        }
    }

    /* access modifiers changed from: private */
    public final void handleNameError() {
        User user = this.repository.getUser();
        String str = null;
        String firstName = user == null ? null : user.getFirstName();
        boolean z = false;
        if (firstName == null || firstName.length() == 0) {
            PLog pLog = PLog.INSTANCE;
            PLog.error$default(PEnums.ErrorType.INFO, PEnums.EventCode.E618, "Add card first name is null", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_ADD_CARD, PEnums.StateName.NATIVE_ADD_CARD, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1944, (Object) null);
        }
        User user2 = this.repository.getUser();
        if (user2 != null) {
            str = user2.getLastName();
        }
        if (str == null || str.length() == 0) {
            z = true;
        }
        if (z) {
            PLog pLog2 = PLog.INSTANCE;
            PLog.error$default(PEnums.ErrorType.INFO, PEnums.EventCode.E618, "Add card last name is null", (String) null, (Throwable) null, PEnums.TransitionName.NATIVE_ADD_CARD, PEnums.StateName.NATIVE_ADD_CARD, (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1944, (Object) null);
        }
    }

    private final boolean isNativeThreeDsEnabled() {
        if (this.debugConfigManager.isSmartPaymentCheckout()) {
            return FeatureFlagManager.isEnabled$default(Feature.ADD_CARD_3DS, false, 2, (Object) null).isEnabled();
        }
        if (FeatureFlagManager.isEnabled$default(Feature.ADD_CARD_3DS, false, 2, (Object) null).isEnabled()) {
            return AppBuildConfig.isThreeDsVariant();
        }
        return false;
    }

    private final C19699g1 launch3DS(Activity activity, String str) {
        return C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new AddCardViewModel$launch3DS$1(str, this, activity, (C19340c<? super AddCardViewModel$launch3DS$1>) null), 3);
    }

    /* access modifiers changed from: private */
    public final void refreshCarousel() {
        this.events.fire(PayPalEventTypes.REFRESH_CAROUSEL, (ResultData) null);
        this.events.fire(PayPalEventTypes.CTA_LOADING_SPINNER, new Success(Boolean.FALSE));
    }

    private final void showAddCardGenericError() {
        String string = this.context.getResources().getString(C17165R.string.paypal_checkout_add_card_error);
        C19383o.m32796f(string, "context.resources.getStr…_checkout_add_card_error)");
        showAddCardError(new AddCardAlertUiModel.Error.Generic((String) null, string, C17165R.color.add_card_red, C17165R.color.add_card_red_bg, 1, (DefaultConstructorMarker) null));
    }

    /* access modifiers changed from: private */
    public final void showEmptyState() {
        this._addCardLoadingState.postValue(AddCardLoadingState.Empty.INSTANCE);
    }

    public final void addCard(String str, String str2, String str3, String str4, AppCompatActivity appCompatActivity) {
        C19383o.m32797g(str, "cardNumber");
        C19383o.m32797g(str2, "expiry");
        C19383o.m32797g(str3, "csc");
        C19383o.m32797g(str4, "zipCode");
        C19383o.m32797g(appCompatActivity, "activity");
        this._addCardLoadingState.postValue(new AddCardLoadingState.Loading(str, str2, str3, str4));
        C19697g.m33468f(C19388s.m32866i0(this), (CoroutineContext) null, (CoroutineStart) null, new AddCardViewModel$addCard$1(this, str2, appCompatActivity, str, str3, str4, (C19340c<? super AddCardViewModel$addCard$1>) null), 3);
    }

    public final LiveData<AddCardAlertUiModel> getAddCardAlertUiModel() {
        return this._addCardAlertUiModel;
    }

    public final LiveData<AddCardLoadingState> getAddCardLoadingState() {
        return this.addCardLoadingState;
    }

    public final LiveData<String> getCardNumber() {
        return this._cardNumber;
    }

    public final C19846a<C19394m> getNativeAddCardListener() {
        return this.nativeAddCardListener;
    }

    public final LiveData<PaymentProcessors> getPaymentProcessor() {
        return this._paymentProcessor;
    }

    public final List<CardIssuerType> getSupportedFundingSources() {
        List<SupportedFundingSources> supportedFundingSources = this.repository.getSupportedFundingSources();
        if (supportedFundingSources == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C19322o.m32624F0(supportedFundingSources));
        for (SupportedFundingSources brand : supportedFundingSources) {
            arrayList.add(brand.getBrand());
        }
        return arrayList;
    }

    public final void handleAddCardSuccess(FundingInstrument fundingInstrument) {
        C19383o.m32797g(fundingInstrument, "newFI");
        PLog.decision$default(PEnums.TransitionName.NATIVE_ADD_CARD_RESPONSE, PEnums.Outcome.SUCCESS, (PEnums.EventCode) null, PEnums.StateName.NATIVE_ADD_CARD, (String) null, (String) null, this.gson.mo59463j(new AddCardAnalytics(fundingInstrument.getId(), fundingInstrument.getName(), fundingInstrument.getType())), (String) null, (String) null, (String) null, (InstrumentationEvent.InstrumentationEventBuilder) null, 1972, (Object) null);
        this.events.fire(PayPalEventTypes.REFRESH_CAROUSEL, (ResultData) null);
        this.events.fire(PayPalEventTypes.CTA_LOADING_SPINNER, new Success(Boolean.FALSE));
        C19846a<C19394m> aVar = this.nativeAddCardListener;
        if (aVar != null) {
            aVar.invoke();
        }
        String string = this.context.getString(C17165R.string.paypal_checkout_add_card_success_linked);
        C19383o.m32796f(string, "context.getString(R.stri…_add_card_success_linked)");
        Object[] objArr = new Object[2];
        Object label = fundingInstrument.getLabel();
        if (label == null) {
            label = getPaymentProcessor().getValue();
        }
        objArr[0] = label;
        String lastDigits = fundingInstrument.getLastDigits();
        if (lastDigits == null) {
            lastDigits = getLastFourDigits(getCardNumber().getValue());
        }
        objArr[1] = lastDigits;
        showAddCardSuccess(new AddCardAlertUiModel.Success((String) null, C0388a.m1049e(objArr, 2, string, "format(format, *args)"), C17165R.color.add_card_green, C17165R.color.add_card_green_bg, 1, (DefaultConstructorMarker) null));
    }

    public final void handleThreeDSAddCardSuccess() {
        String str;
        FundingOption selectedFundingOption = this.repository.getSelectedFundingOption();
        String str2 = null;
        FundingInstrument fundingInstrument = selectedFundingOption == null ? null : selectedFundingOption.getFundingInstrument();
        String label = fundingInstrument == null ? null : fundingInstrument.getLabel();
        if (fundingInstrument != null) {
            str2 = fundingInstrument.getLastDigits();
        }
        if (!(str2 == null || str2.length() == 0)) {
            if (!(label == null || label.length() == 0)) {
                String string = this.context.getString(C17165R.string.paypal_checkout_add_card_success_linked);
                C19383o.m32796f(string, "context.getString(R.stri…_add_card_success_linked)");
                str = C0388a.m1049e(new Object[]{label, str2}, 2, string, "format(format, *args)");
                showAddCardSuccess(new AddCardAlertUiModel.Success((String) null, str, C17165R.color.add_card_green, C17165R.color.add_card_green_bg, 1, (DefaultConstructorMarker) null));
            }
        }
        str = this.context.getString(C17165R.string.paypal_checkout_add_card_success);
        C19383o.m32796f(str, "{\n            context.ge…d_card_success)\n        }");
        showAddCardSuccess(new AddCardAlertUiModel.Success((String) null, str, C17165R.color.add_card_green, C17165R.color.add_card_green_bg, 1, (DefaultConstructorMarker) null));
    }

    public final boolean isNativeAddCardEnabled() {
        return this.addCardEnabledUseCase.invoke();
    }

    public final void setNativeAddCardListener(C19846a<C19394m> aVar) {
        this.nativeAddCardListener = aVar;
    }

    public final void setPaymentProcessorFromCardNumber(String str, PaymentProcessors paymentProcessors) {
        C19383o.m32797g(str, "cardNumber");
        C19383o.m32797g(paymentProcessors, "processors");
        this._cardNumber.setValue(str);
        this._paymentProcessor.setValue(paymentProcessors);
    }

    public final void showAddCardError(AddCardAlertUiModel.Error error) {
        C19383o.m32797g(error, "addCardAlertUiModel");
        this._addCardAlertUiModel.postValue(error);
    }

    public final void showAddCardSuccess(AddCardAlertUiModel.Success success) {
        C19383o.m32797g(success, "addCardAlertUiModel");
        this._addCardAlertUiModel.postValue(success);
    }
}
