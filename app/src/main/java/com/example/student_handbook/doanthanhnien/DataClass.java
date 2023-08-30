package com.example.student_handbook.doanthanhnien;

import android.os.Parcel;
import android.os.Parcelable;


public class DataClass implements Parcelable {
    private int dataImage;
    private String dataTitle;

    public DataClass(int dataImage, String dataTitle) {
        this.dataImage = dataImage;
        this.dataTitle = dataTitle;
    }

    protected DataClass(Parcel in) {
        dataImage = in.readInt();
        dataTitle = in.readString();
    }

    public static final Creator<DataClass> CREATOR = new Creator<DataClass>() {
        @Override
        public DataClass createFromParcel(Parcel in) {
            return new DataClass(in);
        }

        @Override
        public DataClass[] newArray(int size) {
            return new DataClass[size];
        }
    };



    public int getDataImage() {
        return dataImage;
    }

    public String getDataTitle() {
        return dataTitle;
    }


    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeInt(dataImage);
        parcel.writeString(dataTitle);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}