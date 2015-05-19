package br.com.acs.superslimsample.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.acs.superslimsample.R;
import br.com.acs.superslimsample.model.AdapterBaseRow;
import br.com.acs.superslimsample.model.AdapterRowHeader;
import br.com.acs.superslimsample.model.AdapterRowPicture;
import br.com.acs.superslimsample.model.Picture;
import br.com.acs.superslimsample.model.User;

public class Data {

    int headerCount = 0;
    int sectionFirstPosition = 0;
    int id = -1;

    public  List<AdapterBaseRow> getData(){

        List<AdapterBaseRow> adapterBaseRows = new ArrayList<>();

        //Update indexes
        updateHeaderIndex(0);

        //Header
        adapterBaseRows.add(new AdapterRowHeader(new User("Anderson Silva"), sectionFirstPosition, id));

        //items
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picturea_1), sectionFirstPosition, id, 0));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), sectionFirstPosition, id, 0));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_4), sectionFirstPosition, id, 0));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_5), sectionFirstPosition, id, 0));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_2), sectionFirstPosition, id, 0));

        //Update indexes
        updateHeaderIndex(5); //to identify a header

        //Header
        adapterBaseRows.add(new AdapterRowHeader(new User("Josh"), sectionFirstPosition, id));

        //items
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), sectionFirstPosition, id, 5));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_5), sectionFirstPosition, id, 5));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_4), sectionFirstPosition, id, 5));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_3), sectionFirstPosition, id, 5));
        adapterBaseRows.add(new AdapterRowPicture(new Picture(R.drawable.picture_2), sectionFirstPosition, id, 5));

        resetHeaderIndex();

        return adapterBaseRows;
    }

    private void updateHeaderIndex(int i) {
        //UPDATE HEADER
        sectionFirstPosition = i + headerCount;
        headerCount  += 1;
        id++;
    }

    private void resetHeaderIndex(){
        headerCount = 0;
        sectionFirstPosition = 0;
    }
}
