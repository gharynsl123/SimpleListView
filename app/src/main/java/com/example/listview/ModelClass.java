package com.example.listview;

public class ModelClass {
    private String idList;
    private String txtList;
    private String txtSubList;
    private int imgList;

    //init
    public ModelClass(String idList, String txtList, String txtSubList, int imgList){
        this.idList=idList;
        this.txtList=txtList;
        this.txtSubList=txtSubList;
        this.imgList=imgList;
    }

    //Set Id
    public String getIdList(){
        return idList;
    }
    public void setIdList(String idList){
        this.idList = idList;
    }

    //Set txt
    public String getTxtList() {
        return txtList;
    }
    public void setTxtList(String txtList) {
        this.txtList = txtList;
    }

    //Set txtSub
    public String getTxtSubList() {
        return txtSubList;
    }
    public void setTxtSubList(String txtSubList) {
        this.txtSubList = txtSubList;
    }

    //Set IMG LIST
    public int getImgList() {
        return imgList;
    }
    public void setIvGoogle(int imgList) {
        this.imgList = imgList;
    }
}
