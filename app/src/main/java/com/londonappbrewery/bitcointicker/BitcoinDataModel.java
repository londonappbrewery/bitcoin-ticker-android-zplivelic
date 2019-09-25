package com.londonappbrewery.bitcointicker;

import android.util.Log;

import org.json.JSONException;
import org.json.JSONObject;


class BitcoinDataModel {
    private static final String TAG = "BitcoinDataModel";

    private String mBitcoinPrice;

    static BitcoinDataModel fromJson(JSONObject jsonObject) {
        try {
            BitcoinDataModel bitcoinData = new BitcoinDataModel();
            bitcoinData.mBitcoinPrice = jsonObject.getString("bid");
            Log.d(TAG, "fromJson: " + bitcoinData);
            return bitcoinData;
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    String getBitcoinPrice() {
        return mBitcoinPrice;
    }
}
