package dev.gumato.twitterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.gumato.twitterapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayTwitter()

    }
    fun displayTwitter(){
        var twitter = Twitter("@j_gee","Morme Roba","my first Android app!","","","7","34","13","","","")
        var twitter2 = Twitter("@muthiooo","Faithful Faith","Wajacoyah is our Fifth President!","","","2","34","43","","","")
        var twitter3 = Twitter("@tina_key","Chris Tinaa","First day at microsoft","","","56","0","36","","","")
        var twitter4 = Twitter("@janee_nyambura","Jane Nyambura","I love travelling!","","","3","4","78","","","")
        var twitter5 = Twitter("@rufo_chris","Rufo Roba","8th day of #100Days of Code!","","","8","2","90","","","")
        var twitter6 = Twitter("@nancy_wamboi","Nancy thee Queen","My journey at akiraChix is fun!","","","40","0","9","","","")
        var twitter7 = Twitter("@queen_caro","Caroline Barker","I have finally finished to build a balance sheet to learn CSS","","","10","34","6","","","")
        var twitter8 = Twitter("@shebalove_67","Sheba Official","What matter is that we can help people build life for themselves","","","66","10","1","","","")
        var twitter9= Twitter("@rema_official","Rema Love","I began my signup form project","","","3","23","30","","","")
        var twitter10 = Twitter("@sunaina_aurora","Aurora_Sunaina","The journey begins","","","54","3","20","","","")

        var twitterList = listOf(twitter,twitter2,twitter3,twitter4,twitter5,twitter6,twitter7,twitter8,twitter9,twitter10)
        var twitterAdapter = TwitterRvAdapter(twitterList)
        binding.rvTwitter.layoutManager = LinearLayoutManager(this)
        binding.rvTwitter.adapter = twitterAdapter

    }
}