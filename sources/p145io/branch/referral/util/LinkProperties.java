package p145io.branch.referral.util;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p145io.branch.referral.Branch;

/* renamed from: io.branch.referral.util.LinkProperties */
public class LinkProperties implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C7085a();
    private String alias_;
    private String campaign_;
    private String channel_;
    private final HashMap<String, String> controlParams_;
    private String feature_;
    private int matchDuration_;
    private String stage_;
    private final ArrayList<String> tags_;

    /* renamed from: io.branch.referral.util.LinkProperties$a */
    public class C7085a implements Parcelable.Creator {
        public final Object createFromParcel(Parcel parcel) {
            return new LinkProperties(parcel, (C7085a) null);
        }

        public final Object[] newArray(int i) {
            return new LinkProperties[i];
        }
    }

    public /* synthetic */ LinkProperties(Parcel parcel, C7085a aVar) {
        this(parcel);
    }

    public static LinkProperties getReferredLinkProperties() {
        Branch j = Branch.m13575j();
        if (j == null) {
            return null;
        }
        j.mo19197k();
        JSONObject k = j.mo19197k();
        try {
            if (!k.has("+clicked_branch_link") || !k.getBoolean("+clicked_branch_link")) {
                return null;
            }
            LinkProperties linkProperties = new LinkProperties();
            try {
                if (k.has("~channel")) {
                    linkProperties.setChannel(k.getString("~channel"));
                }
                if (k.has("~feature")) {
                    linkProperties.setFeature(k.getString("~feature"));
                }
                if (k.has("~stage")) {
                    linkProperties.setStage(k.getString("~stage"));
                }
                if (k.has("~campaign")) {
                    linkProperties.setCampaign(k.getString("~campaign"));
                }
                if (k.has("~duration")) {
                    linkProperties.setDuration(k.getInt("~duration"));
                }
                if (k.has("$match_duration")) {
                    linkProperties.setDuration(k.getInt("$match_duration"));
                }
                if (k.has("~tags")) {
                    JSONArray jSONArray = k.getJSONArray("~tags");
                    for (int i = 0; i < jSONArray.length(); i++) {
                        linkProperties.addTag(jSONArray.getString(i));
                    }
                }
                Iterator<String> keys = k.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (next.startsWith("$")) {
                        linkProperties.addControlParameter(next, k.getString(next));
                    }
                }
            } catch (Exception unused) {
            }
            return linkProperties;
        } catch (Exception unused2) {
            return null;
        }
    }

    public LinkProperties addControlParameter(String str, String str2) {
        this.controlParams_.put(str, str2);
        return this;
    }

    public LinkProperties addTag(String str) {
        this.tags_.add(str);
        return this;
    }

    public int describeContents() {
        return 0;
    }

    public String getAlias() {
        return this.alias_;
    }

    public String getCampaign() {
        return this.campaign_;
    }

    public String getChannel() {
        return this.channel_;
    }

    public HashMap<String, String> getControlParams() {
        return this.controlParams_;
    }

    public String getFeature() {
        return this.feature_;
    }

    public int getMatchDuration() {
        return this.matchDuration_;
    }

    public String getStage() {
        return this.stage_;
    }

    public ArrayList<String> getTags() {
        return this.tags_;
    }

    public LinkProperties setAlias(String str) {
        this.alias_ = str;
        return this;
    }

    public LinkProperties setCampaign(String str) {
        this.campaign_ = str;
        return this;
    }

    public LinkProperties setChannel(String str) {
        this.channel_ = str;
        return this;
    }

    public LinkProperties setDuration(int i) {
        this.matchDuration_ = i;
        return this;
    }

    public LinkProperties setFeature(String str) {
        this.feature_ = str;
        return this;
    }

    public LinkProperties setStage(String str) {
        this.stage_ = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.feature_);
        parcel.writeString(this.alias_);
        parcel.writeString(this.stage_);
        parcel.writeString(this.channel_);
        parcel.writeString(this.campaign_);
        parcel.writeInt(this.matchDuration_);
        parcel.writeSerializable(this.tags_);
        parcel.writeInt(this.controlParams_.size());
        for (Map.Entry next : this.controlParams_.entrySet()) {
            parcel.writeString((String) next.getKey());
            parcel.writeString((String) next.getValue());
        }
    }

    public LinkProperties() {
        this.tags_ = new ArrayList<>();
        this.feature_ = "Share";
        this.controlParams_ = new HashMap<>();
        this.alias_ = "";
        this.stage_ = "";
        this.matchDuration_ = 0;
        this.channel_ = "";
        this.campaign_ = "";
    }

    private LinkProperties(Parcel parcel) {
        this();
        this.feature_ = parcel.readString();
        this.alias_ = parcel.readString();
        this.stage_ = parcel.readString();
        this.channel_ = parcel.readString();
        this.campaign_ = parcel.readString();
        this.matchDuration_ = parcel.readInt();
        this.tags_.addAll((ArrayList) parcel.readSerializable());
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.controlParams_.put(parcel.readString(), parcel.readString());
        }
    }
}
