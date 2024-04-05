package com.etsy.android.lib.install;

import com.etsy.android.lib.util.C8883c0;
import kotlin.jvm.internal.C19383o;
import kotlin.jvm.internal.Lambda;
import p753kq.C19846a;

public final class InstallPersistence$getInstallationUUID$1 extends Lambda implements C19846a<String> {
    public static final InstallPersistence$getInstallationUUID$1 INSTANCE = new InstallPersistence$getInstallationUUID$1();

    public InstallPersistence$getInstallationUUID$1() {
        super(0);
    }

    public final String invoke() {
        String a = C8883c0.m17315a();
        C19383o.m32796f(a, "generateRandomUUID()");
        return a;
    }
}
