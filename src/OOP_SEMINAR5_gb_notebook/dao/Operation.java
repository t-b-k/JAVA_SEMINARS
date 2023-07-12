package OOP_SEMINAR5_gb_notebook.dao;

import java.util.List;

/**
 * Data Access Object (DAO) ñëîé, ñ ìåòîäàìè äëÿ ðàáîòû ñ ÁÄ
 * @param <T> òèï îáúåêòà äëÿ ÷òåíèÿ/çàïèñè.
 */
public interface Operation<T> {
    List<T> readAll();
    void saveAll(List<T> data);
}
