package com.google.firebase.installations.local;

import android.support.p013v4.media.C0072d;
import com.fasterxml.jackson.databind.util.PrimitiveArrayBuilder;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;
import p575gm.C17793c;

public final class PersistedInstallation {

    /* renamed from: a */
    public final File f36770a;

    /* renamed from: b */
    public final C17793c f36771b;

    public enum RegistrationStatus {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public PersistedInstallation(C17793c cVar) {
        cVar.mo69021a();
        File filesDir = cVar.f38672a.getFilesDir();
        StringBuilder h = C0072d.m201h("PersistedInstallation.");
        h.append(cVar.mo69022c());
        h.append(".json");
        this.f36770a = new File(filesDir, h.toString());
        this.f36771b = cVar;
    }

    /* renamed from: a */
    public final void mo59101a(C16573b bVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", bVar.getFirebaseInstallationId());
            jSONObject.put("Status", bVar.getRegistrationStatus().ordinal());
            jSONObject.put("AuthToken", bVar.getAuthToken());
            jSONObject.put("RefreshToken", bVar.getRefreshToken());
            jSONObject.put("TokenCreationEpochInSecs", bVar.getTokenCreationEpochInSecs());
            jSONObject.put("ExpiresInSecs", bVar.getExpiresInSecs());
            jSONObject.put("FisError", bVar.getFisError());
            C17793c cVar = this.f36771b;
            cVar.mo69021a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", cVar.f38672a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(this.f36770a)) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    /* renamed from: b */
    public final C16573b mo59102b() {
        JSONObject jSONObject;
        FileInputStream fileInputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[PrimitiveArrayBuilder.SMALL_CHUNK_SIZE];
        try {
            fileInputStream = new FileInputStream(this.f36770a);
            while (true) {
                int read = fileInputStream.read(bArr, 0, PrimitiveArrayBuilder.SMALL_CHUNK_SIZE);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        String optString = jSONObject.optString("Fid", (String) null);
        int optInt = jSONObject.optInt("Status", RegistrationStatus.ATTEMPT_MIGRATION.ordinal());
        String optString2 = jSONObject.optString("AuthToken", (String) null);
        String optString3 = jSONObject.optString("RefreshToken", (String) null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0);
        return C16573b.builder().setFirebaseInstallationId(optString).setRegistrationStatus(RegistrationStatus.values()[optInt]).setAuthToken(optString2).setRefreshToken(optString3).setTokenCreationEpochInSecs(optLong).setExpiresInSecs(optLong2).setFisError(jSONObject.optString("FisError", (String) null)).build();
        throw th;
    }
}
