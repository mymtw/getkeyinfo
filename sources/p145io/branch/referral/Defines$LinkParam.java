package p145io.branch.referral;

import com.appsflyer.AppsFlyerProperties;
import com.etsy.android.lib.models.editable.EditableListing;

/* renamed from: io.branch.referral.Defines$LinkParam */
public enum Defines$LinkParam {
    Tags(EditableListing.FIELD_TAGS),
    Alias("alias"),
    Type("type"),
    Duration("duration"),
    Channel(AppsFlyerProperties.CHANNEL),
    Feature("feature"),
    Stage("stage"),
    Campaign("campaign"),
    Data("data"),
    URL("url");
    
    private final String key;

    private Defines$LinkParam(String str) {
        this.key = str;
    }

    public String getKey() {
        return this.key;
    }

    public String toString() {
        return this.key;
    }
}
