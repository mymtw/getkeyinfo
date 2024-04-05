package com.braze.push;

import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class NotificationTrampolineActivity$onResume$2 extends Lambda implements C19846a<String> {
    public static final NotificationTrampolineActivity$onResume$2 INSTANCE = new NotificationTrampolineActivity$onResume$2();

    public NotificationTrampolineActivity$onResume$2() {
        super(0);
    }

    public final String invoke() {
        return "Notification trampoline activity received intent with null action. Doing nothing.";
    }
}
