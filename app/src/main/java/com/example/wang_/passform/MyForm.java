package com.example.wang_.passform;

import android.os.Parcel;
import android.os.Parcelable;

public class MyForm implements Parcelable{


    int id;
    int age;
    String name;

    public MyForm(int id, int age, String name){
        this.id = id;
        this.age = age;
        this.name = name;

    }


    protected MyForm(Parcel in) {
        id = in.readInt();
        age = in.readInt();
        name = in.readString();
    }

    public static final Creator<MyForm> CREATOR = new Creator<MyForm>() {
        @Override
        public MyForm createFromParcel(Parcel in) {
            return new MyForm(in);
        }

        @Override
        public MyForm[] newArray(int size) {
            return new MyForm[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeInt(age);
        dest.writeString(name);
    }
}
