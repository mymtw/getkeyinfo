package com.paypal.pyplcheckout.addcard;

import android.content.Context;
import com.google.gson.C16708i;
import com.paypal.pyplcheckout.addcard.usecase.AddCardUseCase;
import com.paypal.pyplcheckout.addcard.usecase.GetAddCardEnabledUseCase;
import com.paypal.pyplcheckout.events.Events;
import com.paypal.pyplcheckout.model.DebugConfigManager;
import com.paypal.pyplcheckout.services.Repository;
import com.paypal.pyplcheckout.threeds.usecase.StartAddCardThreeDsUseCase;
import com.paypal.pyplcheckout.utils.PYPLCheckoutUtils;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class AddCardViewModel_Factory implements C17555d<AddCardViewModel> {
    private final C19011a<GetAddCardEnabledUseCase> addCardEnabledUseCaseProvider;
    private final C19011a<AddCardUseCase> addCardUseCaseProvider;
    private final C19011a<Context> contextProvider;
    private final C19011a<DebugConfigManager> debugConfigManagerProvider;
    private final C19011a<Events> eventsProvider;
    private final C19011a<C16708i> gsonProvider;
    private final C19011a<PYPLCheckoutUtils> pyplCheckoutUtilsProvider;
    private final C19011a<Repository> repositoryProvider;
    private final C19011a<StartAddCardThreeDsUseCase> startAddCardThreeDsProvider;

    public AddCardViewModel_Factory(C19011a<Repository> aVar, C19011a<Context> aVar2, C19011a<Events> aVar3, C19011a<C16708i> aVar4, C19011a<GetAddCardEnabledUseCase> aVar5, C19011a<StartAddCardThreeDsUseCase> aVar6, C19011a<AddCardUseCase> aVar7, C19011a<PYPLCheckoutUtils> aVar8, C19011a<DebugConfigManager> aVar9) {
        this.repositoryProvider = aVar;
        this.contextProvider = aVar2;
        this.eventsProvider = aVar3;
        this.gsonProvider = aVar4;
        this.addCardEnabledUseCaseProvider = aVar5;
        this.startAddCardThreeDsProvider = aVar6;
        this.addCardUseCaseProvider = aVar7;
        this.pyplCheckoutUtilsProvider = aVar8;
        this.debugConfigManagerProvider = aVar9;
    }

    public static AddCardViewModel_Factory create(C19011a<Repository> aVar, C19011a<Context> aVar2, C19011a<Events> aVar3, C19011a<C16708i> aVar4, C19011a<GetAddCardEnabledUseCase> aVar5, C19011a<StartAddCardThreeDsUseCase> aVar6, C19011a<AddCardUseCase> aVar7, C19011a<PYPLCheckoutUtils> aVar8, C19011a<DebugConfigManager> aVar9) {
        return new AddCardViewModel_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static AddCardViewModel newInstance(Repository repository, Context context, Events events, C16708i iVar, GetAddCardEnabledUseCase getAddCardEnabledUseCase, StartAddCardThreeDsUseCase startAddCardThreeDsUseCase, AddCardUseCase addCardUseCase, PYPLCheckoutUtils pYPLCheckoutUtils, DebugConfigManager debugConfigManager) {
        return new AddCardViewModel(repository, context, events, iVar, getAddCardEnabledUseCase, startAddCardThreeDsUseCase, addCardUseCase, pYPLCheckoutUtils, debugConfigManager);
    }

    public AddCardViewModel get() {
        return newInstance(this.repositoryProvider.get(), this.contextProvider.get(), this.eventsProvider.get(), this.gsonProvider.get(), this.addCardEnabledUseCaseProvider.get(), this.startAddCardThreeDsProvider.get(), this.addCardUseCaseProvider.get(), this.pyplCheckoutUtilsProvider.get(), this.debugConfigManagerProvider.get());
    }
}
