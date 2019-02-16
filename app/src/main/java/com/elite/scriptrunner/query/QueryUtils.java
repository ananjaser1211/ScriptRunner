package com.elite.scriptrunner.query;

import android.util.Log;
import android.widget.Toast;

import com.jaredrummler.android.shell.CommandResult;
import com.jaredrummler.android.shell.Shell;

public class QueryUtils {



    public QueryUtils(){


    }


    public static void killGps(){

        CommandResult result = Shell.SU.run("sh ./system/etc/init.d/98gps");

        if (result.isSuccessful()){

            Log.v("GPSKiller", "GPS/LHD Killed");

        } else {
            Log.v("GPSKiller", "Failed to lunch GpsKiller. Got Root ?");

        }
    }







}
