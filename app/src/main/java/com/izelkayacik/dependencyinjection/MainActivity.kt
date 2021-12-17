package com.izelkayacik.dependencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //Field Injection
    @Inject
    lateinit var yaz : Musician

    @Inject
    lateinit var myClass : ClassExample

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*
        val instrument = Instrument()
        val groupName = GroupName()
        var lindemann = Musician(instrument, groupName)
        lindemann.sing()
         */

        yaz.sing()

        println(myClass.myFunction())
    }
}