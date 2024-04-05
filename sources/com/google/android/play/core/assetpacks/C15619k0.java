package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.internal.C15714z;
import java.util.concurrent.ExecutionException;
import p689ul.C18608f;

/* renamed from: com.google.android.play.core.assetpacks.k0 */
public final class C15619k0 {

    /* renamed from: a */
    public final C15714z f35223a;

    public C15619k0(C15714z zVar) {
        this.f35223a = zVar;
    }

    /* renamed from: a */
    public final ParcelFileDescriptor.AutoCloseInputStream mo55442a(String str, int i, int i2, String str2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C18608f.m31380a(((C15677y2) this.f35223a.zza()).mo55470g(str, i, i2, str2));
            if (parcelFileDescriptor != null && parcelFileDescriptor.getFileDescriptor() != null) {
                return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
            }
            throw new zzck(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), i);
        } catch (ExecutionException e) {
            throw new zzck(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", new Object[]{Integer.valueOf(i), str, str2, Integer.valueOf(i2)}), e, i);
        } catch (InterruptedException e2) {
            throw new zzck("Extractor was interrupted while waiting for chunk file.", e2, i);
        }
    }
}
