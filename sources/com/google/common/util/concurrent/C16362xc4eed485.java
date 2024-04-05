package com.google.common.util.concurrent;

import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

@IgnoreJRERequirement
/* renamed from: com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$ClassValueValidator */
enum C16362xc4eed485 {
    INSTANCE;
    
    private static final ClassValue<Boolean> isValidClass = null;

    /* renamed from: com.google.common.util.concurrent.FuturesGetChecked$GetCheckedTypeValidatorHolder$ClassValueValidator$a */
    public static class C16363a extends ClassValue<Boolean> {
    }

    /* access modifiers changed from: public */
    static {
        isValidClass = new C16363a();
    }

    public void validateClass(Class<? extends Exception> cls) {
        isValidClass.get(cls);
    }
}
