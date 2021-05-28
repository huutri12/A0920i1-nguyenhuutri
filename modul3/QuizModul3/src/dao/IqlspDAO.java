package dao;

import model.qlsp;

import java.sql.SQLException;
import java.util.List;

public interface IqlspDAO {
    public void insertUser(qlsp qlsp) throws SQLException;
    public qlsp selectUser(int id);
    public static List<qlsp> selectAllqlsp();
}
