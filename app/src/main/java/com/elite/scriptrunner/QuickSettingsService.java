package com.elite.scriptrunner;

import android.service.quicksettings.TileService;

import com.elite.scriptrunner.query.QueryUtils;

public class QuickSettingsService extends TileService {


    @Override
    public void onClick() {
        QueryUtils.killGps();
    }
}
