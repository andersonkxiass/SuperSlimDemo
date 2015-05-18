package br.com.acs.superslimsample.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.tonicartos.superslim.LayoutManager;
import com.tonicartos.superslim.LinearSLM;

import java.util.ArrayList;
import java.util.List;

import br.com.acs.superslimsample.R;
import br.com.acs.superslimsample.model.AdapterBaseRow;
import br.com.acs.superslimsample.model.AdapterRowHeader;
import br.com.acs.superslimsample.model.AdapterRowPicture;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.Optional;

public class TimelineAdapter extends RecyclerView.Adapter<TimelineAdapter.TimelineViewHolder> {

    private Context mContext;

    public class TimelineViewHolder extends RecyclerView.ViewHolder{

        @InjectView(R.id.txt_header)
        @Optional
        TextView header;

        @InjectView(R.id.image)
        @Optional
        ImageView image;

        public TimelineViewHolder(View itemView) {
            super(itemView);

            ButterKnife.inject(this, itemView);
        }
    }

    List<AdapterBaseRow> adapterBaseRows = new ArrayList<>();

    public TimelineAdapter(List<AdapterBaseRow> adapterBaseRows ){
        this.adapterBaseRows = adapterBaseRows;
    }

    private static final int VIEW_TYPE_HEADER = 0x01;
    private static final int VIEW_TYPE_CONTENT = 0x00;


    @Override
    public TimelineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View mRoot;

        mContext = parent.getContext();

        if (viewType == VIEW_TYPE_HEADER) {
            mRoot = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_insta_header, parent, false);
        } else {
            mRoot = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_insta_item, parent, false);
        }

        return new TimelineViewHolder(mRoot);
    }

    @Override
    public int getItemViewType(int position) {
        return adapterBaseRows.get(position) instanceof AdapterRowHeader ? VIEW_TYPE_HEADER : VIEW_TYPE_CONTENT;
    }

    @Override
    public void onBindViewHolder(TimelineViewHolder holder, int position) {

        AdapterBaseRow wrapper = adapterBaseRows.get(position);

        final View itemView = holder.itemView;

        final LayoutManager.LayoutParams params = (LayoutManager.LayoutParams) itemView.getLayoutParams();
        params.setSlm(LinearSLM.ID);

        if(wrapper instanceof AdapterRowHeader){

            AdapterRowHeader adapterRowHeader = (AdapterRowHeader) wrapper;

            holder.header.setText("" + adapterRowHeader.getUser().getName());

            params.headerEndMarginIsAuto = false;
            params.headerStartMarginIsAuto = false;

        } else {

            AdapterRowPicture adapterRowPicture = (AdapterRowPicture) wrapper;
            holder.image.setImageResource(adapterRowPicture.getImage().getPictureResource());
        }

        params.setFirstPosition(wrapper.sectionFirstPosition);
    }

    @Override
    public int getItemCount() {
        return adapterBaseRows.size();
    }
}