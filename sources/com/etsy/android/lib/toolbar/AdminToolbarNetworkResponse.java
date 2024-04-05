package com.etsy.android.lib.toolbar;

import android.support.p013v4.media.C0069a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import okhttp3.C19994o;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdminToolbarNetworkResponse implements Serializable {
    private String mHeadersString;
    private byte[] mRawJson;
    private int mStatusCode;
    private String mUrl = "";

    public AdminToolbarNetworkResponse(String str, int i, C19994o oVar, byte[] bArr) {
        try {
            this.mUrl = URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.mRawJson = bArr;
        this.mStatusCode = i;
        StringBuilder g = C0069a.m176g(255, "<b>Headers:</b><br/>");
        for (String next : oVar.mo72950e()) {
            g.append("<b>");
            g.append(next);
            g.append(":</b>");
            g.append(oVar.mo72948a(next));
            g.append("<br/>");
        }
        this.mHeadersString = g.toString();
    }

    public String getHeadersString() {
        return this.mHeadersString;
    }

    public String getPrettyJsonString() {
        if (this.mRawJson == null) {
            return "";
        }
        try {
            return new JSONObject(new String(this.mRawJson, "UTF-8")).toString(4);
        } catch (UnsupportedEncodingException | JSONException e) {
            e.printStackTrace();
            try {
                return new JSONArray(new String(this.mRawJson, "UTF-8")).toString(4);
            } catch (UnsupportedEncodingException | JSONException e2) {
                e2.printStackTrace();
                try {
                    return new String(this.mRawJson, "UTF-8");
                } catch (UnsupportedEncodingException e3) {
                    e3.printStackTrace();
                    return "";
                }
            }
        }
    }

    public int getStatusCode() {
        return this.mStatusCode;
    }

    public String getUrl() {
        return this.mUrl;
    }
}
