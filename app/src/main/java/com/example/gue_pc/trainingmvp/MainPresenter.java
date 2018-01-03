package com.example.gue_pc.trainingmvp;

/**
 * Created by Gue-PC on 1/3/2018.
 */

public class MainPresenter {
    private MainView mainView;
    private MainModel model;

    public MainPresenter(MainView view){
        this.mainView = view;
    }

    public void hitungluas(int panjang, int lebar){
        int luas = luaspersegi(panjang,lebar);
        model = new MainModel(luas);
        mainView.tampilhasil(model);
    }

    private int luaspersegi(int panjang,int lebar){
        return  panjang * lebar ;
    }
}
