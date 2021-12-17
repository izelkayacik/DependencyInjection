package com.izelkayacik.dependencyinjection

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

//Constructor Injection
@Singleton
class Musician
    @Inject
    constructor(instrument: Instrument, groupName: GroupName)
     {

    fun sing(){
        println("Working...")
    }

}