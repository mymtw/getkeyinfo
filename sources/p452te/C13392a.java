package p452te;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import com.etsy.android.lib.config.C8591a;
import com.etsy.android.lib.config.C8592b;
import com.etsy.android.lib.models.ShopAboutMember;
import com.etsy.android.lib.models.apiv3.Image;
import com.etsy.android.p327ui.shop.C11143e1;
import com.etsy.android.p327ui.shop.C11192q0;
import com.etsy.android.uikit.viewholder.C12001n;
import java.util.List;
import p628nj.C18263b;

/* renamed from: te.a */
public final class C13392a implements C12001n.C12002a {

    /* renamed from: c */
    public static String f29325c;

    /* renamed from: a */
    public ShopAboutMember f29326a;

    /* renamed from: b */
    public C11143e1 f29327b;

    public C13392a(ShopAboutMember shopAboutMember, C11192q0 q0Var) {
        this.f29327b = q0Var;
        this.f29326a = shopAboutMember;
    }

    /* renamed from: b */
    public final CharSequence mo38866b(Context context) {
        return new SpannableString((this.f29326a.getName() + "\n" + this.f29326a.getRole().replaceAll(",", "$0 ") + "\n\n" + ((C11192q0) this.f29327b).mo36861a(this.f29326a.getBio(), this.f29326a.getBioTranslated())).trim());
    }

    /* renamed from: c */
    public final int mo38867c() {
        return 48;
    }

    public final String getImageUrl() {
        Image image = this.f29326a.getImage();
        String pickBestImageSource = image == null ? "" : image.pickBestImageSource(90, 90);
        if (!TextUtils.isEmpty(pickBestImageSource)) {
            return pickBestImageSource;
        }
        if (f29325c == null) {
            StringBuilder sb = new StringBuilder();
            List<String> list = C8591a.f18700r;
            sb.append(C18263b.f40056T.f18706f.mo21136f(C8592b.f18819p0));
            sb.append(ShopAboutMember.DEFAULT_IMAGE_AVATAR_PATH_190);
            f29325c = sb.toString();
        }
        return f29325c;
    }

    public final void getType() {
    }
}
