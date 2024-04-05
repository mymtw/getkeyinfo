package com.google.android.datatransport.cct.internal;

import com.google.android.datatransport.cct.internal.AutoValue_AndroidClientInfo;
import com.google.auto.value.AutoValue;

@AutoValue
/* renamed from: com.google.android.datatransport.cct.internal.a */
public abstract class C6503a {

    @AutoValue.Builder
    /* renamed from: com.google.android.datatransport.cct.internal.a$a */
    public static abstract class C6504a {
        public abstract C6503a build();

        public abstract C6504a setApplicationBuild(String str);

        public abstract C6504a setCountry(String str);

        public abstract C6504a setDevice(String str);

        public abstract C6504a setFingerprint(String str);

        public abstract C6504a setHardware(String str);

        public abstract C6504a setLocale(String str);

        public abstract C6504a setManufacturer(String str);

        public abstract C6504a setMccMnc(String str);

        public abstract C6504a setModel(String str);

        public abstract C6504a setOsBuild(String str);

        public abstract C6504a setProduct(String str);

        public abstract C6504a setSdkVersion(Integer num);
    }

    public static C6504a builder() {
        return new AutoValue_AndroidClientInfo.Builder();
    }

    public abstract String getApplicationBuild();

    public abstract String getCountry();

    public abstract String getDevice();

    public abstract String getFingerprint();

    public abstract String getHardware();

    public abstract String getLocale();

    public abstract String getManufacturer();

    public abstract String getMccMnc();

    public abstract String getModel();

    public abstract String getOsBuild();

    public abstract String getProduct();

    public abstract Integer getSdkVersion();
}
