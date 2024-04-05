package p145io.branch.referral.util;

/* renamed from: io.branch.referral.util.AdType */
public enum AdType {
    BANNER("BANNER"),
    INTERSTITIAL("INTERSTITIAL"),
    REWARDED_VIDEO("REWARDED_VIDEO"),
    NATIVE("NATIVE");
    
    private final String name;

    private AdType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
