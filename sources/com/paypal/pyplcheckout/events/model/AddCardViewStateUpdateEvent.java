package com.paypal.pyplcheckout.events.model;

import com.paypal.pyplcheckout.home.view.customviews.CardUiModel;
import java.util.List;
import kotlin.jvm.internal.C19383o;

public final class AddCardViewStateUpdateEvent {
    private final CardUiModel.AddCardUiModel addCard;
    private final int addCardPosition;
    private final List<CardUiModel> listOfPaymentCards;

    public AddCardViewStateUpdateEvent(int i, List<? extends CardUiModel> list, CardUiModel.AddCardUiModel addCardUiModel) {
        C19383o.m32797g(list, "listOfPaymentCards");
        C19383o.m32797g(addCardUiModel, "addCard");
        this.addCardPosition = i;
        this.listOfPaymentCards = list;
        this.addCard = addCardUiModel;
    }

    public final CardUiModel.AddCardUiModel getAddCard() {
        return this.addCard;
    }

    public final int getAddCardPosition() {
        return this.addCardPosition;
    }

    public final List<CardUiModel> getListOfPaymentCards() {
        return this.listOfPaymentCards;
    }
}
