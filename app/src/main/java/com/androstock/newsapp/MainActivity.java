package com.androstock.newsapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;
import com.rozcloud.flow.RozFeed;
import com.rozcloud.flow.rozfeed.FeedChannelTab;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String API_KEY = "8190df9eb51445228e397e4185311a66"; // ### YOUE NEWS API HERE ###
    String NEWS_SOURCE = "bbc-news";
    ListView listNews;


    ArrayList<HashMap<String, String>> dataList = new ArrayList<HashMap<String, String>>();
    static final String KEY_AUTHOR = "author";
    static final String KEY_TITLE = "title";
    static final String KEY_DESCRIPTION = "description";
    static final String KEY_URL = "url";
    static final String KEY_URLTOIMAGE = "urlToImage";
    static final String KEY_PUBLISHEDAT = "publishedAt";
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RozFeed.initialize(this, "19141bfpie1", "79dfeecf20d0457b8d32dd37419d087a");

        init();

    }

    public void init(){

        List<FeedChannelTab> feedChannelTabs = new ArrayList<>();

        FeedChannelTab autoChannelTab = new FeedChannelTab();
        autoChannelTab.setChannelId("1");
        autoChannelTab.setTitle("Auto");
        feedChannelTabs.add(autoChannelTab);

        FeedChannelTab businessChannelTab = new FeedChannelTab();
        businessChannelTab.setChannelId("2");
        businessChannelTab.setTitle("Business");
        feedChannelTabs.add(businessChannelTab);

        FeedChannelTab cricketChannelTab = new FeedChannelTab();
        cricketChannelTab.setChannelId("3");
        cricketChannelTab.setTitle("Cricket");
        feedChannelTabs.add(cricketChannelTab);

        FeedChannelTab educationChannelTab = new FeedChannelTab();
        educationChannelTab.setChannelId("4");
        educationChannelTab.setTitle("Education");
        feedChannelTabs.add(educationChannelTab);

        FeedChannelTab entertainmentChannelTab = new FeedChannelTab();
        entertainmentChannelTab.setChannelId("5");
        entertainmentChannelTab.setTitle("Entertainment");
        feedChannelTabs.add(entertainmentChannelTab);

        FeedChannelTab healthChannelTab = new FeedChannelTab();
        healthChannelTab.setChannelId("6");
        healthChannelTab.setTitle("Health");
        feedChannelTabs.add(healthChannelTab);

        FeedChannelTab offBeatChannelTab = new FeedChannelTab();
        offBeatChannelTab.setChannelId("7");
        offBeatChannelTab.setTitle("Offbeat");
        feedChannelTabs.add(offBeatChannelTab);

        FeedChannelTab politicChannelTab = new FeedChannelTab();
        politicChannelTab.setChannelId("8");
        politicChannelTab.setTitle("Politic");
        feedChannelTabs.add(politicChannelTab);

        FeedChannelTab sportsChannelTab = new FeedChannelTab();
        sportsChannelTab.setChannelId("9");
        sportsChannelTab.setTitle("Sports");
        feedChannelTabs.add(sportsChannelTab);

        FeedChannelTab technologyChannelTab = new FeedChannelTab();
        technologyChannelTab.setChannelId("10");
        technologyChannelTab.setTitle("Technology");
        feedChannelTabs.add(technologyChannelTab);

        FeedChannelTab worldBeatChannelTab = new FeedChannelTab();
        worldBeatChannelTab.setChannelId("11");
        worldBeatChannelTab.setTitle("World");
        feedChannelTabs.add(worldBeatChannelTab);

        FeedChannelTab lifestyleChannelTab = new FeedChannelTab();
        lifestyleChannelTab.setChannelId("12");
        lifestyleChannelTab.setTitle("Lifestyle");
        feedChannelTabs.add(lifestyleChannelTab);

        RozFeed.openFeedActivity(this,feedChannelTabs);

        finish();

    }
}
