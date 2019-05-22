package za.ac.cput.projects.Assignment6.repository;

public interface IRepository<T, ID> {
    T create (T t);
    T update (T t);
    void delete(ID id);
    T read(ID id);
}
