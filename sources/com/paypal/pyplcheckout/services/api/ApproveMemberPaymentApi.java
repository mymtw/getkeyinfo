package com.paypal.pyplcheckout.services.api;

import com.paypal.android.platform.authsdk.authcommon.utils.UriChallengeConstantKt;
import com.paypal.pyplcheckout.billingagreements.model.BillingAgreementBalancePreference;
import com.paypal.pyplcheckout.billingagreements.usecase.BillingAgreementsGetBalancePrefUseCase;
import com.paypal.pyplcheckout.constants.UrlConstantsKt;
import com.paypal.pyplcheckout.p543di.SdkComponent;
import com.paypal.pyplcheckout.pojo.BillingAddressRequest;
import com.paypal.pyplcheckout.pojo.CryptoCurrencyHoldingDetails;
import com.paypal.pyplcheckout.pojo.CryptoCurrencyQuote;
import com.paypal.pyplcheckout.pojo.FundingInstrument;
import com.paypal.pyplcheckout.pojo.FundingOption;
import com.paypal.pyplcheckout.services.CryptoRepository;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.services.mutations.AddBillingAddressAndApprovePaymentMutation;
import com.paypal.pyplcheckout.services.mutations.ApproveMemberPaymentMutation;
import com.paypal.pyplcheckout.utils.PaymentTypes;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.C20011u;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ApproveMemberPaymentApi extends BaseApi {
    private final String accessToken;
    private final BillingAgreementsGetBalancePrefUseCase getBalancePreference;
    private final C20011u.C20012a requestBuilder;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ApproveMemberPaymentApi(String str, C20011u.C20012a aVar, BillingAgreementsGetBalancePrefUseCase billingAgreementsGetBalancePrefUseCase, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? new C20011u.C20012a() : aVar, (i & 4) != 0 ? SdkComponent.Companion.getInstance().getBillingAgreementsGetBalancePrefUseCase() : billingAgreementsGetBalancePrefUseCase);
    }

    public C20011u createService() {
        FundingInstrument fundingInstrument;
        CryptoCurrencyQuote cryptoCurrencyQuote;
        T t;
        FundingInstrument fundingInstrument2;
        CryptoCurrencyHoldingDetails cryptocurrencyHoldingDetails;
        SdkComponent.Companion companion = SdkComponent.Companion;
        Repository repository = companion.getInstance().getRepository();
        CryptoRepository cryptoRepo = companion.getInstance().getCryptoRepo();
        boolean isPrimaryFundingOptionIdExist = repository.isPrimaryFundingOptionIdExist();
        boolean isSecondaryFundingOptionIdsExist = repository.isSecondaryFundingOptionIdsExist();
        BillingAddressRequest billingAddress = repository.getBillingAddress();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        BillingAgreementBalancePreference value = this.getBalancePreference.invoke().getValue();
        FundingOption selectedFundingOption = repository.getSelectedFundingOption();
        jSONObject.put(UrlConstantsKt.URL_PARAM_CHECKOUT_TOKEN, repository.getPaymentToken());
        String str = null;
        jSONObject.put("primaryFundingOptionId", selectedFundingOption == null ? null : selectedFundingOption.getId());
        Boolean isStickyBillingAllowed = repository.isStickyBillingAllowed();
        jSONObject.put("setStickyFiRequired", isStickyBillingAllowed == null ? false : isStickyBillingAllowed.booleanValue());
        jSONObject.put("secondaryFundingOptionIds", new JSONArray(repository.getSecondaryFundingOptionIds()));
        String selectedAddressId = repository.getSelectedAddressId();
        if (selectedAddressId == null) {
            selectedAddressId = "";
        }
        jSONObject.put("selectedAddressId", selectedAddressId);
        jSONObject.put("preferredFundingOptionId", repository.getPreferredFundingOptionId());
        if (C19383o.m32792b(repository.getSelectedFundingOptionType(), PaymentTypes.CRYPTOCURRENCY.toString())) {
            String symbol = (selectedFundingOption == null || (fundingInstrument2 = selectedFundingOption.getFundingInstrument()) == null || (cryptocurrencyHoldingDetails = fundingInstrument2.getCryptocurrencyHoldingDetails()) == null) ? null : cryptocurrencyHoldingDetails.getSymbol();
            List<CryptoCurrencyQuote> cryptoQuotes = cryptoRepo.getCryptoQuotes();
            if (cryptoQuotes == null) {
                cryptoCurrencyQuote = null;
            } else {
                Iterator<T> it = cryptoQuotes.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (C19383o.m32792b(((CryptoCurrencyQuote) t).getSymbol(), symbol)) {
                        break;
                    }
                }
                cryptoCurrencyQuote = (CryptoCurrencyQuote) t;
            }
            jSONObject.put("cryptocurrencyQuoteId", cryptoCurrencyQuote == null ? null : cryptoCurrencyQuote.getId());
        }
        if (value != BillingAgreementBalancePreference.NONE) {
            jSONObject.put("balancePreference", value.toString());
        }
        if (billingAddress != null) {
            FundingOption selectedFundingOption2 = repository.getSelectedFundingOption();
            if (!(selectedFundingOption2 == null || (fundingInstrument = selectedFundingOption2.getFundingInstrument()) == null)) {
                str = fundingInstrument.getId();
            }
            jSONObject.put("instrumentId", str);
            jSONObject.put("line1", billingAddress.getLine1());
            jSONObject.put("line2", billingAddress.getLine2());
            jSONObject.put("city", billingAddress.getCity());
            jSONObject.put("state", billingAddress.getState());
            jSONObject.put("postalCode", billingAddress.getPostalCode());
            jSONObject.put("countryCode", billingAddress.getCountryCode());
            jSONObject2.put("query", AddBillingAddressAndApprovePaymentMutation.INSTANCE.get(isPrimaryFundingOptionIdExist, isSecondaryFundingOptionIdsExist, value));
        } else {
            jSONObject2.put("query", ApproveMemberPaymentMutation.INSTANCE.get(isPrimaryFundingOptionIdExist, isSecondaryFundingOptionIdsExist, value));
        }
        jSONObject2.put("variables", jSONObject);
        C20011u.C20012a aVar = this.requestBuilder;
        BaseApiKt.setGraphQlUrl(aVar);
        BaseApiKt.addBaseHeadersWithAuthToken(aVar, this.accessToken);
        String jSONObject3 = jSONObject2.toString();
        C19383o.m32796f(jSONObject3, "data.toString()");
        BaseApiKt.addPostBody(aVar, jSONObject3);
        return aVar.mo72999b();
    }

    public ApproveMemberPaymentApi(String str, C20011u.C20012a aVar, BillingAgreementsGetBalancePrefUseCase billingAgreementsGetBalancePrefUseCase) {
        C19383o.m32797g(str, UriChallengeConstantKt.ACCESS_TOKEN);
        C19383o.m32797g(aVar, "requestBuilder");
        C19383o.m32797g(billingAgreementsGetBalancePrefUseCase, "getBalancePreference");
        this.accessToken = str;
        this.requestBuilder = aVar;
        this.getBalancePreference = billingAgreementsGetBalancePrefUseCase;
    }
}
