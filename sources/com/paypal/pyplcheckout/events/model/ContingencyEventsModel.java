package com.paypal.pyplcheckout.events.model;

import com.paypal.pyplcheckout.threeds.ThreeDSSource;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ContingencyEventsModel {
    private final ContingencyProcessingStatus contingencyProcessingStatus;
    private final ContingencyType contingencyType;
    private final Exception exception;
    private final ThreeDSSource source;
    private final String status;

    public ContingencyEventsModel(ContingencyType contingencyType2, ContingencyProcessingStatus contingencyProcessingStatus2, Exception exc, String str, ThreeDSSource threeDSSource) {
        C19383o.m32797g(contingencyType2, "contingencyType");
        C19383o.m32797g(contingencyProcessingStatus2, "contingencyProcessingStatus");
        C19383o.m32797g(threeDSSource, "source");
        this.contingencyType = contingencyType2;
        this.contingencyProcessingStatus = contingencyProcessingStatus2;
        this.exception = exc;
        this.status = str;
        this.source = threeDSSource;
    }

    public final ContingencyProcessingStatus getContingencyProcessingStatus() {
        return this.contingencyProcessingStatus;
    }

    public final ContingencyType getContingencyType() {
        return this.contingencyType;
    }

    public final Exception getException() {
        return this.exception;
    }

    public final ThreeDSSource getSource() {
        return this.source;
    }

    public final String getStatus() {
        return this.status;
    }

    public final boolean isAddCardContingency() {
        return this.source == ThreeDSSource.ADD_CARD;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ContingencyEventsModel(ContingencyType contingencyType2, ContingencyProcessingStatus contingencyProcessingStatus2, Exception exc, String str, ThreeDSSource threeDSSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(contingencyType2, contingencyProcessingStatus2, (i & 4) != 0 ? null : exc, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? ThreeDSSource.NONE : threeDSSource);
    }
}
