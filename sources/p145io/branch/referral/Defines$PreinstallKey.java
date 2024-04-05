package p145io.branch.referral;

/* renamed from: io.branch.referral.Defines$PreinstallKey */
public enum Defines$PreinstallKey {
    campaign("preinstall_campaign"),
    partner("preinstall_partner");
    
    private final String key;

    private Defines$PreinstallKey(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return this.key;
    }
}
