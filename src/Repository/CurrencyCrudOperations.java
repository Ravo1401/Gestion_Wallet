package Repository;

import Configuration.ConnectionConfig;
import Models.Currency;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class CurrencyCrudOperations implements CrudOperations<Currency>{

    private static Connection connection ;


    public static void getConnection(){
        ConnectionConfig connex = new ConnectionConfig() ;
        connection = connex.createConnection() ;
    }


    @Override
    public List<Currency> findAll() {
        return null;
    }

    @Override
    public List<Currency> saveAll(List<Currency> toSave) {
        return null;
    }

    @Override
    public Currency save(Currency toSave) {
        return null;
    }

    private Currency extractCurrencyFromResultSet(ResultSet resultSet) throws SQLException{
        int id = resultSet.getInt("id") ;
        String currencyCode  = resultSet.getString("currencyCode");
        String currencyName  = resultSet.getString("currencyName");
        return new Currency(id , currencyCode , currencyName) ;
    }
}
