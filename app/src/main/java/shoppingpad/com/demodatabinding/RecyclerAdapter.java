package shoppingpad.com.demodatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import shoppingpad.com.demodatabinding.databinding.CustomRowBinding;


/**
 * Created by bridgelabz4 on 15/3/16.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.BindHolder> {

    private List<BindingPojo> mListofData;

    public  RecyclerAdapter(List<BindingPojo> bindingPojoList)
    {
        this.mListofData=bindingPojoList;

    }
    @Override
    public BindHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.custom_row, parent, false);
        BindHolder holder = new BindHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindHolder holder, int position) {
        final BindingPojo bindingHolder=mListofData.get(position);
        holder.getBind().setVariable(shoppingpad.com.demodatabinding.BR.list,bindingHolder);
        holder.getBind().executePendingBindings();

    }

    @Override
    public int getItemCount() {
        return mListofData.size();
    }


    public static class BindHolder extends RecyclerView.ViewHolder
    {
        CustomRowBinding binding;

        public BindHolder(View rowView)
        {
            super(rowView);
            binding= DataBindingUtil.bind(rowView);
        }
        public CustomRowBinding getBind(){
            return binding;
        }
        public void BindData(BindingPojo bindingPojo){
            binding.setList(bindingPojo);
            binding.executePendingBindings();
        }
    }
}
