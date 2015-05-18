package br.com.acs.superslimsample.model;


public class AdapterRowHeader extends AdapterBaseRow {

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private User user;
    public int totalChild = 0;

    public AdapterRowHeader(User user, int sectionManager, int sectionFirstPosition, int id) {
        super(sectionManager, sectionFirstPosition, id);
        this.user = user;
    }

    public void increment(){
        this.totalChild = totalChild + 1;
    }

    public int getTotalChild() {
        return totalChild;
    }
}
