package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C2573e0;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.x0 */
public interface C2640x0 {
    /* renamed from: A */
    void mo9748A(List<String> list) throws IOException;

    /* renamed from: B */
    void mo9749B(List<Float> list) throws IOException;

    /* renamed from: C */
    boolean mo9750C() throws IOException;

    /* renamed from: D */
    int mo9751D() throws IOException;

    /* renamed from: E */
    void mo9752E(List<ByteString> list) throws IOException;

    /* renamed from: F */
    void mo9753F(List<Double> list) throws IOException;

    /* renamed from: G */
    long mo9754G() throws IOException;

    /* renamed from: H */
    String mo9755H() throws IOException;

    /* renamed from: I */
    <T> T mo9756I(C2642y0<T> y0Var, C2611o oVar) throws IOException;

    /* renamed from: J */
    <T> void mo9757J(List<T> list, C2642y0<T> y0Var, C2611o oVar) throws IOException;

    @Deprecated
    /* renamed from: K */
    <T> T mo9758K(C2642y0<T> y0Var, C2611o oVar) throws IOException;

    /* renamed from: L */
    <K, V> void mo9759L(Map<K, V> map, C2573e0.C2574a<K, V> aVar, C2611o oVar) throws IOException;

    @Deprecated
    /* renamed from: M */
    <T> void mo9760M(List<T> list, C2642y0<T> y0Var, C2611o oVar) throws IOException;

    /* renamed from: a */
    long mo9769a() throws IOException;

    /* renamed from: b */
    void mo9770b(List<Integer> list) throws IOException;

    /* renamed from: c */
    void mo9771c(List<Long> list) throws IOException;

    /* renamed from: d */
    boolean mo9772d() throws IOException;

    /* renamed from: e */
    long mo9773e() throws IOException;

    /* renamed from: f */
    void mo9774f(List<Long> list) throws IOException;

    /* renamed from: g */
    int mo9775g() throws IOException;

    int getTag();

    /* renamed from: h */
    void mo9777h(List<Long> list) throws IOException;

    /* renamed from: i */
    void mo9778i(List<Integer> list) throws IOException;

    /* renamed from: j */
    int mo9779j() throws IOException;

    /* renamed from: k */
    int mo9780k() throws IOException;

    /* renamed from: l */
    void mo9781l(List<Boolean> list) throws IOException;

    /* renamed from: m */
    void mo9782m(List<String> list) throws IOException;

    /* renamed from: n */
    ByteString mo9783n() throws IOException;

    /* renamed from: o */
    int mo9784o() throws IOException;

    /* renamed from: p */
    void mo9785p(List<Long> list) throws IOException;

    /* renamed from: q */
    void mo9786q(List<Integer> list) throws IOException;

    /* renamed from: r */
    long mo9787r() throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    /* renamed from: s */
    void mo9790s(List<Integer> list) throws IOException;

    /* renamed from: t */
    int mo9791t() throws IOException;

    /* renamed from: u */
    void mo9792u(List<Long> list) throws IOException;

    /* renamed from: v */
    void mo9793v(List<Integer> list) throws IOException;

    /* renamed from: w */
    void mo9794w(List<Integer> list) throws IOException;

    /* renamed from: x */
    long mo9795x() throws IOException;

    /* renamed from: y */
    String mo9796y() throws IOException;

    /* renamed from: z */
    int mo9797z() throws IOException;
}
