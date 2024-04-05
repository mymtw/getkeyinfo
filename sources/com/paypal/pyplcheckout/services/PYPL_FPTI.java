package com.paypal.pyplcheckout.services;

import com.paypal.pyplcheckout.model.DebugConfigManager;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

public class PYPL_FPTI {
    private static PYPL_FPTI single_instance;
    private DebugConfigManager config;
    private JSONObject dictionary = null;

    public PYPL_FPTI() {
        InputStream open;
        DebugConfigManager instance = DebugConfigManager.getInstance();
        this.config = instance;
        try {
            open = instance.getProviderContext().getAssets().open("FPTIDictionary.json");
            byte[] bArr = new byte[open.available()];
            open.read(bArr);
            open.close();
            this.dictionary = new JSONObject(new String(bArr));
            open.close();
            return;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static PYPL_FPTI getInstance() {
        if (single_instance == null) {
            single_instance = new PYPL_FPTI();
        }
        return single_instance;
    }

    public JSONObject fetchPayload(String str) {
        try {
            return (JSONObject) this.dictionary.get(str);
        } catch (JSONException e) {
            System.out.println(e);
            return null;
        }
    }
}
