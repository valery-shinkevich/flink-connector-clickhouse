package org.apache.flink.connector.clickhouse.internal.connection;

import com.clickhouse.jdbc.ClickHousePreparedStatement;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

/** Wrapper class for ClickHousePreparedStatement. */
public class ClickHouseStatementWrapper {
    public final ClickHousePreparedStatement statement;
    public final Connection connection;

    public ClickHouseStatementWrapper(
            Connection connection, ClickHousePreparedStatement statement) {
        this.statement = statement;
        this.connection = connection;
    }

    public void addBatch() throws SQLException {
        statement.addBatch();
    }

    public int[] executeBatch() throws SQLException {
        return statement.executeBatch();
    }

    public void close() throws SQLException {
        statement.close();
    }

    public void setBoolean(int parameterIndex, boolean x) throws SQLException {
        statement.setBoolean(parameterIndex, x);
    }

    public void setByte(int parameterIndex, byte x) throws SQLException {
        statement.setByte(parameterIndex, x);
    }

    public void setShort(int parameterIndex, short x) throws SQLException {
        statement.setShort(parameterIndex, x);
    }

    public void setInt(int parameterIndex, int x) throws SQLException {
        statement.setInt(parameterIndex, x);
    }

    public void setLong(int parameterIndex, long x) throws SQLException {
        statement.setLong(parameterIndex, x);
    }

    public void setFloat(int parameterIndex, float x) throws SQLException {
        statement.setFloat(parameterIndex, x);
    }

    public void setDouble(int parameterIndex, double x) throws SQLException {
        statement.setDouble(parameterIndex, x);
    }

    public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
        statement.setBigDecimal(parameterIndex, x);
    }

    public void setString(int parameterIndex, String x) throws SQLException {
        statement.setString(parameterIndex, x);
    }

    public void setBytes(int parameterIndex, byte[] x) throws SQLException {
        statement.setBytes(parameterIndex, x);
    }

    public void setDate(int parameterIndex, Date x) throws SQLException {
        statement.setDate(parameterIndex, x);
    }

    public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
        statement.setTimestamp(parameterIndex, x);
    }

    public void setArray(int parameterIndex, Object[] array) throws SQLException {
        java.sql.Array sqlArray = connection.createArrayOf("VARCHAR", array);
        statement.setArray(parameterIndex, sqlArray);
    }

    public void setObject(int parameterIndex, Object x) throws SQLException {
        statement.setObject(parameterIndex, x);
    }

    public void clearParameters() throws SQLException {
        statement.clearParameters();
    }

    public ResultSet executeQuery() throws SQLException {
        return statement.executeQuery();
    }
}
