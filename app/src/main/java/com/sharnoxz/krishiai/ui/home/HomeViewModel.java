package com.sharnoxz.krishiai.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.sharnoxz.krishiai.R;
import com.sharnoxz.krishiai.data.HData;
import com.sharnoxz.krishiai.data.VData;

import java.util.ArrayList;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<ArrayList<VData>> data;

    public HomeViewModel() {
        data = new MutableLiveData<>();
        DataSources DataSources = new DataSources();
        data.setValue(DataSources.loadVData());
    }

    public LiveData<ArrayList<VData>> getData() {
        return data;
    }


}

class DataSources{
    public ArrayList<VData> loadVData(){
        ArrayList<VData> data = new ArrayList<VData>();
        VData
                vData = new VData(loadHData1(),"Details","KhrisAI is an application for plant diseases detection AI/Ml model which helps in Agriculture. This application will take plants image and apply ml model and get back results such as type of diseases, prevention, accuracy, etc.. ",R.drawable.applogo,"Dankuni 18",true);
                data.add(vData);
                vData = new VData(loadHData2(),"News","hghhg",R.drawable.applogo,"Dankuni 18",false);
                data.add(vData);

        return data;
    }

    private ArrayList<HData> loadHData1() {
        ArrayList<HData> data = new ArrayList<HData>();
        HData
                hData = new HData(R.drawable.e,"App Details");
                data.add(hData);
                hData = new HData(R.drawable.a,"Best Agro Fertilizers");
                data.add(hData);
                hData = new HData(R.drawable.b,"Best Insecticides");
                data.add(hData);
                hData = new HData(R.drawable.c,"Supply Chain Management");
                data.add(hData);
                hData = new HData(R.drawable.d,"Latest News");
                data.add(hData);
        return data;
    }

    private ArrayList<HData> loadHData2() {
        ArrayList<HData> data = new ArrayList<HData>();
        HData
                hData = new HData(R.drawable.aa,"Sale Growth");
                data.add(hData);
                hData = new HData(R.drawable.bb,"Pollution");
                data.add(hData);
                hData = new HData(R.drawable.cc,"Farming");
                data.add(hData);
                hData = new HData(R.drawable.dd,"24/7 online");
                data.add(hData);
                hData = new HData(R.drawable.ee,"Collaboration");
                data.add(hData);
                hData = new HData(R.drawable.ff,"Shopping");
                data.add(hData);
        return data;
    }
}