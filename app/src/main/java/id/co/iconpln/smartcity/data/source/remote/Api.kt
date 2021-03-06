package id.co.iconpln.smartcity.data.source.remote

import id.co.iconpln.smartcity.data.model.api.request.*
import id.co.iconpln.smartcity.data.model.api.response.*
import id.co.iconpln.smartcity.util.Constant
import io.reactivex.Observable
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


@JvmSuppressWildcards
interface Api {

    companion object {
        const val PATH1 = ":8282/"
        const val PATH2 = ":9292/"
        const val VERSION = Constant.API_VERSION
        const val LOGIN= "users/logincuy/"
        const val KOTA = "refcity/"
        const val PROVINCE  = "province/"
        const val GET_KOTA = "${KOTA}province/{province_id}"
        const val GET_PENGADUAN = "pengaduans/pengaduan/"
        const val GET_JPENGADUAN = "JP/JenisPengaduan/"
        const val GET_PERIJINAN = "perizinan/perizinans/"
        const val GET_DEMOGRAFI = "demo/demografi/"

    }

    @POST(LOGIN)
    fun login(@Body loginRequest: LoginRequest) : Observable<BaseResponse<Login>>

    @GET(PROVINCE)
    fun getProvince() : Observable<BaseResponse<Province>>

    @GET(KOTA)
    fun getCity(): Observable<BaseResponse<City>>

    @GET(GET_KOTA)
    fun getCityByProv(@Path("province_id") province_id: String): Observable<BaseResponse<City>>

//    @GET(PENGADUAN)
//    fun pengaduan(): Observable<BaseResponse<>>

    @POST(GET_PENGADUAN)
    fun getDataPengaduan(@Body dataPengaduanRequest: DataPengaduanRequest): Observable<BaseResponse<DataPengaduan>>

    @POST(GET_JPENGADUAN)
    fun getJPengaduan(@Body jPengaduanReq: JPengaduanReq): Observable<BaseResponse<JPengaduan>>

    @POST(GET_PERIJINAN)
    fun getPerijinan(@Body perijinanReq: PerijinanReq): Observable<BaseResponse<Perijinan>>

    @POST(GET_DEMOGRAFI)
    fun getDemograpi(@Body demograpiReq: DemograpiReq): Observable<BaseResponse<Demograpi>>
}

