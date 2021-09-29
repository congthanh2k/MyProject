/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package htqlytourdulich;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Thanh
 */
public class AccountModify {

    public static List<Account> find(String Hovaten) {
        List<Account> aclist = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "select * from Account where Hovaten like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + Hovaten + "%");

            ResultSet resulSet = statement.executeQuery();

            while (resulSet.next()) {
                Account acc = new Account(resulSet.getInt("IDAccount"),
                        resulSet.getString("Username"),
                        resulSet.getString("Password"),
                        resulSet.getString("Hovaten"),
                        resulSet.getString("Sdt"),
                        resulSet.getString("Email"));

                aclist.add(acc);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        //end
        return aclist;
    }

    public static List<Account> findAll() {
        List<Account> aclist = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "select * from Account";
            statement = connection.createStatement();

            ResultSet resulSet = statement.executeQuery(sql);

            while (resulSet.next()) {
                Account acc = new Account(resulSet.getInt("IDAccount"),
                        resulSet.getString("Username"),
                        resulSet.getString("Password"),
                        resulSet.getString("Hovaten"),
                        resulSet.getString("Sdt"),
                        resulSet.getString("Email"));

                aclist.add(acc);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        //end
        return aclist;
    }

    public static void insert(Account acc) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "insert into Account(Username, Password, Hovaten, Sdt, Email) values(?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, acc.getUsername());
            statement.setString(2, acc.getPassword());
            statement.setString(3, acc.getHovaten());
            statement.setString(4, acc.getSdt());
            statement.setString(5, acc.getEmail());

            statement.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        //end
    }

    public static void update(Account acc) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "update Account set Username=?, Password=?, Hovaten=?, Sdt=?, Email=? where IDAccount = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, acc.getUsername());
            statement.setString(2, acc.getPassword());
            statement.setString(3, acc.getHovaten());
            statement.setString(4, acc.getSdt());
            statement.setString(5, acc.getEmail());
            statement.setInt(6, acc.getIDAccount());

            statement.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        //end
    }

    public static void delete(int IDAccount) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "delete from Account where IDAccount = ?";
            statement = connection.prepareCall(sql);

            statement.setInt(1, IDAccount);

            statement.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(AccountModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //end
    }
}
