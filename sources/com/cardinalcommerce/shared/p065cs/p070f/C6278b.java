package com.cardinalcommerce.shared.p065cs.p070f;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.os.AsyncTask;
import androidx.preference.C3039b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p257u8.C8172b;

/* renamed from: com.cardinalcommerce.shared.cs.f.b */
public class C6278b implements Serializable {

    /* renamed from: a */
    public char[] f13806a;

    /* renamed from: b */
    public List<char[]> f13807b;

    /* renamed from: c */
    public boolean f13808c;

    /* renamed from: com.cardinalcommerce.shared.cs.f.b$a */
    public class C6279a implements Runnable {
        public C6279a() {
        }

        public final void run() {
            C3039b.m7156Z(C6278b.this.f13806a);
            List<char[]> list = C6278b.this.f13807b;
            if (list == null) {
                new ArrayList();
            } else {
                for (char[] Z : list) {
                    C3039b.m7156Z(Z);
                }
            }
            C6278b.this.f13808c = false;
        }
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public C6278b(Context context) {
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        if (bluetoothManager != null && bluetoothManager.getAdapter() != null) {
            this.f13806a = C3039b.m7190y(bluetoothManager.getAdapter().getAddress());
            ArrayList arrayList = new ArrayList();
            for (BluetoothDevice name : bluetoothManager.getAdapter().getBondedDevices()) {
                arrayList.add(C3039b.m7190y(name.getName()));
            }
            this.f13807b = arrayList;
            this.f13808c = bluetoothManager.getAdapter().isEnabled();
        }
    }

    /* renamed from: a */
    public JSONObject mo17813a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("Address", C3039b.m7142L(this.f13806a));
            List<char[]> list = this.f13807b;
            if (list != null && !list.isEmpty()) {
                List<char[]> list2 = this.f13807b;
                StringBuilder sb = new StringBuilder();
                for (char[] append : list2) {
                    sb.append(append);
                }
                jSONObject.putOpt("BondedDevices", new JSONArray(sb.toString()));
            }
            jSONObject.putOpt("IsBluetoothEnabled", Boolean.valueOf(this.f13808c));
        } catch (JSONException e) {
            C8172b.m16432f().mo19177d(String.valueOf(13101), e.getLocalizedMessage(), (String) null);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public void mo17814b() {
        AsyncTask.execute(new C6279a());
    }
}
