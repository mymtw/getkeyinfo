package com.paypal.checkout;

import com.etsy.android.lib.models.ResponseConstants;
import com.paypal.checkout.internal.build.BuildValidationStatus;
import kotlin.jvm.internal.C19383o;

public final class SnapshotExpiredException extends UnsupportedOperationException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotExpiredException(BuildValidationStatus.Invalid.Expired expired) {
        super(expired.getReason());
        C19383o.m32797g(expired, ResponseConstants.STATUS);
    }
}
