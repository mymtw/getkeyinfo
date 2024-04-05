package p468ve;

import android.content.Context;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.activity.C0114h;
import com.etsy.android.R;
import com.etsy.android.lib.models.MessageModel;
import com.etsy.android.lib.models.ResponseConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C19327t;
import kotlin.jvm.internal.C19383o;
import p435rb.C13350a;
import p435rb.C13351b;

/* renamed from: ve.a */
public final class C13784a {

    /* renamed from: a */
    public final ViewGroup f30317a;

    public C13784a(ViewGroup viewGroup) {
        C19383o.m32797g(viewGroup, ResponseConstants.PARENT);
        this.f30317a = viewGroup;
    }

    /* renamed from: b */
    public static Integer m21328b(Context context, String str) {
        C19383o.m32797g(str, "colorAttr");
        switch (str.hashCode()) {
            case -1167885826:
                if (str.equals("clg_color_text_primary_inverse")) {
                    return Integer.valueOf(C13350a.m21013d(context, R.attr.clg_color_text_primary_inverse));
                }
                break;
            case -630080088:
                if (str.equals("clg_color_text_primary_on_light")) {
                    return Integer.valueOf(C13350a.m21013d(context, R.attr.clg_color_text_primary_on_light));
                }
                break;
            case -159118172:
                if (str.equals("clg_color_text_primary_on_dark")) {
                    return Integer.valueOf(C13350a.m21013d(context, R.attr.clg_color_text_primary_on_dark));
                }
                break;
            case -54582849:
                if (str.equals("clg_color_text_secondary")) {
                    return Integer.valueOf(C13350a.m21013d(context, R.attr.clg_color_text_secondary));
                }
                break;
            case 608751932:
                if (str.equals("clg_text_color_white")) {
                    return Integer.valueOf(C13350a.m21013d(context, R.attr.clg_color_text_primary_on_dark));
                }
                break;
        }
        return null;
    }

    /* renamed from: a */
    public final View mo46644a(MessageModel messageModel, int i) {
        C19383o.m32797g(messageModel, "messageModel");
        View j0 = C0114h.m305j0(this.f30317a, R.layout.styled_banner_message, false);
        TextView textView = (TextView) j0.findViewById(R.id.styled_banner_message);
        textView.setText(Html.fromHtml(messageModel.getMessage(), 63));
        textView.setGravity(i);
        List<String> styles = messageModel.getStyles();
        for (String str : styles) {
            ArrayList arrayList = new ArrayList();
            for (String b : styles) {
                Context context = textView.getContext();
                C19383o.m32796f(context, ResponseConstants.CONTEXT);
                Integer b2 = m21328b(context, b);
                if (b2 != null) {
                    arrayList.add(b2);
                }
            }
            Integer num = arrayList.isEmpty() ? null : (Integer) C19327t.m32638T0(arrayList);
            TextView textView2 = (TextView) textView.findViewById(R.id.styled_banner_message);
            if (textView2 != null) {
                switch (str.hashCode()) {
                    case -855502957:
                        if (str.equals("clg_text_body")) {
                            C13351b.m21018b(textView2, R.style.clg_text_body);
                            break;
                        }
                        break;
                    case -798154569:
                        if (str.equals("clg_arrow_link_forward")) {
                            if (num == null) {
                                C13351b.m21017a(textView2, (Integer) null);
                                break;
                            } else {
                                num.intValue();
                                C13351b.m21017a(textView2, num);
                                num.intValue();
                                break;
                            }
                        }
                        break;
                    case -734328185:
                        if (str.equals("clg_text_title")) {
                            C13351b.m21018b(textView2, R.style.clg_text_title);
                            break;
                        }
                        break;
                    case 133228419:
                        if (str.equals("clg_text_title_large")) {
                            C13351b.m21018b(textView2, R.style.clg_text_title_large);
                            break;
                        }
                        break;
                    case 140034383:
                        if (str.equals("clg_text_title_small")) {
                            C13351b.m21018b(textView2, R.style.clg_text_title_small);
                            break;
                        }
                        break;
                    case 164810075:
                        if (str.equals("clg_text_body_small")) {
                            C13351b.m21018b(textView2, R.style.clg_text_body_small);
                            break;
                        }
                        break;
                    case 787814001:
                        if (str.equals("clg_text_heading")) {
                            C13351b.m21018b(textView2, R.style.clg_text_heading);
                            break;
                        }
                        break;
                }
                if (num != null) {
                    textView2.setTextColor(num.intValue());
                }
            }
        }
        return j0;
    }
}
