package com.paypal.checkout.merchanttoken;

import com.paypal.pyplcheckout.services.Repository;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class GetLsatTokenAction_Factory implements C17555d<GetLsatTokenAction> {
    private final C19011a<CreateLsatTokenAction> createLsatTokenActionProvider;
    private final C19011a<Repository> repositoryProvider;

    public GetLsatTokenAction_Factory(C19011a<Repository> aVar, C19011a<CreateLsatTokenAction> aVar2) {
        this.repositoryProvider = aVar;
        this.createLsatTokenActionProvider = aVar2;
    }

    public static GetLsatTokenAction_Factory create(C19011a<Repository> aVar, C19011a<CreateLsatTokenAction> aVar2) {
        return new GetLsatTokenAction_Factory(aVar, aVar2);
    }

    public static GetLsatTokenAction newInstance(Repository repository, CreateLsatTokenAction createLsatTokenAction) {
        return new GetLsatTokenAction(repository, createLsatTokenAction);
    }

    public GetLsatTokenAction get() {
        return newInstance(this.repositoryProvider.get(), this.createLsatTokenActionProvider.get());
    }
}
