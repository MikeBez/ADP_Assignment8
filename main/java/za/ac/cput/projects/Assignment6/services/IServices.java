package za.ac.cput.projects.Assignment6.services;

public interface IServices<T, ID> {
    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);
}
