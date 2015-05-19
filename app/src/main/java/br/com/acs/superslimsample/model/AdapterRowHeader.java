package br.com.acs.superslimsample.model;


public class AdapterRowHeader extends AdapterBaseRow {

    private User user;
    public int totalChild = 0;

    public AdapterRowHeader(User user, int sectionFirstPosition, int id) {
        super( sectionFirstPosition, id);
        this.user = user;
    }

    public void increment(){
        this.totalChild = totalChild + 1;
    }

    public int getTotalChild() {
        return totalChild;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
