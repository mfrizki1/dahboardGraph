package id.co.iconpln.smartcity.data.source.pref

import com.orhanobut.hawk.Hawk
import id.co.iconpln.smartcity.data.model.local.CityDto
import id.co.iconpln.smartcity.data.model.local.UserDto

/**
 * rizmaulana@live.com 2019-06-14.
 */
class AppPrefSource{

    fun getUser() : UserDto? = Hawk.get(UserDto::class.java.simpleName, null)

//    fun getCityId() : String = Hawk.get("coba")
    fun setCityid(coba: String) = Hawk.put("coba", coba)

}