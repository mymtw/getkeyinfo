package com.etsy.android.lib.models.apiv3;

import com.etsy.android.lib.logger.C8694h;
import com.etsy.android.lib.models.BaseFieldModel;
import com.etsy.android.lib.models.enums.SalesChannels;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p425q9.C13258i;

@JsonPropertyOrder(alphabetic = true)
public class VenueOverrides extends BaseFieldModel {
    public static final String CHANNEL_ID = "channel_id";
    public static final String DESCRIPTION = "description";
    public static final String TITLE = "title";
    private static final long serialVersionUID = 5761904142441965632L;
    @JsonProperty("channel_id")
    public int mChannelId;
    @JsonProperty("description")
    public String mDesc = "";
    @JsonProperty("title")
    public String mTitle = "";

    @JsonIgnore
    public static ArrayList<VenueOverrides> deserialize(String str) {
        if (str == null) {
            return new ArrayList<>();
        }
        try {
            return new ArrayList<>(Arrays.asList((VenueOverrides[]) C13258i.f29122d.f29125c.readValue(str, VenueOverrides[].class)));
        } catch (IOException e) {
            C8694h.f19097a.error(e);
            return new ArrayList<>();
        }
    }

    @JsonIgnore
    public static VenueOverrides getVenueOverrideForChannel(List<VenueOverrides> list, SalesChannels salesChannels) {
        for (VenueOverrides next : list) {
            if (next.getChannelId() == salesChannels.channelInt) {
                return next;
            }
        }
        return null;
    }

    @JsonIgnore
    public static String serialize(List<VenueOverrides> list) {
        try {
            return C13258i.f29122d.f29125c.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            C8694h.f19097a.error(e);
            return "";
        }
    }

    @JsonIgnore
    public int getChannelId() {
        return this.mChannelId;
    }

    @JsonIgnore
    public String getDesc() {
        return this.mDesc;
    }

    @JsonIgnore
    public String getTitle() {
        return this.mTitle;
    }

    public boolean parseField(JsonParser jsonParser, String str) throws IOException {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1930808873:
                if (str.equals("channel_id")) {
                    c = 0;
                    break;
                }
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c = 1;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.mChannelId = jsonParser.getIntValue();
                break;
            case 1:
                this.mDesc = jsonParser.getValueAsString();
                break;
            case 2:
                this.mTitle = jsonParser.getValueAsString();
                break;
            default:
                return false;
        }
        return true;
    }

    @JsonIgnore
    public void setChannelId(int i) {
        this.mChannelId = i;
    }

    @JsonIgnore
    public void setDesc(String str) {
        this.mDesc = str;
    }

    @JsonIgnore
    public void setTitle(String str) {
        this.mTitle = str;
    }
}
