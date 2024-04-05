package com.paypal.pyplcheckout.crypto;

import com.paypal.pyplcheckout.p539ab.AbManager;
import dagger.internal.C17555d;
import p740eq.C19011a;

public final class NativePayWithCryptoCheck_Factory implements C17555d<NativePayWithCryptoCheck> {
    private final C19011a<AbManager> abManagerProvider;
    private final C19011a<Boolean> is1PProvider;

    public NativePayWithCryptoCheck_Factory(C19011a<AbManager> aVar, C19011a<Boolean> aVar2) {
        this.abManagerProvider = aVar;
        this.is1PProvider = aVar2;
    }

    public static NativePayWithCryptoCheck_Factory create(C19011a<AbManager> aVar, C19011a<Boolean> aVar2) {
        return new NativePayWithCryptoCheck_Factory(aVar, aVar2);
    }

    public static NativePayWithCryptoCheck newInstance(AbManager abManager, boolean z) {
        return new NativePayWithCryptoCheck(abManager, z);
    }

    public NativePayWithCryptoCheck get() {
        return newInstance(this.abManagerProvider.get(), this.is1PProvider.get().booleanValue());
    }
}
