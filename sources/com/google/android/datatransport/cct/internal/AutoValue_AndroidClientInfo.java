package com.google.android.datatransport.cct.internal;

import android.support.p013v4.media.C0072d;
import com.google.android.datatransport.cct.internal.C6503a;
import p003a2.C0023f;

final class AutoValue_AndroidClientInfo extends C6503a {
    private final String applicationBuild;
    private final String country;
    private final String device;
    private final String fingerprint;
    private final String hardware;
    private final String locale;
    private final String manufacturer;
    private final String mccMnc;
    private final String model;
    private final String osBuild;
    private final String product;
    private final Integer sdkVersion;

    public static final class Builder extends C6503a.C6504a {
        private String applicationBuild;
        private String country;
        private String device;
        private String fingerprint;
        private String hardware;
        private String locale;
        private String manufacturer;
        private String mccMnc;
        private String model;
        private String osBuild;
        private String product;
        private Integer sdkVersion;

        public C6503a build() {
            return new AutoValue_AndroidClientInfo(this.sdkVersion, this.model, this.hardware, this.device, this.product, this.osBuild, this.manufacturer, this.fingerprint, this.locale, this.country, this.mccMnc, this.applicationBuild);
        }

        public C6503a.C6504a setApplicationBuild(String str) {
            this.applicationBuild = str;
            return this;
        }

        public C6503a.C6504a setCountry(String str) {
            this.country = str;
            return this;
        }

        public C6503a.C6504a setDevice(String str) {
            this.device = str;
            return this;
        }

        public C6503a.C6504a setFingerprint(String str) {
            this.fingerprint = str;
            return this;
        }

        public C6503a.C6504a setHardware(String str) {
            this.hardware = str;
            return this;
        }

        public C6503a.C6504a setLocale(String str) {
            this.locale = str;
            return this;
        }

        public C6503a.C6504a setManufacturer(String str) {
            this.manufacturer = str;
            return this;
        }

        public C6503a.C6504a setMccMnc(String str) {
            this.mccMnc = str;
            return this;
        }

        public C6503a.C6504a setModel(String str) {
            this.model = str;
            return this;
        }

        public C6503a.C6504a setOsBuild(String str) {
            this.osBuild = str;
            return this;
        }

        public C6503a.C6504a setProduct(String str) {
            this.product = str;
            return this;
        }

        public C6503a.C6504a setSdkVersion(Integer num) {
            this.sdkVersion = num;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6503a)) {
            return false;
        }
        C6503a aVar = (C6503a) obj;
        Integer num = this.sdkVersion;
        if (num != null ? num.equals(aVar.getSdkVersion()) : aVar.getSdkVersion() == null) {
            String str = this.model;
            if (str != null ? str.equals(aVar.getModel()) : aVar.getModel() == null) {
                String str2 = this.hardware;
                if (str2 != null ? str2.equals(aVar.getHardware()) : aVar.getHardware() == null) {
                    String str3 = this.device;
                    if (str3 != null ? str3.equals(aVar.getDevice()) : aVar.getDevice() == null) {
                        String str4 = this.product;
                        if (str4 != null ? str4.equals(aVar.getProduct()) : aVar.getProduct() == null) {
                            String str5 = this.osBuild;
                            if (str5 != null ? str5.equals(aVar.getOsBuild()) : aVar.getOsBuild() == null) {
                                String str6 = this.manufacturer;
                                if (str6 != null ? str6.equals(aVar.getManufacturer()) : aVar.getManufacturer() == null) {
                                    String str7 = this.fingerprint;
                                    if (str7 != null ? str7.equals(aVar.getFingerprint()) : aVar.getFingerprint() == null) {
                                        String str8 = this.locale;
                                        if (str8 != null ? str8.equals(aVar.getLocale()) : aVar.getLocale() == null) {
                                            String str9 = this.country;
                                            if (str9 != null ? str9.equals(aVar.getCountry()) : aVar.getCountry() == null) {
                                                String str10 = this.mccMnc;
                                                if (str10 != null ? str10.equals(aVar.getMccMnc()) : aVar.getMccMnc() == null) {
                                                    String str11 = this.applicationBuild;
                                                    if (str11 == null) {
                                                        if (aVar.getApplicationBuild() == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(aVar.getApplicationBuild())) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public String getApplicationBuild() {
        return this.applicationBuild;
    }

    public String getCountry() {
        return this.country;
    }

    public String getDevice() {
        return this.device;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getHardware() {
        return this.hardware;
    }

    public String getLocale() {
        return this.locale;
    }

    public String getManufacturer() {
        return this.manufacturer;
    }

    public String getMccMnc() {
        return this.mccMnc;
    }

    public String getModel() {
        return this.model;
    }

    public String getOsBuild() {
        return this.osBuild;
    }

    public String getProduct() {
        return this.product;
    }

    public Integer getSdkVersion() {
        return this.sdkVersion;
    }

    public int hashCode() {
        Integer num = this.sdkVersion;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.model;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.hardware;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.device;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.product;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.osBuild;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.manufacturer;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.fingerprint;
        int hashCode8 = (hashCode7 ^ (str7 == null ? 0 : str7.hashCode())) * 1000003;
        String str8 = this.locale;
        int hashCode9 = (hashCode8 ^ (str8 == null ? 0 : str8.hashCode())) * 1000003;
        String str9 = this.country;
        int hashCode10 = (hashCode9 ^ (str9 == null ? 0 : str9.hashCode())) * 1000003;
        String str10 = this.mccMnc;
        int hashCode11 = (hashCode10 ^ (str10 == null ? 0 : str10.hashCode())) * 1000003;
        String str11 = this.applicationBuild;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return hashCode11 ^ i;
    }

    public String toString() {
        StringBuilder h = C0072d.m201h("AndroidClientInfo{sdkVersion=");
        h.append(this.sdkVersion);
        h.append(", model=");
        h.append(this.model);
        h.append(", hardware=");
        h.append(this.hardware);
        h.append(", device=");
        h.append(this.device);
        h.append(", product=");
        h.append(this.product);
        h.append(", osBuild=");
        h.append(this.osBuild);
        h.append(", manufacturer=");
        h.append(this.manufacturer);
        h.append(", fingerprint=");
        h.append(this.fingerprint);
        h.append(", locale=");
        h.append(this.locale);
        h.append(", country=");
        h.append(this.country);
        h.append(", mccMnc=");
        h.append(this.mccMnc);
        h.append(", applicationBuild=");
        return C0023f.m110k(h, this.applicationBuild, "}");
    }

    private AutoValue_AndroidClientInfo(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.sdkVersion = num;
        this.model = str;
        this.hardware = str2;
        this.device = str3;
        this.product = str4;
        this.osBuild = str5;
        this.manufacturer = str6;
        this.fingerprint = str7;
        this.locale = str8;
        this.country = str9;
        this.mccMnc = str10;
        this.applicationBuild = str11;
    }
}
