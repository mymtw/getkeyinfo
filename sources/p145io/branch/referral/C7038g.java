package p145io.branch.referral;

import android.content.Context;
import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p772tq.C20203a;

/* renamed from: io.branch.referral.g */
public final class C7038g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ String f15653b;

    /* renamed from: c */
    public final /* synthetic */ Branch f15654c;

    /* renamed from: d */
    public final /* synthetic */ Context f15655d;

    public C7038g(String str, Branch branch, Context context) {
        this.f15653b = str;
        this.f15654c = branch;
        this.f15655d = context;
    }

    public final void run() {
        try {
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(this.f15653b)));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            JSONObject jSONObject = new JSONObject(sb.toString().trim());
            if (!TextUtils.isEmpty(jSONObject.toString())) {
                C20203a.m34519B(jSONObject, this.f15654c, this.f15655d);
                return;
            }
            throw new FileNotFoundException();
        } catch (FileNotFoundException | IOException | JSONException unused) {
        }
    }
}
