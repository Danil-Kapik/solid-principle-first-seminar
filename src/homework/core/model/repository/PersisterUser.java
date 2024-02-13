package homework.core.model.repository;

import homework.core.model.User;

public class PersisterUser implements Persister {
    private User user;

    public PersisterUser(User user){
        this.user = user;
    }

    @Override
    public void save(){
        System.out.println("Save user: " + user.getName());
    }

    @Override
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }

    @Override
    public void setUser(User user) {
        this.user = user;
    }
}
