package p277w8;

import com.etsy.android.p072ad.ProlistLogResponse;
import java.util.HashMap;
import okhttp3.C20016y;
import p248tp.C8071s;
import p771sr.C20178a;
import p771sr.C20180c;
import p771sr.C20182e;
import p771sr.C20187j;
import p771sr.C20192o;
import retrofit2.C20145v;

/* renamed from: w8.k */
public interface C8273k {
    @C20192o("/etsyapps/v3/public/prolist/impression-log")
    /* renamed from: a */
    C8071s<C20145v<Void>> mo20871a(@C20178a C20016y yVar, @C20187j HashMap<String, String> hashMap);

    @C20192o("/etsyapps/v3/public/prolist/impression-log")
    @C20182e
    /* renamed from: b */
    C8071s<C20145v<ProlistLogResponse>> mo20872b(@C20180c("logging_keys") String str, @C20180c("display_locs") String str2);

    @C20192o("/etsyapps/v3/public/prolist/click-log")
    @C20182e
    /* renamed from: c */
    C8071s<C20145v<ProlistLogResponse>> mo20873c(@C20180c("logging_key") String str);
}
