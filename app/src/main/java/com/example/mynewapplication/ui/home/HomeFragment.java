package com.example.mynewapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.mynewapplication.R;
import com.example.mynewapplication.bean.YiQingInfo;
import com.example.mynewapplication.task.YiQingTask;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private YiQingInfo yiQingInfo;

    private TextView gntotal, deathtotal, sustotal,
            curetotal, econNum, jwsrNum, addcon, adddeath,
            addcure, addsus, addjwsr, times, addcon2;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {

            }
        });

        gntotal = root.findViewById(R.id.gntotal);
        deathtotal = root.findViewById(R.id.deathtotal);
        sustotal = root.findViewById(R.id.sustotal);
        curetotal = root.findViewById(R.id.curetotal);
        econNum = root.findViewById(R.id.econNum);
        jwsrNum = root.findViewById(R.id.jwsrNum);
        addcon = root.findViewById(R.id.addcon);
        addcon2 = root.findViewById(R.id.addcon2);
        adddeath = root.findViewById(R.id.adddeath);
        addcure = root.findViewById(R.id.addcure);
        addsus = root.findViewById(R.id.addsus);
        addjwsr = root.findViewById(R.id.addjwsr);
        times = root.findViewById(R.id.deadLine);

        loadData();

        return root;
    }

    private void loadData() {

        String url = "https://interface.sina.cn/news/wap/fymap2020_data.d.json";
        new YiQingTask(new YiQingTask.CallBack() {
            @Override
            public void getResult(YiQingInfo result) {
                gntotal.setText(result.getGntotal());
                deathtotal.setText(result.getDeathtotal());
                sustotal.setText(result.getSustotal());
                curetotal.setText(result.getCuretotal());
                econNum.setText(result.getEconNum());
                jwsrNum.setText(result.getJwsrNuml());
                addcon.setText(result.getAddcon());
                addcon2.setText(result.getAddcon());
                adddeath.setText(result.getAdddeath());
                addcure.setText(result.getAddcure());
                addsus.setText(result.getAddsus());
                addjwsr.setText(result.getAddjwsr());
                times.setText(result.getTimes());
                addcon.setText(result.getAddcon());
            }
        }).execute(url);

    }
}


