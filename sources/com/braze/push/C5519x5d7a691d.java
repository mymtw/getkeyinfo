package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

/* renamed from: com.braze.push.BrazePushReceiver$Companion$handleAdmRegistrationEventIfEnabled$3 */
public final class C5519x5d7a691d extends Lambda implements C19846a<String> {
    public static final C5519x5d7a691d INSTANCE = new C5519x5d7a691d();

    public C5519x5d7a691d() {
        super(0);
    }

    public final String invoke() {
        return "ADM not enabled in braze.xml. Ignoring ADM registration intent. Note: you must set com_braze_push_adm_messaging_registration_enabled to true in your braze.xml to enable ADM.";
    }
}
