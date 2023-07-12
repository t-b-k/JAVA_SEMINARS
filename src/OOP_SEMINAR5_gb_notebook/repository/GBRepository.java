package OOP_SEMINAR5_gb_notebook.repository;

import java.util.List;
import java.util.Optional;

/**
 * Ðåïîçèòîðèé, äëÿ âûïîëíåíèÿ CreateReadUpdateDelete (CRUD) îïåðàöèé
 * @param <E> òèï ìîäåëè äàííûõ
 * @param <I> òèï ID ìîäåëè äàííûõ E
 */
public interface GBRepository<E, I> {
    List<E> findAll();
    E create(E e);
    Optional<E> findById(I id);
    Optional<E> update(I id, E e);
    boolean delete(I id);
}
