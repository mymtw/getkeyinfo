package com.paypal.pyplcheckout.home.view.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.pyplcheckout.C17165R;
import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import com.paypal.pyplcheckout.interfaces.HeartListener;
import com.paypal.pyplcheckout.interfaces.SelectedListener;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C19383o;

public final class CarouselAdapter extends RecyclerView.Adapter<CarouselAdapterViewHolder> {
    private final List<CardUiModel> data;
    private final HeartListener heartListener;
    private final SelectedListener selectedListener;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CarouselAdapterTypes.values().length];
            iArr[CarouselAdapterTypes.BNPL_OFFER.ordinal()] = 1;
            iArr[CarouselAdapterTypes.FUNDING_OPTION.ordinal()] = 2;
            iArr[CarouselAdapterTypes.WEB_ADD_CARD.ordinal()] = 3;
            iArr[CarouselAdapterTypes.NATIVE_ADD_CARD.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CarouselAdapter(List<? extends CardUiModel> list, HeartListener heartListener2, SelectedListener selectedListener2) {
        C19383o.m32797g(list, "data");
        C19383o.m32797g(heartListener2, "heartListener");
        C19383o.m32797g(selectedListener2, "selectedListener");
        this.data = list;
        this.heartListener = heartListener2;
        this.selectedListener = selectedListener2;
    }

    public int getItemCount() {
        return this.data.size();
    }

    public int getItemViewType(int i) {
        CardUiModel cardUiModel = this.data.get(i);
        if (cardUiModel instanceof CardUiModel.OfferCardUiModel) {
            return CarouselAdapterTypes.BNPL_OFFER.getValue();
        }
        if (cardUiModel instanceof CardUiModel.PaymentSourceUiModel) {
            return CarouselAdapterTypes.FUNDING_OPTION.getValue();
        }
        if (cardUiModel instanceof CardUiModel.AddCardUiModel.Web) {
            return CarouselAdapterTypes.WEB_ADD_CARD.getValue();
        }
        if (cardUiModel instanceof CardUiModel.AddCardUiModel.Native) {
            return CarouselAdapterTypes.NATIVE_ADD_CARD.getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public void onBindViewHolder(CarouselAdapterViewHolder carouselAdapterViewHolder, int i) {
        C19383o.m32797g(carouselAdapterViewHolder, "holder");
        if (carouselAdapterViewHolder instanceof OfferViewHolder) {
            ((OfferViewHolder) carouselAdapterViewHolder).bind((CardUiModel.OfferCardUiModel) this.data.get(i));
        } else if (carouselAdapterViewHolder instanceof FundingOptionViewHolder) {
            ((FundingOptionViewHolder) carouselAdapterViewHolder).bind((CardUiModel.PaymentSourceUiModel) this.data.get(i), this.data.size() == 2, new CarouselAdapter$onBindViewHolder$1(this));
        } else if (carouselAdapterViewHolder instanceof WebAddCardViewHolder) {
            ((WebAddCardViewHolder) carouselAdapterViewHolder).bind((CardUiModel.AddCardUiModel.Web) this.data.get(i));
        } else if (carouselAdapterViewHolder instanceof NativeAddCardViewHolder) {
            ((NativeAddCardViewHolder) carouselAdapterViewHolder).bind((CardUiModel.AddCardUiModel.Native) this.data.get(i));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public CarouselAdapterViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        int i2 = WhenMappings.$EnumSwitchMapping$0[CarouselAdapterTypesKt.toCarouselAdapterType(i).ordinal()];
        if (i2 == 1) {
            View inflate = from.inflate(C17165R.C17169layout.payment_source_offer_bnpl, viewGroup, false);
            C19383o.m32796f(inflate, "inflater.inflate(R.layou…ffer_bnpl, parent, false)");
            return new OfferViewHolder(inflate, this.selectedListener);
        } else if (i2 == 2) {
            View inflate2 = from.inflate(C17165R.C17169layout.payments_source_card_view, viewGroup, false);
            C19383o.m32796f(inflate2, "inflater.inflate(R.layou…card_view, parent, false)");
            return new FundingOptionViewHolder(inflate2, this.selectedListener, this.heartListener);
        } else if (i2 == 3) {
            View inflate3 = from.inflate(C17165R.C17169layout.payment_source_add_card, viewGroup, false);
            C19383o.m32796f(inflate3, "inflater.inflate(R.layou…_add_card, parent, false)");
            return new WebAddCardViewHolder(inflate3, this.selectedListener);
        } else if (i2 == 4) {
            View inflate4 = from.inflate(C17165R.C17169layout.payment_source_native_add_card, viewGroup, false);
            C19383o.m32796f(inflate4, "inflater.inflate(R.layou…_add_card, parent, false)");
            return new NativeAddCardViewHolder(inflate4, this.selectedListener);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
