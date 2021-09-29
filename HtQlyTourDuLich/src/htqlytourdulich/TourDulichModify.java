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
public class TourDulichModify {

    public static List<TourDulich> find(String TenTour) {
        List<TourDulich> aclist = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "select * from TourDulich where TenTour like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + TenTour + "%");

            ResultSet resulSet = statement.executeQuery();

            while (resulSet.next()) {
                TourDulich acc = new TourDulich(resulSet.getString("Matour"),
                        resulSet.getString("TenTour"),
                        resulSet.getString("MoTa"),
                        resulSet.getInt("SoNgay"),
                        resulSet.getFloat("GiaDeXuat"),
                        resulSet.getString("Diadiem"),
                        resulSet.getInt("TrangThaiTour"),
                        resulSet.getString("Ghichu")
                );

                aclist.add(acc);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }

        //end
        return aclist;
    }

    public static List<TourDulich> findAll() {
        List<TourDulich> aclist = new ArrayList<>();

        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "select * from TourDulich";
            statement = connection.createStatement();

            ResultSet resulSet = statement.executeQuery(sql);

            while (resulSet.next()) {
                TourDulich acc = new TourDulich(resulSet.getString("Matour"),
                        resulSet.getString("TenTour"),
                        resulSet.getString("MoTa"),
                        resulSet.getInt("SoNgay"),
                        resulSet.getFloat("GiaDeXuat"),
                        resulSet.getString("Diadiem"),
                        resulSet.getInt("TrangThaiTour"),
                        resulSet.getString("Ghichu")
                );
                aclist.add(acc);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }

        //end
        return aclist;
    }

    public static void insert(TourDulich acc) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "insert into TourDulich(Matour, TenTour, MoTa, SoNgay, GiaDeXuat, Diadiem, TrangThaiTour, Ghichu) values(?, ?, ?, ?, ?, ?, ?, ?)";
            statement = connection.prepareCall(sql);

            statement.setString(1, acc.getMatour());
            statement.setString(2, acc.getTenTour());
            statement.setString(3, acc.getMoTa());
            statement.setInt(4, acc.getSoNgay());
            statement.setFloat(5, acc.getGiaDeXuat());
            statement.setString(6, acc.getDiadiem());
            statement.setInt(7, acc.getTrangThaiTour());
            statement.setString(8, acc.getGhichu());

            statement.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }

        //end
    }

    public static void update(TourDulich acc) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "update TourDulich set TenTour=?, MoTa=?, SoNgay=?, GiaDeXuat=?, Diadiem=?, TrangThaiTour=?, Ghichu=? where Matour = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, acc.getTenTour());
            statement.setString(2, acc.getMoTa());
            statement.setInt(3, acc.getSoNgay());
            statement.setFloat(4, acc.getGiaDeXuat());
            statement.setString(5, acc.getDiadiem());
            statement.setInt(6, acc.getTrangThaiTour());
            statement.setString(7, acc.getGhichu());
            statement.setString(8, acc.getMatour());

            statement.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }

        //end
    }

    public static void delete(String Matour) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=qltourdulich", "sa", "123456");

            String sql = "delete from TourDulich where Matour = ?";
            statement = connection.prepareCall(sql);

            statement.setString(1, Matour);

            statement.execute();

        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    System.out.println(ex);
                }
            }
        }
        //end
    }
}
