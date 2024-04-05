package p264v4;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.C6051s;
import java.io.ByteArrayOutputStream;
import p150j4.C7114e;
import p222r4.C7745b;

/* renamed from: v4.a */
public final class C8201a implements C8203c<Bitmap, byte[]> {

    /* renamed from: b */
    public final Bitmap.CompressFormat f17995b = Bitmap.CompressFormat.JPEG;

    /* renamed from: c */
    public final int f17996c = 100;

    /* renamed from: k */
    public final C6051s<byte[]> mo4161k(C6051s<Bitmap> sVar, C7114e eVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sVar.get().compress(this.f17995b, this.f17996c, byteArrayOutputStream);
        sVar.mo16990b();
        return new C7745b(byteArrayOutputStream.toByteArray());
    }
}
