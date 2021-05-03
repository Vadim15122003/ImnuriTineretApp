package project.materiale.imnuritineret;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ListViewAdapter extends BaseAdapter {
    Context mContext;
    LayoutInflater inflater;
    List<Model> modellist;
    ArrayList<Model> arrayList;

    public ListViewAdapter(Context context, List<Model> modellist) {
        mContext = context;
        this.modellist = modellist;
        inflater=LayoutInflater.from(mContext);
        this.arrayList= new ArrayList<Model>();
        this.arrayList.addAll(modellist);
    }

    public class ViewHolder{
        TextView mTitleTV;
    }

    @Override
    public int getCount() {
        return modellist.size();
    }

    @Override
    public Object getItem(int i) {
        return modellist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        int txt_for_imn_list_and_rest_of_app=PrefConfig.load_saved_color7(mContext);
        ViewHolder holder;
        if (view==null){
            holder=new ViewHolder();
            view=inflater.inflate(R.layout.text_from_list,null);
            holder.mTitleTV=view.findViewById(R.id.text_list_items);
            holder.mTitleTV.setTextColor(txt_for_imn_list_and_rest_of_app);
            view.setTag(holder);
        }
        else {
            holder=(ViewHolder)view.getTag();
        }
        holder.mTitleTV.setText(modellist.get(position).getTitle());
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String[] listImns_for_redirect;
                listImns_for_redirect =mContext.getResources().getStringArray(R.array.imn_name);
                for (int i = 0; i < listImns_for_redirect.length; i++) {
                    if (modellist.get(position).getTitle().equals(listImns_for_redirect[i])){
                        Intent intent =new Intent(mContext,Imn.class);
                        intent.putExtra("imn_number", i+1);
                        mContext.startActivity(intent);
                    }
                }
            }
        });

        return view;
    }

    public void filter(String charText){
        charText=charText.toLowerCase(Locale.getDefault());
        String listsearch;
        String listsearch_cratima_null;
        String listsearch_cratima_exist;
        String rusa;
        modellist.clear();
        if (charText.length()==0){
            modellist.addAll(arrayList);
        }
        else{
            for (Model model:arrayList){
                listsearch=model.getTitle().toLowerCase(Locale.getDefault()).replaceAll("ț","t").replaceAll("ș","s")
                        .replaceAll("ă","a").replaceAll("â","a")
                        .replaceAll("î","i").replaceAll(","," ")
                        .replace("."," ").replaceAll("-"," ")
                        .replaceAll(" {2}"," ");
                listsearch_cratima_null=model.getTitle().toLowerCase(Locale.getDefault()).replaceAll("ț","t").replaceAll("ș","s")
                        .replaceAll("ă","a").replaceAll("â","a")
                        .replaceAll("î","i").replaceAll(","," ")
                        .replace("."," ").replaceAll("-","")
                        .replaceAll(" {2}"," ");
                listsearch_cratima_exist=model.getTitle().toLowerCase(Locale.getDefault()).replaceAll("ț","t").replaceAll("ș","s")
                        .replaceAll("ă","a").replaceAll("â","a")
                        .replaceAll("î","i").replaceAll(","," ")
                        .replace("."," ").replaceAll(" {2}"," ");
                rusa=model.getTitle().toLowerCase(Locale.getDefault()).replaceAll("7. мой в небе кдрай родной","7 moi v nebe crai rodnoi");
                if (model.getTitle().toLowerCase(Locale.getDefault()).contains(charText)||listsearch.contains(charText)
                ||listsearch_cratima_null.contains(charText)||listsearch_cratima_exist.contains(charText)||rusa.contains(charText))
                        {
                    modellist.add(model);
                }

            }
        }
        notifyDataSetChanged();
    }
}
