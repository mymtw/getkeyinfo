package p555ei;

import androidx.preference.C3039b;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyInfo;
import com.google.common.base.C15781b;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.C0005b;
import p512bi.C14044c;

/* renamed from: ei.a */
public final class C17703a extends C3039b {

    /* renamed from: e */
    public static final Pattern f38508e = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: c */
    public final CharsetDecoder f38509c = C15781b.f35562c.newDecoder();

    /* renamed from: d */
    public final CharsetDecoder f38510d = C15781b.f35561b.newDecoder();

    /* JADX INFO: finally extract failed */
    /* renamed from: n0 */
    public final Metadata mo11184n0(C14044c cVar, ByteBuffer byteBuffer) {
        String str;
        String str2 = null;
        try {
            str = this.f38509c.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                str = this.f38510d.decode(byteBuffer).toString();
                this.f38510d.reset();
                byteBuffer.rewind();
            } catch (CharacterCodingException unused2) {
                this.f38510d.reset();
                byteBuffer.rewind();
                str = null;
            } catch (Throwable th) {
                this.f38510d.reset();
                byteBuffer.rewind();
                throw th;
            }
        } finally {
            this.f38509c.reset();
            byteBuffer.rewind();
        }
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        if (str == null) {
            return new Metadata(new IcyInfo(bArr, (String) null, (String) null));
        }
        Matcher matcher = f38508e.matcher(str);
        String str3 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            if (group != null) {
                String q0 = C0005b.m56q0(group);
                q0.getClass();
                if (q0.equals("streamurl")) {
                    str3 = group2;
                } else if (q0.equals("streamtitle")) {
                    str2 = group2;
                }
            }
        }
        return new Metadata(new IcyInfo(bArr, str2, str3));
    }
}
