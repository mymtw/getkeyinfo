package p145io.branch.referral;

/* renamed from: io.branch.referral.Defines$HeaderKey */
public enum Defines$HeaderKey {
    RequestId("X-Branch-Request-Id"),
    SendCloseRequest("X-Branch-Send-Close-Request");
    
    private final String key;

    private Defines$HeaderKey(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return this.key;
    }
}
