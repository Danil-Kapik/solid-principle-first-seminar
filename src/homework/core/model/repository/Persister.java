package homework.core.model.repository;

import homework.core.model.User;

public interface Persister {
    public void save();
    public void report();

    void setUser(User user);
}
