package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class BrazePushReceiver$Companion$handleAdmRegistrationIntent$4 extends Lambda implements C19846a<String> {
    public static final BrazePushReceiver$Companion$handleAdmRegistrationIntent$4 INSTANCE = new BrazePushReceiver$Companion$handleAdmRegistrationIntent$4();

    public BrazePushReceiver$Companion$handleAdmRegistrationIntent$4() {
        super(0);
    }

    public final String invoke() {
        return "The ADM registration intent is missing error information, registration id, and unregistration confirmation. Ignoring.";
    }
}
