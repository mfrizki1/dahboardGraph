package id.co.iconpln.smartcity.ui.publicservices

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat.getColor
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentStatePagerAdapter
import id.co.iconpln.smartcity.R
import id.co.iconpln.smartcity.ui.publicservices.jenispengaduan.jenispengaduanFragment
import id.co.iconpln.smartcity.ui.publicservices.pengaduan.datapengaduanFragment


class PengaduanPagerAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm) {

     override fun getCount(): Int {
         return 2
     }

     override fun getItem(position: Int): Fragment {
         return when (position) {
             0 -> {
                 datapengaduanFragment()
             }
             else -> {
                 jenispengaduanFragment()
             }

         }
     }

     override fun getPageTitle(position: Int): CharSequence? {
         return when(position){
             0->"Data Pengaduan"
             else->"Jenis Pengaduan"
         }
     }

}


/* lateinit var fragmentList: ArrayList<Fragment>
 lateinit var fragmentTitleList: ArrayList<String>


 override fun getItem(position: Int): Fragment {
    return fragmentList.get(position)
 }

 override fun getCount(): Int {
     return fragmentList.size
 }

 fun addFragment(fragment: Fragment, title: String){
     fragmentList.add(fragment)
     fragmentTitleList.add(title)
 }

 override fun getPageTitle(position: Int): CharSequence? {
//        return fragmentTitleList(position)
     return null
 }*/

/* fun getTabView(position:Int):View {
     val view = LayoutInflater.from(context).inflate(R.layout.custom_tabpengaduan, null)
     val tabTextView = view.findViewById<TextView>(R.id.tabtext)
     tabTextView.setText(fragmentTitleList.get(position))
     return view
 }

 fun getSelectedTabView(position: Int): View{
     val view = LayoutInflater.from(context).inflate(R.layout.custom_tabpengaduan, null)
     val tabTextView = view.findViewById<TextView>(R.id.tabtext)
     tabTextView.setText(fragmentTitleList.get(position))
     tabTextView.setTextColor(getColor(context,R.color.colorPrimary))
     return view
 }*/
