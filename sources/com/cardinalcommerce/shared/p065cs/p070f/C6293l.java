package com.cardinalcommerce.shared.p065cs.p070f;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.telephony.TelephonyManager;
import androidx.preference.C3039b;
import com.etsy.android.lib.models.ResponseConstants;
import java.io.Serializable;
import java.util.TimeZone;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.l */
public class C6293l implements Serializable {

    /* renamed from: A */
    public int f13896A;

    /* renamed from: B */
    public char[] f13897B;

    /* renamed from: C */
    public int f13898C;

    /* renamed from: a */
    public char[] f13899a;

    /* renamed from: b */
    public char[] f13900b;

    /* renamed from: c */
    public char[] f13901c;

    /* renamed from: d */
    public char[] f13902d;

    /* renamed from: e */
    public int f13903e;

    /* renamed from: f */
    public char[] f13904f;

    /* renamed from: g */
    public char[] f13905g;

    /* renamed from: h */
    public char[] f13906h;

    /* renamed from: i */
    public char[] f13907i;

    /* renamed from: j */
    public char[] f13908j;

    /* renamed from: k */
    public char[] f13909k;

    /* renamed from: l */
    public char[] f13910l;

    /* renamed from: m */
    public char[] f13911m;

    /* renamed from: n */
    public boolean f13912n;

    /* renamed from: o */
    public boolean f13913o;

    /* renamed from: p */
    public boolean f13914p;

    /* renamed from: q */
    public char[] f13915q;

    /* renamed from: r */
    public char[] f13916r;

    /* renamed from: s */
    public char[] f13917s;

    /* renamed from: t */
    public int f13918t;

    /* renamed from: u */
    public char[] f13919u;

    /* renamed from: v */
    public char[] f13920v;

    /* renamed from: w */
    public boolean f13921w;

    /* renamed from: x */
    public boolean f13922x;

    /* renamed from: y */
    public boolean f13923y;

    /* renamed from: z */
    public boolean f13924z;

    /* renamed from: com.cardinalcommerce.shared.cs.f.l$a */
    public class C6294a implements Runnable {
        public C6294a() {
        }

        public final void run() {
            C3039b.m7156Z(C6293l.this.f13899a);
            C3039b.m7156Z(C6293l.this.f13900b);
            C3039b.m7156Z(C6293l.this.f13901c);
            C3039b.m7156Z(C6293l.this.f13902d);
            C6293l lVar = C6293l.this;
            lVar.f13903e = 0;
            C3039b.m7156Z(lVar.f13904f);
            C3039b.m7156Z(C6293l.this.f13905g);
            C3039b.m7156Z(C6293l.this.f13906h);
            C3039b.m7156Z(C6293l.this.f13907i);
            C3039b.m7156Z(C6293l.this.f13908j);
            C3039b.m7156Z(C6293l.this.f13909k);
            C3039b.m7156Z(C6293l.this.f13910l);
            C3039b.m7156Z(C6293l.this.f13911m);
            C6293l lVar2 = C6293l.this;
            lVar2.f13912n = false;
            lVar2.f13913o = false;
            lVar2.f13914p = false;
            C3039b.m7156Z(lVar2.f13915q);
            C3039b.m7156Z(C6293l.this.f13916r);
            C3039b.m7156Z(C6293l.this.f13917s);
            C6293l lVar3 = C6293l.this;
            lVar3.f13918t = 0;
            C3039b.m7156Z(lVar3.f13919u);
            C3039b.m7156Z(C6293l.this.f13920v);
            C6293l lVar4 = C6293l.this;
            lVar4.f13921w = false;
            lVar4.f13922x = false;
            lVar4.f13923y = false;
            lVar4.f13924z = false;
            lVar4.f13896A = 0;
            C3039b.m7156Z(lVar4.f13897B);
            C6293l.this.f13898C = 0;
        }
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    public C6293l(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(ResponseConstants.PHONE);
        if (telephonyManager != null) {
            this.f13904f = C3039b.m7190y(telephonyManager.getDeviceId());
            this.f13905g = C3039b.m7190y(telephonyManager.getSubscriberId());
            this.f13906h = C3039b.m7190y(telephonyManager.getGroupIdLevel1());
            this.f13907i = C3039b.m7190y(telephonyManager.getLine1Number());
            this.f13908j = C3039b.m7190y(telephonyManager.getMmsUAProfUrl());
            this.f13909k = C3039b.m7190y(telephonyManager.getMmsUserAgent());
            this.f13903e = telephonyManager.getNetworkType();
            this.f13910l = C3039b.m7190y(telephonyManager.getNetworkOperator());
            this.f13911m = C3039b.m7190y(telephonyManager.getNetworkOperatorName());
            this.f13915q = C3039b.m7190y(telephonyManager.getSimCountryIso());
            this.f13916r = C3039b.m7190y(telephonyManager.getSimOperator());
            this.f13917s = C3039b.m7190y(telephonyManager.getSimOperatorName());
            this.f13900b = C3039b.m7190y(telephonyManager.getSimSerialNumber());
            this.f13918t = telephonyManager.getSimState();
            this.f13919u = C3039b.m7190y(telephonyManager.getVoiceMailAlphaTag());
            this.f13921w = telephonyManager.hasIccCard();
            this.f13896A = telephonyManager.getPhoneCount();
            this.f13912n = telephonyManager.isHearingAidCompatibilitySupported();
            this.f13913o = telephonyManager.isTtyModeSupported();
            this.f13914p = telephonyManager.isWorldPhone();
            this.f13922x = telephonyManager.isNetworkRoaming();
            this.f13923y = telephonyManager.isSmsCapable();
            this.f13924z = telephonyManager.isVoiceCapable();
            this.f13899a = C3039b.m7190y(telephonyManager.getDeviceSoftwareVersion());
            this.f13900b = C3039b.m7190y(telephonyManager.getSimSerialNumber());
            this.f13902d = C3039b.m7190y(telephonyManager.getNetworkCountryIso());
            this.f13920v = C3039b.m7190y(telephonyManager.getVoiceMailNumber());
            this.f13901c = C3039b.m7190y(TimeZone.getDefault().getDisplayName());
            int phoneType = telephonyManager.getPhoneType();
            this.f13898C = phoneType;
            if (phoneType == 0) {
                this.f13897B = C3039b.m7190y("PHONE_TYPE_NONE");
            } else if (phoneType == 1) {
                this.f13897B = C3039b.m7190y("PHONE_TYPE_GSM");
            } else if (phoneType == 2) {
                this.f13897B = C3039b.m7190y("CDMA");
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo17842a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("DeviceId", C3039b.m7142L(this.f13904f));
            jSONObject.putOpt("GroupIdentifierLevel1", C3039b.m7142L(this.f13906h));
            jSONObject.putOpt("HasIccCard", Boolean.valueOf(this.f13921w));
            jSONObject.putOpt("IMEINumber", C3039b.m7142L(this.f13899a));
            jSONObject.putOpt("IsHearingAidCompatibilitySupported", Boolean.valueOf(this.f13912n));
            jSONObject.putOpt("IsNetworkRoaming", Boolean.valueOf(this.f13922x));
            jSONObject.putOpt("IsSmsCapable", Boolean.valueOf(this.f13923y));
            jSONObject.putOpt("IsTtySupported", Boolean.valueOf(this.f13913o));
            jSONObject.putOpt("IsVoiceCapable", Boolean.valueOf(this.f13924z));
            jSONObject.putOpt("IsWorldPhone", Boolean.valueOf(this.f13914p));
            jSONObject.putOpt("Line1Number", C3039b.m7142L(this.f13907i));
            jSONObject.putOpt("MmsUAProfUrl", C3039b.m7142L(this.f13908j));
            jSONObject.putOpt("MmsUserAgent", C3039b.m7142L(this.f13909k));
            jSONObject.putOpt("NetworkCountryISO", C3039b.m7142L(this.f13902d));
            jSONObject.putOpt("NetworkOperator", C3039b.m7142L(this.f13910l));
            jSONObject.putOpt("NetworkOperatorName", C3039b.m7142L(this.f13911m));
            jSONObject.putOpt("NetworkType", Integer.valueOf(this.f13903e));
            jSONObject.putOpt("PhoneCount", Integer.valueOf(this.f13896A));
            jSONObject.putOpt("PhoneType", Integer.valueOf(this.f13898C));
            jSONObject.putOpt("PhoneTypeString", C3039b.m7142L(this.f13897B));
            jSONObject.putOpt("SimCountryISO", C3039b.m7142L(this.f13915q));
            jSONObject.putOpt("SimOperator", C3039b.m7142L(this.f13916r));
            jSONObject.putOpt("SimOperatorName", C3039b.m7142L(this.f13917s));
            jSONObject.putOpt("SimSerialNumber", C3039b.m7142L(this.f13900b));
            jSONObject.putOpt("SimState", Integer.valueOf(this.f13918t));
            jSONObject.putOpt("SubscriberId", C3039b.m7142L(this.f13905g));
            jSONObject.putOpt("TimeZone", C3039b.m7142L(this.f13901c));
            jSONObject.putOpt("VoiceMailAlphaTag", C3039b.m7142L(this.f13919u));
            jSONObject.putOpt("VoiceMailNumber", C3039b.m7142L(this.f13920v));
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo17843b() {
        AsyncTask.execute(new C6294a());
    }
}
