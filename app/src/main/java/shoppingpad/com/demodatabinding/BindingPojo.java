package shoppingpad.com.demodatabinding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;


/**
 * Created by bridgelabz4 on 15/3/16.
 */
public class BindingPojo extends BaseObservable {
    public String firstName;
    public String lastName;
    public int    image;

    public BindingPojo(String firstName,String lastName,int images){
        this.firstName=firstName;
        this.lastName=lastName;
        this.image=image;

    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(shoppingpad.com.demodatabinding.BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(shoppingpad.com.demodatabinding.BR.lastName);
    }

//    @Bindable
//    public int getImage() {
//        return image;
//    }
//
//    public void setImage(int image) {
//        this.image = image;
//        notifyPropertyChanged(BR.image);
//    }


}
